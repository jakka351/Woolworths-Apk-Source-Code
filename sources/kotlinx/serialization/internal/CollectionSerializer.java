package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/CollectionSerializer;", "E", "", "C", "B", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public abstract class CollectionSerializer<E, C extends Collection<? extends E>, B> extends CollectionLikeSerializer<E, C, B> {
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.h(collection, "<this>");
        return collection.iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.h(collection, "<this>");
        return collection.size();
    }
}
