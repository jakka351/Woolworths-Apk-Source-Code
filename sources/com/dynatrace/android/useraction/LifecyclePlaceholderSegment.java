package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.DTXActionImpl;
import com.dynatrace.android.lifecycle.LifecycleController;
import com.dynatrace.android.lifecycle.action.LifecycleAction;

/* loaded from: classes.dex */
public class LifecyclePlaceholderSegment extends DTXActionImpl {
    public LifecycleController w;
    public LifecycleAction x;

    @Override // com.dynatrace.android.agent.DTXActionImpl, com.dynatrace.android.agent.CustomSegment
    public final StringBuilder f() {
        return new StringBuilder();
    }

    @Override // com.dynatrace.android.agent.DTXActionImpl
    public final void q(boolean z) {
        if (this.e) {
            return;
        }
        super.q(false);
        LifecycleController lifecycleController = this.w;
        LifecycleAction lifecycleAction = this.x;
        lifecycleController.getClass();
        if (lifecycleAction.a().compareAndSet(false, true)) {
            lifecycleAction.f(lifecycleController.d.a());
            lifecycleController.c.a(lifecycleAction);
        }
    }
}
