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

public class MedicalExpenseDetail_severanceTest {
	
	public static void main(String[] args) {
		MedicalExpenseDetail_severance pop = new MedicalExpenseDetail_severance();

		// 설명 
		Narrative n = new Narrative();
		n.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 진료비 상세내역서; Authored by Jaehoon Lee Date: 2020-07-24</div>");
		pop.setText(n);
		
		// 환자 등록번호
		Patient pt = new Patient();
		pt.setId("54321");  
		
		// 환자이름
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("Hwang");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("**");
		ptname.add(fname);  

		pt.setName(ptname);
		pop.setSubject(new Reference(pt));
		

		// 환자구분
		StringType Patienttype = new StringType();
		Patienttype.fromStringValue("건강보험");
		pop.setPatienttype(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Patient type", (IBaseDatatype) Patienttype));
		
		
		// 진료과
		StringType Department = new StringType();
		Department.fromStringValue("종양내과");
		pop.setDepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department", (IBaseDatatype) Department));
		
		// 진료기간 
		StringType treatmentperiod = new StringType();
		treatmentperiod.fromStringValue("2018-01-11");
		pop.settreatmentperiod(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/treatmentperiod", (IBaseDatatype) treatmentperiod));
		
		// 병실
		StringType Room = new StringType();
		Room.fromStringValue("302");
		pop.setRoom(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Room", (IBaseDatatype) Room));
		 
		// 발행일자
		StringType Issuedate = new StringType();
		Issuedate.fromStringValue("2020-06-04");
		pop.setIssuedate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Issuedate", (IBaseDatatype) Issuedate));
		
		// 발행자
		StringType Issuer = new StringType();
		Issuer.fromStringValue("테스트");
		pop.setIssuer(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Issuer", (IBaseDatatype) Issuer));
		 
		// 요양기관기호 
		StringType Medicalinstitution = new StringType();
		Medicalinstitution.fromStringValue("11100206");
		pop.setMedicalinstitution(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Medical institution number", (IBaseDatatype) Medicalinstitution));
		
		StringType Providername = new StringType();
		Providername.fromStringValue("홍길동");
		pop.setProvidername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of provider", (IBaseDatatype) Providername));
		
		StringType Certification = new StringType();
		Certification.fromStringValue("00000");
		pop.setCertification(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Number of certification", (IBaseDatatype) Certification));		
		
		// 비고
		StringType Remark = new StringType();
		Remark.fromStringValue("-");
		pop.setRemark(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Remark", (IBaseDatatype) Remark));
		
		// 항목
		StringType item = new StringType();
		item.fromStringValue("진찰료");
		pop.setitem(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/item", (IBaseDatatype) item));
		
		// 시행일자
		StringType Implementationdate = new StringType();
		Implementationdate.fromStringValue("2018-01-11");
		pop.setImplementationdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Implementationdate", (IBaseDatatype) Implementationdate));
		
		// 발행일자
		StringType Receivingdate = new StringType();
		Receivingdate.fromStringValue("2018-01-11");
		pop.setReceivingdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Receivingdate", (IBaseDatatype) Receivingdate));
		
		// 코드
		StringType code = new StringType();
		code.fromStringValue("AA257");
		pop.setcode(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/code", (IBaseDatatype) code));
		
		// 명칭
		StringType Name = new StringType();
		Name.fromStringValue("재진료(가1나(4))");
		pop.setName(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name", (IBaseDatatype) Name));
		
		// 금액
		StringType Price = new StringType();
		Price.fromStringValue("14580");
		pop.setPrice(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Price", (IBaseDatatype) Price));
		
		// 횟수
		StringType Count = new StringType();
		Count.fromStringValue("1");
		pop.setCount(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Count", (IBaseDatatype) Count));
		
		
		// 일수
		StringType Day = new StringType();
		Day.fromStringValue("1");
		pop.setDay(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Day", (IBaseDatatype) Day));
		
		// 총액
		StringType TotalPrice= new StringType();
		TotalPrice.fromStringValue("14580");
		pop.setTotalPrice(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/TotalPrice", (IBaseDatatype) TotalPrice));
		
		// 본인부담금
		StringType paidbypatient= new StringType();
		paidbypatient.fromStringValue("729");
		pop.setPaidbypatient(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbypatient", (IBaseDatatype) paidbypatient));
		
		// 공단부담금
		StringType paidbyplan= new StringType();
		paidbyplan.fromStringValue("13851");
		pop.setPaidbyplan(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbyplan", (IBaseDatatype) paidbyplan));
		
		// 전액본인부담
		StringType fullpaidbypatient= new StringType();
		fullpaidbypatient.fromStringValue("0");
		pop.setfullpaidbypatient(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/fullpaidbypatient", (IBaseDatatype) fullpaidbypatient));
		
		// 비급여
		StringType NonReimbursement= new StringType();
		NonReimbursement.fromStringValue("0");
		pop.setNonReimbursement(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/NonReimbursement", (IBaseDatatype) NonReimbursement));
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
