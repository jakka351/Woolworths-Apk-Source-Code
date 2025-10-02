package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploadManagerFactory;", "", "itemsUploaded", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "getItemsUploaded", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "createUploadManager", "Lme/oriient/internal/services/uploadingManager/DataUploadManager;", "chunkFileHeader", "", "dataType", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataUploadManagerFactory {
    @NotNull
    DataUploadManager createUploadManager(@Nullable byte[] chunkFileHeader, @NotNull DataUploaderDataType dataType);

    @NotNull
    MutableSharedFlow<DataUploaderItem> getItemsUploaded();
}
