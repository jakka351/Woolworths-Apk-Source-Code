package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Decoder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static Object a(Decoder decoder, DeserializationStrategy deserializer) {
            Intrinsics.h(deserializer, "deserializer");
            return deserializer.deserialize(decoder);
        }
    }

    boolean C();

    Object E(DeserializationStrategy deserializationStrategy);

    byte F();

    SerializersModule a();

    CompositeDecoder b(SerialDescriptor serialDescriptor);

    void h();

    long i();

    short l();

    double m();

    char n();

    String p();

    int r(SerialDescriptor serialDescriptor);

    int t();

    Decoder v(SerialDescriptor serialDescriptor);

    float w();

    boolean z();
}
