package me.oriient.ipssdk.realtime.ofs;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;

/* loaded from: classes8.dex */
public final class W0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public SupportPositioningEngineManager f26024a;
    public PositioningEngine b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ IPSStartingPosition e;
    public final /* synthetic */ IPSCompletionListener f;
    public final /* synthetic */ List g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ SystemLocation i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(IPSStartingPosition iPSStartingPosition, IPSCompletionListener iPSCompletionListener, List list, boolean z, SystemLocation systemLocation, Continuation continuation) {
        super(2, continuation);
        this.e = iPSStartingPosition;
        this.f = iPSCompletionListener;
        this.g = list;
        this.h = z;
        this.i = systemLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        W0 w0 = new W0(this.e, this.f, this.g, this.h, this.i, continuation);
        w0.d = obj;
        return w0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.W0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
