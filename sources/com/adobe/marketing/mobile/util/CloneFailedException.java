package com.adobe.marketing.mobile.util;

/* loaded from: classes.dex */
public class CloneFailedException extends Exception {
    public final Reason d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Reason {
        public static final Reason d;
        public static final Reason e;
        public static final /* synthetic */ Reason[] f;

        static {
            Reason reason = new Reason("MAX_DEPTH_REACHED", 0);
            d = reason;
            Reason reason2 = new Reason("UNSUPPORTED_TYPE", 1);
            e = reason2;
            f = new Reason[]{reason, reason2, new Reason("UNKNOWN", 2)};
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) f.clone();
        }
    }

    public CloneFailedException(Reason reason) {
        super(reason.toString());
        this.d = reason;
    }
}
