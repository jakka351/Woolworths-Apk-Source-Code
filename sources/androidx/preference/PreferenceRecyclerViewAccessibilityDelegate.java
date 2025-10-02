package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

@RestrictTo
@Deprecated
/* loaded from: classes2.dex */
public class PreferenceRecyclerViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
    public final RecyclerView f;
    public final RecyclerViewAccessibilityDelegate.ItemDelegate g;
    public final AccessibilityDelegateCompat h;

    public PreferenceRecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        super(recyclerView);
        this.g = this.e;
        this.h = new AccessibilityDelegateCompat() { // from class: androidx.preference.PreferenceRecyclerViewAccessibilityDelegate.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                PreferenceRecyclerViewAccessibilityDelegate preferenceRecyclerViewAccessibilityDelegate = PreferenceRecyclerViewAccessibilityDelegate.this;
                preferenceRecyclerViewAccessibilityDelegate.g.d(view, accessibilityNodeInfoCompat);
                RecyclerView recyclerView2 = preferenceRecyclerViewAccessibilityDelegate.f;
                recyclerView2.getClass();
                int iN = RecyclerView.N(view);
                RecyclerView.Adapter adapter = recyclerView2.getAdapter();
                if (adapter instanceof PreferenceGroupAdapter) {
                    ((PreferenceGroupAdapter) adapter).I(iN);
                }
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view, int i, Bundle bundle) {
                return PreferenceRecyclerViewAccessibilityDelegate.this.g.g(view, i, bundle);
            }
        };
        this.f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    public final AccessibilityDelegateCompat j() {
        return this.h;
    }
}
