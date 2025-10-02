package me.oriient.internal.services.auth;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.SingleInstanceExecutor;

/* renamed from: me.oriient.internal.services.auth.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1223o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f25036a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223o(D d) {
        super(0);
        this.f25036a = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return SingleInstanceExecutor.INSTANCE.newExecutor((CoroutineContext) this.f25036a.k.getD(), "login", new C1222n(this.f25036a, null));
    }
}
