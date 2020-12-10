package kr.ac.yonsei.FHIRCoder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.instance.model.api.IBaseDatatype;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Money;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.StringType;

import ca.uhn.fhir.context.FhirContext;

public class ProofOfPayment_notax_severanceTest {
	public static void main(String[] args) {
		ProofOfPayment_notax_severance pop = new ProofOfPayment_notax_severance();
	    pop.setId("97-00043");
		
		Patient pt = new Patient();
		/*pt.setId("5432");*/
		List<HumanName> ptname = new ArrayList<HumanName>();
		HumanName lname = new HumanName();
		lname.setText("Hwang");
		ptname.add(lname);
		HumanName fname = new HumanName();
		fname.setText("**");
		ptname.add(fname);

		pt.setName(ptname);
		pop.setSubject(new Reference(pt));
		
		List<Identifier> num = new ArrayList<Identifier>();
		Identifier numm = new Identifier();
		numm.setValue("950713-*******");
		num.add(numm);
		
		pt.setIdentifier(num);
		pop.setSubject(new Reference(pt));
		
		pop.setDate(new Date());
		Narrative value = new Narrative();
		value.setDivAsString("<div>KISA 2020 블록체인 프로젝트; FHIR 프로파일링 진료비 납입증명서(세브란스); Authored by Jaehoon Lee Date: 2020-07-20</div>");
		pop.setText(value);
		
		Encounter enc = new Encounter();
		Organization org = new Organization();

		org.setName("yonsei hospital");
		org.setId("764332");
		enc.setServiceProviderTarget(org);
		enc.setServiceProvider(new Reference(org));
		enc.setId("54321");
		pop.setEncounter(new Reference(enc));
		
		Calendar cal = Calendar.getInstance();
		cal.set(2019, Calendar.JUNE,4);
		Date dat = new Date(cal.getTimeInMillis());
		pop.setDate(dat);
		
		StringType dateofcashreceive = new StringType();
		dateofcashreceive.fromStringValue("2018-01-08");
		pop.setdateofcashreceive(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/dateofcashreceive", (IBaseDatatype) dateofcashreceive));
		
		StringType Department = new StringType();
		Department.fromStringValue("종양내과");
		pop.setdepartment(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Department", (IBaseDatatype) Department));
		
		Money paidtotal = new Money();
		paidtotal.setValue(23290);
		paidtotal.setCurrency("Korea Won");
		pop.setPaidtotal(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidtotal", paidtotal));
		
		Money paidbyplan = new Money();
		paidbyplan.setValue(22125);
		paidbyplan.setCurrency("Korea Won");
		pop.setPaidbyplan(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbyplan", paidbyplan));
		
		Money paidbypatientinplan = new Money();
		paidbypatientinplan.setValue(1165);
		paidbypatientinplan.setCurrency("Korea Won");
		pop.setpaidbypatientinplan(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbyplan", paidbypatientinplan));

		Money paidbypatient = new Money();
		paidbypatient.setValue(0);
		paidbypatient.setCurrency("Korea Won");
		pop.setPaidbypatient(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/paidbypatient", paidbypatient));

		Money Optionalexpenses = new Money();
		Optionalexpenses.setValue(0);
		Optionalexpenses.setCurrency("Korea Won");
		pop.setOptionalexpenses(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/Optionalexpenses", Optionalexpenses)); 
		
		Money receipt = new Money();
		receipt.setValue(1100);
		receipt.setCurrency("Korea Won");
		pop.setreceipt(new org.hl7.fhir.r4.model.Extension("http://yonsei.ac.kr/receipt", receipt));
		
		FhirContext ctx = FhirContext.forR4();
		String string = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(pop);
		System.out.println(string);
	}
}
