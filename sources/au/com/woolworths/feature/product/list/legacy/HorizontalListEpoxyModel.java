package au.com.woolworths.feature.product.list.legacy;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.contentpage.ui.HorizontalListKt;
import au.com.woolworths.product.models.ProductId;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/HorizontalListEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HorizontalListEpoxyModel extends EpoxyModelWithView<ComposeView> {
    public final ComposeEpoxyModel n;

    public HorizontalListEpoxyModel(final int i, final ProductListViewModel productListViewModel, final HorizontalListData horizontalListData, final boolean z) {
        Intrinsics.h(horizontalListData, "horizontalListData");
        Intrinsics.h(productListViewModel, "productListViewModel");
        this.n = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.HorizontalListEpoxyModel$wrappedModel$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composer);
                    composer.o(5004770);
                    ProductListViewModel productListViewModel2 = productListViewModel;
                    boolean zI = composer.I(productListViewModel2);
                    Object objG = composer.G();
                    if (zI || objG == Composer.Companion.f1624a) {
                        objG = new HorizontalListEpoxyModel$wrappedModel$1$1$1(1, productListViewModel2, ProductListViewModel.class, "onMerchCardFullImageClickEvent", "onMerchCardFullImageClickEvent(Lau/com/woolworths/sdui/model/action/ActionData;)V", 0);
                        composer.A(objG);
                    }
                    composer.l();
                    HorizontalListKt.a(i, horizontalListData, z, EmptyList.d, null, null, null, null, (Function1) ((KFunction) objG), productListViewModel, lazyListStateA, null, false, null, false, null, null, composer, 14380096 | (ProductId.$stable << 9), 129024);
                }
                return Unit.f24250a;
            }
        }, true, 1544470290));
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
