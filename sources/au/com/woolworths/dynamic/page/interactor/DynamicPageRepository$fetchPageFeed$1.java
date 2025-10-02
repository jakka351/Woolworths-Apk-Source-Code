package au.com.woolworths.dynamic.page.interactor;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.dynamic.page.interactor.DynamicPageRepository", f = "DynamicPageRepository.kt", l = {33}, m = "fetchPageFeed")
/* loaded from: classes3.dex */
final class DynamicPageRepository$fetchPageFeed$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ DynamicPageRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicPageRepository$fetchPageFeed$1(DynamicPageRepository dynamicPageRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = dynamicPageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, null, this);
    }
}
