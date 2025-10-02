package com.adobe.marketing.mobile.launch.rulesengine.download;

/* loaded from: classes.dex */
public class RulesLoadResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f13202a;
    public final Reason b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Reason {
        public static final Reason d;
        public static final Reason e;
        public static final Reason f;
        public static final Reason g;
        public static final Reason h;
        public static final Reason i;
        public static final Reason j;
        public static final /* synthetic */ Reason[] k;

        static {
            Reason reason = new Reason("INVALID_SOURCE", 0);
            d = reason;
            Reason reason2 = new Reason("ZIP_EXTRACTION_FAILED", 1);
            e = reason2;
            Reason reason3 = new Reason("CANNOT_CREATE_TEMP_DIR", 2);
            f = reason3;
            Reason reason4 = new Reason("CANNOT_STORE_IN_TEMP_DIR", 3);
            g = reason4;
            Reason reason5 = new Reason("NOT_MODIFIED", 4);
            h = reason5;
            Reason reason6 = new Reason("NO_DATA", 5);
            i = reason6;
            Reason reason7 = new Reason("SUCCESS", 6);
            j = reason7;
            k = new Reason[]{reason, reason2, reason3, reason4, reason5, reason6, reason7};
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) k.clone();
        }
    }

    public RulesLoadResult(String str, Reason reason) {
        this.f13202a = str;
        this.b = reason;
    }
}
