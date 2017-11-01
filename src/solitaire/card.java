package solitaire;

public class Card {

	
	private int color;
	private int number;
	private boolean visible;
	
	//default constructor
	public Card(){
		
	}
	//constructor with visible set as true by default
	public Card(int color, int number){
			
			this.color = color;
			this.number = number;
			this.visible = true;
	}
	
	//constructor
	public Card(int color, int number, boolean visible){
		
		this.color = color;
		this.number = number;
		this.visible = visible;
	}
	
	
	//define color of the card
	public void setColor(int color){		
		this.color = color;
	}
	public int getColor(){
		return color;
	}
	
	
	//define number of the card
	public void setNumber(int number){
		this.number = number;
	}
	public int getNumber(){
		return number;
	}
	
	public String nameCard(){
		String nameCard = "";
		
		switch(number){
		
			case 1 : nameCard = "Deux";
			break;
			case 2 : nameCard = "Trois";
			break;
			case 3 : nameCard = "Quatre";
			break;
			case 4 : nameCard = "Cinq";
			break;
			case 5 : nameCard = "Six";
			break;
			case 6 : nameCard = "Sept";
			break;
			case 7 : nameCard = "Huit";
			break;
			case 8 : nameCard = "Neuf";
			break;
			case 9 : nameCard = "Dix";
			break;
			case 10 : nameCard = "Valet";
			break;
			case 11 : nameCard = "Dame";
			break;
			case 12 : nameCard = "Roi";
			break;
			case 13 : nameCard = "As";
			break;
		}
		
		return nameCard;
	}
	
	public String nameColor(){
		String nameColor = "";
		
		switch(color){
		
			case 1 : nameColor = "Carreau";
			break;
			case 2 : nameColor = "Coeur";
			break;
			case 3 : nameColor = "Pique";
			break;
			case 4 : nameColor = "Trèfle";
			break;
		}
		
		return nameColor;
	}
	
	
	//define visibility of the card
	public void setVisible(boolean visible){
		this.visible = visible;
	}
	public boolean getVisible(){
		return visible;
	}
	@Override
	public String toString(){
		
		if (!getVisible()){
			return "?";
		}
		else{
			return nameCard() + " de " + nameColor();
		}
		
	}
}
