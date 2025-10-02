package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.ipssdk.api.listeners.IPSBuildingListener;
import me.oriient.ipssdk.common.ips.ListenerException;
import me.oriient.ipssdk.common.utils.models.Building;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.ips.BuildingExtKt;
import me.oriient.ipssdk.realtime.ips.Core;
import me.oriient.ipssdk.realtime.ips.ValidationService;

/* renamed from: me.oriient.ipssdk.realtime.ofs.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1619b0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26046a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IPSBuildingListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1619b0(String str, IPSBuildingListener iPSBuildingListener, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = iPSBuildingListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1619b0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1619b0(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26046a;
        if (i == 0) {
            ResultKt.b(obj);
            BuildingRepository buildingRepositoryAccess$getBuildingRepository = Core.access$getBuildingRepository(Core.INSTANCE);
            String str = this.b;
            this.f26046a = 1;
            obj = buildingRepositoryAccess$getBuildingRepository.fetchBuilding(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        IPSBuildingListener iPSBuildingListener = this.c;
        if (outcome instanceof Outcome.Success) {
            Building sdkBuilding = BuildingExtKt.toSdkBuilding((me.oriient.internal.services.dataManager.building.Building) ((Outcome.Success) outcome).getValue());
            Core.access$getBuildingsManager(Core.INSTANCE).addBuilding(sdkBuilding);
            try {
                iPSBuildingListener.onBuildingReceived(sdkBuilding);
            } catch (Exception e) {
                ListenerException listenerException = new ListenerException(iPSBuildingListener.getClass().getSimpleName(), e);
                Core core = Core.INSTANCE;
                kotlin.reflect.jvm.internal.impl.types.checker.a.q("errorMessage", e.getMessage(), Core.access$getELog(core), iPSBuildingListener.getClass().getSimpleName(), "Exception in application");
                Core.access$getLogger(core).e(iPSBuildingListener.getClass().getSimpleName(), "Exception in application", listenerException);
            }
        }
        IPSBuildingListener iPSBuildingListener2 = this.c;
        if (outcome instanceof Outcome.Failure) {
            ValidationService.safeFailListener(iPSBuildingListener2, new Error((OriientError) ((Outcome.Failure) outcome).getValue(), 0, 1));
        }
        return Unit.f24250a;
    }
}
