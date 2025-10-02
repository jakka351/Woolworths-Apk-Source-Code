package androidx.os.serialization.serializers;

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

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0000\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/serialization/serializers/CharSequenceArraySerializer;", "Lkotlinx/serialization/KSerializer;", "", "", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CharSequenceArraySerializer implements KSerializer<CharSequence[]> {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialDescriptorImpl f3741a = SerialDescriptorsKt.c("kotlin.Array<kotlin.CharSequence>", new SerialDescriptor[0]);

    public static CharSequence[] a(Decoder decoder) {
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.a(f3741a.f24771a, decoder).toString());
        }
        Intrinsics.h(null, "source");
        String key = ((SavedStateDecoder) decoder).f3739a;
        Intrinsics.h(key, "key");
        throw null;
    }

    public static void b(Encoder encoder, CharSequence[] value) {
        Intrinsics.h(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.b(f3741a.f24771a, encoder).toString());
        }
        String key = ((SavedStateEncoder) encoder).f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        a(decoder);
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return f3741a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, (CharSequence[]) obj);
    }
}
