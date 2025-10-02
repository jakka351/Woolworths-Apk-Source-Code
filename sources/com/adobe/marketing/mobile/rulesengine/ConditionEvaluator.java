package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes.dex */
public class ConditionEvaluator implements Evaluating {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Option {
        public static final /* synthetic */ Option[] d = {new Option("DEFAULT", 0), new Option("CASE_INSENSITIVE", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Option EF5;

        public static Option valueOf(String str) {
            return (Option) Enum.valueOf(Option.class, str);
        }

        public static Option[] values() {
            return (Option[]) d.clone();
        }
    }

    public static Double c(Object obj) {
        try {
            return Double.valueOf(obj.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean a(Object obj, Object obj2) {
        return ((obj instanceof String) && (obj2 instanceof String)) ? obj.toString().equalsIgnoreCase(obj2.toString()) : obj.equals(obj2);
    }

    public final boolean b(Object obj, Object obj2) {
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        return obj.toString().toLowerCase().contains(obj2.toString().toLowerCase());
    }
}
