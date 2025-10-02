package au.com.woolworths.feature.shop.catalogue.browse;

import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.PagingData;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.catalogue.browse.CatalogueBrowseContract;
import au.com.woolworths.feature.shop.catalogue.browse.contents.CatalogueContentsAction;
import au.com.woolworths.feature.shop.catalogue.browse.contents.model.CategoryCard;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePageKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CatalogueBrowseActivity e;

    public /* synthetic */ b(CatalogueBrowseActivity catalogueBrowseActivity, int i) {
        this.d = i;
        this.e = catalogueBrowseActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PagingData pagingData;
        int i = this.d;
        Unit unit = Unit.f24250a;
        CatalogueBrowseActivity catalogueBrowseActivity = this.e;
        switch (i) {
            case 0:
                BrowsePage.Promotion it = (BrowsePage.Promotion) obj;
                int i2 = CatalogueBrowseActivity.H;
                Intrinsics.h(it, "it");
                catalogueBrowseActivity.O4().j.k(new CatalogueBrowseContract.Action.LaunchPromotionListing(it.f6807a));
                break;
            case 1:
                CategoryCard it2 = (CategoryCard) obj;
                int i3 = CatalogueBrowseActivity.H;
                Intrinsics.h(it2, "it");
                CatalogueBrowseViewModel catalogueBrowseViewModelO4 = catalogueBrowseActivity.O4();
                catalogueBrowseViewModelO4.j.k(new CatalogueBrowseContract.Action.LaunchCatalogueListing(it2.f6804a));
                catalogueBrowseViewModelO4.f.c(CatalogueContentsAction.f6800a.c(it2.b));
                break;
            case 2:
                ActionableCard it3 = (ActionableCard) obj;
                int i4 = CatalogueBrowseActivity.H;
                Intrinsics.h(it3, "it");
                CatalogueBrowseViewModel catalogueBrowseViewModelO42 = catalogueBrowseActivity.O4();
                catalogueBrowseViewModelO42.j.k(new CatalogueBrowseContract.Action.LaunchDeepLink(it3.getLink()));
                catalogueBrowseViewModelO42.f.j(CatalogueContentsAction.g, ActionableCardKt.a(it3));
                break;
            case 3:
                ActionableCard it4 = (ActionableCard) obj;
                int i5 = CatalogueBrowseActivity.H;
                Intrinsics.h(it4, "it");
                catalogueBrowseActivity.O4().f.j(CatalogueContentsAction.f, ActionableCardKt.a(it4));
                break;
            case 4:
                BrowsePage.Category it5 = (BrowsePage.Category) obj;
                int i6 = CatalogueBrowseActivity.H;
                Intrinsics.h(it5, "it");
                CatalogueBrowseViewModel catalogueBrowseViewModelO43 = catalogueBrowseActivity.O4();
                catalogueBrowseViewModelO43.j.k(new CatalogueBrowseContract.Action.LaunchCatalogueListing(it5.f6806a));
                catalogueBrowseViewModelO43.f.j(CatalogueBrowseAction.f, BrowsePageKt.a(it5));
                break;
            case 5:
                ProductCard it6 = (ProductCard) obj;
                int i7 = CatalogueBrowseActivity.H;
                Intrinsics.h(it6, "it");
                CatalogueBrowseViewModel catalogueBrowseViewModelO44 = catalogueBrowseActivity.O4();
                ActionData productCardAction = it6.getProductCardAction();
                if (productCardAction != null) {
                    catalogueBrowseViewModelO44.j.k(new CatalogueBrowseContract.Action.LaunchDeepLink(productCardAction.getAction()));
                    break;
                }
                break;
            default:
                CombinedLoadStates states = (CombinedLoadStates) obj;
                int i8 = CatalogueBrowseActivity.H;
                CatalogueBrowseViewModel catalogueBrowseViewModelO45 = catalogueBrowseActivity.O4();
                Intrinsics.h(states, "states");
                MutableStateFlow mutableStateFlow = catalogueBrowseViewModelO45.k;
                LoadState loadState = states.f3529a;
                LoadState loadState2 = states.c;
                LoadState.Error error = loadState instanceof LoadState.Error ? (LoadState.Error) loadState : null;
                if (error == null) {
                    error = loadState2 instanceof LoadState.Error ? (LoadState.Error) loadState2 : null;
                }
                LoadState.Loading loading = LoadState.Loading.b;
                if (!Intrinsics.c(loadState, loading)) {
                    if (((CatalogueBrowseContract.BrowseViewState) mutableStateFlow.getValue()).c != null && Intrinsics.c(loadState2, loading)) {
                        mutableStateFlow.f(new CatalogueBrowseContract.BrowseViewState(((CatalogueBrowseContract.BrowseViewState) mutableStateFlow.getValue()).b, null, 4));
                        break;
                    } else if (error == null) {
                        if (((CatalogueBrowseContract.BrowseViewState) mutableStateFlow.getValue()).f6793a && (pagingData = ((CatalogueBrowseContract.BrowseViewState) mutableStateFlow.getValue()).b) != null) {
                            mutableStateFlow.f(new CatalogueBrowseContract.BrowseViewState(pagingData, null, 5));
                            break;
                        }
                    } else {
                        Throwable th = error.b;
                        if (!(th instanceof ServerErrorException)) {
                            if (th instanceof NoConnectivityException) {
                                catalogueBrowseViewModelO45.q6(CatalogueBrowsePageErrorState.d);
                                break;
                            }
                        } else {
                            catalogueBrowseViewModelO45.q6(CatalogueBrowsePageErrorState.e);
                            break;
                        }
                    }
                } else {
                    mutableStateFlow.f(new CatalogueBrowseContract.BrowseViewState(((CatalogueBrowseContract.BrowseViewState) mutableStateFlow.getValue()).b, null, 4));
                    break;
                }
                break;
        }
        return unit;
    }
}
