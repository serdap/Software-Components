package menupackage;

import lab1.*;
import homework1.*;
import lab2.*;
import lab3.*;
import homework2.*;
import homework4.*;
import homework5.*;
import homework5animal.*;
import homework6_animal.*;
import homework6_movable.*;
import homework6_object_interface.*;
import homework6shape.*;
import homewrk5shapesuperclass.*;
import java.util.Scanner;

public class ClassMenu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		String input;
		do {
			System.out.println("------Input a number to select a homework------");
			System.out.println("------1 Lap2                             ------");
			System.out.println("------2 Homework1                        ------");
			System.out.println("------3 Homework2                        ------");
			System.out.println("------4 Homework3                        ------");
			System.out.println("------5 Homework4                        ------");
			System.out.println("------6 Homework5                        ------");
			System.out.println("------7 Homework6                        ------");
			System.out.println("------8 lab1                             ------");
			System.out.println("------0 Exit                             ------");
			System.out.print("-> ");
			input = sc.nextLine().trim();
			switch (input) {
			case "1":
				do {
					System.out.println("------Input a number to choose method    ------");
					System.out.println("------1 PrintArray                       ------");
					System.out.println("------2 PrintArrayInStars                ------");
					System.out.println("------3 Hex2Bin                          ------");
					System.out.println("------4 Dec2Hex                          ------");
					System.out.println("------5 Exponent                         ------");
					System.out.println("------6 HasEight                         ------");
					System.out.println("------7 Print                            ------");
					System.out.println("------8 ArrayToString                    ------");
					System.out.println("------9 Contains                         ------");
					System.out.println("------10 Search                          ------");
					System.out.println("------11 Equals                          ------");
					System.out.println("------12 CopyOf                          ------");
					System.out.println("------13 Swap                            ------");
					System.out.println("------14 Reverse                         ------");
					System.out.println("------15 GradesStatistics                ------");
					System.out.println("------16 GradesHistogram                 ------");
					System.out.println("------0 Exit                             ------");
					System.out.print("-> ");
					input = sc.nextLine().trim();
					switch (input) {
					case "1":
						PrintArray.main(args);
						break;
					case "2":
						PrintArrayInStars.main(args);
						break;
					case "3":
						Hex2Bin.main(args);
						break;
					case "4":
						Dec2Hex.main(args);
						break;
					case "5":
						ExercisesonMethod.testExponent(args);
						break;
					case "6":
						ExercisesonMethod.testMagicSum(args);
						break;
					case "7":
						ExercisesonMethod.main(args);
						break;
					case "8":
						ExercisesonMethod.testArrayToString(args);
						break;
					case "9":
						ExercisesonMethod.testContains(args);
						break;
					case "10":
						ExercisesonMethod.testSearch(args);
						break;
					case "11":
						ExercisesonMethod.testEquals(args);
						break;
					case "12":
						ExercisesonMethod.testCopyOf(args);
						break;
					case "13":
						ExercisesonMethod.testSwap(args);
						break;
					case "14":
						ExercisesonMethod.testReverse(args);
						break;
					case "15":
						GradesStatistics.main(args);
						break;
					case "16":
						GradesHistogram.main(args);
						break;
					case "0":
						isValid = true;
						break;
					default:
						System.err.println("Error please enter again...");
					}
				} while (!isValid);
				isValid = false;
				break;
			case "2":
				do {
					System.out.println("------Input a number to choose method    ------");
					System.out.println("------1 Bin2Dec                          ------");
					System.out.println("------2 BoxPattern                       ------");
					System.out.println("------3 CaesarCode                       ------");
					System.out.println("------4 CheckerPattern                   ------");
					System.out.println("------5 CheckHexStr                      ------");
					System.out.println("------6 CountVowelsDigits                ------");
					System.out.println("------7 DecipherCaesarCode               ------");
					System.out.println("------8 ExchangeCipher                   ------");
					System.out.println("------9 Hex2Dec                          ------");
					System.out.println("------10 HillPattern                     ------");
					System.out.println("------11 Oct2Dec                         ------");
					System.out.println("------12 PhoneKeyPad                     ------");
					System.out.println("------13 RadixN2Dec                      ------");
					System.out.println("------14 ReverseString                   ------");
					System.out.println("------15 SquarePattern                   ------");
					System.out.println("------16 TestPalindromeWord              ------");
					System.out.println("------17 TimeTable                       ------");
					System.out.println("------18 TriangularPattern               ------");
					System.out.println("------0 Exit                             ------");
					System.out.print("-> ");
					input = sc.nextLine().trim();
					switch (input) {
					case "1":
						Bin2Dec.main(args);
						break;
					case "2":
						BoxPatternX.main(args);
						break;
					case "3":
						CaesarCode.main(args);
						break;
					case "4":
						CheckerPattern.main(args);
						break;
					case "5":
						CheckHexStr.main(args);
						break;
					case "6":
						CountVowelsDigits.main(args);
						break;
					case "7":
						DecipherCaesarCode.main(args);
						break;
					case "8":
						ExchangeCipher.main(args);
						break;
					case "9":
						Hex2Dec.main(args);
						break;
					case "10":
						HillPattern.main(args);
						break;
					case "11":
						Oct2Dec.main(args);
						break;
					case "12":
						PhoneKeyPad.main(args);
						break;
					case "13":
						RadixN2Dec.main(args);
						break;
					case "14":
						ReverseString.main(args);
						break;
					case "15":
						SquarePattern.main(args);
						break;
					case "16":
						TestPalindromicWord.main(args);
						break;
					case "17":
						TimeTable.main(args);
						break;
					case "18":
						TriangularPatternX.main(args);
						break;
					case "0":
						isValid = true;
						break;
					default:
						System.err.println("Error please enter again...");
					}
				} while (!isValid);
				isValid = false;
				break;
			case "3":
				do {
					System.out.println("------Input a number to choose method    ------");
					System.out.println("------1 DateUtil                         ------");
					System.out.println("------2 ExponentialSeries                ------");
					System.out.println("------3 FactorialInt                     ------");
					System.out.println("------4 FibonacciInt                     ------");
					System.out.println("------5 GreatestCommonDivisor            ------");
					System.out.println("------6 LinearSearch                     ------");
					System.out.println("------7 Matrix                           ------");
					System.out.println("------8 NumberGuess                      ------");
					System.out.println("------9 NumberSystemConversion           ------");
					System.out.println("------10 PerfectandDeficientNumbers      ------");
					System.out.println("------11 PerfectPrimeFactorList          ------");
					System.out.println("------12 PrimeList                       ------");
					System.out.println("------13 RecursiveBinarySearch           ------");
					System.out.println("------14 Recursive                       ------");
					System.out.println("------15 SortAlgorithm                   ------");
					System.out.println("------16 TrigonometriSeries              ------");
					System.out.println("------17 WordGuess                       ------");
					System.out.println("------0 Exit                             ------");
					System.out.print("-> ");
					input = sc.nextLine().trim();
					switch (input) {
					case "1":
						DateUtil.main(args);
						break;
					case "2":
						ExponentialSeries.main(args);
						break;
					case "3":
						FactorialInt.main(args);
						break;
					case "4":
						FibonacciInt.main(args);
						break;
					case "5":
						GreatestCommonDivisor.main(args);
						break;
					case "6":
						LinearSearch.main(args);
						break;
					case "7":
						Matrix.main(args);
						break;
					case "8":
						NumberGuess.main(args);
						break;
					case "9":
						NumberSystemConversion.main(args);
						break;
					case "10":
						PerfectNumberList.main(args);
						break;
					case "11":
						PerfectPrimeFactorList.main(args);
						break;
					case "12":
						PrimeList.main(args);
						break;
					case "13":
						RecursiveBinarySearch.main(args);
						break;
					case "17":
						WordGuess.main(args);
						break;
					case "0":
						isValid = true;
						break;
					default:
						System.err.println("Error please enter again...");
					}
				} while (!isValid);
				isValid = false;

				break;
			case "4":
				do {
					System.out.println("------Input a number to choose method    ------");
					System.out.println("------1 TestCircle                       ------");
					System.out.println("------2 TestMainCircle                   ------");
					System.out.println("------3 TestMainRectangle                ------");
					System.out.println("------4 TestMainEmployee                 ------");
					System.out.println("------5 TestMainInvoiceItem              ------");
					System.out.println("------6 TestMainAccount                  ------");
					System.out.println("------7 TestMainAccount2                 ------");
					System.out.println("------8 TestMainTime                     ------");
					System.out.println("------9 TestMainBall                     ------");
					System.out.println("------10 TestBook, Author                ------");
					System.out.println("------11 TestBook2                       ------");
					System.out.println("------12 TestBook3                       ------");
					System.out.println("------13 TestCustomer                    ------");
					System.out.println("------14 TestAccount                     ------");
					System.out.println("------15 TestMyPoint                     ------");
					System.out.println("------16 TestMyLine                      ------");
					System.out.println("------17 TestMyCircle                    ------");
					System.out.println("------18 TestMyTriangle                  ------");
					System.out.println("------0 Exit                             ------");
					System.out.print("-> ");
					input = sc.nextLine().trim();
					switch (input) {
					case "1":
						lab3.TestCircle.main(args);
						break;
					case "2":
						lab3.TestMainCircle.main(args);
						break;
					case "3":
						TestMainRectangle.main(args);
						break;
					case "4":
						TestEmployee.main(args);
						break;
					case "5":
						TestInvoiceItem.main(args);
						break;
					case "6":
						TestAccount.main(args);
						break;
					case "7":
						TestAccount.main(args);
						break;
					case "8":
						TestTime.main(args);
						break;
					case "9":
						TestMainBall.main(args);
						break;
					case "10":
						TestBook.main(args);
						TestAuthor.main(args);
						break;
					case "11":
						TestBook2.main(args);
						break;
					case "12":
						TestBook3.main(args);
						break;
					case "13":
						lab3.TestCustomer.main(args);
						break;
					case "14":
						TestAccount.main(args);
						break;
					case "15":
						lab3.TestMyPoint.main(args);
						break;
					case "16":
						lab3.TestMyLine.main(args);
						break;
					case "17":
						TestCircle.main(args);
						break;
					case "18":
						lab3.TestMyPoint.main(args);
						lab3.TestMyTriangle.main(args);
						break;
					case "0":
						isValid = true;
						break;
					default:
						System.err.println("Error please enter again...");
					}
				} while (!isValid);
				isValid = false;
				break;
			case "5":
				do {
					System.out.println("------Input a number to choose method    ------");
					System.out.println("------1 MyComplex                        ------");
					System.out.println("------2 MyPolynomial                     ------");
					System.out.println("------3 TestBigInt                       ------");
					System.out.println("------4 TestMyTime                       ------");
					System.out.println("------5 TestMyDate                       ------");
					System.out.println("------6 TestBall                         ------");
					System.out.println("------0 Exit                             ------");
					System.out.print("-> ");
					input = sc.nextLine().trim();
					switch (input) {
					case "1":
						TestMyComplex.main(args);
						break;
					case "2":
						TestPolynomial.main(args);
						break;
					case "3":
						TestBigInteger.main(args);
						break;
					case "4":
						TestMyTime.main(args);
						break;
					case "5":
						TestMyDate.main(args);
						break;
					case "6":
						TestBall.main(args);
						break;
					case "0":
						isValid = true;
						break;
					default:
						System.err.println("Error please enter again...");
					}
				} while (!isValid);
				isValid = false;
				break;

			case "6":
				do {
					System.out.println("------Input a number to choose method    ------");
					System.out.println("------1 TestCylinder                     ------");
					System.out.println("------2 TestPerson                       ------");
					System.out.println("------3 TestPoint3D                      ------");
					System.out.println("------4 TestShape                        ------");
					System.out.println("------5 TestAnimal                       ------");
					System.out.println("------6 TestLine and Linesub             ------");
					System.out.println("------7 TestCylinder using composition   ------");
					System.out.println("------0 Exit                             ------");
					System.out.print("-> ");
					input = sc.nextLine().trim();
					switch (input) {
					case "1":
						homework5.TestCylinder.main(args);
						break;
					case "2":
						homework5.TestPerson.main(args);
						break;
					case "3":
						homework5.TestPoint.main(args);
						break;
					case "4":
						homewrk5shapesuperclass.TestShape.main(args);
						break;
					case "5":
						homework5animal.TestAnimal.main(args);
						break;
					case "6":
						exe2.TestLine.main(args);
						exe2.TestLineSub.main(args);
						break;
					case "0":
						isValid = true;
						break;
					default:
						System.err.println("Error please enter again...");
					}
				} while (!isValid);
				isValid = false;
				break;
			/*----------*/
			case "8":
				do {
					System.out.println("------Input a number to choose method    ------");
					System.out.println("1. AverageWithInputValidation");
					System.out.println("2. CheckOddEven");
					System.out.println("3. CheckPassFail");
					System.out.println("4. CircleComputation");
					System.out.println("5. ComputePI");
					System.out.println("6. Fibonacci");
					System.out.println("7. InputValidation");
					System.out.println("8. PensionContributionCalculator");
					System.out.println("9. PrintNumberInWord");
					System.out.println("10. PrintDayInWord");
					System.out.println("11. PrintDayInWord");
					System.out.println("12. ReverseInt");
					System.out.println("13. SumAverageRunningInt");
					System.out.println("14. SumProductMinMax3");
					System.out.println("0. EXIT");
					System.out.print("-> ");
					input = sc.nextLine().trim();
					switch (input) {
					case "1":
						lab1.AverageWithInputValidation(sc);
						;
						break;
					case "2":
						lab1.CheckOddEven(6);
						;
						break;
					case "3":
						lab1.CheckPassFail(55);
						break;
					case "4":
						lab1.CircleComputation(sc);
						;
						break;
					case "5":
						lab1.ComputePi(10);
						;
						break;
					case "6":
						lab1.Fibonacci(10);
						break;
					case "7":
						lab1.InputValidation(sc);
						break;
					case "8":
						lab1.PensionContributionCalculator(sc);
						break;
					case "9":
						PrintNumberInWord.main(args);
						break;
					case "10":
						lab1.PrintDayInWord(5);
						break;
					case "12":
						lab1.ReverseInt(sc);
						break;
					case "13":
						lab1.SumAverageRunningInt(6, 10);
						break;
					case "14":
						lab1.SumProductMinMax3(sc);
						break;
					case "0":
						isValid = true;
						break;
					default:
						System.err.println("Error please enter again...");
					}
				} while (!isValid);
				isValid = false;
				break;
			case "7":
				do {
					System.out.println("------Input a number to choose method    ------");
					System.out.println("------1 TestShape                        ------");
					System.out.println("------2 TestGeometricObject              ------");
					System.out.println("------3 TestMovable                      ------");
					System.out.println("------4 TestResizableCircle             ------");
					System.out.println("------5 TestAnimal                       ------");
					System.out.println("------0 Exit                             ------");
					System.out.print("-> ");
					input = sc.nextLine().trim();
					switch (input) {
					case "1":
						homework6shape.TestShape.main(args);
						break;
					case "2":
						TestGeometricObject.main(args);
						break;
					case "3":
						homework6_movable.Test.main(args);
						break;
					case "5":
						homework6_animal.TestAnimal.main(args);
						break;
					case "0":
						isValid = true;
						break;
					default:
						System.err.println("Error please enter again...");
					}
				} while (!isValid);
				isValid = false;
				break;
			case "0":
				return;
			default:
				System.err.println("Error please enter again...");
				break;
			}

		} while (!isValid);
		sc.close();

	}
}
