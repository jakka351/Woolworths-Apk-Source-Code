package me.oriient.ipssdk.common.utils.runtimedata;

import androidx.annotation.Keep;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.base.auth.User;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0015\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lme/oriient/ipssdk/common/utils/runtimedata/CommonRuntimeDataProvider;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "getUser", "Lme/oriient/ipssdk/base/auth/User;", "getUserSessionId", "Lme/oriient/ipssdk/common/utils/runtimedata/UserSessionId;", "getUserSessionId-TZY0a_w", "()Ljava/lang/String;", "getUserSessionIdJava", "", "setUser", "", "user", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface CommonRuntimeDataProvider extends DiProvidable {
    @Nullable
    /* renamed from: getUser */
    User getF25787a();

    @NotNull
    /* renamed from: getUserSessionId-TZY0a_w, reason: not valid java name */
    String mo450getUserSessionIdTZY0a_w();

    @NotNull
    String getUserSessionIdJava();

    void setUser(@Nullable User user);
}
