package me.oriient.internal.services.dataManager.preloading;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.internal.services.elog.ELog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=\nB)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000f\u0010\rJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManagerImpl;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager;", "", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "", "universalDataPreloaders", "", "buildingPreloader", "<init>", "(Ljava/util/List;Lme/oriient/internal/services/dataManager/preloading/DataPreloader;)V", "Lme/oriient/internal/services/dataManager/preloading/n;", "task", "preloadDataImpl", "(Lme/oriient/internal/services/dataManager/preloading/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPreloadingTask", "sendTaskUpdate", "buildingId", "Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatus;", "getPreloadingStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preloadData", "(Ljava/lang/String;)V", "cancelPreloading", "cancelAllPreloadingProcesses", "()V", "Ljava/util/List;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloader;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatusUpdate;", "preloadingStatusUpdates", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getPreloadingStatusUpdates", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingError;", "errors", "getErrors", "", "preloadingTasks", "Ljava/util/Map;", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "Lkotlin/Lazy;", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lkotlin/coroutines/CoroutineContext;", "preloadingTasksContext$delegate", "getPreloadingTasksContext", "()Lkotlin/coroutines/CoroutineContext;", "preloadingTasksContext", "Companion", "me/oriient/internal/services/dataManager/preloading/k", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataPreloadingManagerImpl implements DataPreloadingManager {

    @NotNull
    private static final k Companion = new k();

    @NotNull
    private static final String TAG = "DataPreloadingManager";

    @NotNull
    private final DataPreloader<String> buildingPreloader;

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    @NotNull
    private final MutableSharedFlow<DataPreloadingManager.PreloadingError> errors;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final MutableSharedFlow<DataPreloadingManager.PreloadingStatusUpdate> preloadingStatusUpdates;

    @NotNull
    private final Map<String, n> preloadingTasks;

    /* renamed from: preloadingTasksContext$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy preloadingTasksContext;

    @NotNull
    private final List<DataPreloader<Unit>> universalDataPreloaders;

    /* JADX WARN: Multi-variable type inference failed */
    public DataPreloadingManagerImpl(@NotNull List<? extends DataPreloader<Unit>> universalDataPreloaders, @NotNull DataPreloader<String> buildingPreloader) {
        Intrinsics.h(universalDataPreloaders, "universalDataPreloaders");
        Intrinsics.h(buildingPreloader, "buildingPreloader");
        this.universalDataPreloaders = universalDataPreloaders;
        this.buildingPreloader = buildingPreloader;
        this.preloadingStatusUpdates = UtilsKt.EventFlow();
        this.errors = UtilsKt.EventFlow();
        this.preloadingTasks = new LinkedHashMap();
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.coroutineContextProvider = di.inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.logger = InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.preloadingTasksContext = LazyKt.b(new z(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object cancelPreloadingTask(n nVar, Continuation<? super Unit> continuation) {
        getLogger().d(TAG, "cancelPreloadingTask() called with: task = " + nVar);
        Job job = nVar.b;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        nVar.b = null;
        if (o.$EnumSwitchMapping$0[nVar.c.ordinal()] == 1) {
            m mVar = m.FAILED;
            Intrinsics.h(mVar, "<set-?>");
            nVar.c = mVar;
            Object objSendTaskUpdate = sendTaskUpdate(nVar, continuation);
            if (objSendTaskUpdate == CoroutineSingletons.d) {
                return objSendTaskUpdate;
            }
        }
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineContext getPreloadingTasksContext() {
        return (CoroutineContext) this.preloadingTasksContext.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object preloadDataImpl(n nVar, Continuation<? super Unit> continuation) {
        getLogger().d(TAG, "preloadDataImpl() called with: task = " + nVar);
        Object objC = CoroutineScopeKt.c(new y(this, nVar, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendTaskUpdate(n nVar, Continuation<? super Unit> continuation) {
        Object objEmit = getPreloadingStatusUpdates().emit(new DataPreloadingManager.PreloadingStatusUpdate(nVar.f25378a, nVar.c.toPreloadingStatus()), continuation);
        return objEmit == CoroutineSingletons.d ? objEmit : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloadingManager
    public void cancelAllPreloadingProcesses() {
        getLogger().d(TAG, "cancelAllPreloadingProcesses() called");
        BuildersKt.c(CoroutineScopeKt.a(getPreloadingTasksContext()), null, null, new p(this, null), 3);
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloadingManager
    public void cancelPreloading(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        getLogger().d(TAG, "cancelPreloading() called with: buildingId = ".concat(buildingId));
        BuildersKt.c(CoroutineScopeKt.a(getPreloadingTasksContext()), null, null, new q(this, buildingId, null), 3);
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloadingManager
    @Nullable
    public Object getPreloadingStatus(@NotNull String str, @NotNull Continuation<? super DataPreloadingManager.PreloadingStatus> continuation) {
        return BuildersKt.f(getPreloadingTasksContext(), new r(this, str, null), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloadingManager
    public void preloadData(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        getLogger().d(TAG, "preloadData() called with: buildingId = ".concat(buildingId));
        BuildersKt.c(CoroutineScopeKt.a(getPreloadingTasksContext()), null, null, new u(this, buildingId, null), 3);
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloadingManager
    @NotNull
    public MutableSharedFlow<DataPreloadingManager.PreloadingError> getErrors() {
        return this.errors;
    }

    @Override // me.oriient.internal.services.dataManager.preloading.DataPreloadingManager
    @NotNull
    public MutableSharedFlow<DataPreloadingManager.PreloadingStatusUpdate> getPreloadingStatusUpdates() {
        return this.preloadingStatusUpdates;
    }
}
