package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemReusePolicy;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {

    /* renamed from: a, reason: collision with root package name */
    public final LazyLayoutItemContentFactory f1045a;
    public final MutableObjectIntMap b;

    public LazyLayoutItemReusePolicy(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.f1045a = lazyLayoutItemContentFactory;
        MutableObjectIntMap mutableObjectIntMap = ObjectIntMapKt.f693a;
        this.b = new MutableObjectIntMap();
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final void a(SubcomposeSlotReusePolicy.SlotIdsSet slotIdsSet) {
        MutableObjectIntMap mutableObjectIntMap = this.b;
        mutableObjectIntMap.c();
        Iterator it = slotIdsSet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object objB = this.f1045a.b(next);
            int iA = mutableObjectIntMap.a(objB);
            int i = iA >= 0 ? mutableObjectIntMap.c[iA] : 0;
            if (i == 7) {
                slotIdsSet.remove(next);
            } else {
                mutableObjectIntMap.h(i + 1, objB);
            }
        }
    }

    @Override // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public final boolean b(Object obj, Object obj2) {
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.f1045a;
        return Intrinsics.c(lazyLayoutItemContentFactory.b(obj), lazyLayoutItemContentFactory.b(obj2));
    }
}
