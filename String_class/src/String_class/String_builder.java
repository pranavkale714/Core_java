package String_class;

public class String_builder {

	public static void main(String[] args) {
		String a="pranav";
		//imutable
		
		StringBuffer sb=new StringBuffer("pranav");
		//mutable and synchronize(learn in muktithrading)
		//synchronizing reduce speed
		
		StringBuilder s=new StringBuilder("pranav");
		//mutable and unsynchronizes
		//due to disadvantage of string buffer come in jdk 15 version

	}

}
