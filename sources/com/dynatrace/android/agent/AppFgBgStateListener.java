package com.dynatrace.android.agent;

import com.dynatrace.android.agent.db.DataAccessObject;
import com.dynatrace.android.lifecycle.appstate.ApplicationStateListener;

/* loaded from: classes.dex */
public class AppFgBgStateListener implements ApplicationStateListener {
    @Override // com.dynatrace.android.lifecycle.appstate.ApplicationStateListener
    public final void onBackground() {
        String str = Dynatrace.f14076a;
        if (Global.b.get()) {
            Core.c();
        }
    }

    @Override // com.dynatrace.android.lifecycle.appstate.ApplicationStateListener
    public final void onForeground() {
        String str = Dynatrace.f14076a;
        if (Global.b.get()) {
            DataAccessObject dataAccessObject = Core.g;
            if (dataAccessObject != null) {
                dataAccessObject.a(TimeLineProvider.b.a(), AdkSettings.l.g.a());
            }
            Core.k.g(false);
        }
    }
}
