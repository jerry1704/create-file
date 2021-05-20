package com.javatechie.report.db;

import static  java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.gerardo.domain.AccountRetrieveExcel;
import com.gerardo.domain.Contact;

public class RetrieveData {
	
  public static List<Contact> fillData() {
		
		return Stream.of(
		               new Contact("gerar","garcia","cocoyotes","26","Masculino"),
		               new Contact("lalo","suarez","alces","29","Masculino"))
		             .collect(
		               toList());
		
	}


  public static List<AccountRetrieveExcel>  fillDataExcelProveedor() {
    
    
    List<AccountRetrieveExcel> listAccount = Stream.of(new AccountRetrieveExcel(
                                                                  "ruedas a.c de c.v.",
                                                                  "rfac940401egd",
                                                                  "Nacional",
                                                                  "estandar",
                                                                  "CERTIFIED",
                                                                  "11/02/2021",
                                                                  "10/20/2021",
                                                                  "10/20/2022",
                                                                  "moral",
                                                                  "Mexico",
                                                                  "Mediano",
                                                                  "Financiero",
                                                                  "www.fish.com.mx",
                                                                  "ciudad de mexico",
                                                                  "mexico",
                                                                  "gustavo a madero",
                                                                  "cocoyotes",
                                                                  "cerrada cocoyotes,5,12",
                                                                  "ernesto",
                                                                  "perez",
                                                                  "agustin",
                                                                  "55232806",
                                                                  "ggarcia@linko.com.mx",
                                                                  150F,
                                                                  80F,
                                                                  60F,
                                                                  70F,
                                                                  80F,
                                                                  90F,
                                                                  90F,
                                                                  70F,
                                                                  60F,
                                                                  50F,
                                                                  50F,
                                                                  true,
                                                                  false,
                                                                  null,
                                                                  2,
                                                                  1),
                                         new AccountRetrieveExcel("puertas bonitas s.a de c.v",
                                                                  "zder765467et2",
                                                                  "Internacional",
                                                                  "avanzada",
                                                                  "activa",
                                                                  "11/02/2021",
                                                                  "10/20/2021",
                                                                  "10/20/2022",
                                                                  "fisico",
                                                                  "Mexico",
                                                                  "Mediano",
                                                                  "Financiero",
                                                                  "www.puertas.com.mx",
                                                                  "ciudad de mexico",
                                                                  "mexico",
                                                                  "gustavo a madero",
                                                                  "general",
                                                                  "cerrada cocoyotes,5,12",
                                                                  "eduarod",
                                                                  "garcia",
                                                                  "duarte",
                                                                  "5526879560",
                                                                  "peduardo@linko.com.mx",
                                                                  150F,
                                                                  80F,
                                                                  60F,
                                                                  70F,
                                                                  80F,
                                                                  90F,
                                                                  90F,
                                                                  70F,
                                                                  60F,
                                                                  50F,
                                                                  50F,
                                                                  false,
                                                                  true,
                                                                  null,
                                                                  0,
                                                                  0))
                                      .collect(
                                        toList());
    return listAccount;

   }
  
  
  public static Detalle guardarElementos() {
    
    Detalle detalle = new Detalle();
    
    detalle
      .setAccountOne(
        fillDataExcelProveedor().get(0));
    
    if (fillDataExcelProveedor().size() == 2) {
      
      detalle
        .setAccountTwo(
          fillDataExcelProveedor().get(1));
    }
    
    
    if (fillDataExcelProveedor().size() == 3) {
    
      detalle
        .setAccountTwo(
          fillDataExcelProveedor().get(1));
    
      detalle
        .setAccountThree(
          fillDataExcelProveedor().get(2));
    
    }
 
    return detalle;
    
  }


}