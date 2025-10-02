package androidx.os.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.os.BundleKt;
import androidx.os.SavedStateWriter;
import androidx.os.SavedStateWriterKt;
import androidx.os.serialization.serializers.CharSequenceArraySerializer;
import androidx.os.serialization.serializers.CharSequenceListSerializer;
import androidx.os.serialization.serializers.CharSequenceSerializer;
import androidx.os.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.os.serialization.serializers.DefaultParcelableSerializer;
import androidx.os.serialization.serializers.IBinderSerializer;
import androidx.os.serialization.serializers.ParcelableArraySerializer;
import androidx.os.serialization.serializers.ParcelableListSerializer;
import androidx.os.serialization.serializers.SparseParcelableArraySerializer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/savedstate/serialization/SavedStateEncoder;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SavedStateEncoder extends AbstractEncoder {

    /* renamed from: a, reason: collision with root package name */
    public String f3740a;

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void D(char c) {
        Intrinsics.h(null, "source");
        String key = this.f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public final boolean H(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        this.f3740a = descriptor.g(i);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: a */
    public final SerializersModule getF24851a() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final CompositeEncoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (Intrinsics.c(this.f3740a, "")) {
            throw null;
        }
        SavedStateWriter.d(null, this.f3740a, BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0)));
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void e(SerializationStrategy serializer, Object obj) {
        Intrinsics.h(serializer, "serializer");
        SerialDescriptor descriptor = serializer.getB();
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.f3737a)) {
            CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.f3743a;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            CharSequenceSerializer.b(this, (CharSequence) obj);
            return;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.b)) {
            DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.b;
            Intrinsics.f(obj, "null cannot be cast to non-null type android.os.Parcelable");
            defaultParcelableSerializer.serialize(this, (Parcelable) obj);
            return;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.c)) {
            DefaultJavaSerializableSerializer defaultJavaSerializableSerializer = DefaultJavaSerializableSerializer.b;
            Intrinsics.f(obj, "null cannot be cast to non-null type java.io.Serializable");
            defaultJavaSerializableSerializer.serialize(this, (Serializable) obj);
            return;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.d)) {
            SerialDescriptorImpl serialDescriptorImpl = IBinderSerializer.f3744a;
            Intrinsics.f(obj, "null cannot be cast to non-null type android.os.IBinder");
            IBinderSerializer.b(this, (IBinder) obj);
            return;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.i) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.j)) {
            SerialDescriptorImpl serialDescriptorImpl2 = CharSequenceArraySerializer.f3741a;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            CharSequenceArraySerializer.b(this, (CharSequence[]) obj);
            return;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.k) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.l)) {
            CharSequenceListSerializer charSequenceListSerializer = CharSequenceListSerializer.f3742a;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            charSequenceListSerializer.serialize(this, (List) obj);
            return;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.e) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.f)) {
            SerialDescriptorImpl serialDescriptorImpl3 = ParcelableArraySerializer.f3746a;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            ParcelableArraySerializer.b(this, (Parcelable[]) obj);
            return;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.g) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.h)) {
            ParcelableListSerializer parcelableListSerializer = ParcelableListSerializer.f3747a;
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            parcelableListSerializer.serialize(this, (List) obj);
            return;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.m) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.n) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.o)) {
            SparseParcelableArraySerializer sparseParcelableArraySerializer = SparseParcelableArraySerializer.f3755a;
            Intrinsics.f(obj, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
            sparseParcelableArraySerializer.serialize(this, (SparseArray) obj);
            return;
        }
        SerialDescriptor descriptor2 = serializer.getB();
        if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.f3736a)) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            String key = this.f3740a;
            Intrinsics.h(key, "key");
            SavedStateWriterKt.a((List) obj);
            throw null;
        }
        if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.b)) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            SavedStateWriter.g(null, this.f3740a, (List) obj);
            return;
        }
        if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.c)) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.BooleanArray");
            String key2 = this.f3740a;
            Intrinsics.h(key2, "key");
            throw null;
        }
        if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.d)) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.CharArray");
            String key3 = this.f3740a;
            Intrinsics.h(key3, "key");
            throw null;
        }
        if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.e)) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.DoubleArray");
            String key4 = this.f3740a;
            Intrinsics.h(key4, "key");
            throw null;
        }
        if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.f)) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.FloatArray");
            String key5 = this.f3740a;
            Intrinsics.h(key5, "key");
            throw null;
        }
        if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.g)) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.IntArray");
            SavedStateWriter.a(null, this.f3740a, (int[]) obj);
        } else {
            if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.h)) {
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.LongArray");
                String key6 = this.f3740a;
                Intrinsics.h(key6, "key");
                throw null;
            }
            if (!Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.i)) {
                serializer.serialize(this, obj);
                return;
            }
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            SavedStateWriter.f(null, this.f3740a, (String[]) obj);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void g(byte b) {
        String key = this.f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void i(SerialDescriptor enumDescriptor, int i) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        String key = this.f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void l(short s) {
        String key = this.f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void m(boolean z) {
        String key = this.f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void n(float f) {
        String key = this.f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public final boolean q(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void s(int i) {
        String key = this.f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void u(String value) {
        Intrinsics.h(value, "value");
        Intrinsics.h(null, "source");
        SavedStateWriter.e(null, this.f3740a, value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void v(double d) {
        String key = this.f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void y(long j) {
        String key = this.f3740a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void z() {
        Intrinsics.h(null, "source");
        SavedStateWriter.b(null, this.f3740a);
    }
}
