package com.woolworths.scanlibrary.ui.stores;

import com.woolworths.scanlibrary.databinding.ActivityAvailableStoreListBinding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AvailableStoreListActivity e;

    public /* synthetic */ b(AvailableStoreListActivity availableStoreListActivity, int i) {
        this.d = i;
        this.e = availableStoreListActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ActivityAvailableStoreListBinding activityAvailableStoreListBinding = this.e.E;
                if (activityAvailableStoreListBinding != null) {
                    activityAvailableStoreListBinding.A.z.sendAccessibilityEvent(8);
                    return;
                } else {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
            default:
                ActivityAvailableStoreListBinding activityAvailableStoreListBinding2 = this.e.E;
                if (activityAvailableStoreListBinding2 != null) {
                    activityAvailableStoreListBinding2.B.y.sendAccessibilityEvent(8);
                    return;
                } else {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
        }
    }
}
