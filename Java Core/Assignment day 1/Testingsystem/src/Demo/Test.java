package Demo;

import java.util.Date;

public class Test {
	public static void main (String[] args) {
		
		//Department

		Department department1= new Department();
		department1.departmentId=1;
		department1.departmentName="Sale";
		
		Department department2= new Department();
		department2.departmentId=2;
		department2.departmentName="Maketting";
		
		Department department3= new Department();
		department3.departmentId=3;
		department3.departmentName="Dev";
		
		//Position
		
		Position position1= new Position();
		position1.positionId=1;
		position1.positionName="Nhân viên";
		
		Position position2= new Position();
		position2.positionId=2;
		position2.positionName="Giám đốc";
		
		Position position3= new Position();
		position3.positionId=3;
		position3.positionName="Thực tập sinh";
		
		//Account
		
		Account account1= new Account();
		account1.accountId=1;
		account1.fullName="Nguyễn Văn A";
		account1.userName="anguyen";
		account1.department = department1;
		account1.position= position1;
		account1.createDate = new Date("2024/04/01");

		Account account2= new Account();
		account2.accountId=2;
		account2.fullName="Nguyễn Văn B";
		account2.userName="bnguyen";
		account2.department = department2;
		account2.position= position1;;
		account2.createDate = new Date("2024/04/01");
		
		Account account3= new Account();
		account3.accountId=3;
		account3.fullName="Nguyễn Văn C";
		account3.userName="cnguyen";
		account3.department = department3;
		account3.position= position1;
		account3.createDate = new Date("2024/04/01");
		
		//Group
		
		Group group1= new Group();
		group1.groupId=1;
		group1.groupName="Group 1";
		group1.creator= account1;
		group1.createDate = new Date("2024/04/01");
		
		Group group2= new Group();
		group2.groupId=1;
		group2.groupName="Group 2";
		group2.creator= account2;
		group2.createDate = new Date("2024/04/01");
		
		Group group3= new Group();
		group3.groupId=3;
		group3.groupName="Group 3";
		group3.creator= account1;
		group3.createDate = new Date("2024/04/01");
		
		//GroupAccount
		
		Groupaccount groupAccount1= new Groupaccount();
		groupAccount1.group= group1;
		groupAccount1.account= account1;
		groupAccount1.joinDate = new Date("2024/04/01");
		
		Groupaccount groupAccount2= new Groupaccount();
		groupAccount2.group= group2;
		groupAccount2.account= account1;
		groupAccount2.joinDate = new Date("2024/04/01");
		
		Groupaccount groupAccount3= new Groupaccount();
		groupAccount3.group= group3;
		groupAccount3.account= account1;
		groupAccount3.joinDate = new Date("2024/04/01");
		
		//TypeQuestion
		
		Typequestion typeQuestion1= new Typequestion();
		typeQuestion1.typeId= 1;
		typeQuestion1.typeName= "Essay";
		
		Typequestion typeQuestion2= new Typequestion();
		typeQuestion2.typeId= 2;
		typeQuestion2.typeName= "Essay";
		
		Typequestion typeQuestion3= new Typequestion();
		typeQuestion3.typeId= 3;
		typeQuestion3.typeName= "Multiple_Choice";
		
		//CategoryQuestion
		
		Categoryquestion categoryQuestion1= new Categoryquestion();
		categoryQuestion1.categoryId= 1;
		categoryQuestion1.categoryName= "Java";
		
		Categoryquestion categoryQuestion2= new Categoryquestion();
		categoryQuestion2.categoryId= 2;
		categoryQuestion2.categoryName= "NET";
		
		Categoryquestion categoryQuestion3= new Categoryquestion();
		categoryQuestion3.categoryId= 3;
		categoryQuestion3.categoryName= "Postman";
		
		//Question
		
		Question question1= new Question();
		question1.questionId=1;
		question1.content="Java là gì?";
		question1.category= categoryQuestion1;
		question1.type= typeQuestion1;
		question1.creator= account1;
		question1.createDate = new Date("2024/04/01");
		
		Question question2= new Question();
		question2.questionId=2;
		question2.content="NET là gì?";
		question2.category= categoryQuestion2;
		question2.type= typeQuestion2;
		question2.creator= account2;
		question2.createDate = new Date("2024/04/01");
		
		Question question3= new Question();
		question3.questionId=3;
		question3.content="Posmant là gì?";
		question3.category= categoryQuestion3;
		question3.type= typeQuestion3;
		question3.creator= account3;
		question3.createDate = new Date("2024/04/01");
		
		//Answer
		
		Answer answer1= new Answer();
		answer1.answerId=1;
		answer1.content="Không biết";
		answer1.question= question1;
		answer1.isCorrect= true;
		
		Answer answer2= new Answer();
		answer2.answerId=2;
		answer2.content="Không biết";
		answer2.question= question2;
		answer2.isCorrect= true;
		
		Answer answer3= new Answer();
		answer3.answerId=3;
		answer3.content="Không biết";
		answer3.question= question3;
		answer3.isCorrect= false;
		
		//Exam
		
		Exam exam1= new Exam();
		exam1.examId=1;
		exam1.code="made1";
		exam1.title= "Thi đầu vào";
		exam1.category= categoryQuestion1;
		exam1.creator= account1;
		exam1.createDate = new Date("2024/04/01");
		
		Exam exam2= new Exam();
		exam2.examId=2;
		exam2.code="made2";
		exam2.title= "Thi giữa kỳ";
		exam2.category= categoryQuestion2;
		exam2.creator= account2;
		exam2.createDate = new Date("2024/04/01");
		
		Exam exam3= new Exam();
		exam3.examId=3;
		exam3.code="made3";
		exam3.title= "Thi cuối kỳ";
		exam3.category= categoryQuestion1;
		exam3.creator= account1;
		exam3.createDate = new Date("2024/04/01");
		
		//ExamQuestion
		
		Examquestion examQuestion1= new Examquestion();
		examQuestion1.exam= exam1;
		examQuestion1.question=question1;
		
		Examquestion examQuestion2= new Examquestion();
		examQuestion2.exam= exam2;
		examQuestion2.question=question2;
		
		Examquestion examQuestion3= new Examquestion();
		examQuestion3.exam= exam3;
		examQuestion3.question=question3;
		
		
		
		System.out.println ("Thông tin nhân viên 1");
		System.out.println ("Tên: " + account1.fullName);
		System.out.println ("Phòng ban: " + account1.department.departmentName);
		System.out.println ("Chức danh: " + account1.position.positionName);
		System.out.println ("Định danh nhóm: " + group1.groupId);
		System.out.println ("Ngày user tham gia nhóm: " + groupAccount1.joinDate);
		System.out.println ("Định danh câu hỏi: " + typeQuestion1.typeId);
		System.out.println ("Tên chủ đề câu hỏi: " + categoryQuestion1.categoryName);
		System.out.println ("Nội dung câu hỏi: " + question1.content);
		System.out.println ("Nội dung câu hỏi: " + question1.content);
		System.out.println ("Nội dung câu trả lời: " + answer1.content);
		System.out.println ("Mã đề thi: " + exam1.code);
		System.out.println ("Định danh câu hỏi: " + examQuestion1.question.questionId);
				
	}
}
