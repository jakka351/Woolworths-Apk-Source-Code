package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLParser {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TYPE {
        public static final /* synthetic */ TYPE[] d = {new TYPE("UNKNOWN", 0), new TYPE("OBJECT", 1), new TYPE("ARRAY", 2), new TYPE("NUMBER", 3), new TYPE("STRING", 4), new TYPE("KEY", 5), new TYPE("TOKEN", 6)};

        /* JADX INFO: Fake field, exist only in values array */
        TYPE EF5;

        public static TYPE valueOf(String str) {
            return (TYPE) Enum.valueOf(TYPE.class, str);
        }

        public static TYPE[] values() {
            return (TYPE[]) d.clone();
        }
    }
}
