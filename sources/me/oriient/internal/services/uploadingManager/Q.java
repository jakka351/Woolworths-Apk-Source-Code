package me.oriient.internal.services.uploadingManager;

import kotlin.ExceptionsKt;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import me.oriient.internal.services.uploadingManager.database.DbUploadItem;

/* loaded from: classes7.dex */
public final class Q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DbUploadItem f25626a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ Exception c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(DbUploadItem dbUploadItem, byte[] bArr, Exception exc) {
        super(0);
        this.f25626a = dbUploadItem;
        this.b = bArr;
        this.c = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("sessionId", this.f25626a.getSessionId()), new Pair("chunkId", this.f25626a.getId()), new Pair("dataType", this.f25626a.getDataType()), new Pair("clientMetadataSize", Integer.valueOf(this.b.length)), new Pair("errorMessage", StringsKt.g0(128, String.valueOf(this.c))), new Pair("errorType", this.c.getClass().getSimpleName()), new Pair("trace", StringsKt.g0(128, ExceptionsKt.b(this.c))));
    }
}
