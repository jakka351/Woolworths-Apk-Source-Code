package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import au.com.woolworths.product.details.epoxy.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final /* synthetic */ int p = 0;
    public final AccessibilityManager g;
    public BottomSheetBehavior h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final BottomSheetBehavior.BottomSheetCallback o;

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) throws Resources.NotFoundException {
        BottomSheetBehavior bottomSheetBehavior2 = this.h;
        BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.o;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.a0.remove(bottomSheetCallback);
            this.h.L(null);
        }
        this.h = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.L(this);
            d(this.h.O);
            this.h.y(bottomSheetCallback);
        }
        e();
    }

    public final boolean c() throws Resources.NotFoundException {
        if (!this.j) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            accessibilityEventObtain.getText().add(this.n);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
        BottomSheetBehavior bottomSheetBehavior = this.h;
        boolean z = bottomSheetBehavior.e;
        int i = bottomSheetBehavior.O;
        int i2 = 6;
        int i3 = 3;
        if (i == 4) {
            if (z) {
                i2 = i3;
            }
        } else if (i != 3) {
            if (!this.k) {
                i3 = 4;
            }
            i2 = i3;
        } else if (z) {
            i2 = 4;
        }
        bottomSheetBehavior.f(i2);
        return true;
    }

    public final void d(int i) {
        if (i == 4) {
            this.k = true;
        } else if (i == 3) {
            this.k = false;
        }
        ViewCompat.x(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.g, this.k ? this.l : this.m, new a(this, 14));
    }

    public final void e() {
        this.j = this.i && this.h != null;
        int i = this.h == null ? 2 : 1;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setImportantForAccessibility(i);
        setClickable(this.j);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.i = z;
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() throws Resources.NotFoundException {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).f2382a;
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() throws Resources.NotFoundException {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, R.style.Widget_Material3_BottomSheet_DragHandle), attributeSet, i);
        this.l = getResources().getString(R.string.bottomsheet_action_expand);
        this.m = getResources().getString(R.string.bottomsheet_action_collapse);
        this.n = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.o = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void b(View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void c(int i2, View view) {
                int i3 = BottomSheetDragHandleView.p;
                BottomSheetDragHandleView.this.d(i2);
            }
        };
        this.g = (AccessibilityManager) getContext().getSystemService("accessibility");
        e();
        ViewCompat.A(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void e(View view, AccessibilityEvent accessibilityEvent) throws Resources.NotFoundException {
                super.e(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    int i2 = BottomSheetDragHandleView.p;
                    BottomSheetDragHandleView.this.c();
                }
            }
        });
    }
}
