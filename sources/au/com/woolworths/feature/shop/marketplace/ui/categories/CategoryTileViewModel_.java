package au.com.woolworths.feature.shop.marketplace.ui.categories;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class CategoryTileViewModel_ extends EpoxyModel<CategoryTileView> implements GeneratedModel<CategoryTileView>, CategoryTileViewModelBuilder {
    public String n;
    public String o;
    public a p;

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        ((CategoryTileView) obj).setOnClickListener((Function0<Unit>) null);
    }

    public final CategoryTileViewModel_ C(String str) {
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
        if (obj != this) {
            if ((obj instanceof CategoryTileViewModel_) && super.equals(obj)) {
                CategoryTileViewModel_ categoryTileViewModel_ = (CategoryTileViewModel_) obj;
                String str = this.n;
                if (str == null ? categoryTileViewModel_.n == null : str.equals(categoryTileViewModel_.n)) {
                    String str2 = this.o;
                    if (str2 == null ? categoryTileViewModel_.o == null : str2.equals(categoryTileViewModel_.o)) {
                        if ((this.p == null) != (categoryTileViewModel_.p == null)) {
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
        CategoryTileView categoryTileView = (CategoryTileView) obj;
        if (!(epoxyModel instanceof CategoryTileViewModel_)) {
            categoryTileView.setImageUrl(this.o);
            categoryTileView.setOnClickListener(this.p);
            categoryTileView.setTitle(this.n);
            return;
        }
        CategoryTileViewModel_ categoryTileViewModel_ = (CategoryTileViewModel_) epoxyModel;
        String str = this.o;
        if (str == null ? categoryTileViewModel_.o != null : !str.equals(categoryTileViewModel_.o)) {
            categoryTileView.setImageUrl(this.o);
        }
        a aVar = this.p;
        if ((aVar == null) != (categoryTileViewModel_.p == null)) {
            categoryTileView.setOnClickListener(aVar);
        }
        String str2 = this.n;
        String str3 = categoryTileViewModel_.n;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return;
            }
        } else if (str3 == null) {
            return;
        }
        categoryTileView.setTitle(this.n);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) {
        CategoryTileView categoryTileView = (CategoryTileView) obj;
        categoryTileView.setImageUrl(this.o);
        categoryTileView.setOnClickListener(this.p);
        categoryTileView.setTitle(this.n);
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
        CategoryTileView categoryTileView = new CategoryTileView(viewGroup.getContext());
        categoryTileView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return categoryTileView;
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
        return "CategoryTileViewModel_{title_String=" + this.n + ", imageUrl_String=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
