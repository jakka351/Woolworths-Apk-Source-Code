package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import android.view.View;
import android.view.ViewGroup;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import java.util.BitSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class HowItWorksCardViewModel_ extends EpoxyModel<HowItWorksCardView> implements GeneratedModel<HowItWorksCardView>, HowItWorksCardViewModelBuilder {
    public String o;
    public final BitSet n = new BitSet(2);
    public n p = null;

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        ((HowItWorksCardView) obj).setOnClickListener((Function0<Unit>) null);
    }

    public final HowItWorksCardViewModel_ C(String str) {
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
        if (!this.n.get(0)) {
            throw new IllegalStateException("A value is required for setTitle");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof HowItWorksCardViewModel_) && super.equals(obj)) {
                HowItWorksCardViewModel_ howItWorksCardViewModel_ = (HowItWorksCardViewModel_) obj;
                String str = this.o;
                if (str == null ? howItWorksCardViewModel_.o == null : str.equals(howItWorksCardViewModel_.o)) {
                    if ((this.p == null) != (howItWorksCardViewModel_.p == null)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        HowItWorksCardView howItWorksCardView = (HowItWorksCardView) obj;
        if (!(epoxyModel instanceof HowItWorksCardViewModel_)) {
            howItWorksCardView.setOnClickListener(this.p);
            howItWorksCardView.setTitle(this.o);
            return;
        }
        HowItWorksCardViewModel_ howItWorksCardViewModel_ = (HowItWorksCardViewModel_) epoxyModel;
        n nVar = this.p;
        if ((nVar == null) != (howItWorksCardViewModel_.p == null)) {
            howItWorksCardView.setOnClickListener(nVar);
        }
        String str = this.o;
        String str2 = howItWorksCardViewModel_.o;
        if (str != null) {
            if (str.equals(str2)) {
                return;
            }
        } else if (str2 == null) {
            return;
        }
        howItWorksCardView.setTitle(this.o);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        HowItWorksCardView howItWorksCardView = (HowItWorksCardView) obj;
        howItWorksCardView.setOnClickListener(this.p);
        howItWorksCardView.setTitle(this.o);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        String str = this.o;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        HowItWorksCardView howItWorksCardView = new HowItWorksCardView(viewGroup.getContext());
        howItWorksCardView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return howItWorksCardView;
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
        return "HowItWorksCardViewModel_{title_String=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
