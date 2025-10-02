package com.woolworths.scanlibrary.ui.home.itemview.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import au.com.woolworths.android.onesite.deeplink.h;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.home.itemview.ItemContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/views/ItemView;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ItemView {
    boolean a();

    View b(LayoutInflater layoutInflater, ViewGroup viewGroup);

    default void c(Item cartItem) {
        Intrinsics.h(cartItem, "cartItem");
        if (!a()) {
            String string = getContext().getString(R.string.sng_label_non_remove_message);
            Intrinsics.g(string, "getString(...)");
            String string2 = getContext().getString(R.string.sng_label_ok);
            Intrinsics.g(string2, "getString(...)");
            int i = 20;
            f("", string, string2, new h(i), "", new h(i), new h(20));
            return;
        }
        String string3 = getContext().getString(R.string.sng_label_remove_item);
        Intrinsics.g(string3, "getString(...)");
        String string4 = getContext().getString(R.string.sng_label_remove_confirmation);
        Intrinsics.g(string4, "getString(...)");
        String string5 = getContext().getString(R.string.sng_label_remove);
        Intrinsics.g(string5, "getString(...)");
        coil3.gif.a aVar = new coil3.gif.a(3, this, cartItem);
        String string6 = getContext().getString(R.string.sng_label_cancel);
        Intrinsics.g(string6, "getString(...)");
        int i2 = 20;
        f(string3, string4, string5, aVar, string6, new h(i2), new h(i2));
    }

    ItemContract.Presenter d();

    void e(AnalyticsProvider analyticsProvider);

    default void f(String str, String str2, String str3, Function0 function0, String str4, Function0 function02, Function0 function03) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), R.style.DefaultAlertDialogStyle);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setCancelable(false);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        builder.setPositiveButton(str3, new a(booleanRef, function0, 0));
        if (str4.length() > 0) {
            builder.setNegativeButton(str4, new a(booleanRef, function02, 1));
        }
        builder.setOnDismissListener(new b(booleanRef, function03, 0));
        builder.show();
    }

    void g(ItemContract.Presenter presenter);

    Context getContext();

    void h(boolean z);

    void i();
}
