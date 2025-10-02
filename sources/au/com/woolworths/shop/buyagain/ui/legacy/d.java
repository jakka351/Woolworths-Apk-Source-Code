package au.com.woolworths.shop.buyagain.ui.legacy;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.ItemBuyAgainProductBindingModel_;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Toolbar.OnMenuItemClickListener, OnModelBoundListener {
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj) {
        this.d = obj;
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        BuyAgainProductListController.buildItemModel$lambda$1((ProductCard) this.d, (ItemBuyAgainProductBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        return BuyAgainFragmentLegacy.I1((BuyAgainFragmentLegacy) this.d, menuItem);
    }
}
