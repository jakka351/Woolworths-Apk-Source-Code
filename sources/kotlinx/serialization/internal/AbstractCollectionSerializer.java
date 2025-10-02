package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/internal/MapLikeSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalSerializationApi
/* loaded from: classes.dex */
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract Iterator c(Object obj);

    public abstract int d(Object obj);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder) {
        return e(decoder);
    }

    public final Object e(Decoder decoder) {
        Object objA = a();
        int iB = b(objA);
        CompositeDecoder compositeDecoderB = decoder.b(getDescriptor());
        while (true) {
            int iU = compositeDecoderB.u(getDescriptor());
            if (iU == -1) {
                compositeDecoderB.c(getDescriptor());
                return h(objA);
            }
            f(compositeDecoderB, iU + iB, objA);
        }
    }

    public abstract void f(CompositeDecoder compositeDecoder, int i, Object obj);

    public abstract Object g(Object obj);

    public abstract Object h(Object obj);
}
