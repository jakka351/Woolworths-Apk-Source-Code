package org.nibor.autolink.internal;

import org.nibor.autolink.LinkType;

/* loaded from: classes8.dex */
public class UrlScanner implements Scanner {
    @Override // org.nibor.autolink.internal.Scanner
    public final LinkSpanImpl a(CharSequence charSequence, int i, int i2) {
        int iA;
        int i3 = i + 3;
        if (i3 >= charSequence.length() || charSequence.charAt(i + 1) != '/' || charSequence.charAt(i + 2) != '/') {
            return null;
        }
        int i4 = -1;
        int i5 = -1;
        for (int i6 = i - 1; i6 >= i2; i6--) {
            char cCharAt = charSequence.charAt(i6);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt != '+' && cCharAt != '-' && cCharAt != '.') {
                        break;
                    }
                } else {
                    i5 = i6;
                }
            } else {
                i4 = i6;
            }
        }
        if (i4 > 0 && i4 - 1 == i5) {
            i4 = -1;
        }
        if (i4 == -1 || (iA = Scanners.a(i3, charSequence)) == -1) {
            return null;
        }
        return new LinkSpanImpl(LinkType.d, i4, iA + 1);
    }
}
