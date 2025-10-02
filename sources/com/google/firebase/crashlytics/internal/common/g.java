package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CrashlyticsCore e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(CrashlyticsCore crashlyticsCore, Object obj, int i) {
        this.d = i;
        this.e = crashlyticsCore;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.d) {
            case 0:
                this.e.g.d.f((Map) this.f);
                break;
            default:
                this.e.a((SettingsController) this.f);
                break;
        }
    }
}
