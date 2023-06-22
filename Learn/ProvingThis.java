class ProvingThis{
	void m(){
		System.out.println(this);
	}
	public static void main(String args[]){
		ProvingThis obj = new ProvingThis();
		System.out.println(obj);
		obj.m();
	}
}