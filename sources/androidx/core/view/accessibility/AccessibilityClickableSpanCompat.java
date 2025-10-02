package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {
    public final int d;
    public final AccessibilityNodeInfoCompat e;
    public final int f;

    public AccessibilityClickableSpanCompat(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
        this.d = i;
        this.e = accessibilityNodeInfoCompat;
        this.f = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.d);
        this.e.f2508a.performAction(this.f, bundle);
    }
}
