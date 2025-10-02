package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElement;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.serializerJson.JsonHelpersKt;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.serializerJson.JsonableMap;
import me.oriient.internal.infra.serializerJson.JsonableString;
import me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.database.DbUploadItem;
import me.oriient.internal.services.uploadingManager.database.DbUploadItemQueries;
import me.oriient.internal.services.uploadingManager.database.UploadingSqlDatabase;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItemMetadata;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItemStatus;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSessionType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0082@¢\u0006\u0004\b\n\u0010\u000eJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b \u0010!J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b \u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)H\u0096@¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderItemsStorageImpl;", "Lme/oriient/internal/services/uploadingManager/DataUploaderItemsStorage;", "Lme/oriient/internal/services/uploadingManager/database/UploadingSqlDatabase;", "database", "<init>", "(Lme/oriient/internal/services/uploadingManager/database/UploadingSqlDatabase;)V", "Lkotlin/Function1;", "Lme/oriient/internal/services/uploadingManager/database/DbUploadItemQueries;", "", "toExecute", "execute", "(Lkotlin/jvm/functions/Function1;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "defaultValue", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/uploadingManager/database/DbUploadItem;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "toDataUploaderItem", "(Lme/oriient/internal/services/uploadingManager/database/DbUploadItem;)Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "", "callerMethod", "item", "validatePositionItem", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)V", "upsert", "id", "getItem", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionId", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "dataType", "", "getAllItems", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;", "uploadStatus", "getItems", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)V", "", "isEmpty", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "printStatus", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;)V", "Lme/oriient/internal/services/uploadingManager/database/UploadingSqlDatabase;", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lkotlinx/coroutines/CoroutineScope;", "databaseCoroutineScope$delegate", "getDatabaseCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "databaseCoroutineScope", "Companion", "me/oriient/internal/services/uploadingManager/E", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataUploaderItemsStorageImpl implements DataUploaderItemsStorage {

    @NotNull
    private static final E Companion = new E();

    @NotNull
    private static final String TAG = "DataUploaderItemsStorag";

    @NotNull
    private final UploadingSqlDatabase database;

    /* renamed from: databaseCoroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy databaseCoroutineScope;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    public DataUploaderItemsStorageImpl(@NotNull UploadingSqlDatabase database) {
        Intrinsics.h(database, "database");
        this.database = database;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.databaseCoroutineScope = LazyKt.b(F.f25615a);
    }

    private final void execute(Function1<? super DbUploadItemQueries, Unit> toExecute) {
        BuildersKt.c(getDatabaseCoroutineScope(), null, null, new H(toExecute, this, null), 3);
    }

    private final CoroutineScope getDatabaseCoroutineScope() {
        return (CoroutineScope) this.databaseCoroutineScope.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataUploaderItem toDataUploaderItem(DbUploadItem dbUploadItem) {
        DataUploaderDataType dataUploaderDataTypeFrom = DataUploaderDataType.INSTANCE.from(dbUploadItem.getDataType());
        HashMap<String, Jsonable> hashMap = null;
        if (dataUploaderDataTypeFrom == null) {
            return null;
        }
        try {
            DataUploaderItemMetadata dataUploaderItemMetadata = (DataUploaderItemMetadata) ByteArrayExtensionsKt.toSerializableObject(dbUploadItem.getMetadata());
            byte[] clientMetadata = dbUploadItem.getClientMetadata();
            if (clientMetadata != null) {
                try {
                    Jsonable jsonable = JsonHelpersKt.toJsonable((JsonElement) JsonSerializationKt.parseAsJson((String) ByteArrayExtensionsKt.toSerializableObject(clientMetadata), Reflection.b(JsonElement.class)));
                    JsonableMap jsonableMap = jsonable instanceof JsonableMap ? (JsonableMap) jsonable : null;
                    if (jsonableMap != null) {
                        hashMap = jsonableMap.toHashMap();
                    }
                } catch (Exception e) {
                    getLogger().e(TAG, "toDataUploaderItem: failed to parse client metadata", e);
                    getELog().e(TAG, "failed to parse client metadata", new Q(dbUploadItem, clientMetadata, e));
                    me.oriient.internal.services.uploadingManager.temp.a.a("Failed to decode session metadata: " + e.getMessage());
                }
            }
            HashMap<String, Jsonable> map = hashMap;
            String id = dbUploadItem.getId();
            String sessionId = dbUploadItem.getSessionId();
            long stopTimeMillis = dbUploadItem.getStopTimeMillis();
            long bytesCount = dbUploadItem.getBytesCount();
            String endReason = dbUploadItem.getEndReason();
            boolean zIsLast = dbUploadItem.isLast();
            DataUploaderItemStatus dataUploaderItemStatusFrom = DataUploaderItemStatus.INSTANCE.from(dbUploadItem.getUploadingStatus());
            if (dataUploaderItemStatusFrom == null) {
                dataUploaderItemStatusFrom = DataUploaderItemStatus.READY_FOR_ZIPPING;
            }
            return new DataUploaderItem(id, dataUploaderDataTypeFrom, sessionId, stopTimeMillis, bytesCount, endReason, zIsLast, dataUploaderItemStatusFrom, dbUploadItem.getUploadFilename(), dbUploadItem.getCompression(), dataUploaderItemMetadata, map, dbUploadItem.getShouldBeUploaded());
        } catch (Exception e2) {
            getLogger().e(TAG, "toDataUploaderItem: failed to parse metadata", e2);
            getELog().e(TAG, "failed to parse metadata", new S(dbUploadItem, e2));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePositionItem(String callerMethod, DataUploaderItem item) {
        JsonElement jsonElementM390toJsonElementimpl;
        JsonElement jsonElementM390toJsonElementimpl2;
        JsonElement jsonElementM390toJsonElementimpl3;
        if (item.getMetadata().getSessionType() != DataUploaderSessionType.POSITIONING) {
            return;
        }
        HashMap<String, Jsonable> clientMetadata = item.getClientMetadata();
        String strSerializeToJsonString = null;
        Jsonable jsonable = clientMetadata != null ? clientMetadata.get("mapId") : null;
        String value = jsonable instanceof JsonableString ? ((JsonableString) jsonable).getValue() : null;
        String strSerializeToJsonString2 = (value == null || (jsonElementM390toJsonElementimpl3 = JsonableString.m390toJsonElementimpl(value)) == null) ? null : JsonSerializationKt.serializeToJsonString(jsonElementM390toJsonElementimpl3);
        if (strSerializeToJsonString2 == null || StringsKt.D(strSerializeToJsonString2)) {
            ELog eLog = getELog();
            Pair pair = new Pair("callerMethod", callerMethod);
            Pair pair2 = new Pair("sessionId", item.getSessionId());
            Pair pair3 = new Pair("chunkNum", Integer.valueOf(item.getMetadata().getIndexInSession()));
            Pair pair4 = new Pair("chunkId", item.getId());
            Pair pair5 = new Pair("dataType", item.getDataType().getStrValue());
            Pair pair6 = new Pair("clientMetadataExists", Boolean.valueOf(clientMetadata != null));
            Pair pair7 = new Pair("mapId", strSerializeToJsonString2);
            Jsonable jsonable2 = clientMetadata != null ? clientMetadata.get("buildingId") : null;
            String value2 = jsonable2 instanceof JsonableString ? ((JsonableString) jsonable2).getValue() : null;
            Pair pair8 = new Pair("buildingId", (value2 == null || (jsonElementM390toJsonElementimpl2 = JsonableString.m390toJsonElementimpl(value2)) == null) ? null : JsonSerializationKt.serializeToJsonString(jsonElementM390toJsonElementimpl2));
            Jsonable jsonable3 = clientMetadata != null ? clientMetadata.get("floorId") : null;
            String value3 = jsonable3 instanceof JsonableString ? ((JsonableString) jsonable3).getValue() : null;
            if (value3 != null && (jsonElementM390toJsonElementimpl = JsonableString.m390toJsonElementimpl(value3)) != null) {
                strSerializeToJsonString = JsonSerializationKt.serializeToJsonString(jsonElementM390toJsonElementimpl);
            }
            eLog.e(TAG, "no mapId when inserting to db", MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("floorId", strSerializeToJsonString)));
        }
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderItemsStorage
    public void delete(@NotNull DataUploaderItem item) {
        Intrinsics.h(item, "item");
        execute(new G(item));
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderItemsStorage
    @Nullable
    public Object getAllItems(@NotNull String str, @NotNull DataUploaderDataType dataUploaderDataType, @NotNull Continuation<? super List<DataUploaderItem>> continuation) {
        return execute(EmptyList.d, new K(dataUploaderDataType, str, this), continuation);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderItemsStorage
    @Nullable
    public Object getItem(@NotNull String str, @NotNull Continuation<? super DataUploaderItem> continuation) {
        return execute(null, new M(str, this), continuation);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderItemsStorage
    @Nullable
    public Object getItems(@NotNull DataUploaderDataType dataUploaderDataType, @NotNull DataUploaderItemStatus dataUploaderItemStatus, @NotNull Continuation<? super List<DataUploaderItem>> continuation) {
        return execute(EmptyList.d, new N(dataUploaderDataType, dataUploaderItemStatus, this), continuation);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderItemsStorage
    @Nullable
    public Object isEmpty(@NotNull Continuation<? super Boolean> continuation) {
        return execute(Boolean.FALSE, O.f25624a, continuation);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderItemsStorage
    public void printStatus(@NotNull DataUploaderDataType dataType) {
        Intrinsics.h(dataType, "dataType");
        execute(new P(this, dataType));
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderItemsStorage
    public void upsert(@NotNull String callerMethod, @NotNull DataUploaderItem item) {
        Intrinsics.h(callerMethod, "callerMethod");
        Intrinsics.h(item, "item");
        execute(new T(this, callerMethod, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object execute(T t, Function1<? super DbUploadItemQueries, ? extends T> function1, Continuation<? super T> continuation) {
        return BuildersKt.f(getDatabaseCoroutineScope().getE(), new J(function1, this, t, null), continuation);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploaderItemsStorage
    @Nullable
    public Object getAllItems(@NotNull DataUploaderDataType dataUploaderDataType, @NotNull Continuation<? super List<DataUploaderItem>> continuation) {
        return execute(EmptyList.d, new L(dataUploaderDataType, this), continuation);
    }
}
