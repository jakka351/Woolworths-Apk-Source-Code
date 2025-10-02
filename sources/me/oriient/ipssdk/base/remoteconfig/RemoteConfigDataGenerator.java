package me.oriient.ipssdk.base.remoteconfig;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.base.auth.User;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigDataGenerator;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "generate", "Lme/oriient/ipssdk/base/remoteconfig/RemoteConfigAppData;", "user", "Lme/oriient/ipssdk/base/auth/User;", "sdkType", "", "me.oriient.sdk-base"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RemoteConfigDataGenerator extends DiProvidable {
    @NotNull
    RemoteConfigAppData generate(@NotNull User user, @NotNull String sdkType);
}
