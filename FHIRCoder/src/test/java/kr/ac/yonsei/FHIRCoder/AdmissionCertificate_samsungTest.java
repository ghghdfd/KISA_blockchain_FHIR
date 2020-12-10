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

import ca.uhn.fhir.context.FhirContext;

public class AdmissionCertificate_samsungTest {
	public static void main(String[] args) {
		AdmissionCertificate_samsung pop = new AdmissionCertificate_samsung();
		pop.setId("2020-00000");
		
		Patient pt = new Patient();
		/*pt.setId("54321");*/
		
		/*Identifier id = new Identifier();
		id.setValue("000-12-3456");
		pt.addIdentifier(id);*/
	
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("Hwang");
		ptname.add(fname);
		pt.setName(ptname);
		
		pt.setGender(Enumerations.AdministrativeGender.MALE);
		
		Calendar cal = Calendar.getInstance();
		cal.set(1995, Calendar.JULY , 13);
		Date dat = new Date(cal.getTimeInMillis());
		pt.setBirthDate(dat);
		
		pop.setSubject(new Reference(pt));
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 입원사실증명서(삼성서울); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Samsung Hospital");
		org.setId("00000");
		enc.setServiceProviderTarget(org);
		enc.setId("00000");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020, Calendar.FEBRUARY , 10);
		Date dat2 = new Date(cal2.getTimeInMillis());
		pop.setDate(dat2);

		StringType Department = new StringType();
		Department.fromStringValue("혈액종양내과분과");
		pop.setDepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department", (IBaseDatatype) Department));		
		
		StringType Diagnosis = new StringType();
		Diagnosis.fromStringValue("상세불명의 췌장 악성 신생물");
		pop.setDiagnosis(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of Diagnosis", (IBaseDatatype) Diagnosis));	
		
		StringType KCD = new StringType();
		KCD.fromStringValue("C25.9");
		pop.setKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/KCD", (IBaseDatatype) KCD));	
		
		StringType AdmissionPeriod = new StringType();
		AdmissionPeriod.fromStringValue("2020-02-09 ~ 2020-02-11");
		pop.setAdmissionPeriod(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Period of Admission", (IBaseDatatype) AdmissionPeriod));	
		
		StringType AdmissionDay = new StringType();
		AdmissionDay.fromStringValue("3 일간");
		pop.setAdmissionDay(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Days of Admission", (IBaseDatatype) AdmissionDay));	
		
		StringType State = new StringType();
		State.fromStringValue("입원하였음");
		pop.setState(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/State", (IBaseDatatype) State));	
		
		StringType Remark = new StringType();
		Remark.fromStringValue("비고");
		pop.setRemark(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Remark", (IBaseDatatype) Remark));	
		
		StringType Providername = new StringType();
		Providername.fromStringValue("홍길동");
		pop.setProvidername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of provider", (IBaseDatatype) Providername));
		
		StringType Certification = new StringType();
		Certification.fromStringValue("00000");
		pop.setCertification(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Number of certification", (IBaseDatatype) Certification));		
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
