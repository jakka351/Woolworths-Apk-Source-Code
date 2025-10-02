package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1;

/* loaded from: classes7.dex */
class LazyJavaStaticClassScope$$Lambda$3 implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyJavaStaticClassScope$$Lambda$3 f24438a = new LazyJavaStaticClassScope$$Lambda$3();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable a(Object obj) {
        int i = LazyJavaStaticClassScope.p;
        Collection collectionA = ((ClassDescriptor) obj).m().a();
        Intrinsics.g(collectionA, "getSupertypes(...)");
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(SequencesKt.s(CollectionsKt.n(collectionA), LazyJavaStaticClassScope$$Lambda$4.d));
    }
}
