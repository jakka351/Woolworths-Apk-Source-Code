package au.com.woolworths.feature.shop.catalogue.browse.page.promotion;

import android.view.View;
import android.view.ViewGroup;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import java.util.BitSet;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class PromotionPageEpoxyModelModel_ extends EpoxyModel<PromotionPageEpoxyModel> implements GeneratedModel<PromotionPageEpoxyModel>, PromotionPageEpoxyModelModelBuilder {
    public BrowsePage.Promotion o;
    public StateFlow p;
    public final BitSet n = new BitSet(4);
    public l q = null;
    public au.com.woolworths.feature.shop.catalogue.browse.page.a r = null;

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        PromotionPageEpoxyModel promotionPageEpoxyModel = (PromotionPageEpoxyModel) obj;
        promotionPageEpoxyModel.setOnPromotionCardClick(null);
        promotionPageEpoxyModel.setOnPromotionPageButtonClick(null);
    }

    public final void C(String str) {
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
        BitSet bitSet = this.n;
        if (!bitSet.get(1)) {
            throw new IllegalStateException("A value is required for setPagingFlow");
        }
        if (!bitSet.get(0)) {
            throw new IllegalStateException("A value is required for setPage");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof PromotionPageEpoxyModelModel_) && super.equals(obj)) {
                PromotionPageEpoxyModelModel_ promotionPageEpoxyModelModel_ = (PromotionPageEpoxyModelModel_) obj;
                BrowsePage.Promotion promotion = this.o;
                if (promotion == null ? promotionPageEpoxyModelModel_.o == null : promotion.equals(promotionPageEpoxyModelModel_.o)) {
                    StateFlow stateFlow = this.p;
                    if (stateFlow == null ? promotionPageEpoxyModelModel_.p == null : stateFlow.equals(promotionPageEpoxyModelModel_.p)) {
                        if ((this.q == null) == (promotionPageEpoxyModelModel_.q == null)) {
                            if ((this.r == null) != (promotionPageEpoxyModelModel_.r == null)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        PromotionPageEpoxyModel promotionPageEpoxyModel = (PromotionPageEpoxyModel) obj;
        if (!(epoxyModel instanceof PromotionPageEpoxyModelModel_)) {
            promotionPageEpoxyModel.setPagingFlow(this.p);
            promotionPageEpoxyModel.setOnPromotionCardClick(this.q);
            promotionPageEpoxyModel.setOnPromotionPageButtonClick(this.r);
            promotionPageEpoxyModel.setPage(this.o);
            return;
        }
        PromotionPageEpoxyModelModel_ promotionPageEpoxyModelModel_ = (PromotionPageEpoxyModelModel_) epoxyModel;
        StateFlow stateFlow = this.p;
        if (stateFlow == null ? promotionPageEpoxyModelModel_.p != null : !stateFlow.equals(promotionPageEpoxyModelModel_.p)) {
            promotionPageEpoxyModel.setPagingFlow(this.p);
        }
        l lVar = this.q;
        if ((lVar == null) != (promotionPageEpoxyModelModel_.q == null)) {
            promotionPageEpoxyModel.setOnPromotionCardClick(lVar);
        }
        au.com.woolworths.feature.shop.catalogue.browse.page.a aVar = this.r;
        if ((aVar == null) != (promotionPageEpoxyModelModel_.r == null)) {
            promotionPageEpoxyModel.setOnPromotionPageButtonClick(aVar);
        }
        BrowsePage.Promotion promotion = this.o;
        BrowsePage.Promotion promotion2 = promotionPageEpoxyModelModel_.o;
        if (promotion != null) {
            if (promotion.equals(promotion2)) {
                return;
            }
        } else if (promotion2 == null) {
            return;
        }
        promotionPageEpoxyModel.setPage(this.o);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        PromotionPageEpoxyModel promotionPageEpoxyModel = (PromotionPageEpoxyModel) obj;
        promotionPageEpoxyModel.setPagingFlow(this.p);
        promotionPageEpoxyModel.setOnPromotionCardClick(this.q);
        promotionPageEpoxyModel.setOnPromotionPageButtonClick(this.r);
        promotionPageEpoxyModel.setPage(this.o);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        BrowsePage.Promotion promotion = this.o;
        int iHashCode2 = (iHashCode + (promotion != null ? promotion.hashCode() : 0)) * 31;
        StateFlow stateFlow = this.p;
        return ((((iHashCode2 + (stateFlow != null ? stateFlow.hashCode() : 0)) * 31) + (this.q != null ? 1 : 0)) * 31) + (this.r != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        PromotionPageEpoxyModel promotionPageEpoxyModel = new PromotionPageEpoxyModel(viewGroup.getContext());
        promotionPageEpoxyModel.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        return promotionPageEpoxyModel;
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
        return "PromotionPageEpoxyModelModel_{page_Promotion=" + this.o + ", pagingFlow_StateFlow=" + this.p + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
