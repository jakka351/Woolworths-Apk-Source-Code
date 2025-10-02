package me.oriient.ipssdk.realtime.services.tag;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.realtime.ofs.P1;
import me.oriient.ipssdk.realtime.ofs.Q1;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"me/oriient/ipssdk/realtime/services/tag/EventTaggingManagerImpl$sendTagWithCachingFallback$2", "Lme/oriient/ipssdk/api/listeners/IPSCompletionListener;", "Lme/oriient/ipssdk/api/models/IPSError;", "error", "", "onError", "(Lme/oriient/ipssdk/api/models/IPSError;)V", "onCompleted", "()V", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EventTaggingManagerImpl$sendTagWithCachingFallback$2 implements IPSCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EventTaggingManagerImpl f26191a;
    final /* synthetic */ EventTagRecord b;

    public EventTaggingManagerImpl$sendTagWithCachingFallback$2(EventTaggingManagerImpl eventTaggingManagerImpl, EventTagRecord eventTagRecord) {
        this.f26191a = eventTaggingManagerImpl;
        this.b = eventTagRecord;
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSCompletionListener
    public void onCompleted() {
        BuildersKt.c(this.f26191a.h, null, null, new P1(this.f26191a, this.b, null), 3);
    }

    @Override // me.oriient.ipssdk.api.listeners.IPSFailable
    public void onError(@NotNull IPSError error) {
        Intrinsics.h(error, "error");
        BuildersKt.c(this.f26191a.h, null, null, new Q1(this.f26191a, this.b, null), 3);
    }
}
