package androidx.os.serialization;

import androidx.os.SavedStateReader;
import androidx.os.serialization.serializers.CharSequenceArraySerializer;
import androidx.os.serialization.serializers.CharSequenceListSerializer;
import androidx.os.serialization.serializers.CharSequenceSerializer;
import androidx.os.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.os.serialization.serializers.DefaultParcelableSerializer;
import androidx.os.serialization.serializers.IBinderSerializer;
import androidx.os.serialization.serializers.ParcelableArraySerializer;
import androidx.os.serialization.serializers.ParcelableListSerializer;
import androidx.os.serialization.serializers.SparseParcelableArraySerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/savedstate/serialization/SavedStateDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SavedStateDecoder extends AbstractDecoder {

    /* renamed from: a, reason: collision with root package name */
    public String f3739a;
    public int b;

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        Intrinsics.h(null, "source");
        return !SavedStateReader.m(null, this.f3739a);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final Object E(DeserializationStrategy deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        SerialDescriptor descriptor = deserializer.getB();
        Object objK = null;
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.f3737a)) {
            CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.f3743a;
            CharSequenceSerializer.a(this);
            throw null;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.b)) {
            DefaultParcelableSerializer.b.a(this);
            throw null;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.c)) {
            DefaultJavaSerializableSerializer.b.a(this);
            throw null;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.d)) {
            IBinderSerializer.a(this);
            throw null;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.i) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.j)) {
            CharSequenceArraySerializer.a(this);
            throw null;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.k) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.l)) {
            CharSequenceListSerializer.f3742a.a(this);
            throw null;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.e)) {
            ParcelableArraySerializer.a(this);
            throw null;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.f)) {
            ParcelableArraySerializer.a(this);
            throw null;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.g) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.h)) {
            ParcelableListSerializer.f3747a.a(this);
            throw null;
        }
        if (Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.m) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.n) || Intrinsics.c(descriptor, SavedStateCodecUtils_androidKt.o)) {
            SparseParcelableArraySerializer.f3755a.a(this);
            throw null;
        }
        SerialDescriptor descriptor2 = deserializer.getB();
        if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.f3736a)) {
            Intrinsics.h(null, "source");
            String key = this.f3739a;
            Intrinsics.h(key, "key");
            throw null;
        }
        if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.b)) {
            Intrinsics.h(null, "source");
            objK = SavedStateReader.l(null, this.f3739a);
        } else {
            if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.c)) {
                Intrinsics.h(null, "source");
                String key2 = this.f3739a;
                Intrinsics.h(key2, "key");
                throw null;
            }
            if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.d)) {
                Intrinsics.h(null, "source");
                String key3 = this.f3739a;
                Intrinsics.h(key3, "key");
                throw null;
            }
            if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.e)) {
                Intrinsics.h(null, "source");
                String key4 = this.f3739a;
                Intrinsics.h(key4, "key");
                throw null;
            }
            if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.f)) {
                Intrinsics.h(null, "source");
                String key5 = this.f3739a;
                Intrinsics.h(key5, "key");
                throw null;
            }
            if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.g)) {
                Intrinsics.h(null, "source");
                objK = SavedStateReader.g(null, this.f3739a);
            } else {
                if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.h)) {
                    Intrinsics.h(null, "source");
                    String key6 = this.f3739a;
                    Intrinsics.h(key6, "key");
                    throw null;
                }
                if (Intrinsics.c(descriptor2, SavedStateCodecUtilsKt.i)) {
                    Intrinsics.h(null, "source");
                    objK = SavedStateReader.k(null, this.f3739a);
                }
            }
        }
        return objK == null ? deserializer.deserialize(this) : objK;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final byte F() {
        Intrinsics.h(null, "source");
        return (byte) SavedStateReader.f(null, this.f3739a);
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    /* renamed from: a */
    public final SerializersModule getB() {
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (Intrinsics.c(this.f3739a, "")) {
            return this;
        }
        Intrinsics.h(null, "source");
        SavedStateReader.i(null, this.f3739a);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final long i() {
        Intrinsics.h(null, "source");
        return SavedStateReader.h(null, this.f3739a);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final short l() {
        Intrinsics.h(null, "source");
        return (short) SavedStateReader.f(null, this.f3739a);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final double m() {
        Intrinsics.h(null, "source");
        return SavedStateReader.d(null, this.f3739a);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final char n() {
        Intrinsics.h(null, "source");
        String key = this.f3739a;
        Intrinsics.h(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final String p() {
        Intrinsics.h(null, "source");
        return SavedStateReader.j(null, this.f3739a);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int r(SerialDescriptor enumDescriptor) {
        Intrinsics.h(enumDescriptor, "enumDescriptor");
        Intrinsics.h(null, "source");
        return SavedStateReader.f(null, this.f3739a);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final int t() {
        Intrinsics.h(null, "source");
        return SavedStateReader.f(null, this.f3739a);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int u(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (Intrinsics.c(descriptor.getB(), StructureKind.LIST.f24775a) || Intrinsics.c(descriptor.getB(), StructureKind.MAP.f24776a)) {
            Intrinsics.h(null, "source");
            throw null;
        }
        int c = descriptor.getC();
        int i = this.b;
        if (i < c && descriptor.j(i)) {
            int i2 = this.b;
            Intrinsics.h(null, "source");
            String key = descriptor.g(i2);
            Intrinsics.h(key, "key");
            throw null;
        }
        int i3 = this.b;
        if (i3 >= c) {
            return -1;
        }
        this.f3739a = descriptor.g(i3);
        int i4 = this.b;
        this.b = i4 + 1;
        return i4;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final float w() {
        Intrinsics.h(null, "source");
        return SavedStateReader.e(null, this.f3739a);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean z() {
        Intrinsics.h(null, "source");
        return SavedStateReader.c(null, this.f3739a);
    }
}
