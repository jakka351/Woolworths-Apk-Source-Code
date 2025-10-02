package androidx.os.serialization.serializers;

import android.os.Bundle;
import androidx.os.SavedStateReader;
import androidx.os.SavedStateWriter;
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

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/serialization/serializers/SavedStateSerializer;", "Lkotlinx/serialization/KSerializer;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SavedStateSerializer implements KSerializer<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public static final SavedStateSerializer f3749a = new SavedStateSerializer();
    public static final SerialDescriptorImpl b = SerialDescriptorsKt.c("androidx.savedstate.SavedState", new SerialDescriptor[0]);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.a(b.f24771a, decoder).toString());
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) decoder;
        if (Intrinsics.c(savedStateDecoder.f3739a, "")) {
            return null;
        }
        Intrinsics.h(null, "source");
        return SavedStateReader.i(null, savedStateDecoder.f3739a);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Bundle value = (Bundle) obj;
        Intrinsics.h(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.b(b.f24771a, encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        if (Intrinsics.c(savedStateEncoder.f3740a, "")) {
            throw null;
        }
        SavedStateWriter.d(null, savedStateEncoder.f3740a, value);
    }
}
