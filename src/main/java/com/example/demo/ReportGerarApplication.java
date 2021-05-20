package com.example.demo;

import static com.javatechie.report.db.RetrieveData.fillData;
import static com.javatechie.report.db.RetrieveData.fillDataExcelProveedor;
import static com.javatechie.report.service.ReportService.menu;


import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gerardo.domain.AccountRetrieveExcel;
import com.gerardo.domain.Contact;

import net.sf.jasperreports.engine.JRException;

@SpringBootApplication
@RestController
public class ReportGerarApplication {
	
    @GetMapping("/getCuentas")
    public List<Contact> getEmployees() {

        return fillData();
    }
    
    @GetMapping("/getProvee")
    public List<AccountRetrieveExcel> getProveedores() {

        return fillDataExcelProveedor();
    }

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws JRException, IOException {
    	
    	return menu(format);
    	
    }


	public static void main(String[] args) {
		SpringApplication.run(ReportGerarApplication.class, args);
	}

}
