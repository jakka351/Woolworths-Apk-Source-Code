package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.motion.MotionUtils;
import com.woolworths.R;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
class DropdownMenuEndIconDelegate extends EndIconDelegate {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final a i;
    public final b j;
    public final g k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.g] */
    public DropdownMenuEndIconDelegate(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.i = new a(this, 1);
        this.j = new b(this, 1);
        this.k = new AccessibilityManagerCompat.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.g
            @Override // androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.d;
                AutoCompleteTextView autoCompleteTextView = dropdownMenuEndIconDelegate.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                CheckableImageButton checkableImageButton = dropdownMenuEndIconDelegate.d;
                int i = z ? 2 : 1;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                checkableImageButton.setImportantForAccessibility(i);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 67);
        this.e = MotionUtils.c(endCompoundLayout.getContext(), R.attr.motionDurationShort3, 50);
        this.g = MotionUtils.d(endCompoundLayout.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.f14504a);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new d(this, 1));
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final boolean k() {
        return this.n;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.d;
                    long j = jCurrentTimeMillis - dropdownMenuEndIconDelegate.o;
                    if (j < 0 || j > 300) {
                        dropdownMenuEndIconDelegate.m = false;
                    }
                    dropdownMenuEndIconDelegate.t();
                    dropdownMenuEndIconDelegate.m = true;
                    dropdownMenuEndIconDelegate.o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.f
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = this.f14672a;
                dropdownMenuEndIconDelegate.m = true;
                dropdownMenuEndIconDelegate.o = System.currentTimeMillis();
                dropdownMenuEndIconDelegate.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f14669a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void m(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
        if (this.h.getInputType() == 0) {
            accessibilityNodeInfoCompat.l(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && this.h.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                t();
                this.m = true;
                this.o = System.currentTimeMillis();
            }
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void q() {
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, i));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, i));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.textfield.DropdownMenuEndIconDelegate.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate = DropdownMenuEndIconDelegate.this;
                dropdownMenuEndIconDelegate.p();
                dropdownMenuEndIconDelegate.r.start();
            }
        });
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
