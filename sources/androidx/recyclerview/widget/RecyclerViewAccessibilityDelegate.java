package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {
    public final RecyclerView d;
    public final ItemDelegate e;

    public static class ItemDelegate extends AccessibilityDelegateCompat {
        public final RecyclerViewAccessibilityDelegate d;
        public final WeakHashMap e = new WeakHashMap();

        public ItemDelegate(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.d = recyclerViewAccessibilityDelegate;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.a(view, accessibilityEvent) : this.f2466a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final AccessibilityNodeProviderCompat b(View view) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.b(view) : super.b(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = this.d;
            RecyclerView recyclerView = recyclerViewAccessibilityDelegate.d;
            RecyclerView recyclerView2 = recyclerViewAccessibilityDelegate.d;
            boolean zS = recyclerView.S();
            View.AccessibilityDelegate accessibilityDelegate = this.f2466a;
            if (zS || recyclerView2.getLayoutManager() == null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
            recyclerView2.getLayoutManager().h0(view, accessibilityNodeInfoCompat);
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.d(view, accessibilityNodeInfoCompat);
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(viewGroup);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.f(viewGroup, view, accessibilityEvent) : this.f2466a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean g(View view, int i, Bundle bundle) {
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = this.d;
            RecyclerView recyclerView = recyclerViewAccessibilityDelegate.d;
            RecyclerView recyclerView2 = recyclerViewAccessibilityDelegate.d;
            if (recyclerView.S() || recyclerView2.getLayoutManager() == null) {
                return super.g(view, i, bundle);
            }
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                if (accessibilityDelegateCompat.g(view, i, bundle)) {
                    return true;
                }
            } else if (super.g(view, i, bundle)) {
                return true;
            }
            RecyclerView.Recycler recycler = recyclerView2.getLayoutManager().b.f;
            return false;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void h(View view, int i) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.d = recyclerView;
        AccessibilityDelegateCompat accessibilityDelegateCompatJ = j();
        if (accessibilityDelegateCompatJ == null || !(accessibilityDelegateCompatJ instanceof ItemDelegate)) {
            this.e = new ItemDelegate(this);
        } else {
            this.e = (ItemDelegate) accessibilityDelegateCompatJ;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.S()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().f0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.S() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.g0(recyclerView2.f, recyclerView2.l0, accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.S() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().u0(i, bundle);
    }

    public AccessibilityDelegateCompat j() {
        return this.e;
    }
}
