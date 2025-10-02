package me.oriient.internal.services.dataManager;

import androidx.annotation.Keep;
import java.lang.Exception;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Mapable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.Metric;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 L*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\f\b\u0002\u0010\u0006*\u00060\u0004j\u0002`\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007:\u0001MBK\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u0001H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001f\u0010\u0016J,\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096@¢\u0006\u0004\b!\u0010\u001bJ\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00028\u0001H\u0096@¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b#\u0010\u001eJ$\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u0001H\u0096@¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b%\u0010&J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b'\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010CR2\u0010G\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00140F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lme/oriient/internal/services/dataManager/DataRepositoryImpl;", "DataType", "Lme/oriient/internal/infra/utils/core/Mapable;", "IdentifierType", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Failure", "Lme/oriient/internal/services/dataManager/DataRepository;", "", "tag", "dataTypeName", "Lme/oriient/internal/services/dataManager/DataCache;", "cache", "Lme/oriient/internal/services/dataManager/DataSource;", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/DataCache;Lme/oriient/internal/services/dataManager/DataSource;)V", "id", "", "allowOutdated", "Lme/oriient/internal/infra/utils/core/Outcome;", "getDataImpl", "(Lme/oriient/internal/infra/utils/core/Mapable;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchImpl", "(Lme/oriient/internal/infra/utils/core/Mapable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cachedData", "resolveDataStatus", "(Lme/oriient/internal/infra/utils/core/Mapable;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "refreshInBackground", "(Lme/oriient/internal/infra/utils/core/Mapable;)V", "getData", "data", "saveData", "cleanData", "refreshDataInBackground", "refreshData", "cleanCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchData", "Ljava/lang/String;", "Lme/oriient/internal/services/dataManager/DataCache;", "Lme/oriient/internal/services/dataManager/DataSource;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider$delegate", "getCoroutineContextProvider", "()Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/services/elog/Metric;", "metric$delegate", "getMetric", "()Lme/oriient/internal/services/elog/Metric;", "metric", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "", "Lkotlinx/coroutines/Deferred;", "pendingFetchRequests", "Ljava/util/Map;", "", "pendingFetchMapLock", "Ljava/lang/Object;", "Companion", "me/oriient/internal/services/dataManager/K", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataRepositoryImpl<DataType, IdentifierType extends Mapable, Failure extends Exception> implements DataRepository<DataType, IdentifierType, Failure> {

    @NotNull
    private static final K Companion = new K();

    @NotNull
    private static final String TAG = "DataRepository";

    @NotNull
    private final DataCache<DataType, IdentifierType, Failure> cache;

    /* renamed from: coroutineContextProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coroutineContextProvider;

    @NotNull
    private final String dataTypeName;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    /* renamed from: metric$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy metric;

    @NotNull
    private final Object pendingFetchMapLock;

    @NotNull
    private final Map<IdentifierType, Deferred<Outcome<DataType, Failure>>> pendingFetchRequests;

    @NotNull
    private final DataSource<DataType, IdentifierType, Failure> source;

    @NotNull
    private final String tag;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    public DataRepositoryImpl(@NotNull String tag, @NotNull String dataTypeName, @NotNull DataCache<DataType, IdentifierType, Failure> cache, @NotNull DataSource<DataType, IdentifierType, Failure> source) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(dataTypeName, "dataTypeName");
        Intrinsics.h(cache, "cache");
        Intrinsics.h(source, "source");
        this.tag = tag;
        this.dataTypeName = dataTypeName;
        this.cache = cache;
        this.source = source;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.coroutineContextProvider = InternalDiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.timeProvider = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.metric = InternalDiKt.getDi().inject(reflectionFactory.b(Metric.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.pendingFetchRequests = new LinkedHashMap();
        this.pendingFetchMapLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v7, types: [me.oriient.internal.infra.utils.core.Mapable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fetchImpl(IdentifierType r14, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<DataType, Failure>> r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.DataRepositoryImpl.fetchImpl(me.oriient.internal.infra.utils.core.Mapable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final CoroutineContextProvider getCoroutineContextProvider() {
        return (CoroutineContextProvider) this.coroutineContextProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getDataImpl(IdentifierType identifiertype, boolean z, Continuation<? super Outcome<DataType, Failure>> continuation) {
        return BuildersKt.f(getCoroutineContextProvider().getIo().plus(SupervisorKt.b()), new T(this, identifiertype, z, null), continuation);
    }

    private final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final Metric getMetric() {
        return (Metric) this.metric.getD();
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshInBackground(IdentifierType id) {
        BuildersKt.c(CoroutineScopeKt.a(getCoroutineContextProvider().getIo()), null, null, new V(this, id, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object resolveDataStatus(IdentifierType r7, DataType r8, kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<DataType, Failure>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof me.oriient.internal.services.dataManager.W
            if (r0 == 0) goto L13
            r0 = r9
            me.oriient.internal.services.dataManager.W r0 = (me.oriient.internal.services.dataManager.W) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.W r0 = new me.oriient.internal.services.dataManager.W
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r8 = r0.c
            me.oriient.internal.infra.utils.core.Mapable r7 = r0.b
            me.oriient.internal.services.dataManager.DataRepositoryImpl r2 = r0.f25086a
            kotlin.ResultKt.b(r9)
            goto L51
        L3c:
            kotlin.ResultKt.b(r9)
            me.oriient.internal.services.dataManager.DataSource<DataType, IdentifierType extends me.oriient.internal.infra.utils.core.Mapable, Failure extends java.lang.Exception> r9 = r6.source
            r0.f25086a = r6
            r0.b = r7
            r0.c = r8
            r0.f = r4
            java.lang.Object r9 = r9.getCacheStatus(r8, r0)
            if (r9 != r1) goto L50
            goto L67
        L50:
            r2 = r6
        L51:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.internal.services.dataManager.Y r4 = new me.oriient.internal.services.dataManager.Y
            r5 = 0
            r4.<init>(r2, r8, r7, r5)
            r0.f25086a = r5
            r0.b = r5
            r0.c = r5
            r0.f = r3
            java.lang.Object r7 = r9.then(r4, r0)
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.DataRepositoryImpl.resolveDataStatus(me.oriient.internal.infra.utils.core.Mapable, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.DataRepository
    @Nullable
    public Object cleanCache(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(getCoroutineContextProvider().getIo(), new L(this, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.DataRepository
    @Nullable
    public Object cleanData(@NotNull IdentifierType identifiertype, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(getCoroutineContextProvider().getIo(), new M(this, identifiertype, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Nullable
    public final Object fetchData(@NotNull IdentifierType identifiertype, @NotNull Continuation<? super Outcome<DataType, Failure>> continuation) {
        Deferred<Outcome<DataType, Failure>> deferred;
        synchronized (this.pendingFetchMapLock) {
            deferred = this.pendingFetchRequests.get(identifiertype);
        }
        if (deferred == null) {
            return CoroutineScopeKt.c(new O(this, identifiertype, null), continuation);
        }
        getLogger().d(TAG, "(" + this.dataTypeName + ") fetch request in progress. waiting on it...");
        return deferred.await(continuation);
    }

    @Override // me.oriient.internal.services.dataManager.DataRepository
    @Nullable
    public Object getData(@NotNull IdentifierType identifiertype, boolean z, @NotNull Continuation<? super Outcome<DataType, Failure>> continuation) {
        return getDataImpl(identifiertype, z, continuation);
    }

    @Override // me.oriient.internal.services.dataManager.DataRepository
    @Nullable
    public Object refreshData(@NotNull IdentifierType identifiertype, @NotNull Continuation<? super Outcome<DataType, Failure>> continuation) {
        return BuildersKt.f(getCoroutineContextProvider().getIo().plus(SupervisorKt.b()), new U(this, identifiertype, null), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.DataRepository
    public void refreshDataInBackground(@NotNull IdentifierType id) {
        Intrinsics.h(id, "id");
        refreshInBackground(id);
    }

    @Override // me.oriient.internal.services.dataManager.DataRepository
    @Nullable
    public Object saveData(@NotNull IdentifierType identifiertype, DataType datatype, @NotNull Continuation<? super Outcome<Unit, Failure>> continuation) {
        return BuildersKt.f(getCoroutineContextProvider().getIo(), new Z(this, identifiertype, datatype, null), continuation);
    }
}
