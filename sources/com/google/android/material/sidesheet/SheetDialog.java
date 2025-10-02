package com.google.android.material.sidesheet;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.SheetCallback;
import com.woolworths.R;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
abstract class SheetDialog<C extends SheetCallback> extends AppCompatDialog {
    public static final /* synthetic */ int p = 0;
    public Sheet i;
    public FrameLayout j;
    public FrameLayout k;
    public boolean l;
    public boolean m;
    public boolean n;
    public MaterialBackOrchestrator o;

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        g();
        super.cancel();
    }

    public abstract void e(Sheet sheet);

    public final void f() {
        if (this.j == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.m3_side_sheet_dialog, null);
            this.j = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.m3_side_sheet);
            this.k = frameLayout2;
            SideSheetBehavior sideSheetBehaviorH = h(frameLayout2);
            this.i = sideSheetBehaviorH;
            e(sideSheetBehaviorH);
            this.o = new MaterialBackOrchestrator(this.i, this.k);
        }
    }

    public Sheet g() {
        if (this.i == null) {
            f();
        }
        return this.i;
    }

    public abstract SideSheetBehavior h(FrameLayout frameLayout);

    public final FrameLayout i(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        if (this.j == null) {
            f();
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.j.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.k == null) {
            f();
        }
        FrameLayout frameLayout = this.k;
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SheetDialog sheetDialog = this.d;
                int i2 = SheetDialog.p;
                Callback.g(view2);
                try {
                    if (sheetDialog.l && sheetDialog.isShowing()) {
                        if (!sheetDialog.n) {
                            TypedArray typedArrayObtainStyledAttributes = sheetDialog.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                            sheetDialog.m = typedArrayObtainStyledAttributes.getBoolean(0, true);
                            typedArrayObtainStyledAttributes.recycle();
                            sheetDialog.n = true;
                        }
                        if (sheetDialog.m) {
                            sheetDialog.cancel();
                        }
                    }
                } finally {
                    Callback.h();
                }
            }
        });
        if (this.k == null) {
            f();
        }
        ViewCompat.A(this.k, new AccessibilityDelegateCompat() { // from class: com.google.android.material.sidesheet.SheetDialog.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
                this.f2466a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                if (!SheetDialog.this.l) {
                    accessibilityNodeInfo.setDismissable(false);
                } else {
                    accessibilityNodeInfoCompat.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view2, int i2, Bundle bundle) {
                if (i2 == 1048576) {
                    SheetDialog sheetDialog = SheetDialog.this;
                    if (sheetDialog.l) {
                        sheetDialog.cancel();
                        return true;
                    }
                }
                return super.g(view2, i2, bundle);
            }
        });
        return this.j;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        FrameLayout frameLayout;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null && (frameLayout = this.k) != null && (frameLayout.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            int i = ((CoordinatorLayout.LayoutParams) this.k.getLayoutParams()).c;
            FrameLayout frameLayout2 = this.k;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            window.setWindowAnimations(Gravity.getAbsoluteGravity(i, frameLayout2.getLayoutDirection()) == 3 ? R.style.Animation_Material3_SideSheetDialog_Left : R.style.Animation_Material3_SideSheetDialog_Right);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.o;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.l) {
            materialBackOrchestrator.a(false);
        } else {
            materialBackOrchestrator.b();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.o;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.b();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() {
        super.onStart();
        Sheet sheet = this.i;
        if (sheet == null || sheet.getState() != 5) {
            return;
        }
        this.i.f(3);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        MaterialBackOrchestrator materialBackOrchestrator;
        super.setCancelable(z);
        if (this.l != z) {
            this.l = z;
        }
        if (getWindow() == null || (materialBackOrchestrator = this.o) == null) {
            return;
        }
        if (this.l) {
            materialBackOrchestrator.a(false);
        } else {
            materialBackOrchestrator.b();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.l) {
            this.l = true;
        }
        this.m = z;
        this.n = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(i(null, i, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
