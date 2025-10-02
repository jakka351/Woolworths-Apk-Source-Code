package com.github.rubensousa.gravitysnaphelper;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes4.dex */
public class GravitySnapHelper extends LinearSnapHelper {
    public final int f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public float l;
    public int m;
    public float n;
    public OrientationHelper o;
    public OrientationHelper p;
    public SnapListener q;
    public RecyclerView r;
    public final RecyclerView.OnScrollListener s;

    public interface SnapListener {
        void H0(int i);
    }

    public GravitySnapHelper(int i, boolean z, HorizontalSelectorView horizontalSelectorView) {
        this.j = false;
        this.k = false;
        this.l = 100.0f;
        this.m = -1;
        this.n = -1.0f;
        this.s = new RecyclerView.OnScrollListener() { // from class: com.github.rubensousa.gravitysnaphelper.GravitySnapHelper.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void a(int i2, RecyclerView recyclerView) {
                SnapListener snapListener;
                View viewM;
                GravitySnapHelper gravitySnapHelper = GravitySnapHelper.this;
                if (i2 == 0 && (snapListener = gravitySnapHelper.q) != null && gravitySnapHelper.j) {
                    int i3 = gravitySnapHelper.i;
                    if (i3 != -1) {
                        snapListener.H0(i3);
                    } else {
                        RecyclerView.LayoutManager layoutManager = gravitySnapHelper.r.getLayoutManager();
                        if (layoutManager != null && (viewM = gravitySnapHelper.m(layoutManager, false)) != null) {
                            gravitySnapHelper.r.getClass();
                            int iN = RecyclerView.N(viewM);
                            if (iN != -1) {
                                gravitySnapHelper.q.H0(iN);
                            }
                        }
                    }
                }
                gravitySnapHelper.j = i2 != 0;
            }
        };
        if (i != 8388611 && i != 8388613 && i != 80 && i != 48 && i != 17) {
            throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP | CENTER constants");
        }
        this.h = z;
        this.f = i;
        this.q = horizontalSelectorView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final void b(RecyclerView recyclerView) {
        ArrayList arrayList;
        RecyclerView recyclerView2 = this.r;
        RecyclerView.OnScrollListener onScrollListener = this.s;
        if (recyclerView2 != null && (arrayList = recyclerView2.n0) != null) {
            arrayList.remove(onScrollListener);
        }
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            int i = this.f;
            if (i == 8388611 || i == 8388613) {
                this.g = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
            }
            recyclerView.k(onScrollListener);
            this.r = recyclerView;
        } else {
            this.r = null;
        }
        super.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final int[] c(RecyclerView.LayoutManager layoutManager, View view) {
        int i = this.f;
        if (i == 17) {
            return super.c(layoutManager, view);
        }
        int[] iArr = new int[2];
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.g()) {
                boolean z = this.g;
                if (!(z && i == 8388613) && (z || i != 8388611)) {
                    iArr[0] = o(view, q(linearLayoutManager));
                    return iArr;
                }
                iArr[0] = p(view, q(linearLayoutManager));
                return iArr;
            }
            if (linearLayoutManager.h()) {
                if (i == 48) {
                    iArr[1] = p(view, r(linearLayoutManager));
                    return iArr;
                }
                iArr[1] = o(view, r(linearLayoutManager));
            }
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] d(int i, int i2) {
        int i3;
        float width;
        float f;
        if (this.r == null || ((this.o == null && this.p == null) || (this.m == -1 && this.n == -1.0f))) {
            return super.d(i, i2);
        }
        Scroller scroller = new Scroller(this.r.getContext(), new DecelerateInterpolator());
        int i4 = Integer.MAX_VALUE;
        if (this.n == -1.0f) {
            int i5 = this.m;
            if (i5 != -1) {
                i3 = i5;
            }
            int i6 = -i3;
            scroller.fling(0, 0, i, i2, i6, i3, i6, i3);
            return new int[]{scroller.getFinalX(), scroller.getFinalY()};
        }
        if (this.o != null) {
            width = this.r.getHeight();
            f = this.n;
        } else if (this.p != null) {
            width = this.r.getWidth();
            f = this.n;
        }
        i4 = (int) (width * f);
        i3 = i4;
        int i62 = -i3;
        scroller.fling(0, 0, i, i2, i62, i3, i62, i3);
        return new int[]{scroller.getFinalX(), scroller.getFinalY()};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final RecyclerView.SmoothScroller e(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (recyclerView = this.r) == null) {
            return null;
        }
        return new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.github.rubensousa.gravitysnaphelper.GravitySnapHelper.2
            @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public final void e(View view, RecyclerView.SmoothScroller.Action action) {
                GravitySnapHelper gravitySnapHelper = GravitySnapHelper.this;
                RecyclerView recyclerView2 = gravitySnapHelper.r;
                if (recyclerView2 == null || recyclerView2.getLayoutManager() == null) {
                    return;
                }
                int[] iArrC = gravitySnapHelper.c(gravitySnapHelper.r.getLayoutManager(), view);
                int i = iArrC[0];
                int i2 = iArrC[1];
                int iK = k(Math.max(Math.abs(i), Math.abs(i2)));
                if (iK > 0) {
                    action.b(i, i2, iK, this.j);
                }
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public final float j(DisplayMetrics displayMetrics) {
                return GravitySnapHelper.this.l / displayMetrics.densityDpi;
            }
        };
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final View f(RecyclerView.LayoutManager layoutManager) {
        return m(layoutManager, true);
    }

    public final View m(RecyclerView.LayoutManager layoutManager, boolean z) {
        int i = this.f;
        View viewN = i != 17 ? i != 48 ? i != 80 ? i != 8388611 ? i != 8388613 ? null : n(layoutManager, q(layoutManager), 8388613, z) : n(layoutManager, q(layoutManager), 8388611, z) : n(layoutManager, r(layoutManager), 8388613, z) : n(layoutManager, r(layoutManager), 8388611, z) : layoutManager.g() ? n(layoutManager, q(layoutManager), 17, z) : n(layoutManager, r(layoutManager), 17, z);
        if (viewN == null) {
            this.i = -1;
            return viewN;
        }
        this.r.getClass();
        this.i = RecyclerView.N(viewN);
        return viewN;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View n(androidx.recyclerview.widget.RecyclerView.LayoutManager r9, androidx.recyclerview.widget.OrientationHelper r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.rubensousa.gravitysnaphelper.GravitySnapHelper.n(androidx.recyclerview.widget.RecyclerView$LayoutManager, androidx.recyclerview.widget.OrientationHelper, int, boolean):android.view.View");
    }

    public final int o(View view, OrientationHelper orientationHelper) {
        int iD;
        int i;
        if (this.k) {
            iD = orientationHelper.d(view);
            i = orientationHelper.i();
        } else {
            int iD2 = orientationHelper.d(view);
            if (iD2 < orientationHelper.h() - ((orientationHelper.h() - orientationHelper.i()) / 2)) {
                return iD2 - orientationHelper.i();
            }
            iD = orientationHelper.d(view);
            i = orientationHelper.h();
        }
        return iD - i;
    }

    public final int p(View view, OrientationHelper orientationHelper) {
        int iG;
        int iM;
        if (this.k) {
            iG = orientationHelper.g(view);
            iM = orientationHelper.m();
        } else {
            iG = orientationHelper.g(view);
            if (iG < orientationHelper.m() / 2) {
                return iG;
            }
            iM = orientationHelper.m();
        }
        return iG - iM;
    }

    public final OrientationHelper q(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.p;
        if (orientationHelper == null || orientationHelper.f3680a != layoutManager) {
            this.p = OrientationHelper.a(layoutManager);
        }
        return this.p;
    }

    public final OrientationHelper r(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.o;
        if (orientationHelper == null || orientationHelper.f3680a != layoutManager) {
            this.o = OrientationHelper.c(layoutManager);
        }
        return this.o;
    }

    public final boolean s(int i, boolean z) {
        if (this.r.getLayoutManager() != null) {
            if (z) {
                RecyclerView.SmoothScroller smoothScrollerE = e(this.r.getLayoutManager());
                if (smoothScrollerE != null) {
                    smoothScrollerE.f3697a = i;
                    this.r.getLayoutManager().P0(smoothScrollerE);
                    return true;
                }
            } else {
                RecyclerView.ViewHolder viewHolderJ = this.r.J(i);
                if (viewHolderJ != null) {
                    int[] iArrC = c(this.r.getLayoutManager(), viewHolderJ.itemView);
                    this.r.scrollBy(iArrC[0], iArrC[1]);
                    return true;
                }
            }
        }
        return false;
    }

    public GravitySnapHelper(int i) {
        this(i, false, null);
    }
}
