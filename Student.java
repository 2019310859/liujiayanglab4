package package1;

public class Student {
		 public String id;
		 public String name;
		 public String sex;
		 public String study;
		 public Student(String id,String name,String sex,String study)
		 {
		  this.id = id;
		  this.name = name;
		  this.sex = sex;
		  this.study = study;
		 }
		 public String toString() {
		  return "学生编号: "+this.id+"  姓名: "+this.name+"  性别: "+this.sex+"  作业内容:"+this.study;
		 }


}
