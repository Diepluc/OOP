import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    /**
     * null.
     */
    public void nullPointerEx() throws NullPointerException {
        throw new NullPointerException("Lỗi Null Pointer");
    }

    /**
     * null poiter.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * ar.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Lỗi Array Index Out of Bounds");
    }

    /**
     * array.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * null.
     */
    public void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException("Lỗi Arithmetic");
    }

    /**
     * ar.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * te.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException("Lỗi File Not Found");
    }

    /**
     * arr.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }

    /**
     * io.
     */
    public void ioEx() throws IOException {
        throw new IOException("Lỗi IO");
    }

    /**
     * io.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return e.getMessage();
        }
        return "Không có lỗi";
    }
}
