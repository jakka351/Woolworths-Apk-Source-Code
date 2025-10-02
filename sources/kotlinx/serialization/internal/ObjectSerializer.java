package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/ObjectSerializer;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ObjectSerializer<T> implements KSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24811a;
    public final List b;
    public final Object c;

    public ObjectSerializer(String str, Object objectInstance) {
        Intrinsics.h(objectInstance, "objectInstance");
        this.f24811a = objectInstance;
        this.b = EmptyList.d;
        this.c = LazyKt.a(LazyThreadSafetyMode.d, new coil3.gif.a(11, str, this));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderB = decoder.b(descriptor);
        int iU = compositeDecoderB.u(getDescriptor());
        if (iU != -1) {
            throw new SerializationException(YU.a.d(iU, "Unexpected index "));
        }
        compositeDecoderB.c(descriptor);
        return this.f24811a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getD();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.h(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectSerializer(String str, Object objectInstance, Annotation[] annotationArr) {
        this(str, objectInstance);
        Intrinsics.h(objectInstance, "objectInstance");
        this.b = ArraysKt.f(annotationArr);
    }
}
