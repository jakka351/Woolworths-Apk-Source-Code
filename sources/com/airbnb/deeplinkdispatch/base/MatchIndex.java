package com.airbnb.deeplinkdispatch.base;

import com.airbnb.deeplinkdispatch.DeepLinkEntry;
import com.airbnb.deeplinkdispatch.MatchType;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class MatchIndex {
    public static final String b = String.valueOf((char) 30);
    public static final char[] c = {'{', '}'};
    public static final char[] d = {'(', ')'};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13300a;

    /* renamed from: com.airbnb.deeplinkdispatch.base.MatchIndex$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13301a;

        static {
            int[] iArr = new int[MatchType.values().length];
            f13301a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13301a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13301a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MatchIndex(byte[] bArr) {
        this.f13300a = bArr;
    }

    public static CompareResult a(byte[] bArr, int i, int i2, byte[] bArr2) {
        if (i2 != bArr2.length) {
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (bArr2[i3] != bArr[i + i3]) {
                return null;
            }
        }
        return new CompareResult("", false);
    }

    public static DeepLinkEntry d(int i, int i2, byte[] bArr) {
        MatchType matchType;
        if (i == 0) {
            return null;
        }
        int i3 = bArr[i2] & 255;
        MatchType[] matchTypeArrValues = MatchType.values();
        int length = matchTypeArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                matchType = null;
                break;
            }
            matchType = matchTypeArrValues[i4];
            if ((matchType.d & 255) == i3) {
                break;
            }
            i4++;
        }
        if (matchType == null) {
            throw new IllegalStateException(("Invalid flag value: " + i3).toString());
        }
        int iG = g(i2 + 1, bArr);
        int i5 = i2 + 3;
        String strE = e(i5, iG, bArr);
        int i6 = i5 + iG;
        int iG2 = g(i6, bArr);
        int i7 = i6 + 2;
        String strE2 = e(i7, iG2, bArr);
        int i8 = i7 + iG2;
        int i9 = bArr[i8] & 255;
        String strE3 = i9 > 0 ? e(i8 + 1, i9, bArr) : null;
        int iOrdinal = matchType.ordinal();
        if (iOrdinal == 0) {
            return new DeepLinkEntry.ActivityDeeplinkEntry(strE, strE2);
        }
        if (iOrdinal == 1) {
            return new DeepLinkEntry.MethodDeeplinkEntry(strE, strE2, strE3);
        }
        if (iOrdinal == 2) {
            return new DeepLinkEntry.HandlerDeepLinkEntry(strE, strE2);
        }
        throw new IllegalStateException("Unhandled match type: " + matchType);
    }

    public static String e(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        try {
            return new String(bArr2, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static int g(int i, byte[] bArr) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public final ArrayList b(int i, int i2) {
        int iG;
        int iG2;
        ArrayList arrayList = new ArrayList();
        do {
            int i3 = i + 3;
            byte[] bArr = this.f13300a;
            int iG3 = g(i3, bArr);
            if (iG3 > 0) {
                arrayList.add(d(iG3, g(i + 1, bArr) + i + 9, bArr));
            }
            if (c(i) == 0) {
                iG = -1;
            } else {
                iG = g(i3, bArr) + g(i + 1, bArr) + i + 9;
            }
            if (iG != -1) {
                if (c(i) == 0) {
                    iG2 = -1;
                } else {
                    iG2 = g(i3, bArr) + g(i + 1, bArr) + i + 9;
                }
                arrayList.addAll(b(iG2, c(i) + g(i3, bArr) + g(i + 1, bArr) + i + 9));
            }
            i = c(i) + g(i3, bArr) + g(i + 1, bArr) + i + 9;
            if (i == i2) {
                i = -1;
            }
        } while (i != -1);
        return arrayList;
    }

    public final int c(int i) {
        byte[] bArr = this.f13300a;
        return (bArr[i + 8] & 255) | ((bArr[i + 5] & 255) << 24) | ((bArr[i + 6] & 255) << 16) | ((bArr[i + 7] & 255) << 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x012a A[EDGE_INSN: B:138:0x012a->B:75:0x012a BREAK  A[LOOP:1: B:22:0x005e->B:76:0x012d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012a A[EDGE_INSN: B:135:0x012a->B:75:0x012a BREAK  A[LOOP:1: B:22:0x005e->B:76:0x012d], EDGE_INSN: B:137:0x012a->B:75:0x012a BREAK  A[LOOP:1: B:22:0x005e->B:76:0x012d], EDGE_INSN: B:138:0x012a->B:75:0x012a BREAK  A[LOOP:1: B:22:0x005e->B:76:0x012d], PHI: r19
  0x012a: PHI (r19v1 com.airbnb.deeplinkdispatch.DeepLinkMatchResult) = 
  (r19v0 com.airbnb.deeplinkdispatch.DeepLinkMatchResult)
  (r19v0 com.airbnb.deeplinkdispatch.DeepLinkMatchResult)
  (r19v3 com.airbnb.deeplinkdispatch.DeepLinkMatchResult)
  (r19v3 com.airbnb.deeplinkdispatch.DeepLinkMatchResult)
  (r19v3 com.airbnb.deeplinkdispatch.DeepLinkMatchResult)
  (r19v3 com.airbnb.deeplinkdispatch.DeepLinkMatchResult)
  (r19v4 com.airbnb.deeplinkdispatch.DeepLinkMatchResult)
 binds: [B:86:0x0170, B:92:0x0184, B:63:0x00f3, B:135:0x012a, B:137:0x012a, B:138:0x012a, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012d A[LOOP:1: B:22:0x005e->B:76:0x012d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.airbnb.deeplinkdispatch.DeepLinkMatchResult f(com.airbnb.deeplinkdispatch.DeepLinkUri r23, java.util.List r24, java.util.Map r25, int r26, int r27, int r28, java.util.Map r29) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.base.MatchIndex.f(com.airbnb.deeplinkdispatch.DeepLinkUri, java.util.List, java.util.Map, int, int, int, java.util.Map):com.airbnb.deeplinkdispatch.DeepLinkMatchResult");
    }
}
