package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt;
import me.oriient.ipssdk.realtime.database.tagging.DBTagQueries;
import me.oriient.ipssdk.realtime.services.tag.model.EventTagRecord;

/* loaded from: classes8.dex */
public final class I1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EventTagRecord f25955a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(EventTagRecord eventTagRecord) {
        super(1);
        this.f25955a = eventTagRecord;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DBTagQueries queries = (DBTagQueries) obj;
        Intrinsics.h(queries, "queries");
        queries.upsert(this.f25955a.getTag().getTimestamp(), ByteArrayExtensionsKt.toByteArray(this.f25955a.getTag()), this.f25955a.getStatus().getCode(), this.f25955a.getRetries(), this.f25955a.getSpaceId());
        return Unit.f24250a;
    }
}
