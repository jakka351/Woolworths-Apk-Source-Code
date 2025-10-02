package okio;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* renamed from: okio.-Base64, reason: invalid class name */
/* loaded from: classes8.dex */
public final class Base64 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f26779a;
    public static final byte[] b;

    static {
        ByteString byteString = ByteString.g;
        f26779a = ByteString.Companion.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").data;
        b = ByteString.Companion.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").data;
    }

    public static final byte[] a(String str) {
        int i;
        char cCharAt;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt2 = str.charAt(i6);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                bArr[i5] = (byte) (i4 >> 16);
                int i7 = i5 + 2;
                bArr[i5 + 1] = (byte) (i4 >> 8);
                i5 += 3;
                bArr[i7] = (byte) i4;
            }
        }
        int i8 = i3 % 4;
        if (i8 == 1) {
            return null;
        }
        if (i8 == 2) {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        } else if (i8 == 3) {
            int i9 = i4 << 6;
            int i10 = i5 + 1;
            bArr[i5] = (byte) (i9 >> 16);
            i5 += 2;
            bArr[i10] = (byte) (i9 >> 8);
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
        Intrinsics.g(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public static final String b(byte[] bArr, byte[] map) {
        Intrinsics.h(bArr, "<this>");
        Intrinsics.h(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = bArr[i];
            int i3 = i + 2;
            byte b3 = bArr[i + 1];
            i += 3;
            byte b4 = bArr[i3];
            bArr2[i2] = map[(b2 & 255) >> 2];
            bArr2[i2 + 1] = map[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = map[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = map[b4 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i];
            bArr2[i2] = map[(b5 & 255) >> 2];
            bArr2[i2 + 1] = map[(b5 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i5];
            bArr2[i2] = map[(b6 & 255) >> 2];
            bArr2[i2 + 1] = map[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr2[i2 + 2] = map[(b7 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        return new String(bArr2, Charsets.f24671a);
    }

    public static final byte[] d() {
        return b;
    }
}
