package au.com.woolworths.base.shopapp;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemHorizontalListTileHeaderBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemHorizontalListTileHeaderBindingModelBuilder {
    public HorizontalListDataInterface n;
    public HorizontalListActionClickListener o;
    public HorizontalListActionState p;
    public Boolean q;

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
        if (!viewDataBinding.G(53, this.n)) {
            throw new IllegalStateException("The attribute data was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.o)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(3, this.p)) {
            throw new IllegalStateException("The attribute actionState was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(136, this.q)) {
            throw new IllegalStateException("The attribute isRewardStyle was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemHorizontalListTileHeaderBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemHorizontalListTileHeaderBindingModel_ itemHorizontalListTileHeaderBindingModel_ = (ItemHorizontalListTileHeaderBindingModel_) epoxyModel;
        HorizontalListDataInterface horizontalListDataInterface = this.n;
        if ((horizontalListDataInterface == null) != (itemHorizontalListTileHeaderBindingModel_.n == null)) {
            viewDataBinding.G(53, horizontalListDataInterface);
        }
        HorizontalListActionClickListener horizontalListActionClickListener = this.o;
        if ((horizontalListActionClickListener == null) != (itemHorizontalListTileHeaderBindingModel_.o == null)) {
            viewDataBinding.G(157, horizontalListActionClickListener);
        }
        HorizontalListActionState horizontalListActionState = this.p;
        if (horizontalListActionState == null ? itemHorizontalListTileHeaderBindingModel_.p != null : !horizontalListActionState.equals(itemHorizontalListTileHeaderBindingModel_.p)) {
            viewDataBinding.G(3, this.p);
        }
        Boolean bool = this.q;
        Boolean bool2 = itemHorizontalListTileHeaderBindingModel_.q;
        if (bool != null) {
            if (bool.equals(bool2)) {
                return;
            }
        } else if (bool2 == null) {
            return;
        }
        viewDataBinding.G(136, this.q);
    }

    public final void M(String str) {
        super.p(str);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemHorizontalListTileHeaderBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemHorizontalListTileHeaderBindingModel_ itemHorizontalListTileHeaderBindingModel_ = (ItemHorizontalListTileHeaderBindingModel_) obj;
        if ((this.n == null) != (itemHorizontalListTileHeaderBindingModel_.n == null)) {
            return false;
        }
        if ((this.o == null) != (itemHorizontalListTileHeaderBindingModel_.o == null)) {
            return false;
        }
        HorizontalListActionState horizontalListActionState = this.p;
        if (horizontalListActionState == null ? itemHorizontalListTileHeaderBindingModel_.p != null : !horizontalListActionState.equals(itemHorizontalListTileHeaderBindingModel_.p)) {
            return false;
        }
        Boolean bool = this.q;
        Boolean bool2 = itemHorizontalListTileHeaderBindingModel_.q;
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((((super.hashCode() * 28629151) + (this.n != null ? 1 : 0)) * 31) + (this.o == null ? 0 : 1)) * 31;
        HorizontalListActionState horizontalListActionState = this.p;
        int iHashCode2 = (iHashCode + (horizontalListActionState != null ? horizontalListActionState.hashCode() : 0)) * 31;
        Boolean bool = this.q;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_horizontal_list_tile_header;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemHorizontalListTileHeaderBindingModel_{data=" + this.n + ", listener=" + this.o + ", actionState=" + this.p + ", isRewardStyle=" + this.q + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
