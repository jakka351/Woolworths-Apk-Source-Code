package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", l = {2467, 2469}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes2.dex */
final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1(ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.V(0L, 0L, this);
    }
}
