package au.com.woolworths.android.onesite.modules.customviews;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import au.com.woolworths.android.onesite.utils.Extensions;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrandLabelKt {
    public static final void a(TextView textView, BrandLabelType brandLabelType) throws Resources.NotFoundException {
        Intrinsics.h(textView, "textView");
        if (brandLabelType == null) {
            return;
        }
        Context context = textView.getContext();
        ColorStateList colorStateListC = ContextCompat.c(brandLabelType.getE(), context);
        ColorStateList colorStateListB = ResourcesCompat.b(brandLabelType.getF(), context.getTheme(), context.getResources());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.brand_label_border_width);
        Drawable drawable = context.getDrawable(R.drawable.shape_rounded_corners);
        Intrinsics.f(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.mutate();
        gradientDrawable.setColor(colorStateListC);
        gradientDrawable.setStroke(dimensionPixelSize, colorStateListB);
        textView.setBackground(gradientDrawable);
    }

    public static final void b(View view, BrandLabel brandLabel) throws Resources.NotFoundException {
        Intrinsics.h(view, "view");
        if (brandLabel == null) {
            return;
        }
        int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(brandLabel.getPaddingVertical());
        int dimensionPixelOffset2 = view.getContext().getResources().getDimensionPixelOffset(brandLabel.getPaddingHorizontal());
        view.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
    }

    public static final void c(TextView textView, BrandLabel brandLabel) {
        ColorStateList colorStateListValueOf;
        Intrinsics.h(textView, "textView");
        if (brandLabel == null) {
            return;
        }
        textView.setTextAppearance(brandLabel.getTextAppearance());
        if (brandLabel.getType().getTextColourAttr() != 0) {
            Context context = textView.getContext();
            Intrinsics.g(context, "getContext(...)");
            colorStateListValueOf = ColorStateList.valueOf(Extensions.a(brandLabel.getType().getTextColourAttr(), context));
        } else if (brandLabel.getType().getD() != 0) {
            colorStateListValueOf = ContextCompat.c(brandLabel.getType().getD(), textView.getContext());
        } else {
            Context context2 = textView.getContext();
            Intrinsics.g(context2, "getContext(...)");
            colorStateListValueOf = ColorStateList.valueOf(Extensions.a(android.R.attr.textColorPrimary, context2));
        }
        textView.setTextColor(colorStateListValueOf);
        textView.setCompoundDrawableTintList(colorStateListValueOf);
    }
}
