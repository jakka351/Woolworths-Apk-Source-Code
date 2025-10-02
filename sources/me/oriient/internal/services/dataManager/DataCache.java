package me.oriient.internal.services.dataManager;

import androidx.annotation.Keep;
import java.lang.Exception;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\f\b\u0002\u0010\u0003*\u00060\u0004j\u0002`\u00052\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0001H¦@¢\u0006\u0002\u0010\fJ,\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00020\u000e2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00020\u000e2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/dataManager/DataCache;", "DataType", "IdentifierType", "Failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "clean", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanData", "id", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getData", "Lme/oriient/internal/infra/utils/core/Outcome;", "allowOutdated", "", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "data", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataCache<DataType, IdentifierType, Failure extends Exception> {
    @Nullable
    Object clean(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object cleanData(IdentifierType identifiertype, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getData(IdentifierType identifiertype, boolean z, @NotNull Continuation<? super Outcome<DataType, Failure>> continuation);

    @Nullable
    Object save(IdentifierType identifiertype, DataType datatype, @NotNull Continuation<? super Outcome<Unit, Failure>> continuation);
}
