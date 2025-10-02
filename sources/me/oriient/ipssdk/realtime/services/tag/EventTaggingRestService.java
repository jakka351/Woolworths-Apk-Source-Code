package me.oriient.ipssdk.realtime.services.tag;

import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.services.tag.model.TagRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/EventTaggingRestService;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "sendTagData", "", "tagRequest", "Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest;", "user", "Lme/oriient/ipssdk/base/auth/User;", "userSessionId", "Lme/oriient/ipssdk/common/utils/runtimedata/UserSessionId;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", "sendTagData-q7C-U6k", "(Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest;Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendTagDataJava", "sendTagDataJava-9ntpYrY", "(Lme/oriient/ipssdk/realtime/services/tag/model/TagRequest;Lme/oriient/ipssdk/base/auth/User;Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;)V", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface EventTaggingRestService extends DiProvidable {
    @Nullable
    /* renamed from: sendTagData-q7C-U6k, reason: not valid java name */
    Object mo475sendTagDataq7CU6k(@NotNull TagRequest tagRequest, @NotNull User user, @NotNull String str, @NotNull IPSCompletionListener iPSCompletionListener, @NotNull Continuation<? super Unit> continuation);

    /* renamed from: sendTagDataJava-9ntpYrY, reason: not valid java name */
    void mo476sendTagDataJava9ntpYrY(@NotNull TagRequest tagRequest, @NotNull User user, @NotNull String userSessionId, @NotNull IPSCompletionListener listener);
}
