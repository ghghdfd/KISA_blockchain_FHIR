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

public class Diagnosis_samsungTest {
	public static void main(String[] args) {
		Diagnosis_samsung pop = new Diagnosis_samsung();
		
		pop.setId("2017-0000");
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
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 진단서(삼성서울); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Samsung Hospital");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("54321");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.AUGUST , 28);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		
		StringType Certainty = new StringType();
		Certainty.fromStringValue("최종진단");
		pop.setCertainty(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Certainty of diagnosis", (IBaseDatatype) Certainty));
		
		StringType MainDiagnosis = new StringType();
		MainDiagnosis.fromStringValue("상세불명의 크론병");
		pop.setMainDiagnosis(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of MainDiagnosis", (IBaseDatatype) MainDiagnosis));
		
		StringType MainDiagnosisKCD = new StringType();
		MainDiagnosisKCD.fromStringValue("K50.99");
		pop.setMainDiagnosisKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of MainDiagnosis KCD code", (IBaseDatatype) MainDiagnosisKCD));
		
		
		StringType SubDiagnosis = new StringType();
		SubDiagnosis.fromStringValue("발작" );
		pop.setSubDiagnosis(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/SubDiagnosis", (IBaseDatatype) SubDiagnosis));
		
		StringType SubDiagnosisKCD = new StringType();
		SubDiagnosisKCD.fromStringValue("R56.8");
		pop.setSubDiagnosisKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Subdiagnosis KCD code", (IBaseDatatype) SubDiagnosisKCD));
		
		StringType onsetdate = new StringType();
		onsetdate.fromStringValue("2019-05-10");
		pop.setonsetdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of onset", (IBaseDatatype) onsetdate));
		
		StringType diagnosisdate = new StringType();
		diagnosisdate.fromStringValue("2019-05-12");
		pop.setdiagnosisdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of Diagnosis", (IBaseDatatype) diagnosisdate));
		
		
		StringType TreatmentContentAndNote = new StringType();
		TreatmentContentAndNote.fromStringValue("위 환자는 상기병명으로 치료 하였음");
		pop.setTreatmentContentAndNote(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/treatment content and note", (IBaseDatatype) TreatmentContentAndNote));
		
		StringType ProcedureAndDate = new StringType();
		ProcedureAndDate.fromStringValue("Laparoscopic right hemicoectomy 2017-07-26 "
				+ "Seton placement and debridment 2017-08-04");
		pop.setProcedureAndDate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of procedure and procedure date", (IBaseDatatype) ProcedureAndDate));
		
		StringType AdmissionAndDischarge = new StringType();
		AdmissionAndDischarge.fromStringValue("입퇴원내역");
		pop.setAdmissionAndDischarge(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Record of Admission and Discharge", (IBaseDatatype) AdmissionAndDischarge));	

		StringType Remark = new StringType();
		Remark.fromStringValue("비고");
		pop.setRemark(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content of remark", (IBaseDatatype) Remark));		
		
		StringType Perpose = new StringType();
		Perpose.fromStringValue("용도");
		pop.setPerpose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Perpose", (IBaseDatatype) Perpose));		
		
		StringType Content = new StringType();
		Content.fromStringValue("위와같이 진단합니다.");
		pop.setContent(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content of certifcate", (IBaseDatatype) Content));		
		
		StringType Providername = new StringType();
		Providername.fromStringValue("홍길동");
		pop.setProvidername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of provider", (IBaseDatatype) Providername));
		
		StringType Certification = new StringType();
		Certification.fromStringValue("12345");
		pop.setCertification(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Number of certification", (IBaseDatatype) Certification));		
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
