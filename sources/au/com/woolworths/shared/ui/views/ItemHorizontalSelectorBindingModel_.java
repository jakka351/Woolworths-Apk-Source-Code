package au.com.woolworths.shared.ui.views;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorItemClickListener;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes4.dex */
public class ItemHorizontalSelectorBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemHorizontalSelectorBindingModelBuilder {
    public Integer n;
    public HorizontalSelectorViewListener o;
    public HorizontalSelectorItemClickListener p;
    public String q;
    public int r;

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
        if (!viewDataBinding.G(110, this.n)) {
            throw new IllegalStateException("The attribute index was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(272, this.o)) {
            throw new IllegalStateException("The attribute viewListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(37, this.p)) {
            throw new IllegalStateException("The attribute clickListener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(150, this.q)) {
            throw new IllegalStateException("The attribute label was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(149, Integer.valueOf(this.r))) {
            throw new IllegalStateException("The attribute itemWidthRes was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemHorizontalSelectorBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemHorizontalSelectorBindingModel_ itemHorizontalSelectorBindingModel_ = (ItemHorizontalSelectorBindingModel_) epoxyModel;
        Integer num = this.n;
        if (num == null ? itemHorizontalSelectorBindingModel_.n != null : !num.equals(itemHorizontalSelectorBindingModel_.n)) {
            viewDataBinding.G(110, this.n);
        }
        HorizontalSelectorViewListener horizontalSelectorViewListener = this.o;
        if ((horizontalSelectorViewListener == null) != (itemHorizontalSelectorBindingModel_.o == null)) {
            viewDataBinding.G(272, horizontalSelectorViewListener);
        }
        HorizontalSelectorItemClickListener horizontalSelectorItemClickListener = this.p;
        if ((horizontalSelectorItemClickListener == null) != (itemHorizontalSelectorBindingModel_.p == null)) {
            viewDataBinding.G(37, horizontalSelectorItemClickListener);
        }
        String str = this.q;
        if (str == null ? itemHorizontalSelectorBindingModel_.q != null : !str.equals(itemHorizontalSelectorBindingModel_.q)) {
            viewDataBinding.G(150, this.q);
        }
        int i = this.r;
        if (i != itemHorizontalSelectorBindingModel_.r) {
            viewDataBinding.G(149, Integer.valueOf(i));
        }
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
        if (!(obj instanceof ItemHorizontalSelectorBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemHorizontalSelectorBindingModel_ itemHorizontalSelectorBindingModel_ = (ItemHorizontalSelectorBindingModel_) obj;
        Integer num = this.n;
        if (num == null ? itemHorizontalSelectorBindingModel_.n != null : !num.equals(itemHorizontalSelectorBindingModel_.n)) {
            return false;
        }
        if ((this.o == null) != (itemHorizontalSelectorBindingModel_.o == null)) {
            return false;
        }
        if ((this.p == null) != (itemHorizontalSelectorBindingModel_.p == null)) {
            return false;
        }
        String str = this.q;
        if (str == null ? itemHorizontalSelectorBindingModel_.q == null : str.equals(itemHorizontalSelectorBindingModel_.q)) {
            return this.r == itemHorizontalSelectorBindingModel_.r;
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        Integer num = this.n;
        int iHashCode2 = (((((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0)) * 31) + (this.p == null ? 0 : 1)) * 31;
        String str = this.q;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.r;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_horizontal_selector;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemHorizontalSelectorBindingModel_{index=" + this.n + ", viewListener=" + this.o + ", clickListener=" + this.p + ", label=" + this.q + ", itemWidthRes=" + this.r + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
