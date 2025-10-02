package au.com.woolworths.feature.product.list.legacy;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import au.com.woolworths.shop.aem.components.ui.merchcard.MerchCardKt;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/MerchCardEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MerchCardEpoxyModel extends EpoxyModelWithView<ComposeView> {
    public final ComposeEpoxyModel n;

    public MerchCardEpoxyModel(final ProductListViewModel productListViewModel, final MerchCardData merchCardData) {
        Intrinsics.h(merchCardData, "merchCardData");
        Intrinsics.h(productListViewModel, "productListViewModel");
        this.n = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.MerchCardEpoxyModel$wrappedModel$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[ProductsDisplayMode.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        ProductsDisplayMode productsDisplayMode = ProductsDisplayMode.d;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int iOrdinal = productListViewModel.I.ordinal();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (iOrdinal == 0) {
                        composer.o(1746743974);
                        composer.o(5004770);
                        ProductListViewModel productListViewModel2 = productListViewModel;
                        boolean zI = composer.I(productListViewModel2);
                        Object objG = composer.G();
                        if (zI || objG == composer$Companion$Empty$1) {
                            MerchCardEpoxyModel$wrappedModel$1$1$1 merchCardEpoxyModel$wrappedModel$1$1$1 = new MerchCardEpoxyModel$wrappedModel$1$1$1(1, productListViewModel2, ProductListViewModel.class, "onMerchCardClickEvent", "onMerchCardClickEvent(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                            composer.A(merchCardEpoxyModel$wrappedModel$1$1$1);
                            objG = merchCardEpoxyModel$wrappedModel$1$1$1;
                        }
                        composer.l();
                        Function1 function1 = (Function1) ((KFunction) objG);
                        composer.o(5004770);
                        ProductListViewModel productListViewModel3 = productListViewModel;
                        boolean zI2 = composer.I(productListViewModel3);
                        Object objG2 = composer.G();
                        if (zI2 || objG2 == composer$Companion$Empty$1) {
                            MerchCardEpoxyModel$wrappedModel$1$2$1 merchCardEpoxyModel$wrappedModel$1$2$1 = new MerchCardEpoxyModel$wrappedModel$1$2$1(1, productListViewModel3, ProductListViewModel.class, "onMerchCardImpressionEvent", "onMerchCardImpressionEvent(Lau/com/woolworths/analytics/model/AnalyticsData;)V", 0);
                            composer.A(merchCardEpoxyModel$wrappedModel$1$2$1);
                            objG2 = merchCardEpoxyModel$wrappedModel$1$2$1;
                        }
                        composer.l();
                        MerchCardKt.b(merchCardData, function1, (Function1) ((KFunction) objG2), null, composer, 8, 8);
                        composer.l();
                    } else {
                        if (iOrdinal != 1) {
                            throw au.com.woolworths.android.onesite.a.x(composer, 333439056);
                        }
                        composer.o(1747086183);
                        composer.o(5004770);
                        ProductListViewModel productListViewModel4 = productListViewModel;
                        boolean zI3 = composer.I(productListViewModel4);
                        Object objG3 = composer.G();
                        if (zI3 || objG3 == composer$Companion$Empty$1) {
                            MerchCardEpoxyModel$wrappedModel$1$3$1 merchCardEpoxyModel$wrappedModel$1$3$1 = new MerchCardEpoxyModel$wrappedModel$1$3$1(1, productListViewModel4, ProductListViewModel.class, "onMerchCardClickEvent", "onMerchCardClickEvent(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                            composer.A(merchCardEpoxyModel$wrappedModel$1$3$1);
                            objG3 = merchCardEpoxyModel$wrappedModel$1$3$1;
                        }
                        composer.l();
                        Function1 function12 = (Function1) ((KFunction) objG3);
                        composer.o(5004770);
                        ProductListViewModel productListViewModel5 = productListViewModel;
                        boolean zI4 = composer.I(productListViewModel5);
                        Object objG4 = composer.G();
                        if (zI4 || objG4 == composer$Companion$Empty$1) {
                            MerchCardEpoxyModel$wrappedModel$1$4$1 merchCardEpoxyModel$wrappedModel$1$4$1 = new MerchCardEpoxyModel$wrappedModel$1$4$1(1, productListViewModel5, ProductListViewModel.class, "onMerchCardImpressionEvent", "onMerchCardImpressionEvent(Lau/com/woolworths/analytics/model/AnalyticsData;)V", 0);
                            composer.A(merchCardEpoxyModel$wrappedModel$1$4$1);
                            objG4 = merchCardEpoxyModel$wrappedModel$1$4$1;
                        }
                        composer.l();
                        MerchCardKt.a(merchCardData, function12, (Function1) ((KFunction) objG4), null, null, composer, 8, 24);
                        composer.l();
                    }
                }
                return Unit.f24250a;
            }
        }, true, 541128492));
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
