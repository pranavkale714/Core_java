class TransientVariable implements Serializable 
{ 
    // Making password transient for security 
    private transient String password; 
  
    transient int age; 
} 
