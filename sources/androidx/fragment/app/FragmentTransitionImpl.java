package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

@SuppressLint
@RestrictTo
/* loaded from: classes2.dex */
public abstract class FragmentTransitionImpl {
    public static void f(View view, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        if (ViewCompat.o(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                break;
                            } else {
                                i4++;
                            }
                        } else if (ViewCompat.o(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static void j(Rect rect, View view) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean k(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList arrayList);

    public void c(Object obj) {
    }

    public void d(Object obj, c cVar) {
    }

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object i(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public boolean l() {
        if (!FragmentManager.Q(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean m(Object obj) {
        return false;
    }

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public abstract Object o(Object obj, Object obj2);

    public abstract void p(Object obj, View view, ArrayList arrayList);

    public abstract void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public void r(Object obj, float f) {
    }

    public abstract void s(View view, Object obj);

    public abstract void t(Object obj, Rect rect);

    public void u(Fragment fragment2, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        v(obj, cancellationSignal, null, runnable);
    }

    public void v(Object obj, CancellationSignal cancellationSignal, d dVar, Runnable runnable) {
        runnable.run();
    }

    public abstract void w(Object obj, View view, ArrayList arrayList);

    public abstract void x(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object y(Object obj);
}
