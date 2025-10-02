package me.oriient.ipssdk.realtime.ofs;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.region.RegionRepository;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticLockedSessionStopper;

/* renamed from: me.oriient.ipssdk.realtime.ofs.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1636e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26063a;
    public final /* synthetic */ AutomaticLockedSessionStopper b;
    public final /* synthetic */ Building c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1636e(AutomaticLockedSessionStopper automaticLockedSessionStopper, Building building, Continuation continuation) {
        super(2, continuation);
        this.b = automaticLockedSessionStopper;
        this.c = building;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1636e(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1636e(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26063a;
        if (i == 0) {
            ResultKt.b(obj);
            RegionRepository regionRepositoryAccess$getRegionRepository = AutomaticLockedSessionStopper.access$getRegionRepository(this.b);
            String id = this.c.getId();
            this.f26063a = 1;
            obj = regionRepositoryAccess$getRegionRepository.getExitRegions(id, this);
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
        AutomaticLockedSessionStopper automaticLockedSessionStopper = this.b;
        if (outcome instanceof Outcome.Success) {
            AutomaticLockedSessionStopper.access$onNewExitRegions(automaticLockedSessionStopper, (List) ((Outcome.Success) outcome).getValue());
        }
        AutomaticLockedSessionStopper automaticLockedSessionStopper2 = this.b;
        Building building = this.c;
        if (outcome instanceof Outcome.Failure) {
            AutomaticLockedSessionStopper.access$getELog(automaticLockedSessionStopper2).e("AutomaticLockedSessionS", "Failed to load auto-stop exit regions", new C1630d((OriientError) ((Outcome.Failure) outcome).getValue(), building));
        }
        return Unit.f24250a;
    }
}
