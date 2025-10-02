package androidx.os.serialization.serializers;

import android.util.Size;
import androidx.os.serialization.SavedStateDecoder;
import androidx.os.serialization.SavedStateEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/serialization/serializers/SizeSerializer;", "Lkotlinx/serialization/KSerializer;", "Landroid/util/Size;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SizeSerializer implements KSerializer<Size> {

    /* renamed from: a, reason: collision with root package name */
    public static final SizeSerializer f3751a = new SizeSerializer();
    public static final SerialDescriptorImpl b = SerialDescriptorsKt.c("android.util.Size", new SerialDescriptor[0]);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.a(b.f24771a, decoder).toString());
        }
        Intrinsics.h(null, "source");
        String key = ((SavedStateDecoder) decoder).f3739a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Size value = (Size) obj;
        Intrinsics.h(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.b(b.f24771a, encoder).toString());
        }
        String key = ((SavedStateEncoder) encoder).f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }
}
