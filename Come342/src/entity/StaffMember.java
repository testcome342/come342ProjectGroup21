package entity;

public abstract class StaffMember { // Nisa Berfin Yesin 
	
	private int staffNo;
	private String staffName;
	private String staffStartDate;
	private String staffEmailAddress;
	
	public StaffMember(int staffNo, String staffName, String staffStartDate, String staffEmailAddress) {
		super();
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.staffStartDate = staffStartDate;
		this.staffEmailAddress = staffEmailAddress;
	}

	public int getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffStartDate() {
		return staffStartDate;
	}

	public void setStaffStartDate(String staffStartDate) {
		this.staffStartDate = staffStartDate;
	}

	public String getStaffEmailAddress() {
		return staffEmailAddress;
	}

	public void setStaffEmailAddress(String staffEmailAddress) {
		this.staffEmailAddress = staffEmailAddress;
	}
	
	
}
