package au.com.woolworths.feature.product.list.legacy;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.foundation.shop.nhp.ui.pp.PersonalisedProductsBannerKt;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/PersonalisedProductsBannerEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonalisedProductsBannerEpoxyModel extends EpoxyModelWithView<ComposeView> {
    public final ComposeEpoxyModel n;

    public PersonalisedProductsBannerEpoxyModel(final PaddingValuesImpl paddingValuesImpl, final ProductListViewModel productListViewModel, final PersonalisedProductsBannerData data) {
        Intrinsics.h(data, "data");
        Intrinsics.h(productListViewModel, "productListViewModel");
        this.n = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.PersonalisedProductsBannerEpoxyModel$wrappedModel$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    composer.o(5004770);
                    ProductListViewModel productListViewModel2 = productListViewModel;
                    boolean zI = composer.I(productListViewModel2);
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (zI || objG == composer$Companion$Empty$1) {
                        PersonalisedProductsBannerEpoxyModel$wrappedModel$1$1$1 personalisedProductsBannerEpoxyModel$wrappedModel$1$1$1 = new PersonalisedProductsBannerEpoxyModel$wrappedModel$1$1$1(1, productListViewModel2, ProductListViewModel.class, "onPersonalisedProductsBannerClick", "onPersonalisedProductsBannerClick(Lau/com/woolworths/foundation/shop/nhp/model/personalisedproducts/PersonalisedProductsBannerData;)V", 0);
                        composer.A(personalisedProductsBannerEpoxyModel$wrappedModel$1$1$1);
                        objG = personalisedProductsBannerEpoxyModel$wrappedModel$1$1$1;
                    }
                    composer.l();
                    Function1 function1 = (Function1) ((KFunction) objG);
                    composer.o(5004770);
                    ProductListViewModel productListViewModel3 = productListViewModel;
                    boolean zI2 = composer.I(productListViewModel3);
                    Object objG2 = composer.G();
                    if (zI2 || objG2 == composer$Companion$Empty$1) {
                        PersonalisedProductsBannerEpoxyModel$wrappedModel$1$2$1 personalisedProductsBannerEpoxyModel$wrappedModel$1$2$1 = new PersonalisedProductsBannerEpoxyModel$wrappedModel$1$2$1(1, productListViewModel3, ProductListViewModel.class, "onPersonalisedProductsBannerImpression", "onPersonalisedProductsBannerImpression(Lau/com/woolworths/foundation/shop/nhp/model/personalisedproducts/PersonalisedProductsBannerData;)V", 0);
                        composer.A(personalisedProductsBannerEpoxyModel$wrappedModel$1$2$1);
                        objG2 = personalisedProductsBannerEpoxyModel$wrappedModel$1$2$1;
                    }
                    composer.l();
                    PersonalisedProductsBannerKt.a(data, function1, (Function1) ((KFunction) objG2), PaddingKt.e(Modifier.Companion.d, paddingValuesImpl), composer, 0);
                }
                return Unit.f24250a;
            }
        }, true, 797307492));
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
