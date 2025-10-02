package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.positioningengine.common.util.PositioningEngineError;

/* loaded from: classes8.dex */
public final class L0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public PositioningEngineError f25967a;
    public /* synthetic */ Object b;
    public final /* synthetic */ M0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(M0 m0, Continuation continuation) {
        super(continuation);
        this.c = m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
