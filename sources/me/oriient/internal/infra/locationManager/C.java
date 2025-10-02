package me.oriient.internal.infra.locationManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f24932a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Throwable th) {
        super(0);
        this.f24932a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("errorMessage", this.f24932a.getMessage());
    }
}
