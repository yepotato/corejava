package com.corejava9.v1ch05.arrayList;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee
{
   //zemin 修改文件3
   private String name;
   private double salary;
   private Date hireDay;

   public Employee(String n, double s, int year, int month, int day)
   {
      name = n;
      salary = s;
      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
      hireDay = calendar.getTime();
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public Date getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }



   public void setName(String name) {
      this.name = name;
   }

   public void setSalary(double salary) {
      this.salary = salary;
   }

   public void setHireDay(Date hireDay) {
      this.hireDay = hireDay;
   }
   @Override
   public String toString() {
      return "Employee{" +
              "name='" + name + '\'' +
              ", salary=" + salary +
              ", hireDay=" + hireDay +
              '}';
   }
   //修改 新增add  方法
   //delete
     //xinzeng  update
}
