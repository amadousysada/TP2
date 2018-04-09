package m1.piu.data;
public class Contact {
    
	private String genre;
    
	private String nom;
        
        private String prenom;
        
        private int age;
        
        private String email;
        
        private String mobile;
        
        private String office;
        
        private String address;
    
	public Contact(String genre,String nom,String prenom,int age, String email,String mobile,String office,String address)
	{
    	this.genre=genre;
   	 
    	this.nom=nom;
        
        this.prenom =prenom;
        
        this.age = age;
        
        this.email = email;
        
        this.mobile = mobile;
        
        this.office = office;
        
        this.address = address;
   	 
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
        
        public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom =prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
    
}