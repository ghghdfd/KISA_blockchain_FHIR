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

public class MedicalExpenseDetail_samsungTest {
	
	public static void main(String[] args) {
		MedicalExpenseDetail_samsung pop = new MedicalExpenseDetail_samsung();

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
		
		// 진료기간 
		StringType treatmentperiod = new StringType();
		treatmentperiod.fromStringValue("0000-00-00");
		pop.settreatmentperiod(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/treatmentperiod", (IBaseDatatype) treatmentperiod));
		
		
		// 환자구분
		StringType Patienttype = new StringType();
		Patienttype.fromStringValue("국민건강보험");
		pop.setPatienttype(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Patient type", (IBaseDatatype) Patienttype));
		
		
		// 병실
		StringType Room = new StringType();
		Room.fromStringValue("302");
		pop.setRoom(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Room", (IBaseDatatype) Room));
		 
		// 비고
		StringType Remark = new StringType();
		Remark.fromStringValue("요양기관기호 : 11100958, 혈액종양내과분과, 2020-02-27-1-51062, 외래");
		pop.setRemark(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Remark", (IBaseDatatype) Remark));
		
		// 항목
		StringType item = new StringType();
		item.fromStringValue("진찰료");
		pop.setitem(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/item", (IBaseDatatype) item));
		
		// 일자
		StringType datetime = new StringType();
		datetime.fromStringValue("2020-02-27");
		pop.setdatetime(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/datetime", (IBaseDatatype) datetime));
		
		// 코드
		StringType code = new StringType();
		code.fromStringValue("AA257");
		pop.setcode(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/code", (IBaseDatatype) code));
		
		// 명칭
		StringType Name = new StringType();
		Name.fromStringValue("재진 진찰료 (주간,성인)");
		pop.setName(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name", (IBaseDatatype) Name));
		
		// 금액
		StringType Price = new StringType();
		Price.fromStringValue("15110");
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
		TotalPrice.fromStringValue("15110");
		pop.setTotalPrice(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/TotalPrice", (IBaseDatatype) TotalPrice));
		
		// 본인부담금
		StringType paidbypatient= new StringType();
		paidbypatient.fromStringValue("756");
		pop.setPaidbypatient(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbypatient", (IBaseDatatype) paidbypatient));
		
		// 공단부담금
		StringType paidbyplan= new StringType();
		paidbyplan.fromStringValue("14534");
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
