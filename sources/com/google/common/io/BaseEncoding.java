package com.google.common.io;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes6.dex */
public abstract class BaseEncoding {

    /* renamed from: a, reason: collision with root package name */
    public static final BaseEncoding f14922a = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final BaseEncoding b;

    /* renamed from: com.google.common.io.BaseEncoding$1, reason: invalid class name */
    class AnonymousClass1 extends ByteSink {
    }

    /* renamed from: com.google.common.io.BaseEncoding$2, reason: invalid class name */
    class AnonymousClass2 extends ByteSource {
    }

    /* renamed from: com.google.common.io.BaseEncoding$3, reason: invalid class name */
    class AnonymousClass3 extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$4, reason: invalid class name */
    class AnonymousClass4 implements Appendable {
        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            throw null;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$5, reason: invalid class name */
    class AnonymousClass5 extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(int i) {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Alphabet {

        /* renamed from: a, reason: collision with root package name */
        public final String f14923a;
        public final char[] b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;
        public final boolean[] h;

        public Alphabet(String str, char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            int i = 0;
            while (true) {
                if (i >= cArr.length) {
                    this.f14923a = str;
                    this.b = cArr;
                    try {
                        int length = cArr.length;
                        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                        int iD = IntMath.d(length);
                        this.d = iD;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iD);
                        int i2 = 1 << (3 - iNumberOfTrailingZeros);
                        this.e = i2;
                        this.f = iD >> iNumberOfTrailingZeros;
                        this.c = cArr.length - 1;
                        this.g = bArr;
                        boolean[] zArr = new boolean[i2];
                        for (int i3 = 0; i3 < this.f; i3++) {
                            zArr[IntMath.c(i3 * 8, this.d, RoundingMode.CEILING)] = true;
                        }
                        this.h = zArr;
                        return;
                    } catch (ArithmeticException e) {
                        throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
                    }
                }
                char c = cArr[i];
                if (!(c < 128)) {
                    throw new IllegalArgumentException(Strings.b("Non-ASCII character: %s", Character.valueOf(c)));
                }
                if (!(bArr[c] == -1)) {
                    throw new IllegalArgumentException(Strings.b("Duplicate character: %s", Character.valueOf(c)));
                }
                bArr[c] = (byte) i;
                i++;
            }
        }

        public final int a(char c) throws DecodingException {
            if (c > 127) {
                throw new DecodingException(android.support.v4.media.session.a.k(c, new StringBuilder("Unrecognized character: 0x")));
            }
            byte b = this.g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new DecodingException(android.support.v4.media.session.a.k(c, new StringBuilder("Unrecognized character: 0x")));
            }
            throw new DecodingException("Unrecognized character: " + c);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Alphabet) && Arrays.equals(this.b, ((Alphabet) obj).b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + 1237;
        }

        public final String toString() {
            return this.f14923a;
        }
    }

    public static final class Base16Encoding extends StandardBaseEncoding {
        public final char[] e;

        public Base16Encoding(Alphabet alphabet) {
            super(alphabet, (Character) null);
            this.e = new char[512];
            char[] cArr = alphabet.b;
            Preconditions.g(cArr.length == 16);
            for (int i = 0; i < 256; i++) {
                char[] cArr2 = this.e;
                cArr2[i] = cArr[i >>> 4];
                cArr2[i | 256] = cArr[i & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException("Invalid input length " + charSequence.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                char cCharAt = charSequence.charAt(i);
                Alphabet alphabet = this.c;
                bArr[i2] = (byte) ((alphabet.a(cCharAt) << 4) | alphabet.a(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final void d(Appendable appendable, byte[] bArr, int i) throws IOException {
            Preconditions.m(0, i, bArr.length);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = bArr[i2] & 255;
                char[] cArr = this.e;
                appendable.append(cArr[i3]);
                appendable.append(cArr[i3 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public final BaseEncoding j(Alphabet alphabet) {
            return new Base16Encoding(alphabet);
        }
    }

    public static final class Base64Encoding extends StandardBaseEncoding {
        public Base64Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()), (Character) '=');
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            CharSequence charSequenceH = h(charSequence);
            int length = charSequenceH.length();
            Alphabet alphabet = this.c;
            if (!alphabet.h[length % alphabet.e]) {
                throw new DecodingException("Invalid input length " + charSequenceH.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceH.length()) {
                int i3 = i + 2;
                int iA = (alphabet.a(charSequenceH.charAt(i + 1)) << 12) | (alphabet.a(charSequenceH.charAt(i)) << 18);
                int i4 = i2 + 1;
                bArr[i2] = (byte) (iA >>> 16);
                if (i3 < charSequenceH.length()) {
                    int i5 = i + 3;
                    int iA2 = iA | (alphabet.a(charSequenceH.charAt(i3)) << 6);
                    int i6 = i2 + 2;
                    bArr[i4] = (byte) ((iA2 >>> 8) & 255);
                    if (i5 < charSequenceH.length()) {
                        i += 4;
                        i2 += 3;
                        bArr[i6] = (byte) ((iA2 | alphabet.a(charSequenceH.charAt(i5))) & 255);
                    } else {
                        i2 = i6;
                        i = i5;
                    }
                } else {
                    i2 = i4;
                    i = i3;
                }
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public final void d(Appendable appendable, byte[] bArr, int i) throws IOException {
            int i2 = 0;
            Preconditions.m(0, i, bArr.length);
            for (int i3 = i; i3 >= 3; i3 -= 3) {
                int i4 = i2 + 2;
                int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
                i2 += 3;
                int i6 = i5 | (bArr[i4] & 255);
                Alphabet alphabet = this.c;
                char[] cArr = alphabet.b;
                char[] cArr2 = alphabet.b;
                appendable.append(cArr[i6 >>> 18]);
                appendable.append(cArr2[(i6 >>> 12) & 63]);
                appendable.append(cArr2[(i6 >>> 6) & 63]);
                appendable.append(cArr2[i6 & 63]);
            }
            if (i2 < i) {
                i(appendable, bArr, i2, i - i2);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public final BaseEncoding j(Alphabet alphabet) {
            return new Base64Encoding(alphabet, (Character) null);
        }

        public Base64Encoding(Alphabet alphabet, Character ch) {
            super(alphabet, ch);
            Preconditions.g(alphabet.b.length == 64);
        }
    }

    public static final class DecodingException extends IOException {
    }

    public static final class SeparatedBaseEncoding extends BaseEncoding {
        @Override // com.google.common.io.BaseEncoding
        public final int b(byte[] bArr, CharSequence charSequence) {
            new StringBuilder(charSequence.length());
            if (charSequence.length() <= 0) {
                throw null;
            }
            charSequence.charAt(0);
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final void d(Appendable appendable, byte[] bArr, int i) {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final int e(int i) {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final int f(int i) {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final BaseEncoding g() {
            throw null;
        }

        @Override // com.google.common.io.BaseEncoding
        public final CharSequence h(CharSequence charSequence) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static class StandardBaseEncoding extends BaseEncoding {
        public final Alphabet c;
        public final Character d;

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$1, reason: invalid class name */
        class AnonymousClass1 extends OutputStream {
            public int d;

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                if (this.d <= 0) {
                    throw null;
                }
                throw null;
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                throw null;
            }

            @Override // java.io.OutputStream
            public final void write(int i) {
                this.d += 8;
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public StandardBaseEncoding(com.google.common.io.BaseEncoding.Alphabet r3, java.lang.Character r4) {
            /*
                r2 = this;
                r2.<init>()
                r3.getClass()
                r2.c = r3
                if (r4 == 0) goto L1a
                char r0 = r4.charValue()
                byte[] r3 = r3.g
                int r1 = r3.length
                if (r0 >= r1) goto L1a
                r3 = r3[r0]
                r0 = -1
                if (r3 == r0) goto L1a
                r3 = 0
                goto L1b
            L1a:
                r3 = 1
            L1b:
                java.lang.String r0 = "Padding character %s was already in alphabet"
                com.google.common.base.Preconditions.e(r0, r4, r3)
                r2.d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.StandardBaseEncoding.<init>(com.google.common.io.BaseEncoding$Alphabet, java.lang.Character):void");
        }

        @Override // com.google.common.io.BaseEncoding
        public int b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            CharSequence charSequenceH = h(charSequence);
            int length = charSequenceH.length();
            Alphabet alphabet = this.c;
            boolean[] zArr = alphabet.h;
            int i = alphabet.d;
            int i2 = alphabet.e;
            if (!zArr[length % i2]) {
                throw new DecodingException("Invalid input length " + charSequenceH.length());
            }
            int i3 = 0;
            for (int i4 = 0; i4 < charSequenceH.length(); i4 += i2) {
                long jA = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    jA <<= i;
                    if (i4 + i6 < charSequenceH.length()) {
                        jA |= alphabet.a(charSequenceH.charAt(i5 + i4));
                        i5++;
                    }
                }
                int i7 = alphabet.f;
                int i8 = (i7 * 8) - (i5 * i);
                int i9 = (i7 - 1) * 8;
                while (i9 >= i8) {
                    bArr[i3] = (byte) ((jA >>> i9) & 255);
                    i9 -= 8;
                    i3++;
                }
            }
            return i3;
        }

        @Override // com.google.common.io.BaseEncoding
        public void d(Appendable appendable, byte[] bArr, int i) throws IOException {
            int i2 = 0;
            Preconditions.m(0, i, bArr.length);
            while (i2 < i) {
                Alphabet alphabet = this.c;
                i(appendable, bArr, i2, Math.min(alphabet.f, i - i2));
                i2 += alphabet.f;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public final int e(int i) {
            return (int) (((this.c.d * i) + 7) / 8);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof StandardBaseEncoding) {
                StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
                if (this.c.equals(standardBaseEncoding.c) && Objects.equals(this.d, standardBaseEncoding.d)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.io.BaseEncoding
        public final int f(int i) {
            Alphabet alphabet = this.c;
            return IntMath.c(i, alphabet.f, RoundingMode.CEILING) * alphabet.e;
        }

        @Override // com.google.common.io.BaseEncoding
        public final BaseEncoding g() {
            return this.d == null ? this : j(this.c);
        }

        @Override // com.google.common.io.BaseEncoding
        public final CharSequence h(CharSequence charSequence) {
            charSequence.getClass();
            Character ch = this.d;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public final int hashCode() {
            return this.c.hashCode() ^ Objects.hashCode(this.d);
        }

        public final void i(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            Preconditions.m(i, i + i2, bArr.length);
            Alphabet alphabet = this.c;
            int i3 = alphabet.f;
            int i4 = alphabet.d;
            int i5 = 0;
            Preconditions.g(i2 <= i3);
            long j = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                j = (j | (bArr[i + i6] & 255)) << 8;
            }
            int i7 = ((i2 + 1) * 8) - i4;
            while (i5 < i2 * 8) {
                appendable.append(alphabet.b[((int) (j >>> (i7 - i5))) & alphabet.c]);
                i5 += i4;
            }
            Character ch = this.d;
            if (ch != null) {
                while (i5 < alphabet.f * 8) {
                    appendable.append(ch.charValue());
                    i5 += i4;
                }
            }
        }

        public BaseEncoding j(Alphabet alphabet) {
            return new StandardBaseEncoding(alphabet, (Character) null);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            Alphabet alphabet = this.c;
            sb.append(alphabet);
            if (8 % alphabet.d != 0) {
                Character ch = this.d;
                if (ch == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(ch);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$2, reason: invalid class name */
        class AnonymousClass2 extends InputStream {
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) {
                int i3 = i2 + i;
                Preconditions.m(i, i3, bArr.length);
                if (i >= i3) {
                    return 0;
                }
                throw null;
            }

            @Override // java.io.InputStream
            public final int read() {
                throw null;
            }
        }

        public StandardBaseEncoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()), (Character) '=');
        }
    }

    static {
        new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        b = new Base16Encoding(new Alphabet("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final byte[] a(String str) {
        try {
            CharSequence charSequenceH = h(str);
            int iE = e(charSequenceH.length());
            byte[] bArr = new byte[iE];
            int iB = b(bArr, charSequenceH);
            if (iB == iE) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public final String c(int i, byte[] bArr) {
        Preconditions.m(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(f(i));
        try {
            d(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public abstract void d(Appendable appendable, byte[] bArr, int i);

    public abstract int e(int i);

    public abstract int f(int i);

    public abstract BaseEncoding g();

    public CharSequence h(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence;
    }
}
