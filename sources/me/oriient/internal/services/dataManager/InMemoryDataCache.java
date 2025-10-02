package me.oriient.internal.services.dataManager;

import androidx.annotation.Keep;
import java.lang.Exception;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 4*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\f\b\u0002\u0010\u0005*\u00060\u0003j\u0002`\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006:\u000215B'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00020\u00152\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00020\u00152\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0001H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lme/oriient/internal/services/dataManager/InMemoryDataCache;", "DataType", "IdentifierType", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Failure", "Lme/oriient/internal/services/dataManager/DataCache;", "", "storageLimit", "storageCleanUpLimit", "", "expirationTimeMillis", "<init>", "(IILjava/lang/Long;)V", "", "cleanStorageIfNeeded", "()V", "id", "removeFromCache", "(Ljava/lang/Object;)V", "data", "Lme/oriient/internal/infra/utils/core/Outcome;", "save", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "allowOutdated", "getData", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clean", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "I", "Ljava/lang/Long;", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "Lkotlin/Lazy;", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "", "lock", "Ljava/lang/Object;", "", "Lme/oriient/internal/services/dataManager/a0;", "storage", "Ljava/util/Map;", "Companion", "me/oriient/internal/services/dataManager/b0", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InMemoryDataCache<DataType, IdentifierType, Failure extends Exception> implements DataCache<DataType, IdentifierType, Failure> {

    @NotNull
    private static final b0 Companion = new b0();

    @NotNull
    private static final String TAG = "InMemoryDataCache";

    @Nullable
    private final Long expirationTimeMillis;

    @NotNull
    private final Object lock;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    @NotNull
    private final Map<IdentifierType, a0> storage;
    private final int storageCleanUpLimit;
    private final int storageLimit;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    public InMemoryDataCache() {
        this(0, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cleanStorageIfNeeded() {
        if (this.storage.size() < this.storageLimit) {
            return;
        }
        getLogger().d(TAG, "cleanStorageIfNeeded: cache is full. cleaning");
        Iterator it = CollectionsKt.w0(CollectionsKt.u0(new c0(), this.storage.entrySet()), this.storageCleanUpLimit).iterator();
        while (it.hasNext()) {
            removeFromCache(((Map.Entry) it.next()).getKey());
        }
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    private final void removeFromCache(IdentifierType id) {
        getLogger().d(TAG, "removeFromCache() called with: id = " + id);
        this.storage.remove(id);
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    @Nullable
    public Object clean(@NotNull Continuation<? super Unit> continuation) {
        Unit unit;
        synchronized (this.lock) {
            this.storage.clear();
            unit = Unit.f24250a;
        }
        return unit;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    @Nullable
    public Object cleanData(IdentifierType identifiertype, @NotNull Continuation<? super Unit> continuation) {
        Unit unit;
        synchronized (this.lock) {
            removeFromCache(identifiertype);
            unit = Unit.f24250a;
        }
        return unit;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    @Nullable
    public Object getData(IdentifierType identifiertype, boolean z, @NotNull Continuation<? super Outcome<DataType, Failure>> continuation) {
        synchronized (this.lock) {
            a0 a0Var = this.storage.get(identifiertype);
            if (a0Var == null) {
                return new Outcome.Success(null);
            }
            a0Var.b = getTimeProvider().getCurrentTimeMillis();
            Long l = this.expirationTimeMillis;
            long j = a0Var.c;
            if (z || l == null || Math.abs(getTimeProvider().timeIntervalSinceNow(j)) <= l.longValue()) {
                return new Outcome.Success(a0Var.f25090a);
            }
            return new Outcome.Success(null);
        }
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    @Nullable
    public Object save(IdentifierType identifiertype, DataType datatype, @NotNull Continuation<? super Outcome<Unit, Failure>> continuation) {
        Outcome.Success success;
        synchronized (this.lock) {
            cleanStorageIfNeeded();
            long currentTimeMillis = getTimeProvider().getCurrentTimeMillis();
            this.storage.put(identifiertype, new a0(datatype, currentTimeMillis, currentTimeMillis));
            success = new Outcome.Success(Unit.f24250a);
        }
        return success;
    }

    public InMemoryDataCache(int i, int i2, @Nullable Long l) {
        this.storageLimit = i;
        this.storageCleanUpLimit = i2;
        this.expirationTimeMillis = l;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.timeProvider = di.inject(reflectionFactory.b(TimeProvider.class));
        this.logger = InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.lock = new Object();
        this.storage = new LinkedHashMap();
    }

    public /* synthetic */ InMemoryDataCache(int i, int i2, Long l, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i, (i3 & 2) != 0 ? 5 : i2, (i3 & 4) != 0 ? null : l);
    }
}
