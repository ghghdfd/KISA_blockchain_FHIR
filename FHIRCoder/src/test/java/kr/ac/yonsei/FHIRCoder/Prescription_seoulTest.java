package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Address;
import ca.uhn.fhir.context.FhirContext;

public class Prescription_seoulTest {
	public static void main(String[] args) {
		Prescription_seoul pop = new Prescription_seoul();
		
		pop.setId("0000년 00월 00일 제 00000호");
		
		Patient pt = new Patient();	
		
		/*pt.setId("70374685");*/
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("Hwang");
		ptname.add(fname);
		pt.setName(ptname);

		List<Identifier> num = new ArrayList<Identifier>();
		Identifier numm = new Identifier();
		numm.setValue("950713-*******");
		num.add(numm);
		pt.setIdentifier(num);
		
		pop.setSubject(new Reference(pt));
		
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 처방전(서울대); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, Calendar.MARCH , 05);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
				
		StringType KCD = new StringType();
		KCD.fromStringValue("R05");
		pop.setKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/KCD", (IBaseDatatype) KCD));
		
		StringType Department = new StringType();
		Department.fromStringValue("가정의학과");
		pop.setDepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department", (IBaseDatatype) Department));
		
		StringType Providername = new StringType();
		Providername.fromStringValue("홍길동");
		pop.setProvidername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of Provider", (IBaseDatatype) Providername));
		
		StringType CertificationType = new StringType();
		CertificationType.fromStringValue("의사면허");
		pop.setCertificationType(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Type of Certification", (IBaseDatatype) CertificationType));
		
		StringType Certification = new StringType();
		Certification.fromStringValue("114023");
		pop.setCertification(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Number of Certification", (IBaseDatatype) Certification));
		
		StringType medicine = new StringType();
		medicine.fromStringValue("오구멘정 625mg");
		pop.setmedicine(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of medicine", (IBaseDatatype) medicine));		

		StringType Paidbypatientcode = new StringType();
		Paidbypatientcode.fromStringValue("급여");
		pop.setPaidbypatientcode(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Code of Paidbypatient", (IBaseDatatype) Paidbypatientcode));		

	
		StringType dose = new StringType();
		dose.fromStringValue("1 tap");
		pop.setdose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Amount of 1 dose", (IBaseDatatype) dose));		
		
		StringType dailydosecount = new StringType();
		dailydosecount.fromStringValue("3회");
		pop.setdailydosecount(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Count of daily dose", (IBaseDatatype) dailydosecount));
		
		StringType medicationday = new StringType();
		medicationday.fromStringValue("7일");
		pop.setmedicationday(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Day of medication", (IBaseDatatype) medicationday));		
		
		StringType totaldose = new StringType();
		totaldose.fromStringValue("21 tap");
		pop.settotaldose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Total amount of medication", (IBaseDatatype) totaldose));	
		
		StringType Remark = new StringType();
		Remark.fromStringValue("1일 3회 8시간마다 복용");
		pop.setRemark(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Remark of Prescription", (IBaseDatatype) Remark));	
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
