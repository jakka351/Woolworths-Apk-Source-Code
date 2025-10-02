package androidx.viewpager2.widget;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class WindowInsetsApplier implements OnApplyWindowInsetsListener {
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        WindowInsetsCompat windowInsetsCompatU = ViewCompat.u(viewPager2, windowInsetsCompat);
        if (windowInsetsCompatU.p()) {
            return windowInsetsCompatU;
        }
        RecyclerView recyclerView = viewPager2.m;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewCompat.d(recyclerView.getChildAt(i), new WindowInsetsCompat(windowInsetsCompatU));
        }
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.b;
        return windowInsetsCompat2.r() != null ? windowInsetsCompat2 : windowInsetsCompatU.c().b();
    }
}
