package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.instance.model.api.IBaseDatatype;

import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.StringType;

import ca.uhn.fhir.context.FhirContext;

public class MedicalExpenseDetail_seoulTest {
	
	public static void main(String[] args) {
		MedicalExpenseDetail_seoul pop = new MedicalExpenseDetail_seoul();

		// 설명 
		Narrative n = new Narrative();
		n.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 진료비 상세내역서; Authored by Jaehoon Lee Date: 2020-07-24</div>");
		pop.setText(n);
		
		// 문서확인번호
		pop.setId("H20P30661816120923");
		
		// 환자 등록번호
		Patient pt = new Patient();
		pt.setId("00000000");  
		
		// 환자이름
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("Sangho");
		ptname.add(fname);  

		pt.setName(ptname);
		pop.setSubject(new Reference(pt));
		
		// 처방일자
		StringType prescriptiondate = new StringType();
		prescriptiondate.fromStringValue("2018-01-11");
		pop.setprescriptiondate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/prescriptiondate", (IBaseDatatype) prescriptiondate));
		
		// 시행일자
		StringType Implementationdate = new StringType();
		Implementationdate.fromStringValue("2018-01-11");
		pop.setImplementationdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Implementationdate", (IBaseDatatype) Implementationdate));

		// 진료과
		StringType Department = new StringType();
		Department.fromStringValue("가정의학과");
		pop.setDepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department", (IBaseDatatype) Department));
		
		// 의사
		StringType Providername = new StringType();
		Providername.fromStringValue("의무실의사");
		pop.setProvidername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of provider", (IBaseDatatype) Providername));

		// 급종 
		StringType classcode = new StringType();
		classcode.fromStringValue("BB-000");
		pop.setclasscode(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/classcode", (IBaseDatatype) classcode));
		
		// 수가코드 
		StringType Medicalexpensescode = new StringType();
		Medicalexpensescode.fromStringValue("2005012401270");
		pop.setMedicalexpensescode(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Medicalexpensescode", (IBaseDatatype) Medicalexpensescode));
		
		// 사용량
		StringType usage = new StringType();
		usage.fromStringValue("1");
		pop.setusage(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/usage", (IBaseDatatype) usage));
		
		// 횟수
		StringType Count = new StringType();
		Count.fromStringValue("3");
		pop.setCount(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Count", (IBaseDatatype) Count));
		
		// 일수
		StringType Day = new StringType();
		Day.fromStringValue("7");
		pop.setDay(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Day", (IBaseDatatype) Day));
		
		// 단가
		StringType Unitprice = new StringType();
		Unitprice.fromStringValue("74");
		pop.setUnitprice(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Unitprice", (IBaseDatatype) Unitprice));

		// 단가
		StringType Designation = new StringType();
		Designation.fromStringValue("74");
		pop.setDesignation(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Designation", (IBaseDatatype) Designation));

		// 급여
		StringType paidbyplan= new StringType();
		paidbyplan.fromStringValue("0");
		pop.setPaidbyplan(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbyplan", (IBaseDatatype) paidbyplan));
		
		// 총액
		StringType TotalPrice= new StringType();
		TotalPrice.fromStringValue("0");
		pop.setTotalPrice(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/TotalPrice", (IBaseDatatype) TotalPrice));
		
		// 본인부담금
		StringType paidbypatient= new StringType();
		paidbypatient.fromStringValue("0");
		pop.setPaidbypatient(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbypatient", (IBaseDatatype) paidbypatient));
		
		// 선택진료
		StringType Optionalexpenses= new StringType();
		Optionalexpenses.fromStringValue("0");
		pop.setOptionalexpenses(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Optionalexpenses", (IBaseDatatype) Optionalexpenses));
		
		// 부가세
		StringType VAT = new StringType();
		VAT.fromStringValue("0");
		pop.setVAT(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/VAT", (IBaseDatatype) VAT));
		 
		
		// 수가명
		StringType Medicalexpensename = new StringType();
		Medicalexpensename.fromStringValue("코푸시럽");
		pop.setMedicalexpensename(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Medicalexpensename", (IBaseDatatype) Medicalexpensename));
		

		// EDI코드
		StringType code = new StringType();
		code.fromStringValue("642102282");
		pop.setcode(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/code", (IBaseDatatype) code));
		
	

		

		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
