package me.oriient.internal.services.uploadingManager;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.database.DbUploadItem;
import me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries;

/* loaded from: classes7.dex */
public final class M extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25622a;
    public final /* synthetic */ DataUploaderItemsStorageImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(String str, DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl) {
        super(1);
        this.f25622a = str;
        this.b = dataUploaderItemsStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DbUploadItemQueries queries = (DbUploadItemQueries) obj;
        Intrinsics.h(queries, "queries");
        DbUploadItem dbUploadItemExecuteAsOneOrNull = queries.getItem(this.f25622a).executeAsOneOrNull();
        if (dbUploadItemExecuteAsOneOrNull != null) {
            return this.b.toDataUploaderItem(dbUploadItemExecuteAsOneOrNull);
        }
        return null;
    }
}
