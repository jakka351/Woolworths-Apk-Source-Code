package me.oriient.internal.services.dataManager;

import androidx.annotation.Keep;
import java.lang.Exception;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Mapable;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u0003*\f\b\u0002\u0010\u0004*\u00060\u0005j\u0002`\u00062\u00020\u0007J\u000e\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0001H¦@¢\u0006\u0002\u0010\rJ*\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0001H¦@¢\u0006\u0002\u0010\rJ\u0015\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0015J*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lme/oriient/internal/services/dataManager/DataRepository;", "DataType", "IdentifierType", "Lme/oriient/internal/infra/utils/core/Mapable;", "Failure", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "cleanCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanData", "id", "(Lme/oriient/internal/infra/utils/core/Mapable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getData", "Lme/oriient/internal/infra/utils/core/Outcome;", "allowOutdated", "", "(Lme/oriient/internal/infra/utils/core/Mapable;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshData", "refreshDataInBackground", "(Lme/oriient/internal/infra/utils/core/Mapable;)V", "saveData", "data", "(Lme/oriient/internal/infra/utils/core/Mapable;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataRepository<DataType, IdentifierType extends Mapable, Failure extends Exception> extends DiProvidable {
    @Nullable
    Object cleanCache(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object cleanData(@NotNull IdentifierType identifiertype, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getData(@NotNull IdentifierType identifiertype, boolean z, @NotNull Continuation<? super Outcome<DataType, Failure>> continuation);

    @Nullable
    Object refreshData(@NotNull IdentifierType identifiertype, @NotNull Continuation<? super Outcome<DataType, Failure>> continuation);

    void refreshDataInBackground(@NotNull IdentifierType id);

    @Nullable
    Object saveData(@NotNull IdentifierType identifiertype, DataType datatype, @NotNull Continuation<? super Outcome<Unit, Failure>> continuation);
}
