package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes6.dex */
abstract class EndIconDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f14669a;
    public final EndCompoundLayout b;
    public final Context c;
    public final CheckableImageButton d;

    public EndIconDelegate(EndCompoundLayout endCompoundLayout) {
        this.f14669a = endCompoundLayout.d;
        this.b = endCompoundLayout;
        this.c = endCompoundLayout.getContext();
        this.d = endCompoundLayout.j;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return this instanceof DropdownMenuEndIconDelegate;
    }

    public boolean k() {
        return false;
    }

    public void l(EditText editText) {
    }

    public void m(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z) {
    }

    public final void p() {
        this.b.f(false);
    }

    public void q() {
    }

    public void r() {
    }
}
