package au.com.woolworths.product.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import au.com.woolworths.android.onesite.common.RoundedBackgroundSpan;
import au.com.woolworths.android.onesite.utils.Locales;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BindingAdaptersKt {
    public static final void a(TextView textView, ProductCard productCard) {
        ProductTrolleyData trolley;
        Intrinsics.h(textView, "textView");
        textView.setText((productCard == null || (trolley = productCard.getTrolley()) == null) ? null : trolley.getButtonLabel());
    }

    public static final void b(TextView textView, ProductCard productCard) {
        ProductTrolleyData trolley;
        Intrinsics.h(textView, "textView");
        if (productCard == null || (trolley = productCard.getTrolley()) == null) {
            return;
        }
        c(textView, trolley.getButtonLabel(), trolley.getButtonQuantity());
    }

    public static final void c(TextView textView, String str, String str2) {
        String upperCase;
        Intrinsics.h(textView, "textView");
        String upperCase2 = "";
        if (str != null) {
            upperCase = str.toUpperCase(Locales.a());
            Intrinsics.g(upperCase, "toUpperCase(...)");
        } else {
            upperCase = "";
        }
        if (str2 != null) {
            upperCase2 = str2.toUpperCase(Locales.a());
            Intrinsics.g(upperCase2, "toUpperCase(...)");
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) upperCase).append((CharSequence) "  ");
        Intrinsics.g(spannableStringBuilderAppend, "append(...)");
        Context context = textView.getContext();
        Intrinsics.g(context, "getContext(...)");
        RoundedBackgroundSpan roundedBackgroundSpan = new RoundedBackgroundSpan(context, R.style.ProductTrolleyInfoSpan, null);
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) upperCase2);
        spannableStringBuilderAppend.setSpan(roundedBackgroundSpan, length, spannableStringBuilderAppend.length(), 17);
        textView.setText(spannableStringBuilderAppend);
    }
}
