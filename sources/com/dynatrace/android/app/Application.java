package com.dynatrace.android.app;

import com.dynatrace.android.callback.Callback;

@Deprecated
/* loaded from: classes4.dex */
public class Application extends android.app.Application {
    @Override // android.app.Application
    public final /* synthetic */ void onCreate() {
        Callback.i(this);
        super.onCreate();
    }
}
