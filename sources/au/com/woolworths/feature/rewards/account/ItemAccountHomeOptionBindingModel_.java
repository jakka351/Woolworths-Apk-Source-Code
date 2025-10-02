package au.com.woolworths.feature.rewards.account;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.Text;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class ItemAccountHomeOptionBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemAccountHomeOptionBindingModelBuilder {
    public Text n;
    public Boolean o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public Function0 s;

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
        if (!viewDataBinding.G(232, this.o)) {
            throw new IllegalStateException("The attribute shouldShowNewBadge was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(234, this.p)) {
            throw new IllegalStateException("The attribute shouldShowWebArrow was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(231, this.q)) {
            throw new IllegalStateException("The attribute shouldShowLoadingState was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(233, this.r)) {
            throw new IllegalStateException("The attribute shouldShowNotificationDot was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(177, this.s)) {
            throw new IllegalStateException("The attribute onClick was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemAccountHomeOptionBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_ = (ItemAccountHomeOptionBindingModel_) epoxyModel;
        Text text = this.n;
        if ((text == null) != (itemAccountHomeOptionBindingModel_.n == null)) {
            viewDataBinding.G(263, text);
        }
        Boolean bool = this.o;
        if (bool == null ? itemAccountHomeOptionBindingModel_.o != null : !bool.equals(itemAccountHomeOptionBindingModel_.o)) {
            viewDataBinding.G(232, this.o);
        }
        Boolean bool2 = this.p;
        if (bool2 == null ? itemAccountHomeOptionBindingModel_.p != null : !bool2.equals(itemAccountHomeOptionBindingModel_.p)) {
            viewDataBinding.G(234, this.p);
        }
        Boolean bool3 = this.q;
        if (bool3 == null ? itemAccountHomeOptionBindingModel_.q != null : !bool3.equals(itemAccountHomeOptionBindingModel_.q)) {
            viewDataBinding.G(231, this.q);
        }
        Boolean bool4 = this.r;
        if (bool4 == null ? itemAccountHomeOptionBindingModel_.r != null : !bool4.equals(itemAccountHomeOptionBindingModel_.r)) {
            viewDataBinding.G(233, this.r);
        }
        Function0 function0 = this.s;
        if ((function0 == null) != (itemAccountHomeOptionBindingModel_.s == null)) {
            viewDataBinding.G(177, function0);
        }
    }

    public final ItemAccountHomeOptionBindingModel_ M(String str) {
        super.p(str);
        return this;
    }

    public final ItemAccountHomeOptionBindingModel_ N(Function0 function0) {
        t();
        this.s = function0;
        return this;
    }

    public final ItemAccountHomeOptionBindingModel_ O(Boolean bool) {
        t();
        this.q = bool;
        return this;
    }

    public final ItemAccountHomeOptionBindingModel_ P(Boolean bool) {
        t();
        this.o = bool;
        return this;
    }

    public final ItemAccountHomeOptionBindingModel_ Q(Boolean bool) {
        t();
        this.p = bool;
        return this;
    }

    public final ItemAccountHomeOptionBindingModel_ R(Text text) {
        t();
        this.n = text;
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
        if (!(obj instanceof ItemAccountHomeOptionBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemAccountHomeOptionBindingModel_ itemAccountHomeOptionBindingModel_ = (ItemAccountHomeOptionBindingModel_) obj;
        if ((this.n == null) != (itemAccountHomeOptionBindingModel_.n == null)) {
            return false;
        }
        Boolean bool = this.o;
        if (bool == null ? itemAccountHomeOptionBindingModel_.o != null : !bool.equals(itemAccountHomeOptionBindingModel_.o)) {
            return false;
        }
        Boolean bool2 = this.p;
        if (bool2 == null ? itemAccountHomeOptionBindingModel_.p != null : !bool2.equals(itemAccountHomeOptionBindingModel_.p)) {
            return false;
        }
        Boolean bool3 = this.q;
        if (bool3 == null ? itemAccountHomeOptionBindingModel_.q != null : !bool3.equals(itemAccountHomeOptionBindingModel_.q)) {
            return false;
        }
        Boolean bool4 = this.r;
        if (bool4 == null ? itemAccountHomeOptionBindingModel_.r == null : bool4.equals(itemAccountHomeOptionBindingModel_.r)) {
            return (this.s == null) == (itemAccountHomeOptionBindingModel_.s == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 28629151) + (this.n != null ? 1 : 0)) * 31;
        Boolean bool = this.o;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.p;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.q;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.r;
        return ((iHashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31) + (this.s == null ? 0 : 1);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_account_home_option;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemAccountHomeOptionBindingModel_{title=" + this.n + ", shouldShowNewBadge=" + this.o + ", shouldShowWebArrow=" + this.p + ", shouldShowLoadingState=" + this.q + ", shouldShowNotificationDot=" + this.r + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
