package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", f = "BackdropScaffold.kt", l = {680}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes2.dex */
final class BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1(BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1 backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = backdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.V(0L, 0L, this);
    }
}
