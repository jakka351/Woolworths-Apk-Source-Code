package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.DTXActionImpl;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.appstart.AppStartController;

/* loaded from: classes.dex */
public class AppStartPlaceholderSegment extends DTXActionImpl {
    public final AppStartController w;
    public final DTXAutoActionWrapper x;

    /* JADX WARN: Illegal instructions before constructor call */
    public AppStartPlaceholderSegment(String str, DTXAutoActionWrapper dTXAutoActionWrapper, AppStartController appStartController) {
        DTXAutoAction dTXAutoAction = dTXAutoActionWrapper.f14182a;
        super(str, EventType.f, dTXAutoAction.m, dTXAutoAction.h, dTXAutoAction.i, false, dTXAutoAction);
        this.w = appStartController;
        this.x = dTXAutoActionWrapper;
    }

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
        AppStartController appStartController = this.w;
        appStartController.a(appStartController.f14167a.a(), null);
    }

    public final void t() {
        if (this.e) {
            return;
        }
        super.q(false);
        AppStartController appStartController = this.w;
        if (appStartController.d.compareAndSet(false, true)) {
            appStartController.f.unregisterActivityLifecycleCallbacks(appStartController.e);
            if (Global.f14077a) {
                Utility.h(AppStartController.h, "AppStart action dropped");
            }
        }
    }
}
