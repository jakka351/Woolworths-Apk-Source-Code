package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.customview.widget.FocusStrategy;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final FocusStrategy.BoundsAdapter o = new AnonymousClass1();
    public static final FocusStrategy.CollectionAdapter p = new AnonymousClass2();
    public final AccessibilityManager h;
    public final View i;
    public MyNodeProvider j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> {
        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        public final void a(Object obj, Rect rect) {
            ((AccessibilityNodeInfoCompat) obj).f(rect);
        }
    }

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$2, reason: invalid class name */
    public class AnonymousClass2 implements FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
    }

    public class MyNodeProvider extends AccessibilityNodeProviderCompat {
        public MyNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat b(int i) {
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(ExploreByTouchHelper.this.r(i).f2508a));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat c(int i) {
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            int i2 = i == 2 ? exploreByTouchHelper.k : exploreByTouchHelper.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final boolean d(int i, int i2, Bundle bundle) {
            int i3;
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            View view = exploreByTouchHelper.i;
            if (i == -1) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                return view.performAccessibilityAction(i2, bundle);
            }
            if (i2 == 1) {
                return exploreByTouchHelper.w(i);
            }
            if (i2 == 2) {
                return exploreByTouchHelper.j(i);
            }
            if (i2 != 64) {
                if (i2 != 128) {
                    return exploreByTouchHelper.s(i, i2, bundle);
                }
                if (exploreByTouchHelper.k != i) {
                    return false;
                }
                exploreByTouchHelper.k = Integer.MIN_VALUE;
                view.invalidate();
                exploreByTouchHelper.x(i, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = exploreByTouchHelper.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = exploreByTouchHelper.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                exploreByTouchHelper.k = Integer.MIN_VALUE;
                view.invalidate();
                exploreByTouchHelper.x(i3, 65536);
            }
            exploreByTouchHelper.k = i;
            view.invalidate();
            exploreByTouchHelper.x(i, 32768);
            return true;
        }
    }

    public ExploreByTouchHelper(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final AccessibilityNodeProviderCompat b(View view) {
        if (this.j == null) {
            this.j = new MyNodeProvider();
        }
        return this.j;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
        t(accessibilityNodeInfoCompat);
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        v(i, false);
        x(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i2) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatR = r(i);
        accessibilityEventObtain2.getText().add(accessibilityNodeInfoCompatR.h());
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompatR.f2508a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final AccessibilityNodeInfoCompat l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        accessibilityNodeInfoCompat.l("android.view.View");
        Rect rect = n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoCompat.k(rect);
        accessibilityNodeInfoCompat.b = -1;
        View view = this.i;
        accessibilityNodeInfoObtain.setParent(view);
        u(i, accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompat.h() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        accessibilityNodeInfoCompat.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        accessibilityNodeInfoCompat.c = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.k == i) {
            accessibilityNodeInfoCompat.j(true);
            accessibilityNodeInfoCompat.a(128);
        } else {
            accessibilityNodeInfoCompat.j(false);
            accessibilityNodeInfoCompat.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            accessibilityNodeInfoCompat.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            accessibilityNodeInfoCompat.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoCompat.f(rect3);
            if (accessibilityNodeInfoCompat.b != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                for (int i2 = accessibilityNodeInfoCompat.b; i2 != -1; i2 = accessibilityNodeInfoCompat2.b) {
                    accessibilityNodeInfoCompat2.b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat2.f2508a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    u(i2, accessibilityNodeInfoCompat2);
                    accessibilityNodeInfoCompat2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoCompat.k(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= BitmapDescriptorFactory.HUE_RED || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoCompat.f2508a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return accessibilityNodeInfoCompat;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.m;
            if (i2 != iN) {
                this.m = iN;
                x(iN, 128);
                x(i2, 256);
            }
            if (iN == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.m = Integer.MIN_VALUE;
                x(Integer.MIN_VALUE, 128);
                x(i, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f, float f2);

    public abstract void o(ArrayList arrayList);

    public final void p(int i) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(i, 2048);
        accessibilityEventK.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ExploreByTouchHelper.q(int, android.graphics.Rect):boolean");
    }

    public final AccessibilityNodeInfoCompat r(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            accessibilityNodeInfoCompat.f2508a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return accessibilityNodeInfoCompat;
    }

    public abstract boolean s(int i, int i2, Bundle bundle);

    public void t(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void u(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public void v(int i, boolean z) {
    }

    public final boolean w(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        v(i, true);
        x(i, 8);
        return true;
    }

    public final void x(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i2));
    }
}
