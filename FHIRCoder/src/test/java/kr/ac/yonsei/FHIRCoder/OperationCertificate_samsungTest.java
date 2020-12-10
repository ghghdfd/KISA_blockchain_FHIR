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

public class OperationCertificate_samsungTest {
	public static void main(String[] args) {
		OperationCertificate_samsung pop = new OperationCertificate_samsung();
		
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
		pt.addTelecom().setSystem(org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem.OTHER).setValue("031-393-9372");
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
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 수술확인서(삼성서울); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Samsung Hospital");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("54321");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal = Calendar.getInstance();
		cal.set(2020, Calendar.FEBRUARY , 11);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		
		StringType Certainty = new StringType();
		Certainty.fromStringValue("최종진단");
		pop.setCertainty(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Certainty of diagnosis", (IBaseDatatype) Certainty));
		
		StringType MainDiagnosis = new StringType();
		MainDiagnosis.fromStringValue("갑상선암,경부 림프정 전이");
		pop.setMainDiagnosis(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of MainDiagnosis", (IBaseDatatype) MainDiagnosis));
		
		StringType MainDiagnosisKCD = new StringType();
		MainDiagnosisKCD.fromStringValue("C74, C77.0");
		pop.setMainDiagnosisKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of MainDiagnosis KCD code", (IBaseDatatype) MainDiagnosisKCD));
		
		
		StringType SubDiagnosis = new StringType();
		SubDiagnosis.fromStringValue("부상병" );
		pop.setSubDiagnosis(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/SubDiagnosis", (IBaseDatatype) SubDiagnosis));
		
		StringType SubDiagnosisKCD = new StringType();
		SubDiagnosisKCD.fromStringValue("부상병 코드");
		pop.setSubDiagnosisKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Subdiagnosis KCD code", (IBaseDatatype) SubDiagnosisKCD));
		
		StringType onsetdate = new StringType();
		onsetdate.fromStringValue("2020-01-20");
		pop.setonsetdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of onset", (IBaseDatatype) onsetdate));
		
		StringType diagnosisdate = new StringType();
		diagnosisdate.fromStringValue("2020-01-30");
		pop.setdiagnosisdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/date of Diagnosis", (IBaseDatatype) diagnosisdate));
		
		
		StringType OperationHistory = new StringType();
		OperationHistory.fromStringValue("2020-01-22, 갑상선 일엽절제술 및 종양 림프절 절제술");
		pop.setOperationHistory(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/History of operation", (IBaseDatatype) OperationHistory));
		
		StringType Remark = new StringType();
		Remark.fromStringValue("비고");
		pop.setRemark(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content of remark", (IBaseDatatype) Remark));		
		
		StringType Perpose = new StringType();
		Perpose.fromStringValue("용도");
		pop.setPerpose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Perpose", (IBaseDatatype) Perpose));		
		
		StringType Content = new StringType();
		Content.fromStringValue("위와같이 수술을 시행하였음을 확인함.");
		pop.setContent(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content", (IBaseDatatype) Content));		
		
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
