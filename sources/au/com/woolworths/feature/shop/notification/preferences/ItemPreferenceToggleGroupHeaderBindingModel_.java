package au.com.woolworths.feature.shop.notification.preferences;

import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class ItemPreferenceToggleGroupHeaderBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemPreferenceToggleGroupHeaderBindingModelBuilder {
    public String n;
    public String o;
    public Boolean p;

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
        if (!viewDataBinding.G(263, this.n)) {
            throw new IllegalStateException("The attribute title was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(56, this.o)) {
            throw new IllegalStateException("The attribute description was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(141, this.p)) {
            throw new IllegalStateException("The attribute isToggleInProgress was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemPreferenceToggleGroupHeaderBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemPreferenceToggleGroupHeaderBindingModel_ itemPreferenceToggleGroupHeaderBindingModel_ = (ItemPreferenceToggleGroupHeaderBindingModel_) epoxyModel;
        String str = this.n;
        if (str == null ? itemPreferenceToggleGroupHeaderBindingModel_.n != null : !str.equals(itemPreferenceToggleGroupHeaderBindingModel_.n)) {
            viewDataBinding.G(263, this.n);
        }
        String str2 = this.o;
        if (str2 == null ? itemPreferenceToggleGroupHeaderBindingModel_.o != null : !str2.equals(itemPreferenceToggleGroupHeaderBindingModel_.o)) {
            viewDataBinding.G(56, this.o);
        }
        Boolean bool = this.p;
        Boolean bool2 = itemPreferenceToggleGroupHeaderBindingModel_.p;
        if (bool != null) {
            if (bool.equals(bool2)) {
                return;
            }
        } else if (bool2 == null) {
            return;
        }
        viewDataBinding.G(141, this.p);
    }

    public final ItemPreferenceToggleGroupHeaderBindingModel_ M(String str) {
        super.p(str);
        return this;
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
        if (!(obj instanceof ItemPreferenceToggleGroupHeaderBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemPreferenceToggleGroupHeaderBindingModel_ itemPreferenceToggleGroupHeaderBindingModel_ = (ItemPreferenceToggleGroupHeaderBindingModel_) obj;
        String str = this.n;
        if (str == null ? itemPreferenceToggleGroupHeaderBindingModel_.n != null : !str.equals(itemPreferenceToggleGroupHeaderBindingModel_.n)) {
            return false;
        }
        String str2 = this.o;
        if (str2 == null ? itemPreferenceToggleGroupHeaderBindingModel_.o != null : !str2.equals(itemPreferenceToggleGroupHeaderBindingModel_.o)) {
            return false;
        }
        Boolean bool = this.p;
        Boolean bool2 = itemPreferenceToggleGroupHeaderBindingModel_.p;
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        String str = this.n;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.p;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_preference_toggle_group_header;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemPreferenceToggleGroupHeaderBindingModel_{title=" + this.n + ", description=" + this.o + ", isToggleInProgress=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
