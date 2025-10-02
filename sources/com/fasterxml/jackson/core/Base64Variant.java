package com.fasterxml.jackson.core;

import YU.a;
import androidx.camera.core.impl.b;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Base64Variant implements Serializable {
    public final transient int[] d;
    public final transient char[] e;
    public final transient byte[] f;
    public final String g;
    public final char h;
    public final int i;
    public final boolean j;
    public final PaddingReadBehaviour k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PaddingReadBehaviour {
        public static final PaddingReadBehaviour d;
        public static final PaddingReadBehaviour e;
        public static final /* synthetic */ PaddingReadBehaviour[] f;

        static {
            PaddingReadBehaviour paddingReadBehaviour = new PaddingReadBehaviour("PADDING_FORBIDDEN", 0);
            d = paddingReadBehaviour;
            PaddingReadBehaviour paddingReadBehaviour2 = new PaddingReadBehaviour("PADDING_REQUIRED", 1);
            e = paddingReadBehaviour2;
            f = new PaddingReadBehaviour[]{paddingReadBehaviour, paddingReadBehaviour2, new PaddingReadBehaviour("PADDING_ALLOWED", 2)};
        }

        public static PaddingReadBehaviour valueOf(String str) {
            return (PaddingReadBehaviour) Enum.valueOf(PaddingReadBehaviour.class, str);
        }

        public static PaddingReadBehaviour[] values() {
            return (PaddingReadBehaviour[]) f.clone();
        }
    }

    public Base64Variant(String str, String str2, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this.d = iArr;
        char[] cArr = new char[64];
        this.e = cArr;
        this.f = new byte[64];
        this.g = str;
        this.j = z;
        this.h = c;
        this.i = i;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException(a.e(length, "Base64Alphabet length must be exactly 64 (was ", ")"));
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = this.e[i2];
            this.f[i2] = (byte) c2;
            this.d[c2] = i2;
        }
        if (z) {
            this.d[c] = -2;
        }
        this.k = z ? PaddingReadBehaviour.e : PaddingReadBehaviour.d;
    }

    public final void a(String str, int i, char c) {
        String strO;
        if (c <= ' ') {
            strO = "Illegal white space character (code 0x" + Integer.toHexString(c) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units";
        } else {
            char c2 = this.h;
            if (c == c2) {
                strO = "Unexpected padding character ('" + c2 + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
            } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
                strO = "Illegal character (code 0x" + Integer.toHexString(c) + ") in base64 content";
            } else {
                strO = "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
            }
        }
        if (str != null) {
            strO = b.o(strO, ": ", str);
        }
        throw new IllegalArgumentException(strO);
    }

    public final void b(String str, ByteArrayBuilder byteArrayBuilder) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt > ' ') {
                int iC = c(cCharAt);
                if (iC < 0) {
                    a(null, 0, cCharAt);
                    throw null;
                }
                if (i2 >= length) {
                    throw new IllegalArgumentException(j());
                }
                int i3 = i + 2;
                char cCharAt2 = str.charAt(i2);
                int iC2 = c(cCharAt2);
                if (iC2 < 0) {
                    a(null, 1, cCharAt2);
                    throw null;
                }
                int i4 = (iC << 6) | iC2;
                PaddingReadBehaviour paddingReadBehaviour = PaddingReadBehaviour.e;
                PaddingReadBehaviour paddingReadBehaviour2 = this.k;
                if (i3 >= length) {
                    if (paddingReadBehaviour2 == paddingReadBehaviour) {
                        throw new IllegalArgumentException(j());
                    }
                    byteArrayBuilder.b(i4 >> 4);
                    return;
                }
                int i5 = i + 3;
                char cCharAt3 = str.charAt(i3);
                int iC3 = c(cCharAt3);
                String str2 = this.g;
                PaddingReadBehaviour paddingReadBehaviour3 = PaddingReadBehaviour.d;
                if (iC3 >= 0) {
                    int i6 = (i4 << 6) | iC3;
                    if (i5 >= length) {
                        if (paddingReadBehaviour2 == paddingReadBehaviour) {
                            throw new IllegalArgumentException(j());
                        }
                        byteArrayBuilder.d(i6 >> 2);
                        return;
                    }
                    i += 4;
                    char cCharAt4 = str.charAt(i5);
                    int iC4 = c(cCharAt4);
                    if (iC4 >= 0) {
                        byteArrayBuilder.c((i6 << 6) | iC4);
                    } else {
                        if (iC4 != -2) {
                            a(null, 3, cCharAt4);
                            throw null;
                        }
                        if (paddingReadBehaviour2 == paddingReadBehaviour3) {
                            throw new IllegalArgumentException(a.h("Unexpected end of base64-encoded String: base64 variant '", str2, "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                        }
                        byteArrayBuilder.d(i6 >> 2);
                    }
                } else {
                    if (iC3 != -2) {
                        a(null, 2, cCharAt3);
                        throw null;
                    }
                    if (paddingReadBehaviour2 == paddingReadBehaviour3) {
                        throw new IllegalArgumentException(a.h("Unexpected end of base64-encoded String: base64 variant '", str2, "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                    }
                    if (i5 >= length) {
                        throw new IllegalArgumentException(j());
                    }
                    i += 4;
                    char cCharAt5 = str.charAt(i5);
                    char c = this.h;
                    if (cCharAt5 != c) {
                        a("expected padding character '" + c + "'", 3, cCharAt5);
                        throw null;
                    }
                    byteArrayBuilder.b(i4 >> 4);
                }
            } else {
                i = i2;
            }
        }
    }

    public final int c(char c) {
        if (c <= 127) {
            return this.d[c];
        }
        return -1;
    }

    public final int d(int i) {
        if (i <= 127) {
            return this.d[i];
        }
        return -1;
    }

    public final String e(byte[] bArr) {
        char[] cArr;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        int i = this.i >> 2;
        int i2 = length - 3;
        int i3 = 0;
        loop0: while (true) {
            int i4 = i;
            do {
                cArr = this.e;
                if (i3 > i2) {
                    break loop0;
                }
                int i5 = i3 + 2;
                int i6 = ((bArr[i3 + 1] & 255) | (bArr[i3] << 8)) << 8;
                i3 += 3;
                int i7 = i6 | (bArr[i5] & 255);
                sb.append(cArr[(i7 >> 18) & 63]);
                sb.append(cArr[(i7 >> 12) & 63]);
                sb.append(cArr[(i7 >> 6) & 63]);
                sb.append(cArr[i7 & 63]);
                i4--;
            } while (i4 > 0);
            sb.append("\\n");
        }
        int i8 = length - i3;
        if (i8 > 0) {
            int i9 = i3 + 1;
            int i10 = bArr[i3] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & 255) << 8;
            }
            sb.append(cArr[(i10 >> 18) & 63]);
            sb.append(cArr[(i10 >> 12) & 63]);
            if (this.j) {
                char c = this.h;
                sb.append(i8 == 2 ? cArr[(i10 >> 6) & 63] : c);
                sb.append(c);
            } else if (i8 == 2) {
                sb.append(cArr[(i10 >> 6) & 63]);
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != Base64Variant.class) {
            return false;
        }
        Base64Variant base64Variant = (Base64Variant) obj;
        return base64Variant.h == this.h && base64Variant.i == this.i && base64Variant.j == this.j && base64Variant.k == this.k && this.g.equals(base64Variant.g);
    }

    public final int f(int i, int i2, byte[] bArr) {
        byte[] bArr2 = this.f;
        bArr[i2] = bArr2[(i >> 18) & 63];
        bArr[i2 + 1] = bArr2[(i >> 12) & 63];
        int i3 = i2 + 3;
        bArr[i2 + 2] = bArr2[(i >> 6) & 63];
        int i4 = i2 + 4;
        bArr[i3] = bArr2[i & 63];
        return i4;
    }

    public final int g(char[] cArr, int i, int i2) {
        char[] cArr2 = this.e;
        cArr[i2] = cArr2[(i >> 18) & 63];
        cArr[i2 + 1] = cArr2[(i >> 12) & 63];
        int i3 = i2 + 3;
        cArr[i2 + 2] = cArr2[(i >> 6) & 63];
        int i4 = i2 + 4;
        cArr[i3] = cArr2[i & 63];
        return i4;
    }

    public final int h(int i, int i2, int i3, char[] cArr) {
        char[] cArr2 = this.e;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        cArr[i3 + 1] = cArr2[(i >> 12) & 63];
        if (!this.j) {
            if (i2 != 2) {
                return i4;
            }
            int i5 = i3 + 3;
            cArr[i4] = cArr2[(i >> 6) & 63];
            return i5;
        }
        int i6 = i3 + 3;
        char c = this.h;
        cArr[i4] = i2 == 2 ? cArr2[(i >> 6) & 63] : c;
        int i7 = i3 + 4;
        cArr[i6] = c;
        return i7;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final int i(int i, int i2, byte[] bArr, int i3) {
        byte[] bArr2 = this.f;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 2;
        bArr[i3 + 1] = bArr2[(i >> 12) & 63];
        if (!this.j) {
            if (i2 != 2) {
                return i4;
            }
            int i5 = i3 + 3;
            bArr[i4] = bArr2[(i >> 6) & 63];
            return i5;
        }
        byte b = (byte) this.h;
        int i6 = i3 + 3;
        bArr[i4] = i2 == 2 ? bArr2[(i >> 6) & 63] : b;
        int i7 = i3 + 4;
        bArr[i6] = b;
        return i7;
    }

    public final String j() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", this.g, Character.valueOf(this.h));
    }

    public Object readResolve() {
        Base64Variant base64Variant = Base64Variants.f14190a;
        String str = base64Variant.g;
        String str2 = this.g;
        if (!str.equals(str2)) {
            base64Variant = Base64Variants.b;
            if (!base64Variant.g.equals(str2)) {
                base64Variant = Base64Variants.c;
                if (!base64Variant.g.equals(str2)) {
                    base64Variant = Base64Variants.d;
                    if (!base64Variant.g.equals(str2)) {
                        throw new IllegalArgumentException(a.A("No Base64Variant with name ", str2 == null ? "<null>" : a.h("'", str2, "'")));
                    }
                }
            }
        }
        Base64Variant base64Variant2 = base64Variant;
        boolean z = base64Variant2.j;
        boolean z2 = this.j;
        if (z2 == z && this.h == base64Variant2.h && this.k == base64Variant2.k && this.i == base64Variant2.i && z2 == z) {
            return base64Variant2;
        }
        return new Base64Variant(base64Variant2, this.g, z2, this.h, this.k, this.i);
    }

    public final String toString() {
        return this.g;
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, PaddingReadBehaviour paddingReadBehaviour, int i) {
        int[] iArr = new int[128];
        this.d = iArr;
        char[] cArr = new char[64];
        this.e = cArr;
        byte[] bArr = new byte[64];
        this.f = bArr;
        this.g = str;
        byte[] bArr2 = base64Variant.f;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant.e;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant.d;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.j = z;
        this.h = c;
        this.i = i;
        this.k = paddingReadBehaviour;
    }
}
