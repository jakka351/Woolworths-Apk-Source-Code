package me.oriient.ipssdk.realtime.debugInfo;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H&R$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/realtime/debugInfo/DebugInfoManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "debugInfo", "Lkotlinx/coroutines/flow/StateFlow;", "", "", "", "getDebugInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "clean", "", "onNewUploaderItem", "uploaderItem", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DebugInfoManager extends DiProvidable {
    void clean();

    @NotNull
    StateFlow<Map<String, Object>> getDebugInfo();

    boolean isEnabled();

    void onNewUploaderItem(@NotNull DataUploaderItem uploaderItem);

    void setEnabled(boolean z);
}
