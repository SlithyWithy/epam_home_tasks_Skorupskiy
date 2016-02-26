package javase01.t06;

import javase01.t06.Note;

public class Notebook{
	
	private Note[] arr = new Note[0];
	private int size = 0;
	
	public void show() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Note " + (i + 1) + ": " + arr[i].getNote());
		}
	}
	
	public void addNote(String s) {
		size++;
		Note[] temp = new Note[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = new Note();
			temp[i].setNote(arr[i].getNote());
		}
		arr = temp;
		arr[size-1] = new Note();
		arr[size-1].setNote(s);
	}
	
	public void removeNote(int num) {
		if (num > 0 && num <= arr.length) {
			Note[] temp = new Note[arr.length-1];
			for (int i = 0; i < num - 1; i++) {
				temp[i] = new Note();
				temp[i].setNote(arr[i].getNote());
			}
			for (int i = num - 1; i < temp.length; i++) {
				temp[i] = new Note();
				temp[i].setNote(arr[i + 1].getNote());
			}
			arr = temp;
			size--;
		} else {
			System.out.println("Wrong note number.");
		}
	}	
	
	public void editNote(String s, int num) {
		if (num > 0 && num <= arr.length) {
			arr[num - 1].setNote(s);
		} else {
			System.out.println("Wrong note number.");
		}
	}
	
	public String getNote(int num) {
		if (num > 0 && num <= arr.length) {
			return arr[num - 1].getNote();
		} else {
			return "Wrong note number.";
		}
	}
	
	public int getSize() {
		return size;
	}
}