package au.com.woolworths.feature.shop.catalogue.listing.promotion.details;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.catalogue.common.BottomSheetResult;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsContract;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PromotionDetailsActivity extends Hilt_PromotionDetailsActivity implements AddToCartBottomSheetFragment.BottomSheetHost, AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int A = 0;
    public ShopAppNavigator y;
    public final ViewModelLazy x = new ViewModelLazy(Reflection.f24268a.b(PromotionDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy z = LazyKt.b(new f(this, 15));

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsActivity$Companion;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return LifecycleOwnerKt.a(this);
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) this.x.getD();
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            MutableStateFlow mutableStateFlow = promotionDetailsViewModel.i;
            mutableStateFlow.f(PromotionDetailsContract.ViewState.a((PromotionDetailsContract.ViewState) mutableStateFlow.getValue(), null, null, new BottomSheetResult.AddToListSuccess((ListChangeEvent.AddToListSuccessEvent) listChangeEvent), null, null, 111));
        }
    }

    @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.BottomSheetHost
    public final void e(AddToCartBottomSheetFragment.AddToCartSuccessEvent addToCartSuccessEvent) {
    }

    @Override // au.com.woolworths.feature.shop.catalogue.listing.promotion.details.Hilt_PromotionDetailsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final PromotionDetailsActivity promotionDetailsActivity = PromotionDetailsActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(2038700501, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = PromotionDetailsActivity.A;
                                PromotionDetailsActivity promotionDetailsActivity2 = promotionDetailsActivity;
                                PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) promotionDetailsActivity2.x.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(promotionDetailsActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    PromotionDetailsActivity$onCreate$1$1$1$1 promotionDetailsActivity$onCreate$1$1$1$1 = new PromotionDetailsActivity$onCreate$1$1$1$1(0, promotionDetailsActivity2, PromotionDetailsActivity.class, "finish", "finish()V", 0);
                                    composer2.A(promotionDetailsActivity$onCreate$1$1$1$1);
                                    objG = promotionDetailsActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(promotionDetailsActivity2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    PromotionDetailsActivity$onCreate$1$1$2$1 promotionDetailsActivity$onCreate$1$1$2$1 = new PromotionDetailsActivity$onCreate$1$1$2$1(0, promotionDetailsActivity2, PromotionDetailsActivity.class, "launchViewCart", "launchViewCart()V", 0);
                                    composer2.A(promotionDetailsActivity$onCreate$1$1$2$1);
                                    objG2 = promotionDetailsActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                PromotionDetailsScreenKt.j(promotionDetailsViewModel, function0, (Function0) ((KFunction) objG2), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1795637875));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new PromotionDetailsActivity$collectActions$1(this, null), 3);
        PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) this.x.getD();
        Activities.CataloguePromotionDetails.Extra extra = (Activities.CataloguePromotionDetails.Extra) this.z.getD();
        Intrinsics.h(extra, "extra");
        promotionDetailsViewModel.l = extra;
        PromotionDetailsInteractor promotionDetailsInteractor = promotionDetailsViewModel.e;
        String str = extra.d;
        String str2 = extra.e;
        String str3 = extra.f;
        promotionDetailsInteractor.getClass();
        Flow flowA = CachedPagingDataKt.a(new Pager(new PagingConfig(20, 0, 0, 58, false), new a(promotionDetailsInteractor, str, str2, str3)).f3571a, ViewModelKt.a(promotionDetailsViewModel));
        MutableStateFlow mutableStateFlow = promotionDetailsViewModel.i;
        mutableStateFlow.f(PromotionDetailsContract.ViewState.a((PromotionDetailsContract.ViewState) mutableStateFlow.getValue(), null, flowA, null, null, null, 119));
    }
}
