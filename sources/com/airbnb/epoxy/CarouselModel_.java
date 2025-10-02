package com.airbnb.epoxy;

import android.view.ViewGroup;
import com.airbnb.epoxy.Carousel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes4.dex */
public class CarouselModel_ extends EpoxyModel<Carousel> implements GeneratedModel<Carousel>, CarouselModelBuilder {
    public OnModelBoundListener o;
    public OnModelUnboundListener p;
    public ArrayList s;
    public final BitSet n = new BitSet(7);
    public int q = -1;
    public Carousel.Padding r = null;

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        Carousel carousel = (Carousel) obj;
        OnModelUnboundListener onModelUnboundListener = this.p;
        if (onModelUnboundListener != null) {
            onModelUnboundListener.e(this, carousel);
        }
        EpoxyController epoxyController = carousel.S0;
        if (epoxyController != null) {
            epoxyController.cancelPendingModelBuild();
        }
        carousel.S0 = null;
        carousel.C0(null, true);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void h(Carousel carousel) {
        BitSet bitSet = this.n;
        if (bitSet.get(3)) {
            carousel.setPaddingRes(0);
        } else if (!bitSet.get(4) && bitSet.get(5)) {
            carousel.setPadding(this.r);
        } else {
            carousel.setPaddingDp(this.q);
        }
        carousel.setHasFixedSize(false);
        if (!bitSet.get(1) && bitSet.get(2)) {
            carousel.setInitialPrefetchItemCount(0);
        } else {
            carousel.setNumViewsToShowOnScreen(BitmapDescriptorFactory.HUE_RED);
        }
        carousel.setModels(this.s);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Carousel j(ViewGroup viewGroup) {
        Carousel carousel = new Carousel(viewGroup.getContext());
        carousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return carousel;
    }

    public final void E(String str) {
        super.p(str);
    }

    public final void F(ArrayList arrayList) {
        this.n.set(6);
        t();
        this.s = arrayList;
    }

    public final void G(Carousel.Padding padding) {
        BitSet bitSet = this.n;
        bitSet.set(5);
        bitSet.clear(3);
        bitSet.clear(4);
        this.q = -1;
        t();
        this.r = padding;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    public final void a(int i, Object obj) {
        Carousel carousel = (Carousel) obj;
        OnModelBoundListener onModelBoundListener = this.o;
        if (onModelBoundListener != null) {
            onModelBoundListener.g(i, this, carousel);
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
        if (!this.n.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean equals(Object obj) {
        Carousel.Padding padding;
        if (obj != this) {
            if ((obj instanceof CarouselModel_) && super.equals(obj)) {
                CarouselModel_ carouselModel_ = (CarouselModel_) obj;
                if ((this.o == null) == (carouselModel_.o == null)) {
                    if ((this.p == null) == (carouselModel_.p == null) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && this.q == carouselModel_.q && ((padding = this.r) == null ? carouselModel_.r == null : padding.equals(carouselModel_.r))) {
                        ArrayList arrayList = this.s;
                        ArrayList arrayList2 = carouselModel_.s;
                        if (arrayList == null ? arrayList2 == null : arrayList.equals(arrayList2)) {
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
        Carousel carousel = (Carousel) obj;
        if (!(epoxyModel instanceof CarouselModel_)) {
            h(carousel);
            return;
        }
        CarouselModel_ carouselModel_ = (CarouselModel_) epoxyModel;
        BitSet bitSet = carouselModel_.n;
        BitSet bitSet2 = this.n;
        if (!bitSet2.get(3)) {
            if (bitSet2.get(4)) {
                int i = this.q;
                if (i != carouselModel_.q) {
                    carousel.setPaddingDp(i);
                }
            } else if (bitSet2.get(5)) {
                if (!bitSet.get(5)) {
                    carousel.setPadding(this.r);
                } else if ((r2 = this.r) != null) {
                    carousel.setPadding(this.r);
                } else {
                    carousel.setPadding(this.r);
                }
            } else if (bitSet.get(3) || bitSet.get(4) || bitSet.get(5)) {
                carousel.setPaddingDp(this.q);
            }
        }
        if (bitSet2.get(1)) {
            if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) != 0) {
                carousel.setNumViewsToShowOnScreen(BitmapDescriptorFactory.HUE_RED);
            }
        } else if (!bitSet2.get(2) && (bitSet.get(1) || bitSet.get(2))) {
            carousel.setNumViewsToShowOnScreen(BitmapDescriptorFactory.HUE_RED);
        }
        ArrayList arrayList = this.s;
        ArrayList arrayList2 = carouselModel_.s;
        if (arrayList != null) {
            if (arrayList.equals(arrayList2)) {
                return;
            }
        } else if (arrayList2 == null) {
            return;
        }
        carousel.setModels(this.s);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = ((((((super.hashCode() * 31) + (this.o != null ? 1 : 0)) * 31) + (this.p == null ? 0 : 1)) * 1742810335) + this.q) * 31;
        Carousel.Padding padding = this.r;
        int iHashCode2 = (iHashCode + (padding != null ? padding.hashCode() : 0)) * 31;
        ArrayList arrayList = this.s;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
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
        return "CarouselModel_{hasFixedSize_Boolean=false, numViewsToShowOnScreen_Float=0.0, initialPrefetchItemCount_Int=0, paddingRes_Int=0, paddingDp_Int=" + this.q + ", padding_Padding=" + this.r + ", models_List=" + this.s + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean y() {
        return true;
    }
}
