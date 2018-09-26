package com.database.newtable.sql;
 
import java.util.Date;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
public class employee {
 
    public List<employee> getEmployeeList(){
 
        Session session = null;
        List<employee> empList = null;
        try {
            Object HibernateUtil;
			
            String queryStr = "select emp from employee emp";
            Query query = session.createQuery(queryStr);
            empList = query.list();
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return empList;
    }
 
    public Object getEmployeeById(Long empId){
 
        Session session = null;
        Object emp = null;
        try {
            
            String queryStr = "select emp from employee emp";
            emp = session.get(employee.class, empId);
 
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
        return emp;
    }
 
    public void insertemployee(employee emp) {
 
        Session session = null;
        Transaction transaction = null;
        try {
            
            transaction = session.beginTransaction();
            session.save(emp);
            System.out.println("inserted employee: "+emp.getName());
            transaction.commit();
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
    }
 
    private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployee(employee emp) {
 
        Session session = null;
        Transaction transaction = null;
        try {
          
            transaction = session.beginTransaction();
            session.delete(emp);
            transaction.commit();
            System.out.println("deleted employee: "+emp.getName());
        } catch(Exception ex) {
            ex.printStackTrace();
            // handle exception here
            if(transaction != null) transaction.rollback();
        } finally {
            try {if(session != null) session.close();} catch(Exception ex) {}
        }
    }
 
    public static void main(String a[]) {
 
        employee emp = new employee();
 
        employee emp1 = new employee();
        emp1.setemp_Name("Balakumari");
        emp1.setemp_code("gits002");
        emp1.setJoining_dateOn(new Date());
        emp1.setborndate(new Long(5250));
        emp1.insertemployee(emp1);
 
        System.out.println("---------------------------");
 
        List<employee> empList = emp1.getEmployeeList();
        System.out.println("emp size: "+empList.size());
        empList.stream().forEach(System.out::println);
 
        System.out.println("---------------------------");
 
        employee empObj = emp1.getemployeeByemp_code(emp1.getemp_code());
        System.out.println(empObj);
 
        System.out.println("---------------------------");
        emp1.deleteEmployee(empObj);
 
        System.out.println("---------------------------");
 
        empList = emp1.getEmployeeList();
        System.out.println("emp size: "+empList.size());
        empList.stream().forEach(System.out::println);
 
        System.out.println("---------------------------");
    }

	private employee getemployeeByemp_code(Object getemp_code) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getemp_code() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setborndate(Long long1) {
		// TODO Auto-generated method stub
		
	}

	private void setJoining_dateOn(Date date) {
		// TODO Auto-generated method stub
		
	}

	private void setemp_Name(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setemp_code(String string) {
		// TODO Auto-generated method stub
		
	}
}