public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other){
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other){
        return new Complex(this.real-other.real, this.imaginary-other.imaginary);
    }

    public Complex multiply(Complex other){
        double realReturnValue = this.real * other.real - (this.imaginary * other.imaginary);
        double imaginaryReturnValue = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realReturnValue, imaginaryReturnValue);
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }
}
