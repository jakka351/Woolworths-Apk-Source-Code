package kotlinx.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/SealedClassSerializer;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f24751a;
    public final List b;
    public final Object c;
    public final Map d;
    public final LinkedHashMap e;

    public SealedClassSerializer(String str, KClass baseClass, KClass[] kClassArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        Intrinsics.h(baseClass, "baseClass");
        this.f24751a = baseClass;
        this.b = EmptyList.d;
        this.c = LazyKt.a(LazyThreadSafetyMode.d, new coil3.gif.a(9, str, this));
        if (kClassArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + baseClass.B() + " should be marked @Serializable");
        }
        Map mapP = MapsKt.p(ArraysKt.t0(kClassArr, kSerializerArr));
        this.d = mapP;
        Set<Map.Entry> setEntrySet = mapP.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String b = ((KSerializer) entry.getValue()).getB().getF24814a();
            Object obj = linkedHashMap.get(b);
            if (obj == null) {
                linkedHashMap.containsKey(b);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f24751a + "' have the same serial name '" + b + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(b, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        this.b = ArraysKt.f(annotationArr);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final DeserializationStrategy a(CompositeDecoder compositeDecoder, String str) {
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : compositeDecoder.getB().d(getF24750a(), str);
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final SerializationStrategy b(Encoder encoder, Object value) {
        Intrinsics.h(value, "value");
        KSerializer kSerializer = (KSerializer) this.d.get(Reflection.f24268a.b(value.getClass()));
        KSerializer kSerializerB = kSerializer != null ? kSerializer : super.b(encoder, value);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        return null;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    /* renamed from: c, reason: from getter */
    public final KClass getF24750a() {
        return this.f24751a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return (SerialDescriptor) this.c.getD();
    }
}
