package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Lkotlinx/serialization/internal/CollectionSerializer;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlinx/serialization/internal/ReferenceArraySerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f24788a;

    public CollectionLikeSerializer(KSerializer kSerializer) {
        this.f24788a = kSerializer;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void f(CompositeDecoder compositeDecoder, int i, Object obj) {
        i(i, obj, compositeDecoder.o(getDescriptor(), i, this.f24788a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Object obj) {
        int iD = d(obj);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderX = encoder.x(descriptor, iD);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            compositeEncoderX.F(getDescriptor(), i, this.f24788a, itC.next());
        }
        compositeEncoderX.c(descriptor);
    }
}
