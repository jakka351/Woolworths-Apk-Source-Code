package me.oriient.positioningengine.support;

import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningEngineState;

/* loaded from: classes8.dex */
public final class i0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public j0 f26556a;
    public PositioningEngine b;
    public List c;
    public HashMap d;
    public PositioningEngineState.Calibrating e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ j0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.k = j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, false, false, false, false, null, false, null, this);
    }
}
