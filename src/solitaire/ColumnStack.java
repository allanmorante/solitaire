package solitaire;


public class ColumnStack extends Stack {
	
	
	//must add super methode, but need to modifiy addElement methode in Stack class before
	@Override
	public void addElement(Card element){
		int w = getStack().size();
		Card lastElement = getStack().get(w);
		
		if (lastElement.getColor()>2 && element.getColor()<2)
			this.stack.add(element);
		else if (lastElement.getColor()>2 && element.getColor()>2)
			System.out.println("Impossible de positionner la carte, celle ci est de la même couleur de que la précédente");
		else if (lastElement.getColor()<2 && element.getColor()>2)
			this.stack.add(element);
		else if (stack.isEmpty() == true)
			this.stack.add(element);
		else
			System.out.println("Impossible de positionner la carte, celle ci est de la même couleur de que la précédente");
		
	}
	public static void main(String[] args) {
		Stack test = new Stack();
		ColumnStack testDeux = new ColumnStack();
		int i;
		
		for(i=0; i<13; i++){
			test.addElement(i, new Card(3, i+1));
		}
		System.out.println(test.getStack());
//		test.shuffleCards();
//		System.out.println(test.getStack());
		
		testDeux.addElement(0, new Card(3, 12));
		System.out.println(testDeux.getStack());
		
		testDeux.addElement(test.getStack().get(11));
		System.out.println(testDeux.getStack());
		
	}

}
