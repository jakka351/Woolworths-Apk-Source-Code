package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class PagerSnapHelper extends SnapHelper {
    public OrientationHelper d;
    public OrientationHelper e;

    public static int i(View view, OrientationHelper orientationHelper) {
        return ((orientationHelper.e(view) / 2) + orientationHelper.g(view)) - ((orientationHelper.n() / 2) + orientationHelper.m());
    }

    public static View j(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int iZ = layoutManager.z();
        View view = null;
        if (iZ == 0) {
            return null;
        }
        int iN = (orientationHelper.n() / 2) + orientationHelper.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iZ; i2++) {
            View viewY = layoutManager.y(i2);
            int iAbs = Math.abs(((orientationHelper.e(viewY) / 2) + orientationHelper.g(viewY)) - iN);
            if (iAbs < i) {
                view = viewY;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.g()) {
            iArr[0] = i(view, k(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.h()) {
            iArr[1] = i(view, l(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final RecyclerView.SmoothScroller e(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.f3700a.getContext()) { // from class: androidx.recyclerview.widget.PagerSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public final void e(View view, RecyclerView.SmoothScroller.Action action) {
                    PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
                    int[] iArrC = pagerSnapHelper.c(pagerSnapHelper.f3700a.getLayoutManager(), view);
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

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public final int l(int i) {
                    return Math.min(100, super.l(i));
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public View f(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.h()) {
            return j(layoutManager, l(layoutManager));
        }
        if (layoutManager.g()) {
            return j(layoutManager, k(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.SnapHelper
    public final int g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        PointF pointFA;
        int iJ = layoutManager.J();
        if (iJ != 0) {
            View view = null;
            OrientationHelper orientationHelperL = layoutManager.h() ? l(layoutManager) : layoutManager.g() ? k(layoutManager) : null;
            if (orientationHelperL != null) {
                int iZ = layoutManager.z();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < iZ; i5++) {
                    View viewY = layoutManager.y(i5);
                    if (viewY != null) {
                        int i6 = i(viewY, orientationHelperL);
                        if (i6 <= 0 && i6 > i4) {
                            view2 = viewY;
                            i4 = i6;
                        }
                        if (i6 >= 0 && i6 < i3) {
                            view = viewY;
                            i3 = i6;
                        }
                    }
                }
                boolean z2 = !layoutManager.g() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return RecyclerView.LayoutManager.O(view);
                }
                if (!z2 && view2 != null) {
                    return RecyclerView.LayoutManager.O(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int iO = RecyclerView.LayoutManager.O(view);
                    int iJ2 = layoutManager.J();
                    if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (pointFA = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).a(iJ2 - 1)) != null && (pointFA.x < BitmapDescriptorFactory.HUE_RED || pointFA.y < BitmapDescriptorFactory.HUE_RED)) {
                        z = true;
                    }
                    int i7 = iO + (z == z2 ? -1 : 1);
                    if (i7 >= 0 && i7 < iJ) {
                        return i7;
                    }
                }
            }
        }
        return -1;
    }

    public final OrientationHelper k(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.e;
        if (orientationHelper == null || orientationHelper.f3680a != layoutManager) {
            this.e = new OrientationHelper.AnonymousClass1(layoutManager);
        }
        return this.e;
    }

    public final OrientationHelper l(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.d;
        if (orientationHelper == null || orientationHelper.f3680a != layoutManager) {
            this.d = new OrientationHelper.AnonymousClass2(layoutManager);
        }
        return this.d;
    }
}
