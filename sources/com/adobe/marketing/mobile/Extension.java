package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.services.Log;

/* loaded from: classes.dex */
public abstract class Extension {

    /* renamed from: a, reason: collision with root package name */
    public final ExtensionApi f13161a;

    public Extension(ExtensionApi extensionApi) {
        this.f13161a = extensionApi;
    }

    public String a() {
        return null;
    }

    public final String b() {
        return "Extension[" + c() + "(" + d() + ")]";
    }

    public abstract String c();

    public String d() {
        return null;
    }

    public void e() {
        b();
        Log.c();
    }

    public void f() {
        b();
        Log.c();
    }

    public boolean g(Event event) {
        return true;
    }
}
