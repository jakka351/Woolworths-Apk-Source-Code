package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.ipssdk.realtime.ips.Positioning;
import me.oriient.ipssdk.realtime.ips.ValidationService;

/* renamed from: me.oriient.ipssdk.realtime.ofs.w3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1744w3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26168a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ IPSStartingPosition d;
    public final /* synthetic */ Boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ IPSCompletionListener g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744w3(String str, Integer num, IPSStartingPosition iPSStartingPosition, Boolean bool, boolean z, IPSCompletionListener iPSCompletionListener, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = num;
        this.d = iPSStartingPosition;
        this.e = bool;
        this.f = z;
        this.g = iPSCompletionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1744w3(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1744w3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26168a;
        if (i == 0) {
            ResultKt.b(obj);
            BuildingRepository buildingRepositoryAccess$getBuildingRepository = Positioning.access$getBuildingRepository(Positioning.INSTANCE);
            String str = this.b;
            this.f26168a = 1;
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
        Integer num = this.c;
        IPSStartingPosition iPSStartingPosition = this.d;
        Boolean bool = this.e;
        boolean z = this.f;
        IPSCompletionListener iPSCompletionListener = this.g;
        if (outcome instanceof Outcome.Success) {
            Building building = (Building) ((Outcome.Success) outcome).getValue();
            Positioning positioning = Positioning.INSTANCE;
            Logger loggerAccess$getLogger = Positioning.access$getLogger(positioning);
            String str2 = Positioning.f25840a;
            StringBuilder sbA = AbstractC1685m0.a(str2, "access$getTAG$p(...)", "onBuildingReceived() called with: building = [");
            sbA.append(building.getId());
            sbA.append(']');
            loggerAccess$getLogger.d(str2, sbA.toString());
            CoreLogic.INSTANCE.setNewActiveBuilding(building);
            positioning.a(building, num, iPSStartingPosition, bool, z, iPSCompletionListener);
        }
        IPSCompletionListener iPSCompletionListener2 = this.g;
        if (outcome instanceof Outcome.Failure) {
            ValidationService.safeFailListener(iPSCompletionListener2, new Error((OriientError) ((Outcome.Failure) outcome).getValue(), 0, 1));
        }
        return Unit.f24250a;
    }
}
