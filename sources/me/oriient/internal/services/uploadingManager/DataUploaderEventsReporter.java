package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&J@\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&¨\u0006\r"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderEventsReporter;", "", "reportEvent", "", "tag", "", "message", "item", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "additionalData", "", "reportFailure", "error", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataUploaderEventsReporter {
    void reportEvent(@NotNull String tag, @NotNull String message, @NotNull DataUploaderItem item, @NotNull Map<String, ? extends Object> additionalData);

    void reportFailure(@NotNull String tag, @NotNull String message, @NotNull DataUploaderItem item, @NotNull String error, @NotNull Map<String, ? extends Object> additionalData);
}
