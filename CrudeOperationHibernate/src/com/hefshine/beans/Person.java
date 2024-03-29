package com.hefshine.beans;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 	@Entity
	@Table(name = "person")
	public class Person {

		@Id
		@Column(name = "id")
		private int id;

		@Column(name = "first_name",length=20)
		private String firstName;

		@Column(name = "last_name",length=20)
		private String lastName;

		 
		@Embedded
		private Address address;


		public Person() {
			super();
		}


		public Person(int id, String firstName, String lastName, Address address) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
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


		public Address getAddress() {
			return address;
		}


		public void setAddress(Address address) {
			this.address = address;
		}


		@Override
		public String toString() {
			return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
					+ "]";
		}
		 
		 
}
