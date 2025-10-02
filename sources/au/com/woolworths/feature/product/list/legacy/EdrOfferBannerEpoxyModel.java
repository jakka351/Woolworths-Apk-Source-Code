package au.com.woolworths.feature.product.list.legacy;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0005²\u0006\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/EdrOfferBannerEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ViewState;", "viewState", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EdrOfferBannerEpoxyModel extends EpoxyModelWithView<ComposeView> {
    public final ComposeEpoxyModel n;

    public EdrOfferBannerEpoxyModel(final PaddingValuesImpl paddingValuesImpl, final ProductListViewModel productListViewModel, final EdrOfferBannerData edrOfferBannerData) {
        Intrinsics.h(edrOfferBannerData, "edrOfferBannerData");
        Intrinsics.h(productListViewModel, "productListViewModel");
        this.n = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.EdrOfferBannerEpoxyModel$wrappedModel$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EdrOfferBoostState edrOfferBoostState;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    ProductListContract.ViewState viewState = (ProductListContract.ViewState) LiveDataAdapterKt.a(productListViewModel.F, composer).getD();
                    if (viewState == null || (edrOfferBoostState = viewState.v) == null) {
                        edrOfferBoostState = EdrOfferBoostState.Idle.f8782a;
                    }
                    EdrOfferBoostState edrOfferBoostState2 = edrOfferBoostState;
                    composer.o(5004770);
                    ProductListViewModel productListViewModel2 = productListViewModel;
                    boolean zI = composer.I(productListViewModel2);
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (zI || objG == composer$Companion$Empty$1) {
                        EdrOfferBannerEpoxyModel$wrappedModel$1$1$1 edrOfferBannerEpoxyModel$wrappedModel$1$1$1 = new EdrOfferBannerEpoxyModel$wrappedModel$1$1$1(1, productListViewModel2, ProductListViewModel.class, "onEdrOfferBannerClick", "onEdrOfferBannerClick(Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBannerData;)V", 0);
                        composer.A(edrOfferBannerEpoxyModel$wrappedModel$1$1$1);
                        objG = edrOfferBannerEpoxyModel$wrappedModel$1$1$1;
                    }
                    composer.l();
                    Function1 function1 = (Function1) ((KFunction) objG);
                    composer.o(5004770);
                    ProductListViewModel productListViewModel3 = productListViewModel;
                    boolean zI2 = composer.I(productListViewModel3);
                    Object objG2 = composer.G();
                    if (zI2 || objG2 == composer$Companion$Empty$1) {
                        EdrOfferBannerEpoxyModel$wrappedModel$1$2$1 edrOfferBannerEpoxyModel$wrappedModel$1$2$1 = new EdrOfferBannerEpoxyModel$wrappedModel$1$2$1(1, productListViewModel3, ProductListViewModel.class, "onEdrBoostButtonClick", "onEdrBoostButtonClick(Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBannerData;)Lkotlinx/coroutines/Job;", 8);
                        composer.A(edrOfferBannerEpoxyModel$wrappedModel$1$2$1);
                        objG2 = edrOfferBannerEpoxyModel$wrappedModel$1$2$1;
                    }
                    Function1 function12 = (Function1) objG2;
                    composer.l();
                    composer.o(5004770);
                    ProductListViewModel productListViewModel4 = productListViewModel;
                    boolean zI3 = composer.I(productListViewModel4);
                    Object objG3 = composer.G();
                    if (zI3 || objG3 == composer$Companion$Empty$1) {
                        EdrOfferBannerEpoxyModel$wrappedModel$1$3$1 edrOfferBannerEpoxyModel$wrappedModel$1$3$1 = new EdrOfferBannerEpoxyModel$wrappedModel$1$3$1(1, productListViewModel4, ProductListViewModel.class, "onEdrOfferBannerImpression", "onEdrOfferBannerImpression(Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBannerData;)V", 0);
                        composer.A(edrOfferBannerEpoxyModel$wrappedModel$1$3$1);
                        objG3 = edrOfferBannerEpoxyModel$wrappedModel$1$3$1;
                    }
                    composer.l();
                    EdrOfferBannerKt.a(edrOfferBannerData, edrOfferBoostState2, function1, function12, (Function1) ((KFunction) objG3), SizeKt.g(SizeKt.e(PaddingKt.e(Modifier.Companion.d, paddingValuesImpl), 1.0f), 100), composer, 0);
                }
                return Unit.f24250a;
            }
        }, true, 1721639596));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        ComposeView view = (ComposeView) obj;
        Intrinsics.h(view, "view");
        this.n.h(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        return this.n.j(viewGroup);
    }
}
