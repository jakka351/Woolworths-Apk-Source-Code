package me.oriient.positioningengine.ondevice.util;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H&J4\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042 \u0010\r\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH&J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\bH&J<\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2 \u0010\r\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH&J$\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u000bH&J\b\u0010\u0018\u001a\u00020\u000bH&J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u001a"}, d2 = {"Lme/oriient/positioningengine/ondevice/util/EngineErrorHandler;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "engineErrorFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "", "getEngineErrorFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "isEngineOkay", "", "()Z", "handleEngineError", "", "message", "parametersAppender", "Lkotlin/Function1;", "", "", "sendLog", "handleEngineSignal", "signalName", "methodName", "stageNum", "", "handleTimestampIssue", "onEngineTerminated", "sendEngineLog", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface EngineErrorHandler extends DiProvidable {
    @NotNull
    SharedFlow<String> getEngineErrorFlow();

    void handleEngineError(@Nullable String message);

    void handleEngineError(@Nullable String message, @NotNull Function1<? super Map<String, Object>, Unit> parametersAppender);

    void handleEngineError(@Nullable String message, boolean sendLog);

    void handleEngineError(@Nullable String message, boolean sendLog, @NotNull Function1<? super Map<String, Object>, Unit> parametersAppender);

    void handleEngineSignal(@Nullable String signalName, @Nullable String methodName, int stageNum);

    void handleTimestampIssue();

    boolean isEngineOkay();

    void onEngineTerminated();

    void sendEngineLog(@NotNull String message);
}
