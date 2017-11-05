package solitaire;

import java.util.ArrayList;
import java.util.Collections;



public class Stack {
	
	protected ArrayList<Card> stack = new ArrayList<Card>();
	
	//default constructor
	public Stack(){
		
	}
	//constructor
	public Stack(ArrayList<Card> stack){
		this.stack = stack;
	}
	
	//Getter
	public ArrayList<Card> getStack(){
		return stack;
	}
	//Setter
	public void setStack(ArrayList<Card> stack){
		this.stack = stack;
	}
	
	// add element on specified indice i
	public void addElement(int i, Card element){
		this.stack.add(i, element);
	}
	//add element on last indice	
	public void addElement(Card element) {
		// TODO Auto-generated method stub
		this.stack.add(element);
		
	}
	
	//mix fonction
	public void shuffleCards(){
		Collections.shuffle(this.stack);	
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
	
	
}
