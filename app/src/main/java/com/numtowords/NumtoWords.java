package com.numtowords;

public class NumtoWords {
        private int number;
        private String word;
        private String[] names={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
                "Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        private String[] tensname={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        public NumtoWords(int num) {
            this.number = num;
        }

        public String Words(){
            if (number<20){
                word=(names[number]);
            }
            else if ((number/10)<10){
                int first,second;
                first= number/10;
                second= number%10;

                word=(tensname[first]+names[second]);

            }
            else if ((number/10)>10){
                int first,second,third;
                String hundreds,tens,ones;
                first=number/100;
                number = number%100;
                second=number/10;
                third=number%10;

                hundreds= names[first]+" Hundred and ";
                tens= tensname[second];
                ones= names[third];
                word=(hundreds+tens+ones);
            }
            return word;
        }
}
