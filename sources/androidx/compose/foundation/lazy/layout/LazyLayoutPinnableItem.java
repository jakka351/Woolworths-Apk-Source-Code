package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItem;", "Landroidx/compose/ui/layout/PinnableContainer;", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1048a;
    public final LazyLayoutPinnedItemList b;
    public int d;
    public PinnableContainer.PinnedHandle e;
    public boolean f;
    public int c = -1;
    public final MutableState g = SnapshotStateKt.f(null);

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.f1048a = obj;
        this.b = lazyLayoutPinnedItemList;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    public final PinnableContainer.PinnedHandle a() {
        if (this.f) {
            InlineClassHelperKt.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.d.add(this);
            PinnableContainer pinnableContainer = (PinnableContainer) ((SnapshotMutableStateImpl) this.g).getD();
            this.e = pinnableContainer != null ? pinnableContainer.a() : null;
        }
        this.d++;
        return this;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    /* renamed from: getIndex, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    /* renamed from: getKey, reason: from getter */
    public final Object getF1048a() {
        return this.f1048a;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public final void release() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            InlineClassHelperKt.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.d.remove(this);
            PinnableContainer.PinnedHandle pinnedHandle = this.e;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.e = null;
        }
    }
}
