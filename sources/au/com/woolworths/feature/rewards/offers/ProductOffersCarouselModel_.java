package au.com.woolworths.feature.rewards.offers;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.Carousel;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes3.dex */
public class ProductOffersCarouselModel_ extends EpoxyModel<ProductOffersCarousel> implements GeneratedModel<ProductOffersCarousel>, ProductOffersCarouselModelBuilder {
    public b o;
    public ArrayList p;
    public final BitSet n = new BitSet(7);
    public Carousel.Padding q = null;
    public float r = BitmapDescriptorFactory.HUE_RED;
    public int s = -1;

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        ProductOffersCarousel productOffersCarousel = (ProductOffersCarousel) obj;
        EpoxyController epoxyController = productOffersCarousel.S0;
        if (epoxyController != null) {
            epoxyController.cancelPendingModelBuild();
        }
        productOffersCarousel.S0 = null;
        productOffersCarousel.C0(null, true);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void h(ProductOffersCarousel productOffersCarousel) {
        BitSet bitSet = this.n;
        if (bitSet.get(1)) {
            productOffersCarousel.setPadding(this.q);
        } else if (bitSet.get(5)) {
            productOffersCarousel.setPaddingRes(0);
        } else if (bitSet.get(6)) {
            productOffersCarousel.setPaddingDp(this.s);
        } else {
            productOffersCarousel.setPaddingDp(this.s);
        }
        productOffersCarousel.setHasFixedSize(false);
        if (!bitSet.get(3) && bitSet.get(4)) {
            productOffersCarousel.setInitialPrefetchItemCount(0);
        } else {
            productOffersCarousel.setNumViewsToShowOnScreen(this.r);
        }
        productOffersCarousel.setModels(this.p);
    }

    public final void D(String str) {
        super.p(str);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        ProductOffersCarousel productOffersCarousel = (ProductOffersCarousel) obj;
        b bVar = this.o;
        if (bVar != null) {
            bVar.g(i, this, productOffersCarousel);
        }
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
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        ArrayList arrayList;
        Carousel.Padding padding;
        if (obj != this) {
            if ((obj instanceof ProductOffersCarouselModel_) && super.equals(obj)) {
                ProductOffersCarouselModel_ productOffersCarouselModel_ = (ProductOffersCarouselModel_) obj;
                if ((this.o == null) == (productOffersCarouselModel_.o == null) && ((arrayList = this.p) == null ? productOffersCarouselModel_.p == null : arrayList.equals(productOffersCarouselModel_.p)) && ((padding = this.q) == null ? productOffersCarouselModel_.q == null : padding.equals(productOffersCarouselModel_.q)) && Float.compare(productOffersCarouselModel_.r, this.r) == 0 && this.s == productOffersCarouselModel_.s) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        ProductOffersCarousel productOffersCarousel = (ProductOffersCarousel) obj;
        if (!(epoxyModel instanceof ProductOffersCarouselModel_)) {
            h(productOffersCarousel);
            return;
        }
        ProductOffersCarouselModel_ productOffersCarouselModel_ = (ProductOffersCarouselModel_) epoxyModel;
        BitSet bitSet = productOffersCarouselModel_.n;
        BitSet bitSet2 = this.n;
        if (bitSet2.get(1)) {
            if (!bitSet.get(1)) {
                productOffersCarousel.setPadding(this.q);
            } else if ((r2 = this.q) != null) {
                productOffersCarousel.setPadding(this.q);
            } else {
                productOffersCarousel.setPadding(this.q);
            }
        } else if (!bitSet2.get(5)) {
            if (bitSet2.get(6)) {
                int i = this.s;
                if (i != productOffersCarouselModel_.s) {
                    productOffersCarousel.setPaddingDp(i);
                }
            } else if (bitSet.get(1) || bitSet.get(5) || bitSet.get(6)) {
                productOffersCarousel.setPaddingDp(this.s);
            }
        }
        if (bitSet2.get(3)) {
            if (Float.compare(productOffersCarouselModel_.r, this.r) != 0) {
                productOffersCarousel.setNumViewsToShowOnScreen(this.r);
            }
        } else if (!bitSet2.get(4) && (bitSet.get(3) || bitSet.get(4))) {
            productOffersCarousel.setNumViewsToShowOnScreen(this.r);
        }
        ArrayList arrayList = this.p;
        ArrayList arrayList2 = productOffersCarouselModel_.p;
        if (arrayList != null) {
            if (arrayList.equals(arrayList2)) {
                return;
            }
        } else if (arrayList2 == null) {
            return;
        }
        productOffersCarousel.setModels(this.p);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((super.hashCode() * 31) + (this.o != null ? 1 : 0)) * 923521;
        ArrayList arrayList = this.p;
        int iHashCode2 = (iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        Carousel.Padding padding = this.q;
        int iHashCode3 = (iHashCode2 + (padding != null ? padding.hashCode() : 0)) * 961;
        float f = this.r;
        return ((iHashCode3 + (f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0)) * 29791) + this.s;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        ProductOffersCarousel productOffersCarousel = new ProductOffersCarousel(viewGroup.getContext());
        productOffersCarousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return productOffersCarousel;
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
        return "ProductOffersCarouselModel_{models_List=" + this.p + ", padding_Padding=" + this.q + ", hasFixedSize_Boolean=false, numViewsToShowOnScreen_Float=" + this.r + ", initialPrefetchItemCount_Int=0, paddingRes_Int=0, paddingDp_Int=" + this.s + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
