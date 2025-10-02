package androidx.core.os;

/* loaded from: classes2.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        super("The operation has been canceled.");
    }

    public OperationCanceledException(String str) {
        super(str.toString());
    }
}
