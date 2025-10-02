package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Encoder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void a(Encoder encoder, SerializationStrategy serializer, Object obj) {
            Intrinsics.h(serializer, "serializer");
            if (serializer.getDescriptor().b()) {
                encoder.e(serializer, obj);
            } else if (obj == null) {
                encoder.z();
            } else {
                encoder.E();
                encoder.e(serializer, obj);
            }
        }
    }

    void D(char c);

    void E();

    SerializersModule a();

    CompositeEncoder b(SerialDescriptor serialDescriptor);

    void e(SerializationStrategy serializationStrategy, Object obj);

    void g(byte b);

    void i(SerialDescriptor serialDescriptor, int i);

    Encoder j(SerialDescriptor serialDescriptor);

    void l(short s);

    void m(boolean z);

    void n(float f);

    void s(int i);

    void u(String str);

    void v(double d);

    CompositeEncoder x(SerialDescriptor serialDescriptor, int i);

    void y(long j);

    void z();
}
