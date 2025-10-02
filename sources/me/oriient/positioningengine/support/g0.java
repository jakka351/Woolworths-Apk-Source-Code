package me.oriient.positioningengine.support;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.sensorsManager.sensors.SensorReading;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.models.WorldCoordinate;

/* loaded from: classes8.dex */
public final class g0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public j0 f26553a;
    public PositioningEngine b;
    public SensorReading.LocationReading c;
    public WorldCoordinate d;
    public List e;
    public Map f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ j0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.n = j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, null, null, false, null, false, false, false, false, false, this);
    }
}
