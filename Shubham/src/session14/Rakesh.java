package session14;

class Rakesh extends Student implements StdInfo{
	@Override
	
	public void showStd(String std) {
		System.out.println("Rakesh is in " + std + " Standard");
	}

}
