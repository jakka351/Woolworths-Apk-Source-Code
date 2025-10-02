package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.realtime.ips.positioning.CurrentBuildingAndFloor;

/* renamed from: me.oriient.ipssdk.realtime.ofs.h1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1656h1 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public CurrentBuildingAndFloor f26081a;
    public /* synthetic */ Object b;
    public final /* synthetic */ CurrentBuildingAndFloor c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1656h1(CurrentBuildingAndFloor currentBuildingAndFloor, Continuation continuation) {
        super(continuation);
        this.c = currentBuildingAndFloor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return CurrentBuildingAndFloor.access$handleGeofenceInside(this.c, null, null, this);
    }
}
