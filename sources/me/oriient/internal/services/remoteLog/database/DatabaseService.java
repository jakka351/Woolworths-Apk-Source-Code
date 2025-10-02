package me.oriient.internal.services.remoteLog.database;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.remoteLog.models.a;
import me.oriient.internal.services.remoteLog.models.d;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\r\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\u0012\u00060\u000bj\u0002`\f0\t2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u0017\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\b\u0012\u00060\u000bj\u0002`\f0\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\u001f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n\u0012\b\u0012\u00060\u000bj\u0002`\f0\t2\u0006\u0010\u001d\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0012J \u0010!\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\b\u0012\u00060\u000bj\u0002`\f0\tH¦@¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020 H¦@¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H¦@¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lme/oriient/internal/services/remoteLog/database/DatabaseService;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "Lme/oriient/internal/services/remoteLog/models/a;", MlModel.MODEL_FILE_SUFFIX, "", "upsertBatch", "(Lme/oriient/internal/services/remoteLog/models/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "time", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getBatchesPassedTime", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/remoteLog/models/c;", "id", "removeBatch-eK7Yl6k", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeBatch", "", "charging", "metered", "getScheduledBatches", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/remoteLog/models/d;", "messageData", "upsertMessage", "(Lme/oriient/internal/services/remoteLog/models/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "batchId", "getMessages-eK7Yl6k", "getMessages", "", "countMessages", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "numToDelete", "removeOldestMessages", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "exceptLastMinutes", "clearDb", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DatabaseService extends DiProvidable {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object removeOldestMessages$default(DatabaseService databaseService, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeOldestMessages");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return databaseService.removeOldestMessages(i, continuation);
        }
    }

    @Nullable
    Object clearDb(double d, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object countMessages(@NotNull Continuation<? super Outcome<Integer, Exception>> continuation);

    @Nullable
    Object getBatchesPassedTime(long j, @NotNull Continuation<? super Outcome<List<a>, Exception>> continuation);

    @Nullable
    /* renamed from: getMessages-eK7Yl6k, reason: not valid java name */
    Object mo394getMessageseK7Yl6k(@NotNull String str, @NotNull Continuation<? super Outcome<List<d>, Exception>> continuation);

    @Nullable
    Object getScheduledBatches(boolean z, boolean z2, @NotNull Continuation<? super Outcome<List<a>, Exception>> continuation);

    @Nullable
    /* renamed from: removeBatch-eK7Yl6k, reason: not valid java name */
    Object mo395removeBatcheK7Yl6k(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object removeOldestMessages(int i, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object upsertBatch(@NotNull a aVar, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object upsertMessage(@NotNull d dVar, @NotNull Continuation<? super Unit> continuation);
}
