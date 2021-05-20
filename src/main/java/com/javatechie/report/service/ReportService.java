package com.javatechie.report.service;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.javatechie.report.db.Detalle;

import static com.javatechie.report.db.RetrieveData.fillData;
import static com.javatechie.report.db.RetrieveData.fillDataExcelProveedor;
import static com.javatechie.report.db.RetrieveData.guardarElementos;
import static com.javatechie.report.util.AccountMapper.configurationReportXls;
import static com.javatechie.report.util.AccountMapper.exportXls;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

@Service
public class ReportService {
	
	public static String path = "/home/gerardo/Documents";
	
	public static boolean isEnable = true;
	
	public static String PDF = "pdf";
	
	public static String menu(String format) throws JRException, IOException {
	  
	  switch(format) {
	  
	  case "excel": 
	  
	  //String opcion = "cuentas";
	  String opcion = "listadoPlantillaSub";
	   //String opcion = "comparacion";
	    exportExcel(opcion);
	 
	  break;
	  
	  case "pdf":
	  
	    exportReport(format);
	  
	  break;
	  
	  }
	  
	  
    return format;
	  
	}
	
	/*
	 * 
	 */
	public static String exportReport(String reportFormat) throws FileNotFoundException, JRException {
	  	  
		JasperReport jasperReport = JasperCompileManager
		                              .compileReport(
		                                ResourceUtils
		                                  .getFile(
		                                    "classpath:account.jrxml")
		                                  .getAbsolutePath());
		
		Map<String, Object> parametros = new HashMap<String, Object> ();
		
		parametros.put("datasource1",fillData());

		JasperPrint jasperPrint = JasperFillManager
		                            .fillReport(
		                              jasperReport, 
		                              parametros, 
		                              new JREmptyDataSource());

		if (reportFormat.equalsIgnoreCase("html")) {
		
			JasperExportManager
			  .exportReportToHtmlFile(
			    jasperPrint,
			    path + "/account.html");
		}
		
		if (reportFormat.equalsIgnoreCase("pdf")) {
		
			JasperExportManager
			  .exportReportToPdfFile(
			    jasperPrint, 
			    path + "/account.pdf");
		}

		return "report generated in path : " + path;
		
	}

	public static void exportExcel(String opcion) throws JRException, IOException {

	  
	  switch (opcion) {
	  
	  case "cuentas" : 

    
    // compila la plantilla
    JasperReport jasperReport = JasperCompileManager
                                  .compileReport(
                                     ResourceUtils
                                       .getFile(
                                         "classpath:account.jrxml")
                                       .getAbsolutePath());

    Map<String, Object> parametros = new HashMap<String, Object> ();
    
    parametros.put("datasource1",fillData());
    
    // llena el fillreport
    //JRBeanCollectionDataSource(fillData())
    JasperPrint jasperPrint = JasperFillManager
                                .fillReport(
                                  jasperReport, 
                                  parametros, 
                                  new JREmptyDataSource());
    
    try (ByteArrayOutputStream excelStream = new ByteArrayOutputStream();
         OutputStream fos = new FileOutputStream(path+"/account.xls")) {
            
      JRXlsExporter xlsExporter = new JRXlsExporter();

      xlsExporter.setConfiguration(configurationReportXls());
      xlsExporter.setExporterInput(new SimpleExporterInput(jasperPrint));
      xlsExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(excelStream));
      xlsExporter.exportReport();
      
      excelStream.writeTo(fos);
      
    }
   
	  break;
	  
	  case "listadoPlantilla" : 
	
	  Detalle detalle = new Detalle();
	  
    // compila la plantilla
    JasperReport jasperReport1 = JasperCompileManager
                                  .compileReport(
                                    ResourceUtils
                                      .getFile(
                                        "classpath:ListaProEsp.jrxml")
                                      .getAbsolutePath());
        
    Map<String, Object> parametros1 = new HashMap<String, Object> ();
    
    parametros1.put("datasource1", fillDataExcelProveedor());
    //parametros1.put("subReport", subreport);
    
    detalle.setAccountList(fillDataExcelProveedor());
    
    try (ByteArrayOutputStream excelStream = new ByteArrayOutputStream();
         OutputStream fos = new FileOutputStream(path+"/Listado_Proveedores.xls")) {     
      /*
       exportCsv(
          jasperReport1,
          parametros1,
          excelStream,
          detalle);
      */
    
    exportXls(
        jasperReport1,
        parametros1,
        excelStream);
    
      excelStream.writeTo(fos);
     
      }
    
    case "listadoPlantillaSub" : 
        
    // compila la plantilla
    JasperReport jasperReport2 = JasperCompileManager
                                  .compileReport(
                                    ResourceUtils
                                      .getFile(
                                        "classpath:ListadoSub.jrxml")
                                      .getAbsolutePath());
    
    // compila el subreport
    JasperReport accountListSub = JasperCompileManager
                                  .compileReport(
                                    ResourceUtils
                                      .getFile(
                                        "classpath:subreporte.jrxml")
                                      .getAbsolutePath());
    
    Map<String, Object> parametros2 = new HashMap<String, Object> ();
    
    parametros2.put("accountListSub", accountListSub);
        
    try (ByteArrayOutputStream excelStream = new ByteArrayOutputStream();
         OutputStream fos = new FileOutputStream(path+"/Listado_Proveedores.xls")) {     
      /*
       exportCsv(
          jasperReport1,
          parametros1,
          excelStream,
          detalle);
      */
    
    exportXls(
        jasperReport2,
        parametros2,
        excelStream);
    
      excelStream.writeTo(fos);
     
      }
 
    
	  break;
	  
	  case "comparacion" :
	  
    // compila la plantilla
    JasperReport jasperReport3 = JasperCompileManager
                                  .compileReport(
                                    ResourceUtils
                                      .getFile(
                                        "classpath:comparadorEsp.jrxml")
                                      .getAbsolutePath());
                          
    Map<String, Object> parametros3 = new HashMap<String, Object> ();
    
    parametros3.put("detalle", guardarElementos());
    
    
    try (ByteArrayOutputStream excelStream = new ByteArrayOutputStream();
         OutputStream fos = new FileOutputStream(path+"/comparador.xls")) {     
      
      exportXls(
          jasperReport3,
          parametros3,
          excelStream);
      
      excelStream.writeTo(fos);
     
      }

	  break;
	  
	   }
	  
	 }
  
}