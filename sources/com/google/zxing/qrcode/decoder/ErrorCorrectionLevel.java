package com.google.zxing.qrcode.decoder;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, still in use, count: 1, list:
  (r1v1 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel) from 0x0028: FILLED_NEW_ARRAY 
  (r1v1 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel)
  (r0v0 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel)
  (r3v2 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel)
  (r2v1 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel)
 A[WRAPPED] elemType: com.google.zxing.qrcode.decoder.ErrorCorrectionLevel
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class ErrorCorrectionLevel {
    L(1),
    /* JADX INFO: Fake field, exist only in values array */
    M(0),
    /* JADX INFO: Fake field, exist only in values array */
    Q(3),
    /* JADX INFO: Fake field, exist only in values array */
    H(2);

    public static final ErrorCorrectionLevel[] f;
    public final int d;

    static {
        ErrorCorrectionLevel errorCorrectionLevel = L;
        f = new ErrorCorrectionLevel[]{errorCorrectionLevel, errorCorrectionLevel, errorCorrectionLevel, errorCorrectionLevel};
    }

    public ErrorCorrectionLevel(int i) {
        this.d = i;
    }

    public static ErrorCorrectionLevel valueOf(String str) {
        return (ErrorCorrectionLevel) Enum.valueOf(ErrorCorrectionLevel.class, str);
    }

    public static ErrorCorrectionLevel[] values() {
        return (ErrorCorrectionLevel[]) g.clone();
    }
}
