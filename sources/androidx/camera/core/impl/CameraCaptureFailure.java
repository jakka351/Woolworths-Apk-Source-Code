package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public class CameraCaptureFailure {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Reason {
        public static final Reason d;
        public static final /* synthetic */ Reason[] e;

        static {
            Reason reason = new Reason("ERROR", 0);
            d = reason;
            e = new Reason[]{reason};
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) e.clone();
        }
    }
}
