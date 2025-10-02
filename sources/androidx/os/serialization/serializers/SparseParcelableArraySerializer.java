package androidx.os.serialization.serializers;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.os.BundleCompat;
import androidx.os.serialization.SavedStateDecoder;
import androidx.os.serialization.SavedStateEncoder;
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

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseParcelableArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SparseParcelableArraySerializer implements KSerializer<SparseArray<Parcelable>> {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseParcelableArraySerializer f3755a = new SparseParcelableArraySerializer();
    public static final SerialDescriptorImpl b = SerialDescriptorsKt.c("android.util.SparseArray<android.os.Parcelable>", new SerialDescriptor[0]);

    public final SparseArray a(Decoder decoder) {
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.a(b.f24771a, decoder).toString());
        }
        Intrinsics.h(null, "source");
        String key = ((SavedStateDecoder) decoder).f3739a;
        KClass kClassB = Reflection.f24268a.b(Parcelable.class);
        Intrinsics.h(key, "key");
        BundleCompat.e(null, key, JvmClassMappingKt.b(kClassB));
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(Encoder encoder, SparseArray value) {
        Intrinsics.h(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.b(b.f24771a, encoder).toString());
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
        return b;
    }
}
