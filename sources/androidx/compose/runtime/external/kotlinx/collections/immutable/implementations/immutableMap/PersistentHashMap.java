package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class PersistentHashMap<K, V> extends AbstractMap<K, V> implements PersistentMap<K, V> {
    public static final PersistentHashMap h = new PersistentHashMap(TrieNode.e, 0);
    public final TrieNode f;
    public final int g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public PersistentHashMap(TrieNode trieNode, int i) {
        this.f = trieNode;
        this.g = i;
    }

    @Override // kotlin.collections.AbstractMap
    public final Set b() {
        return new PersistentHashMapEntries(this);
    }

    @Override // kotlin.collections.AbstractMap
    public final Set c() {
        return new PersistentHashMapKeys(this);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMap
    /* renamed from: d, reason: from getter */
    public final int getG() {
        return this.g;
    }

    @Override // kotlin.collections.AbstractMap
    public final Collection e() {
        return new PersistentHashMapValues(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public PersistentHashMapBuilder builder() {
        return new PersistentHashMapBuilder(this);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final PersistentHashMap h(Object obj, Links links) {
        TrieNode.ModificationResult modificationResultU = this.f.u(obj, obj != null ? obj.hashCode() : 0, 0, links);
        return modificationResultU == null ? this : new PersistentHashMap(modificationResultU.f1681a, this.g + modificationResultU.b);
    }
}
