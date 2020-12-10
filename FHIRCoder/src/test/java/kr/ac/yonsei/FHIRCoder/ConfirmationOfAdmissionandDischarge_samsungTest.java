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

public class ConfirmationOfAdmissionandDischarge_samsungTest {
	public static void main(String[] args) {
		ConfirmationOfAdmissionandDischarge_samsung pop = new ConfirmationOfAdmissionandDischarge_samsung();
		
		pop.setId("2019-00-00");
		
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
		
		pop.setSubject(new Reference(pt));
		
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 입.퇴원확인서(삼성서울); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		/*Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Yonsei Hospital");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("54321");
		pop.setEncounter(new Reference(enc));*/
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2019, Calendar.FEBRUARY ,25);
		Date dat2 = new Date(cal2.getTimeInMillis());
		pop.setDate(dat2);
		
		StringType Department = new StringType();
		Department.fromStringValue("소화기내과분과");
		pop.setDepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department", (IBaseDatatype) Department));
		
		StringType admissiondate = new StringType();
		admissiondate.fromStringValue("000-00-00 ~ 0000-00-00 (0일간) 입원하였음");
		pop.setadmissiondate(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Dailyhospitalization", (IBaseDatatype) admissiondate));		
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
