package com.greatlearning.model;

public class Employee {
	
        private String firstName;
	    private String lastName;
	    private String emailid;
	    private String password;
	    public Employee() {}
	    
	    public Employee(String firstName, String lastName) {
			
			this.firstName = firstName;
			this.lastName = lastName;
	    }
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	    



}
