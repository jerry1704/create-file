package com.javatechie.report.util;

import static net.sf.jasperreports.engine.JasperFillManager.fillReport;
import static com.javatechie.report.db.RetrieveData.fillDataExcelProveedor;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;

import com.javatechie.report.db.Detalle;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.export.SimpleCsvExporterConfiguration;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleWriterExporterOutput;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;

public class AccountMapper {
  

  /*
  * 
  */
 public static JRXlsExporter exportXls(JasperReport jasperReport,
                                       Map<String, Object> parametros,
                                       ByteArrayOutputStream excelStream) throws JRException  {
   
   Detalle deta = new Detalle();
   
   deta.setAccountList((fillDataExcelProveedor()));
   
   var xlsExporter = new JRXlsExporter();

   xlsExporter
     .setExporterInput(
       new SimpleExporterInput(
         fillReport(
           jasperReport, 
           parametros, 
           new JRBeanCollectionDataSource(
               List.of(
                 deta)))));
   xlsExporter
     .setExporterOutput(
       new SimpleOutputStreamExporterOutput(
         excelStream));
   xlsExporter
     .setConfiguration(
       configurationReportXls());
   xlsExporter
     .exportReport();
   
   return 
     xlsExporter;
  
 }
 
 /**
  * 
  * @param jasperReport
  * @param parametros
  * @param excelStream
  * @param detalle
  * @return
  * @throws JRException
  */
 public static JRCsvExporter exportCsv(JasperReport jasperReport,
                                            Map<String, Object> parametros,
                                            ByteArrayOutputStream excelStream,
                                            Detalle detalle) throws JRException {
   
   JRCsvExporter csvExporter = new JRCsvExporter();

   csvExporter.setExporterInput(new SimpleExporterInput(fillReport(
                                                          jasperReport, 
                                                          parametros, 
                                                          new JRBeanCollectionDataSource(
                                                              List.of(
                                                                detalle)))));

   final var configuration = new SimpleCsvExporterConfiguration();

      csvExporter
        .setConfiguration(configuration);
      csvExporter
        .setExporterOutput(
          new SimpleWriterExporterOutput(
              excelStream));
      csvExporter
        .exportReport();

   return csvExporter;
   

 }

 /**
  * 
  * @return
  */
 public static SimpleXlsReportConfiguration configurationReportXls() {
   
   SimpleXlsReportConfiguration xlsReportConfiguration = new SimpleXlsReportConfiguration();

   xlsReportConfiguration.setOnePagePerSheet(false);
   xlsReportConfiguration.setWhitePageBackground(false);
   xlsReportConfiguration.setRemoveEmptySpaceBetweenRows(true);
   xlsReportConfiguration.setRemoveEmptySpaceBetweenColumns(true);
   xlsReportConfiguration.setDetectCellType(false);
   xlsReportConfiguration.setFontSizeFixEnabled(false);
   
   return xlsReportConfiguration;
  
 }
 
}
