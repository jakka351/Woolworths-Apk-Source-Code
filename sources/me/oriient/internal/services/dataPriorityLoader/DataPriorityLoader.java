package me.oriient.internal.services.dataPriorityLoader;

import androidx.annotation.Keep;
import java.lang.Exception;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Mapable;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u0003*\f\b\u0002\u0010\u0004*\u00060\u0005j\u0002`\u00062\u00020\u0007:\u0001\u0010J6\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\t2\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/services/dataPriorityLoader/DataPriorityLoader;", "DataType", "Identifier", "Lme/oriient/internal/infra/utils/core/Mapable;", "ErrorData", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "loadData", "Lme/oriient/internal/infra/utils/core/Outcome;", "id", "priority", "", "allowOutdated", "", "(Lme/oriient/internal/infra/utils/core/Mapable;DZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataPriorityLoader<DataType, Identifier extends Mapable, ErrorData extends Exception> extends DiProvidable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final double DEFAULT_LOADING_TASKS_PRIORITY = 0.0d;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/dataPriorityLoader/DataPriorityLoader$Companion;", "", "()V", "DEFAULT_LOADING_TASKS_PRIORITY", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final double DEFAULT_LOADING_TASKS_PRIORITY = 0.0d;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object loadData$default(DataPriorityLoader dataPriorityLoader, Mapable mapable, double d, boolean z, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadData");
            }
            if ((i & 2) != 0) {
                d = 0.0d;
            }
            double d2 = d;
            if ((i & 4) != 0) {
                z = true;
            }
            return dataPriorityLoader.loadData(mapable, d2, z, continuation);
        }
    }

    @Nullable
    Object loadData(@NotNull Identifier identifier, double d, boolean z, @NotNull Continuation<? super Outcome<DataType, ErrorData>> continuation);
}
