package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.WrapperDataSource", f = "WrapperDataSource.jvm.kt", l = {68}, m = "load$suspendImpl")
/* loaded from: classes2.dex */
final class WrapperDataSource$load$1<Key, ValueFrom, ValueTo> extends ContinuationImpl {
    public WrapperDataSource p;
    public /* synthetic */ Object q;
    public final /* synthetic */ WrapperDataSource r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource$load$1(WrapperDataSource wrapperDataSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = wrapperDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        WrapperDataSource.g(this.r, null, this);
        throw null;
    }
}
