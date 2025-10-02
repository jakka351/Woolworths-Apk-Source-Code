package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/CompositeDecoder;", "", "Companion", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CompositeDecoder {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/encoding/CompositeDecoder$Companion;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    byte A(SerialDescriptor serialDescriptor, int i);

    boolean B(SerialDescriptor serialDescriptor, int i);

    double D(SerialDescriptor serialDescriptor, int i);

    SerializersModule a();

    void c(SerialDescriptor serialDescriptor);

    char e(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    long f(SerialDescriptor serialDescriptor, int i);

    int g(SerialDescriptor serialDescriptor, int i);

    String j(SerialDescriptor serialDescriptor, int i);

    Object k(SerialDescriptor serialDescriptor, int i, DeserializationStrategy deserializationStrategy, Object obj);

    Object o(SerialDescriptor serialDescriptor, int i, DeserializationStrategy deserializationStrategy, Object obj);

    Decoder q(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    int u(SerialDescriptor serialDescriptor);

    float x(SerialDescriptor serialDescriptor, int i);

    short y(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);
}
