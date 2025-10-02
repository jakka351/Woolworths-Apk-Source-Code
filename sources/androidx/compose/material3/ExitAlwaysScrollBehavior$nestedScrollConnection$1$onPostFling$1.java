package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", l = {1769, 1771}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes2.dex */
final class ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    public ExitAlwaysScrollBehavior$nestedScrollConnection$1 p;
    public long q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ExitAlwaysScrollBehavior$nestedScrollConnection$1 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(ExitAlwaysScrollBehavior$nestedScrollConnection$1 exitAlwaysScrollBehavior$nestedScrollConnection$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = exitAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.V(0L, 0L, this);
    }
}
