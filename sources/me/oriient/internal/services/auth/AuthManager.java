package me.oriient.internal.services.auth;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0013\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/auth/AuthManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "credentials", "Lkotlinx/coroutines/flow/StateFlow;", "Lme/oriient/internal/services/auth/Credentials;", "getCredentials", "()Lkotlinx/coroutines/flow/StateFlow;", "login", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/services/auth/Space;", "Lme/oriient/internal/infra/utils/core/OriientError;", "apiKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSpaceId", "spaceId", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AuthManager extends DiProvidable {
    @NotNull
    StateFlow<Credentials> getCredentials();

    @Nullable
    Object login(@NotNull String str, @NotNull Continuation<? super Outcome<List<Space>, OriientError>> continuation);

    @Nullable
    Object logout(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setSpaceId(@NotNull String str, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation);
}
