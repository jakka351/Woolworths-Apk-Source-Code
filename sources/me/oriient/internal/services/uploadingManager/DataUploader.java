package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0014\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH¦@¢\u0006\u0002\u0010\u001bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploader;", "", "currentSessionId", "", "getCurrentSessionId", "()Ljava/lang/String;", "setCurrentSessionId", "(Ljava/lang/String;)V", "itemUploadingFailed", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlin/Pair;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "getItemUploadingFailed", "()Lkotlinx/coroutines/flow/SharedFlow;", "itemUploadingFinished", "getItemUploadingFinished", "sendUploadingStartRequest", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "item", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadEverything", "scheduledWork", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "uploadTrigger", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataUploader {
    @Nullable
    String getCurrentSessionId();

    @NotNull
    SharedFlow<Pair<DataUploaderItem, String>> getItemUploadingFailed();

    @NotNull
    SharedFlow<DataUploaderItem> getItemUploadingFinished();

    @Nullable
    Object sendUploadingStartRequest(@NotNull DataUploaderItem dataUploaderItem, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation);

    void setCurrentSessionId(@Nullable String str);

    @Nullable
    Object uploadEverything(@NotNull DataUploadScheduledWork dataUploadScheduledWork, @NotNull DataUploadScheduler.UploadTrigger uploadTrigger, @NotNull Continuation<? super Unit> continuation);
}
