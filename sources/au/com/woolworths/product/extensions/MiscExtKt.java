package au.com.woolworths.product.extensions;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MiscExtKt {
    public static final void a(FrameLayout frameLayout) {
        Intrinsics.h(frameLayout, "<this>");
        frameLayout.setVisibility(0);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(frameLayout, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(frameLayout.getContext().getColor(R.color.transparent)), Integer.valueOf(frameLayout.getContext().getColor(com.woolworths.R.color.color_scrim_shadow)));
        objectAnimatorOfObject.setDuration(200L);
        objectAnimatorOfObject.start();
    }
}
