package au.com.woolworths.shop.cart;

import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.shop.cart.ui.CartSectionOptionsListener;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes4.dex */
public class CartItemSectionMenuOptionBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, CartItemSectionMenuOptionBindingModelBuilder {
    public Integer n;
    public ResWithArgText o;
    public String p;
    public Boolean q;
    public CartSectionOptionsListener r;

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
        if (!viewDataBinding.G(103, this.n)) {
            throw new IllegalStateException("The attribute iconResId was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(186, this.o)) {
            throw new IllegalStateException("The attribute optionText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(BERTags.FLAGS, this.p)) {
            throw new IllegalStateException("The attribute sectionTitle was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(133, this.q)) {
            throw new IllegalStateException("The attribute isMarketplace was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.r)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof CartItemSectionMenuOptionBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        CartItemSectionMenuOptionBindingModel_ cartItemSectionMenuOptionBindingModel_ = (CartItemSectionMenuOptionBindingModel_) epoxyModel;
        Integer num = this.n;
        if (num == null ? cartItemSectionMenuOptionBindingModel_.n != null : !num.equals(cartItemSectionMenuOptionBindingModel_.n)) {
            viewDataBinding.G(103, this.n);
        }
        ResWithArgText resWithArgText = this.o;
        if ((resWithArgText == null) != (cartItemSectionMenuOptionBindingModel_.o == null)) {
            viewDataBinding.G(186, resWithArgText);
        }
        String str = this.p;
        if (str == null ? cartItemSectionMenuOptionBindingModel_.p != null : !str.equals(cartItemSectionMenuOptionBindingModel_.p)) {
            viewDataBinding.G(BERTags.FLAGS, this.p);
        }
        Boolean bool = this.q;
        if (bool == null ? cartItemSectionMenuOptionBindingModel_.q != null : !bool.equals(cartItemSectionMenuOptionBindingModel_.q)) {
            viewDataBinding.G(133, this.q);
        }
        CartSectionOptionsListener cartSectionOptionsListener = this.r;
        if ((cartSectionOptionsListener == null) != (cartItemSectionMenuOptionBindingModel_.r == null)) {
            viewDataBinding.G(157, cartSectionOptionsListener);
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
        String str;
        Boolean bool;
        if (obj != this) {
            if ((obj instanceof CartItemSectionMenuOptionBindingModel_) && super.equals(obj)) {
                CartItemSectionMenuOptionBindingModel_ cartItemSectionMenuOptionBindingModel_ = (CartItemSectionMenuOptionBindingModel_) obj;
                Integer num = this.n;
                if (num == null ? cartItemSectionMenuOptionBindingModel_.n == null : num.equals(cartItemSectionMenuOptionBindingModel_.n)) {
                    if ((this.o == null) == (cartItemSectionMenuOptionBindingModel_.o == null) && ((str = this.p) == null ? cartItemSectionMenuOptionBindingModel_.p == null : str.equals(cartItemSectionMenuOptionBindingModel_.p)) && ((bool = this.q) == null ? cartItemSectionMenuOptionBindingModel_.q == null : bool.equals(cartItemSectionMenuOptionBindingModel_.q))) {
                        if ((this.r == null) != (cartItemSectionMenuOptionBindingModel_.r == null)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        Integer num = this.n;
        int iHashCode2 = (((iHashCode + (num != null ? num.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0)) * 31;
        String str = this.p;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.q;
        return ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + (this.r != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_cart_item_section_menu_option;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "CartItemSectionMenuOptionBindingModel_{iconResId=" + this.n + ", optionText=" + this.o + ", sectionTitle=" + this.p + ", isMarketplace=" + this.q + ", listener=" + this.r + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
