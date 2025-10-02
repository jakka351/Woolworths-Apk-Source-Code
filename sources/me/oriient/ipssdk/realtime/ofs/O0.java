package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.api.listeners.IPSLoginListener;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.ips.CoreLogic;

/* loaded from: classes8.dex */
public final class O0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public CoreLogic f25985a;
    public Error b;
    public IPSLoginListener c;
    public /* synthetic */ Object d;
    public final /* synthetic */ CoreLogic e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(CoreLogic coreLogic, Continuation continuation) {
        super(continuation);
        this.e = coreLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return CoreLogic.access$onLoginProcessFailed(this.e, null, null, this);
    }
}
