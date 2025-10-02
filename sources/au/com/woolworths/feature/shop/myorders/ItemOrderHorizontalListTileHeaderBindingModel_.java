package au.com.woolworths.feature.shop.myorders;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.feature.shop.myorders.details.epoxy.a;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemOrderHorizontalListTileHeaderBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemOrderHorizontalListTileHeaderBindingModelBuilder {
    public a n;
    public HorizontalListData o;
    public HorizontalListActionClickListener p;

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final void A(EpoxyHolder epoxyHolder) {
        super.A((DataBindingEpoxyModel.DataBindingHolder) epoxyHolder);
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void J(ViewDataBinding viewDataBinding) {
        if (!viewDataBinding.G(53, this.o)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(92, this.p)) {
            throw new IllegalStateException("The attribute handler was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemOrderHorizontalListTileHeaderBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemOrderHorizontalListTileHeaderBindingModel_ itemOrderHorizontalListTileHeaderBindingModel_ = (ItemOrderHorizontalListTileHeaderBindingModel_) epoxyModel;
        HorizontalListData horizontalListData = this.o;
        if (horizontalListData == null ? itemOrderHorizontalListTileHeaderBindingModel_.o != null : !horizontalListData.equals(itemOrderHorizontalListTileHeaderBindingModel_.o)) {
            viewDataBinding.G(53, this.o);
        }
        HorizontalListActionClickListener horizontalListActionClickListener = this.p;
        if ((horizontalListActionClickListener == null) != (itemOrderHorizontalListTileHeaderBindingModel_.p == null)) {
            viewDataBinding.G(92, horizontalListActionClickListener);
        }
    }

    public final void M() {
        super.p("horizontal-list-section-header");
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        DataBindingEpoxyModel.DataBindingHolder dataBindingHolder = (DataBindingEpoxyModel.DataBindingHolder) obj;
        a aVar = this.n;
        if (aVar != null) {
            aVar.g(i, this, dataBindingHolder);
        }
        B(i, "The model was changed during the bind call.");
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void b(int i, Object obj) {
        B(i, "The model was changed between being added to the controller and being bound.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void c(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        d(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        HorizontalListData horizontalListData;
        if (obj != this) {
            if ((obj instanceof ItemOrderHorizontalListTileHeaderBindingModel_) && super.equals(obj)) {
                ItemOrderHorizontalListTileHeaderBindingModel_ itemOrderHorizontalListTileHeaderBindingModel_ = (ItemOrderHorizontalListTileHeaderBindingModel_) obj;
                if ((this.n == null) == (itemOrderHorizontalListTileHeaderBindingModel_.n == null) && ((horizontalListData = this.o) == null ? itemOrderHorizontalListTileHeaderBindingModel_.o == null : horizontalListData.equals(itemOrderHorizontalListTileHeaderBindingModel_.o))) {
                    if ((this.p == null) != (itemOrderHorizontalListTileHeaderBindingModel_.p == null)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + (this.n != null ? 1 : 0)) * 923521;
        HorizontalListData horizontalListData = this.o;
        return ((iHashCode + (horizontalListData != null ? horizontalListData.hashCode() : 0)) * 31) + (this.p == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_order_horizontal_list_tile_header;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemOrderHorizontalListTileHeaderBindingModel_{data=" + this.o + ", handler=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
