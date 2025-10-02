package defpackage;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.di.DependencyInjectionImpl;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.scheduler.ExistingWorkPolicy;
import me.oriient.internal.infra.scheduler.ScheduleOptions;
import me.oriient.internal.infra.scheduler.ScheduleOptionsKt;
import me.oriient.internal.infra.scheduler.Scheduler;
import me.oriient.internal.infra.scheduler.WorkTag;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.remoteLog.InstanceOptions;
import me.oriient.internal.services.remoteLog.RemoteLog;
import me.oriient.internal.services.remoteLog.RemoteLogOptions;
import me.oriient.internal.services.remoteLog.SendingSchedule;
import me.oriient.internal.services.remoteLog.database.DatabaseService;
import me.oriient.internal.services.remoteLog.di.i;
import me.oriient.internal.services.remoteLog.e;
import me.oriient.internal.services.remoteLog.f;
import me.oriient.internal.services.remoteLog.g;
import me.oriient.internal.services.remoteLog.h;
import me.oriient.internal.services.remoteLog.models.b;
import me.oriient.internal.services.remoteLog.models.c;
import me.oriient.internal.services.remoteLog.utils.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B,\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J(\u0010\u0017\u001a\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001c\u001a\u00020\b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0016\u0010M\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\"\u0010R\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q0O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010KR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010'\u001a\u0004\bW\u0010XR\u0016\u0010]\u001a\u0004\u0018\u00010Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010a\u001a\u00020^8F¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"LRemoteLogImpl;", "Lme/oriient/internal/services/remoteLog/RemoteLog;", "", "url", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lme/oriient/internal/services/remoteLog/InstanceOptions;", "", "Lkotlin/ExtensionFunctionType;", "block", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lme/oriient/internal/services/remoteLog/models/b;", "generateNewBatchData", "()Lme/oriient/internal/services/remoteLog/models/b;", "Lme/oriient/internal/services/remoteLog/models/a;", "generateBatchConfig", "()Lme/oriient/internal/services/remoteLog/models/a;", "scheduleWithWorkManager", "()V", "trySendingMessagesInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySendingBatchInternal", "configure", "(Lkotlin/jvm/functions/Function1;)V", "", "", "messageData", "sendMessage", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "exceptLastMinutes", "clearAllLogs", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "Lkotlin/Lazy;", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/services/remoteLog/database/DatabaseService;", "databaseService$delegate", "getDatabaseService", "()Lme/oriient/internal/services/remoteLog/database/DatabaseService;", "databaseService", "Lme/oriient/internal/services/remoteLog/e;", "remoteLogManager$delegate", "getRemoteLogManager", "()Lme/oriient/internal/services/remoteLog/e;", "remoteLogManager", "Lme/oriient/internal/infra/rest/RestService;", "restService$delegate", "getRestService", "()Lme/oriient/internal/infra/rest/RestService;", "restService", "Lme/oriient/internal/infra/scheduler/Scheduler;", "scheduler$delegate", "getScheduler", "()Lme/oriient/internal/infra/scheduler/Scheduler;", "scheduler", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "networkManager$delegate", "getNetworkManager", "()Lme/oriient/internal/infra/networkManager/NetworkManager;", "networkManager", "localOptions", "Lme/oriient/internal/services/remoteLog/InstanceOptions;", "Lme/oriient/internal/services/remoteLog/utils/a;", "_options", "Lme/oriient/internal/services/remoteLog/utils/a;", "", "connected", "Z", "metered", "batchData", "Lme/oriient/internal/services/remoteLog/models/b;", "", "Lme/oriient/internal/services/remoteLog/models/c;", "Lkotlinx/coroutines/Job;", "batchSendingJobs", "Ljava/util/Map;", "didScheduleIdle", "Lkotlin/coroutines/CoroutineContext;", "insertCoroutineContext$delegate", "getInsertCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "insertCoroutineContext", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/remoteLog/RemoteLogOptions;", "getOptions", "()Lme/oriient/internal/services/remoteLog/RemoteLogOptions;", "options", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RemoteLogImpl implements RemoteLog {

    @NotNull
    private final a _options;

    @NotNull
    private b batchData;

    @NotNull
    private Map<c, Job> batchSendingJobs;
    private boolean connected;

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    /* renamed from: databaseService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy databaseService;
    private boolean didScheduleIdle;

    /* renamed from: insertCoroutineContext$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy insertCoroutineContext;

    @NotNull
    private final InstanceOptions localOptions;
    private boolean metered;

    /* renamed from: networkManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy networkManager;

    /* renamed from: remoteLogManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy remoteLogManager;

    /* renamed from: restService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy restService;

    /* renamed from: scheduler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduler;

    @NotNull
    private final String url;

    public RemoteLogImpl(@NotNull String url) {
        Intrinsics.h(url, "url");
        this.url = url;
        DependencyInjectionImpl dependencyInjectionImpl = i.f25535a;
        if (dependencyInjectionImpl == null) {
            Intrinsics.p("di");
            throw null;
        }
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.coroutineContextProvider = dependencyInjectionImpl.inject(reflectionFactory.b(CoroutineContextProvider.class));
        DependencyInjectionImpl dependencyInjectionImpl2 = i.f25535a;
        if (dependencyInjectionImpl2 == null) {
            Intrinsics.p("di");
            throw null;
        }
        this.databaseService = dependencyInjectionImpl2.inject(reflectionFactory.b(DatabaseService.class));
        DependencyInjectionImpl dependencyInjectionImpl3 = i.f25535a;
        if (dependencyInjectionImpl3 == null) {
            Intrinsics.p("di");
            throw null;
        }
        this.remoteLogManager = dependencyInjectionImpl3.inject(reflectionFactory.b(e.class));
        DependencyInjectionImpl dependencyInjectionImpl4 = i.f25535a;
        if (dependencyInjectionImpl4 == null) {
            Intrinsics.p("di");
            throw null;
        }
        this.restService = dependencyInjectionImpl4.inject(reflectionFactory.b(RestService.class));
        DependencyInjectionImpl dependencyInjectionImpl5 = i.f25535a;
        if (dependencyInjectionImpl5 == null) {
            Intrinsics.p("di");
            throw null;
        }
        this.scheduler = dependencyInjectionImpl5.inject(reflectionFactory.b(Scheduler.class));
        DependencyInjectionImpl dependencyInjectionImpl6 = i.f25535a;
        if (dependencyInjectionImpl6 == null) {
            Intrinsics.p("di");
            throw null;
        }
        this.networkManager = dependencyInjectionImpl6.inject(reflectionFactory.b(NetworkManager.class));
        InstanceOptions instanceOptions = new InstanceOptions();
        this.localOptions = instanceOptions;
        this._options = new a(instanceOptions, RemoteLoggerFactory.INSTANCE.getGlobalOptions());
        this.metered = true;
        this.batchData = generateNewBatchData();
        this.batchSendingJobs = new LinkedHashMap();
        this.insertCoroutineContext = LazyKt.b(new h(this));
        CoroutineContext io2 = getCoroutineContextProvider().getIo();
        c cVar = new c(this, null);
        GlobalScope globalScope = GlobalScope.d;
        BuildersKt.c(globalScope, io2, null, cVar, 2);
        BuildersKt.c(globalScope, getCoroutineContextProvider().getIo(), null, new e(this, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final me.oriient.internal.services.remoteLog.models.a generateBatchConfig() {
        return new me.oriient.internal.services.remoteLog.models.a(this.batchData.f25540a, getUrl(), this.batchData.b, this._options.getRetries(), this.batchData.d, this._options.getRequireCharger(), this._options.getAllowMeteredNetworks());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b generateNewBatchData() {
        long millis;
        SendingSchedule sendingSchedule = this._options.getSendingSchedule();
        if (sendingSchedule instanceof g) {
            millis = System.currentTimeMillis();
        } else {
            if (!(sendingSchedule instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            SendingSchedule sendingSchedule2 = this._options.getSendingSchedule();
            Intrinsics.f(sendingSchedule2, "null cannot be cast to non-null type me.oriient.internal.services.remoteLog.SendingSchedule.Interval");
            h hVar = (h) sendingSchedule2;
            millis = jCurrentTimeMillis + hVar.b.toMillis(hVar.f25538a);
        }
        b bVar = new b(millis);
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("RemoteLog", "new batch - " + this.batchData);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DatabaseService getDatabaseService() {
        return (DatabaseService) this.databaseService.getD();
    }

    private final CoroutineContext getInsertCoroutineContext() {
        return (CoroutineContext) this.insertCoroutineContext.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return RemoteLoggerFactory.INSTANCE.getLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkManager getNetworkManager() {
        return (NetworkManager) this.networkManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e getRemoteLogManager() {
        return (e) this.remoteLogManager.getD();
    }

    private final RestService getRestService() {
        return (RestService) this.restService.getD();
    }

    private final Scheduler getScheduler() {
        return (Scheduler) this.scheduler.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleWithWorkManager() {
        me.oriient.internal.services.remoteLog.a aVar = e.Companion;
        boolean requireCharger = this._options.getRequireCharger();
        boolean allowMeteredNetworks = this._options.getAllowMeteredNetworks();
        aVar.getClass();
        String strConcat = (allowMeteredNetworks ? "yesMetered" : "noMetered").concat(requireCharger ? "yesCharger" : "noCharger");
        Intrinsics.g(strConcat, "toString(...)");
        String asWorkTag = ScheduleOptionsKt.getAsWorkTag(strConcat);
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("RemoteLog", "scheduling idle task for " + ((Object) WorkTag.m367toStringimpl(asWorkTag)));
        }
        getScheduler().mo361schedulePsKNH0(asWorkTag, f.class, new ScheduleOptions(this._options.getAllowMeteredNetworks(), this._options.getRequireCharger(), ExistingWorkPolicy.KEEP_EXISTING_AND_DO_NOTHING));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trySendingBatchInternal(Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(getCoroutineContextProvider().getIo(), new k(this, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object trySendingMessagesInternal(Continuation<? super Unit> continuation) {
        if (((Boolean) getNetworkManager().isConnected().getValue()).booleanValue()) {
            return BuildersKt.f(getCoroutineContextProvider().getIo(), new l(this, null), continuation);
        }
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("RemoteLog", "trySendingMessagesInternal: scheduling");
        }
        scheduleWithWorkManager();
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLog
    @Nullable
    public Object clearAllLogs(double d, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(getCoroutineContextProvider().getIo(), new f(this, d, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLog
    public void configure(@NotNull Function1<? super InstanceOptions, Unit> block) {
        Intrinsics.h(block, "block");
        BuildersKt.c(GlobalScope.d, getInsertCoroutineContext(), null, new g(this, block, null), 2);
    }

    @NotNull
    public final RemoteLogOptions getOptions() {
        return this._options;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLog
    @NotNull
    public String getUrl() {
        return this.url;
    }

    @Override // me.oriient.internal.services.remoteLog.RemoteLog
    @Nullable
    public Object sendMessage(@NotNull Map<String, ? extends Object> map, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Logger logger = getLogger();
        if (logger != null) {
            logger.d("RemoteLog", "sendMessage() called with: messageData = [" + map + ']');
        }
        boolean zIsEmpty = map.isEmpty();
        Unit unit = Unit.f24250a;
        if (!zIsEmpty) {
            Object objF = BuildersKt.f(getInsertCoroutineContext(), new j(this, map, null), continuation);
            return objF == CoroutineSingletons.d ? objF : unit;
        }
        Logger logger2 = getLogger();
        if (logger2 != null) {
            logger2.e("RemoteLog", "Not sending messages with empty data");
        }
        return unit;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemoteLogImpl(@NotNull String url, @NotNull Function1<? super InstanceOptions, Unit> block) {
        this(url);
        Intrinsics.h(url, "url");
        Intrinsics.h(block, "block");
        configure(block);
    }

    public /* synthetic */ RemoteLogImpl(String str, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? a.h : function1);
    }
}
