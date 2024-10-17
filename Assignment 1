class Complex {
    public double real;
    public double imaginary;

    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }


    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

  
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

 
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    
    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }


    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(realPart, imaginaryPart);
    }


    @Override
    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }


    public static void main(String[] args) {

        Complex c1 = new Complex(3, 2); 
        Complex c2 = new Complex(1, 7); 
   
        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);
        Complex quotient = c1.divide(c2);

        System.out.println("Sum: " +sum);
        System.out.println("Difference: " +difference);
        System.out.println("Product: " +product);
        System.out.println("Division: " +quotient);
    }
}
