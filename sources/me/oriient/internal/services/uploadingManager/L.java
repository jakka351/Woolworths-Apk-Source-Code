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

/* loaded from: classes7.dex */
public final class L extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataUploaderDataType f25621a;
    public final /* synthetic */ DataUploaderItemsStorageImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(DataUploaderDataType dataUploaderDataType, DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl) {
        super(1);
        this.f25621a = dataUploaderDataType;
        this.b = dataUploaderItemsStorageImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DbUploadItemQueries queries = (DbUploadItemQueries) obj;
        Intrinsics.h(queries, "queries");
        List<DbUploadItem> listExecuteAsList = queries.getAllDataTypeItems(this.f25621a.getStrValue()).executeAsList();
        DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl = this.b;
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
