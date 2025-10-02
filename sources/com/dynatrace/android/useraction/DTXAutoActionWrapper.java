package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.DTXActionImpl;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.data.Session;

/* loaded from: classes.dex */
public class DTXAutoActionWrapper implements UserAction {

    /* renamed from: a, reason: collision with root package name */
    public final DTXAutoAction f14182a;

    public DTXAutoActionWrapper(DTXAutoAction dTXAutoAction) {
        this.f14182a = dTXAutoAction;
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public final boolean a() {
        return this.f14182a.e;
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public final long b() {
        return this.f14182a.m;
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public final void c() {
        DTXAutoAction dTXAutoAction = this.f14182a;
        if (dTXAutoAction.E == null) {
            dTXAutoAction.B(DTXAutoAction.G);
        }
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public final Session d() {
        return this.f14182a.h;
    }

    @Override // com.dynatrace.android.useraction.UserAction
    public final int e() {
        return this.f14182a.i;
    }

    public final void f(DTXActionImpl dTXActionImpl) {
        this.f14182a.l(dTXActionImpl);
    }

    public final void g(String str, String str2) {
        this.f14182a.d(str, str2);
    }

    public final void h() {
        int i = DTXAutoAction.G;
        DTXAutoAction dTXAutoAction = this.f14182a;
        dTXAutoAction.B(i);
        dTXAutoAction.y();
    }
}
