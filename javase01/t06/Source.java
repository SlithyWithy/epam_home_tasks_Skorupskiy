//Спроектировать и разработать классы Запись в блокноте и Блокнот (записи блокнота хранятся в массиве). Реализовать методы: Добавить запись, Удалить запись, Редактировать запись, Посмотреть все записи.

package javase01.t06;

import javase01.t06.Notebook;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Source {
	public static void main(String[] args) {
		System.out.println("Task 6.1: ");
		Notebook book = new Notebook();
		int choice = -1;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("Choose an option: ");
			System.out.println("1 - Add a new note.");
			System.out.println("2 - Remove a note.");
			System.out.println("3 - Edit a note.");
			System.out.println("4 - Show a note.");
			System.out.println("5 - Show all notes.");
			System.out.println("0 - Exit.");
            String buffer;
            try {
                buffer = in.readLine();
                choice = Integer.parseInt(buffer);
            } catch (Throwable IOException) {
                System.out.println("Input error.");
                continue;
            };
			switch(choice) {
				case 0: { // exit
					break;
				}
				case 1: { // add note
					System.out.println("Enter your text: ");
					try {
						buffer = in.readLine();
					} catch (Throwable IOException) {
						System.out.println("Input error.");
						break;
					};
					book.addNote(buffer);
					System.out.println("Note has been created, note number is " + book.getSize());
					break;
				}
				case 2: { // remove note
					int num;
					System.out.println("Enter note number: ");
					try {
						buffer = in.readLine();
						num = Integer.parseInt(buffer);
					} catch (Throwable IOException) {
						System.out.println("Input error.");
						break;
					};
					book.removeNote(num);
					break;
				}
				case 3: { // edit note
					int num;
					System.out.println("Enter note number, followed by new text: ");
					try {
						buffer = in.readLine();
						num = Integer.parseInt(buffer);
						buffer = in.readLine();
					} catch (Throwable IOException) {
						System.out.println("Input error.");
						break;
					};
					book.editNote(buffer, num);
					break;
				}
				case 4: { // show note
					int num;
					System.out.println("Enter note number: ");
					try {
						buffer = in.readLine();
						num = Integer.parseInt(buffer);
					} catch (Throwable IOException) {
						System.out.println("Input error.");
						break;
					};
					System.out.println("Note " + num + ": " + book.getNote(num));
					break;
				}
				case 5: { // show all notes
					book.show();
					break;
				}
				default: {
					System.out.println("Wrong choice, try again.");
				}
			}
		} while (choice != 0);
	}
}