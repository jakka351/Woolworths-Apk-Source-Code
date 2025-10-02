package com.dynatrace.android.callback;

/* loaded from: classes4.dex */
final class CbConstants {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class WrMethod {
        public static final WrMethod d;
        public static final WrMethod e;
        public static final WrMethod f;
        public static final /* synthetic */ WrMethod[] g;

        static {
            WrMethod wrMethod = new WrMethod("getInputStream", 0);
            d = wrMethod;
            WrMethod wrMethod2 = new WrMethod("getOutputStream", 1);
            e = wrMethod2;
            WrMethod wrMethod3 = new WrMethod("getResponseCode", 2);
            f = wrMethod3;
            g = new WrMethod[]{wrMethod, wrMethod2, wrMethod3, new WrMethod("execute", 3), new WrMethod("enqueue", 4)};
        }

        public static WrMethod valueOf(String str) {
            return (WrMethod) Enum.valueOf(WrMethod.class, str);
        }

        public static WrMethod[] values() {
            return (WrMethod[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static final class WrStates {
        public static final WrStates d;
        public static final WrStates e;
        public static final WrStates f;
        public static final /* synthetic */ WrStates[] g;

        static {
            WrStates wrStates = new WrStates("PRE_EXEC", 0);
            d = wrStates;
            WrStates wrStates2 = new WrStates("POST_EXEC_OK", 1);
            e = wrStates2;
            WrStates wrStates3 = new WrStates("POST_EXEC_ERR", 2);
            f = wrStates3;
            g = new WrStates[]{wrStates, wrStates2, wrStates3, new WrStates("POST_EXEC_FINALIZE", 3)};
        }

        public static WrStates valueOf(String str) {
            return (WrStates) Enum.valueOf(WrStates.class, str);
        }

        public static WrStates[] values() {
            return (WrStates[]) g.clone();
        }
    }
}
