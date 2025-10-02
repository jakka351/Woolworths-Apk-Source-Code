package au.com.woolworths.feature.shop.catalogue.home;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeRepository", f = "CatalogueHomeRepository.kt", l = {39}, m = "fetchCatalogueHome")
/* loaded from: classes3.dex */
final class CatalogueHomeRepository$fetchCatalogueHome$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CatalogueHomeRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogueHomeRepository$fetchCatalogueHome$1(CatalogueHomeRepository catalogueHomeRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = catalogueHomeRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, null, null, this);
    }
}
