package me.oriient.ipssdk.realtime.services.tag;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0003H¦@¢\u0006\u0002\u0010\bJ,\u0010\t\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u00032\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/EventTaggingDatabase;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "getAllTags", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagRecord;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTagsReadyToProcess", "limit", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeTag", "", "timestamp", "saveTag", "tagRecord", "(Lme/oriient/ipssdk/realtime/services/tag/model/EventTagRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface EventTaggingDatabase extends DiProvidable {
    @Nullable
    Object getAllTags(@NotNull Continuation<? super Outcome<List<EventTagRecord>, Exception>> continuation);

    @Nullable
    Object getTagsReadyToProcess(long j, @NotNull Continuation<? super Outcome<List<EventTagRecord>, Exception>> continuation);

    @Nullable
    Object removeTag(long j, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveTag(@NotNull EventTagRecord eventTagRecord, @NotNull Continuation<? super Unit> continuation);
}
