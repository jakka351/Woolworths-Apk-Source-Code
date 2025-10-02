package com.medallia.digital.mobilesdk;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;

/* loaded from: classes.dex */
class i4 implements m8 {
    private static i4 c;

    /* renamed from: a, reason: collision with root package name */
    private Application f16526a;
    private MutableContextWrapper b;

    public static i4 c() {
        if (c == null) {
            c = new i4();
        }
        return c;
    }

    public Application a() {
        return this.f16526a;
    }

    public Context b() {
        Application application = this.f16526a;
        if (application != null) {
            return application.getApplicationContext();
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        c = null;
        this.b = null;
        this.f16526a = null;
    }

    public MutableContextWrapper d() {
        return this.b;
    }

    public static void a(Application application) {
        c().b(application);
    }

    private void b(Application application) {
        if (this.f16526a == null) {
            this.f16526a = application;
            this.b = application == null ? null : new MutableContextWrapper(application.getApplicationContext());
        }
    }

    public void a(Context context) {
        MutableContextWrapper mutableContextWrapper = this.b;
        if (context == null) {
            Application application = this.f16526a;
            context = application != null ? application.getApplicationContext() : null;
        }
        mutableContextWrapper.setBaseContext(context);
    }
}
