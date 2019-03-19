package com.yangyongfeng.corejava;

public abstract class Person {
		private String major;
		private String name;
		
		public Person(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
		}
		public  abstract String getDescription();
}
