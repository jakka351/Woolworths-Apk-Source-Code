package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.realtime.database.tagging.DBTag;
import me.oriient.ipssdk.realtime.database.tagging.DBTagQueries;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabaseImpl;

/* loaded from: classes8.dex */
public final class G1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25943a;
    public final /* synthetic */ EventTaggingDatabaseImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(long j, EventTaggingDatabaseImpl eventTaggingDatabaseImpl) {
        super(1);
        this.f25943a = j;
        this.b = eventTaggingDatabaseImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DBTagQueries queries = (DBTagQueries) obj;
        Intrinsics.h(queries, "queries");
        List<DBTag> listExecuteAsList = queries.getBatch(this.f25943a).executeAsList();
        EventTaggingDatabaseImpl eventTaggingDatabaseImpl = this.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(listExecuteAsList, 10));
        Iterator<T> it = listExecuteAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(EventTaggingDatabaseImpl.access$dbToTag(eventTaggingDatabaseImpl, (DBTag) it.next()));
        }
        return new Outcome.Success(arrayList);
    }
}
