package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/TaggedDecoder;", "", "Tag", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class TaggedDecoder<Tag> implements Decoder, CompositeDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24822a = new ArrayList();
    public boolean b;

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final byte A(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return H(T(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final boolean B(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return G(T(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean C() {
        Object objP = CollectionsKt.P(this.f24822a);
        if (objP == null) {
            return false;
        }
        return P(objP);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final double D(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return J(T(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object E(DeserializationStrategy deserializationStrategy) {
        return Decoder.DefaultImpls.a(this, deserializationStrategy);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte F() {
        return H(U());
    }

    public boolean G(Object obj) {
        S();
        throw null;
    }

    public byte H(Object obj) {
        S();
        throw null;
    }

    public char I(Object obj) {
        S();
        throw null;
    }

    public double J(Object obj) {
        S();
        throw null;
    }

    public int K(Object obj, SerialDescriptor enumDescriptor) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        S();
        throw null;
    }

    public float L(Object obj) {
        S();
        throw null;
    }

    public Decoder M(Object obj, SerialDescriptor inlineDescriptor) {
        Intrinsics.h(inlineDescriptor, "inlineDescriptor");
        this.f24822a.add(obj);
        return this;
    }

    public int N(Object obj) {
        S();
        throw null;
    }

    public long O(Object obj) {
        S();
        throw null;
    }

    public boolean P(Object obj) {
        return true;
    }

    public short Q(Object obj) {
        S();
        throw null;
    }

    public String R(Object obj) {
        S();
        throw null;
    }

    public final void S() {
        throw new SerializationException(Reflection.f24268a.b(getClass()) + " can't retrieve untyped values");
    }

    public abstract String T(SerialDescriptor serialDescriptor, int i);

    public final Object U() {
        ArrayList arrayList = this.f24822a;
        Object objRemove = arrayList.remove(CollectionsKt.I(arrayList));
        this.b = true;
        return objRemove;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    /* renamed from: a */
    public SerializersModule getD() {
        return SerializersModuleKt.f24879a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public CompositeDecoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final char e(PrimitiveArrayDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return I(T(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final long f(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return O(T(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int g(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return N(T(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final void h() {
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long i() {
        return O(U());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final String j(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return R(T(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Object k(SerialDescriptor descriptor, int i, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(deserializer, "deserializer");
        this.f24822a.add(T(descriptor, i));
        Object objE = (deserializer.getB().b() || C()) ? E(deserializer) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return objE;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short l() {
        return Q(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double m() {
        return J(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char n() {
        return I(U());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Object o(SerialDescriptor descriptor, int i, DeserializationStrategy deserializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(deserializer, "deserializer");
        this.f24822a.add(T(descriptor, i));
        Intrinsics.h(deserializer, "deserializer");
        Object objE = E(deserializer);
        if (!this.b) {
            U();
        }
        this.b = false;
        return objE;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String p() {
        return R(U());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final Decoder q(PrimitiveArrayDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return M(T(descriptor, i), descriptor.d(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int r(SerialDescriptor enumDescriptor) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        return K(U(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int t() {
        return N(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder v(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return M(U(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float w() {
        return L(U());
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final float x(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return L(T(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final short y(PrimitiveArrayDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return Q(T(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean z() {
        return G(U());
    }
}
