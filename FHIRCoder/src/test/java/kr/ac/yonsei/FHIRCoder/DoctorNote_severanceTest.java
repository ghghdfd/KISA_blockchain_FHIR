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
import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Address;
import ca.uhn.fhir.context.FhirContext;

public class DoctorNote_severanceTest {
	public static void main(String[] args) {
		DoctorNote_severance pop = new DoctorNote_severance();
		
		pop.setId("2020-10-A3");
		Patient pt = new Patient();		
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("hwang");
		ptname.add(fname);
		pt.setName(ptname);
		
		
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
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 소견서(세브란스); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Yonsei Hospital");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("54321");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal = Calendar.getInstance();
		cal.set(2019, Calendar.AUGUST , 21);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		StringType Certainty = new StringType();
		Certainty.fromStringValue("최종진단");
		pop.setCertainty(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Certainty of diagnosis", (IBaseDatatype) Certainty));
		
		StringType diagnosisdate = new StringType();
		diagnosisdate.fromStringValue("2019-04-10");
		pop.setdiagnosisdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of diagnosis", (IBaseDatatype) diagnosisdate));
		
		StringType onsetdate = new StringType();
		onsetdate.fromStringValue("2019-04-07");
		pop.setonsetdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of onset", (IBaseDatatype) onsetdate));	
		
		StringType Diagnosis = new StringType();
		Diagnosis.fromStringValue("종괴");
		pop.setcondition(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Diagnosis", (IBaseDatatype) Diagnosis));
		
		StringType KCD = new StringType();
		KCD.fromStringValue("R22.9");
		pop.setKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/KCD", (IBaseDatatype) KCD));
		
		StringType treatmentcontentandnote = new StringType();
		treatmentcontentandnote.fromStringValue("상기환자는 2019년 04월 10일 외래 내원하여 부인과 초음파 검사 시행 후 상기 소견으로 동년 05월 06일 입원하여 "
				+ "동년 동월 7일 복강경하 자궁근종 절제술, 우측 난소 - 난관 절제술 시행받고 동년 동월 10일 퇴원, "
				+ "조직검사 결과 자궁근종 및 우측 부난관 낭종 소견 보인 분으로 수술일로부터 6주간의 안정가료를 요함.");
		pop.settreatmentcontentandnote(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/treatment content and note", (IBaseDatatype) treatmentcontentandnote));
		
		StringType admissiondate = new StringType();
		admissiondate.fromStringValue("2019-05-06");
		pop.setadmissiondate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of admission", (IBaseDatatype) admissiondate));
		
		StringType dischargedate = new StringType();
		dischargedate.fromStringValue("2019-05-10");
		pop.setdischargedate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of discharge", (IBaseDatatype) dischargedate));	

		StringType Provider = new StringType();
		Provider.fromStringValue("산부인과");
		pop.setProvider(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department of provider", (IBaseDatatype) Provider));		
		
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
