package session5;

public class University {
	private String clgName;
	private String clgAddr;
	protected int clgFees;
	
	University(String clgName, String clgAddr, int clgFees)
	{
		this.clgName = clgName;
		this.clgAddr = clgAddr;
		this.clgFees = clgFees;
	}
	
	public void setclgName() {
		this.clgName = clgName;
	}
	
	public String getclgName() {
		return clgName;
	}

	public static void main(String[] args) {
		
	}
}
