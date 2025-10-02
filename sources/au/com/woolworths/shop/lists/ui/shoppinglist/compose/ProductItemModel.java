package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import com.airbnb.epoxy.ComposeEpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/compose/ProductItemModel;", "Lcom/airbnb/epoxy/EpoxyModelWithView;", "Landroidx/compose/ui/platform/ComposeView;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductItemModel extends EpoxyModelWithView<ComposeView> {
    public final ComposeEpoxyModel n;

    public ProductItemModel(final ShoppingListDetailsContract.ViewState viewState, final boolean z, final ProductId productId, final boolean z2, final Function1 function1, final Function2 function2, final Function1 function12, final Function1 function13, final Function1 function14, final Function1 function15) {
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(productId, "productId");
        this.n = new ComposeEpoxyModel(new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>(this) { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ProductItemModel$wrappedModel$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                final ProductItemUiModel productItemUiModel;
                Object next;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    ShoppingListDetailsUiModel shoppingListDetailsUiModel = viewState.f12428a;
                    if (shoppingListDetailsUiModel != null) {
                        Iterator it = shoppingListDetailsUiModel.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.c(((ProductItemUiModel) next).g, productId)) {
                                break;
                            }
                        }
                        productItemUiModel = (ProductItemUiModel) next;
                    } else {
                        productItemUiModel = null;
                    }
                    if ((productItemUiModel != null ? productItemUiModel.i : null) != null) {
                        final Function1 function16 = function14;
                        final Function1 function17 = function15;
                        final ShoppingListDetailsContract.ViewState viewState2 = viewState;
                        final boolean z3 = z;
                        final boolean z4 = z2;
                        final Function1 function18 = function1;
                        final Function2 function22 = function2;
                        final Function1 function19 = function12;
                        final Function1 function110 = function13;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(-281334177, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ProductItemModel$wrappedModel$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    ProductItemUiKt.b(productItemUiModel, viewState2.f, z3, z4, function18, function22, function19, function110, function16, function17, null, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                }
                return Unit.f24250a;
            }
        }, true, 1762883607));
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
