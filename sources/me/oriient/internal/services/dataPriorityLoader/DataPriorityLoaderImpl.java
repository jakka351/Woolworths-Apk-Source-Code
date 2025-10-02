package me.oriient.internal.services.dataPriorityLoader;

import androidx.annotation.Keep;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Mapable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.DataRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\f\b\u0002\u0010\u0006*\u00060\u0004j\u0002`\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007B!\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\u0011\u001a\u00028\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00192\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R,\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00160'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lme/oriient/internal/services/dataPriorityLoader/DataPriorityLoaderImpl;", "DataType", "Lme/oriient/internal/infra/utils/core/Mapable;", "Identifier", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ErrorData", "Lme/oriient/internal/services/dataPriorityLoader/DataPriorityLoader;", "Lme/oriient/internal/services/dataManager/DataRepository;", "dataRepository", "<init>", "(Lme/oriient/internal/services/dataManager/DataRepository;)V", "", "jobsCount", "", "setupJobs", "(I)V", "id", "", "priority", "", "allowOutdated", "Lme/oriient/internal/services/dataPriorityLoader/n;", "createTask", "(Lme/oriient/internal/infra/utils/core/Mapable;DZ)Lme/oriient/internal/services/dataPriorityLoader/n;", "Lme/oriient/internal/infra/utils/core/Outcome;", "loadData", "(Lme/oriient/internal/infra/utils/core/Mapable;DZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/dataManager/DataRepository;", "Lkotlinx/coroutines/flow/Flow;", "maxConcurrent", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlinx/coroutines/Job;", "jobs", "Ljava/util/List;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/PriorityBlockingQueue;", "taskQueue", "Ljava/util/concurrent/PriorityBlockingQueue;", "shouldCancelAll", "Z", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public abstract class DataPriorityLoaderImpl<DataType, Identifier extends Mapable, ErrorData extends Exception> implements DataPriorityLoader<DataType, Identifier, ErrorData> {

    @NotNull
    private final DataRepository<DataType, Identifier, ErrorData> dataRepository;

    @NotNull
    private final List<Job> jobs;

    @NotNull
    private final Flow<Integer> maxConcurrent;

    @NotNull
    private final CoroutineScope scope;
    private boolean shouldCancelAll;

    @NotNull
    private final PriorityBlockingQueue<n> taskQueue;

    public DataPriorityLoaderImpl(@NotNull DataRepository<DataType, Identifier, ErrorData> dataRepository) {
        Intrinsics.h(dataRepository, "dataRepository");
        this.dataRepository = dataRepository;
        this.maxConcurrent = new m(((InternalConfigManager) InternalDiKt.getDi().get(Reflection.f24268a.b(InternalConfigManager.class))).getConfig());
        this.jobs = new ArrayList();
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
        this.scope = contextScopeA;
        this.taskQueue = new PriorityBlockingQueue<>();
        BuildersKt.c(contextScopeA, null, null, new e(this, null), 3);
    }

    private final n createTask(Identifier id, double priority, boolean allowOutdated) {
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(o.WAITING);
        return new n(id, priority, FlowKt.B(new g(mutableStateFlowA, this, id, allowOutdated, null)), mutableStateFlowA);
    }

    public static /* synthetic */ n createTask$default(DataPriorityLoaderImpl dataPriorityLoaderImpl, Mapable mapable, double d, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTask");
        }
        if ((i & 2) != 0) {
            d = 0.0d;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return dataPriorityLoaderImpl.createTask(mapable, d, z);
    }

    public static <DataType, Identifier extends Mapable, ErrorData extends Exception> Object loadData$suspendImpl(DataPriorityLoaderImpl<DataType, Identifier, ErrorData> dataPriorityLoaderImpl, Identifier identifier, double d, boolean z, Continuation<? super Outcome<DataType, ErrorData>> continuation) {
        n nVarCreateTask = dataPriorityLoaderImpl.createTask(identifier, d, z);
        ((DataPriorityLoaderImpl) dataPriorityLoaderImpl).taskQueue.put(nVarCreateTask);
        return FlowKt.w(nVarCreateTask.c, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupJobs(int jobsCount) {
        for (int i = 0; i < jobsCount; i++) {
            this.jobs.add(BuildersKt.c(this.scope, null, null, new j(this, null), 3));
        }
    }

    @Override // me.oriient.internal.services.dataPriorityLoader.DataPriorityLoader
    @Nullable
    public Object loadData(@NotNull Identifier identifier, double d, boolean z, @NotNull Continuation<? super Outcome<DataType, ErrorData>> continuation) {
        return loadData$suspendImpl(this, identifier, d, z, continuation);
    }
}
