package au.com.woolworths.feature.shop.catalogue.browse;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseRepository", f = "CatalogueBrowseRepository.kt", l = {78}, m = "fetchCatalogueContents")
/* loaded from: classes3.dex */
final class CatalogueBrowseRepository$fetchCatalogueContents$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CatalogueBrowseRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueBrowseRepository$fetchCatalogueContents$1(CatalogueBrowseRepository catalogueBrowseRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = catalogueBrowseRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(null, null, this);
    }
}
