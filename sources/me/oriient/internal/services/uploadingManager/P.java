package me.oriient.internal.services.uploadingManager;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.database.DbUploadItem;
import me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;

/* loaded from: classes7.dex */
public final class P extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataUploaderItemsStorageImpl f25625a;
    public final /* synthetic */ DataUploaderDataType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl, DataUploaderDataType dataUploaderDataType) {
        super(1);
        this.f25625a = dataUploaderItemsStorageImpl;
        this.b = dataUploaderDataType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DbUploadItemQueries queries = (DbUploadItemQueries) obj;
        Intrinsics.h(queries, "queries");
        this.f25625a.getLogger().d("DataUploaderItemsStorag", "----- All saved items for " + this.b.getStrValue() + " -----");
        List<DbUploadItem> listExecuteAsList = queries.getAllDataTypeItems(this.b.getStrValue()).executeAsList();
        DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl = this.f25625a;
        for (DbUploadItem dbUploadItem : listExecuteAsList) {
            dataUploaderItemsStorageImpl.getLogger().d("DataUploaderItemsStorag", "Session: " + dbUploadItem.getSessionId() + " Id: " + dbUploadItem.getId() + " Status: " + dbUploadItem.getUploadingStatus() + " StopTime: " + dbUploadItem.getStopTimeMillis());
        }
        return Unit.f24250a;
    }
}
