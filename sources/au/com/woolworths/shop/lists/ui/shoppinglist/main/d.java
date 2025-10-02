package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import androidx.appcompat.widget.PopupMenu;
import au.com.woolworths.shop.lists.ItemShoppingListProductBindingModel_;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements PopupMenu.OnMenuItemClickListener, OnModelBoundListener {
    public final /* synthetic */ ProductItemUiModel d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, ProductItemUiModel productItemUiModel) {
        this.e = obj;
        this.d = productItemUiModel;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        ShoppingListDetailsListController.buildXmlProductItemWithOptionsMenu$lambda$12$lambda$11((ShoppingListDetailsListController) this.e, this.d, (ItemShoppingListProductBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
    }
}
