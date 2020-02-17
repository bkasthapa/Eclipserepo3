package hospital;

public class PatientPayment {

	public static void main(String[] args) {
		PatientType pt = new PatientType();
		pt.setName("Ram");
		pt.setGender("M");
		pt.setDisease("cancer");
		pt.setStage("IV");
		pt.setAge(45);
		pt.setDaysstayed(90);
		pt.setMoneyowed(25000);

		PaymentSetup ps = new PaymentSetup();
		ps.payment(pt);
	}

}
