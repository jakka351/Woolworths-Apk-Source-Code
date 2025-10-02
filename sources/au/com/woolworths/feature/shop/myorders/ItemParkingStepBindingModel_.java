package au.com.woolworths.feature.shop.myorders;

import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.IdUtils;

/* loaded from: classes3.dex */
public class ItemParkingStepBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemParkingStepBindingModelBuilder {
    public int n;
    public String o;

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
        if (!viewDataBinding.G(254, Integer.valueOf(this.n))) {
            throw new IllegalStateException("The attribute stepIndex was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(253, this.o)) {
            throw new IllegalStateException("The attribute stepContent was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemParkingStepBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemParkingStepBindingModel_ itemParkingStepBindingModel_ = (ItemParkingStepBindingModel_) epoxyModel;
        int i = this.n;
        if (i != itemParkingStepBindingModel_.n) {
            viewDataBinding.G(254, Integer.valueOf(i));
        }
        String str = this.o;
        String str2 = itemParkingStepBindingModel_.o;
        if (str != null) {
            if (str.equals(str2)) {
                return;
            }
        } else if (str2 == null) {
            return;
        }
        viewDataBinding.G(253, this.o);
    }

    public final ItemParkingStepBindingModel_ M(long j) {
        long j2 = j ^ (j << 21);
        long j3 = j2 ^ (j2 >>> 35);
        super.o((j3 ^ (j3 << 4)) + (IdUtils.a("parking_step") * 31));
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
        if (!(obj instanceof ItemParkingStepBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemParkingStepBindingModel_ itemParkingStepBindingModel_ = (ItemParkingStepBindingModel_) obj;
        if (this.n != itemParkingStepBindingModel_.n) {
            return false;
        }
        String str = this.o;
        String str2 = itemParkingStepBindingModel_.o;
        return str == null ? str2 == null : str.equals(str2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 28629151) + this.n) * 31;
        String str = this.o;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_parking_step;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemParkingStepBindingModel_{stepIndex=" + this.n + ", stepContent=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
