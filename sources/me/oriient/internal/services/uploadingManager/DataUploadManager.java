package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.uploadingManager.DataUploaderFilesManager;
import me.oriient.internal.services.uploadingManager.models.DataUploadManagerConfig;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;
import me.oriient.internal.services.uploadingManager.models.UploadableSample;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\tH&J\u001e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH¦@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH&J&\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001f2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!H&J-\u0010$\u001a\u00020\t2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H&¢\u0006\u0002\u0010'J&\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020*2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0018\u00010!H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006+"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploadManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/internal/services/uploadingManager/models/DataUploadManagerConfig;", "getConfig", "()Lme/oriient/internal/services/uploadingManager/models/DataUploadManagerConfig;", "setConfig", "(Lme/oriient/internal/services/uploadingManager/models/DataUploadManagerConfig;)V", "clearAllCaches", "", "exceptLastDays", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSpaceUsageStats", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager$FileManagerStats;", "moveCurrentSessionToUploading", "onUploadTrigger", "uploadTrigger", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "scheduledWork", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUploadingStartRequest", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/infra/utils/core/OriientError;", "session", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession;", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "stop", "reason", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSession$EndReason;", "updatedClientMetadata", "", "", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "updateClientMetadata", "newStopTimeMillis", "", "(Ljava/util/Map;Ljava/lang/Long;)V", "upload", "sample", "Lme/oriient/internal/services/uploadingManager/models/UploadableSample;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataUploadManager extends DiProvidable {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void updateClientMetadata$default(DataUploadManager dataUploadManager, Map map, Long l, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateClientMetadata");
            }
            if ((i & 2) != 0) {
                l = null;
            }
            dataUploadManager.updateClientMetadata(map, l);
        }
    }

    @Nullable
    Object clearAllCaches(double d, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    DataUploadManagerConfig getConfig();

    @NotNull
    DataUploaderFilesManager.FileManagerStats getSpaceUsageStats();

    void moveCurrentSessionToUploading();

    @Nullable
    Object onUploadTrigger(@NotNull DataUploadScheduler.UploadTrigger uploadTrigger, @NotNull DataUploadScheduledWork dataUploadScheduledWork, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendUploadingStartRequest(@NotNull DataUploaderSession dataUploaderSession, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation);

    void setConfig(@NotNull DataUploadManagerConfig dataUploadManagerConfig);

    void start(@NotNull DataUploaderSession session);

    void stop(@NotNull DataUploaderSession.EndReason reason, @Nullable Map<String, ? extends Jsonable> updatedClientMetadata);

    void updateClientMetadata(@NotNull Map<String, ? extends Jsonable> updatedClientMetadata, @Nullable Long newStopTimeMillis);

    void upload(@NotNull UploadableSample sample, @Nullable Map<String, ? extends Jsonable> updatedClientMetadata);
}
