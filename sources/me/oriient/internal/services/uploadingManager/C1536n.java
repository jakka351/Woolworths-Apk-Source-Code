package me.oriient.internal.services.uploadingManager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElement;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.powerManager.PowerManager;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.DataUploaderFilesManager;
import me.oriient.internal.services.uploadingManager.models.DataUploadManagerConfig;
import me.oriient.internal.services.uploadingManager.models.DataUploadMode;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItemMetadata;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItemStatus;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSession;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSessionType;
import me.oriient.internal.services.uploadingManager.models.UploadableSample;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import org.jetbrains.annotations.NotNull;

/* renamed from: me.oriient.internal.services.uploadingManager.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1536n implements DataUploadManager {

    @NotNull
    private static final C1513b Companion = new C1513b();

    /* renamed from: a, reason: collision with root package name */
    public final DataUploaderFilesManagerImpl f25642a;
    public final DataUploaderItemsStorage b;
    public final DataUploaderImpl c;
    public final DataUploaderStatisticsReporterImpl d;
    public final DataUploaderDataType e;
    public DataUploadManagerConfig f;
    public final byte[] g;
    public final DataUploadMode h;
    public final DataUploadScheduledWork i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final AtomicBoolean o;
    public DataUploaderSession p;
    public me.oriient.internal.services.uploadingManager.models.a q;
    public Long r;
    public int s;
    public boolean t;
    public final Lazy u;

    public C1536n(DataUploaderFilesManagerImpl filesManager, DataUploaderItemsStorage itemsStorage, DataUploaderImpl dataUploader, DataUploaderStatisticsReporterImpl dataUploaderStatisticsReporterImpl, DataUploaderDataType dataType, DataUploadManagerConfig config, byte[] bArr, DataUploadMode schedulingMode, DataUploadScheduledWork scheduledWork) {
        Intrinsics.h(filesManager, "filesManager");
        Intrinsics.h(itemsStorage, "itemsStorage");
        Intrinsics.h(dataUploader, "dataUploader");
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(config, "config");
        Intrinsics.h(schedulingMode, "schedulingMode");
        Intrinsics.h(scheduledWork, "scheduledWork");
        this.f25642a = filesManager;
        this.b = itemsStorage;
        this.c = dataUploader;
        this.d = dataUploaderStatisticsReporterImpl;
        this.e = dataType;
        this.f = config;
        this.g = bArr;
        this.h = schedulingMode;
        this.i = scheduledWork;
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.j = di.inject(reflectionFactory.b(Logger.class));
        this.k = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.l = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        Lazy lazyInject = InternalDiKt.getDi().inject(reflectionFactory.b(DataUploadScheduler.class));
        this.m = lazyInject;
        this.n = InternalDiKt.getDi().inject(reflectionFactory.b(PowerManager.class));
        this.o = new AtomicBoolean(false);
        Lazy lazyB = LazyKt.b(C1535m.f25640a);
        this.u = lazyB;
        BuildersKt.c((CoroutineScope) lazyB.getD(), null, null, new C1512a(this, null), 3);
        ((DataUploadScheduler) lazyInject.getD()).setConfig(this.f.getSchedulingConfig());
    }

    public final void a(me.oriient.internal.services.uploadingManager.models.a aVar, String str, boolean z) {
        if (z || aVar.e >= this.f.getWriteToFileRecords() || ((TimeProvider) this.l.getD()).timeIntervalSinceNow(aVar.g) >= this.f.getWriteToFileIntervalMillis()) {
            ((Logger) this.j.getD()).d("DataUploadManager", "Writing chunk to record's file " + aVar.c.getDataType().name());
            try {
                aVar.a();
            } catch (Exception e) {
                ((Logger) this.j.getD()).e("DataUploadManager", "chunk was not added to file", e);
            }
            this.b.upsert(str, aVar.c);
            aVar.g = ((TimeProvider) this.l.getD()).getCurrentTimeMillis();
        }
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final Object clearAllCaches(double d, Continuation continuation) throws Throwable {
        Object objF = BuildersKt.f(((CoroutineScope) this.u.getD()).getE(), new C1515d(this, d, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final DataUploadManagerConfig getConfig() {
        return this.f;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final DataUploaderFilesManager.FileManagerStats getSpaceUsageStats() {
        return this.f25642a.calculateStoredRecordsData();
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final void moveCurrentSessionToUploading() {
        BuildersKt.c((CoroutineScope) this.u.getD(), null, null, new C1528f(this, null), 3);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final Object onUploadTrigger(DataUploadScheduler.UploadTrigger uploadTrigger, DataUploadScheduledWork dataUploadScheduledWork, Continuation continuation) {
        BuildersKt.c((CoroutineScope) this.u.getD(), null, null, new C1529g(this, dataUploadScheduledWork, uploadTrigger, null), 3);
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final Object sendUploadingStartRequest(DataUploaderSession dataUploaderSession, Continuation continuation) {
        return BuildersKt.f(((CoroutineScope) this.u.getD()).getE(), new C1530h(this, dataUploaderSession, null), continuation);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final void setConfig(DataUploadManagerConfig dataUploadManagerConfig) {
        Intrinsics.h(dataUploadManagerConfig, "<set-?>");
        this.f = dataUploadManagerConfig;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final void start(DataUploaderSession session) {
        Intrinsics.h(session, "session");
        BuildersKt.c((CoroutineScope) this.u.getD(), null, null, new C1531i(this, session, null), 3);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final void stop(DataUploaderSession.EndReason reason, Map map) {
        Intrinsics.h(reason, "reason");
        BuildersKt.c((CoroutineScope) this.u.getD(), null, null, new C1532j(this, reason, map, null), 3);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final void updateClientMetadata(Map updatedClientMetadata, Long l) {
        Intrinsics.h(updatedClientMetadata, "updatedClientMetadata");
        BuildersKt.c((CoroutineScope) this.u.getD(), null, null, new C1533k(this, updatedClientMetadata, l, null), 3);
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploadManager
    public final void upload(UploadableSample sample, Map map) {
        Intrinsics.h(sample, "sample");
        BuildersKt.c((CoroutineScope) this.u.getD(), null, null, new C1534l(this, sample, map, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008a -> B:16:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.internal.services.uploadingManager.C1536n r18, double r19, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.C1536n.a(me.oriient.internal.services.uploadingManager.n, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void a(C1536n c1536n, String str, DataUploaderSession dataUploaderSession, HashMap map) {
        Jsonable jsonable;
        JsonElement jsonElement;
        Jsonable jsonable2;
        JsonElement jsonElement2;
        Jsonable jsonable3;
        JsonElement jsonElement3;
        Jsonable jsonable4;
        JsonElement jsonElement4;
        Jsonable jsonable5;
        JsonElement jsonElement5;
        Jsonable jsonable6;
        JsonElement jsonElement6;
        c1536n.getClass();
        if (dataUploaderSession.getSessionType() != DataUploaderSessionType.POSITIONING) {
            return;
        }
        String strSerializeToJsonString = null;
        String strSerializeToJsonString2 = (map == null || (jsonable6 = (Jsonable) map.get("mapId")) == null || (jsonElement6 = jsonable6.toJsonElement()) == null) ? null : JsonSerializationKt.serializeToJsonString(jsonElement6);
        if (strSerializeToJsonString2 == null || StringsKt.D(strSerializeToJsonString2)) {
            ELog eLog = (ELog) c1536n.k.getD();
            Pair pair = new Pair("callerMethod", str);
            Pair pair2 = new Pair("sessionId", dataUploaderSession.getId());
            Pair pair3 = new Pair("dataType", c1536n.e.getStrValue());
            Pair pair4 = new Pair("oldClientMetadataExists", Boolean.valueOf(dataUploaderSession.getClientMetadata() != null));
            HashMap<String, Jsonable> clientMetadata = dataUploaderSession.getClientMetadata();
            Pair pair5 = new Pair("oldMapId", (clientMetadata == null || (jsonable5 = clientMetadata.get("mapId")) == null || (jsonElement5 = jsonable5.toJsonElement()) == null) ? null : JsonSerializationKt.serializeToJsonString(jsonElement5));
            HashMap<String, Jsonable> clientMetadata2 = dataUploaderSession.getClientMetadata();
            Pair pair6 = new Pair("oldBuildingId", (clientMetadata2 == null || (jsonable4 = clientMetadata2.get("buildingId")) == null || (jsonElement4 = jsonable4.toJsonElement()) == null) ? null : JsonSerializationKt.serializeToJsonString(jsonElement4));
            HashMap<String, Jsonable> clientMetadata3 = dataUploaderSession.getClientMetadata();
            Pair pair7 = new Pair("oldFloorId", (clientMetadata3 == null || (jsonable3 = clientMetadata3.get("floorId")) == null || (jsonElement3 = jsonable3.toJsonElement()) == null) ? null : JsonSerializationKt.serializeToJsonString(jsonElement3));
            Pair pair8 = new Pair("newMapId", strSerializeToJsonString2);
            Pair pair9 = new Pair("newBuildingId", (map == null || (jsonable2 = (Jsonable) map.get("buildingId")) == null || (jsonElement2 = jsonable2.toJsonElement()) == null) ? null : JsonSerializationKt.serializeToJsonString(jsonElement2));
            if (map != null && (jsonable = (Jsonable) map.get("floorId")) != null && (jsonElement = jsonable.toJsonElement()) != null) {
                strSerializeToJsonString = JsonSerializationKt.serializeToJsonString(jsonElement);
            }
            eLog.e("DataUploadManager", "missing mapId when changing metadata", MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair("newFloorId", strSerializeToJsonString)));
        }
    }

    public static final me.oriient.internal.services.uploadingManager.models.a a(C1536n c1536n, DataUploaderSession dataUploaderSession, int i, long j, long j2) throws IOException {
        Logger logger = (Logger) c1536n.j.getD();
        StringBuilder sb = new StringBuilder("createItem() called with: session = ");
        sb.append(dataUploaderSession);
        sb.append(", indexInSession = ");
        sb.append(i);
        sb.append(", sessionDataStartTimeMillis = ");
        sb.append(j);
        logger.d("DataUploadManager", au.com.woolworths.shop.checkout.ui.confirmation.c.m(j2, ", sampleDataStartTimeMillis = ", sb));
        int i2 = i + 1;
        DataUploaderItemMetadata dataUploaderItemMetadata = new DataUploaderItemMetadata(dataUploaderSession.getUploadingUrl(), dataUploaderSession.getApiKey(), dataUploaderSession.getSpaceId(), dataUploaderSession.getSessionStartTimeMillis(), Math.abs(j2 - j) + dataUploaderSession.getSessionStartTimeMillis(), i2, ((Number) ((PowerManager) c1536n.n.getD()).getBatteryLevel().getValue()).floatValue(), dataUploaderSession.getDataFormatVersion(), dataUploaderSession.getSessionType());
        String string = UUID.randomUUID().toString();
        DataUploaderDataType dataUploaderDataType = c1536n.e;
        String id = dataUploaderSession.getId();
        long startTimeMillis = dataUploaderItemMetadata.getStartTimeMillis();
        DataUploaderItemStatus dataUploaderItemStatus = DataUploaderItemStatus.COLLECTING;
        HashMap<String, Jsonable> clientMetadata = dataUploaderSession.getClientMetadata();
        boolean shouldBeUploaded = dataUploaderSession.getShouldBeUploaded();
        Intrinsics.e(string);
        DataUploaderItem dataUploaderItem = new DataUploaderItem(string, dataUploaderDataType, id, startTimeMillis, 0L, null, false, dataUploaderItemStatus, null, null, dataUploaderItemMetadata, clientMetadata, shouldBeUploaded);
        File fileFileHandle = c1536n.f25642a.fileHandle(dataUploaderItem);
        byte[] bArr = c1536n.g;
        if (bArr != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(fileFileHandle);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        }
        return new me.oriient.internal.services.uploadingManager.models.a(dataUploaderItem.getId(), dataUploaderSession.getId(), i2, fileFileHandle, dataUploaderItem, new byte[0], ((TimeProvider) c1536n.l.getD()).getCurrentTimeMillis());
    }

    public static final Logger a(C1536n c1536n) {
        return (Logger) c1536n.j.getD();
    }

    public final void a(me.oriient.internal.services.uploadingManager.models.a aVar, DataUploaderItem.EndReason endReason, boolean z) {
        ((Logger) this.j.getD()).d("DataUploadManager", "chunkIsFinished() called with: chunk = " + aVar + ", reason = " + endReason + ", isLast = " + z);
        DataUploaderItem dataUploaderItem = aVar.c;
        dataUploaderItem.setLast(z);
        dataUploaderItem.setUploadingStatus(DataUploaderItemStatus.READY_FOR_ZIPPING);
        dataUploaderItem.setEndReason(endReason.getValue());
        a(aVar, "chunkIsFinished", true);
        this.b.upsert("chunkIsFinished", dataUploaderItem);
        if (aVar.c.getShouldBeUploaded()) {
            ((DataUploadScheduler) this.m.getD()).setConfig(this.f.getSchedulingConfig());
            ((DataUploadScheduler) this.m.getD()).scheduleUploading(this.i, this.h);
        }
    }
}
