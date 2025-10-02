package me.oriient.internal.services.sensorsManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: me.oriient.internal.services.sensorsManager.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1489c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ForegroundServiceMonitorImpl f25567a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ForegroundServiceMonitorImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489c(ForegroundServiceMonitorImpl foregroundServiceMonitorImpl, Continuation continuation) {
        super(continuation);
        this.c = foregroundServiceMonitorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.backgroundPollingTask(this);
    }
}
