package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.realtime.ips.proximity.local.WalkingDistanceLocalProximityLocationResolver;

/* loaded from: classes8.dex */
public final class Q4 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public WalkingDistanceLocalProximityLocationResolver f25997a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ WalkingDistanceLocalProximityLocationResolver d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(WalkingDistanceLocalProximityLocationResolver walkingDistanceLocalProximityLocationResolver, Continuation continuation) {
        super(continuation);
        this.d = walkingDistanceLocalProximityLocationResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.isPositionInside(null, this);
    }
}
