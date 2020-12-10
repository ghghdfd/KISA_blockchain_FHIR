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

public class ConfimationOfAdmission_severanceTest {
	public static void main(String[] args) {
		ConfirmationOfAdmission_severance pop = new ConfirmationOfAdmission_severance();
		pop.setId("97-00041");
		
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

		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 입.퇴원확인서(세브란스); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Yonsei Hospital");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("54321");
		pop.setEncounter(new Reference(enc));
		

		Calendar cal = Calendar.getInstance();
		cal.set(2020,Calendar.JUNE, 04);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		StringType Provider = new StringType();
		Provider.fromStringValue("소아청소년과");
		pop.setProvider(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department", (IBaseDatatype) Provider));		

		StringType Periodofadmission = new StringType();
		Periodofadmission.fromStringValue("0000-00-00 ~ 0000-00-00");
		pop.setPeriodofadmission(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Period of admission", (IBaseDatatype) Periodofadmission));		
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
