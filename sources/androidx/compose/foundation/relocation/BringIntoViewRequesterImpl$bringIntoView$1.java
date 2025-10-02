package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {100}, m = "bringIntoView")
/* loaded from: classes2.dex */
final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {
    public Rect p;
    public Object[] q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ BringIntoViewRequesterImpl u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
