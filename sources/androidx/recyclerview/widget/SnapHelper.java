package androidx.recyclerview.widget;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class SnapHelper extends RecyclerView.OnFlingListener {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f3700a;
    public Scroller b;
    public final RecyclerView.OnScrollListener c = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.SnapHelper.1

        /* renamed from: a, reason: collision with root package name */
        public boolean f3701a = false;

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void a(int i, RecyclerView recyclerView) {
            if (i == 0 && this.f3701a) {
                this.f3701a = false;
                SnapHelper.this.h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void d(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f3701a = true;
        }
    };

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public final boolean a(int i, int i2) {
        RecyclerView.SmoothScroller smoothScrollerE;
        int iG;
        RecyclerView.LayoutManager layoutManager = this.f3700a.getLayoutManager();
        if (layoutManager == null || this.f3700a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3700a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (smoothScrollerE = e(layoutManager)) == null || (iG = g(layoutManager, i, i2)) == -1) {
            return false;
        }
        smoothScrollerE.f3697a = iG;
        layoutManager.P0(smoothScrollerE);
        return true;
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3700a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        RecyclerView.OnScrollListener onScrollListener = this.c;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.n0;
            if (arrayList != null) {
                arrayList.remove(onScrollListener);
            }
            this.f3700a.setOnFlingListener(null);
        }
        this.f3700a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f3700a.k(onScrollListener);
            this.f3700a.setOnFlingListener(this);
            this.b = new Scroller(this.f3700a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    public abstract int[] c(RecyclerView.LayoutManager layoutManager, View view);

    public int[] d(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    public RecyclerView.SmoothScroller e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.f3700a.getContext()) { // from class: androidx.recyclerview.widget.SnapHelper.2
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public final void e(View view, RecyclerView.SmoothScroller.Action action) {
                    SnapHelper snapHelper = SnapHelper.this;
                    RecyclerView recyclerView = snapHelper.f3700a;
                    if (recyclerView == null) {
                        return;
                    }
                    int[] iArrC = snapHelper.c(recyclerView.getLayoutManager(), view);
                    int i = iArrC[0];
                    int i2 = iArrC[1];
                    int iK = k(Math.max(Math.abs(i), Math.abs(i2)));
                    if (iK > 0) {
                        action.b(i, i2, iK, this.j);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public final float j(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }
            };
        }
        return null;
    }

    public abstract View f(RecyclerView.LayoutManager layoutManager);

    public abstract int g(RecyclerView.LayoutManager layoutManager, int i, int i2);

    public final void h() {
        RecyclerView.LayoutManager layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f3700a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        int i = iArrC[0];
        if (i == 0 && iArrC[1] == 0) {
            return;
        }
        this.f3700a.r0(i, iArrC[1], false);
    }
}
