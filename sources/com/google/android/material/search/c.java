package com.google.android.material.search;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ViewUtils;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements ViewUtils.OnApplyWindowInsetsListener, OnApplyWindowInsetsListener, AccessibilityManagerCompat.TouchExplorationStateChangeListener {
    public final /* synthetic */ ViewGroup d;

    public /* synthetic */ c(ViewGroup viewGroup) {
        this.d = viewGroup;
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        MaterialToolbar materialToolbar = ((SearchView) this.d).j;
        boolean zH = ViewUtils.h(materialToolbar);
        materialToolbar.setPadding(windowInsetsCompat.i() + (zH ? relativePadding.c : relativePadding.f14609a), relativePadding.b, windowInsetsCompat.j() + (zH ? relativePadding.f14609a : relativePadding.c), relativePadding.d);
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        SearchView.g((SearchView) this.d, windowInsetsCompat);
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        SearchBar searchBar = (SearchBar) this.d;
        int i = SearchBar.p0;
        searchBar.setFocusableInTouchMode(z);
    }
}
