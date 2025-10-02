package kotlinx.serialization.cbor.internal;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.cbor.CborArray;
import kotlinx.serialization.cbor.CborEncoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.modules.SerializersModule;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/cbor/internal/CborWriter;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/cbor/CborEncoder;", "Data", "Lkotlinx/serialization/cbor/internal/DefiniteLengthCborWriter;", "Lkotlinx/serialization/cbor/internal/IndefiniteLengthCborWriter;", "kotlinx-serialization-cbor"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class CborWriter extends AbstractEncoder implements CborEncoder {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24757a;
    public boolean b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/cbor/internal/CborWriter$Data;", "", "kotlinx-serialization-cbor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Data {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void D(char c) {
        EncoderKt.b(J(), c);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public final boolean H(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        J();
        this.f24757a = Intrinsics.c(descriptor.d(i).getB(), StructureKind.CLASS.f24774a);
        this.b = EncodingKt.a(descriptor, i);
        descriptor.g(i);
        List d = descriptor.getD();
        if ((d instanceof Collection) && d.isEmpty()) {
            throw null;
        }
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof CborArray) {
                throw null;
            }
        }
        throw null;
    }

    public abstract ByteArrayOutput J();

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: a */
    public final SerializersModule getE() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(kotlinx.serialization.SerializationStrategy r9, java.lang.Object r10) {
        /*
            r8 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.h(r9, r0)
            boolean r0 = r8.b
            if (r0 == 0) goto Lc7
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r9.getB()
            kotlinx.serialization.internal.ByteArraySerializer r1 = kotlinx.serialization.internal.ByteArraySerializer.c
            kotlinx.serialization.internal.PrimitiveArrayDescriptor r1 = r1.b
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r1)
            java.lang.String r1 = "<this>"
            r2 = 0
            if (r0 == 0) goto La9
            kotlinx.serialization.cbor.internal.ByteArrayOutput r9 = r8.J()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.ByteArray"
            kotlin.jvm.internal.Intrinsics.f(r10, r0)
            byte[] r10 = (byte[]) r10
            kotlin.jvm.internal.Intrinsics.h(r9, r1)
            int r0 = r10.length
            long r0 = (long) r0
            r3 = 0
            int r3 = kotlin.UnsignedKt.a(r0, r3)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r3 < 0) goto L48
            r3 = 23
            long r6 = (long) r3
            long r6 = r6 & r4
            int r3 = kotlin.UnsignedKt.a(r0, r6)
            if (r3 > 0) goto L48
            int r0 = (int) r0
            r0 = r0 | 64
            r9.b(r0)
            goto La4
        L48:
            r3 = 24
            long r6 = (long) r3
            long r6 = r6 & r4
            int r3 = kotlin.UnsignedKt.a(r0, r6)
            if (r3 < 0) goto L66
            r3 = 255(0xff, float:3.57E-43)
            long r6 = (long) r3
            long r6 = r6 & r4
            int r3 = kotlin.UnsignedKt.a(r0, r6)
            if (r3 > 0) goto L66
            r3 = 88
            r9.b(r3)
            int r0 = (int) r0
            r9.b(r0)
            goto La4
        L66:
            r3 = 65535(0xffff, float:9.1834E-41)
            long r6 = (long) r3
            long r6 = r6 & r4
            int r3 = kotlin.UnsignedKt.a(r0, r6)
            if (r3 > 0) goto L82
            r3 = 256(0x100, float:3.59E-43)
            long r6 = (long) r3
            long r6 = r6 & r4
            int r3 = kotlin.UnsignedKt.a(r0, r6)
            if (r3 < 0) goto L82
            r3 = 2
            r4 = 89
            kotlinx.serialization.cbor.internal.EncoderKt.d(r9, r0, r3, r4)
            goto La4
        L82:
            r3 = 65536(0x10000, float:9.18355E-41)
            long r6 = (long) r3
            long r6 = r6 & r4
            int r3 = kotlin.UnsignedKt.a(r0, r6)
            if (r3 < 0) goto L9d
            r3 = -1
            long r6 = (long) r3
            long r3 = r6 & r4
            int r3 = kotlin.UnsignedKt.a(r0, r3)
            if (r3 > 0) goto L9d
            r3 = 4
            r4 = 90
            kotlinx.serialization.cbor.internal.EncoderKt.d(r9, r0, r3, r4)
            goto La4
        L9d:
            r3 = 8
            r4 = 91
            kotlinx.serialization.cbor.internal.EncoderKt.d(r9, r0, r3, r4)
        La4:
            r0 = 6
            kotlinx.serialization.cbor.internal.ByteArrayOutput.c(r9, r10, r2, r0)
            return
        La9:
            boolean r0 = r8.b
            if (r0 != 0) goto Lc0
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r9.getB()
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            boolean r1 = r0.getL()
            if (r1 == 0) goto Lc1
            boolean r0 = kotlinx.serialization.cbor.internal.EncodingKt.a(r0, r2)
            if (r0 == 0) goto Lc1
        Lc0:
            r2 = 1
        Lc1:
            r8.b = r2
            r9.serialize(r8, r10)
            return
        Lc7:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.cbor.internal.CborWriter.e(kotlinx.serialization.SerializationStrategy, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void g(byte b) {
        EncoderKt.b(J(), b);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void i(SerialDescriptor enumDescriptor, int i) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        ByteArrayOutput byteArrayOutputJ = J();
        String value = enumDescriptor.g(i);
        Intrinsics.h(byteArrayOutputJ, "<this>");
        Intrinsics.h(value, "value");
        byte[] bArrU = StringsKt.u(value);
        long length = bArrU.length;
        if (UnsignedKt.a(length, 0L) >= 0 && UnsignedKt.a(length, 23 & 4294967295L) <= 0) {
            byteArrayOutputJ.b(((int) length) | 96);
        } else if (UnsignedKt.a(length, 24 & 4294967295L) >= 0 && UnsignedKt.a(length, 255 & 4294967295L) <= 0) {
            byteArrayOutputJ.b(120);
            byteArrayOutputJ.b((int) length);
        } else if (UnsignedKt.a(length, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4294967295L) <= 0 && UnsignedKt.a(length, 256 & 4294967295L) >= 0) {
            EncoderKt.d(byteArrayOutputJ, length, 2, 121);
        } else if (UnsignedKt.a(length, 65536 & 4294967295L) < 0 || UnsignedKt.a(length, 4294967295L & (-1)) > 0) {
            EncoderKt.d(byteArrayOutputJ, length, 8, 123);
        } else {
            EncoderKt.d(byteArrayOutputJ, length, 4, 122);
        }
        ByteArrayOutput.c(byteArrayOutputJ, bArrU, 0, 6);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void l(short s) {
        EncoderKt.b(J(), s);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void m(boolean z) {
        ByteArrayOutput byteArrayOutputJ = J();
        Intrinsics.h(byteArrayOutputJ, "<this>");
        byteArrayOutputJ.b(z ? 245 : 244);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void n(float f) {
        ByteArrayOutput byteArrayOutputJ = J();
        Intrinsics.h(byteArrayOutputJ, "<this>");
        byteArrayOutputJ.b(250);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        for (int i = 0; i < 4; i++) {
            byteArrayOutputJ.b((iFloatToRawIntBits >> (24 - (i * 8))) & 255);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final boolean q(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void s(int i) {
        EncoderKt.b(J(), i);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void u(String value) {
        Intrinsics.h(value, "value");
        ByteArrayOutput byteArrayOutputJ = J();
        Intrinsics.h(byteArrayOutputJ, "<this>");
        byte[] bArrU = StringsKt.u(value);
        long length = bArrU.length;
        if (UnsignedKt.a(length, 0L) >= 0 && UnsignedKt.a(length, 23 & 4294967295L) <= 0) {
            byteArrayOutputJ.b(((int) length) | 96);
        } else if (UnsignedKt.a(length, 24 & 4294967295L) >= 0 && UnsignedKt.a(length, 255 & 4294967295L) <= 0) {
            byteArrayOutputJ.b(120);
            byteArrayOutputJ.b((int) length);
        } else if (UnsignedKt.a(length, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4294967295L) <= 0 && UnsignedKt.a(length, 256 & 4294967295L) >= 0) {
            EncoderKt.d(byteArrayOutputJ, length, 2, 121);
        } else if (UnsignedKt.a(length, 65536 & 4294967295L) < 0 || UnsignedKt.a(length, (-1) & 4294967295L) > 0) {
            EncoderKt.d(byteArrayOutputJ, length, 8, 123);
        } else {
            EncoderKt.d(byteArrayOutputJ, length, 4, 122);
        }
        ByteArrayOutput.c(byteArrayOutputJ, bArrU, 0, 6);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void v(double d) {
        ByteArrayOutput byteArrayOutputJ = J();
        Intrinsics.h(byteArrayOutputJ, "<this>");
        byteArrayOutputJ.b(251);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        for (int i = 0; i < 8; i++) {
            byteArrayOutputJ.b((int) ((jDoubleToRawLongBits >> (56 - (i * 8))) & 255));
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void y(long j) {
        EncoderKt.b(J(), j);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void z() {
        if (this.f24757a) {
            ByteArrayOutput byteArrayOutputJ = J();
            Intrinsics.h(byteArrayOutputJ, "<this>");
            byteArrayOutputJ.b(160);
        } else {
            ByteArrayOutput byteArrayOutputJ2 = J();
            Intrinsics.h(byteArrayOutputJ2, "<this>");
            byteArrayOutputJ2.b(246);
        }
    }
}
