package com.example.muhaimenn.bookapi.model;

import java.util.List;

public class Response{
	private String seriesT;
	private int pagesI;
	private String author;
	private double price;
	private List<String> cat;
	private String name;
	private String genreS;
	private int sequenceI;
	private boolean inStock;
	private String id;

	public void setSeriesT(String seriesT){
		this.seriesT = seriesT;
	}

	public String getSeriesT(){
		return seriesT;
	}

	public void setPagesI(int pagesI){
		this.pagesI = pagesI;
	}

	public int getPagesI(){
		return pagesI;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setCat(List<String> cat){
		this.cat = cat;
	}

	public List<String> getCat(){
		return cat;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setGenreS(String genreS){
		this.genreS = genreS;
	}

	public String getGenreS(){
		return genreS;
	}

	public void setSequenceI(int sequenceI){
		this.sequenceI = sequenceI;
	}

	public int getSequenceI(){
		return sequenceI;
	}

	public void setInStock(boolean inStock){
		this.inStock = inStock;
	}

	public boolean isInStock(){
		return inStock;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"series_t = '" + seriesT + '\'' + 
			",pages_i = '" + pagesI + '\'' + 
			",author = '" + author + '\'' + 
			",price = '" + price + '\'' + 
			",cat = '" + cat + '\'' + 
			",name = '" + name + '\'' + 
			",genre_s = '" + genreS + '\'' + 
			",sequence_i = '" + sequenceI + '\'' + 
			",inStock = '" + inStock + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}