package au.com.woolworths.android.onesite.utils;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/utils/NumberAwareComparator;", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumberAwareComparator implements Comparator<String> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(String s1, String s2) {
        Intrinsics.h(s1, "s1");
        Intrinsics.h(s2, "s2");
        int length = s1.length();
        int length2 = s2.length();
        int i = 0;
        int i2 = 0;
        while (i != length) {
            if (i2 == length2) {
                return 1;
            }
            char upperCase = Character.toUpperCase(s1.charAt(i));
            char upperCase2 = Character.toUpperCase(s2.charAt(i2));
            if (Character.isDigit(upperCase) && Character.isDigit(upperCase2)) {
                while (i < length && s1.charAt(i) == '0') {
                    i++;
                }
                while (i2 < length2 && s2.charAt(i2) == '0') {
                    i2++;
                }
                int i3 = i;
                while (i3 < length && Character.isDigit(s1.charAt(i3))) {
                    i3++;
                }
                int i4 = i2;
                while (i4 < length2 && Character.isDigit(s2.charAt(i4))) {
                    i4++;
                }
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != i6) {
                    return i5 - i6;
                }
                while (i < i3) {
                    if (s1.charAt(i) != s2.charAt(i2)) {
                        return s1.charAt(i) - s2.charAt(i2);
                    }
                    i++;
                    i2++;
                }
            } else {
                if (upperCase != upperCase2) {
                    return upperCase - upperCase2;
                }
                i++;
                i2++;
            }
        }
        return i2 == length2 ? 0 : -1;
    }
}
