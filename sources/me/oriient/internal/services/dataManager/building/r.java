package me.oriient.internal.services.dataManager.building;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;

/* loaded from: classes7.dex */
public final class r extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public v f25114a;
    public String b;
    public WorldCoordinate c;
    public String d;
    public float e;
    public float f;
    public /* synthetic */ Object g;
    public final /* synthetic */ v h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return v.a(this.h, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, this);
    }
}
