package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", l = {826}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes2.dex */
final class DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = drawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.V(0L, 0L, this);
    }
}
