package au.com.woolworths.feature.shop.catalogue.databinding;

import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.core.impl.b;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.extensions.FloatExtKt;
import au.com.woolworths.base.shopapp.bindings.TextViewBindingsKt;
import au.com.woolworths.feature.shop.catalogue.generated.callback.Function0;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueHeroProductImageLoadListener;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.HeroProductItemState;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.HeroProductTile;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.ProductAisleInfo;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.ProductBasicInfo;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.ProductOfferInfo;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.ProductPriceInfo;
import au.com.woolworths.feature.shop.catalogue.productlist.heroproduct.ProductUnitPriceInfo;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoView;
import au.com.woolworths.product.composeui.wrapper.ProductLocationInfoViewKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductPriceView;
import com.woolworths.R;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public class ItemCatalogueHeroProductDetailsBindingImpl extends ItemCatalogueHeroProductDetailsBinding implements Function0.Listener {
    public static final SparseIntArray R;
    public final Function0 P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(R.id.progress_bar, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemCatalogueHeroProductDetailsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, null, R);
        super(dataBindingComponent, view, (FrameLayout) objArrT[2], (ProductLocationInfoView) objArrT[3], (ComposeView) objArrT[11], (TextView) objArrT[10], (ImageView) objArrT[1], (TextView) objArrT[12], (TextView) objArrT[4], (TextView) objArrT[9], (TextView) objArrT[5], (ProductPriceView) objArrT[6], (TextView) objArrT[8], (TextView) objArrT[7], (ProgressBar) objArrT[13]);
        this.Q = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        E(view);
        this.P = new Function0(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (105 == i) {
            L((CatalogueHeroProductImageLoadListener) obj);
            return true;
        }
        if (148 == i) {
            M((HeroProductItemState) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        N((CatalogueProductListViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHeroProductDetailsBinding
    public final void L(CatalogueHeroProductImageLoadListener catalogueHeroProductImageLoadListener) throws Throwable {
        this.N = catalogueHeroProductImageLoadListener;
        synchronized (this) {
            this.Q |= 1;
        }
        h(105);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHeroProductDetailsBinding
    public final void M(HeroProductItemState heroProductItemState) throws Throwable {
        this.L = heroProductItemState;
        synchronized (this) {
            this.Q |= 2;
        }
        h(148);
        y();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.databinding.ItemCatalogueHeroProductDetailsBinding
    public final void N(CatalogueProductListViewModel catalogueProductListViewModel) throws Throwable {
        this.M = catalogueProductListViewModel;
        synchronized (this) {
            this.Q |= 4;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        long j3;
        long j4;
        CatalogueHeroProductImageLoadListener catalogueHeroProductImageLoadListener;
        int i;
        boolean z;
        String string;
        SpannableString spannableString;
        ProductCard productCard;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        String str3;
        String str4;
        boolean z5;
        String str5;
        boolean z6;
        boolean z7;
        String str6;
        String str7;
        String str8;
        String str9;
        ProductCard productCard2;
        String str10;
        ProductCard productCard3;
        String str11;
        String str12;
        String str13;
        String strA;
        String str14;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str15;
        boolean z13;
        ProductAisleInfo productAisleInfo;
        ProductOfferInfo productOfferInfo;
        ProductUnitPriceInfo productUnitPriceInfo;
        ProductPriceInfo productPriceInfo;
        Boolean bool;
        SpannableString spannableString2;
        Boolean bool2;
        SpannableString spannableString3;
        boolean z14;
        String str16;
        String str17;
        String str18;
        String str19;
        String strO;
        Boolean bool3;
        SpannableString spannableStringValueOf;
        boolean z15;
        synchronized (this) {
            j = this.Q;
            this.Q = 0L;
        }
        CatalogueHeroProductImageLoadListener catalogueHeroProductImageLoadListener2 = this.N;
        HeroProductItemState heroProductItemState = this.L;
        int i2 = ((11 & j) > 0L ? 1 : ((11 & j) == 0L ? 0 : -1));
        if (i2 != 0) {
            long j5 = j & 10;
            if (j5 != 0) {
                if (heroProductItemState != null) {
                    z6 = heroProductItemState.d;
                    z15 = heroProductItemState.b;
                    j3 = 0;
                    productCard2 = heroProductItemState.c;
                    str10 = heroProductItemState.e;
                } else {
                    j3 = 0;
                    productCard2 = null;
                    str10 = null;
                    z6 = false;
                    z15 = false;
                }
                z7 = !z15;
            } else {
                j3 = 0;
                productCard2 = null;
                str10 = null;
                z6 = false;
                z7 = false;
            }
            HeroProductTile heroProductTile = heroProductItemState != null ? heroProductItemState.f6936a : null;
            if (j5 != 0) {
                if (heroProductTile != null) {
                    j4 = 10;
                    productAisleInfo = heroProductTile.e;
                    productOfferInfo = heroProductTile.d;
                    z9 = heroProductTile.g;
                    productUnitPriceInfo = heroProductTile.c;
                    productPriceInfo = heroProductTile.b;
                    j2 = j;
                    z13 = heroProductTile.h;
                } else {
                    j2 = j;
                    j4 = 10;
                    z13 = false;
                    productAisleInfo = null;
                    productOfferInfo = null;
                    productUnitPriceInfo = null;
                    z9 = false;
                    productPriceInfo = null;
                }
                boolean z16 = productAisleInfo != null;
                if (productOfferInfo != null) {
                    String str20 = productOfferInfo.c;
                    z10 = z13;
                    z11 = z16;
                    String str21 = productOfferInfo.b;
                    String str22 = productOfferInfo.f6941a;
                    if (str22 == null || str22.length() == 0 || str21 == null || str21.length() == 0) {
                        productCard3 = productCard2;
                        strO = null;
                    } else {
                        productCard3 = productCard2;
                        strO = b.o(str22, " ", FloatExtKt.a(Float.parseFloat(str21)));
                        if (str20 != null && !StringsKt.D(str20)) {
                            strO = b.o(strO, " ", str20);
                        }
                    }
                    Boolean bool4 = productOfferInfo.d;
                    String str23 = productOfferInfo.c;
                    String str24 = productOfferInfo.b;
                    String strO2 = productOfferInfo.f6941a;
                    if (strO2 == null || strO2.length() == 0) {
                        bool3 = bool4;
                        str15 = strO;
                        str11 = str10;
                        spannableStringValueOf = null;
                    } else {
                        bool3 = bool4;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (str24 == null || str24.length() == 0) {
                            str15 = strO;
                        } else {
                            str15 = strO;
                            strO2 = b.o(strO2, " ", FloatExtKt.a(Float.parseFloat(str24)));
                        }
                        StyleSpan styleSpan = new StyleSpan(1);
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) strO2);
                        str11 = str10;
                        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                        if (str23 != null && !StringsKt.D(str23)) {
                            spannableStringBuilder.append((CharSequence) "  ".concat(str23));
                        }
                        spannableStringValueOf = SpannableString.valueOf(spannableStringBuilder);
                    }
                    spannableString2 = spannableStringValueOf;
                    bool = bool3;
                } else {
                    z10 = z13;
                    z11 = z16;
                    productCard3 = productCard2;
                    str11 = str10;
                    bool = null;
                    spannableString2 = null;
                    str15 = null;
                }
                str12 = productUnitPriceInfo != null ? productUnitPriceInfo.f6943a : null;
                if (productPriceInfo != null) {
                    str13 = productPriceInfo.c;
                    strA = productPriceInfo.a();
                    str14 = productPriceInfo.f6942a;
                    String str25 = productPriceInfo.b;
                    bool2 = bool;
                    if (str25 != null) {
                        spannableString3 = spannableString2;
                        str17 = (String) CollectionsKt.D(StringsKt.T(str25, new String[]{"."}, 6));
                    } else {
                        spannableString3 = spannableString2;
                        str17 = null;
                    }
                    String str26 = productPriceInfo.b;
                    if (str26 != null) {
                        str18 = str17;
                        str19 = (String) CollectionsKt.D(StringsKt.T(str26, new String[]{"."}, 6));
                    } else {
                        str18 = str17;
                        str19 = null;
                    }
                    z14 = (str19 == null || productPriceInfo.a() == null) ? false : true;
                    str16 = str18;
                } else {
                    bool2 = bool;
                    spannableString3 = spannableString2;
                    z14 = false;
                    str16 = null;
                    str13 = null;
                    strA = null;
                    str14 = null;
                }
                boolean zB = ViewDataBinding.B(bool2);
                z12 = z14;
                str9 = str16;
                string = this.I.getResources().getString(R.string.catalogue_product_list_unit_price, str12);
                z8 = !zB;
                spannableString = spannableString3;
            } else {
                j2 = j;
                productCard3 = productCard2;
                str11 = str10;
                j4 = 10;
                string = null;
                spannableString = null;
                str12 = null;
                str13 = null;
                strA = null;
                str14 = null;
                z8 = false;
                z9 = false;
                z10 = false;
                z11 = false;
                z12 = false;
                str15 = null;
                str9 = null;
            }
            ProductBasicInfo productBasicInfo = heroProductTile != null ? heroProductTile.f6937a : null;
            String str27 = (j5 == 0 || productBasicInfo == null) ? null : productBasicInfo.b;
            if (productBasicInfo != null) {
                boolean z17 = z10;
                catalogueHeroProductImageLoadListener = catalogueHeroProductImageLoadListener2;
                z = z17;
                String str28 = str13;
                str = str12;
                productCard = productCard3;
                str8 = str28;
                boolean z18 = z9;
                str4 = str14;
                z4 = z18;
                i = i2;
                str5 = str27;
                z2 = z11;
                str6 = productBasicInfo.f6940a;
                z5 = z8;
                str2 = str15;
            } else {
                boolean z19 = z10;
                catalogueHeroProductImageLoadListener = catalogueHeroProductImageLoadListener2;
                z = z19;
                String str29 = str13;
                str = str12;
                productCard = productCard3;
                str8 = str29;
                boolean z20 = z9;
                str4 = str14;
                z4 = z20;
                i = i2;
                str5 = str27;
                z2 = z11;
                str2 = str15;
                str6 = null;
                z5 = z8;
            }
            str3 = strA;
            z3 = z12;
            str7 = str11;
        } else {
            j2 = j;
            j3 = 0;
            j4 = 10;
            catalogueHeroProductImageLoadListener = catalogueHeroProductImageLoadListener2;
            i = i2;
            z = false;
            string = null;
            spannableString = null;
            productCard = null;
            str = null;
            str2 = null;
            z2 = false;
            z3 = false;
            z4 = false;
            str3 = null;
            str4 = null;
            z5 = false;
            str5 = null;
            z6 = false;
            z7 = false;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
        }
        if ((j2 & j4) != j3) {
            String str30 = str;
            BindingAdaptersKt.o(this.y, z2);
            ProductLocationInfoViewKt.c(this.z, productCard);
            ProductLocationInfoViewKt.b(this.z, z6);
            BindingAdaptersKt.o(this.A, z);
            TextViewBindingAdapter.b(this.B, spannableString);
            BindingAdaptersKt.o(this.B, z4);
            BindingAdaptersKt.o(this.D, z7);
            TextView textView = this.E;
            Intrinsics.h(textView, "textView");
            if (str5 != null) {
                textView.setText(Html.fromHtml(str5, 0));
                textView.setClickable(false);
                textView.setLongClickable(false);
                textView.setFocusable(false);
            }
            BindingAdaptersKt.n(this.E, str5);
            TextViewBindingAdapter.b(this.F, str2);
            BindingAdaptersKt.o(this.F, z5);
            TextViewBindingsKt.a(this.G, str4);
            BindingAdaptersKt.o(this.H, z3);
            ProductPriceView view = this.H;
            Intrinsics.h(view, "view");
            if (str9 == null) {
                str9 = "";
            }
            view.d(str9, str3, null);
            TextView textView2 = this.I;
            Intrinsics.h(textView2, "textView");
            if (string != null) {
                textView2.setText(Html.fromHtml(string, 0));
                textView2.setClickable(false);
                textView2.setLongClickable(false);
                textView2.setFocusable(false);
            }
            BindingAdaptersKt.n(this.I, str30);
            TextViewBindingsKt.a(this.J, str8);
            if (ViewDataBinding.s >= 4) {
                this.H.setContentDescription(str7);
            }
        }
        if ((j2 & 8) != j3) {
            ProductLocationInfoViewKt.a(this.z, this.P);
        }
        if (i != 0) {
            BindingAdaptersKt.e(this.C, str6, catalogueHeroProductImageLoadListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.Q = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
