package au.com.woolworths.feature.rewards.offers;

import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes3.dex */
public class ItemRewardsOfferSectionTitleBindingModel_ extends DataBindingEpoxyModel implements GeneratedModel<DataBindingEpoxyModel.DataBindingHolder>, ItemRewardsOfferSectionTitleBindingModelBuilder {
    public OfferSectionViewItem n;
    public String o;
    public String p;
    public boolean q;
    public RewardsOffersClickListener r;
    public Float s;

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
        if (!viewDataBinding.G(222, this.n)) {
            throw new IllegalStateException("The attribute section was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(263, this.o)) {
            throw new IllegalStateException("The attribute title was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(52, this.p)) {
            throw new IllegalStateException("The attribute ctaText was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(125, Boolean.valueOf(this.q))) {
            throw new IllegalStateException("The attribute isCtaInProgress was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(157, this.r)) {
            throw new IllegalStateException("The attribute listener was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
        if (!viewDataBinding.G(BERTags.PRIVATE, this.s)) {
            throw new IllegalStateException("The attribute paddingBottom was defined in your data binding model (com.airbnb.epoxy.DataBindingEpoxyModel) but a data variable of that name was not found in the layout.");
        }
    }

    @Override // com.airbnb.epoxy.DataBindingEpoxyModel
    public final void K(ViewDataBinding viewDataBinding, EpoxyModel epoxyModel) {
        if (!(epoxyModel instanceof ItemRewardsOfferSectionTitleBindingModel_)) {
            J(viewDataBinding);
            return;
        }
        ItemRewardsOfferSectionTitleBindingModel_ itemRewardsOfferSectionTitleBindingModel_ = (ItemRewardsOfferSectionTitleBindingModel_) epoxyModel;
        OfferSectionViewItem offerSectionViewItem = this.n;
        if ((offerSectionViewItem == null) != (itemRewardsOfferSectionTitleBindingModel_.n == null)) {
            viewDataBinding.G(222, offerSectionViewItem);
        }
        String str = this.o;
        if (str == null ? itemRewardsOfferSectionTitleBindingModel_.o != null : !str.equals(itemRewardsOfferSectionTitleBindingModel_.o)) {
            viewDataBinding.G(263, this.o);
        }
        String str2 = this.p;
        if (str2 == null ? itemRewardsOfferSectionTitleBindingModel_.p != null : !str2.equals(itemRewardsOfferSectionTitleBindingModel_.p)) {
            viewDataBinding.G(52, this.p);
        }
        boolean z = this.q;
        if (z != itemRewardsOfferSectionTitleBindingModel_.q) {
            viewDataBinding.G(125, Boolean.valueOf(z));
        }
        RewardsOffersClickListener rewardsOffersClickListener = this.r;
        if ((rewardsOffersClickListener == null) != (itemRewardsOfferSectionTitleBindingModel_.r == null)) {
            viewDataBinding.G(157, rewardsOffersClickListener);
        }
        Float f = this.s;
        Float f2 = itemRewardsOfferSectionTitleBindingModel_.s;
        if (f != null) {
            if (f.equals(f2)) {
                return;
            }
        } else if (f2 == null) {
            return;
        }
        viewDataBinding.G(BERTags.PRIVATE, this.s);
    }

    public final ItemRewardsOfferSectionTitleBindingModel_ M(String str) {
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
        if (!(obj instanceof ItemRewardsOfferSectionTitleBindingModel_) || !super.equals(obj)) {
            return false;
        }
        ItemRewardsOfferSectionTitleBindingModel_ itemRewardsOfferSectionTitleBindingModel_ = (ItemRewardsOfferSectionTitleBindingModel_) obj;
        if ((this.n == null) != (itemRewardsOfferSectionTitleBindingModel_.n == null)) {
            return false;
        }
        String str = this.o;
        if (str == null ? itemRewardsOfferSectionTitleBindingModel_.o != null : !str.equals(itemRewardsOfferSectionTitleBindingModel_.o)) {
            return false;
        }
        String str2 = this.p;
        if (str2 == null ? itemRewardsOfferSectionTitleBindingModel_.p != null : !str2.equals(itemRewardsOfferSectionTitleBindingModel_.p)) {
            return false;
        }
        if (this.q != itemRewardsOfferSectionTitleBindingModel_.q) {
            return false;
        }
        if ((this.r == null) != (itemRewardsOfferSectionTitleBindingModel_.r == null)) {
            return false;
        }
        Float f = this.s;
        Float f2 = itemRewardsOfferSectionTitleBindingModel_.s;
        return f == null ? f2 == null : f.equals(f2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 28629151) + (this.n != null ? 1 : 0)) * 31;
        String str = this.o;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.p;
        int iHashCode3 = (((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.r == null ? 0 : 1)) * 31;
        Float f = this.s;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return com.woolworths.R.layout.epoxy_item_rewards_offer_section_title;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "ItemRewardsOfferSectionTitleBindingModel_{section=" + this.n + ", title=" + this.o + ", ctaText=" + this.p + ", isCtaInProgress=" + this.q + ", listener=" + this.r + ", paddingBottom=" + this.s + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
