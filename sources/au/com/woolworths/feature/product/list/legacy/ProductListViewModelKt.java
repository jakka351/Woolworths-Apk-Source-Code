package au.com.woolworths.feature.product.list.legacy;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import au.com.woolworths.android.onesite.extensions.SpannableStringExtKt;
import au.com.woolworths.product.tile.ProductClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListViewModelKt {
    public static final void a(TextView textView, String text, String priceFamilyId, String containerTitle, ProductClickListener productClickListener) {
        Intrinsics.h(textView, "textView");
        Intrinsics.h(text, "text");
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productClickListener, "productClickListener");
        Typeface typefaceCreate = Typeface.create(ResourcesCompat.e(com.woolworths.R.font.roboto_medium, textView.getContext()), 0);
        SpannableString spannableString = new SpannableString(text);
        SpannableStringExtKt.a(spannableString, text, typefaceCreate, new g(1, productClickListener, containerTitle, priceFamilyId));
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
