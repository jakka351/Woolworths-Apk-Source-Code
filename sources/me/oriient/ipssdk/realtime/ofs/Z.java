package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.dataManager.buildingCoordinateConverter.BuildingCoordinateConverter;
import me.oriient.ipssdk.api.listeners.IPSCoordinatesConverterListener;

/* loaded from: classes8.dex */
public final class Z extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public IPSCoordinatesConverterListener f26036a;
    public BuildingCoordinateConverter b;
    public int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ IPSCoordinatesConverterListener e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(String str, IPSCoordinatesConverterListener iPSCoordinatesConverterListener, Continuation continuation) {
        super(2, continuation);
        this.d = str;
        this.e = iPSCoordinatesConverterListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z(this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z(this.d, this.e, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ofs.Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
