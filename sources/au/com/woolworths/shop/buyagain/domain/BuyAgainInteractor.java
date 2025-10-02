package au.com.woolworths.shop.buyagain.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.paging.LivePagedList;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import au.com.woolworths.android.onesite.modules.storelocator.models.SelectedPickUpLocation;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.pagingutils.NumericPageKeyedPagingSourceFactory;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.data.BuyAgainRepositoryImpl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/BuyAgainInteractor;", "", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainInteractor {
    public static final PagedList.Config c;

    /* renamed from: a, reason: collision with root package name */
    public final BuyAgainRepositoryImpl f10256a;
    public final CollectionModeInteractor b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/shop/buyagain/domain/BuyAgainInteractor$Companion;", "", "", "PAGING_LOAD_SIZE", "I", "PAGING_PRELOAD_SIZE", "Landroidx/paging/PagedList$Config;", "pagedListConfig", "Landroidx/paging/PagedList$Config;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        PagedList.Config.Builder builder = new PagedList.Config.Builder();
        builder.d = false;
        builder.b = 10;
        builder.c = 20;
        builder.b(20);
        c = builder.a();
    }

    public BuyAgainInteractor(BuyAgainRepositoryImpl buyAgainRepositoryImpl, CollectionModeInteractor collectionModeInteractor) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        this.f10256a = buyAgainRepositoryImpl;
        this.b = collectionModeInteractor;
    }

    public final Object a(ArrayList arrayList, String str, String str2, Continuation continuation) {
        Integer id;
        CollectionModeInteractor collectionModeInteractor = this.b;
        String strA = null;
        if (collectionModeInteractor.G()) {
            SelectedPickUpLocation selectedPickUpLocationP = collectionModeInteractor.p();
            if (selectedPickUpLocationP != null && (id = selectedPickUpLocationP.getId()) != null) {
                strA = id.toString();
            }
        } else if (collectionModeInteractor.b()) {
            strA = collectionModeInteractor.a();
        }
        return this.f10256a.b(strA, collectionModeInteractor.w(), arrayList, str, str2, (SuspendLambda) continuation);
    }

    public final NumericPageListing b() {
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(null, new BuyAgainInteractor$getPagedBuyAgainProductListLegacy$factory$1(this, null));
        LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, ProductCard>>() { // from class: au.com.woolworths.shop.buyagain.domain.BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory.a();
            }
        }, c).a();
        BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$2 buyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$2 = BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData = numericPageKeyedPagingSourceFactory.c;
        return new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData, buyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$2), Transformations.c(mutableLiveData, BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.shop.buyagain.domain.BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData, BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData, BuyAgainInteractor$getPagedBuyAgainProductListLegacy$$inlined$getPageListing$6.d));
    }
}
