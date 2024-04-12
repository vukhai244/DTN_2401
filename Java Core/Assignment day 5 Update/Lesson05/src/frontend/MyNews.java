package frontend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import backend.News;

public class MyNews {
	public static List<News> lstNew =  new ArrayList<News>();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Menu();
		while(true) {
			System.out.println("Mời bạn chọn chức năng tương ứng từ 1 đến 5");
			int choice = 0;
			choice = ScannerUtils.inputInt();
			switch(choice) {
			case 1:		
				insertNews(scanner);
                break;
			case 2:
				viewListNews();
				break;
			case 3:
				AverageRate();
                break;
			case 4:
				ScannerUtils.closeProgram();
			case 5:
				Menu();
			default:
				System.out.println("Bạn chỉ được chọn các số từ 1 đến 5");
				break;
			}
		}
	}
	private static News insertNews(Scanner scanner) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
        System.out.print("Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Publish Date: ");
        String publishDate = scanner.nextLine();
        
        System.out.print("Author: ");
        String author = scanner.nextLine();
        
        System.out.print("Content: ");
        String content = scanner.nextLine();
        
        int[] rates = new int[3];
        System.out.println("3 rates:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Rate " + (i+1) + ": ");
            rates[i] = scanner.nextInt();
        }
        
        News news = new News(0, title, publishDate, author, content);
        news.setRates(rates);
        lstNew.add(news);
        
        System.out.println("Nhập thành công!");
       
        return news;
	}
	
	public static void viewListNews () {
		if(lstNew.isEmpty()) {
			System.out.println("Chưa có dữ liệu để hiển thị!");
		}
		 System.out.println("Danh sách tin tức: ");
		 for(News news : lstNew) {
			  news.Display();
		 }
	}
	
	public static void AverageRate() {
		if(lstNew.isEmpty()) {
			System.out.println("Chưa có dữ liệu để hiển thị!");
		}
		 for(News news : lstNew) {
			  System.out.println("Title: " + news.getTitle() + ", Average Rate: " + news.getAverageRate() );
		 }
	}
	
	public static void Menu() {
		System.out.println("========Menu========");
		System.out.println("1. Insert news");
		System.out.println("2. View list news");
		System.out.println("3. Average rate");
		System.out.println("4. Exit");
		System.out.println("5: Help");
		System.out.println("==============================");
	}
}
