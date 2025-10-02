package com.google.android.material.carousel;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* loaded from: classes6.dex */
public class CarouselSnapHelper extends SnapHelper {
    public com.airbnb.epoxy.Carousel d;

    public static int[] i(RecyclerView.LayoutManager layoutManager, View view, boolean z) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
        int iB1 = carouselLayoutManager.b1(RecyclerView.LayoutManager.O(view), z);
        return carouselLayoutManager.f1() ? new int[]{iB1, 0} : layoutManager.h() ? new int[]{0, iB1} : new int[]{0, 0};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final void b(RecyclerView recyclerView) {
        super.b(recyclerView);
        this.d = (com.airbnb.epoxy.Carousel) recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] c(RecyclerView.LayoutManager layoutManager, View view) {
        return i(layoutManager, view, false);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final RecyclerView.SmoothScroller e(final RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.d.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public final void e(View view, RecyclerView.SmoothScroller.Action action) {
                    int[] iArrI = CarouselSnapHelper.i(CarouselSnapHelper.this.d.getLayoutManager(), view, true);
                    int i = iArrI[0];
                    int i2 = iArrI[1];
                    int iK = k(Math.max(Math.abs(i), Math.abs(i2)));
                    if (iK > 0) {
                        action.b(i, i2, iK, this.j);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public final float j(DisplayMetrics displayMetrics) {
                    float f;
                    float f2;
                    if (layoutManager.h()) {
                        f = displayMetrics.densityDpi;
                        f2 = 50.0f;
                    } else {
                        f = displayMetrics.densityDpi;
                        f2 = 100.0f;
                    }
                    return f2 / f;
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final View f(RecyclerView.LayoutManager layoutManager) {
        int iZ = layoutManager.z();
        View view = null;
        if (iZ != 0 && (layoutManager instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < iZ; i2++) {
                View viewY = layoutManager.y(i2);
                int iAbs = Math.abs(carouselLayoutManager.b1(RecyclerView.LayoutManager.O(viewY), false));
                if (iAbs < i) {
                    view = viewY;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        return -1;
    }
}
