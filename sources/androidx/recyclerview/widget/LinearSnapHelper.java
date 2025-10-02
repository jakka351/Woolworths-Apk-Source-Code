package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class LinearSnapHelper extends SnapHelper {
    public OrientationHelper d;
    public OrientationHelper e;

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
    public int[] c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.g()) {
            OrientationHelper orientationHelperK = k(layoutManager);
            iArr[0] = ((orientationHelperK.e(view) / 2) + orientationHelperK.g(view)) - ((orientationHelperK.n() / 2) + orientationHelperK.m());
        } else {
            iArr[0] = 0;
        }
        if (!layoutManager.h()) {
            iArr[1] = 0;
            return iArr;
        }
        OrientationHelper orientationHelperL = l(layoutManager);
        iArr[1] = ((orientationHelperL.e(view) / 2) + orientationHelperL.g(view)) - ((orientationHelperL.n() / 2) + orientationHelperL.m());
        return iArr;
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
        int iJ;
        View viewF;
        int iO;
        int i3;
        PointF pointFA;
        int i4;
        int i5;
        if ((layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) && (iJ = layoutManager.J()) != 0 && (viewF = f(layoutManager)) != null && (iO = RecyclerView.LayoutManager.O(viewF)) != -1 && (pointFA = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).a(iJ - 1)) != null) {
            if (layoutManager.g()) {
                i4 = i(layoutManager, k(layoutManager), i, 0);
                if (pointFA.x < BitmapDescriptorFactory.HUE_RED) {
                    i4 = -i4;
                }
            } else {
                i4 = 0;
            }
            if (layoutManager.h()) {
                i5 = i(layoutManager, l(layoutManager), 0, i2);
                if (pointFA.y < BitmapDescriptorFactory.HUE_RED) {
                    i5 = -i5;
                }
            } else {
                i5 = 0;
            }
            if (layoutManager.h()) {
                i4 = i5;
            }
            if (i4 != 0) {
                int i6 = iO + i4;
                int i7 = i6 >= 0 ? i6 : 0;
                return i7 >= iJ ? i3 : i7;
            }
        }
        return -1;
    }

    public final int i(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper, int i, int i2) {
        int[] iArrD = d(i, i2);
        int iZ = layoutManager.z();
        float f = 1.0f;
        if (iZ != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iZ; i5++) {
                View viewY = layoutManager.y(i5);
                int iO = RecyclerView.LayoutManager.O(viewY);
                if (iO != -1) {
                    if (iO < i4) {
                        view = viewY;
                        i4 = iO;
                    }
                    if (iO > i3) {
                        view2 = viewY;
                        i3 = iO;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(orientationHelper.d(view), orientationHelper.d(view2)) - Math.min(orientationHelper.g(view), orientationHelper.g(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        return Math.round((Math.abs(iArrD[0]) > Math.abs(iArrD[1]) ? iArrD[0] : iArrD[1]) / f);
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
