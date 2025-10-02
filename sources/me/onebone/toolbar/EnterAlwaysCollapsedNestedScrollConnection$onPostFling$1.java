package me.onebone.toolbar;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "me.onebone.toolbar.EnterAlwaysCollapsedNestedScrollConnection", f = "ScrollStrategy.kt", l = {177}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes7.dex */
final class EnterAlwaysCollapsedNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ EnterAlwaysCollapsedNestedScrollConnection r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterAlwaysCollapsedNestedScrollConnection$onPostFling$1(EnterAlwaysCollapsedNestedScrollConnection enterAlwaysCollapsedNestedScrollConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = enterAlwaysCollapsedNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.V(0L, 0L, this);
    }
}
