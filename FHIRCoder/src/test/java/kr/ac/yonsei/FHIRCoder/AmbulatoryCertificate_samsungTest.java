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

import ca.uhn.fhir.context.FhirContext;

public class AmbulatoryCertificate_samsungTest {
	public static void main(String[] args) {
		AmbulatoryCertificate_samsung pop = new AmbulatoryCertificate_samsung();
		pop.setId("2020-00000");
		
		Patient pt = new Patient();
	
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("**");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("Hwang");
		ptname.add(fname);
		pt.setName(ptname);
		
		Calendar cal = Calendar.getInstance();
		cal.set(1995, Calendar.JULY , 13);
		Date dat = new Date(cal.getTimeInMillis());
		pt.setBirthDate(dat);
		
		pop.setSubject(new Reference(pt));
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 통원사실증명서(삼성서울); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Samsung Hospital");
		org.setId("00000");
		enc.setServiceProviderTarget(org);
		enc.setId("00000");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020, Calendar.FEBRUARY , 11);
		Date dat2 = new Date(cal2.getTimeInMillis());
		pop.setDate(dat2);

		StringType Department = new StringType();
		Department.fromStringValue("흉부외과");
		pop.setDepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department", (IBaseDatatype) Department));		
		
		StringType Treatmentdate = new StringType();
		Treatmentdate.fromStringValue("0000-00-00");
		pop.setTreatmentdate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Treatmentdate", (IBaseDatatype) Treatmentdate));	
		
		StringType KCD = new StringType();
		KCD.fromStringValue("D14.39");
		pop.setKCD(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/KCD", (IBaseDatatype) KCD));	
		
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
