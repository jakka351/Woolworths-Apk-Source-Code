package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@CheckReturnValue
/* loaded from: classes.dex */
final class CodedOutputStreamWriter implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f2606a;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2607a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2607a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2607a[WireFormat.FieldType.l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2607a[WireFormat.FieldType.j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2607a[WireFormat.FieldType.t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2607a[WireFormat.FieldType.v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2607a[WireFormat.FieldType.r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2607a[WireFormat.FieldType.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2607a[WireFormat.FieldType.h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2607a[WireFormat.FieldType.u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2607a[WireFormat.FieldType.w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2607a[WireFormat.FieldType.i.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2607a[WireFormat.FieldType.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        Internal.a(codedOutputStream, "output");
        this.f2606a = codedOutputStream;
        codedOutputStream.f2605a = this;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void A(int i, List list, boolean z) {
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.m(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 8;
            }
            codedOutputStream.q0(i3);
            while (i2 < list.size()) {
                codedOutputStream.h0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                codedOutputStream.m(i, longArrayList.h(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < longArrayList.size(); i6++) {
            longArrayList.h(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 8;
        }
        codedOutputStream.q0(i5);
        while (i2 < longArrayList.size()) {
            codedOutputStream.h0(longArrayList.h(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder B() {
        return Writer.FieldOrder.d;
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void C(int i, Object obj) {
        this.f2606a.j0(i, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void D(float f, int i) {
        CodedOutputStream codedOutputStream = this.f2606a;
        codedOutputStream.getClass();
        codedOutputStream.c(i, Float.floatToRawIntBits(f));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void E(int i, long j) {
        this.f2606a.e(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void F(int i, List list, boolean z) {
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.c(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 4;
            }
            codedOutputStream.q0(i3);
            while (i2 < list.size()) {
                codedOutputStream.g0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream.c(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < intArrayList.size(); i6++) {
            intArrayList.getInt(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 4;
        }
        codedOutputStream.q0(i5);
        while (i2 < intArrayList.size()) {
            codedOutputStream.g0(intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void G(int i, List list, boolean z) {
        boolean z2 = list instanceof BooleanArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.n(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                Logger logger = CodedOutputStream.b;
                i3++;
            }
            codedOutputStream.q0(i3);
            while (i2 < list.size()) {
                codedOutputStream.d0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        if (!z) {
            while (i2 < booleanArrayList.size()) {
                codedOutputStream.n(i, booleanArrayList.h(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < booleanArrayList.size(); i6++) {
            booleanArrayList.h(i6);
            Logger logger2 = CodedOutputStream.b;
            i5++;
        }
        codedOutputStream.q0(i5);
        while (i2 < booleanArrayList.size()) {
            codedOutputStream.d0(booleanArrayList.h(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void H(int i, int i2) {
        this.f2606a.g(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void I(int i, List list, boolean z) {
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int iZ = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZ += CodedOutputStream.Z(((Long) list.get(i3)).longValue());
            }
            codedOutputStream.q0(iZ);
            while (i2 < list.size()) {
                codedOutputStream.r0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                codedOutputStream.e(i, longArrayList.h(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iZ2 = 0;
        for (int i4 = 0; i4 < longArrayList.size(); i4++) {
            iZ2 += CodedOutputStream.Z(longArrayList.h(i4));
        }
        codedOutputStream.q0(iZ2);
        while (i2 < longArrayList.size()) {
            codedOutputStream.r0(longArrayList.h(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void J(int i, int i2) {
        this.f2606a.k(i, CodedOutputStream.a0(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void K(int i, ByteString byteString) {
        this.f2606a.K(i, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void L(int i, Object obj, Schema schema) {
        this.f2606a.k0(i, (MessageLite) obj, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void M(int i, MapEntryLite.Metadata metadata, Map map) {
        CodedOutputStream codedOutputStream = this.f2606a;
        codedOutputStream.getClass();
        for (Map.Entry entry : map.entrySet()) {
            codedOutputStream.p0(i, 2);
            codedOutputStream.q0(MapEntryLite.a(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.b(codedOutputStream, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void N(int i, List list, Schema schema) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            O(i, list.get(i2), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void O(int i, Object obj, Schema schema) {
        CodedOutputStream codedOutputStream = this.f2606a;
        codedOutputStream.p0(i, 3);
        schema.e((MessageLite) obj, codedOutputStream.f2605a);
        codedOutputStream.p0(i, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void P(int i, List list, Schema schema) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            L(i, list.get(i2), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void a(int i, List list, boolean z) {
        boolean z2 = list instanceof FloatArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float fFloatValue = ((Float) list.get(i2)).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.c(i, Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 4;
            }
            codedOutputStream.q0(i3);
            while (i2 < list.size()) {
                codedOutputStream.g0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        if (!z) {
            while (i2 < floatArrayList.size()) {
                float fH = floatArrayList.h(i2);
                codedOutputStream.getClass();
                codedOutputStream.c(i, Float.floatToRawIntBits(fH));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < floatArrayList.size(); i6++) {
            floatArrayList.h(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 4;
        }
        codedOutputStream.q0(i5);
        while (i2 < floatArrayList.size()) {
            codedOutputStream.g0(Float.floatToRawIntBits(floatArrayList.h(i2)));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void b(int i, Object obj) {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f2606a;
        if (z) {
            codedOutputStream.n0(i, (ByteString) obj);
        } else {
            codedOutputStream.m0(i, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void c(int i, int i2) {
        this.f2606a.c(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void d(int i, String str) {
        this.f2606a.d(i, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void e(int i, long j) {
        this.f2606a.e(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void f(int i, List list, boolean z) {
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int iZ = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZ += CodedOutputStream.Z(((Integer) list.get(i3)).intValue());
            }
            codedOutputStream.q0(iZ);
            while (i2 < list.size()) {
                codedOutputStream.i0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream.g(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iZ2 = 0;
        for (int i4 = 0; i4 < intArrayList.size(); i4++) {
            iZ2 += CodedOutputStream.Z(intArrayList.getInt(i4));
        }
        codedOutputStream.q0(iZ2);
        while (i2 < intArrayList.size()) {
            codedOutputStream.i0(intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void g(int i, int i2) {
        this.f2606a.g(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void h(int i, List list, boolean z) {
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.c(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 4;
            }
            codedOutputStream.q0(i3);
            while (i2 < list.size()) {
                codedOutputStream.g0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream.c(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < intArrayList.size(); i6++) {
            intArrayList.getInt(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 4;
        }
        codedOutputStream.q0(i5);
        while (i2 < intArrayList.size()) {
            codedOutputStream.g0(intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void i(int i, List list, boolean z) {
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int iY = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iY += CodedOutputStream.Y(((Integer) list.get(i3)).intValue());
            }
            codedOutputStream.q0(iY);
            while (i2 < list.size()) {
                codedOutputStream.q0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream.k(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iY2 = 0;
        for (int i4 = 0; i4 < intArrayList.size(); i4++) {
            iY2 += CodedOutputStream.Y(intArrayList.getInt(i4));
        }
        codedOutputStream.q0(iY2);
        while (i2 < intArrayList.size()) {
            codedOutputStream.q0(intArrayList.getInt(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void j(int i, long j) {
        this.f2606a.e(i, CodedOutputStream.b0(j));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void k(int i, int i2) {
        this.f2606a.k(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void l(int i, List list, boolean z) {
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.e(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int iZ = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZ += CodedOutputStream.Z(((Long) list.get(i3)).longValue());
            }
            codedOutputStream.q0(iZ);
            while (i2 < list.size()) {
                codedOutputStream.r0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                codedOutputStream.e(i, longArrayList.h(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iZ2 = 0;
        for (int i4 = 0; i4 < longArrayList.size(); i4++) {
            iZ2 += CodedOutputStream.Z(longArrayList.h(i4));
        }
        codedOutputStream.q0(iZ2);
        while (i2 < longArrayList.size()) {
            codedOutputStream.r0(longArrayList.h(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void m(int i, long j) {
        this.f2606a.m(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void n(int i, boolean z) {
        this.f2606a.n(i, z);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void o(int i, int i2) {
        this.f2606a.c(i, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void p(int i) {
        this.f2606a.p0(i, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void q(int i, List list, boolean z) {
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.m(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 8;
            }
            codedOutputStream.q0(i3);
            while (i2 < list.size()) {
                codedOutputStream.h0(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                codedOutputStream.m(i, longArrayList.h(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < longArrayList.size(); i6++) {
            longArrayList.h(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 8;
        }
        codedOutputStream.q0(i5);
        while (i2 < longArrayList.size()) {
            codedOutputStream.h0(longArrayList.h(i2));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void r(int i) {
        this.f2606a.p0(i, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void s(int i, List list, boolean z) {
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.k(i, CodedOutputStream.a0(((Integer) list.get(i2)).intValue()));
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int iU = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iU += CodedOutputStream.U(((Integer) list.get(i3)).intValue());
            }
            codedOutputStream.q0(iU);
            while (i2 < list.size()) {
                codedOutputStream.q0(CodedOutputStream.a0(((Integer) list.get(i2)).intValue()));
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream.k(i, CodedOutputStream.a0(intArrayList.getInt(i2)));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iU2 = 0;
        for (int i4 = 0; i4 < intArrayList.size(); i4++) {
            iU2 += CodedOutputStream.U(intArrayList.getInt(i4));
        }
        codedOutputStream.q0(iU2);
        while (i2 < intArrayList.size()) {
            codedOutputStream.q0(CodedOutputStream.a0(intArrayList.getInt(i2)));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void t(int i, List list, boolean z) {
        boolean z2 = list instanceof DoubleArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.m(i, Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                Logger logger = CodedOutputStream.b;
                i3 += 8;
            }
            codedOutputStream.q0(i3);
            while (i2 < list.size()) {
                codedOutputStream.h0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        if (!z) {
            while (i2 < doubleArrayList.size()) {
                double dH = doubleArrayList.h(i2);
                codedOutputStream.getClass();
                codedOutputStream.m(i, Double.doubleToRawLongBits(dH));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < doubleArrayList.size(); i6++) {
            doubleArrayList.h(i6);
            Logger logger2 = CodedOutputStream.b;
            i5 += 8;
        }
        codedOutputStream.q0(i5);
        while (i2 < doubleArrayList.size()) {
            codedOutputStream.h0(Double.doubleToRawLongBits(doubleArrayList.h(i2)));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void u(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f2606a.K(i, (ByteString) list.get(i2));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void v(int i, List list) {
        boolean z = list instanceof LazyStringList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.d(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i2 < list.size()) {
            Object raw = lazyStringList.getRaw(i2);
            if (raw instanceof String) {
                codedOutputStream.d(i, (String) raw);
            } else {
                codedOutputStream.K(i, (ByteString) raw);
            }
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void w(double d, int i) {
        CodedOutputStream codedOutputStream = this.f2606a;
        codedOutputStream.getClass();
        codedOutputStream.m(i, Double.doubleToRawLongBits(d));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void x(int i, long j) {
        this.f2606a.m(i, j);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void y(int i, List list, boolean z) {
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.e(i, CodedOutputStream.b0(((Long) list.get(i2)).longValue()));
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iV += CodedOutputStream.V(((Long) list.get(i3)).longValue());
            }
            codedOutputStream.q0(iV);
            while (i2 < list.size()) {
                codedOutputStream.r0(CodedOutputStream.b0(((Long) list.get(i2)).longValue()));
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                codedOutputStream.e(i, CodedOutputStream.b0(longArrayList.h(i2)));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < longArrayList.size(); i4++) {
            iV2 += CodedOutputStream.V(longArrayList.h(i4));
        }
        codedOutputStream.q0(iV2);
        while (i2 < longArrayList.size()) {
            codedOutputStream.r0(CodedOutputStream.b0(longArrayList.h(i2)));
            i2++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void z(int i, List list, boolean z) {
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream codedOutputStream = this.f2606a;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream.g(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream.p0(i, 2);
            int iZ = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZ += CodedOutputStream.Z(((Integer) list.get(i3)).intValue());
            }
            codedOutputStream.q0(iZ);
            while (i2 < list.size()) {
                codedOutputStream.i0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream.g(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iZ2 = 0;
        for (int i4 = 0; i4 < intArrayList.size(); i4++) {
            iZ2 += CodedOutputStream.Z(intArrayList.getInt(i4));
        }
        codedOutputStream.q0(iZ2);
        while (i2 < intArrayList.size()) {
            codedOutputStream.i0(intArrayList.getInt(i2));
            i2++;
        }
    }
}
