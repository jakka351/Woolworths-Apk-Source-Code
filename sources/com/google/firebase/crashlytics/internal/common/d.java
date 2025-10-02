package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ CrashlyticsCore d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ d(CrashlyticsCore crashlyticsCore, String str, String str2) {
        this.d = crashlyticsCore;
        this.e = str;
        this.f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.e;
        String str2 = this.f;
        CrashlyticsController crashlyticsController = this.d.g;
        crashlyticsController.getClass();
        try {
            crashlyticsController.d.e(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = crashlyticsController.f15270a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Logger.f15258a.c(null, "Attempting to set custom attribute with null key, ignoring.");
        }
    }
}
