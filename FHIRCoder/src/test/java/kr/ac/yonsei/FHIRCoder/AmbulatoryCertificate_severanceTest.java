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

public class AmbulatoryCertificate_severanceTest {
	public static void main(String[] args) {
		AmbulatoryCertificate_severance pop = new AmbulatoryCertificate_severance();
		pop.setId("2020-10-A1");
		
		Patient pt = new Patient();		
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("hwang");
		ptname.add(fname);
		pt.setName(ptname);
		
		List<Address> address = new ArrayList<Address>();
		Address adresss = new Address();
		adresss.setCountry("경기도");
		adresss.setCity("**");
		adresss.setDistrict("**");
		address.add(adresss);
		pt.setAddress(address);
		
		List<Identifier> num = new ArrayList<Identifier>();
		Identifier numm = new Identifier();
		numm.setValue("950713-*******");
		num.add(numm);
		
		pt.setIdentifier(num);
		pop.setSubject(new Reference(pt));

			
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 통원증명서(진단명 포함); Authored by Jaehoon Lee Date: 2020-07-13</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Yonsei Hospital");
		org.setId("00000");
		enc.setServiceProviderTarget(org);
		enc.setId("00000");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal = Calendar.getInstance();
		cal.set(2019, Calendar.AUGUST , 21);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		StringType Diagnosis = new StringType();
		Diagnosis.fromStringValue("두근거림");
		pop.setcondition(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Diagnosis", (IBaseDatatype) Diagnosis));
		
		StringType Certainty = new StringType();
		Certainty.fromStringValue("최종진단");
		pop.setCertainty(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Certainty of diagnosis", (IBaseDatatype) Certainty));
		
		StringType Procedure = new StringType();
		Procedure.fromStringValue("수술없음");
		pop.setProcedure(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Name of procedure", (IBaseDatatype) Procedure));		

		StringType Provider = new StringType();
		Provider.fromStringValue("심장내과");
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
