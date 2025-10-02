package au.com.woolworths.feature.product.list.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeTintableTextBinding;
import au.com.woolworths.feature.product.list.legacy.generated.callback.Function0;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.databinding.IncludeProductMultibuyLabelBinding;
import au.com.woolworths.product.databinding.StockIndicatorBinding;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.product.ui.ProductCardButtonsState;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemProductCardTileListLegacyBindingImpl extends EpoxyItemProductCardTileListLegacyBinding implements OnClickListener.Listener, Function0.Listener {
    public static final ViewDataBinding.IncludedLayouts p0;
    public static final SparseIntArray q0;
    public final ConstraintLayout f0;
    public final OnClickListener g0;
    public final OnClickListener h0;
    public final OnClickListener i0;
    public final OnClickListener j0;
    public final OnClickListener k0;
    public final Function0 l0;
    public final OnClickListener m0;
    public final OnClickListener n0;
    public long o0;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(32);
        p0 = includedLayouts;
        includedLayouts.a(0, new int[]{21, 22, 23, 24, 25, 26}, new int[]{R.layout.include_brand_label, R.layout.include_brand_label, R.layout.include_product_multibuy_label, R.layout.include_tintable_text, R.layout.include_product_list_legacy_marketplace_details, R.layout.stock_indicator}, new String[]{"include_brand_label", "include_brand_label", "include_product_multibuy_label", "include_tintable_text", "include_product_list_legacy_marketplace_details", "stock_indicator"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        q0 = sparseIntArray;
        sparseIntArray.put(R.id.heart_image_view, 27);
        sparseIntArray.put(R.id.multibuy_and_was_price_barrier, 28);
        sparseIntArray.put(R.id.online_list_buttons, 29);
        sparseIntArray.put(R.id.in_store_list_buttons, 30);
        sparseIntArray.put(R.id.lists_button_barrier, 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProductCardTileListLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 32, p0, q0);
        Button button = (Button) objArrT[14];
        FrameLayout frameLayout = (FrameLayout) objArrT[3];
        ProductLocationInfoView productLocationInfoView = (ProductLocationInfoView) objArrT[4];
        Button button2 = (Button) objArrT[19];
        ImageView imageView = (ImageView) objArrT[1];
        Button button3 = (Button) objArrT[18];
        Button button4 = (Button) objArrT[16];
        ComposeView composeView = (ComposeView) objArrT[27];
        StockIndicatorBinding stockIndicatorBinding = (StockIndicatorBinding) objArrT[26];
        Button button5 = (Button) objArrT[20];
        Button button6 = (Button) objArrT[13];
        IncludeTintableTextBinding includeTintableTextBinding = (IncludeTintableTextBinding) objArrT[24];
        super(dataBindingComponent, view, button, frameLayout, productLocationInfoView, button2, imageView, button3, button4, composeView, stockIndicatorBinding, button5, button6, includeTintableTextBinding, (TextView) objArrT[6], (ImageView) objArrT[2], (IncludeBrandLabelBinding) objArrT[21], (IncludeProductListLegacyMarketplaceDetailsBinding) objArrT[25], (ComposeView) objArrT[11], (IncludeProductMultibuyLabelBinding) objArrT[23], (TextView) objArrT[5], (ProductPriceView) objArrT[7], (TextView) objArrT[10], (IncludeBrandLabelBinding) objArrT[22], (TextView) objArrT[8], (TextView) objArrT[12], (TextView) objArrT[9], (Button) objArrT[17], (Button) objArrT[15]);
        this.o0 = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        StockIndicatorBinding stockIndicatorBinding2 = this.G;
        if (stockIndicatorBinding2 != null) {
            stockIndicatorBinding2.n = this;
        }
        this.H.setTag(null);
        this.I.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.f0 = constraintLayout;
        constraintLayout.setTag(null);
        IncludeTintableTextBinding includeTintableTextBinding2 = this.J;
        if (includeTintableTextBinding2 != null) {
            includeTintableTextBinding2.n = this;
        }
        this.K.setTag(null);
        this.L.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding = this.M;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        IncludeProductListLegacyMarketplaceDetailsBinding includeProductListLegacyMarketplaceDetailsBinding = this.N;
        if (includeProductListLegacyMarketplaceDetailsBinding != null) {
            includeProductListLegacyMarketplaceDetailsBinding.n = this;
        }
        this.O.setTag(null);
        IncludeProductMultibuyLabelBinding includeProductMultibuyLabelBinding = this.P;
        if (includeProductMultibuyLabelBinding != null) {
            includeProductMultibuyLabelBinding.n = this;
        }
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding2 = this.T;
        if (includeBrandLabelBinding2 != null) {
            includeBrandLabelBinding2.n = this;
        }
        this.U.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.X.setTag(null);
        this.Y.setTag(null);
        E(view);
        this.g0 = new OnClickListener(this, 6);
        this.h0 = new OnClickListener(this, 5);
        this.i0 = new OnClickListener(this, 4);
        this.j0 = new OnClickListener(this, 8);
        this.k0 = new OnClickListener(this, 3);
        this.l0 = new Function0(this);
        this.m0 = new OnClickListener(this, 1);
        this.n0 = new OnClickListener(this, 7);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            this.Z = (ProductClickListener) obj;
            synchronized (this) {
                this.o0 |= 64;
            }
            h(157);
            y();
            return true;
        }
        if (109 == i) {
            this.d0 = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.o0 |= 128;
            }
            h(109);
            y();
            return true;
        }
        if (132 == i) {
            this.e0 = ((Boolean) obj).booleanValue();
            synchronized (this) {
                this.o0 |= 256;
            }
            h(132);
            y();
            return true;
        }
        if (206 == i) {
            this.b0 = (ProductCardConfig) obj;
            synchronized (this) {
                this.o0 |= 512;
            }
            h(206);
            y();
            return true;
        }
        if (53 == i) {
            this.a0 = (ProductCard) obj;
            synchronized (this) {
                this.o0 |= llqqqql.c00630063c0063c0063;
            }
            h(53);
            y();
            return true;
        }
        if (205 != i) {
            return false;
        }
        this.c0 = (ProductCardButtonsState) obj;
        synchronized (this) {
            this.o0 |= llqqqql.ccc00630063c0063;
        }
        h(205);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        switch (i) {
            case 1:
                ProductClickListener productClickListener = this.Z;
                ProductCard productCard = this.a0;
                if (productClickListener != null) {
                    productClickListener.J1(productCard, "");
                    break;
                }
                break;
            case 3:
                ProductClickListener productClickListener2 = this.Z;
                ProductCard productCard2 = this.a0;
                if (productClickListener2 != null) {
                    productClickListener2.L0(productCard2, "");
                    break;
                }
                break;
            case 4:
                ProductClickListener productClickListener3 = this.Z;
                ProductCard productCard3 = this.a0;
                if (productClickListener3 != null) {
                    productClickListener3.T4(productCard3, "");
                    break;
                }
                break;
            case 5:
                ProductClickListener productClickListener4 = this.Z;
                ProductCard productCard4 = this.a0;
                if (productClickListener4 != null) {
                    productClickListener4.D4(productCard4, "");
                    break;
                }
                break;
            case 6:
                ProductClickListener productClickListener5 = this.Z;
                ProductCard productCard5 = this.a0;
                if (productClickListener5 != null) {
                    productClickListener5.u3(productCard5, "");
                    break;
                }
                break;
            case 7:
                ProductClickListener productClickListener6 = this.Z;
                ProductCard productCard6 = this.a0;
                if (productClickListener6 != null) {
                    productClickListener6.g5(productCard6, "");
                    break;
                }
                break;
            case 8:
                ProductClickListener productClickListener7 = this.Z;
                ProductCard productCard7 = this.a0;
                if (productClickListener7 != null) {
                    productClickListener7.L0(productCard7, "");
                    break;
                }
                break;
        }
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.Function0.Listener
    public final void d() {
        ProductClickListener productClickListener = this.Z;
        ProductCard productCard = this.a0;
        if (productClickListener != null) {
            productClickListener.T0(productCard);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x055f  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 1442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.databinding.EpoxyItemProductCardTileListLegacyBindingImpl.j():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.o0 != 0) {
                    return true;
                }
                return this.M.p() || this.T.p() || this.P.p() || this.J.p() || this.N.p() || this.G.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.o0 = 4096L;
        }
        this.M.r();
        this.T.r();
        this.P.r();
        this.J.r();
        this.N.r();
        this.G.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.o0 |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.o0 |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.o0 |= 4;
            }
            return true;
        }
        if (i == 3) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.o0 |= 8;
            }
            return true;
        }
        if (i == 4) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.o0 |= 16;
            }
            return true;
        }
        if (i != 5) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.o0 |= 32;
        }
        return true;
    }
}
