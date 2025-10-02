package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.ips.CoreLogic;

/* renamed from: me.oriient.ipssdk.realtime.ofs.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1741w0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public User f26165a;
    public EngineConfig b;
    public IPSCompletionListener c;
    public /* synthetic */ Object d;
    public final /* synthetic */ CoreLogic e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741w0(CoreLogic coreLogic, Continuation continuation) {
        super(continuation);
        this.e = coreLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.handleSpaceChange(null, null, null, this);
    }
}
