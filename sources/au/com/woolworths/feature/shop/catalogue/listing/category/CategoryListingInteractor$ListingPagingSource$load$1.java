package au.com.woolworths.feature.shop.catalogue.listing.category;

import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingInteractor$ListingPagingSource", f = "CategoryListingInteractor.kt", l = {111}, m = "load")
/* loaded from: classes3.dex */
final class CategoryListingInteractor$ListingPagingSource$load$1 extends ContinuationImpl {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ CategoryListingInteractor.ListingPagingSource r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingInteractor$ListingPagingSource$load$1(CategoryListingInteractor.ListingPagingSource listingPagingSource, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = listingPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(null, this);
    }
}
