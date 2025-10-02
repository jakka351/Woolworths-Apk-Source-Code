package kotlinx.serialization.cbor.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.cbor.CborDecoder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/cbor/internal/CborReader;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/cbor/CborDecoder;", "kotlinx-serialization-cbor"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class CborReader extends AbstractDecoder implements CborDecoder {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24756a;

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(kotlinx.serialization.DeserializationStrategy r4) {
        /*
            r3 = this;
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.Intrinsics.h(r4, r0)
            boolean r0 = r3.f24756a
            r1 = 0
            if (r0 == 0) goto L3b
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getB()
            kotlinx.serialization.internal.ByteArraySerializer r2 = kotlinx.serialization.internal.ByteArraySerializer.c
            kotlinx.serialization.internal.PrimitiveArrayDescriptor r2 = r2.b
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r0, r2)
            if (r0 != 0) goto L3a
            boolean r0 = r3.f24756a
            if (r0 != 0) goto L32
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getB()
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            boolean r1 = r0.getL()
            r2 = 0
            if (r1 == 0) goto L33
            boolean r0 = kotlinx.serialization.cbor.internal.EncodingKt.a(r0, r2)
            if (r0 == 0) goto L33
        L32:
            r2 = 1
        L33:
            r3.f24756a = r2
            java.lang.Object r4 = r4.deserialize(r3)
            return r4
        L3a:
            throw r1
        L3b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.cbor.internal.CborReader.E(kotlinx.serialization.DeserializationStrategy):java.lang.Object");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final byte F() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    /* renamed from: a */
    public final SerializersModule getB() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder b(SerialDescriptor serialDescriptor) {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public final void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final void h() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final long i() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final short l() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final double m() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final char n() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final String p() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int r(SerialDescriptor enumDescriptor) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int t() {
        throw null;
    }

    public int u(SerialDescriptor serialDescriptor) {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final float w() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean z() {
        throw null;
    }
}
