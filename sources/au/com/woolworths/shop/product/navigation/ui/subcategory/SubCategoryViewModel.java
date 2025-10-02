package au.com.woolworths.shop.product.navigation.ui.subcategory;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.specials.SpecialsSubCategoryAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.shop.product.navigation.ProductCategoryNavigationInteractor;
import au.com.woolworths.shop.product.navigation.analytics.ProductCategoryTrackingDataKt;
import au.com.woolworths.shop.product.navigation.data.ProductCategory;
import au.com.woolworths.shop.product.navigation.data.ProductCategoryList;
import au.com.woolworths.shop.product.navigation.data.marketplace.MarketplaceCategoriesInfo;
import au.com.woolworths.shop.product.navigation.ui.ConnectionErrorState;
import au.com.woolworths.shop.product.navigation.ui.ProductCategoryFullPageErrorState;
import au.com.woolworths.shop.product.navigation.ui.ServerErrorState;
import au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/shop/product/navigation/ui/subcategory/ProductSubCategoryClickHandler;", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubCategoryViewModel extends ViewModel implements FullPageErrorStateClickHandler, ProductSubCategoryClickHandler {
    public final ProductCategoryNavigationInteractor e;
    public final AnalyticsManager f;
    public final MutableLiveData g;
    public final PublishSubject h;
    public String i;
    public final MutableLiveData j;
    public final PublishSubject k;
    public Activities.ProductSubCategory.ProductCategoryType l;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Activities.ProductSubCategory.ProductCategoryType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Activities.ProductSubCategory.ProductCategoryType productCategoryType = Activities.ProductSubCategory.ProductCategoryType.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Activities.ProductSubCategory.ProductCategoryType productCategoryType2 = Activities.ProductSubCategory.ProductCategoryType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SubCategoryViewModel(ProductCategoryNavigationInteractor productCategoryNavigationInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = productCategoryNavigationInteractor;
        this.f = analyticsManager;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.g = mutableLiveData;
        PublishSubject publishSubject = new PublishSubject();
        this.h = publishSubject;
        this.j = mutableLiveData;
        this.k = publishSubject;
        this.l = Activities.ProductSubCategory.ProductCategoryType.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [au.com.woolworths.android.onesite.common.FullPageErrorCause] */
    public static void r6(MutableLiveData mutableLiveData, boolean z, ProductCategoryFullPageErrorState productCategoryFullPageErrorState, int i) {
        SubCategoryContract.ViewState viewState = (SubCategoryContract.ViewState) mutableLiveData.e();
        ProductCategoryList productCategoryList = viewState != null ? viewState.b : null;
        ProductCategoryFullPageErrorState productCategoryFullPageErrorState2 = productCategoryFullPageErrorState;
        if ((i & 4) != 0) {
            SubCategoryContract.ViewState viewState2 = (SubCategoryContract.ViewState) mutableLiveData.e();
            productCategoryFullPageErrorState2 = viewState2 != null ? viewState2.c : null;
        }
        mutableLiveData.m(new SubCategoryContract.ViewState(z, productCategoryList, productCategoryFullPageErrorState2));
    }

    @Override // au.com.woolworths.shop.product.navigation.ui.subcategory.ProductSubCategoryClickHandler
    public final void Y5(ProductCategory productCategory, MarketplaceCategoriesInfo marketplaceCategoriesInfo) {
        Activities.ProductList.ExtraProductListSource extrasByCategory;
        Intrinsics.h(productCategory, "productCategory");
        SpecialsSubCategoryAnalytics.Home.Action.Companion companion = SpecialsSubCategoryAnalytics.Home.Action.d;
        final String category = productCategory.getTitle();
        companion.getClass();
        Intrinsics.h(category, "category");
        this.f.g(new Event(category) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsSubCategoryAnalytics$Home$Action$Companion$categoryClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(SpecialsSubCategoryAnalytics.Home.e);
                a.z("event.Category", "nav_specials", spreadBuilder, "event.Action", "link_click");
                a.y("event.Label", "Category - ".concat(category), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "nav_specials_link_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "nav_specials_link_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        boolean isFinalLevel = productCategory.getIsFinalLevel();
        PublishSubject publishSubject = this.h;
        if (!isFinalLevel) {
            publishSubject.onNext(new SubCategoryContract.Actions.LaunchSubCategory(new Activities.ProductSubCategory.Extras(productCategory.getHeaderTitle(), productCategory.getCategoryId(), this.l)));
            return;
        }
        int iOrdinal = this.l.ordinal();
        if (iOrdinal == 0) {
            extrasByCategory = new Activities.ProductList.ExtrasByCategory(productCategory.getCategoryId(), productCategory.getSource(), Activities.ProductList.ProductListType.u);
        } else if (iOrdinal == 1) {
            extrasByCategory = new Activities.ProductList.ExtrasBySpecialsCategory(productCategory.getCategoryId(), productCategory.getSource(), Activities.ProductList.ProductListType.z);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            extrasByCategory = marketplaceCategoriesInfo != null ? new Activities.ProductList.ExtrasByFacet(productCategory.getCategoryId(), productCategory.getTitle(), marketplaceCategoriesInfo.getChannel().d, marketplaceCategoriesInfo.getFacet().d, productCategory.getSource()) : null;
        }
        if (extrasByCategory != null) {
            publishSubject.onNext(new SubCategoryContract.Actions.LaunchProductList(new Activities.ProductList.ExtrasPageData(productCategory.getHeaderTitle(), null), extrasByCategory));
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        String str = this.i;
        if (str == null) {
            Intrinsics.p("categoryId");
            throw null;
        }
        p6(str);
        SubCategoryContract.ViewState viewState = (SubCategoryContract.ViewState) this.g.e();
        FullPageErrorCause fullPageErrorCause = viewState != null ? viewState.c : null;
        boolean z = fullPageErrorCause instanceof ConnectionErrorState;
        AnalyticsManager analyticsManager = this.f;
        if (z) {
            analyticsManager.j(ProductCategoryTrackingDataKt.a(this.l).f, q6());
        } else if (fullPageErrorCause instanceof ServerErrorState) {
            analyticsManager.j(ProductCategoryTrackingDataKt.a(this.l).g, q6());
        }
    }

    public final void p6(String categoryId) {
        Intrinsics.h(categoryId, "categoryId");
        this.i = categoryId;
        r6(this.g, true, null, 6);
        BuildersKt.c(ViewModelKt.a(this), null, null, new SubCategoryViewModel$fetchProductCategories$1(this, categoryId, null), 3);
    }

    public final TrackingMetadata q6() {
        TrackableValue trackableValue = TrackableValue.L1;
        String str = this.i;
        if (str != null) {
            return TrackingMetadata.Companion.a(trackableValue, str);
        }
        Intrinsics.p("categoryId");
        throw null;
    }
}
