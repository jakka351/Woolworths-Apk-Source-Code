package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class CodedOutputStreamWriter implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f15088a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15089a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15089a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15089a[WireFormat.FieldType.l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15089a[WireFormat.FieldType.j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15089a[WireFormat.FieldType.t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15089a[WireFormat.FieldType.v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15089a[WireFormat.FieldType.r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15089a[WireFormat.FieldType.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15089a[WireFormat.FieldType.h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15089a[WireFormat.FieldType.u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15089a[WireFormat.FieldType.w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15089a[WireFormat.FieldType.i.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15089a[WireFormat.FieldType.n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        Internal.a(codedOutputStream, "output");
        this.f15088a = codedOutputStream;
        codedOutputStream.f15087a = this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void A(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
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
            codedOutputStream.j0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final Writer.FieldOrder B() {
        return Writer.FieldOrder.d;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void C(int i, Object obj) {
        this.f15088a.l0(2, (MessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void D(float f, int i) {
        CodedOutputStream codedOutputStream = this.f15088a;
        codedOutputStream.getClass();
        codedOutputStream.c(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void E(int i, long j) {
        this.f15088a.e(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void F(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
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
            codedOutputStream.i0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void G(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
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
            codedOutputStream.h0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void H(int i, int i2) {
        this.f15088a.g(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void I(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iC0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC0 += CodedOutputStream.c0(((Long) list.get(i3)).longValue());
        }
        codedOutputStream.q0(iC0);
        while (i2 < list.size()) {
            codedOutputStream.r0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void J(int i, int i2) {
        this.f15088a.k(i, CodedOutputStream.d0(i2));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void K(int i, MapEntryLite.Metadata metadata, Map map) {
        CodedOutputStream codedOutputStream = this.f15088a;
        codedOutputStream.getClass();
        for (Map.Entry entry : map.entrySet()) {
            codedOutputStream.p0(i, 2);
            codedOutputStream.q0(MapEntryLite.b(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.c(codedOutputStream, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void L(int i, Object obj, Schema schema) {
        CodedOutputStream codedOutputStream = this.f15088a;
        codedOutputStream.p0(i, 3);
        schema.h((MessageLite) obj, codedOutputStream.f15087a);
        codedOutputStream.p0(i, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void M(int i, List list, Schema schema) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            N(i, list.get(i2), schema);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void N(int i, Object obj, Schema schema) {
        this.f15088a.m0(i, (MessageLite) obj, schema);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void O(int i, List list, Schema schema) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            L(i, list.get(i2), schema);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void P(int i, ByteString byteString) {
        this.f15088a.P(i, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void a(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
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
            codedOutputStream.i0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void b(int i, Object obj) {
        boolean z = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f15088a;
        if (z) {
            codedOutputStream.o0(i, (ByteString) obj);
        } else {
            codedOutputStream.n0(i, (MessageLite) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void c(int i, int i2) {
        this.f15088a.c(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void d(int i, String str) {
        this.f15088a.d(i, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void e(int i, long j) {
        this.f15088a.e(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void f(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += CodedOutputStream.X(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.q0(iX);
        while (i2 < list.size()) {
            codedOutputStream.k0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void g(int i, int i2) {
        this.f15088a.g(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void h(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
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
            codedOutputStream.i0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void i(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB0 += CodedOutputStream.b0(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.q0(iB0);
        while (i2 < list.size()) {
            codedOutputStream.q0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void j(int i, long j) {
        this.f15088a.e(i, CodedOutputStream.e0(j));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void k(int i, int i2) {
        this.f15088a.k(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void l(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iC0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC0 += CodedOutputStream.c0(((Long) list.get(i3)).longValue());
        }
        codedOutputStream.q0(iC0);
        while (i2 < list.size()) {
            codedOutputStream.r0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void m(int i, long j) {
        this.f15088a.m(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void n(int i, boolean z) {
        this.f15088a.n(i, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void o(int i, int i2) {
        this.f15088a.c(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void p(int i) {
        this.f15088a.p0(i, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void q(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
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
            codedOutputStream.j0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void r(int i) {
        this.f15088a.p0(i, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void s(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.k(i, CodedOutputStream.d0(((Integer) list.get(i2)).intValue()));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB0 += CodedOutputStream.b0(CodedOutputStream.d0(((Integer) list.get(i3)).intValue()));
        }
        codedOutputStream.q0(iB0);
        while (i2 < list.size()) {
            codedOutputStream.q0(CodedOutputStream.d0(((Integer) list.get(i2)).intValue()));
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void t(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
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
            codedOutputStream.j0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void u(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f15088a.P(i, (ByteString) list.get(i2));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void v(int i, List list) {
        boolean z = list instanceof LazyStringList;
        CodedOutputStream codedOutputStream = this.f15088a;
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
                codedOutputStream.P(i, (ByteString) raw);
            }
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void w(double d, int i) {
        CodedOutputStream codedOutputStream = this.f15088a;
        codedOutputStream.getClass();
        codedOutputStream.m(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void x(int i, long j) {
        this.f15088a.m(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void y(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.e(i, CodedOutputStream.e0(((Long) list.get(i2)).longValue()));
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iC0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iC0 += CodedOutputStream.c0(CodedOutputStream.e0(((Long) list.get(i3)).longValue()));
        }
        codedOutputStream.q0(iC0);
        while (i2 < list.size()) {
            codedOutputStream.r0(CodedOutputStream.e0(((Long) list.get(i2)).longValue()));
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void z(int i, List list, boolean z) {
        int i2 = 0;
        CodedOutputStream codedOutputStream = this.f15088a;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.p0(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += CodedOutputStream.X(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.q0(iX);
        while (i2 < list.size()) {
            codedOutputStream.k0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
