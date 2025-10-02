package au.com.woolworths.product.composeui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/product/composeui/ProductMemberPriceLabelStyling;", "Lau/com/woolworths/product/composeui/ProductMemberPriceLabelStyle;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductMemberPriceLabelStyling implements ProductMemberPriceLabelStyle {
    public static final ProductMemberPriceLabelStyling d;
    public static final ProductMemberPriceLabelStyling e;
    public static final ProductMemberPriceLabelStyling f;
    public static final ProductMemberPriceLabelStyling g;
    public static final /* synthetic */ ProductMemberPriceLabelStyling[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        ProductMemberPriceLabelStyling productMemberPriceLabelStyling = new ProductMemberPriceLabelStyling() { // from class: au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling.LIST
            public final BiasAlignment.Horizontal j = Alignment.Companion.m;
            public final int k = Integer.MAX_VALUE;
            public final Arrangement$Start$1 l = Arrangement.f934a;

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            /* renamed from: a, reason: from getter */
            public final int getK() {
                return this.k;
            }

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            /* renamed from: b, reason: from getter */
            public final BiasAlignment.Horizontal getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            public final Arrangement.Horizontal l() {
                return this.l;
            }
        };
        d = productMemberPriceLabelStyling;
        ProductMemberPriceLabelStyling productMemberPriceLabelStyling2 = new ProductMemberPriceLabelStyling() { // from class: au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling.GRID
            public final BiasAlignment.Horizontal j = Alignment.Companion.n;
            public final int k = 1;
            public final Arrangement$Center$1 l = Arrangement.e;

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            /* renamed from: a, reason: from getter */
            public final int getK() {
                return this.k;
            }

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            /* renamed from: b, reason: from getter */
            public final BiasAlignment.Horizontal getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            public final Arrangement.Horizontal l() {
                return this.l;
            }
        };
        e = productMemberPriceLabelStyling2;
        ProductMemberPriceLabelStyling productMemberPriceLabelStyling3 = new ProductMemberPriceLabelStyling() { // from class: au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling.DETAILS
            public final BiasAlignment.Horizontal j = Alignment.Companion.n;
            public final int k = Integer.MAX_VALUE;
            public final Arrangement$Start$1 l = Arrangement.f934a;

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            /* renamed from: a, reason: from getter */
            public final int getK() {
                return this.k;
            }

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            /* renamed from: b, reason: from getter */
            public final BiasAlignment.Horizontal getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            public final Arrangement.Horizontal l() {
                return this.l;
            }
        };
        f = productMemberPriceLabelStyling3;
        ProductMemberPriceLabelStyling productMemberPriceLabelStyling4 = new ProductMemberPriceLabelStyling() { // from class: au.com.woolworths.product.composeui.ProductMemberPriceLabelStyling.DETAILS_NEW
            public final BiasAlignment.Horizontal j = Alignment.Companion.m;
            public final int k = Integer.MAX_VALUE;
            public final Arrangement$Start$1 l = Arrangement.f934a;

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            /* renamed from: a, reason: from getter */
            public final int getK() {
                return this.k;
            }

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            /* renamed from: b, reason: from getter */
            public final BiasAlignment.Horizontal getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle
            public final Arrangement.Horizontal l() {
                return this.l;
            }
        };
        g = productMemberPriceLabelStyling4;
        ProductMemberPriceLabelStyling[] productMemberPriceLabelStylingArr = {productMemberPriceLabelStyling, productMemberPriceLabelStyling2, productMemberPriceLabelStyling3, productMemberPriceLabelStyling4};
        h = productMemberPriceLabelStylingArr;
        i = EnumEntriesKt.a(productMemberPriceLabelStylingArr);
    }

    public static ProductMemberPriceLabelStyling valueOf(String str) {
        return (ProductMemberPriceLabelStyling) Enum.valueOf(ProductMemberPriceLabelStyling.class, str);
    }

    public static ProductMemberPriceLabelStyling[] values() {
        return (ProductMemberPriceLabelStyling[]) h.clone();
    }
}
