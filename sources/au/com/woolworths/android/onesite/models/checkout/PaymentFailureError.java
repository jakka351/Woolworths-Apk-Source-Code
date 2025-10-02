package au.com.woolworths.android.onesite.models.checkout;

/* loaded from: classes3.dex */
public class PaymentFailureError extends Throwable {
    public static final int TYPE_GENERAL = 1;
    public static final int TYPE_TIMEOUT = 2;
    private String mErrorMessage;
    private int mErrorType;

    public PaymentFailureError(String str) {
        this(str, 1);
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public int getErrorType() {
        return this.mErrorType;
    }

    public boolean isTimeout() {
        return this.mErrorType == 2;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getSimpleName() + " : " + this.mErrorMessage;
    }

    public PaymentFailureError(String str, int i) {
        this.mErrorMessage = str;
        this.mErrorType = i;
    }
}
