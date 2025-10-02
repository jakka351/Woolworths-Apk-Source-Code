package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.LifeCycle;
import java.util.HashMap;

/* loaded from: classes.dex */
class j0 implements m8, LifeCycle.h {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<a, d0> f16532a;

    public enum a {
        Form,
        Intercept,
        UserJourneyAction,
        Feedback,
        Localization,
        CustomIntercept,
        TouchEvent
    }

    public j0() {
        HashMap<a, d0> map = new HashMap<>();
        this.f16532a = map;
        map.put(a.Form, new d4());
        map.put(a.Feedback, new c4());
        map.put(a.Intercept, new e4());
        map.put(a.UserJourneyAction, new g4());
        map.put(a.Localization, new z3());
        map.put(a.CustomIntercept, new b4());
        map.put(a.TouchEvent, new f4());
    }

    private void b(a aVar) {
        d0 d0Var;
        HashMap<a, d0> map = this.f16532a;
        if (map == null || (d0Var = map.get(aVar)) == null) {
            return;
        }
        d0Var.e();
    }

    public void a() {
        LifeCycle.b().a(this);
        a(a.Form);
        a(a.Feedback);
        a(a.Intercept);
        a(a.UserJourneyAction);
        a(a.Localization);
        a(a.CustomIntercept);
        a(a.TouchEvent);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        b(a.Form);
        b(a.Feedback);
        b(a.Intercept);
        b(a.UserJourneyAction);
        b(a.Localization);
        b(a.CustomIntercept);
        b(a.TouchEvent);
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        clearAndDisconnect();
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        a();
    }

    private void a(a aVar) {
        d0 d0Var;
        HashMap<a, d0> map = this.f16532a;
        if (map == null || (d0Var = map.get(aVar)) == null) {
            return;
        }
        d0Var.d();
    }

    public void a(a aVar, Object obj) {
        d0 d0Var;
        HashMap<a, d0> map = this.f16532a;
        if (map == null || (d0Var = map.get(aVar)) == null) {
            return;
        }
        d0Var.a(obj);
    }
}
