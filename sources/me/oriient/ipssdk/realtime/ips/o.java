package me.oriient.ipssdk.realtime.ips;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.services.dataManager.building.Floor;
import me.oriient.internal.services.retryOperation.RetryOperation;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSStartingPosition;
import me.oriient.ipssdk.realtime.ofs.A3;
import me.oriient.ipssdk.realtime.ofs.C1759z3;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25884a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ List c;
    public final /* synthetic */ IPSStartingPosition d;
    public final /* synthetic */ SystemLocation e;
    public final /* synthetic */ PositioningKotlinHelper f;
    public final /* synthetic */ IPSCompletionListener g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List list, Continuation continuation, SystemLocation systemLocation, IPSCompletionListener iPSCompletionListener, IPSStartingPosition iPSStartingPosition, PositioningKotlinHelper positioningKotlinHelper, boolean z) {
        super(2, continuation);
        this.b = z;
        this.c = list;
        this.d = iPSStartingPosition;
        this.e = systemLocation;
        this.f = positioningKotlinHelper;
        this.g = iPSCompletionListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        boolean z = this.b;
        List list = this.c;
        IPSStartingPosition iPSStartingPosition = this.d;
        o oVar = new o(list, continuation, this.e, this.g, iPSStartingPosition, this.f, z);
        oVar.f25884a = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((RetryOperation) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        final RetryOperation retryOperation = (RetryOperation) this.f25884a;
        CoreLogic coreLogic = CoreLogic.INSTANCE;
        boolean z = this.b;
        List<Floor> list = this.c;
        IPSStartingPosition iPSStartingPosition = this.d;
        SystemLocation systemLocation = this.e;
        final PositioningKotlinHelper positioningKotlinHelper = this.f;
        final IPSCompletionListener iPSCompletionListener = this.g;
        coreLogic.startPositioning(z, list, iPSStartingPosition, systemLocation, new IPSCompletionListener() { // from class: me.oriient.ipssdk.realtime.ips.PositioningKotlinHelper$startPositioning$1$2$1
            @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
            public void onCompleted() {
                BuildersKt.c(positioningKotlinHelper.d, null, null, new C1759z3(iPSCompletionListener, null), 3);
            }

            @Override // me.oriient.ipssdk.api.listeners.IPSFailable
            public void onError(@NotNull IPSError error) {
                Intrinsics.h(error, "error");
                BuildersKt.c(positioningKotlinHelper.d, null, null, new A3(positioningKotlinHelper, error, retryOperation, null), 3);
            }
        });
        return Unit.f24250a;
    }
}
