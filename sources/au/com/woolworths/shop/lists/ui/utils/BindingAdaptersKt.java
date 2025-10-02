package au.com.woolworths.shop.lists.ui.utils;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BindingAdaptersKt {
    public static final void a(TextView textView, boolean z) {
        Intrinsics.h(textView, "textView");
        if (z) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        } else {
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        }
    }

    public static final void b(View view, boolean z) {
        Intrinsics.h(view, "view");
        if (z) {
            view.setAlpha(0.6f);
        } else {
            view.setAlpha(1.0f);
        }
    }
}
