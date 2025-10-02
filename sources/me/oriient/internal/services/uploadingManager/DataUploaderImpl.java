package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.json.JsonElement;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.serializerJson.JsonableString;
import me.oriient.internal.infra.utils.core.FileNotFound;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.uploadingManager.models.DataUploadMode;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItemStatus;
import me.oriient.internal.services.uploadingManager.models.DataUploaderSessionType;
import me.oriient.internal.services.uploadingManager.rest.DataUploaderRest;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduledWork;
import me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0085\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010#J4\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010,J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0016\u001a\u00020\rH\u0082@¢\u0006\u0004\b-\u0010\u0018J\u0018\u0010.\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\rH\u0082@¢\u0006\u0004\b.\u0010\u0018JO\u00106\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\r2\u0006\u00100\u001a\u00020/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010!2\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b6\u00107J7\u0010<\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\r2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010:09H\u0002¢\u0006\u0004\b<\u0010=J?\u0010?\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u001f2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010:09H\u0002¢\u0006\u0004\b?\u0010@J \u0010A\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\bA\u0010BJ$\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0016\u001a\u00020\rH\u0096@¢\u0006\u0004\bC\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010IR$\u0010J\u001a\u0004\u0018\u00010\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR \u0010P\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010I\u001a\u0004\bQ\u0010RR,\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001f0S0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010I\u001a\u0004\bU\u0010RR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010X\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010X\u001a\u0004\bc\u0010dR\u001d\u0010j\u001a\u0004\u0018\u00010f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010X\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010X\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010X\u001a\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010X\u001a\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010X\u001a\u0004\b|\u0010}R\u001d\u0010\u0081\u0001\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010X\u001a\u0005\b\u0080\u0001\u0010}R\u0019\u0010\u0082\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0086\u0001"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderImpl;", "Lme/oriient/internal/services/uploadingManager/DataUploader;", "Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest;", "rest", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager;", "filesManager", "Lme/oriient/internal/services/uploadingManager/DataUploaderEventsReporter;", "eventsReporter", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "dataType", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;", "uploadMode", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "itemsUploadedFlow", "<init>", "(Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest;Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager;Lme/oriient/internal/services/uploadingManager/DataUploaderEventsReporter;Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;", "scheduledWork", "", "activateImmediateUploadingFallback", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;)V", "item", "onItemUploaded", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverDatabase", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;", "uploadTrigger", "uploadItem", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callerMethod", "", "validatePositionItem", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)Z", "Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest$FileUploadDestinationData;", "uploadUrlData", "Lme/oriient/internal/infra/utils/core/Outcome;", "Lme/oriient/internal/infra/utils/core/OriientError;", "uploadFile", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest$FileUploadDestinationData;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadingMode", "calcUploadType", "(Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;)Ljava/lang/String;", "requestUploadUrl", "zipItem", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;", "status", "uploadFileName", "compression", "isLast", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason;", "endReason", "updateItemState", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason;)V", "message", "", "", "additionalData", "reportEvent", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Ljava/util/Map;)V", "error", "reportFailure", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Ljava/lang/String;Ljava/util/Map;)V", "uploadEverything", "(Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduledWork;Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler$UploadTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUploadingStartRequest", "Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest;", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager;", "Lme/oriient/internal/services/uploadingManager/DataUploaderEventsReporter;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "Lme/oriient/internal/services/uploadingManager/models/DataUploadMode;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "currentSessionId", "Ljava/lang/String;", "getCurrentSessionId", "()Ljava/lang/String;", "setCurrentSessionId", "(Ljava/lang/String;)V", "itemUploadingFinished", "getItemUploadingFinished", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlin/Pair;", "itemUploadingFailed", "getItemUploadingFailed", "Lme/oriient/internal/infra/utils/core/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getLogger", "()Lme/oriient/internal/infra/utils/core/Logger;", "logger", "Lme/oriient/internal/services/elog/ELog;", "eLog$delegate", "getELog", "()Lme/oriient/internal/services/elog/ELog;", "eLog", "Lme/oriient/internal/services/uploadingManager/DataUploaderItemsStorage;", "database$delegate", "getDatabase", "()Lme/oriient/internal/services/uploadingManager/DataUploaderItemsStorage;", "database", "Lme/oriient/internal/services/uploadingManager/DataUploaderStatisticsReporter;", "statisticsReporter$delegate", "getStatisticsReporter", "()Lme/oriient/internal/services/uploadingManager/DataUploaderStatisticsReporter;", "statisticsReporter", "Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider$delegate", "getTimeProvider", "()Lme/oriient/internal/infra/utils/core/time/TimeProvider;", "timeProvider", "Lme/oriient/internal/infra/networkManager/NetworkManager;", "networkManager$delegate", "getNetworkManager", "()Lme/oriient/internal/infra/networkManager/NetworkManager;", "networkManager", "Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler;", "scheduler$delegate", "getScheduler", "()Lme/oriient/internal/services/uploadingManager/scheduling/DataUploadScheduler;", "scheduler", "Lkotlinx/coroutines/CoroutineScope;", "uploadCoroutineScope$delegate", "getUploadCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "uploadCoroutineScope", "endUploadCoroutineScope$delegate", "getEndUploadCoroutineScope", "endUploadCoroutineScope", "inProgress", "Z", "Companion", "me/oriient/internal/services/uploadingManager/s", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DataUploaderImpl implements DataUploader {

    @NotNull
    private static final C1540s Companion = new C1540s();

    @NotNull
    private static final String TAG = "DataUploader";

    @Nullable
    private String currentSessionId;

    @NotNull
    private final DataUploaderDataType dataType;

    /* renamed from: database$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy database;

    /* renamed from: eLog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy eLog;

    /* renamed from: endUploadCoroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy endUploadCoroutineScope;

    @NotNull
    private final DataUploaderEventsReporter eventsReporter;

    @NotNull
    private final DataUploaderFilesManager filesManager;
    private boolean inProgress;

    @NotNull
    private final MutableSharedFlow<Pair<DataUploaderItem, String>> itemUploadingFailed;

    @NotNull
    private final MutableSharedFlow<DataUploaderItem> itemUploadingFinished;

    @NotNull
    private final MutableSharedFlow<DataUploaderItem> itemsUploadedFlow;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger;

    /* renamed from: networkManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy networkManager;

    @NotNull
    private final DataUploaderRest rest;

    /* renamed from: scheduler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduler;

    /* renamed from: statisticsReporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy statisticsReporter;

    /* renamed from: timeProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeProvider;

    /* renamed from: uploadCoroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy uploadCoroutineScope;

    @NotNull
    private final DataUploadMode uploadMode;

    public DataUploaderImpl(@NotNull DataUploaderRest rest, @NotNull DataUploaderFilesManager filesManager, @NotNull DataUploaderEventsReporter eventsReporter, @NotNull DataUploaderDataType dataType, @NotNull DataUploadMode uploadMode, @NotNull MutableSharedFlow<DataUploaderItem> itemsUploadedFlow) {
        Intrinsics.h(rest, "rest");
        Intrinsics.h(filesManager, "filesManager");
        Intrinsics.h(eventsReporter, "eventsReporter");
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(uploadMode, "uploadMode");
        Intrinsics.h(itemsUploadedFlow, "itemsUploadedFlow");
        this.rest = rest;
        this.filesManager = filesManager;
        this.eventsReporter = eventsReporter;
        this.dataType = dataType;
        this.uploadMode = uploadMode;
        this.itemsUploadedFlow = itemsUploadedFlow;
        this.itemUploadingFinished = UtilsKt.MutableSharedFlowConfigured();
        this.itemUploadingFailed = UtilsKt.MutableSharedFlowConfigured();
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.logger = di.inject(reflectionFactory.b(Logger.class));
        this.eLog = InternalDiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.database = InternalDiKt.getDi().inject(reflectionFactory.b(DataUploaderItemsStorage.class));
        this.statisticsReporter = InternalDiKt.getDi().injectOrNull(reflectionFactory.b(Object.class));
        this.timeProvider = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.networkManager = InternalDiKt.getDi().inject(reflectionFactory.b(NetworkManager.class));
        this.scheduler = InternalDiKt.getDi().inject(reflectionFactory.b(DataUploadScheduler.class));
        this.uploadCoroutineScope = LazyKt.b(z.f25664a);
        this.endUploadCoroutineScope = LazyKt.b(C1542u.f25659a);
        DataUploaderStatisticsReporter statisticsReporter = getStatisticsReporter();
        if (statisticsReporter != null) {
            statisticsReporter.reportDeviceStatistics();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void activateImmediateUploadingFallback(DataUploadScheduledWork scheduledWork) {
        getLogger().d(TAG, "activateImmediateUploadingFallback() called");
        if (this.uploadMode instanceof DataUploadMode.Immediate) {
            getScheduler().scheduleUploading(scheduledWork, new DataUploadMode.Scheduled(false, false));
        } else {
            getLogger().d(TAG, "upload mode is not immediate. doing nothing...");
        }
    }

    private final String calcUploadType(DataUploadMode uploadingMode, DataUploadScheduler.UploadTrigger uploadTrigger) {
        String str;
        String str2;
        if (uploadingMode instanceof DataUploadMode.Immediate) {
            return "aggressive-mode";
        }
        if (!(uploadingMode instanceof DataUploadMode.Scheduled)) {
            throw new NoWhenBranchMatchedException();
        }
        DataUploadMode.Scheduled scheduled = (DataUploadMode.Scheduled) uploadingMode;
        boolean requireWiFi = scheduled.getRequireWiFi();
        if (!requireWiFi) {
            str = "cellular";
        } else {
            if (!requireWiFi) {
                throw new NoWhenBranchMatchedException();
            }
            str = "wifi";
        }
        boolean requireCharger = scheduled.getRequireCharger();
        if (!requireCharger) {
            str2 = "no charger";
        } else {
            if (!requireCharger) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "charger";
        }
        return str + '-' + str2 + ": " + uploadTrigger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataUploaderItemsStorage getDatabase() {
        return (DataUploaderItemsStorage) this.database.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ELog getELog() {
        return (ELog) this.eLog.getD();
    }

    private final CoroutineScope getEndUploadCoroutineScope() {
        return (CoroutineScope) this.endUploadCoroutineScope.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkManager getNetworkManager() {
        return (NetworkManager) this.networkManager.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataUploadScheduler getScheduler() {
        return (DataUploadScheduler) this.scheduler.getD();
    }

    private final DataUploaderStatisticsReporter getStatisticsReporter() {
        return (DataUploaderStatisticsReporter) this.statisticsReporter.getD();
    }

    private final TimeProvider getTimeProvider() {
        return (TimeProvider) this.timeProvider.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getUploadCoroutineScope() {
        return (CoroutineScope) this.uploadCoroutineScope.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020b, code lost:
    
        if (r5.emit(r2, r3) == r4) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[PHI: r1 r2 r5
  0x0063: PHI (r1v7 me.oriient.internal.services.uploadingManager.models.DataUploaderItem) = 
  (r1v2 me.oriient.internal.services.uploadingManager.models.DataUploaderItem)
  (r1v18 me.oriient.internal.services.uploadingManager.models.DataUploaderItem)
 binds: [B:52:0x0151, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r2v17 java.lang.Object) = (r2v9 java.lang.Object), (r2v1 java.lang.Object) binds: [B:52:0x0151, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r5v9 me.oriient.internal.services.uploadingManager.DataUploaderImpl) = 
  (r5v5 me.oriient.internal.services.uploadingManager.DataUploaderImpl)
  (r5v15 me.oriient.internal.services.uploadingManager.DataUploaderImpl)
 binds: [B:52:0x0151, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onItemUploaded(me.oriient.internal.services.uploadingManager.models.DataUploaderItem r27, kotlin.coroutines.Continuation<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.DataUploaderImpl.onItemUploaded(me.oriient.internal.services.uploadingManager.models.DataUploaderItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object recoverDatabase(kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.DataUploaderImpl.recoverDatabase(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void reportEvent(String message, DataUploaderItem item, Map<String, ? extends Object> additionalData) {
        getLogger().d(TAG, "reportEvent() called with: message = " + message + ", item = " + item);
        this.eventsReporter.reportEvent(TAG, message, item, additionalData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportEvent$default(DataUploaderImpl dataUploaderImpl, String str, DataUploaderItem dataUploaderItem, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = EmptyMap.d;
        }
        dataUploaderImpl.reportEvent(str, dataUploaderItem, map);
    }

    private final void reportFailure(String message, DataUploaderItem item, String error, Map<String, ? extends Object> additionalData) {
        getLogger().d(TAG, "reportFailure() called with: message = " + message + ", item = " + item + ", error = " + error);
        this.eventsReporter.reportFailure(TAG, message, item, error, additionalData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportFailure$default(DataUploaderImpl dataUploaderImpl, String str, DataUploaderItem dataUploaderItem, String str2, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            map = EmptyMap.d;
        }
        dataUploaderImpl.reportFailure(str, dataUploaderItem, str2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestUploadUrl(DataUploaderItem dataUploaderItem, Continuation<? super Outcome<DataUploaderRest.FileUploadDestinationData, OriientError>> continuation) {
        return this.rest.sendStartChunk("requestUploadUrl", dataUploaderItem, false, continuation);
    }

    private final void updateItemState(DataUploaderItem item, DataUploaderItemStatus status, String uploadFileName, String compression, Boolean isLast, DataUploaderItem.EndReason endReason) {
        String endReason2;
        item.setUploadingStatus(status);
        if (compression == null) {
            compression = item.getCompression();
        }
        item.setCompression(compression);
        if (uploadFileName == null) {
            uploadFileName = item.getUploadFilename();
        }
        item.setUploadFilename(uploadFileName);
        item.setLast(isLast != null ? isLast.booleanValue() : item.isLast());
        if (endReason == null || (endReason2 = endReason.getValue()) == null) {
            endReason2 = item.getEndReason();
        }
        item.setEndReason(endReason2);
        getDatabase().upsert("updateItemState", item);
    }

    public static /* synthetic */ void updateItemState$default(DataUploaderImpl dataUploaderImpl, DataUploaderItem dataUploaderItem, DataUploaderItemStatus dataUploaderItemStatus, String str, String str2, Boolean bool, DataUploaderItem.EndReason endReason, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            endReason = null;
        }
        dataUploaderImpl.updateItemState(dataUploaderItem, dataUploaderItemStatus, str, str2, bool, endReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uploadFile(DataUploaderItem dataUploaderItem, DataUploaderRest.FileUploadDestinationData fileUploadDestinationData, DataUploadScheduler.UploadTrigger uploadTrigger, Continuation<? super Outcome<Unit, OriientError>> continuation) {
        boolean zDoesOriginalFileExist;
        String strOriginalFilePath;
        getLogger().d(TAG, "uploadFile() called with: item = " + dataUploaderItem + ", uploadUrlData = " + fileUploadDestinationData);
        if (dataUploaderItem.getUploadingStatus() != DataUploaderItemStatus.READY_FOR_UPLOAD) {
            getLogger().d(TAG, "uploadFile: status is not ready for upload - skipping");
            return OutcomeKt.toOutcomeSuccess(Unit.f24250a);
        }
        boolean shouldApplyCompression = dataUploaderItem.getShouldApplyCompression();
        if (shouldApplyCompression) {
            zDoesOriginalFileExist = this.filesManager.doesCompressedFileExist(dataUploaderItem);
        } else {
            if (shouldApplyCompression) {
                throw new NoWhenBranchMatchedException();
            }
            zDoesOriginalFileExist = this.filesManager.doesOriginalFileExist(dataUploaderItem);
        }
        if (!zDoesOriginalFileExist) {
            getLogger().d(TAG, "uploadFile: file not found for item " + dataUploaderItem);
            String uploadFilename = dataUploaderItem.getUploadFilename();
            if (uploadFilename == null) {
                uploadFilename = "no file name";
            }
            return OutcomeKt.toOutcomeFailure(new FileNotFound(uploadFilename));
        }
        updateItemState$default(this, dataUploaderItem, DataUploaderItemStatus.UPLOADING, fileUploadDestinationData.getFilename(), null, null, null, 56, null);
        reportEvent("Scheduled Chunk Uploading", dataUploaderItem, androidx.constraintlayout.core.state.a.s("uploadType", calcUploadType(this.uploadMode, uploadTrigger)));
        boolean shouldApplyCompression2 = dataUploaderItem.getShouldApplyCompression();
        if (shouldApplyCompression2) {
            strOriginalFilePath = this.filesManager.compressedFilePath(dataUploaderItem);
        } else {
            if (shouldApplyCompression2) {
                throw new NoWhenBranchMatchedException();
            }
            strOriginalFilePath = this.filesManager.originalFilePath(dataUploaderItem);
        }
        DataUploaderStatisticsReporter statisticsReporter = getStatisticsReporter();
        if (statisticsReporter != null) {
            statisticsReporter.setLastUploadStartTime(getTimeProvider().getCurrentTimeMillis());
        }
        return this.rest.uploadFile(fileUploadDestinationData.getUploadUrl(), new File(strOriginalFilePath), dataUploaderItem.getDataType().getContentEncoding(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object uploadItem(me.oriient.internal.services.uploadingManager.models.DataUploaderItem r23, me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler.UploadTrigger r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.DataUploaderImpl.uploadItem(me.oriient.internal.services.uploadingManager.models.DataUploaderItem, me.oriient.internal.services.uploadingManager.scheduling.DataUploadScheduler$UploadTrigger, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean validatePositionItem(String callerMethod, DataUploaderItem item) {
        JsonElement jsonElementM390toJsonElementimpl;
        JsonElement jsonElementM390toJsonElementimpl2;
        JsonElement jsonElementM390toJsonElementimpl3;
        if (item.getMetadata().getSessionType() != DataUploaderSessionType.POSITIONING) {
            return true;
        }
        HashMap<String, Jsonable> clientMetadata = item.getClientMetadata();
        String strSerializeToJsonString = null;
        Jsonable jsonable = clientMetadata != null ? clientMetadata.get("mapId") : null;
        String value = jsonable instanceof JsonableString ? ((JsonableString) jsonable).getValue() : null;
        String strSerializeToJsonString2 = (value == null || (jsonElementM390toJsonElementimpl3 = JsonableString.m390toJsonElementimpl(value)) == null) ? null : JsonSerializationKt.serializeToJsonString(jsonElementM390toJsonElementimpl3);
        if (strSerializeToJsonString2 != null && !StringsKt.D(strSerializeToJsonString2)) {
            return true;
        }
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
        eLog.e(TAG, "no mapId when sending positioning startChunk", MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("floorId", strSerializeToJsonString)));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zipItem(me.oriient.internal.services.uploadingManager.models.DataUploaderItem r23, kotlin.coroutines.Continuation<? super java.lang.Boolean> r24) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.DataUploaderImpl.zipItem(me.oriient.internal.services.uploadingManager.models.DataUploaderItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploader
    @Nullable
    public String getCurrentSessionId() {
        return this.currentSessionId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.uploadingManager.DataUploader
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object sendUploadingStartRequest(@org.jetbrains.annotations.NotNull me.oriient.internal.services.uploadingManager.models.DataUploaderItem r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super me.oriient.internal.infra.utils.core.Outcome<kotlin.Unit, me.oriient.internal.infra.utils.core.OriientError>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof me.oriient.internal.services.uploadingManager.x
            if (r0 == 0) goto L13
            r0 = r6
            me.oriient.internal.services.uploadingManager.x r0 = (me.oriient.internal.services.uploadingManager.x) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.services.uploadingManager.x r0 = new me.oriient.internal.services.uploadingManager.x
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25662a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            me.oriient.internal.services.uploadingManager.rest.DataUploaderRest r6 = r4.rest
            r0.c = r3
            java.lang.String r2 = "sendUploadingStartRequest"
            java.lang.Object r6 = r6.sendStartChunk(r2, r5, r3, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            me.oriient.internal.infra.utils.core.Outcome r6 = (me.oriient.internal.infra.utils.core.Outcome) r6
            me.oriient.internal.services.uploadingManager.y r5 = me.oriient.internal.services.uploadingManager.y.f25663a
            me.oriient.internal.infra.utils.core.Outcome r5 = r6.map(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.uploadingManager.DataUploaderImpl.sendUploadingStartRequest(me.oriient.internal.services.uploadingManager.models.DataUploaderItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploader
    public void setCurrentSessionId(@Nullable String str) {
        this.currentSessionId = str;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploader
    @Nullable
    public Object uploadEverything(@NotNull DataUploadScheduledWork dataUploadScheduledWork, @NotNull DataUploadScheduler.UploadTrigger uploadTrigger, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(getEndUploadCoroutineScope().getE(), new B(this, dataUploadScheduledWork, uploadTrigger, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploader
    @NotNull
    public MutableSharedFlow<Pair<DataUploaderItem, String>> getItemUploadingFailed() {
        return this.itemUploadingFailed;
    }

    @Override // me.oriient.internal.services.uploadingManager.DataUploader
    @NotNull
    public MutableSharedFlow<DataUploaderItem> getItemUploadingFinished() {
        return this.itemUploadingFinished;
    }
}
