package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lkotlinx/serialization/internal/MapLikeSerializer;", "Key", "Value", "Collection", "", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "", "Lkotlinx/serialization/internal/HashMapSerializer;", "Lkotlinx/serialization/internal/LinkedHashMapSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractCollectionSerializer<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f24806a;
    public final KSerializer b;

    public MapLikeSerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f24806a = kSerializer;
        this.b = kSerializer2;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void f(CompositeDecoder compositeDecoder, int i, Object obj) {
        Map builder = (Map) obj;
        Intrinsics.h(builder, "builder");
        Object objO = compositeDecoder.o(getB(), i, this.f24806a, null);
        int iU = compositeDecoder.u(getB());
        if (iU != i + 1) {
            throw new IllegalArgumentException(androidx.camera.core.impl.b.i(i, iU, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objO);
        KSerializer kSerializer = this.b;
        builder.put(objO, (!zContainsKey || (kSerializer.getB().getB() instanceof PrimitiveKind)) ? compositeDecoder.o(getB(), iU, kSerializer, null) : compositeDecoder.o(getB(), iU, kSerializer, MapsKt.e(objO, builder)));
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        int iD = d(obj);
        SerialDescriptor b = getB();
        CompositeEncoder compositeEncoderX = encoder.x(b, iD);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            compositeEncoderX.F(getB(), i, this.f24806a, key);
            i += 2;
            compositeEncoderX.F(getB(), i2, this.b, value);
        }
        compositeEncoderX.c(b);
    }
}
