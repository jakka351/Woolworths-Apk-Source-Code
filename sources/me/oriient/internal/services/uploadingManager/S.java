package me.oriient.internal.services.uploadingManager;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.database.DbUploadItem;

/* loaded from: classes7.dex */
public final class S extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DbUploadItem f25627a;
    public final /* synthetic */ Exception b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(DbUploadItem dbUploadItem, Exception exc) {
        super(0);
        this.f25627a = dbUploadItem;
        this.b = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("sessionId", this.f25627a.getSessionId()), new Pair("chunkId", this.f25627a.getId()), new Pair("dataType", this.f25627a.getDataType()), new Pair("metadataSize", Integer.valueOf(this.f25627a.getMetadata().length)), new Pair("errorMessage", this.b.getMessage()));
    }
}
