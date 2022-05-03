package 实验三;


import java.io.Serializable;

 class Student implements Serializable{
	   int id;
	   String name;
	   int age;
	   String departemnt;
	   
	   public Student(int id,String name,int age,String departemnt) {
		   this.id=id;
		   this.name=name;
		   this.age=age;
		   this.departemnt=departemnt;
	   }
	   public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public void setId(int age) {
			this.age = age;
		}
		public String getDepartemnt() {
				return departemnt;
			}
		public void setDepartemnt(String departemnt) {
				this.departemnt = departemnt;
			}
	   public String toString() {
		   return "Student [id=" + id + ", name=" + name +
				   ", age=" + age + ",departemnt="+departemnt+"]";
	   }
  }
	

