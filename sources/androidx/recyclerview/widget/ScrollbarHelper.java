package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
class ScrollbarHelper {
    public static int a(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.z() == 0 || state.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(RecyclerView.LayoutManager.O(view) - RecyclerView.LayoutManager.O(view2)) + 1;
        }
        return Math.min(orientationHelper.n(), orientationHelper.d(view2) - orientationHelper.g(view));
    }

    public static int b(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        if (layoutManager.z() == 0 || state.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (state.b() - Math.max(RecyclerView.LayoutManager.O(view), RecyclerView.LayoutManager.O(view2))) - 1) : Math.max(0, Math.min(RecyclerView.LayoutManager.O(view), RecyclerView.LayoutManager.O(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(orientationHelper.d(view2) - orientationHelper.g(view)) / (Math.abs(RecyclerView.LayoutManager.O(view) - RecyclerView.LayoutManager.O(view2)) + 1))) + (orientationHelper.m() - orientationHelper.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.State state, OrientationHelper orientationHelper, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.z() == 0 || state.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return state.b();
        }
        return (int) (((orientationHelper.d(view2) - orientationHelper.g(view)) / (Math.abs(RecyclerView.LayoutManager.O(view) - RecyclerView.LayoutManager.O(view2)) + 1)) * state.b());
    }
}
