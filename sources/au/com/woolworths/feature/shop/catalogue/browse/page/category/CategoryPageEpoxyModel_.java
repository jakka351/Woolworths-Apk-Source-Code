package au.com.woolworths.feature.shop.catalogue.browse.page.category;

import au.com.woolworths.feature.shop.catalogue.browse.model.BrowsePage;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.CategoryPageEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class CategoryPageEpoxyModel_ extends CategoryPageEpoxyModel implements GeneratedModel<CategoryPageEpoxyModel.Holder>, CategoryPageEpoxyModelBuilder {
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void A(Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // au.com.woolworths.feature.shop.catalogue.browse.page.category.CategoryPageEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final void x(int i, EpoxyHolder epoxyHolder) {
        super.x(i, (CategoryPageEpoxyModel.Holder) epoxyHolder);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void A(EpoxyHolder epoxyHolder) {
    }

    public final void N(String str) {
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
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof CategoryPageEpoxyModel_) && super.equals(obj)) {
                CategoryPageEpoxyModel_ categoryPageEpoxyModel_ = (CategoryPageEpoxyModel_) obj;
                BrowsePage.Category category = this.o;
                if (category == null ? categoryPageEpoxyModel_.o == null : category.equals(categoryPageEpoxyModel_.o)) {
                    if ((this.p == null) == (categoryPageEpoxyModel_.p == null)) {
                        if ((this.q == null) == (categoryPageEpoxyModel_.q == null)) {
                            if ((this.r == null) != (categoryPageEpoxyModel_.r == null)) {
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
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        BrowsePage.Category category = this.o;
        return ((((((iHashCode + (category != null ? category.hashCode() : 0)) * 31) + (this.p != null ? 1 : 0)) * 31) + (this.q != null ? 1 : 0)) * 31) + (this.r != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "CategoryPageEpoxyModel_{page=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // au.com.woolworths.feature.shop.catalogue.browse.page.category.CategoryPageEpoxyModel, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void x(int i, Object obj) {
        super.x(i, (CategoryPageEpoxyModel.Holder) obj);
    }
}
