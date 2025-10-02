package com.woolworths.scanlibrary.util.extensions;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewExtKt {
    public static final void a(View view) {
        Snackbar snackbarJ = Snackbar.j(null, view.getRootView(), view.getContext().getString(R.string.sng_post_scan_item_added_to_cart), 0);
        snackbarJ.k = 5000;
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = snackbarJ.i;
        Intrinsics.g(snackbarBaseLayout, "getView(...)");
        TextView textView = (TextView) snackbarBaseLayout.findViewById(R.id.snackbar_text);
        Context context = view.getContext();
        Intrinsics.e(context);
        textView.setTextColor(context.getColor(android.R.color.white));
        snackbarJ.l();
    }

    public static final void b(int i, View view) {
        Intrinsics.h(view, "<this>");
        Toast.makeText(view.getContext(), view.getContext().getString(i), 1).show();
    }
}
