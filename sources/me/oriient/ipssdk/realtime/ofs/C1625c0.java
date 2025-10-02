package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.ServerError;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.ipssdk.api.listeners.IPSListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.common.ips.ListenerException;
import me.oriient.ipssdk.common.utils.models.Error;
import me.oriient.ipssdk.realtime.ips.Core;
import me.oriient.ipssdk.realtime.ips.ValidationService;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;

/* renamed from: me.oriient.ipssdk.realtime.ofs.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1625c0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26052a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IPSListener c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625c0(String str, IPSListener iPSListener, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = iPSListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1625c0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1625c0(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IPSError ipsError;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26052a;
        if (i == 0) {
            ResultKt.b(obj);
            BuildingRepository buildingRepositoryAccess$getBuildingRepository = Core.access$getBuildingRepository(Core.INSTANCE);
            String str = this.b;
            this.f26052a = 1;
            obj = buildingRepositoryAccess$getBuildingRepository.fetchClientBuildingId(str, this);
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
        IPSListener iPSListener = this.c;
        if (outcome instanceof Outcome.Success) {
            try {
                iPSListener.onSuccess((String) ((Outcome.Success) outcome).getValue());
            } catch (Exception e) {
                ListenerException listenerException = new ListenerException(iPSListener.getClass().getSimpleName(), e);
                kotlin.reflect.jvm.internal.impl.types.checker.a.q("errorMessage", e.getMessage(), Core.access$getELog(Core.INSTANCE), iPSListener.getClass().getSimpleName(), "Exception in application");
                Core.access$getLogger(Core.INSTANCE).e(iPSListener.getClass().getSimpleName(), "Exception in application", listenerException);
            }
        }
        IPSListener iPSListener2 = this.c;
        if (outcome instanceof Outcome.Failure) {
            OriientError oriientError = (OriientError) ((Outcome.Failure) outcome).getValue();
            if (oriientError instanceof ServerError) {
                int code = ((ServerError) oriientError).getCode();
                ipsError = (code == 400 || code == 404) ? new Error(oriientError, 4, 2) : ExtensionsKt.toIpsError(oriientError);
            } else {
                ipsError = ExtensionsKt.toIpsError(oriientError);
            }
            ValidationService.safeFailListener(iPSListener2, ipsError);
        }
        return Unit.f24250a;
    }
}
