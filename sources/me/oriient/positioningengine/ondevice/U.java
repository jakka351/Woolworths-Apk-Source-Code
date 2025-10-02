package me.oriient.positioningengine.ondevice;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.ondevice.models.EngineProcessingResult;

/* loaded from: classes8.dex */
public final class U extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public X f26406a;
    public Iterator b;
    public EngineProcessingResult c;
    public /* synthetic */ Object d;
    public final /* synthetic */ X e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((SensorsDataSample) null, this);
    }
}
