package androidx.os.serialization.serializers;

import android.os.IBinder;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/serialization/serializers/IBinderSerializer;", "Lkotlinx/serialization/KSerializer;", "Landroid/os/IBinder;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class IBinderSerializer implements KSerializer<IBinder> {

    /* renamed from: a, reason: collision with root package name */
    public static final SerialDescriptorImpl f3744a = SerialDescriptorsKt.c("android.os.IBinder", new SerialDescriptor[0]);

    public static IBinder a(Decoder decoder) {
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.a(f3744a.f24771a, decoder).toString());
        }
        Intrinsics.h(null, "source");
        String key = ((SavedStateDecoder) decoder).f3739a;
        Intrinsics.h(key, "key");
        throw null;
    }

    public static void b(Encoder encoder, IBinder value) {
        Intrinsics.h(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.b(f3744a.f24771a, encoder).toString());
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
        return f3744a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        b(encoder, (IBinder) obj);
    }
}
