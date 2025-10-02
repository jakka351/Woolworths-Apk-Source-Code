package au.com.woolworths.feature.shop.homepage.presentation.boosters;

import android.view.View;
import android.view.ViewGroup;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.feature.shop.homepage.data.BoosterHorizontalListData;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.GeneratedModel;
import java.util.List;

/* loaded from: classes3.dex */
public class MyBoostersViewModel_ extends EpoxyModel<MyBoostersView> implements GeneratedModel<MyBoostersView>, MyBoostersViewModelBuilder {
    public BoosterHorizontalListData n;
    public ProductCardConfig o;
    public HorizontalListActionState p;
    public List q;
    public HorizontalListActionClickListener r;
    public ProductClickListener s;

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void A(Object obj) {
        MyBoostersView myBoostersView = (MyBoostersView) obj;
        myBoostersView.setHorizontalListActionClickListener(null);
        myBoostersView.setProductCardClickListener(null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void h(MyBoostersView myBoostersView) {
        myBoostersView.setProductCardConfig(this.o);
        myBoostersView.setHorizontalListActionClickListener(this.r);
        myBoostersView.setData(this.n);
        myBoostersView.setHorizontalListActionState(this.p);
        myBoostersView.setProductCardClickListener(this.s);
        myBoostersView.setWatchlistedProductIds(this.q);
    }

    public final void D(String str) {
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
        if (!(obj instanceof MyBoostersViewModel_) || !super.equals(obj)) {
            return false;
        }
        MyBoostersViewModel_ myBoostersViewModel_ = (MyBoostersViewModel_) obj;
        BoosterHorizontalListData boosterHorizontalListData = this.n;
        if (boosterHorizontalListData == null ? myBoostersViewModel_.n != null : !boosterHorizontalListData.equals(myBoostersViewModel_.n)) {
            return false;
        }
        ProductCardConfig productCardConfig = this.o;
        if (productCardConfig == null ? myBoostersViewModel_.o != null : !productCardConfig.equals(myBoostersViewModel_.o)) {
            return false;
        }
        HorizontalListActionState horizontalListActionState = this.p;
        if (horizontalListActionState == null ? myBoostersViewModel_.p != null : !horizontalListActionState.equals(myBoostersViewModel_.p)) {
            return false;
        }
        List list = this.q;
        if (list == null ? myBoostersViewModel_.q != null : !list.equals(myBoostersViewModel_.q)) {
            return false;
        }
        if ((this.r == null) != (myBoostersViewModel_.r == null)) {
            return false;
        }
        return (this.s == null) == (myBoostersViewModel_.s == null);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) {
        MyBoostersView myBoostersView = (MyBoostersView) obj;
        if (!(epoxyModel instanceof MyBoostersViewModel_)) {
            h(myBoostersView);
            return;
        }
        MyBoostersViewModel_ myBoostersViewModel_ = (MyBoostersViewModel_) epoxyModel;
        ProductCardConfig productCardConfig = this.o;
        if (productCardConfig == null ? myBoostersViewModel_.o != null : !productCardConfig.equals(myBoostersViewModel_.o)) {
            myBoostersView.setProductCardConfig(this.o);
        }
        HorizontalListActionClickListener horizontalListActionClickListener = this.r;
        if ((horizontalListActionClickListener == null) != (myBoostersViewModel_.r == null)) {
            myBoostersView.setHorizontalListActionClickListener(horizontalListActionClickListener);
        }
        BoosterHorizontalListData boosterHorizontalListData = this.n;
        if (boosterHorizontalListData == null ? myBoostersViewModel_.n != null : !boosterHorizontalListData.equals(myBoostersViewModel_.n)) {
            myBoostersView.setData(this.n);
        }
        HorizontalListActionState horizontalListActionState = this.p;
        if (horizontalListActionState == null ? myBoostersViewModel_.p != null : !horizontalListActionState.equals(myBoostersViewModel_.p)) {
            myBoostersView.setHorizontalListActionState(this.p);
        }
        ProductClickListener productClickListener = this.s;
        if ((productClickListener == null) != (myBoostersViewModel_.s == null)) {
            myBoostersView.setProductCardClickListener(productClickListener);
        }
        List list = this.q;
        List list2 = myBoostersViewModel_.q;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        myBoostersView.setWatchlistedProductIds(this.q);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int hashCode() {
        int iHashCode = super.hashCode() * 28629151;
        BoosterHorizontalListData boosterHorizontalListData = this.n;
        int iHashCode2 = (iHashCode + (boosterHorizontalListData != null ? boosterHorizontalListData.hashCode() : 0)) * 31;
        ProductCardConfig productCardConfig = this.o;
        int iHashCode3 = (iHashCode2 + (productCardConfig != null ? productCardConfig.hashCode() : 0)) * 31;
        HorizontalListActionState horizontalListActionState = this.p;
        int iHashCode4 = (iHashCode3 + (horizontalListActionState != null ? horizontalListActionState.hashCode() : 0)) * 31;
        List list = this.q;
        return ((((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31) + (this.r != null ? 1 : 0)) * 31) + (this.s != null ? 1 : 0);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final View j(ViewGroup viewGroup) {
        MyBoostersView myBoostersView = new MyBoostersView(viewGroup.getContext());
        myBoostersView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return myBoostersView;
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
        return "MyBoostersViewModel_{data_BoosterHorizontalListData=" + this.n + ", productCardConfig_ProductCardConfig=" + this.o + ", horizontalListActionState_HorizontalListActionState=" + this.p + ", watchlistedProductIds_List=" + this.q + ", horizontalListActionClickListener_HorizontalListActionClickListener=" + this.r + ", productCardClickListener_ProductClickListener=" + this.s + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void w(float f, float f2, int i, int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final /* bridge */ /* synthetic */ void x(int i, Object obj) {
    }
}
