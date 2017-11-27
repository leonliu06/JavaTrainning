class super { 
                 String name ; 
                 public super(String name) {     
                     this.name = name ; 
                 } 
                 public void fun1()     { 
                     System.out.println("this is class super !"+name); 
                 } 
             } 
             class sub extends super { 
                 public void fun1()     { 
                     System.out.println("this is class sub !"+name); 
                 } 
             } 
             class Test { 
                 public static void main(String args[]) { 
                     super s = new sub(); 
                 } 
             } 
