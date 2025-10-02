package me.oriient.internal.services.websocket;

import androidx.annotation.Keep;
import java.net.URI;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/websocket/SocketProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "Ljava/net/URI;", "uri", "Lme/oriient/internal/services/websocket/e;", "getSocket", "(Ljava/net/URI;)Lme/oriient/internal/services/websocket/e;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SocketProvider extends DiProvidable {
    @NotNull
    e getSocket(@NotNull URI uri);
}
