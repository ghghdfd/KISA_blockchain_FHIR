package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.codesystems.ContactPointSystem;
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Address;
import ca.uhn.fhir.context.FhirContext;

public class Diagnosis_severanceTest {
	public static void main(String[] args) {
		Diagnosis_severance pop = new Diagnosis_severance();
		
		pop.setId("2020-10-A4");
		Patient pt = new Patient();		
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("Hwang");
		ptname.add(fname);
		pt.setName(ptname);
		
		pt.addTelecom().setSystem(org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem.PHONE).setValue("010-9491-9372");
		
		List<Identifier> num = new ArrayList<Identifier>();
		Identifier numm = new Identifier();
		numm.setValue("950713-*******");
		num.add(numm);
		pt.setIdentifier(num);
		pop.setSubject(new Reference(pt));
		
		List<Address> address = new ArrayList<Address>();
		Address adresss = new Address();
		adresss.setCountry("**도");
		adresss.setCity("**시");
		adresss.setDistrict("**동");
		address.add(adresss);
		pt.setAddress(address);
		
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 진단서(세브란스); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Yonsei Hospital");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("54321");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal = Calendar.getInstance();
		cal.set(2019, Calendar.JUNE , 10);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		
		StringType Certainty = new StringType();
		Certainty.fromStringValue("최종진단");
		pop.setCertainty(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Certainty of diagnosis", (IBaseDatatype) Certainty));
		
		StringType onsetdate = new StringType();
		onsetdate.fromStringValue("2019-05-10");
		pop.setonsetdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of onset", (IBaseDatatype) onsetdate));
		
		StringType diagnosisdate = new StringType();
		diagnosisdate.fromStringValue("2019-05-12");
		pop.setdiagnosisdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of diagnosis", (IBaseDatatype) diagnosisdate));
		
		
		StringType Diagnosis = new StringType();
		Diagnosis.fromStringValue("(주)뇌전증 (부)발작 (부)급성 췌장염" );
		pop.setDiagnosis(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Diagnosis", (IBaseDatatype) Diagnosis));
		
		StringType KCD = new StringType();
		KCD.fromStringValue("G40.90 R56.8 K85.9");
		pop.setKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/KCD", (IBaseDatatype) KCD));
		
		StringType treatmentcontentandnote = new StringType();
		treatmentcontentandnote.fromStringValue("위 환자는 상기병명으로 2019년 05월 21일부터 입원치료 하였음");
		pop.settreatmentcontentandnote(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/treatment content and note", (IBaseDatatype) treatmentcontentandnote));
		
		StringType admissiondate = new StringType();
		admissiondate.fromStringValue("2019-05-21");
		pop.setadmissiondate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of admission", (IBaseDatatype) admissiondate));
		
		StringType dischargedate = new StringType();
		dischargedate.fromStringValue(" ");
		pop.setdischargedate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of discharge", (IBaseDatatype) dischargedate));	

		StringType Department = new StringType();
		Department.fromStringValue("소아신경과");
		pop.setDepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department of provider", (IBaseDatatype) Department));		
		
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
