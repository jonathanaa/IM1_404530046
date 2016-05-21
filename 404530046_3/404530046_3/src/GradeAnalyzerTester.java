/*
 * [A]98
 * [TA's Advise]
 * 1. 我想你應該跟奕凱有討論過, 問題我都寫他那邊囉!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		GradeAnalyzer Gradetool = new GradeAnalyzer();
		String ShortTimeInput;
		int count = 0;

		while (true) {
			ShortTimeInput = JOptionPane.showInputDialog(null, ":::Please insert one score:::");
			Gradetool.GradeStore(ShortTimeInput);
			count++;
			if (count < 3 && ShortTimeInput.toUpperCase().equals("Q")) {

				System.out.println("You did not enter enough grades to analyze. Please enter at least 2 valid grades ");
				count--;
				continue;
			}
			if (ShortTimeInput.toUpperCase().equals("Q")) {
				break;
			}

		}

		System.out.println(Gradetool);
	}

}
