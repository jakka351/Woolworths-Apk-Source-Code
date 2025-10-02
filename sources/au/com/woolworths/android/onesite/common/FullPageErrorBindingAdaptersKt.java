package au.com.woolworths.android.onesite.common;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import au.com.woolworths.android.onesite.utils.Extensions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FullPageErrorBindingAdaptersKt {
    public static final void a(ImageView imageView, FullPageErrorCause fullPageErrorCause) {
        Intrinsics.h(imageView, "imageView");
        if (fullPageErrorCause == null) {
            return;
        }
        Context context = imageView.getContext();
        int drawableRes = fullPageErrorCause.getDrawableRes();
        if (drawableRes != 0) {
            imageView.setImageDrawable(VectorDrawableCompat.a(drawableRes, context.getTheme(), context.getResources()));
        } else {
            imageView.setImageDrawable(null);
        }
        if (fullPageErrorCause.getShouldUsePrimaryForImageTint()) {
            Intrinsics.e(context);
            imageView.setColorFilter(Extensions.a(R.attr.colorPrimary, context), PorterDuff.Mode.SRC_IN);
        } else if (fullPageErrorCause.getImageTintRes() != 0) {
            imageView.setColorFilter(context.getColor(fullPageErrorCause.getImageTintRes()), PorterDuff.Mode.SRC_IN);
        } else {
            imageView.clearColorFilter();
        }
    }
}
