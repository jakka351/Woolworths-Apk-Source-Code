package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.realtime.services.rest.MapsRestServiceImpl;

/* loaded from: classes8.dex */
public final class A2 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public MapsRestServiceImpl f25909a;
    public /* synthetic */ Object b;
    public final /* synthetic */ MapsRestServiceImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(MapsRestServiceImpl mapsRestServiceImpl, Continuation continuation) {
        super(continuation);
        this.c = mapsRestServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return MapsRestServiceImpl.m462access$getAllMapEntitiesSuspendlD5TqXI(this.c, null, null, null, null, this);
    }
}
