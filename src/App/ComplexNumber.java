package App;

public final class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getRe() {

        return real;
    }

    public double getIm() {

        return imaginary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ComplexNumber) {
            ComplexNumber number = (ComplexNumber) object;
            if (this.imaginary == number.imaginary && this.real == number.real) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode;
        hashCode = (int) (this.imaginary * this.real) * prime;
        return hashCode;
    }
}
