public class TestCalculator {
	
	//计算m的n次方
	private double getPowerValue(double m, double n){
		return Math.pow(m, n);
	}
	//计算m的阶乘
	private double getFactorial(int m){
		
		int result = 1;
		if (m == 1 || m == 0){
			return result;
		}
		for(int i = 1; i < m ; i++){
			result = result * (i+1);
		}
		return result;
	}
	//计算从n个不同元素中取出m个元素的组合数 （ n >= m）
	private double getCombinationSum(int n, int m){
		double tmp_n = getFactorial(n);
		double tmp_m = getFactorial(m);
		double tmp_n_m = getFactorial(n-m);
		return tmp_n / (tmp_m * tmp_n_m);
	}
	//给定样本总量为n，对于单个样本，其属性有m个可能的取值，且概率相等
	//比如，假设随机相亲了56个人，这56个人是什么星座相互独立，求这56个人集齐了12星座的概率。。
	//这里用到了间接法，即计算只集齐了11，10，9，...,2,1个星座的概率，那么集齐了12星座的概率是1-sum
	public double getNegativeSum(int n, int m){
		double result = 0;
		for(int i = 1; i < m; i++){
			result = result + ( getCombinationSum(m,i) * getPowerValue(i,n) );
		}
		return result / getPowerValue(m,n);
	}
	
	public static void main(String[] args){
		TestCalculator tc = new TestCalculator();
		System.out.println(1 - tc.getNegativeSum(56,12));
	}
	
	

}
