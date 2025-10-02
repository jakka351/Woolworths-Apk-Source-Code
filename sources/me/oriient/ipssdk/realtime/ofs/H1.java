package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.realtime.database.tagging.DBTagQueries;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabaseImpl;

/* loaded from: classes8.dex */
public final class H1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25949a;
    public final /* synthetic */ EventTaggingDatabaseImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(long j, EventTaggingDatabaseImpl eventTaggingDatabaseImpl) {
        super(1);
        this.f25949a = j;
        this.b = eventTaggingDatabaseImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DBTagQueries queries = (DBTagQueries) obj;
        Intrinsics.h(queries, "queries");
        queries.delete(this.f25949a);
        Logger logger = this.b.b;
        if (logger != null) {
            logger.d("EventTaggingDatabase", android.support.v4.media.session.a.l(this.f25949a, " removed", new StringBuilder("Tag ")));
        }
        return Unit.f24250a;
    }
}
