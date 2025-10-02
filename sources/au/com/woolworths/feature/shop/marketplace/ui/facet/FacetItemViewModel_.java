package au.com.woolworths.feature.shop.marketplace.ui.facet;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class FacetItemViewModel_ extends EpoxyModel<FacetItemView> implements GeneratedModel<FacetItemView>, FacetItemViewModelBuilder {
    public String n = null;
    public String o = null;
    public Function0 p = null;

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        ((FacetItemView) obj).setOnClickListener((Function0<Unit>) null);
    }

    public final FacetItemViewModel_ C(String str) {
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
        if (!(obj instanceof FacetItemViewModel_) || !super.equals(obj)) {
            return false;
        }
        FacetItemViewModel_ facetItemViewModel_ = (FacetItemViewModel_) obj;
        String str = this.n;
        if (str == null ? facetItemViewModel_.n != null : !str.equals(facetItemViewModel_.n)) {
            return false;
        }
        String str2 = this.o;
        if (str2 == null ? facetItemViewModel_.o == null : str2.equals(facetItemViewModel_.o)) {
            return (this.p == null) == (facetItemViewModel_.p == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        FacetItemView facetItemView = (FacetItemView) obj;
        if (!(epoxyModel instanceof FacetItemViewModel_)) {
            facetItemView.setImageUrl(this.o);
            facetItemView.setOnClickListener(this.p);
            facetItemView.setTitle(this.n);
            return;
        }
        FacetItemViewModel_ facetItemViewModel_ = (FacetItemViewModel_) epoxyModel;
        String str = this.o;
        if (str == null ? facetItemViewModel_.o != null : !str.equals(facetItemViewModel_.o)) {
            facetItemView.setImageUrl(this.o);
        }
        Function0<Unit> function0 = this.p;
        if ((function0 == null) != (facetItemViewModel_.p == null)) {
            facetItemView.setOnClickListener(function0);
        }
        String str2 = this.n;
        String str3 = facetItemViewModel_.n;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return;
            }
        } else if (str3 == null) {
            return;
        }
        facetItemView.setTitle(this.n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        FacetItemView facetItemView = (FacetItemView) obj;
        facetItemView.setImageUrl(this.o);
        facetItemView.setOnClickListener(this.p);
        facetItemView.setTitle(this.n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        String str = this.n;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        FacetItemView facetItemView = new FacetItemView(viewGroup.getContext());
        facetItemView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return facetItemView;
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
        return "FacetItemViewModel_{title_String=" + this.n + ", imageUrl_String=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
