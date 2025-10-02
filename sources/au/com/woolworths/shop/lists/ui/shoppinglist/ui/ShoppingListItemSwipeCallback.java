package au.com.woolworths.shop.lists.ui.shoppinglist.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.shop.checkout.ui.details.c;
import au.com.woolworths.shop.lists.ItemShoppingListProductBindingModel_;
import au.com.woolworths.shop.lists.ItemShoppingListTextBindingModel_;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelTouchCallback;
import com.airbnb.epoxy.EpoxyViewHolder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/ShoppingListItemSwipeCallback;", "Lcom/airbnb/epoxy/EpoxyModelTouchCallback;", "Lcom/airbnb/epoxy/EpoxyModel;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ShoppingListItemSwipeCallback extends EpoxyModelTouchCallback<EpoxyModel<?>> {
    public final ShoppingListItemSwipeListener g;
    public final Rect h;
    public final Lazy i;
    public final Lazy j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemSwipeCallback(Context context, EpoxyController listController, ShoppingListItemSwipeListener shoppingListItemSwipeListener) {
        super(listController);
        Intrinsics.h(listController, "listController");
        this.g = shoppingListItemSwipeListener;
        this.h = new Rect();
        this.i = LazyKt.b(new au.com.woolworths.feature.product.list.legacy.ui.a(context, 13));
        this.j = LazyKt.b(new c(17, context, this));
    }

    public abstract int A();

    @Override // com.airbnb.epoxy.BaseEpoxyTouchCallback
    public final int a(EpoxyModel epoxyModel) {
        return ((epoxyModel instanceof ItemShoppingListTextBindingModel_) || (epoxyModel instanceof ItemShoppingListProductBindingModel_)) ? ItemTouchHelper.Callback.g(0, A()) : ItemTouchHelper.Callback.g(0, 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModelTouchCallback, com.airbnb.epoxy.EpoxyTouchHelperCallback
    public final void n(Canvas c, RecyclerView recyclerView, EpoxyViewHolder viewHolder, float f, float f2, int i, boolean z) {
        Intrinsics.h(c, "c");
        Intrinsics.h(viewHolder, "viewHolder");
        if (i == 1) {
            View itemView = viewHolder.itemView;
            Intrinsics.g(itemView, "itemView");
            if (y(f, itemView, c)) {
                super.n(c, recyclerView, viewHolder, f, f2, i, z);
            }
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
    public final boolean q(EpoxyModel epoxyModel) {
        return epoxyModel instanceof ItemShoppingListTextBindingModel_ ? ((ItemShoppingListTextBindingModel_) epoxyModel).o.c != 0 : epoxyModel instanceof ItemShoppingListProductBindingModel_;
    }

    @Override // com.airbnb.epoxy.EpoxyModelTouchCallback
    public final void u(EpoxyModel model, View itemView) {
        Intrinsics.h(model, "model");
        Intrinsics.h(itemView, "itemView");
        ShoppingListItemUiModel shoppingListItemUiModel = model instanceof ItemShoppingListTextBindingModel_ ? ((ItemShoppingListTextBindingModel_) model).o : model instanceof ItemShoppingListProductBindingModel_ ? ((ItemShoppingListProductBindingModel_) model).o : null;
        if (shoppingListItemUiModel != null) {
            this.g.a(shoppingListItemUiModel);
        }
    }

    public abstract boolean y(float f, View view, Canvas canvas);

    public abstract int z();
}
