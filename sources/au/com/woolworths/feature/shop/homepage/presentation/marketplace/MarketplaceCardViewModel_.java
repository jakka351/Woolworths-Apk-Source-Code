package au.com.woolworths.feature.shop.homepage.presentation.marketplace;

import android.view.View;
import android.view.ViewGroup;
import au.com.woolworths.feature.shop.homepage.data.MarketplaceCard;
import au.com.woolworths.feature.shop.homepage.presentation.MarketplaceCardClickListener;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class MarketplaceCardViewModel_ extends EpoxyModel<MarketplaceCardView> implements GeneratedModel<MarketplaceCardView>, MarketplaceCardViewModelBuilder {
    public MarketplaceCard n;
    public MarketplaceCardClickListener o;

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        ((MarketplaceCardView) obj).setOnClickListener((MarketplaceCardClickListener) null);
    }

    public final MarketplaceCardViewModel_ C(String str) {
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
        if (!(obj instanceof MarketplaceCardViewModel_) || !super.equals(obj)) {
            return false;
        }
        MarketplaceCardViewModel_ marketplaceCardViewModel_ = (MarketplaceCardViewModel_) obj;
        MarketplaceCard marketplaceCard = this.n;
        if (marketplaceCard == null ? marketplaceCardViewModel_.n == null : marketplaceCard.equals(marketplaceCardViewModel_.n)) {
            return (this.o == null) == (marketplaceCardViewModel_.o == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        MarketplaceCardView marketplaceCardView = (MarketplaceCardView) obj;
        if (!(epoxyModel instanceof MarketplaceCardViewModel_)) {
            marketplaceCardView.setOnClickListener(this.o);
            marketplaceCardView.setData(this.n);
            return;
        }
        MarketplaceCardViewModel_ marketplaceCardViewModel_ = (MarketplaceCardViewModel_) epoxyModel;
        MarketplaceCardClickListener marketplaceCardClickListener = this.o;
        if ((marketplaceCardClickListener == null) != (marketplaceCardViewModel_.o == null)) {
            marketplaceCardView.setOnClickListener(marketplaceCardClickListener);
        }
        MarketplaceCard marketplaceCard = this.n;
        MarketplaceCard marketplaceCard2 = marketplaceCardViewModel_.n;
        if (marketplaceCard != null) {
            if (marketplaceCard.equals(marketplaceCard2)) {
                return;
            }
        } else if (marketplaceCard2 == null) {
            return;
        }
        marketplaceCardView.setData(this.n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        MarketplaceCardView marketplaceCardView = (MarketplaceCardView) obj;
        marketplaceCardView.setOnClickListener(this.o);
        marketplaceCardView.setData(this.n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        MarketplaceCard marketplaceCard = this.n;
        return ((iHashCode + (marketplaceCard != null ? marketplaceCard.hashCode() : 0)) * 31) + (this.o != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        MarketplaceCardView marketplaceCardView = new MarketplaceCardView(viewGroup.getContext());
        marketplaceCardView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return marketplaceCardView;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int m(int i, int i2, int i3) {
        return i;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int n() {
        return 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "MarketplaceCardViewModel_{data_MarketplaceCard=" + this.n + ", onClickListener_MarketplaceCardClickListener=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
