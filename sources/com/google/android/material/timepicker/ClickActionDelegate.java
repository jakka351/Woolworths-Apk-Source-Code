package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* loaded from: classes6.dex */
class ClickActionDelegate extends AccessibilityDelegateCompat {
    public final AccessibilityNodeInfoCompat.AccessibilityActionCompat d;

    public ClickActionDelegate(Context context, int i) {
        this.d = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, context.getString(i));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
        accessibilityNodeInfoCompat.b(this.d);
    }
}
