package au.com.woolworths.shop.lists.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.paging.LivePagedList;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import au.com.woolworths.pagingutils.NumericPageKeyedPagingSourceFactory;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.data.repository.SuggestedListsRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/SuggestedListsInteractor;", "", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SuggestedListsInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final SuggestedListsRepository f12262a;
    public final PagedList.Config b;
    public final MutableLiveData c;
    public final MutableLiveData d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/data/SuggestedListsInteractor$Companion;", "", "", "PRODUCT_PAGING_LOAD_SIZE", "I", "PRODUCT_PAGING_PRELOAD_SIZE", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public SuggestedListsInteractor(SuggestedListsRepository repository) {
        Intrinsics.h(repository, "repository");
        this.f12262a = repository;
        PagedList.Config.Builder builder = new PagedList.Config.Builder();
        builder.d = false;
        builder.b = 10;
        builder.c = 20;
        builder.b(20);
        this.b = builder.a();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.c = mutableLiveData;
        this.d = mutableLiveData;
    }

    public final void a() {
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(null, new SuggestedListsInteractor$fetchSuggestedListsOld$1(this, null));
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, SuggestedListItem>>() { // from class: au.com.woolworths.shop.lists.data.SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, this.b).a();
        SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$2 suggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$2 = SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData = numericPageKeyedPagingSourceFactory.c;
        this.c.m(new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData, suggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$2), Transformations.c(mutableLiveData, SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.shop.lists.data.SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData, SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData, SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$6.d)));
    }
}
