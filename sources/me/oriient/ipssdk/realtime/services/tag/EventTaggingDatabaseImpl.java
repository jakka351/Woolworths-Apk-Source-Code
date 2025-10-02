package me.oriient.ipssdk.realtime.services.tag;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.ipssdk.realtime.database.TaggingSqlDatabase;
import me.oriient.ipssdk.realtime.database.tagging.DBTag;
import me.oriient.ipssdk.realtime.ofs.D1;
import me.oriient.ipssdk.realtime.ofs.E1;
import me.oriient.ipssdk.realtime.ofs.F1;
import me.oriient.ipssdk.realtime.ofs.G1;
import me.oriient.ipssdk.realtime.ofs.H1;
import me.oriient.ipssdk.realtime.ofs.I1;
import me.oriient.ipssdk.realtime.services.tag.model.EventTag;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord;
import me.oriient.ipssdk.realtime.services.tag.model.TagSendingStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0012\u00060\rj\u0002`\u000e0\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0017\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0012\u00060\rj\u0002`\u000e0\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/EventTaggingDatabaseImpl;", "Lme/oriient/ipssdk/realtime/services/tag/EventTaggingDatabase;", "Lme/oriient/ipssdk/realtime/database/TaggingSqlDatabase;", "database", "Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;", "coroutineContextProvider", "<init>", "(Lme/oriient/ipssdk/realtime/database/TaggingSqlDatabase;Lme/oriient/internal/infra/utils/core/Logger;Lme/oriient/internal/infra/utils/core/coroutines/CoroutineContextProvider;)V", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTagRecord;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getAllTags", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tagRecord", "", "saveTag", "(Lme/oriient/ipssdk/realtime/services/tag/model/EventTagRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "getTagsReadyToProcess", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestamp", "removeTag", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EventTaggingDatabaseImpl implements EventTaggingDatabase {

    /* renamed from: a, reason: collision with root package name */
    private final TaggingSqlDatabase f26189a;
    private final Logger b;
    private final CoroutineScope c;

    public EventTaggingDatabaseImpl(@NotNull TaggingSqlDatabase database, @Nullable Logger logger, @NotNull CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.h(database, "database");
        Intrinsics.h(coroutineContextProvider, "coroutineContextProvider");
        this.f26189a = database;
        this.b = logger;
        this.c = CoroutineScopeKt.a(coroutineContextProvider.newSingleThreadCoroutineContext());
    }

    public static final EventTagRecord access$dbToTag(EventTaggingDatabaseImpl eventTaggingDatabaseImpl, DBTag dBTag) {
        eventTaggingDatabaseImpl.getClass();
        return new EventTagRecord((EventTag) ByteArrayExtensionsKt.toSerializableObject(dBTag.getPayload()), dBTag.getSpaceId(), TagSendingStatus.INSTANCE.fromCode((int) dBTag.getStatus()), (int) dBTag.getRetries());
    }

    @Override // me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabase
    @Nullable
    public Object getAllTags(@NotNull Continuation<? super Outcome<List<EventTagRecord>, Exception>> continuation) {
        return BuildersKt.f(this.c.getE(), new E1(this, new F1(this), null), continuation);
    }

    @Override // me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabase
    @Nullable
    public Object getTagsReadyToProcess(long j, @NotNull Continuation<? super Outcome<List<EventTagRecord>, Exception>> continuation) {
        return BuildersKt.f(this.c.getE(), new E1(this, new G1(j, this), null), continuation);
    }

    @Override // me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabase
    @Nullable
    public Object removeTag(long j, @NotNull Continuation<? super Unit> continuation) {
        BuildersKt.c(this.c, null, null, new D1(this, new H1(j, this), null), 3);
        return Unit.f24250a;
    }

    @Override // me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabase
    @Nullable
    public Object saveTag(@NotNull EventTagRecord eventTagRecord, @NotNull Continuation<? super Unit> continuation) {
        BuildersKt.c(this.c, null, null, new D1(this, new I1(eventTagRecord), null), 3);
        return Unit.f24250a;
    }
}
