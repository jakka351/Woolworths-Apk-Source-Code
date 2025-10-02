package au.com.woolworths.shop.buyagain.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.offers.ProductsBoostView;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.shop.buyagain.generated.callback.Function0;
import au.com.woolworths.shop.buyagain.generated.callback.OnCheckedChangeListener;
import au.com.woolworths.shop.buyagain.generated.callback.OnClickListener;
import au.com.woolworths.shop.buyagain.ui.legacy.BuyAgainProductItemListenerLegacy;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class EpoxyItemBuyAgainProductBindingImpl extends EpoxyItemBuyAgainProductBinding implements OnClickListener.Listener, Function0.Listener, OnCheckedChangeListener.Listener {
    public static final ViewDataBinding.IncludedLayouts W;
    public static final SparseIntArray X;
    public final OnClickListener S;
    public final Function0 T;
    public final OnCheckedChangeListener U;
    public long V;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(19);
        W = includedLayouts;
        includedLayouts.a(0, new int[]{14, 15}, new int[]{R.layout.include_brand_label, R.layout.include_product_multibuy_label}, new String[]{"include_brand_label", "include_product_multibuy_label"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(R.id.product_current_price_views, 16);
        sparseIntArray.put(R.id.multibuy_and_was_price_barrier, 17);
        sparseIntArray.put(R.id.was_price_and_multibuy_barrier, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemBuyAgainProductBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 19, W, X);
        FrameLayout frameLayout = (FrameLayout) objArrT[4];
        ProductLocationInfoView productLocationInfoView = (ProductLocationInfoView) objArrT[5];
        ImageView imageView = (ImageView) objArrT[3];
        CheckBox checkBox = (CheckBox) objArrT[1];
        ImageView imageView2 = (ImageView) objArrT[2];
        IncludeBrandLabelBinding includeBrandLabelBinding = (IncludeBrandLabelBinding) objArrT[14];
        ComposeView composeView = (ComposeView) objArrT[10];
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding = (IncludeProductMultibuyLabelBinding) objArrT[15];
        TextView textView = (TextView) objArrT[6];
        ProductPriceView productPriceView = (ProductPriceView) objArrT[7];
        TextView textView2 = (TextView) objArrT[8];
        TextView textView3 = (TextView) objArrT[9];
        TextView textView4 = (TextView) objArrT[12];
        Button button = (Button) objArrT[13];
        ProductsBoostView productsBoostView = (ProductsBoostView) objArrT[11];
        super(dataBindingComponent, view, frameLayout, productLocationInfoView, imageView, checkBox, imageView2, includeBrandLabelBinding, composeView, includeProductMultibuyLabelBinding, textView, productPriceView, textView2, textView3, textView4, button, productsBoostView);
        this.V = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.C.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding2 = this.D;
        if (includeBrandLabelBinding2 != null) {
            includeBrandLabelBinding2.n = this;
        }
        this.E.setTag(null);
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding2 = this.F;
        if (includeProductMultibuyLabelBinding2 != null) {
            includeProductMultibuyLabelBinding2.n = this;
        }
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        E(view);
        this.S = new OnClickListener(this, 3);
        this.T = new Function0(this);
        this.U = new OnCheckedChangeListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.O = (BuyAgainProductItemListenerLegacy) obj;
            synchronized (this) {
                this.V |= 4;
            }
            h(157);
            y();
            return true;
        }
        if (53 == i) {
            this.N = (ProductCard) obj;
            synchronized (this) {
                this.V |= 8;
            }
            h(53);
            y();
            return true;
        }
        if (210 == i) {
            this.P = (Float) obj;
            synchronized (this) {
                this.V |= 16;
            }
            h(210);
            y();
            return true;
        }
        if (109 == i) {
            this.Q = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.V |= 32;
            }
            h(109);
            y();
            return true;
        }
        if (132 != i) {
            return false;
        }
        this.R = ((Boolean) obj).booleanValue();
        synchronized (this) {
            this.V |= 64;
        }
        h(132);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.buyagain.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        BuyAgainProductItemListenerLegacy buyAgainProductItemListenerLegacy = this.O;
        ProductCard productCard = this.N;
        if (buyAgainProductItemListenerLegacy != null) {
            buyAgainProductItemListenerLegacy.U4(productCard);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.buyagain.databinding.EpoxyItemBuyAgainProductBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.V != 0) {
                    return true;
                }
                return this.D.p() || this.F.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.V = 128L;
        }
        this.D.r();
        this.F.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.V |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 2;
        }
        return true;
    }
}
