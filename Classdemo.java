package jan2;

	class Classdemo
	{

		int id; //instance variable
		String name;
		String address;
		float marks;
		long phno;
		String city;
		
		public Classdemo() {
			super();
			
		}
		//constructor chaining-we are reusing constructor
		public Classdemo(int id, String name, String address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
		}
		
		public Classdemo(int id, String name, String address,float marks)
		{
			//this();//it will call default constructor
			this(id,name,address);//invoking current class constructor
			this.marks=marks;
		}


		public Classdemo(int id, String name, String address,float marks,long phno,String city)
		{
			this(id,name,address,marks);
			this.phno=phno;
			this.city=city;
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}
		public float getMarks() {
			return marks;
		}
		public void setMarks(float marks) {
			this.marks = marks;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}


	}

	public class ClassDemo {

		public static void main(String[] args) {
		
			
			Classdemo patri=new Classdemo();//memory creation
//			karunakar.setData(2, "karunaka", "hyderabad");	//4567
			patri.setId(1);
			patri.setName("patri");
			patri.setAddress("kolkata");
			//System.out.println("object: "+ karunakar);
			System.out.println("id:"+ patri.getId()+" name:"+patri.getName()+
					" Address:"+patri.getAddress());
		
			
			Classdemo srineeta=new Classdemo(2,"srineeta","kolkata");
			srineeta.setName("srineeta porel");
			System.out.println("id:"+ srineeta.getId()+" name:"+srineeta.getName()+
					" Address:"+srineeta.getAddress());
			
			Classdemo rahul=new Classdemo(3,"rahul nandy","cr avenue",78.5f,9920456345l,"kolkata");
			System.out.println("id:"+ rahul.getId()+" name:"+rahul.getName()+
					" Address:"+rahul.getAddress()+" marks: "+rahul.getMarks()+" phno:"+rahul.getMarks()+
					"  city:"+rahul.getCity());
		
		}

	}
