package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/TaggedEncoder;", "", "Tag", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class TaggedEncoder<Tag> implements Encoder, CompositeEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24823a = new ArrayList();

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void A(PrimitiveArrayDescriptor descriptor, int i, short s) {
        Intrinsics.h(descriptor, "descriptor");
        R(V(descriptor, i), s);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void B(SerialDescriptor descriptor, int i, float f) {
        Intrinsics.h(descriptor, "descriptor");
        M(V(descriptor, i), f);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void C(int i, int i2, SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        O(i2, V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void D(char c) {
        J(W(), c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void E() {
        CollectionsKt.O(this.f24823a);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void F(SerialDescriptor descriptor, int i, SerializationStrategy serializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(serializer, "serializer");
        this.f24823a.add(V(descriptor, i));
        e(serializer, obj);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void G(SerialDescriptor descriptor, int i, double d) {
        Intrinsics.h(descriptor, "descriptor");
        K(V(descriptor, i), d);
    }

    public void H(Object obj, boolean z) {
        T(obj, Boolean.valueOf(z));
    }

    public void I(Object obj, byte b) {
        T(obj, Byte.valueOf(b));
    }

    public void J(Object obj, char c) {
        T(obj, Character.valueOf(c));
    }

    public void K(Object obj, double d) {
        T(obj, Double.valueOf(d));
    }

    public void L(Object obj, SerialDescriptor enumDescriptor, int i) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        T(obj, Integer.valueOf(i));
    }

    public void M(Object obj, float f) {
        T(obj, Float.valueOf(f));
    }

    public Encoder N(Object obj, SerialDescriptor inlineDescriptor) {
        Intrinsics.h(inlineDescriptor, "inlineDescriptor");
        this.f24823a.add(obj);
        return this;
    }

    public void O(int i, Object obj) {
        T(obj, Integer.valueOf(i));
    }

    public void P(long j, Object obj) {
        T(obj, Long.valueOf(j));
    }

    public void Q(Object obj) {
        throw new SerializationException("null is not supported");
    }

    public void R(Object obj, short s) {
        T(obj, Short.valueOf(s));
    }

    public void S(Object obj, String value) {
        Intrinsics.h(value, "value");
        T(obj, value);
    }

    public void T(Object obj, Object value) {
        Intrinsics.h(value, "value");
        StringBuilder sb = new StringBuilder("Non-serializable ");
        Class<?> cls = value.getClass();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        sb.append(reflectionFactory.b(cls));
        sb.append(" is not supported by ");
        sb.append(reflectionFactory.b(getClass()));
        sb.append(" encoder");
        throw new SerializationException(sb.toString());
    }

    public void U(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
    }

    public abstract String V(SerialDescriptor serialDescriptor, int i);

    public final Object W() {
        ArrayList arrayList = this.f24823a;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(CollectionsKt.I(arrayList));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: a */
    public SerializersModule getE() {
        return SerializersModuleKt.f24879a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (!this.f24823a.isEmpty()) {
            W();
        }
        U(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(SerializationStrategy serializer, Object obj) {
        Intrinsics.h(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void f(PrimitiveArrayDescriptor descriptor, int i, char c) {
        Intrinsics.h(descriptor, "descriptor");
        J(V(descriptor, i), c);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void g(byte b) {
        I(W(), b);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final Encoder h(PrimitiveArrayDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return N(V(descriptor, i), descriptor.d(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void i(SerialDescriptor enumDescriptor, int i) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        L(W(), enumDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder j(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return N(W(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void k(SerialDescriptor descriptor, int i, byte b) {
        Intrinsics.h(descriptor, "descriptor");
        I(V(descriptor, i), b);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void l(short s) {
        R(W(), s);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void m(boolean z) {
        H(W(), z);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void n(float f) {
        M(W(), f);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void o(SerialDescriptor descriptor, int i, boolean z) {
        Intrinsics.h(descriptor, "descriptor");
        H(V(descriptor, i), z);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void p(SerialDescriptor descriptor, int i, String value) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(value, "value");
        S(V(descriptor, i), value);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public boolean q(SerialDescriptor serialDescriptor, int i) {
        CompositeEncoder.DefaultImpls.a(serialDescriptor);
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void s(int i) {
        O(i, W());
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void t(SerialDescriptor descriptor, int i, long j) {
        Intrinsics.h(descriptor, "descriptor");
        P(j, V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void u(String value) {
        Intrinsics.h(value, "value");
        S(W(), value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void v(double d) {
        K(W(), d);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void w(SerialDescriptor descriptor, int i, SerializationStrategy serializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(serializer, "serializer");
        this.f24823a.add(V(descriptor, i));
        Encoder.DefaultImpls.a(this, serializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder x(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return b(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void y(long j) {
        P(j, W());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void z() {
        Q(W());
    }
}
