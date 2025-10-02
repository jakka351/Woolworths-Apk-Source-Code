package me.oriient.internal.services.dataManager;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.Exception;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.retryOperation.RetryExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u0003*\f\b\u0002\u0010\u0004*\u00060\u0005j\u0002`\u00062\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0007BT\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012=\u0010\f\u001a9\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r¢\u0006\u0002\u0010\u0013J\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00122\u0006\u0010\u0010\u001a\u00028\u0001H\u0096@¢\u0006\u0002\u0010\u001bJ\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00028\u00020\u00122\u0006\u0010\u001e\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u001bRG\u0010\f\u001a9\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lme/oriient/internal/services/dataManager/SimpleDataSource;", "DataType", "", "IdentifierType", "Failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lme/oriient/internal/services/dataManager/DataSource;", "tag", "", "retryRequestCount", "", "fetchData", "Lkotlin/Function2;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "id", "Lkotlin/coroutines/Continuation;", "Lme/oriient/internal/infra/utils/core/Outcome;", "(Ljava/lang/String;ILkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "logger", "Lme/oriient/internal/infra/utils/core/Logger;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheStatus", "Lme/oriient/internal/services/dataManager/CachedDataStatus;", "data", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SimpleDataSource<DataType, IdentifierType, Failure extends Exception> implements DataSource<DataType, IdentifierType, Failure> {

    @NotNull
    private final Function2<IdentifierType, Continuation<? super Outcome<DataType, Failure>>, Object> fetchData;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;
    private final int retryRequestCount;

    @NotNull
    private final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleDataSource(@NotNull String tag, int i, @NotNull Function2<? super IdentifierType, ? super Continuation<? super Outcome<DataType, Failure>>, ? extends Object> fetchData) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(fetchData, "fetchData");
        this.tag = tag;
        this.retryRequestCount = i;
        this.fetchData = fetchData;
        this.logger = InternalDiKt.getDi().inject(Reflection.f24268a.b(Logger.class));
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    @Override // me.oriient.internal.services.dataManager.DataSource
    @Nullable
    public Object fetchData(IdentifierType identifiertype, @NotNull Continuation<? super Outcome<DataType, Failure>> continuation) {
        return RetryExtensionsKt.retryTo$default(this.tag, "simple-source-fetch-" + this.tag, getLogger(), this.retryRequestCount, 0L, 0L, 0.0d, new d0(this, identifiertype, null), continuation, 112, null);
    }

    @Override // me.oriient.internal.services.dataManager.DataSource
    @Nullable
    public Object getCacheStatus(@NotNull DataType datatype, @NotNull Continuation<? super Outcome<CachedDataStatus, Failure>> continuation) {
        return new Outcome.Success(CachedDataStatus.VALID);
    }
}
