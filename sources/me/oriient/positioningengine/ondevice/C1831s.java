package me.oriient.positioningengine.ondevice;

import java.io.Serializable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.positioningengine.ondevice.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1831s extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public I f26478a;
    public MappingData.Building b;
    public PositioningEngineState c;
    public Object d;
    public Serializable e;
    public MappingData.Building.BuildingInfo.FloorMetadata f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ I i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1831s(I i, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return I.a(this.i, (MappingData.Building) null, 0L, this);
    }
}
