package org.nibor.autolink.internal;

import org.nibor.autolink.LinkType;

/* loaded from: classes8.dex */
public class WwwScanner implements Scanner {
    @Override // org.nibor.autolink.internal.Scanner
    public final LinkSpanImpl a(CharSequence charSequence, int i, int i2) {
        char cCharAt;
        int i3 = i + 4;
        if (i3 >= charSequence.length() || charSequence.charAt(i + 1) != 'w' || charSequence.charAt(i + 2) != 'w' || charSequence.charAt(i + 3) != '.') {
            return null;
        }
        if (i != i2 && ((cCharAt = charSequence.charAt(i - 1)) == '.' || ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= '0' && cCharAt <= '9'))))) {
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        int iA = Scanners.a(i3, charSequence);
        if (iA != -1) {
            int i4 = iA;
            while (true) {
                i4--;
                if (i4 <= i3) {
                    break;
                }
                if (charSequence.charAt(i4) == '.' && i4 > i3) {
                    break;
                }
            }
        } else {
            iA = -1;
        }
        if (iA == -1) {
            return null;
        }
        return new LinkSpanImpl(LinkType.f, i, iA + 1);
    }
}
