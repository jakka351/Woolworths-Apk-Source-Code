package com.google.android.material.datepicker;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
class SmoothCalendarLayoutManager extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.SmoothCalendarLayoutManager$1, reason: invalid class name */
    class AnonymousClass1 extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final float j(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void O0(int i, RecyclerView recyclerView) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(recyclerView.getContext());
        anonymousClass1.f3697a = i;
        P0(anonymousClass1);
    }
}
