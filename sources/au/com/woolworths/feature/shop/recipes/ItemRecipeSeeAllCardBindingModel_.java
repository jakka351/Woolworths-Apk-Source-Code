package au.com.woolworths.feature.shop.recipes;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemRecipeSeeAllCardBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemRecipeSeeAllCardBindingModelBuilder {
    public HorizontalListData n;
    public HorizontalListActionClickListener o;

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
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemRecipeSeeAllCardBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemRecipeSeeAllCardBindingModel_ itemRecipeSeeAllCardBindingModel_ = (ItemRecipeSeeAllCardBindingModel_) epoxyModel;
        HorizontalListData horizontalListData = this.n;
        if (horizontalListData == null ? itemRecipeSeeAllCardBindingModel_.n != null : !horizontalListData.equals(itemRecipeSeeAllCardBindingModel_.n)) {
            viewDataBinding.G(53, this.n);
        }
        HorizontalListActionClickListener horizontalListActionClickListener = this.o;
        if ((horizontalListActionClickListener == null) != (itemRecipeSeeAllCardBindingModel_.o == null)) {
            viewDataBinding.G(157, horizontalListActionClickListener);
        }
    }

    public final void M() {
        super.p("recipe_see_all");
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
        if (!(obj instanceof ItemRecipeSeeAllCardBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemRecipeSeeAllCardBindingModel_ itemRecipeSeeAllCardBindingModel_ = (ItemRecipeSeeAllCardBindingModel_) obj;
        HorizontalListData horizontalListData = this.n;
        if (horizontalListData == null ? itemRecipeSeeAllCardBindingModel_.n == null : horizontalListData.equals(itemRecipeSeeAllCardBindingModel_.n)) {
            return (this.o == null) == (itemRecipeSeeAllCardBindingModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        HorizontalListData horizontalListData = this.n;
        return ((iHashCode + (horizontalListData != null ? horizontalListData.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_recipe_see_all_card;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemRecipeSeeAllCardBindingModel_{data=" + this.n + ", listener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
