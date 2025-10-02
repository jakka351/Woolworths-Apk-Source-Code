package me.oriient.internal.services.uploadingManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.uploadingManager.database.DbUploadItem;
import me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItemStatus;

/* loaded from: classes7.dex */
public final class N extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataUploaderDataType f25623a;
    public final /* synthetic */ DataUploaderItemStatus b;
    public final /* synthetic */ DataUploaderItemsStorageImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(DataUploaderDataType dataUploaderDataType, DataUploaderItemStatus dataUploaderItemStatus, DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl) {
        super(1);
        this.f25623a = dataUploaderDataType;
        this.b = dataUploaderItemStatus;
        this.c = dataUploaderItemsStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DbUploadItemQueries queries = (DbUploadItemQueries) obj;
        Intrinsics.h(queries, "queries");
        List<DbUploadItem> listExecuteAsList = queries.getItems(this.f25623a.getStrValue(), this.b.name()).executeAsList();
        DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl = this.c;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listExecuteAsList.iterator();
        while (it.hasNext()) {
            DataUploaderItem dataUploaderItem = dataUploaderItemsStorageImpl.toDataUploaderItem((DbUploadItem) it.next());
            if (dataUploaderItem != null) {
                arrayList.add(dataUploaderItem);
            }
        }
        return arrayList;
    }
}
