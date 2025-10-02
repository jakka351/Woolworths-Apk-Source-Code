package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/encoding/CompositeEncoder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CompositeEncoder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static void a(SerialDescriptor descriptor) {
            Intrinsics.h(descriptor, "descriptor");
        }
    }

    void A(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, short s);

    void B(SerialDescriptor serialDescriptor, int i, float f);

    void C(int i, int i2, SerialDescriptor serialDescriptor);

    void F(SerialDescriptor serialDescriptor, int i, SerializationStrategy serializationStrategy, Object obj);

    void G(SerialDescriptor serialDescriptor, int i, double d);

    void c(SerialDescriptor serialDescriptor);

    void f(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, char c);

    Encoder h(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    void k(SerialDescriptor serialDescriptor, int i, byte b);

    void o(SerialDescriptor serialDescriptor, int i, boolean z);

    void p(SerialDescriptor serialDescriptor, int i, String str);

    boolean q(SerialDescriptor serialDescriptor, int i);

    void t(SerialDescriptor serialDescriptor, int i, long j);

    void w(SerialDescriptor serialDescriptor, int i, SerializationStrategy serializationStrategy, Object obj);
}
