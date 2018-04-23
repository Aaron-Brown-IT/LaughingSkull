
public class LaughingSkull {

	public static void main(String[] args) {

		Runnable runnable = new running();
		Thread thread = new Thread(runnable);

		thread.start();

	}

	static void skull1() {

		System.out.println("         _,.-------.,_");
		System.out.println("     ,;~'             '~;,");
		System.out.println("   ,;                     ;,");
		System.out.println("  ;                         ;");
		System.out.println(" ,'                         ',");
		System.out.println(",;                           ;,");
		System.out.println("; ;      .           .      ; ;");
		System.out.println("| ;   ______       ______   ; |");
		System.out.println("|  `/~\"     ~\" . \"~     \"~\\'  |");
		System.out.println("|  ~  ,-~~~^~, | ,~^~~~-,  ~  |");
		System.out.println(" |   |        }:{        |   |");
		System.out.println(" |   l       / | \\       !   |");
		System.out.println(" .~  (__,.--\" .^. \"--.,__)  ~.");
		System.out.println(" |     ---;' / | \\ `;---     |");
		System.out.println("  \\__.       \\/^\\/       .__/");
		System.out.println("   V| \\                 / |V");
		System.out.println("    | |T~\\___!___!___/~T| |");
		System.out.println("    | |`IIII_I_I_I_IIII'| |");
		System.out.println("    |  \\,III I I I III,/  |");
		System.out.println("     \\   `~~~~~~~~~~'    /");
		System.out.println("       \\   .       .   /");
		System.out.println("         \\.    ^    ./");
		System.out.println("           ^~~~^~~~^");

	}

	static void skull2() {

		System.out.println("         _,.-------.,_");
		System.out.println("     ,;~'             '~;,");
		System.out.println("   ,;                     ;,");
		System.out.println("  ;                         ;");
		System.out.println(" ,'                         ',");
		System.out.println(",;                           ;,");
		System.out.println("; ;      .           .      ; ;");
		System.out.println("| ;   ______       ______   ; |");
		System.out.println("|  `/~\"     ~\" . \"~     \"~\\'  |");
		System.out.println("|  ~  ,-~~~^~, | ,~^~~~-,  ~  |");
		System.out.println(" |   |        }:{        |   |");
		System.out.println(" |   l       / | \\       !   |");
		System.out.println(" .~  (__,.--\" .^. \"--.,__)  ~.");
		System.out.println(" |     ---;' / | \\ `;---     |");
		System.out.println("  \\__.       \\/^\\/       .__/");
		System.out.println("   V| \\                 / |V");
		System.out.println("    | |T~\\___!___!___/~T| |");
		System.out.println("    | |`IIII_I_I_I_IIII'| |");
		System.out.println("    | |                 | |");
		System.out.println("    |  \\,III I I I III,/  |");
		System.out.println("     \\   `~~~~~~~~~~'    /");
		System.out.println("       \\   .       .   /");
		System.out.println("         \\.    ^    ./");
		System.out.println("           ^~~~^~~~^");

	}

}

class running implements Runnable {

	@Override
	public void run() {

		while (true) {
			clearConsole();
			LaughingSkull.skull1();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			clearConsole();
			LaughingSkull.skull2();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public final static void clearConsole() {

		try {
			final String os = System.getProperty("os.name");
			
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");

			}
		} catch (final Exception e) {

		}
	}

}