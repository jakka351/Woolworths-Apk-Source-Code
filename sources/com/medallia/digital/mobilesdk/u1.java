package com.medallia.digital.mobilesdk;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class u1 {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16721a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.sdkInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.updateConfiguration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.backToForeground.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.customParameters.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[b.evaluationTimerFG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[b.enableIntercept.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[b.evaluationTimerBG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[b.declineInvitation.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ValueType.values().length];
            f16721a = iArr2;
            try {
                iArr2[ValueType.TypeInteger.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16721a[ValueType.TypeLong.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16721a[ValueType.TypeString.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16721a[ValueType.TypeDouble.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16721a[ValueType.TypeBoolean.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        sdkInit,
        updateConfiguration,
        enableIntercept,
        backToForeground,
        customParameters,
        evaluationTimerFG,
        evaluationTimerBG,
        declineInvitation
    }

    /* loaded from: classes6.dex */
    public enum c {
        TRIGGER_RULES,
        NEXT_EVALUATION;

        public static c a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            if (upperCase.equals("TRIGGER_RULES")) {
                return TRIGGER_RULES;
            }
            if (upperCase.equals("NEXT_EVALUATION")) {
                return NEXT_EVALUATION;
            }
            return null;
        }
    }

    public enum d {
        FOREGROUND,
        BACKGROUND;

        public static d a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            if (upperCase.equals("FOREGROUND")) {
                return FOREGROUND;
            }
            if (upperCase.equals("BACKGROUND")) {
                return BACKGROUND;
            }
            return null;
        }
    }

    public enum e {
        GREATER_THAN,
        SMALLER_THAN,
        EQUALS,
        DOES_NOT_EQUAL,
        MATCH,
        CONTAINS,
        HAS_VALUE,
        ENDS_WITH,
        STARTS_WITH,
        DOES_NOT_CONTAIN,
        DIFF;

        public static e a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.replaceAll("([a-z])([A-Z]+)", "$1_$2").toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
            }
            return null;
        }
    }

    public enum f {
        OR,
        AND,
        MIN,
        MAX;

        public static f a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
            }
            return null;
        }
    }

    public enum g {
        MULT,
        ADD,
        SUBSTRACT,
        DIVIDE,
        LOWER_CASE,
        UPPER_CASE,
        ABS;

        public static g a(String str) {
            str.getClass();
            switch (str) {
                case "UPPER_CASE":
                    return UPPER_CASE;
                case "SUBSTRACT":
                    return SUBSTRACT;
                case "ABS":
                    return ABS;
                case "ADD":
                    return ADD;
                case "MULT":
                    return MULT;
                case "LOWER_CASE":
                    return LOWER_CASE;
                case "DIVIDE":
                    return DIVIDE;
                default:
                    return null;
            }
        }
    }

    public enum h {
        TIME_NOW;

        public static h a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            if (upperCase.equals("TIME_NOW")) {
                return TIME_NOW;
            }
            return null;
        }
    }

    public enum i {
        VALUE,
        TIMESTAMP;

        public static i a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            if (upperCase.equals("TIMESTAMP")) {
                return TIMESTAMP;
            }
            if (upperCase.equals("VALUE")) {
                return VALUE;
            }
            return null;
        }
    }

    public enum j {
        USER_JOURNEY,
        OS,
        CUSTOM_PARAM,
        OCQ_RULE;

        public static j a(String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
            }
            return null;
        }
    }

    public enum k {
        INTEGER,
        STRING,
        DOUBLE,
        BOOLEAN;

        public static k a(ValueType valueType) {
            if (valueType == null) {
                return null;
            }
            int i = a.f16721a[valueType.ordinal()];
            if (i == 1 || i == 2) {
                return INTEGER;
            }
            if (i == 3) {
                return STRING;
            }
            if (i == 4) {
                return DOUBLE;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public static k a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
            }
            return null;
        }
    }

    public static ArrayList<d> a(b bVar) {
        d dVar;
        ArrayList<d> arrayList = new ArrayList<>();
        switch (a.b[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                arrayList.add(d.BACKGROUND);
            case 5:
            case 6:
                dVar = d.FOREGROUND;
                arrayList.add(dVar);
                break;
            case 7:
            case 8:
                dVar = d.BACKGROUND;
                arrayList.add(dVar);
                break;
        }
        return arrayList;
    }
}
