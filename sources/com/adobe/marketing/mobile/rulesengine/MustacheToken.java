package com.adobe.marketing.mobile.rulesengine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
class MustacheToken {

    /* renamed from: a, reason: collision with root package name */
    public final Type f13215a;
    public final String b;
    public final String c;
    public final MustacheToken d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        public static final Type d;
        public static final Type e;
        public static final /* synthetic */ Type[] f;

        static {
            Type type = new Type("FUNCTION", 0);
            d = type;
            Type type2 = new Type("VARIABLE", 1);
            e = type2;
            f = new Type[]{type, type2};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f.clone();
        }
    }

    public MustacheToken(String str) {
        Matcher matcher = Pattern.compile("\\(([^)]+)\\)").matcher(str);
        this.b = str;
        if (!matcher.find()) {
            this.f13215a = Type.e;
            return;
        }
        this.d = new MustacheToken(matcher.group(1));
        this.c = str.substring(0, matcher.start());
        this.f13215a = Type.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder r13, com.adobe.marketing.mobile.rulesengine.Transformer r14) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.rulesengine.MustacheToken.a(com.adobe.marketing.mobile.launch.rulesengine.LaunchTokenFinder, com.adobe.marketing.mobile.rulesengine.Transformer):java.lang.Object");
    }
}
