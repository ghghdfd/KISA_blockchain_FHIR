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

public class DoctorNote_samsungTest {
	public static void main(String[] args) {
		DoctorNote_samsung pop = new DoctorNote_samsung();
		
		pop.setId("2018-00000");
		Patient pt = new Patient();		
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
		cal.set(1995, Calendar.JULY ,13);
		Date dat = new Date(cal.getTimeInMillis());
		pt.setBirthDate(dat);
		
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
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 소견서(삼성서울); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Samsung Hospital");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("54321");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal2 = Calendar.getInstance();
		cal2.set(2018, Calendar.JULY , 03);
		Date dat2 = new Date(cal2.getTimeInMillis());
		pop.setDate(dat2);
		
		StringType Certainty = new StringType();
		Certainty.fromStringValue("최종진단");
		pop.setCertainty(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Certainty of diagnosis", (IBaseDatatype) Certainty));
		
		StringType Diagnosis = new StringType();
		Diagnosis.fromStringValue("상세불명의 크론병");
		pop.setcondition(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Diagnosis", (IBaseDatatype) Diagnosis));
		
		StringType KCD = new StringType();
		KCD.fromStringValue("K50.99");
		pop.setKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/KCD", (IBaseDatatype) KCD));
		
		StringType diagnosisdate = new StringType();
		diagnosisdate.fromStringValue("2018-04-10");
		pop.setdiagnosisdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of diagnosis", (IBaseDatatype) diagnosisdate));
		
		StringType onsetdate = new StringType();
		onsetdate.fromStringValue("2018-04-07");
		pop.setonsetdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Date of onset", (IBaseDatatype) onsetdate));	
		
		StringType TreatmentContentAndNote = new StringType();
		TreatmentContentAndNote.fromStringValue("향후치료의견");
		pop.setTreatmentContentAndNote(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/treatment content and note", (IBaseDatatype) TreatmentContentAndNote));
		
		StringType Remark = new StringType();
		Remark.fromStringValue("2019-05-06");
		pop.setRemark(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Content of remark", (IBaseDatatype) Remark));
		
		StringType Perpose = new StringType();
		Perpose.fromStringValue("2019-05-10");
		pop.setPerpose(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Perpose of record", (IBaseDatatype) Perpose));	

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
