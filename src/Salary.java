

//Problem statement
/* Implement a java program to calculate gross salary &
        net salary taking the following data.
        Input: empno, empname, basic
        Process:
        DA=70% of basic
        HRA=30% of basic
        CCA=Rs240/-
        PF=10% of basic
        PT= Rs100/-
*/

public class Salary {
    public static void main(String[] args)
    {
        float basic = 25000,DA,CCA=240,HRA,PF,PT = 100,gross,net;

        DA = (0.7f * basic);
        HRA = (0.3f * basic);
        PF = (0.10f * basic);
        gross = DA + HRA + CCA + basic;
        net = gross - PF - PT;

        System.out.println("Gross = "+ gross);
        System.out.println("net = "+ net);
    }
}
