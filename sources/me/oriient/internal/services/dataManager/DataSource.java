package me.oriient.internal.services.dataManager;

import androidx.annotation.Keep;
import java.lang.Exception;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\f\b\u0002\u0010\u0003*\u00060\u0004j\u0002`\u00052\u00020\u0006J\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H¦@¢\u0006\u0002\u0010\nJ\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\n¨\u0006\u000e"}, d2 = {"Lme/oriient/internal/services/dataManager/DataSource;", "DataType", "IdentifierType", "Failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "fetchData", "Lme/oriient/internal/infra/utils/core/Outcome;", "id", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheStatus", "Lme/oriient/internal/services/dataManager/CachedDataStatus;", "data", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataSource<DataType, IdentifierType, Failure extends Exception> {
    @Nullable
    Object fetchData(IdentifierType identifiertype, @NotNull Continuation<? super Outcome<DataType, Failure>> continuation);

    @Nullable
    Object getCacheStatus(DataType datatype, @NotNull Continuation<? super Outcome<CachedDataStatus, Failure>> continuation);
}
