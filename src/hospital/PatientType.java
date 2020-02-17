package hospital;

public class PatientType {

	private String name;
	private String gender;
	private String disease;
	private String stage;
	private int age;
	private int daysstayed;
	private int moneyowed;

	public int getMoneyowed() {
		return moneyowed;
	}

	public void setMoneyowed(int moneyowed) {
		this.moneyowed = moneyowed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDaysstayed() {
		return daysstayed;
	}

	public void setDaysstayed(int daysstayed) {
		this.daysstayed = daysstayed;
	}

	@Override
	public String toString() {
		return "PatientType [name=" + name + ", gender=" + gender + ", disease=" + disease + ", stage=" + stage
				+ ", age=" + age + ", daysstayed=" + daysstayed + ", moneyowed=" + moneyowed + "]";
	}

	
	}


