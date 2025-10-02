package me.oriient.ipssdk.realtime.ips;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.elog.Metric;
import me.oriient.ipssdk.api.listeners.IPSLoginListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.rest.SdkOriientApiProvider;
import me.oriient.ipssdk.realtime.ips.Core;
import me.oriient.ipssdk.realtime.ofs.AbstractC1685m0;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;

/* loaded from: classes8.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public String f25878a;
    public long b;
    public int c;
    public final /* synthetic */ Core.LoginCandidate d;
    public final /* synthetic */ CoreLogic e;
    public final /* synthetic */ IPSLoginListener f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Core.LoginCandidate loginCandidate, CoreLogic coreLogic, IPSLoginListener iPSLoginListener, Continuation continuation) {
        super(2, continuation);
        this.d = loginCandidate;
        this.e = coreLogic;
        this.f = iPSLoginListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.c;
        if (i == 0) {
            ResultKt.b(obj);
            String string = UUID.randomUUID().toString();
            Intrinsics.g(string, "toString(...)");
            ((SdkOriientApiProvider) DependencyInjectionKt.getDi().get(Reflection.f24268a.b(SdkOriientApiProvider.class))).onLogin(this.d.getIpsName());
            CoreLogic coreLogic = CoreLogic.INSTANCE;
            long currentTimeMillis = CoreLogic.access$getTimeProvider(coreLogic).getCurrentTimeMillis();
            CoreLogic.access$getRestService(coreLogic).setEnableHttpClientLogging(CoreLogic.access$getBuildData(coreLogic).getDebug());
            AuthManager authManagerAccess$getAuthManager = CoreLogic.access$getAuthManager(coreLogic);
            String apiKey = this.d.getApiKey();
            this.f25878a = string;
            this.b = currentTimeMillis;
            this.c = 1;
            Object objLogin = authManagerAccess$getAuthManager.login(apiKey, this);
            if (objLogin == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = string;
            obj = objLogin;
            j = currentTimeMillis;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.b;
            String str2 = this.f25878a;
            ResultKt.b(obj);
            str = str2;
        }
        Outcome outcome = (Outcome) obj;
        Core.LoginCandidate loginCandidate = this.d;
        CoreLogic coreLogic2 = this.e;
        IPSLoginListener iPSLoginListener = this.f;
        if (outcome instanceof Outcome.Success) {
            List list = (List) ((Outcome.Success) outcome).getValue();
            CoreLogic coreLogic3 = CoreLogic.INSTANCE;
            Metric metricAccess$getMetric = CoreLogic.access$getMetric(coreLogic3);
            String strAccess$getTAG$p = CoreLogic.access$getTAG$p();
            Intrinsics.g(strAccess$getTAG$p, "access$getTAG$p(...)");
            metricAccess$getMetric.i(strAccess$getTAG$p, "loginTimeAuth", CoreLogic.access$getTimeProvider(coreLogic3).timeIntervalSinceNowInSeconds(j));
            Job job = CoreLogic.N;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            CoreLogic.N = BuildersKt.c(CoreLogic.K, null, null, new c(list, loginCandidate, str, coreLogic2, iPSLoginListener, null), 3);
        }
        IPSLoginListener iPSLoginListener2 = this.f;
        if (outcome instanceof Outcome.Failure) {
            IPSError ipsError = ExtensionsKt.toIpsError((OriientError) ((Outcome.Failure) outcome).getValue());
            Logger loggerAccess$getLogger = CoreLogic.access$getLogger(CoreLogic.INSTANCE);
            String strAccess$getTAG$p2 = CoreLogic.access$getTAG$p();
            StringBuilder sbA = AbstractC1685m0.a(strAccess$getTAG$p2, "access$getTAG$p(...)", "onError: failed to open session: ");
            sbA.append(ipsError.getMessage());
            loggerAccess$getLogger.e(strAccess$getTAG$p2, sbA.toString());
            CoreLogic.F = false;
            ValidationService.safeFailListener(iPSLoginListener2, ipsError);
        }
        return Unit.f24250a;
    }
}
