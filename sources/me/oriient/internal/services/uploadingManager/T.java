package me.oriient.internal.services.uploadingManager;

import java.io.IOException;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElement;
import me.oriient.internal.infra.serializerJson.JsonHelpersKt;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.serializerJson.JsonableMap;
import me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt;
import me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;

/* loaded from: classes7.dex */
public final class T extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataUploaderItemsStorageImpl f25628a;
    public final /* synthetic */ String b;
    public final /* synthetic */ DataUploaderItem c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl, String str, DataUploaderItem dataUploaderItem) {
        super(1);
        this.f25628a = dataUploaderItemsStorageImpl;
        this.b = str;
        this.c = dataUploaderItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        JsonableMap jsonableMap;
        JsonElement jsonElement;
        String strSerializeToJsonString;
        DbUploadItemQueries queries = (DbUploadItemQueries) obj;
        Intrinsics.h(queries, "queries");
        this.f25628a.validatePositionItem(this.b, this.c);
        String id = this.c.getId();
        String sessionId = this.c.getSessionId();
        String strValue = this.c.getDataType().getStrValue();
        boolean zIsLast = this.c.isLast();
        String endReason = this.c.getEndReason();
        String uploadFilename = this.c.getUploadFilename();
        String strName = this.c.getUploadingStatus().name();
        long bytesCount = this.c.getBytesCount();
        long stopTimeMillis = this.c.getStopTimeMillis();
        String compression = this.c.getCompression();
        byte[] byteArray = ByteArrayExtensionsKt.toByteArray(this.c.getMetadata());
        HashMap<String, Jsonable> clientMetadata = this.c.getClientMetadata();
        queries.upsertItem(id, sessionId, strValue, zIsLast, endReason, uploadFilename, strName, bytesCount, stopTimeMillis, compression, byteArray, (clientMetadata == null || (jsonableMap = JsonHelpersKt.toJsonableMap(clientMetadata)) == null || (jsonElement = jsonableMap.toJsonElement()) == null || (strSerializeToJsonString = JsonSerializationKt.serializeToJsonString(jsonElement)) == null) ? null : ByteArrayExtensionsKt.toByteArray(strSerializeToJsonString), this.c.getShouldBeUploaded());
        return Unit.f24250a;
    }
}
