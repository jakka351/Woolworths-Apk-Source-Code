package me.oriient.internal.services.remoteLog;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u00020\u00072\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0002\b\u000fH&J\"\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012H¦@¢\u0006\u0002\u0010\u0014R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/remoteLog/RemoteLog;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "url", "", "getUrl", "()Ljava/lang/String;", "clearAllLogs", "", "exceptLastMinutes", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configure", "block", "Lkotlin/Function1;", "Lme/oriient/internal/services/remoteLog/InstanceOptions;", "Lkotlin/ExtensionFunctionType;", "sendMessage", "messageData", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RemoteLog extends DiProvidable {
    @Nullable
    Object clearAllLogs(double d, @NotNull Continuation<? super Unit> continuation);

    void configure(@NotNull Function1<? super InstanceOptions, Unit> block);

    @NotNull
    String getUrl();

    @Nullable
    Object sendMessage(@NotNull Map<String, ? extends Object> map, @NotNull Continuation<? super Unit> continuation);
}
