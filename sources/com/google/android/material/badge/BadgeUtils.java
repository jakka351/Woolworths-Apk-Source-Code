package com.google.android.material.badge;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.ToolbarUtils;

@ExperimentalBadgeUtils
/* loaded from: classes6.dex */
public class BadgeUtils {

    /* renamed from: com.google.android.material.badge.BadgeUtils$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            ToolbarUtils.a(null);
            throw null;
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeUtils$2, reason: invalid class name */
    class AnonymousClass2 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
            throw null;
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeUtils$3, reason: invalid class name */
    class AnonymousClass3 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
            throw null;
        }
    }

    /* renamed from: com.google.android.material.badge.BadgeUtils$4, reason: invalid class name */
    class AnonymousClass4 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
            accessibilityNodeInfoCompat.p(null);
        }
    }
}
