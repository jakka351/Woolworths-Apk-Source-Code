package me.oriient.internal.services.auth;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.elog.ELog;

/* loaded from: classes7.dex */
public final class z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f25061a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(D d) {
        super(0);
        this.f25061a = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((ELog) this.f25061a.d.getD()).w("AuthManager", "Failed to refresh JWT after max attempts");
        return Unit.f24250a;
    }
}
