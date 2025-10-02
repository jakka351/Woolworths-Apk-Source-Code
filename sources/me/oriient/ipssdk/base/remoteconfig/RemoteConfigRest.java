package me.oriient.ipssdk.base.remoteconfig;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.base.remoteconfig.responses.RemoteConfigResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigRest;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "fetchRemoteConfig", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lkotlin/Pair;", "", "Lme/oriient/ipssdk/base/remoteconfig/responses/RemoteConfigResponse;", "Lme/oriient/internal/infra/utils/core/OriientError;", "user", "Lme/oriient/ipssdk/base/auth/User;", "(Lme/oriient/ipssdk/base/auth/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RemoteConfigRest extends DiProvidable {
    @Nullable
    Object fetchRemoteConfig(@NotNull User user, @NotNull Continuation<? super Outcome<Pair<String, RemoteConfigResponse>, OriientError>> continuation);
}
