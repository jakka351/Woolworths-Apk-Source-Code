package com.google.crypto.tink.shaded.protobuf;

import androidx.compose.ui.input.pointer.a;
import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
abstract class BinaryWriter extends ByteOutput implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public int f15081a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.BinaryWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15082a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15082a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15082a[WireFormat.FieldType.l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15082a[WireFormat.FieldType.k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15082a[WireFormat.FieldType.j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15082a[WireFormat.FieldType.h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15082a[WireFormat.FieldType.t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15082a[WireFormat.FieldType.u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15082a[WireFormat.FieldType.v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15082a[WireFormat.FieldType.w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15082a[WireFormat.FieldType.n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15082a[WireFormat.FieldType.r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15082a[WireFormat.FieldType.i.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15082a[WireFormat.FieldType.g.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15082a[WireFormat.FieldType.f.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15082a[WireFormat.FieldType.p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15082a[WireFormat.FieldType.q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15082a[WireFormat.FieldType.s.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class SafeDirectWriter extends BinaryWriter {
        public int b;

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void C(int i, Object obj) {
            int iT = T();
            Protobuf.c.b(obj).h(obj, this);
            int iT2 = T() - iT;
            U(10);
            c0(iT2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void J(int i, int i2) {
            U(10);
            Z(i2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void L(int i, Object obj, Schema schema) {
            b0(i, 4);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void N(int i, Object obj, Schema schema) {
            int iT = T();
            schema.h(obj, this);
            int iT2 = T() - iT;
            U(10);
            c0(iT2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void P(int i, ByteString byteString) {
            try {
                byteString.B(this);
                U(10);
                c0(byteString.size());
                throw null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void Q(int i, int i2, byte[] bArr) {
            int i3 = this.b;
            if (i3 + 1 >= i2) {
                this.b = i3 - i2;
                throw null;
            }
            this.f15081a += i2;
            AllocatedBuffer.b(i, i2, bArr);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i = this.b;
            if (i + 1 >= iRemaining) {
                this.b = i - iRemaining;
                throw null;
            }
            this.f15081a += iRemaining;
            AllocatedBuffer.a(byteBuffer);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final int T() {
            return (0 - this.b) + this.f15081a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void U(int i) {
            if (this.b + 1 >= i) {
                return;
            }
            Math.max(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void V(boolean z) {
            this.b--;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void W(int i) {
            this.b -= 4;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void X(long j) {
            this.b -= 8;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void Y(int i) {
            if (i < 0) {
                d0(i);
            } else {
                c0(i);
                throw null;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void Z(int i) {
            c0(CodedOutputStream.d0(i));
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void a0(long j) {
            d0(CodedOutputStream.e0(j));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void b0(int i, int i2) {
            c0((i << 3) | i2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void c(int i, int i2) {
            U(9);
            W(i2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void c0(int i) {
            if ((i & (-128)) == 0) {
                this.b--;
                throw null;
            }
            if ((i & (-16384)) == 0) {
                g0(i);
                throw null;
            }
            if (((-2097152) & i) == 0) {
                f0(i);
                throw null;
            }
            if (((-268435456) & i) == 0) {
                e0(i);
                throw null;
            }
            this.b--;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void d(int i, String str) {
            int i2;
            int i3;
            int i4;
            int iT = T();
            U(str.length());
            int length = str.length();
            int i5 = length - 1;
            this.b -= i5;
            if (i5 >= 0 && str.charAt(i5) < 128) {
                throw null;
            }
            if (i5 != -1) {
                this.b += i5;
                while (i5 >= 0) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt < 128 && (i4 = this.b) >= 0) {
                        this.b = i4 - 1;
                        throw null;
                    }
                    if (cCharAt < 2048 && (i3 = this.b) > 0) {
                        this.b = i3 - 1;
                        throw null;
                    }
                    if ((cCharAt < 55296 || 57343 < cCharAt) && (i2 = this.b) > 1) {
                        this.b = i2 - 1;
                        throw null;
                    }
                    if (this.b > 2) {
                        if (i5 != 0) {
                            char cCharAt2 = str.charAt(length - 2);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt)) {
                                Character.toCodePoint(cCharAt2, cCharAt);
                                this.b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 2, i5);
                    }
                    U(i5);
                }
            } else {
                this.b--;
            }
            int iT2 = T() - iT;
            U(10);
            c0(iT2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void d0(long j) {
            switch (BinaryWriter.S(j)) {
                case 1:
                    this.b--;
                    throw null;
                case 2:
                    g0((int) j);
                    throw null;
                case 3:
                    f0((int) j);
                    throw null;
                case 4:
                    e0((int) j);
                    throw null;
                case 5:
                    this.b -= 5;
                    throw null;
                case 6:
                    this.b -= 6;
                    throw null;
                case 7:
                    this.b -= 7;
                    throw null;
                case 8:
                    this.b -= 8;
                    throw null;
                case 9:
                    this.b--;
                    throw null;
                case 10:
                    this.b--;
                    throw null;
                default:
                    return;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void e(int i, long j) {
            U(15);
            d0(j);
            b0(i, 0);
            throw null;
        }

        public final void e0(int i) {
            this.b -= 4;
            throw null;
        }

        public final void f0(int i) {
            this.b -= 3;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void g(int i, int i2) {
            U(15);
            Y(i2);
            b0(i, 0);
            throw null;
        }

        public final void g0(int i) {
            this.b -= 2;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void j(int i, long j) {
            U(15);
            a0(j);
            b0(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void k(int i, int i2) {
            U(10);
            c0(i2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void m(int i, long j) {
            U(13);
            X(j);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void n(int i, boolean z) {
            U(6);
            this.b--;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void p(int i) {
            b0(i, 3);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void r(int i) {
            b0(i, 4);
            throw null;
        }
    }

    public static final class SafeHeapWriter extends BinaryWriter {
        public int b;

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void C(int i, Object obj) {
            int iT = T();
            Protobuf.c.b(obj).h(obj, this);
            int iT2 = T() - iT;
            U(10);
            c0(iT2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void J(int i, int i2) {
            U(10);
            Z(i2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void L(int i, Object obj, Schema schema) {
            b0(i, 4);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void N(int i, Object obj, Schema schema) {
            int iT = T();
            schema.h(obj, this);
            int iT2 = T() - iT;
            U(10);
            c0(iT2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void P(int i, ByteString byteString) {
            try {
                byteString.B(this);
                U(10);
                c0(byteString.size());
                throw null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void Q(int i, int i2, byte[] bArr) {
            int i3 = this.b;
            if (i3 < i2) {
                this.f15081a += i2;
                AllocatedBuffer.b(i, i2, bArr);
                throw null;
            }
            int i4 = i3 - i2;
            this.b = i4;
            System.arraycopy(bArr, i, null, i4 + 1, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i = this.b;
            if (i < iRemaining) {
                this.f15081a += iRemaining;
                AllocatedBuffer.a(byteBuffer);
                throw null;
            }
            int i2 = i - iRemaining;
            this.b = i2;
            byteBuffer.get(null, i2 + 1, iRemaining);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final int T() {
            return (0 - this.b) + this.f15081a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void U(int i) {
            if (this.b >= i) {
                return;
            }
            Math.max(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void V(boolean z) {
            this.b--;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void W(int i) {
            this.b--;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void X(long j) {
            this.b--;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void Y(int i) {
            if (i < 0) {
                d0(i);
            } else {
                c0(i);
                throw null;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void Z(int i) {
            c0(CodedOutputStream.d0(i));
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void a0(long j) {
            d0(CodedOutputStream.e0(j));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void b0(int i, int i2) {
            c0((i << 3) | i2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void c(int i, int i2) {
            U(9);
            W(i2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void c0(int i) {
            if ((i & (-128)) == 0) {
                this.b--;
                throw null;
            }
            if ((i & (-16384)) == 0) {
                this.b--;
                throw null;
            }
            if (((-2097152) & i) == 0) {
                this.b--;
                throw null;
            }
            if ((i & (-268435456)) == 0) {
                this.b--;
                throw null;
            }
            this.b--;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void d(int i, String str) {
            int i2;
            int i3;
            int i4;
            int iT = T();
            U(str.length());
            int length = str.length();
            int i5 = length - 1;
            this.b -= i5;
            if (i5 >= 0 && str.charAt(i5) < 128) {
                throw null;
            }
            if (i5 != -1) {
                this.b += i5;
                while (i5 >= 0) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt < 128 && (i4 = this.b) > 0) {
                        this.b = i4 - 1;
                        throw null;
                    }
                    if (cCharAt < 2048 && (i3 = this.b) > 0) {
                        this.b = i3 - 1;
                        throw null;
                    }
                    if ((cCharAt < 55296 || 57343 < cCharAt) && (i2 = this.b) > 1) {
                        this.b = i2 - 1;
                        throw null;
                    }
                    if (this.b > 2) {
                        if (i5 != 0) {
                            char cCharAt2 = str.charAt(length - 2);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt)) {
                                Character.toCodePoint(cCharAt2, cCharAt);
                                this.b--;
                                throw null;
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 2, i5);
                    }
                    U(i5);
                }
            } else {
                this.b--;
            }
            int iT2 = T() - iT;
            U(10);
            c0(iT2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void d0(long j) {
            switch (BinaryWriter.S(j)) {
                case 1:
                    this.b--;
                    throw null;
                case 2:
                    this.b--;
                    throw null;
                case 3:
                    this.b--;
                    throw null;
                case 4:
                    this.b--;
                    throw null;
                case 5:
                    this.b--;
                    throw null;
                case 6:
                    this.b--;
                    throw null;
                case 7:
                    this.b--;
                    throw null;
                case 8:
                    this.b--;
                    throw null;
                case 9:
                    this.b--;
                    throw null;
                case 10:
                    this.b--;
                    throw null;
                default:
                    return;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void e(int i, long j) {
            U(15);
            d0(j);
            b0(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void g(int i, int i2) {
            U(15);
            Y(i2);
            b0(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void j(int i, long j) {
            U(15);
            a0(j);
            b0(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void k(int i, int i2) {
            U(10);
            c0(i2);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void m(int i, long j) {
            U(13);
            X(j);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void n(int i, boolean z) {
            U(6);
            this.b--;
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void p(int i) {
            b0(i, 3);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void r(int i) {
            b0(i, 4);
            throw null;
        }
    }

    public static final class UnsafeDirectWriter extends BinaryWriter {
        public long b;

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void C(int i, Object obj) {
            Protobuf.c.b(obj).h(obj, this);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void J(int i, int i2) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void L(int i, Object obj, Schema schema) {
            b0(i, 4);
            schema.h(obj, this);
            b0(i, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void N(int i, Object obj, Schema schema) {
            schema.h(obj, this);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void P(int i, ByteString byteString) {
            try {
                byteString.B(this);
                throw null;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void Q(int i, int i2, byte[] bArr) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            byteBuffer.remaining();
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final int T() {
            return this.f15081a + ((int) (0 - this.b));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void U(int i) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void V(boolean z) {
            byte b = z ? (byte) 1 : (byte) 0;
            long j = this.b;
            this.b = j - 1;
            UnsafeUtil.j(j, b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void W(int i) {
            long j = this.b;
            this.b = j - 1;
            UnsafeUtil.j(j, (byte) ((i >> 24) & 255));
            long j2 = this.b;
            this.b = j2 - 1;
            UnsafeUtil.j(j2, (byte) ((i >> 16) & 255));
            long j3 = this.b;
            this.b = j3 - 1;
            UnsafeUtil.j(j3, (byte) ((i >> 8) & 255));
            long j4 = this.b;
            this.b = j4 - 1;
            UnsafeUtil.j(j4, (byte) (i & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void X(long j) {
            long j2 = this.b;
            this.b = j2 - 1;
            UnsafeUtil.j(j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.b;
            this.b = j3 - 1;
            UnsafeUtil.j(j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.b;
            this.b = j4 - 1;
            UnsafeUtil.j(j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.b;
            this.b = j5 - 1;
            UnsafeUtil.j(j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.b;
            this.b = j6 - 1;
            UnsafeUtil.j(j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.b;
            this.b = j7 - 1;
            UnsafeUtil.j(j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.b;
            this.b = j8 - 1;
            UnsafeUtil.j(j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.b;
            this.b = j9 - 1;
            UnsafeUtil.j(j9, (byte) (((int) j) & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void Y(int i) {
            if (i >= 0) {
                c0(i);
            } else {
                d0(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void Z(int i) {
            c0(CodedOutputStream.d0(i));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void a0(long j) {
            d0(CodedOutputStream.e0(j));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void b0(int i, int i2) {
            c0((i << 3) | i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void c(int i, int i2) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void c0(int i) {
            if ((i & (-128)) == 0) {
                long j = this.b;
                this.b = j - 1;
                UnsafeUtil.j(j, (byte) i);
                return;
            }
            if ((i & (-16384)) == 0) {
                long j2 = this.b;
                this.b = j2 - 1;
                UnsafeUtil.j(j2, (byte) (i >>> 7));
                long j3 = this.b;
                this.b = j3 - 1;
                UnsafeUtil.j(j3, (byte) ((i & 127) | 128));
                return;
            }
            if (((-2097152) & i) == 0) {
                long j4 = this.b;
                this.b = j4 - 1;
                UnsafeUtil.j(j4, (byte) (i >>> 14));
                long j5 = this.b;
                this.b = j5 - 1;
                UnsafeUtil.j(j5, (byte) (((i >>> 7) & 127) | 128));
                long j6 = this.b;
                this.b = j6 - 1;
                UnsafeUtil.j(j6, (byte) ((i & 127) | 128));
                return;
            }
            if (((-268435456) & i) == 0) {
                long j7 = this.b;
                this.b = j7 - 1;
                UnsafeUtil.j(j7, (byte) (i >>> 21));
                long j8 = this.b;
                this.b = j8 - 1;
                UnsafeUtil.j(j8, (byte) (((i >>> 14) & 127) | 128));
                long j9 = this.b;
                this.b = j9 - 1;
                UnsafeUtil.j(j9, (byte) (((i >>> 7) & 127) | 128));
                long j10 = this.b;
                this.b = j10 - 1;
                UnsafeUtil.j(j10, (byte) ((i & 127) | 128));
                return;
            }
            long j11 = this.b;
            this.b = j11 - 1;
            UnsafeUtil.j(j11, (byte) (i >>> 28));
            long j12 = this.b;
            this.b = j12 - 1;
            UnsafeUtil.j(j12, (byte) (((i >>> 21) & 127) | 128));
            long j13 = this.b;
            this.b = j13 - 1;
            UnsafeUtil.j(j13, (byte) (((i >>> 14) & 127) | 128));
            long j14 = this.b;
            this.b = j14 - 1;
            UnsafeUtil.j(j14, (byte) (((i >>> 7) & 127) | 128));
            long j15 = this.b;
            this.b = j15 - 1;
            UnsafeUtil.j(j15, (byte) ((i & 127) | 128));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void d(int i, String str) {
            str.length();
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void d0(long j) {
            switch (BinaryWriter.S(j)) {
                case 1:
                    long j2 = this.b;
                    this.b = j2 - 1;
                    UnsafeUtil.j(j2, (byte) j);
                    break;
                case 2:
                    long j3 = this.b;
                    this.b = j3 - 1;
                    UnsafeUtil.j(j3, (byte) (j >>> 7));
                    long j4 = this.b;
                    this.b = j4 - 1;
                    UnsafeUtil.j(j4, (byte) ((((int) j) & 127) | 128));
                    break;
                case 3:
                    long j5 = this.b;
                    this.b = j5 - 1;
                    UnsafeUtil.j(j5, (byte) (((int) j) >>> 14));
                    long j6 = this.b;
                    this.b = j6 - 1;
                    UnsafeUtil.j(j6, (byte) (((j >>> 7) & 127) | 128));
                    long j7 = this.b;
                    this.b = j7 - 1;
                    UnsafeUtil.j(j7, (byte) ((j & 127) | 128));
                    break;
                case 4:
                    long j8 = this.b;
                    this.b = j8 - 1;
                    UnsafeUtil.j(j8, (byte) (j >>> 21));
                    long j9 = this.b;
                    this.b = j9 - 1;
                    UnsafeUtil.j(j9, (byte) (((j >>> 14) & 127) | 128));
                    long j10 = this.b;
                    this.b = j10 - 1;
                    UnsafeUtil.j(j10, (byte) (((j >>> 7) & 127) | 128));
                    long j11 = this.b;
                    this.b = j11 - 1;
                    UnsafeUtil.j(j11, (byte) ((j & 127) | 128));
                    break;
                case 5:
                    long j12 = this.b;
                    this.b = j12 - 1;
                    UnsafeUtil.j(j12, (byte) (j >>> 28));
                    long j13 = this.b;
                    this.b = j13 - 1;
                    UnsafeUtil.j(j13, (byte) (((j >>> 21) & 127) | 128));
                    long j14 = this.b;
                    this.b = j14 - 1;
                    UnsafeUtil.j(j14, (byte) (((j >>> 14) & 127) | 128));
                    long j15 = this.b;
                    this.b = j15 - 1;
                    UnsafeUtil.j(j15, (byte) (((j >>> 7) & 127) | 128));
                    long j16 = this.b;
                    this.b = j16 - 1;
                    UnsafeUtil.j(j16, (byte) ((j & 127) | 128));
                    break;
                case 6:
                    long j17 = this.b;
                    this.b = j17 - 1;
                    UnsafeUtil.j(j17, (byte) (j >>> 35));
                    long j18 = this.b;
                    this.b = j18 - 1;
                    UnsafeUtil.j(j18, (byte) (((j >>> 28) & 127) | 128));
                    long j19 = this.b;
                    this.b = j19 - 1;
                    UnsafeUtil.j(j19, (byte) (((j >>> 21) & 127) | 128));
                    long j20 = this.b;
                    this.b = j20 - 1;
                    UnsafeUtil.j(j20, (byte) (((j >>> 14) & 127) | 128));
                    long j21 = this.b;
                    this.b = j21 - 1;
                    UnsafeUtil.j(j21, (byte) (((j >>> 7) & 127) | 128));
                    long j22 = this.b;
                    this.b = j22 - 1;
                    UnsafeUtil.j(j22, (byte) ((j & 127) | 128));
                    break;
                case 7:
                    long j23 = this.b;
                    this.b = j23 - 1;
                    UnsafeUtil.j(j23, (byte) (j >>> 42));
                    long j24 = this.b;
                    this.b = j24 - 1;
                    UnsafeUtil.j(j24, (byte) (((j >>> 35) & 127) | 128));
                    long j25 = this.b;
                    this.b = j25 - 1;
                    UnsafeUtil.j(j25, (byte) (((j >>> 28) & 127) | 128));
                    long j26 = this.b;
                    this.b = j26 - 1;
                    UnsafeUtil.j(j26, (byte) (((j >>> 21) & 127) | 128));
                    long j27 = this.b;
                    this.b = j27 - 1;
                    UnsafeUtil.j(j27, (byte) (((j >>> 14) & 127) | 128));
                    long j28 = this.b;
                    this.b = j28 - 1;
                    UnsafeUtil.j(j28, (byte) (((j >>> 7) & 127) | 128));
                    long j29 = this.b;
                    this.b = j29 - 1;
                    UnsafeUtil.j(j29, (byte) ((j & 127) | 128));
                    break;
                case 8:
                    long j30 = this.b;
                    this.b = j30 - 1;
                    UnsafeUtil.j(j30, (byte) (j >>> 49));
                    long j31 = this.b;
                    this.b = j31 - 1;
                    UnsafeUtil.j(j31, (byte) (((j >>> 42) & 127) | 128));
                    long j32 = this.b;
                    this.b = j32 - 1;
                    UnsafeUtil.j(j32, (byte) (((j >>> 35) & 127) | 128));
                    long j33 = this.b;
                    this.b = j33 - 1;
                    UnsafeUtil.j(j33, (byte) (((j >>> 28) & 127) | 128));
                    long j34 = this.b;
                    this.b = j34 - 1;
                    UnsafeUtil.j(j34, (byte) (((j >>> 21) & 127) | 128));
                    long j35 = this.b;
                    this.b = j35 - 1;
                    UnsafeUtil.j(j35, (byte) (((j >>> 14) & 127) | 128));
                    long j36 = this.b;
                    this.b = j36 - 1;
                    UnsafeUtil.j(j36, (byte) (((j >>> 7) & 127) | 128));
                    long j37 = this.b;
                    this.b = j37 - 1;
                    UnsafeUtil.j(j37, (byte) ((j & 127) | 128));
                    break;
                case 9:
                    long j38 = this.b;
                    this.b = j38 - 1;
                    UnsafeUtil.j(j38, (byte) (j >>> 56));
                    long j39 = this.b;
                    this.b = j39 - 1;
                    UnsafeUtil.j(j39, (byte) (((j >>> 49) & 127) | 128));
                    long j40 = this.b;
                    this.b = j40 - 1;
                    UnsafeUtil.j(j40, (byte) (((j >>> 42) & 127) | 128));
                    long j41 = this.b;
                    this.b = j41 - 1;
                    UnsafeUtil.j(j41, (byte) (((j >>> 35) & 127) | 128));
                    long j42 = this.b;
                    this.b = j42 - 1;
                    UnsafeUtil.j(j42, (byte) (((j >>> 28) & 127) | 128));
                    long j43 = this.b;
                    this.b = j43 - 1;
                    UnsafeUtil.j(j43, (byte) (((j >>> 21) & 127) | 128));
                    long j44 = this.b;
                    this.b = j44 - 1;
                    UnsafeUtil.j(j44, (byte) (((j >>> 14) & 127) | 128));
                    long j45 = this.b;
                    this.b = j45 - 1;
                    UnsafeUtil.j(j45, (byte) (((j >>> 7) & 127) | 128));
                    long j46 = this.b;
                    this.b = j46 - 1;
                    UnsafeUtil.j(j46, (byte) ((j & 127) | 128));
                    break;
                case 10:
                    long j47 = this.b;
                    this.b = j47 - 1;
                    UnsafeUtil.j(j47, (byte) (j >>> 63));
                    long j48 = this.b;
                    this.b = j48 - 1;
                    UnsafeUtil.j(j48, (byte) (((j >>> 56) & 127) | 128));
                    long j49 = this.b;
                    this.b = j49 - 1;
                    UnsafeUtil.j(j49, (byte) (((j >>> 49) & 127) | 128));
                    long j50 = this.b;
                    this.b = j50 - 1;
                    UnsafeUtil.j(j50, (byte) (((j >>> 42) & 127) | 128));
                    long j51 = this.b;
                    this.b = j51 - 1;
                    UnsafeUtil.j(j51, (byte) (((j >>> 35) & 127) | 128));
                    long j52 = this.b;
                    this.b = j52 - 1;
                    UnsafeUtil.j(j52, (byte) (((j >>> 28) & 127) | 128));
                    long j53 = this.b;
                    this.b = j53 - 1;
                    UnsafeUtil.j(j53, (byte) (((j >>> 21) & 127) | 128));
                    long j54 = this.b;
                    this.b = j54 - 1;
                    UnsafeUtil.j(j54, (byte) (((j >>> 14) & 127) | 128));
                    long j55 = this.b;
                    this.b = j55 - 1;
                    UnsafeUtil.j(j55, (byte) (((j >>> 7) & 127) | 128));
                    long j56 = this.b;
                    this.b = j56 - 1;
                    UnsafeUtil.j(j56, (byte) ((j & 127) | 128));
                    break;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void e(int i, long j) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void g(int i, int i2) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void j(int i, long j) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void k(int i, int i2) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void m(int i, long j) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void n(int i, boolean z) {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void p(int i) {
            b0(i, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void r(int i) {
            b0(i, 4);
        }
    }

    public static final class UnsafeHeapWriter extends BinaryWriter {
        public long b;

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void C(int i, Object obj) {
            int iT = T();
            Protobuf.c.b(obj).h(obj, this);
            int iT2 = T() - iT;
            U(10);
            c0(iT2);
            b0(i, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void J(int i, int i2) {
            U(10);
            Z(i2);
            b0(i, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void L(int i, Object obj, Schema schema) {
            b0(i, 4);
            schema.h(obj, this);
            b0(i, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void N(int i, Object obj, Schema schema) {
            int iT = T();
            schema.h(obj, this);
            int iT2 = T() - iT;
            U(10);
            c0(iT2);
            b0(i, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void P(int i, ByteString byteString) {
            try {
                byteString.B(this);
                U(10);
                c0(byteString.size());
                b0(i, 2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void Q(int i, int i2, byte[] bArr) {
            if (i < 0 || i + i2 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long j = this.b;
            if (((int) j) < i2) {
                this.f15081a += i2;
                AllocatedBuffer.b(i, i2, bArr);
                throw null;
            }
            long j2 = j - i2;
            this.b = j2;
            System.arraycopy(bArr, i, null, ((int) j2) + 1, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void R(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            long j = this.b;
            if (((int) j) < iRemaining) {
                this.f15081a += iRemaining;
                AllocatedBuffer.a(byteBuffer);
                throw null;
            }
            long j2 = j - iRemaining;
            this.b = j2;
            byteBuffer.get(null, ((int) j2) + 1, iRemaining);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final int T() {
            return this.f15081a + ((int) (0 - this.b));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void U(int i) {
            if (((int) this.b) >= i) {
                return;
            }
            Math.max(i, 0);
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void V(boolean z) {
            byte b = z ? (byte) 1 : (byte) 0;
            long j = this.b;
            this.b = j - 1;
            UnsafeUtil.k(null, j, b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void W(int i) {
            long j = this.b;
            this.b = j - 1;
            UnsafeUtil.k(null, j, (byte) ((i >> 24) & 255));
            long j2 = this.b;
            this.b = j2 - 1;
            UnsafeUtil.k(null, j2, (byte) ((i >> 16) & 255));
            long j3 = this.b;
            this.b = j3 - 1;
            UnsafeUtil.k(null, j3, (byte) ((i >> 8) & 255));
            long j4 = this.b;
            this.b = j4 - 1;
            UnsafeUtil.k(null, j4, (byte) (i & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void X(long j) {
            long j2 = this.b;
            this.b = j2 - 1;
            UnsafeUtil.k(null, j2, (byte) (((int) (j >> 56)) & 255));
            long j3 = this.b;
            this.b = j3 - 1;
            UnsafeUtil.k(null, j3, (byte) (((int) (j >> 48)) & 255));
            long j4 = this.b;
            this.b = j4 - 1;
            UnsafeUtil.k(null, j4, (byte) (((int) (j >> 40)) & 255));
            long j5 = this.b;
            this.b = j5 - 1;
            UnsafeUtil.k(null, j5, (byte) (((int) (j >> 32)) & 255));
            long j6 = this.b;
            this.b = j6 - 1;
            UnsafeUtil.k(null, j6, (byte) (((int) (j >> 24)) & 255));
            long j7 = this.b;
            this.b = j7 - 1;
            UnsafeUtil.k(null, j7, (byte) (((int) (j >> 16)) & 255));
            long j8 = this.b;
            this.b = j8 - 1;
            UnsafeUtil.k(null, j8, (byte) (((int) (j >> 8)) & 255));
            long j9 = this.b;
            this.b = j9 - 1;
            UnsafeUtil.k(null, j9, (byte) (((int) j) & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void Y(int i) {
            if (i >= 0) {
                c0(i);
            } else {
                d0(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void Z(int i) {
            c0(CodedOutputStream.d0(i));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void a0(long j) {
            d0(CodedOutputStream.e0(j));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void b0(int i, int i2) {
            c0((i << 3) | i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void c(int i, int i2) {
            U(9);
            W(i2);
            b0(i, 5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void c0(int i) {
            if ((i & (-128)) == 0) {
                long j = this.b;
                this.b = j - 1;
                UnsafeUtil.k(null, j, (byte) i);
                return;
            }
            if ((i & (-16384)) == 0) {
                long j2 = this.b;
                this.b = j2 - 1;
                UnsafeUtil.k(null, j2, (byte) (i >>> 7));
                long j3 = this.b;
                this.b = j3 - 1;
                UnsafeUtil.k(null, j3, (byte) ((i & 127) | 128));
                return;
            }
            if (((-2097152) & i) == 0) {
                long j4 = this.b;
                this.b = j4 - 1;
                UnsafeUtil.k(null, j4, (byte) (i >>> 14));
                long j5 = this.b;
                this.b = j5 - 1;
                UnsafeUtil.k(null, j5, (byte) (((i >>> 7) & 127) | 128));
                long j6 = this.b;
                this.b = j6 - 1;
                UnsafeUtil.k(null, j6, (byte) ((i & 127) | 128));
                return;
            }
            if (((-268435456) & i) == 0) {
                long j7 = this.b;
                this.b = j7 - 1;
                UnsafeUtil.k(null, j7, (byte) (i >>> 21));
                long j8 = this.b;
                this.b = j8 - 1;
                UnsafeUtil.k(null, j8, (byte) (((i >>> 14) & 127) | 128));
                long j9 = this.b;
                this.b = j9 - 1;
                UnsafeUtil.k(null, j9, (byte) (((i >>> 7) & 127) | 128));
                long j10 = this.b;
                this.b = j10 - 1;
                UnsafeUtil.k(null, j10, (byte) ((i & 127) | 128));
                return;
            }
            long j11 = this.b;
            this.b = j11 - 1;
            UnsafeUtil.k(null, j11, (byte) (i >>> 28));
            long j12 = this.b;
            this.b = j12 - 1;
            UnsafeUtil.k(null, j12, (byte) (((i >>> 21) & 127) | 128));
            long j13 = this.b;
            this.b = j13 - 1;
            UnsafeUtil.k(null, j13, (byte) (((i >>> 14) & 127) | 128));
            long j14 = this.b;
            this.b = j14 - 1;
            UnsafeUtil.k(null, j14, (byte) (((i >>> 7) & 127) | 128));
            long j15 = this.b;
            this.b = j15 - 1;
            UnsafeUtil.k(null, j15, (byte) ((i & 127) | 128));
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(int r14, java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 288
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.BinaryWriter.UnsafeHeapWriter.d(int, java.lang.String):void");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public final void d0(long j) {
            switch (BinaryWriter.S(j)) {
                case 1:
                    long j2 = this.b;
                    this.b = j2 - 1;
                    UnsafeUtil.k(null, j2, (byte) j);
                    break;
                case 2:
                    long j3 = this.b;
                    this.b = j3 - 1;
                    UnsafeUtil.k(null, j3, (byte) (j >>> 7));
                    long j4 = this.b;
                    this.b = j4 - 1;
                    UnsafeUtil.k(null, j4, (byte) ((((int) j) & 127) | 128));
                    break;
                case 3:
                    long j5 = this.b;
                    this.b = j5 - 1;
                    UnsafeUtil.k(null, j5, (byte) (((int) j) >>> 14));
                    long j6 = this.b;
                    this.b = j6 - 1;
                    UnsafeUtil.k(null, j6, (byte) (((j >>> 7) & 127) | 128));
                    long j7 = this.b;
                    this.b = j7 - 1;
                    UnsafeUtil.k(null, j7, (byte) ((j & 127) | 128));
                    break;
                case 4:
                    long j8 = this.b;
                    this.b = j8 - 1;
                    UnsafeUtil.k(null, j8, (byte) (j >>> 21));
                    long j9 = this.b;
                    this.b = j9 - 1;
                    UnsafeUtil.k(null, j9, (byte) (((j >>> 14) & 127) | 128));
                    long j10 = this.b;
                    this.b = j10 - 1;
                    UnsafeUtil.k(null, j10, (byte) (((j >>> 7) & 127) | 128));
                    long j11 = this.b;
                    this.b = j11 - 1;
                    UnsafeUtil.k(null, j11, (byte) ((j & 127) | 128));
                    break;
                case 5:
                    long j12 = this.b;
                    this.b = j12 - 1;
                    UnsafeUtil.k(null, j12, (byte) (j >>> 28));
                    long j13 = this.b;
                    this.b = j13 - 1;
                    UnsafeUtil.k(null, j13, (byte) (((j >>> 21) & 127) | 128));
                    long j14 = this.b;
                    this.b = j14 - 1;
                    UnsafeUtil.k(null, j14, (byte) (((j >>> 14) & 127) | 128));
                    long j15 = this.b;
                    this.b = j15 - 1;
                    UnsafeUtil.k(null, j15, (byte) (((j >>> 7) & 127) | 128));
                    long j16 = this.b;
                    this.b = j16 - 1;
                    UnsafeUtil.k(null, j16, (byte) ((j & 127) | 128));
                    break;
                case 6:
                    long j17 = this.b;
                    this.b = j17 - 1;
                    UnsafeUtil.k(null, j17, (byte) (j >>> 35));
                    long j18 = this.b;
                    this.b = j18 - 1;
                    UnsafeUtil.k(null, j18, (byte) (((j >>> 28) & 127) | 128));
                    long j19 = this.b;
                    this.b = j19 - 1;
                    UnsafeUtil.k(null, j19, (byte) (((j >>> 21) & 127) | 128));
                    long j20 = this.b;
                    this.b = j20 - 1;
                    UnsafeUtil.k(null, j20, (byte) (((j >>> 14) & 127) | 128));
                    long j21 = this.b;
                    this.b = j21 - 1;
                    UnsafeUtil.k(null, j21, (byte) (((j >>> 7) & 127) | 128));
                    long j22 = this.b;
                    this.b = j22 - 1;
                    UnsafeUtil.k(null, j22, (byte) ((j & 127) | 128));
                    break;
                case 7:
                    long j23 = this.b;
                    this.b = j23 - 1;
                    UnsafeUtil.k(null, j23, (byte) (j >>> 42));
                    long j24 = this.b;
                    this.b = j24 - 1;
                    UnsafeUtil.k(null, j24, (byte) (((j >>> 35) & 127) | 128));
                    long j25 = this.b;
                    this.b = j25 - 1;
                    UnsafeUtil.k(null, j25, (byte) (((j >>> 28) & 127) | 128));
                    long j26 = this.b;
                    this.b = j26 - 1;
                    UnsafeUtil.k(null, j26, (byte) (((j >>> 21) & 127) | 128));
                    long j27 = this.b;
                    this.b = j27 - 1;
                    UnsafeUtil.k(null, j27, (byte) (((j >>> 14) & 127) | 128));
                    long j28 = this.b;
                    this.b = j28 - 1;
                    UnsafeUtil.k(null, j28, (byte) (((j >>> 7) & 127) | 128));
                    long j29 = this.b;
                    this.b = j29 - 1;
                    UnsafeUtil.k(null, j29, (byte) ((j & 127) | 128));
                    break;
                case 8:
                    long j30 = this.b;
                    this.b = j30 - 1;
                    UnsafeUtil.k(null, j30, (byte) (j >>> 49));
                    long j31 = this.b;
                    this.b = j31 - 1;
                    UnsafeUtil.k(null, j31, (byte) (((j >>> 42) & 127) | 128));
                    long j32 = this.b;
                    this.b = j32 - 1;
                    UnsafeUtil.k(null, j32, (byte) (((j >>> 35) & 127) | 128));
                    long j33 = this.b;
                    this.b = j33 - 1;
                    UnsafeUtil.k(null, j33, (byte) (((j >>> 28) & 127) | 128));
                    long j34 = this.b;
                    this.b = j34 - 1;
                    UnsafeUtil.k(null, j34, (byte) (((j >>> 21) & 127) | 128));
                    long j35 = this.b;
                    this.b = j35 - 1;
                    UnsafeUtil.k(null, j35, (byte) (((j >>> 14) & 127) | 128));
                    long j36 = this.b;
                    this.b = j36 - 1;
                    UnsafeUtil.k(null, j36, (byte) (((j >>> 7) & 127) | 128));
                    long j37 = this.b;
                    this.b = j37 - 1;
                    UnsafeUtil.k(null, j37, (byte) ((j & 127) | 128));
                    break;
                case 9:
                    long j38 = this.b;
                    this.b = j38 - 1;
                    UnsafeUtil.k(null, j38, (byte) (j >>> 56));
                    long j39 = this.b;
                    this.b = j39 - 1;
                    UnsafeUtil.k(null, j39, (byte) (((j >>> 49) & 127) | 128));
                    long j40 = this.b;
                    this.b = j40 - 1;
                    UnsafeUtil.k(null, j40, (byte) (((j >>> 42) & 127) | 128));
                    long j41 = this.b;
                    this.b = j41 - 1;
                    UnsafeUtil.k(null, j41, (byte) (((j >>> 35) & 127) | 128));
                    long j42 = this.b;
                    this.b = j42 - 1;
                    UnsafeUtil.k(null, j42, (byte) (((j >>> 28) & 127) | 128));
                    long j43 = this.b;
                    this.b = j43 - 1;
                    UnsafeUtil.k(null, j43, (byte) (((j >>> 21) & 127) | 128));
                    long j44 = this.b;
                    this.b = j44 - 1;
                    UnsafeUtil.k(null, j44, (byte) (((j >>> 14) & 127) | 128));
                    long j45 = this.b;
                    this.b = j45 - 1;
                    UnsafeUtil.k(null, j45, (byte) (((j >>> 7) & 127) | 128));
                    long j46 = this.b;
                    this.b = j46 - 1;
                    UnsafeUtil.k(null, j46, (byte) ((j & 127) | 128));
                    break;
                case 10:
                    long j47 = this.b;
                    this.b = j47 - 1;
                    UnsafeUtil.k(null, j47, (byte) (j >>> 63));
                    long j48 = this.b;
                    this.b = j48 - 1;
                    UnsafeUtil.k(null, j48, (byte) (((j >>> 56) & 127) | 128));
                    long j49 = this.b;
                    this.b = j49 - 1;
                    UnsafeUtil.k(null, j49, (byte) (((j >>> 49) & 127) | 128));
                    long j50 = this.b;
                    this.b = j50 - 1;
                    UnsafeUtil.k(null, j50, (byte) (((j >>> 42) & 127) | 128));
                    long j51 = this.b;
                    this.b = j51 - 1;
                    UnsafeUtil.k(null, j51, (byte) (((j >>> 35) & 127) | 128));
                    long j52 = this.b;
                    this.b = j52 - 1;
                    UnsafeUtil.k(null, j52, (byte) (((j >>> 28) & 127) | 128));
                    long j53 = this.b;
                    this.b = j53 - 1;
                    UnsafeUtil.k(null, j53, (byte) (((j >>> 21) & 127) | 128));
                    long j54 = this.b;
                    this.b = j54 - 1;
                    UnsafeUtil.k(null, j54, (byte) (((j >>> 14) & 127) | 128));
                    long j55 = this.b;
                    this.b = j55 - 1;
                    UnsafeUtil.k(null, j55, (byte) (((j >>> 7) & 127) | 128));
                    long j56 = this.b;
                    this.b = j56 - 1;
                    UnsafeUtil.k(null, j56, (byte) ((j & 127) | 128));
                    break;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void e(int i, long j) {
            U(15);
            d0(j);
            b0(i, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void g(int i, int i2) {
            U(15);
            Y(i2);
            b0(i, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void j(int i, long j) {
            U(15);
            a0(j);
            b0(i, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void k(int i, int i2) {
            U(10);
            c0(i2);
            b0(i, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void m(int i, long j) {
            U(13);
            X(j);
            b0(i, 1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void n(int i, boolean z) {
            U(6);
            byte b = z ? (byte) 1 : (byte) 0;
            long j = this.b;
            this.b = j - 1;
            UnsafeUtil.k(null, j, b);
            b0(i, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void p(int i) {
            b0(i, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public final void r(int i) {
            b0(i, 4);
        }
    }

    public static byte S(long j) {
        byte b;
        if (((-128) & j) == 0) {
            return (byte) 1;
        }
        if (j < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j) != 0) {
            b = (byte) 6;
            j >>>= 28;
        } else {
            b = 2;
        }
        if (((-2097152) & j) != 0) {
            b = (byte) (b + 2);
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? (byte) (b + 1) : b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void A(int i, List list, boolean z) {
        q(i, list, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final Writer.FieldOrder B() {
        return Writer.FieldOrder.e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void D(float f, int i) {
        c(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void E(int i, long j) {
        e(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void F(int i, List list, boolean z) {
        h(i, list, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void G(int i, List list, boolean z) {
        if (!(list instanceof BooleanArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    n(i, ((Boolean) list.get(size)).booleanValue());
                }
                return;
            }
            U(list.size() + 10);
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                V(((Boolean) list.get(size2)).booleanValue());
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        if (!z) {
            for (int i2 = booleanArrayList.f - 1; i2 >= 0; i2--) {
                booleanArrayList.h(i2);
                n(i, booleanArrayList.e[i2]);
            }
            return;
        }
        U(booleanArrayList.f + 10);
        int iT2 = T();
        for (int i3 = booleanArrayList.f - 1; i3 >= 0; i3--) {
            booleanArrayList.h(i3);
            V(booleanArrayList.e[i3]);
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void H(int i, int i2) {
        g(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void I(int i, List list, boolean z) {
        l(i, list, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void K(int i, MapEntryLite.Metadata metadata, Map map) {
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            metadata.getClass();
            entry.getValue();
            throw null;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void M(int i, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            N(i, list.get(size), schema);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void O(int i, List list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            L(i, list.get(size), schema);
        }
    }

    public abstract int T();

    public abstract void U(int i);

    public abstract void V(boolean z);

    public abstract void W(int i);

    public abstract void X(long j);

    public abstract void Y(int i);

    public abstract void Z(int i);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void a(int i, List list, boolean z) {
        if (!(list instanceof FloatArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    D(((Float) list.get(size)).floatValue(), i);
                }
                return;
            }
            U(a.c(4, 10, list));
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                W(Float.floatToRawIntBits(((Float) list.get(size2)).floatValue()));
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        if (!z) {
            for (int i2 = floatArrayList.f - 1; i2 >= 0; i2--) {
                floatArrayList.h(i2);
                D(floatArrayList.e[i2], i);
            }
            return;
        }
        U((floatArrayList.f * 4) + 10);
        int iT2 = T();
        for (int i3 = floatArrayList.f - 1; i3 >= 0; i3--) {
            floatArrayList.h(i3);
            W(Float.floatToRawIntBits(floatArrayList.e[i3]));
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    public abstract void a0(long j);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void b(int i, Object obj) {
        b0(1, 4);
        if (obj instanceof ByteString) {
            P(3, (ByteString) obj);
        } else {
            C(3, obj);
        }
        k(2, i);
        b0(1, 3);
    }

    public abstract void b0(int i, int i2);

    public abstract void c0(int i);

    public abstract void d0(long j);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void f(int i, List list, boolean z) {
        if (!(list instanceof IntArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    g(i, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U(a.c(10, 10, list));
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                Y(((Integer) list.get(size2)).intValue());
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            for (int i2 = intArrayList.f - 1; i2 >= 0; i2--) {
                g(i, intArrayList.getInt(i2));
            }
            return;
        }
        U((intArrayList.f * 10) + 10);
        int iT2 = T();
        for (int i3 = intArrayList.f - 1; i3 >= 0; i3--) {
            Y(intArrayList.getInt(i3));
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void h(int i, List list, boolean z) {
        if (!(list instanceof IntArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    c(i, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U(a.c(4, 10, list));
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                W(((Integer) list.get(size2)).intValue());
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            for (int i2 = intArrayList.f - 1; i2 >= 0; i2--) {
                c(i, intArrayList.getInt(i2));
            }
            return;
        }
        U((intArrayList.f * 4) + 10);
        int iT2 = T();
        for (int i3 = intArrayList.f - 1; i3 >= 0; i3--) {
            W(intArrayList.getInt(i3));
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void i(int i, List list, boolean z) {
        if (!(list instanceof IntArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    k(i, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U(a.c(5, 10, list));
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                c0(((Integer) list.get(size2)).intValue());
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            for (int i2 = intArrayList.f - 1; i2 >= 0; i2--) {
                k(i, intArrayList.getInt(i2));
            }
            return;
        }
        U((intArrayList.f * 5) + 10);
        int iT2 = T();
        for (int i3 = intArrayList.f - 1; i3 >= 0; i3--) {
            c0(intArrayList.getInt(i3));
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void l(int i, List list, boolean z) {
        if (!(list instanceof LongArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    e(i, ((Long) list.get(size)).longValue());
                }
                return;
            }
            U(a.c(10, 10, list));
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                d0(((Long) list.get(size2)).longValue());
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            for (int i2 = longArrayList.f - 1; i2 >= 0; i2--) {
                e(i, longArrayList.i(i2));
            }
            return;
        }
        U((longArrayList.f * 10) + 10);
        int iT2 = T();
        for (int i3 = longArrayList.f - 1; i3 >= 0; i3--) {
            d0(longArrayList.i(i3));
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void o(int i, int i2) {
        c(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void q(int i, List list, boolean z) {
        if (!(list instanceof LongArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    m(i, ((Long) list.get(size)).longValue());
                }
                return;
            }
            U(a.c(8, 10, list));
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                X(((Long) list.get(size2)).longValue());
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            for (int i2 = longArrayList.f - 1; i2 >= 0; i2--) {
                m(i, longArrayList.i(i2));
            }
            return;
        }
        U((longArrayList.f * 8) + 10);
        int iT2 = T();
        for (int i3 = longArrayList.f - 1; i3 >= 0; i3--) {
            X(longArrayList.i(i3));
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void s(int i, List list, boolean z) {
        if (!(list instanceof IntArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    J(i, ((Integer) list.get(size)).intValue());
                }
                return;
            }
            U(a.c(5, 10, list));
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                Z(((Integer) list.get(size2)).intValue());
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            for (int i2 = intArrayList.f - 1; i2 >= 0; i2--) {
                J(i, intArrayList.getInt(i2));
            }
            return;
        }
        U((intArrayList.f * 5) + 10);
        int iT2 = T();
        for (int i3 = intArrayList.f - 1; i3 >= 0; i3--) {
            Z(intArrayList.getInt(i3));
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void t(int i, List list, boolean z) {
        if (!(list instanceof DoubleArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    w(((Double) list.get(size)).doubleValue(), i);
                }
                return;
            }
            U(a.c(8, 10, list));
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                X(Double.doubleToRawLongBits(((Double) list.get(size2)).doubleValue()));
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        if (!z) {
            for (int i2 = doubleArrayList.f - 1; i2 >= 0; i2--) {
                doubleArrayList.h(i2);
                w(doubleArrayList.e[i2], i);
            }
            return;
        }
        U((doubleArrayList.f * 8) + 10);
        int iT2 = T();
        for (int i3 = doubleArrayList.f - 1; i3 >= 0; i3--) {
            doubleArrayList.h(i3);
            X(Double.doubleToRawLongBits(doubleArrayList.e[i3]));
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void u(int i, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            P(i, (ByteString) list.get(size));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void v(int i, List list) {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                d(i, (String) list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Object raw = lazyStringList.getRaw(size2);
            if (raw instanceof String) {
                d(i, (String) raw);
            } else {
                P(i, (ByteString) raw);
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void w(double d, int i) {
        m(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void x(int i, long j) {
        m(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void y(int i, List list, boolean z) {
        if (!(list instanceof LongArrayList)) {
            if (!z) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    j(i, ((Long) list.get(size)).longValue());
                }
                return;
            }
            U(a.c(10, 10, list));
            int iT = T();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                a0(((Long) list.get(size2)).longValue());
            }
            c0(T() - iT);
            b0(i, 2);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            for (int i2 = longArrayList.f - 1; i2 >= 0; i2--) {
                j(i, longArrayList.i(i2));
            }
            return;
        }
        U((longArrayList.f * 10) + 10);
        int iT2 = T();
        for (int i3 = longArrayList.f - 1; i3 >= 0; i3--) {
            a0(longArrayList.i(i3));
        }
        c0(T() - iT2);
        b0(i, 2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void z(int i, List list, boolean z) {
        f(i, list, z);
    }
}
