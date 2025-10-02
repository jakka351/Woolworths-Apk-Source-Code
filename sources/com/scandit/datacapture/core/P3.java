package com.scandit.datacapture.core;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class P3 {

    /* renamed from: a, reason: collision with root package name */
    boolean f18357a;
    EnumC0994e4 b;
    EnumC0994e4 c;

    public final S1 a() {
        EnumC0994e4 enumC0994e4 = this.b;
        C0976c4 c0976c4 = EnumC0994e4.f18489a;
        if (enumC0994e4 == null) {
            enumC0994e4 = c0976c4;
        }
        S1 s1A = enumC0994e4.a();
        if (s1A != null) {
            return s1A;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public final ConcurrentMap b() {
        return !this.f18357a ? new ConcurrentHashMap(16, 0.75f, 4) : ConcurrentMapC1165x4.a(this);
    }

    public final P3 c() {
        C0985d4 c0985d4 = EnumC0994e4.b;
        EnumC0994e4 enumC0994e4 = this.b;
        T4.a(enumC0994e4 == null, "Key strength was already set to %s", enumC0994e4);
        this.b = c0985d4;
        this.f18357a = true;
        return this;
    }

    public final P3 d() {
        C0985d4 c0985d4 = EnumC0994e4.b;
        EnumC0994e4 enumC0994e4 = this.c;
        T4.a(enumC0994e4 == null, "Value strength was already set to %s", enumC0994e4);
        this.c = c0985d4;
        this.f18357a = true;
        return this;
    }

    public final String toString() {
        int i = 0;
        C1183z4 c1183z4 = new C1183z4("P3", 0);
        EnumC0994e4 enumC0994e4 = this.b;
        if (enumC0994e4 != null) {
            String string = enumC0994e4.toString();
            int length = string.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                char cCharAt = string.charAt(i2);
                if (cCharAt < 'A' || cCharAt > 'Z') {
                    i2++;
                } else {
                    char[] charArray = string.toCharArray();
                    while (i2 < length) {
                        char c = charArray[i2];
                        if (c >= 'A' && c <= 'Z') {
                            charArray[i2] = (char) (c ^ ' ');
                        }
                        i2++;
                    }
                    string = String.valueOf(charArray);
                }
            }
            c1183z4.a("keyStrength", string);
        }
        EnumC0994e4 enumC0994e42 = this.c;
        if (enumC0994e42 != null) {
            String string2 = enumC0994e42.toString();
            int length2 = string2.length();
            while (true) {
                if (i >= length2) {
                    break;
                }
                char cCharAt2 = string2.charAt(i);
                if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                    i++;
                } else {
                    char[] charArray2 = string2.toCharArray();
                    while (i < length2) {
                        char c2 = charArray2[i];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            charArray2[i] = (char) (c2 ^ ' ');
                        }
                        i++;
                    }
                    string2 = String.valueOf(charArray2);
                }
            }
            c1183z4.a("valueStrength", string2);
        }
        return c1183z4.toString();
    }
}
