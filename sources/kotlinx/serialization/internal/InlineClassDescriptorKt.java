package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InlineClassDescriptorKt {
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.serialization.internal.InlineClassDescriptorKt$InlinePrimitiveDescriptor$1] */
    public static final InlineClassDescriptor a(String str, final KSerializer kSerializer) {
        return new InlineClassDescriptor(str, new GeneratedSerializer<Object>() { // from class: kotlinx.serialization.internal.InlineClassDescriptorKt$InlinePrimitiveDescriptor$1
            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{kSerializer};
            }

            @Override // kotlinx.serialization.DeserializationStrategy
            public final Object deserialize(Decoder decoder) {
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
            public final SerialDescriptor getDescriptor() {
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.SerializationStrategy
            public final void serialize(Encoder encoder, Object obj) {
                throw new IllegalStateException("unsupported");
            }

            @Override // kotlinx.serialization.internal.GeneratedSerializer
            public final KSerializer[] typeParametersSerializers() {
                return PluginHelperInterfacesKt.f24815a;
            }
        });
    }
}
