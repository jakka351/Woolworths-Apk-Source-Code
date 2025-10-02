package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayDeque;
import java.util.Arrays;

@GwtCompatible
/* loaded from: classes6.dex */
final class TrieParser {

    /* renamed from: a, reason: collision with root package name */
    public static final Joiner f16114a = new Joiner("");

    public static int a(ArrayDeque arrayDeque, String str, int i, ImmutableMap.Builder builder) {
        int length = str.length();
        int i2 = i;
        char cCharAt = 0;
        while (i2 < length && (cCharAt = str.charAt(i2)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i2++;
        }
        arrayDeque.push(new StringBuilder(str.subSequence(i, i2)).reverse());
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strC = f16114a.c(arrayDeque);
            if (strC.length() > 0) {
                for (PublicSuffixType publicSuffixType : PublicSuffixType.values()) {
                    if (publicSuffixType.d == cCharAt || publicSuffixType.e == cCharAt) {
                        builder.c(strC, publicSuffixType);
                    }
                }
                throw new IllegalArgumentException("No enum corresponding to given code: " + cCharAt);
            }
        }
        int iA = i2 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iA < length) {
                iA += a(arrayDeque, str, iA, builder);
                if (str.charAt(iA) == '?' || str.charAt(iA) == ',') {
                    iA++;
                    break;
                }
            }
        }
        arrayDeque.pop();
        return iA - i;
    }

    public static void b(CharSequence... charSequenceArr) {
        Joiner joiner = f16114a;
        joiner.getClass();
        String strC = joiner.c(Arrays.asList(charSequenceArr));
        ImmutableMap.Builder builderA = ImmutableMap.a();
        int length = strC.length();
        for (int iA = 0; iA < length; iA += a(new ArrayDeque(), strC, iA, builderA)) {
        }
        builderA.a(true);
    }
}
