package au.com.woolworths.feature.shop.catalogue.browse;

import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseInteractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseInteractor$BrowsePagingSource", f = "CatalogueBrowseInteractor.kt", l = {57}, m = "load")
/* loaded from: classes3.dex */
final class CatalogueBrowseInteractor$BrowsePagingSource$load$1 extends ContinuationImpl {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CatalogueBrowseInteractor.BrowsePagingSource r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueBrowseInteractor$BrowsePagingSource$load$1(CatalogueBrowseInteractor.BrowsePagingSource browsePagingSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = browsePagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(null, this);
    }
}
