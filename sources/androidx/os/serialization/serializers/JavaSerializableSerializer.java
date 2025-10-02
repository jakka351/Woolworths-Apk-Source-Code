package androidx.os.serialization.serializers;

import androidx.core.os.BundleCompat;
import androidx.os.serialization.SavedStateDecoder;
import androidx.os.serialization.SavedStateEncoder;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/serialization/serializers/JavaSerializableSerializer;", "Ljava/io/Serializable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/KSerializer;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class JavaSerializableSerializer<T extends Serializable> implements KSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptorImpl f3745a = SerialDescriptorsKt.c("java.io.Serializable", new SerialDescriptor[0]);

    public final Serializable a(Decoder decoder) {
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.a(this.f3745a.f24771a, decoder).toString());
        }
        Intrinsics.h(null, "source");
        String key = ((SavedStateDecoder) decoder).f3739a;
        KClass kClassB = Reflection.f24268a.b(Serializable.class);
        Intrinsics.h(key, "key");
        BundleCompat.d(null, key, JvmClassMappingKt.b(kClassB));
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(Encoder encoder, Serializable value) {
        Intrinsics.h(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.b(this.f3745a.f24771a, encoder).toString());
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
    public final SerialDescriptor getDescriptor() {
        return this.f3745a;
    }
}
