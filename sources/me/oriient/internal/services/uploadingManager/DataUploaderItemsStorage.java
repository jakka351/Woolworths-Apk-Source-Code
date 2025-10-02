package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItemStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u0016H¦@¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u001b"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderItemsStorage;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "delete", "", "item", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "getAllItems", "", "sessionId", "", "dataType", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItem", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItems", "uploadStatus", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEmpty", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "printStatus", "upsert", "callerMethod", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataUploaderItemsStorage extends DiProvidable {
    void delete(@NotNull DataUploaderItem item);

    @Nullable
    Object getAllItems(@NotNull String str, @NotNull DataUploaderDataType dataUploaderDataType, @NotNull Continuation<? super List<DataUploaderItem>> continuation);

    @Nullable
    Object getAllItems(@NotNull DataUploaderDataType dataUploaderDataType, @NotNull Continuation<? super List<DataUploaderItem>> continuation);

    @Nullable
    Object getItem(@NotNull String str, @NotNull Continuation<? super DataUploaderItem> continuation);

    @Nullable
    Object getItems(@NotNull DataUploaderDataType dataUploaderDataType, @NotNull DataUploaderItemStatus dataUploaderItemStatus, @NotNull Continuation<? super List<DataUploaderItem>> continuation);

    @Nullable
    Object isEmpty(@NotNull Continuation<? super Boolean> continuation);

    void printStatus(@NotNull DataUploaderDataType dataType);

    void upsert(@NotNull String callerMethod, @NotNull DataUploaderItem item);
}
