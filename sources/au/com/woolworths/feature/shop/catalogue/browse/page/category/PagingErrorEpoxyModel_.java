package au.com.woolworths.feature.shop.catalogue.browse.page.category;

import au.com.woolworths.android.onesite.common.FullPageErrorCause;
import au.com.woolworths.feature.shop.catalogue.browse.page.PageEpoxyController;
import au.com.woolworths.feature.shop.catalogue.browse.page.category.PagingErrorEpoxyModel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;

/* loaded from: classes3.dex */
public class PagingErrorEpoxyModel_ extends PagingErrorEpoxyModel implements GeneratedModel<PagingErrorEpoxyModel.Holder>, PagingErrorEpoxyModelBuilder {
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void A(Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final /* bridge */ /* synthetic */ void G(EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ void x(int i, EpoxyHolder epoxyHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: I */
    public final /* bridge */ /* synthetic */ void A(EpoxyHolder epoxyHolder) {
    }

    public final void K(String str) {
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PagingErrorEpoxyModel_) || !super.equals(obj)) {
            return false;
        }
        PagingErrorEpoxyModel_ pagingErrorEpoxyModel_ = (PagingErrorEpoxyModel_) obj;
        FullPageErrorCause fullPageErrorCause = this.n;
        if (fullPageErrorCause != null) {
            if (!fullPageErrorCause.equals(pagingErrorEpoxyModel_.n)) {
                return false;
            }
        } else if (pagingErrorEpoxyModel_.n != null) {
            return false;
        }
        PageEpoxyController pageEpoxyController = this.o;
        PageEpoxyController pageEpoxyController2 = pagingErrorEpoxyModel_.o;
        return pageEpoxyController != null ? pageEpoxyController.equals(pageEpoxyController2) : pageEpoxyController2 == null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        FullPageErrorCause fullPageErrorCause = this.n;
        int iHashCode2 = (iHashCode + (fullPageErrorCause != null ? fullPageErrorCause.hashCode() : 0)) * 31;
        PageEpoxyController pageEpoxyController = this.o;
        return iHashCode2 + (pageEpoxyController != null ? pageEpoxyController.hashCode() : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final EpoxyModel o(long j) {
        super.o(j);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final String toString() {
        return "PagingErrorEpoxyModel_{errorState=" + this.n + ", clickHandler=" + this.o + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
