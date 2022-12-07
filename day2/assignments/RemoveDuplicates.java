package week1.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String [] split_word = text.split(" ");
		for (int i = 0; i < split_word.length; i++) {
			for (int j = i+1; j < split_word.length; j++) {
				if(split_word[i].equalsIgnoreCase(split_word[j]))
				{
					split_word[j]="";
					count++;

				}


			}

		}
		if(count>1)
		{
			for (int k = 0; k < split_word.length; k++) {
				System.out.print(split_word[k]+ " ");

			}
		}

	}

}



