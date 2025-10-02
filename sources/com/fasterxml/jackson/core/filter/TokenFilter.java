package com.fasterxml.jackson.core.filter;

/* loaded from: classes4.dex */
public class TokenFilter {

    /* renamed from: a, reason: collision with root package name */
    public static final TokenFilter f14194a = new TokenFilter();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Inclusion {
        public static final Inclusion d;
        public static final Inclusion e;
        public static final Inclusion f;
        public static final /* synthetic */ Inclusion[] g;

        static {
            Inclusion inclusion = new Inclusion("ONLY_INCLUDE_ALL", 0);
            d = inclusion;
            Inclusion inclusion2 = new Inclusion("INCLUDE_ALL_AND_PATH", 1);
            e = inclusion2;
            Inclusion inclusion3 = new Inclusion("INCLUDE_NON_NULL", 2);
            f = inclusion3;
            g = new Inclusion[]{inclusion, inclusion2, inclusion3};
        }

        public static Inclusion valueOf(String str) {
            return (Inclusion) Enum.valueOf(Inclusion.class, str);
        }

        public static Inclusion[] values() {
            return (Inclusion[]) g.clone();
        }
    }

    public boolean a() {
        return true;
    }

    public TokenFilter b() {
        return this;
    }

    public TokenFilter c() {
        return this;
    }

    public TokenFilter d(int i) {
        return this;
    }

    public TokenFilter e(String str) {
        return this;
    }

    public String toString() {
        return this == f14194a ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }
}
