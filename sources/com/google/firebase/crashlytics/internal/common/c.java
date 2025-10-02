package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.f = obj;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = this.d;
        Object obj = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                b bVar = CrashlyticsController.r;
                ((CrashlyticsController) obj2).c((String) obj, Boolean.FALSE);
                break;
            case 1:
                ((CrashlyticsCore) obj2).g.d.i((String) obj);
                break;
            default:
                ((CrashlyticsCore) obj2).a((SettingsController) obj);
                break;
        }
    }
}
