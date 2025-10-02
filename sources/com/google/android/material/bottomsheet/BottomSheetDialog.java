package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.woolworths.R;

/* loaded from: classes6.dex */
public class BottomSheetDialog extends AppCompatDialog {
    public BottomSheetBehavior i;
    public FrameLayout j;
    public CoordinatorLayout k;
    public FrameLayout l;
    public boolean m;
    public boolean n;
    public boolean o;
    public EdgeToEdgeCallback p;
    public final boolean q;
    public MaterialBackOrchestrator r;
    public final BottomSheetBehavior.BottomSheetCallback s;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$4, reason: invalid class name */
    class AnonymousClass4 implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f14524a;
        public final WindowInsetsCompat b;
        public Window c;
        public boolean d;

        public EdgeToEdgeCallback(View view, WindowInsetsCompat windowInsetsCompat) {
            this.b = windowInsetsCompat;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.F(view).l;
            ColorStateList colorStateListI = materialShapeDrawable != null ? materialShapeDrawable.d.c : ViewCompat.i(view);
            if (colorStateListI != null) {
                this.f14524a = Boolean.valueOf(MaterialColors.f(colorStateListI.getDefaultColor()));
                return;
            }
            ColorStateList colorStateListD = DrawableUtils.d(view.getBackground());
            Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
            if (numValueOf != null) {
                this.f14524a = Boolean.valueOf(MaterialColors.f(numValueOf.intValue()));
            } else {
                this.f14524a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void b(View view, float f) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void c(int i, View view) {
            d(view);
        }

        public final void d(View view) {
            int top = view.getTop();
            WindowInsetsCompat windowInsetsCompat = this.b;
            if (top < windowInsetsCompat.k()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.f14524a;
                    new WindowInsetsControllerCompat(window, window.getDecorView()).e(bool == null ? this.d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), windowInsetsCompat.k() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    new WindowInsetsControllerCompat(window2, window2.getDecorView()).e(this.d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                this.d = new WindowInsetsControllerCompat(window, window.getDecorView()).c();
            }
        }
    }

    public BottomSheetDialog(@NonNull Context context) {
        this(context, 0);
        this.q = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() throws Resources.NotFoundException {
        f();
        super.cancel();
    }

    public final void e() throws Resources.NotFoundException {
        if (this.j == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.j = frameLayout;
            this.k = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.j.findViewById(R.id.design_bottom_sheet);
            this.l = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorF = BottomSheetBehavior.F(frameLayout2);
            this.i = bottomSheetBehaviorF;
            bottomSheetBehaviorF.y(this.s);
            this.i.M(this.m);
            this.r = new MaterialBackOrchestrator(this.i, this.l);
        }
    }

    public final BottomSheetBehavior f() throws Resources.NotFoundException {
        if (this.i == null) {
            e();
        }
        return this.i;
    }

    public final FrameLayout g(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.j.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.q) {
            ViewCompat.I(this.l, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    EdgeToEdgeCallback edgeToEdgeCallback = bottomSheetDialog.p;
                    if (edgeToEdgeCallback != null) {
                        bottomSheetDialog.i.a0.remove(edgeToEdgeCallback);
                    }
                    EdgeToEdgeCallback edgeToEdgeCallback2 = new EdgeToEdgeCallback(bottomSheetDialog.l, windowInsetsCompat);
                    bottomSheetDialog.p = edgeToEdgeCallback2;
                    edgeToEdgeCallback2.e(bottomSheetDialog.getWindow());
                    bottomSheetDialog.i.y(bottomSheetDialog.p);
                    return windowInsetsCompat;
                }
            });
        }
        this.l.removeAllViews();
        if (layoutParams == null) {
            this.l.addView(view);
        } else {
            this.l.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                Callback.g(view2);
                try {
                    if (bottomSheetDialog.m && bottomSheetDialog.isShowing()) {
                        if (!bottomSheetDialog.o) {
                            TypedArray typedArrayObtainStyledAttributes = bottomSheetDialog.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                            bottomSheetDialog.n = typedArrayObtainStyledAttributes.getBoolean(0, true);
                            typedArrayObtainStyledAttributes.recycle();
                            bottomSheetDialog.o = true;
                        }
                        if (bottomSheetDialog.n) {
                            bottomSheetDialog.cancel();
                        }
                    }
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        });
        ViewCompat.A(this.l, new AccessibilityDelegateCompat() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.3
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
                this.f2466a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
                if (!BottomSheetDialog.this.m) {
                    accessibilityNodeInfo.setDismissable(false);
                } else {
                    accessibilityNodeInfoCompat.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view2, int i2, Bundle bundle) throws Resources.NotFoundException {
                if (i2 == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.m) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.g(view2, i2, bundle);
            }
        });
        this.l.setOnTouchListener(new AnonymousClass4());
        return this.j;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.q && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.j;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.k;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            WindowCompat.b(window, !z);
            EdgeToEdgeCallback edgeToEdgeCallback = this.p;
            if (edgeToEdgeCallback != null) {
                edgeToEdgeCallback.e(window);
            }
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.r;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.m) {
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
    public final void onDetachedFromWindow() {
        EdgeToEdgeCallback edgeToEdgeCallback = this.p;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.e(null);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.r;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.b();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public final void onStart() throws Resources.NotFoundException {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.i;
        if (bottomSheetBehavior == null || bottomSheetBehavior.O != 5) {
            return;
        }
        bottomSheetBehavior.f(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) throws Resources.NotFoundException {
        MaterialBackOrchestrator materialBackOrchestrator;
        super.setCancelable(z);
        if (this.m != z) {
            this.m = z;
            BottomSheetBehavior bottomSheetBehavior = this.i;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.M(z);
            }
            if (getWindow() == null || (materialBackOrchestrator = this.r) == null) {
                return;
            }
            if (this.m) {
                materialBackOrchestrator.a(false);
            } else {
                materialBackOrchestrator.b();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.m) {
            this.m = true;
        }
        this.n = z;
        this.o = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(g(null, i, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(g(view, 0, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }

    public BottomSheetDialog(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : 2132083558;
        }
        super(context, i);
        this.m = true;
        this.n = true;
        this.s = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void b(View view, float f) {
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public final void c(int i2, View view) throws Resources.NotFoundException {
                if (i2 == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }
        };
        c().w(1);
        this.q = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }
}
