package solitaire;

import java.util.ArrayList;



public class Stack {
	
	private ArrayList<Card> stack = new ArrayList<Card>();
	
	//default constructor
	public Stack(){
		
	}
	//constructor
	public Stack(ArrayList<Card> stack){
		this.stack = stack;
	}
	
	public void addElementOnIndice(int i, Card element){
		this.stack.add(i, element);
	}
	
	//Getter
	public ArrayList<Card> getStack(){
		return stack;
	}
	
	
//	@Override
//	public String toString(){
//		int i;
//		String fullString = "|";
//		
//		for (i=0; i<=stack.size(); i++){
//			fullString += stack.get(i).toString() + "|";
//		}
//		return fullString;
//	}
	
	public static void main(String[] args) {
		Stack test = new Stack();
		int i;
		
		for(i=0; i<13; i++){
			test.addElementOnIndice(i, new Card(1, i+1));
		}
		System.out.println(test.getStack());
		
	}
	
}
