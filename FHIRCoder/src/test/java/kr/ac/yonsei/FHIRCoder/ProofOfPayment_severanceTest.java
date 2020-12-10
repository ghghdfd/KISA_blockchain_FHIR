package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Money;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;

import ca.uhn.fhir.context.FhirContext;

public class ProofOfPayment_severanceTest {
	public static void main(String[] args) {
		ProofOfPayment_severance pop = new ProofOfPayment_severance();
		pop.setId("DOC12345-1");
		
		Patient pt = new Patient();
		pt.setId("950713-*******");
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("Hwang");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("**");
		ptname.add(fname);

		pt.setName(ptname);
		pop.setSubject(new Reference(pt));
		
		pop.setDate(new Date());
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 진료비 납입증명서(연말정산용); Authored by Jaehoon Lee Date: 2020-07-01</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();
		org.setName("Yonsei Hospital");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setId("5432");
		pop.setEncounter(new Reference(enc));
		


		
		Money paidbypatient = new Money();
		paidbypatient.setValue(1800);
		paidbypatient.setCurrency("Korea Won");
		pop.setPaidbypatient(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbypatient", paidbypatient));

		Money paidbyplan = new Money();
		paidbyplan.setValue(25000);
		paidbyplan.setCurrency("Korea Won");
		pop.setPaidbyplan(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbyplan", paidbyplan));

		Money paidtotal = new Money();
		paidtotal.setValue(34500);
		paidtotal.setCurrency("Korea Won");
		pop.setPaidtotal(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidtotal", paidtotal));

		Money paidbycreditcard = new Money();
		paidbycreditcard.setValue(13000);
		paidbycreditcard.setCurrency("Korea Won");
		pop.setPaidbycreditcard(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbycreditcard", paidbycreditcard));

		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}


}
