package com.airbnb.epoxy;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class ListenersUtils {
    public static RecyclerView a(View view) {
        if (view == null) {
            return null;
        }
        Object parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return (RecyclerView) parent;
        }
        if (parent instanceof View) {
            return a((View) parent);
        }
        return null;
    }
}
