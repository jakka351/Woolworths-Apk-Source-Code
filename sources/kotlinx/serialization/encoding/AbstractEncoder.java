package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.NoOpEncoder;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public abstract class AbstractEncoder implements Encoder, CompositeEncoder {
    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void A(PrimitiveArrayDescriptor descriptor, int i, short s) {
        Intrinsics.h(descriptor, "descriptor");
        if (H(descriptor, i)) {
            l(s);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void B(SerialDescriptor descriptor, int i, float f) {
        Intrinsics.h(descriptor, "descriptor");
        if (H(descriptor, i)) {
            n(f);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void C(int i, int i2, SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (H(descriptor, i)) {
            s(i2);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void D(char c) {
        I(Character.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final void E() {
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void F(SerialDescriptor descriptor, int i, SerializationStrategy serializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(serializer, "serializer");
        if (H(descriptor, i)) {
            e(serializer, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void G(SerialDescriptor descriptor, int i, double d) {
        Intrinsics.h(descriptor, "descriptor");
        if (H(descriptor, i)) {
            v(d);
        }
    }

    public boolean H(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return true;
    }

    public void I(Object value) {
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

    @Override // kotlinx.serialization.encoding.Encoder
    public CompositeEncoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return this;
    }

    public void c(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(SerializationStrategy serializer, Object obj) {
        Intrinsics.h(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void f(PrimitiveArrayDescriptor descriptor, int i, char c) {
        Intrinsics.h(descriptor, "descriptor");
        if (H(descriptor, i)) {
            D(c);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void g(byte b) {
        I(Byte.valueOf(b));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final Encoder h(PrimitiveArrayDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return H(descriptor, i) ? j(descriptor.d(i)) : NoOpEncoder.f24807a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void i(SerialDescriptor enumDescriptor, int i) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        I(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder j(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void k(SerialDescriptor descriptor, int i, byte b) {
        Intrinsics.h(descriptor, "descriptor");
        if (H(descriptor, i)) {
            g(b);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void l(short s) {
        I(Short.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void m(boolean z) {
        I(Boolean.valueOf(z));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void n(float f) {
        I(Float.valueOf(f));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void o(SerialDescriptor descriptor, int i, boolean z) {
        Intrinsics.h(descriptor, "descriptor");
        if (H(descriptor, i)) {
            m(z);
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void p(SerialDescriptor descriptor, int i, String value) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(value, "value");
        if (H(descriptor, i)) {
            u(value);
        }
    }

    public boolean q(SerialDescriptor serialDescriptor, int i) {
        CompositeEncoder.DefaultImpls.a(serialDescriptor);
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void s(int i) {
        I(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public final void t(SerialDescriptor descriptor, int i, long j) {
        Intrinsics.h(descriptor, "descriptor");
        if (H(descriptor, i)) {
            y(j);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void u(String value) {
        Intrinsics.h(value, "value");
        I(value);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void v(double d) {
        I(Double.valueOf(d));
    }

    @Override // kotlinx.serialization.encoding.CompositeEncoder
    public void w(SerialDescriptor descriptor, int i, SerializationStrategy serializer, Object obj) {
        Intrinsics.h(descriptor, "descriptor");
        Intrinsics.h(serializer, "serializer");
        if (H(descriptor, i)) {
            Encoder.DefaultImpls.a(this, serializer, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder x(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        return b(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void y(long j) {
        I(Long.valueOf(j));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void z() {
        throw new SerializationException("'null' is not supported by default");
    }
}
