package au.com.woolworths.base.shopapp.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import au.com.woolworths.android.onesite.modules.customviews.producttile.DisplayQuantity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/base/shopapp/utils/DisplayQuantityArrayAdapter;", "Landroid/widget/ArrayAdapter;", "Lau/com/woolworths/android/onesite/modules/customviews/producttile/DisplayQuantity;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisplayQuantityArrayAdapter extends ArrayAdapter<DisplayQuantity> {
    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup parent) {
        Intrinsics.h(parent, "parent");
        View dropDownView = super.getDropDownView(i, view, parent);
        Intrinsics.f(dropDownView, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) dropDownView;
        Intrinsics.e(getItem(i));
        textView.setText((CharSequence) null);
        return textView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup parent) {
        Intrinsics.h(parent, "parent");
        View view2 = super.getView(i, view, parent);
        Intrinsics.f(view2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view2;
        Intrinsics.e(getItem(i));
        textView.setText((CharSequence) null);
        return textView;
    }
}
