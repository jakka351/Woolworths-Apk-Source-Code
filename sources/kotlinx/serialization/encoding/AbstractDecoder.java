package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/AbstractDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractDecoder implements Decoder, CompositeDecoder {
    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte A(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return F();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean B(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return z();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean C() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double D(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return m();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object E(DeserializationStrategy deserializationStrategy) {
        return Decoder.DefaultImpls.a(this, deserializationStrategy);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public byte F() {
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) objG).byteValue();
    }

    public Object G() {
        throw new SerializationException(Reflection.f24268a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return this;
    }

    public void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char e(PrimitiveArrayDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return n();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long f(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return i();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int g(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return t();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public void h() {
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public long i() {
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) objG).longValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final String j(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return p();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Object k(SerialDescriptor descriptor, int i, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(deserializer, "deserializer");
        if (deserializer.getB().b() || C()) {
            return E(deserializer);
        }
        h();
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public short l() {
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) objG).shortValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double m() {
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objG).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char n() {
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objG).charValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public Object o(SerialDescriptor descriptor, int i, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(deserializer, "deserializer");
        return E(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String p() {
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.String");
        return (String) objG;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Decoder q(PrimitiveArrayDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return v(descriptor.d(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int r(SerialDescriptor enumDescriptor) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objG).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int t() {
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objG).intValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder v(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public float w() {
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objG).floatValue();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float x(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return w();
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short y(PrimitiveArrayDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return l();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean z() {
        Object objG = G();
        Intrinsics.f(objG, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objG).booleanValue();
    }
}
