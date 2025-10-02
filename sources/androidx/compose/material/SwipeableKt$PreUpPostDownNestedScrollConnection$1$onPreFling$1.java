package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", f = "Swipeable.kt", l = {859}, m = "onPreFling-QWom1Mo")
/* loaded from: classes2.dex */
final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.J0(0L, this);
    }
}
