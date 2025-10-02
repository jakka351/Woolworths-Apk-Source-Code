package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.ipssdk.ips.IPSDataStatusListener;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.ipssdk.realtime.ips.DataManager;

/* renamed from: me.oriient.ipssdk.realtime.ofs.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1721s1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public DataManager f26143a;
    public int b;
    public final /* synthetic */ IPSDataStatusListener c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721s1(IPSDataStatusListener iPSDataStatusListener, String str, Continuation continuation) {
        super(2, continuation);
        this.c = iPSDataStatusListener;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1721s1(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1721s1(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DataManager dataManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.b;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            if (CoreLogic.INSTANCE.getUser() == null) {
                this.c.onDataStatus(0);
                return unit;
            }
            DataManager dataManager2 = DataManager.INSTANCE;
            DataPreloadingManager dataPreloadingManagerAccess$getDataPreloadingManager = DataManager.access$getDataPreloadingManager(dataManager2);
            String str = this.d;
            this.f26143a = dataManager2;
            this.b = 1;
            Object preloadingStatus = dataPreloadingManagerAccess$getDataPreloadingManager.getPreloadingStatus(str, this);
            if (preloadingStatus == coroutineSingletons) {
                return coroutineSingletons;
            }
            dataManager = dataManager2;
            obj = preloadingStatus;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataManager = this.f26143a;
            ResultKt.b(obj);
        }
        this.c.onDataStatus(DataManager.access$toDataStatus(dataManager, (DataPreloadingManager.PreloadingStatus) obj));
        return unit;
    }
}
