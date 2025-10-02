package me.oriient.ipssdk.realtime.ofs;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.DataManager;

/* renamed from: me.oriient.ipssdk.realtime.ofs.m1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1686m1 extends SuspendLambda implements Function5 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f26109a;
    public /* synthetic */ boolean b;
    public /* synthetic */ RemoteConfig c;
    public /* synthetic */ List d;

    public C1686m1(Continuation continuation) {
        super(5, continuation);
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C1686m1 c1686m1 = new C1686m1((Continuation) obj5);
        c1686m1.f26109a = iIntValue;
        c1686m1.b = zBooleanValue;
        c1686m1.c = (RemoteConfig) obj3;
        c1686m1.d = (List) obj4;
        return c1686m1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        int i = this.f26109a;
        boolean z = this.b;
        RemoteConfig remoteConfig = this.c;
        List list = this.d;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            DataManager.access$getLogger(DataManager.INSTANCE).d("DataManager", "Cannot preload when we're offline");
            return unit;
        }
        if (z && remoteConfig.getRealTime().getMisc().getEnableAutomaticPositioningDataPreloading() && !list.isEmpty()) {
            DataManager.INSTANCE.prepareData((String) CollectionsKt.D(list));
        }
        return unit;
    }
}
