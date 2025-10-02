package me.onebone.toolbar;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "me.onebone.toolbar.EnterAlwaysNestedScrollConnection", f = "ScrollStrategy.kt", l = {116}, m = "onPreFling-QWom1Mo")
/* loaded from: classes7.dex */
final class EnterAlwaysNestedScrollConnection$onPreFling$1 extends ContinuationImpl {
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ EnterAlwaysNestedScrollConnection r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterAlwaysNestedScrollConnection$onPreFling$1(EnterAlwaysNestedScrollConnection enterAlwaysNestedScrollConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = enterAlwaysNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.J0(0L, this);
    }
}
