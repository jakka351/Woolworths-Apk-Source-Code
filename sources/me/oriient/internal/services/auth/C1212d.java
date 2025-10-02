package me.oriient.internal.services.auth;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.internal.services.config.InternalConfig;

/* renamed from: me.oriient.internal.services.auth.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1212d implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f25026a;

    public C1212d(D d) {
        this.f25026a = d;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        D d = this.f25026a;
        d.a(d.b, ((InternalConfig) obj).getAuthConfig());
        return Unit.f24250a;
    }
}
