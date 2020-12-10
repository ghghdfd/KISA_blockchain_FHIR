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
import org.hl7.fhir.r4.model.codesystems.ContactPointSystem;
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.ContactPoint;

import ca.uhn.fhir.context.FhirContext;

public class CertificationOfAdmission_seoulTest {
	public static void main(String[] args) {
		CertificationOfAdmission_seoul pop = new CertificationOfAdmission_seoul();
		// 연번호
		pop.setId("2020-0000");
		
		Patient pt = new Patient();		
		
		// 이름
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("Hwang");
		ptname.add(fname);
		pt.setName(ptname);
		
		//전화번호
		pt.addTelecom().setSystem(org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem.PHONE).setValue("010-9491-9372");
		
		//성별
		pt.setGender(Enumerations.AdministrativeGender.MALE);
		
		//주민번호
		List<Identifier> num = new ArrayList<Identifier>();
		Identifier numm = new Identifier();
		numm.setValue("200922-*******");
		num.add(numm);
		pt.setIdentifier(num);
		pop.setSubject(new Reference(pt));
		
		//주소
		List<Address> address = new ArrayList<Address>();
		Address adresss = new Address();
		adresss.setText("**도 **시 **로 ");
		pt.setAddress(address);
		
		//설명
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 입원사실증명서(서울대); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		// 의료기관 명칭
		Organization org = new Organization();
		org.setName("서울대학교병원");
		
		// 의료기관 주소
		List<Address> theAddress = new ArrayList<Address>();
		Address address2 = new Address();
		address2.setText("서울특별시 종로구 대학로 101");
		theAddress.add(address2);
		org.setAddress(theAddress );
		
		// 전화번호
		List<ContactPoint> theTelecom = new ArrayList<ContactPoint>();
		ContactPoint contact = new ContactPoint();
		contact.setValue("1588-5700");
		theTelecom.add(contact);
		org.setTelecom(theTelecom);
		
		// 환자 등록번호
		Encounter enc = new Encounter();
		enc.setServiceProviderTarget(org);
		enc.setId("5432");
		pop.setEncounter(new Reference(enc));
		
		//발행일
		pop.setDate(new Date());
		
		//진단의 확실성
		StringType Certainty = new StringType();
		Certainty.fromStringValue("임상적 추정");
		pop.setCertainty(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Certainty of diagnosis", (IBaseDatatype) Certainty));
		
		//병명
		StringType Diagnosis = new StringType();
		Diagnosis.fromStringValue("상세불명의 크론병");
		pop.setDiagnosis(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/ Diagnosis", (IBaseDatatype) Diagnosis));
		
		//국제질병분류기호
		StringType ICD = new StringType();
		ICD.fromStringValue("K50.99");
		pop.setICD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/ICD", (IBaseDatatype) ICD));

		//용도
		StringType Perpose = new StringType();
		Perpose.fromStringValue("용도");
		pop.setPerpose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Perpose of certifcate", (IBaseDatatype) Perpose));		
		
		//입원과
		StringType Admissiondepartment = new StringType();
		Admissiondepartment.fromStringValue("외과");
		pop.setAdmissiondepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Admissiondepartment", (IBaseDatatype) Admissiondepartment));	

		//퇴원과
		StringType Dischargedepartment = new StringType();
		Dischargedepartment.fromStringValue("외과");
		pop.setDischargedepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Dischargedepartment", (IBaseDatatype) Dischargedepartment));	

		//입원기간
		StringType AdmissionPeriod = new StringType();
		AdmissionPeriod.fromStringValue("0000-00-00 ~ 0000-00-00");
		pop.setAdmissionPeriod(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/AdmissionPeriod", (IBaseDatatype) AdmissionPeriod));	

		//입원일수
		StringType Admissiondays = new StringType();
		Admissiondays.fromStringValue("1");
		pop.setAdmissiondays(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Admission days", (IBaseDatatype) Admissiondays));	

		//의사명
		StringType Providername = new StringType();
		Providername.fromStringValue("홍길동");
		pop.setProvidername(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of provider", (IBaseDatatype) Providername));
		
		//면허번호
		StringType Certification = new StringType();
		Certification.fromStringValue("12345");
		pop.setCertification(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Number of certification", (IBaseDatatype) Certification));		
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
