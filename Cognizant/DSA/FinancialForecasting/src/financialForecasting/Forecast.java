package financialForecasting;

public class Forecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        double presentValue = 10000.0;
	        double growthRate = 0.10;      // 10%
	        int years = 5;

	        double predictedValue = FinancialForecast.futureValue(presentValue, growthRate, years);

	        System.out.println("Financial Forecast");
	        System.out.println("----------------------------");
	        System.out.println("Present Value : " + presentValue);
	        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
	        System.out.println("Years         : " + years);
	        System.out.printf("Future Value  : %.2f\n", predictedValue);
	}

}
