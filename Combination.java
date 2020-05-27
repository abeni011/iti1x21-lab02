public class Combination {

    // Instance variables.
    int first, second, third;

    // Constructor
    public Combination( int first, int second, int third ) {
        this.first = first;
		this.second = second;
		this.third = third;
    }

    // An instance method that compares this object
    // to other.
    // Always check that other is not null, i)
    // an error would occur if you tried to
    // access other.first if other was null, ii)
    // null is a valid argument, the method should
    // simply return false.
    public boolean equals( Combination other ) {
        if ((this != null) && (other != null)){	
		    if(this.first == other.first){
               if (this.second == other.second){
                   if (this.third == other.third){
                       return true;
			        }
		        }
		    }
        }			
    return false;
    }
	
    // Returns a String representation of this Combination.
    public String toString() {
        return this.first +":"+this.second+":" +this.third;
    }
    
}


