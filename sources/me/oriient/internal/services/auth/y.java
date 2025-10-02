package me.oriient.internal.services.auth;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.SingleInstanceExecutor;

/* loaded from: classes7.dex */
public final class y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f25060a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(D d) {
        super(0);
        this.f25060a = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return SingleInstanceExecutor.INSTANCE.newExecutor((CoroutineContext) this.f25060a.k.getD(), "refreshToken", new x(this.f25060a, null));
    }
}
