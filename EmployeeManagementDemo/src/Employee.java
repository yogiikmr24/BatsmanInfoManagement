
public class Employee {
String name,address;
int salary,id;
    
public Employee(String name,int id,String address,int salary){
    this.name=name;
    this.id=id;
    this.address=address;
    this.salary=salary;
}
public String getName(){
  return name;
}
public void setName(String name){
  this.name=name;
}
public int getId(){
  return id;
}
public void setId(int id){
   this.id=id;
}
public String getAddress(){
 return address;
}
public void setAddress(String address){
 this.address=address;
}
public int getSalary(){
  return salary;
}
 public void setSalary(int salary){
 this.salary=salary;
}
} 
