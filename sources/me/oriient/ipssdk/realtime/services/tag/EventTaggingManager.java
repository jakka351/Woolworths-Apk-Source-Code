package me.oriient.ipssdk.realtime.services.tag;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.realtime.services.tag.model.EventTag;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/EventTaggingManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "init", "", "sendTag", "eventTag", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTag;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface EventTaggingManager extends DiProvidable {
    void init();

    void sendTag(@NotNull EventTag eventTag, @NotNull IPSCompletionListener listener);
}
