package au.com.woolworths.feature.shop.catalogue.browse.page.category;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import au.com.woolworths.android.onesite.models.products.PromotionInfo;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabelType;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductUnavailableLabel;
import au.com.woolworths.product.ui.ProductListPromotionLabel;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"catalogue_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ExentsionsKt {
    public static final void a(TextView textView, ProductCard productCard) throws Resources.NotFoundException {
        BrandLabel brandLabelK = ProductCardExtKt.k(productCard, false);
        if (brandLabelK != ProductListPromotionLabel.k) {
            PromotionInfo promotionInfo = productCard.getPromotionInfo();
            d(textView, promotionInfo != null ? promotionInfo.getLabel() : null, brandLabelK.getType().getD(), brandLabelK.getType().getBackgroundColour(), Integer.valueOf(brandLabelK.getType().getBorderColour()));
        } else if (productCard.getMultiBuyPrice() != null) {
            d(textView, productCard.getMultiBuyPrice(), R.color.color_black_900, R.color.color_tint_specials, null);
        }
    }

    public static final void b(TextView textView) throws Resources.NotFoundException {
        BrandLabelType e = ProductUnavailableLabel.DEFAULT.getType();
        TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(new int[]{e.getTextColourAttr()});
        Intrinsics.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.color.color_black_900);
        typedArrayObtainStyledAttributes.recycle();
        d(textView, textView.getContext().getString(R.string.unavailable), resourceId, e.getBackgroundColour(), Integer.valueOf(e.getBorderColour()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String c(au.com.woolworths.product.models.ProductCard r4, android.content.Context r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r4, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.h(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ", "
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r2 = r4.isAvailable()
            if (r2 == 0) goto La2
            boolean r2 = r4.isNew()
            if (r2 == 0) goto L40
            r2 = 2132017421(0x7f14010d, float:1.967312E38)
            java.lang.String r2 = r5.getString(r2)
            r0.append(r2)
            r0.append(r1)
        L40:
            java.lang.Integer r2 = r4.getPrice()
            if (r2 == 0) goto L63
            int r2 = r2.intValue()
            java.lang.String r3 = au.com.woolworths.android.onesite.extensions.IntExtKt.b(r2)
            java.lang.String r2 = au.com.woolworths.android.onesite.extensions.IntExtKt.a(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            r3 = 2132017422(0x7f14010e, float:1.9673122E38)
            java.lang.String r5 = r5.getString(r3, r2)
            r0.append(r5)
            r0.append(r1)
        L63:
            au.com.woolworths.product.models.MemberPriceInfo r5 = r4.getMemberPriceInfo()
            if (r5 == 0) goto L89
            java.lang.String r1 = r5.getHeader()
            java.lang.String r5 = r5.getTitle()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
        L85:
            r0.append(r5)
            goto L94
        L89:
            java.lang.String r5 = r4.getWasPrice()
            if (r5 == 0) goto L94
            java.lang.String r5 = r5.concat(r1)
            goto L85
        L94:
            au.com.woolworths.android.onesite.models.products.PromotionInfo r4 = r4.getPromotionInfo()
            if (r4 == 0) goto Lac
            java.lang.String r4 = r4.getLabel()
            r0.append(r4)
            goto Lac
        La2:
            r4 = 2132017423(0x7f14010f, float:1.9673124E38)
            java.lang.String r4 = r5.getString(r4)
            r0.append(r4)
        Lac:
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.browse.page.category.ExentsionsKt.c(au.com.woolworths.product.models.ProductCard, android.content.Context):java.lang.String");
    }

    public static final void d(TextView textView, String str, int i, int i2, Integer num) throws Resources.NotFoundException {
        textView.setText(str);
        textView.setTextColor(textView.getContext().getColor(i));
        Drawable drawable = textView.getContext().getDrawable(R.drawable.shape_rounded_corners);
        Intrinsics.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.mutate();
        gradientDrawable.setColor(ContextCompat.c(i2, textView.getContext()));
        if (num != null) {
            gradientDrawable.setStroke(textView.getContext().getResources().getDimensionPixelSize(R.dimen.brand_label_border_width), ContextCompat.c(num.intValue(), textView.getContext()));
        }
        textView.setBackground(gradientDrawable);
    }
}
