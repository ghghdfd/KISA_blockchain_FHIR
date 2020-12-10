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

public class Diagnosis_seoulTest {
	public static void main(String[] args) {
		Diagnosis_seoul pop = new Diagnosis_seoul();
		
		pop.setId("2020-0000");
		Patient pt = new Patient();		
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("Hwang");
		ptname.add(fname);
		pt.setName(ptname);
		
		pt.addTelecom().setSystem(org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem.PHONE).setValue("010-0000-0000");
		
		List<Identifier> num = new ArrayList<Identifier>();
		Identifier numm = new Identifier();
		numm.setValue("200922-*******");
		num.add(numm);
		pt.setIdentifier(num);
		pop.setSubject(new Reference(pt));
		
		List<Address> address = new ArrayList<Address>();
		Address adresss = new Address();
		
		adresss.setCity("*도 **시");
		adresss.setDistrict("**동");
		address.add(adresss);
		pt.setAddress(address);
		
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 진단서(서울대); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("서울대학교병원");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("54321");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal = Calendar.getInstance();
		cal.set(2019, Calendar.JUNE , 28);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		
		StringType Certainty = new StringType();
		Certainty.fromStringValue("최종진단");
		pop.setCertainty(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Certainty of diagnosis", (IBaseDatatype) Certainty));
		
		StringType MainDiagnosis = new StringType();
		MainDiagnosis.fromStringValue("상세불명의 크론병");
		pop.setMainDiagnosis(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/MainDiagnosis", (IBaseDatatype) MainDiagnosis));
		
		StringType MainDiagnosisKCD = new StringType();
		MainDiagnosisKCD.fromStringValue("K50.99");
		pop.setMainDiagnosisKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/MainDiagnosis KCD code", (IBaseDatatype) MainDiagnosisKCD));
		
		
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
		
		StringType AdmissionDate = new StringType();
		AdmissionDate.fromStringValue("2019-05-08");
		pop.setAdmissionDate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of Admission", (IBaseDatatype) AdmissionDate));	

		
		StringType DischargeDate = new StringType();
		DischargeDate.fromStringValue("2019-05-20");
		pop.setDischargeDate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of Discharge", (IBaseDatatype) DischargeDate));	

		
		
		StringType Remark = new StringType();
		Remark.fromStringValue("비고");
		pop.setRemark(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content of remark", (IBaseDatatype) Remark));		
		
		StringType Perpose = new StringType();
		Perpose.fromStringValue("용도");
		pop.setPerpose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Perpose of certifcate", (IBaseDatatype) Perpose));		
		
		StringType Content = new StringType();
		Content.fromStringValue("의료법 제 17 조 및 같은 법 시행규칙 제9조 1항에 따라 위와같이 진단합니다.");
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
