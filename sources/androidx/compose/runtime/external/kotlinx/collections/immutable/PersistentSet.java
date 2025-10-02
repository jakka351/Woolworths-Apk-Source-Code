package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Builder", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, KMutableSet {
        PersistentSet build();
    }

    @Override // java.util.Set, java.util.Collection
    PersistentSet add(Object obj);

    @Override // java.util.Set, java.util.Collection
    PersistentSet addAll(Collection collection);

    Builder builder();

    @Override // java.util.Set, java.util.Collection
    PersistentSet remove(Object obj);

    @Override // java.util.Set, java.util.Collection
    PersistentSet removeAll(Collection collection);
}
