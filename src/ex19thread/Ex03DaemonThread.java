package ex19thread;

/*
쓰레드로 구현하지 않은 일반적인 클래스
: 하나의 클래스가 작업을 완료해야 다음 클래스의 작업을 진행할 수 있다.
즉 동시에 작업을 진행할 수 없다.
 */
class NomalClass{
	
	String title;

	public NomalClass(String title) {
		super();
		this.title = title;
	}
	//단순 10번 반복해서 멤버변수를 출력
	void classMethod() {
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%s]i=%d%n", title, i);
		}
	}
}
/*
독립쓰레드(Non daemon thread)
: 메인쓰레드와 Working쓰레드(개발자가 정의한 쓰레드)를 일컫는 것으로
메인쓰레드가 종료되어도 계속 실행되며, Dead상태가 되어야만 실행이
종료되는 쓰레드를 말한다. 해당 쓰레드는 main()메서드가 종료된 이후에
도 계속 실행되는것을 볼수 있다.
 */
class NomalThread extends Thread{
	
	/*
	기본생성자를 통해 인스턴스를 생성하면 쓰레드명이 JVM에 의해
	자동으로 부여된다.
	 */
	public NomalThread() {}
	/*
	Thread클래스의 생성자 호출시 전달되는 인수를 통해 이 쓰레드의
	이름을 지정할 수 있다. 여기서 지정된 이름은getName()을 통해
	확인할 수 있다.
	 */
	public NomalThread(String title) {
		super(title);
	}
	/*
	쓰레드 동작중 비정상적인 종료가 될때 InterruptedException이
	발생할 수 있으므로, 예외처리를 해야한다. 여기서는 try~catch로
	직접 처리하지 않고, throws에서 호출한 위치로 예외던지기를 하고
	있다.
	 */
	void threadMethod() throws InterruptedException{
		for (int i = 0; i <= 10; i++) {
			//쓰레드명과 반복횟수를 출력
			System.out.printf("%s]i=%d%n", getName(), i);
			/*
			10번 반복 중 2초씩 block상태로 들어가므로 총 20초간
			반복된다.
			 */
			sleep(2000);
		}
	}
	public void run() {
		//해당 메서드에서 무시한 예외를 호출한 지점에서 처리한다.
		try {
			threadMethod();
		} catch (InterruptedException e) {}
	}
}

/*
종속쓰레드(Daemn Thread)
: 모든 독립쓰레드가 종료되면 자동으로 종료되는 쓰레드를 말한다.
메인메서드도 하나의 독립쓰레드이므로, 다른 독립쓰레드가 남아있다면
종료될때까지는 프로그램이 종료되는것은 아니다.
주로 프로그램의 보조역할로 배경음악재상, 자동저장 등의 업무를 처리한다.
프로그램이 종료될때 함께 종료되므로 무한루프를 구현한다.
 */
class DaemnThread extends Thread{
	/*
	무한루프로 구성되어있고 별도의 탈출조건을 만들지 않는다.
	3초에 한번씩 block상태로 들어간다.
	 */
	public void run() {
		while (true) {
			System.out.printf("[쓰레드명:%s]Jazz가 흘러요~%n", getName());
			try {
				sleep(3000);
				System.out.println("3초마다 자동저장");
			} catch (InterruptedException e) {
				System.out.println("자동저장시 오류발생");
			}
		}
	}
}
public class Ex03DaemonThread {

	public static void main(String[] args) {
		/*
		쓰레드로 구현하지 않은 일반적인 클래스의 작업으로 순자적으로
		실행되어 1번 인스턴스가 작업을 마쳐야만 2번째가 실행된다.
		 */

		NomalClass nt1 = new NomalClass("첫번째 클래스");
		nt1.classMethod();
		new NomalClass("두번째 클래스").classMethod();
		
		/*
		첫번째 독립스레드 생성 및 시작. 우선순위를 별도로 부여하지
		않으므로 5로 지정된다. 쓰레드 인스턴스 생성시 이름을 부여하는
		방법으로 아래 2가지가 있다.
		 */
		//방법1 : 생성자를 통해 쓰레드의 이름 부여
		NomalThread yt1 = new NomalThread("1st 쓰레드");
		//방법2 : setName()을 통해 이름 부여
//		yt1.setName("First 쓰레드");
		yt1.start();
		
		/*
		두번째 독립쓰레드 생성 및 시작. 쓰레드명을 부여하지 
		않았음로 JVM이 자동으로 이름을 부여한다.
		 */
		NomalThread yt2 = new NomalThread();
		//우선순위를 10으로 부여(.MAX_PRIORITY)
		yt2.setPriority(Thread.MAX_PRIORITY);
		yt2.start();
		
		/*
		데몬쓰레드는 독립쓰레드를 먼저 생성한 후 setDaemon을 통해
		지정할 수 있다.
		 */
		DaemnThread dt = new DaemnThread();
		//쓰레드명 지정
		dt.setName("데몬쓰레드");
		//여기서 데몬쓰레드가 된다
		dt.setDaemon(true);
		dt.start();
		
		System.out.println("현재 활성화 된 상태의 쓰레드수"+ Thread.activeCount());
		System.out.println("현재 실행중인 쓰레드명"+ Thread.currentThread().getName());
		System.out.println("메인함수의 우선순위"+ Thread.currentThread().getPriority());
		System.out.println("메인함수(MAin Thread) 종료");
	}

}
