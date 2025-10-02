package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataRepository;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadataWithImage;
import me.oriient.ipssdk.api.listeners.IPSMapListener;
import me.oriient.ipssdk.common.ips.ListenerException;
import me.oriient.ipssdk.realtime.ips.CoreLogic;
import me.oriient.ipssdk.realtime.ips.CoreLogicKt;
import me.oriient.ipssdk.realtime.ips.ValidationService;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;

/* renamed from: me.oriient.ipssdk.realtime.ofs.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1736v0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26159a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ IPSMapListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736v0(String str, String str2, IPSMapListener iPSMapListener, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = iPSMapListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1736v0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1736v0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26159a;
        if (i == 0) {
            ResultKt.b(obj);
            FloorMetadataRepository floorMetadataRepositoryAccess$getFloorMetadataRepository = CoreLogic.access$getFloorMetadataRepository(CoreLogic.INSTANCE);
            String str = this.b;
            String str2 = this.c;
            this.f26159a = 1;
            obj = floorMetadataRepositoryAccess$getFloorMetadataRepository.fetchFloorMetadataWithBitmap(str, str2, this);
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
        IPSMapListener iPSMapListener = this.d;
        if (outcome instanceof Outcome.Success) {
            FloorMetadataWithImage floorMetadataWithImage = (FloorMetadataWithImage) ((Outcome.Success) outcome).getValue();
            Logger loggerAccess$getLogger = CoreLogic.access$getLogger(CoreLogic.INSTANCE);
            String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
            Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
            loggerAccess$getLogger.d(strAccess$getTAG$p, "onCompleted() called");
            try {
                iPSMapListener.onMapReceived(CoreLogicKt.access$toMap(floorMetadataWithImage));
            } catch (Exception e) {
                String simpleName = iPSMapListener.getClass().getSimpleName();
                ListenerException listenerException = new ListenerException(simpleName, e);
                CoreLogic coreLogic = CoreLogic.INSTANCE;
                AbstractC1691n0.a(listenerException, "errorMessage", CoreLogic.access$getELog(coreLogic), simpleName, "Exception in application");
                CoreLogic.access$getLogger(coreLogic).e(simpleName, "Exception in application", listenerException);
            }
        }
        IPSMapListener iPSMapListener2 = this.d;
        if (outcome instanceof Outcome.Failure) {
            OriientError oriientError = (OriientError) ((Outcome.Failure) outcome).getValue();
            Logger loggerAccess$getLogger2 = CoreLogic.access$getLogger(CoreLogic.INSTANCE);
            String strAccess$getTAG$p2 = CoreLogic.access$getTAG$p();
            StringBuilder sbA = AbstractC1685m0.a(strAccess$getTAG$p2, "access$getTAG$p(...)", "getMapById onError() called with: error = [");
            sbA.append(oriientError.getMessage());
            sbA.append(']');
            loggerAccess$getLogger2.e(strAccess$getTAG$p2, sbA.toString());
            ValidationService.safeFailListener(iPSMapListener2, ExtensionsKt.toIpsError(oriientError));
        }
        return Unit.f24250a;
    }
}
