package me.oriient.internal.services.uploadingManager.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.infra.serializerJson.Jsonable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001OB\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012&\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016\u0012\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0002\u0010\u0018J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0012HÆ\u0003J)\u0010?\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016HÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\fHÆ\u0003J\t\u0010G\u001a\u00020\u000eHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J±\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122(\b\u0002\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00162\b\b\u0002\u0010\u0017\u001a\u00020\fHÆ\u0001J\u0013\u0010J\u001a\u00020\f2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020MHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR:\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010*\"\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u00100\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b1\u0010*R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010*\"\u0004\b3\u0010,R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\"\"\u0004\b7\u0010$R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006P"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "", "id", "", "dataType", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "sessionId", "stopTimeMillis", "", "bytesCount", "endReason", "isLast", "", "uploadingStatus", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;", "uploadFilename", "compression", "metadata", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemMetadata;", "clientMetadata", "Ljava/util/HashMap;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "Lkotlin/collections/HashMap;", "shouldBeUploaded", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;Ljava/lang/String;JJLjava/lang/String;ZLme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemMetadata;Ljava/util/HashMap;Z)V", "getBytesCount", "()J", "setBytesCount", "(J)V", "getClientMetadata", "()Ljava/util/HashMap;", "setClientMetadata", "(Ljava/util/HashMap;)V", "getCompression", "()Ljava/lang/String;", "setCompression", "(Ljava/lang/String;)V", "getDataType", "()Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "getEndReason", "setEndReason", "getId", "()Z", "setLast", "(Z)V", "getMetadata", "()Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemMetadata;", "getSessionId", "shouldApplyCompression", "getShouldApplyCompression", "getShouldBeUploaded", "setShouldBeUploaded", "getStopTimeMillis", "setStopTimeMillis", "getUploadFilename", "setUploadFilename", "getUploadingStatus", "()Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;", "setUploadingStatus", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;)V", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "EndReason", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DataUploaderItem {
    private long bytesCount;

    @Nullable
    private HashMap<String, Jsonable> clientMetadata;

    @Nullable
    private String compression;

    @NotNull
    private final DataUploaderDataType dataType;

    @Nullable
    private String endReason;

    @NotNull
    private final String id;
    private boolean isLast;

    @NotNull
    private final DataUploaderItemMetadata metadata;

    @NotNull
    private final String sessionId;
    private boolean shouldBeUploaded;
    private long stopTimeMillis;

    @Nullable
    private String uploadFilename;

    @NotNull
    private DataUploaderItemStatus uploadingStatus;

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "EndOfChunk", "EndOfSession", "Error", "StartMarker", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason$EndOfChunk;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason$EndOfSession;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason$Error;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason$StartMarker;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class EndReason {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String value;

        @Keep
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason$Companion;", "", "()V", "from", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason;", "rawValue", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final EndReason from(@NotNull String rawValue) {
                Intrinsics.h(rawValue, "rawValue");
                int iHashCode = rawValue.hashCode();
                if (iHashCode != -2055474372) {
                    if (iHashCode != -1353538181) {
                        if (iHashCode == 96784904 && rawValue.equals("error")) {
                            return new Error();
                        }
                    } else if (rawValue.equals("endOfChunk")) {
                        return new EndOfChunk();
                    }
                } else if (rawValue.equals("startMarker")) {
                    return new StartMarker();
                }
                return new EndOfSession(rawValue);
            }

            private Companion() {
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason$EndOfChunk;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EndOfChunk extends EndReason {
            public EndOfChunk() {
                super("endOfChunk", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason$EndOfSession;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason;", "reason", "", "(Ljava/lang/String;)V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EndOfSession extends EndReason {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EndOfSession(@NotNull String reason) {
                super(reason, null);
                Intrinsics.h(reason, "reason");
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason$Error;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Error extends EndReason {
            public Error() {
                super("error", null);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason$StartMarker;", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem$EndReason;", "()V", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StartMarker extends EndReason {
            public StartMarker() {
                super("startMarker", null);
            }
        }

        public /* synthetic */ EndReason(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        private EndReason(String str) {
            this.value = str;
        }
    }

    public DataUploaderItem(@NotNull String id, @NotNull DataUploaderDataType dataType, @NotNull String sessionId, long j, long j2, @Nullable String str, boolean z, @NotNull DataUploaderItemStatus uploadingStatus, @Nullable String str2, @Nullable String str3, @NotNull DataUploaderItemMetadata metadata, @Nullable HashMap<String, Jsonable> map, boolean z2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(uploadingStatus, "uploadingStatus");
        Intrinsics.h(metadata, "metadata");
        this.id = id;
        this.dataType = dataType;
        this.sessionId = sessionId;
        this.stopTimeMillis = j;
        this.bytesCount = j2;
        this.endReason = str;
        this.isLast = z;
        this.uploadingStatus = uploadingStatus;
        this.uploadFilename = str2;
        this.compression = str3;
        this.metadata = metadata;
        this.clientMetadata = map;
        this.shouldBeUploaded = z2;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getCompression() {
        return this.compression;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final DataUploaderItemMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final HashMap<String, Jsonable> component12() {
        return this.clientMetadata;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShouldBeUploaded() {
        return this.shouldBeUploaded;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DataUploaderDataType getDataType() {
        return this.dataType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStopTimeMillis() {
        return this.stopTimeMillis;
    }

    /* renamed from: component5, reason: from getter */
    public final long getBytesCount() {
        return this.bytesCount;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getEndReason() {
        return this.endReason;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final DataUploaderItemStatus getUploadingStatus() {
        return this.uploadingStatus;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getUploadFilename() {
        return this.uploadFilename;
    }

    @NotNull
    public final DataUploaderItem copy(@NotNull String id, @NotNull DataUploaderDataType dataType, @NotNull String sessionId, long stopTimeMillis, long bytesCount, @Nullable String endReason, boolean isLast, @NotNull DataUploaderItemStatus uploadingStatus, @Nullable String uploadFilename, @Nullable String compression, @NotNull DataUploaderItemMetadata metadata, @Nullable HashMap<String, Jsonable> clientMetadata, boolean shouldBeUploaded) {
        Intrinsics.h(id, "id");
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(uploadingStatus, "uploadingStatus");
        Intrinsics.h(metadata, "metadata");
        return new DataUploaderItem(id, dataType, sessionId, stopTimeMillis, bytesCount, endReason, isLast, uploadingStatus, uploadFilename, compression, metadata, clientMetadata, shouldBeUploaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataUploaderItem)) {
            return false;
        }
        DataUploaderItem dataUploaderItem = (DataUploaderItem) other;
        return Intrinsics.c(this.id, dataUploaderItem.id) && this.dataType == dataUploaderItem.dataType && Intrinsics.c(this.sessionId, dataUploaderItem.sessionId) && this.stopTimeMillis == dataUploaderItem.stopTimeMillis && this.bytesCount == dataUploaderItem.bytesCount && Intrinsics.c(this.endReason, dataUploaderItem.endReason) && this.isLast == dataUploaderItem.isLast && this.uploadingStatus == dataUploaderItem.uploadingStatus && Intrinsics.c(this.uploadFilename, dataUploaderItem.uploadFilename) && Intrinsics.c(this.compression, dataUploaderItem.compression) && Intrinsics.c(this.metadata, dataUploaderItem.metadata) && Intrinsics.c(this.clientMetadata, dataUploaderItem.clientMetadata) && this.shouldBeUploaded == dataUploaderItem.shouldBeUploaded;
    }

    public final long getBytesCount() {
        return this.bytesCount;
    }

    @Nullable
    public final HashMap<String, Jsonable> getClientMetadata() {
        return this.clientMetadata;
    }

    @Nullable
    public final String getCompression() {
        return this.compression;
    }

    @NotNull
    public final DataUploaderDataType getDataType() {
        return this.dataType;
    }

    @Nullable
    public final String getEndReason() {
        return this.endReason;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final DataUploaderItemMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean getShouldApplyCompression() {
        return this.dataType.getShouldApplyCompression();
    }

    public final boolean getShouldBeUploaded() {
        return this.shouldBeUploaded;
    }

    public final long getStopTimeMillis() {
        return this.stopTimeMillis;
    }

    @Nullable
    public final String getUploadFilename() {
        return this.uploadFilename;
    }

    @NotNull
    public final DataUploaderItemStatus getUploadingStatus() {
        return this.uploadingStatus;
    }

    public int hashCode() {
        int iA = K.a(this.bytesCount, K.a(this.stopTimeMillis, me.oriient.internal.infra.rest.a.a(this.sessionId, (this.dataType.hashCode() + (this.id.hashCode() * 31)) * 31, 31), 31), 31);
        String str = this.endReason;
        int iHashCode = (this.uploadingStatus.hashCode() + me.oriient.internal.infra.scheduler.a.a(this.isLast, (iA + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        String str2 = this.uploadFilename;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.compression;
        int iHashCode3 = (this.metadata.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        HashMap<String, Jsonable> map = this.clientMetadata;
        return Boolean.hashCode(this.shouldBeUploaded) + ((iHashCode3 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final boolean isLast() {
        return this.isLast;
    }

    public final void setBytesCount(long j) {
        this.bytesCount = j;
    }

    public final void setClientMetadata(@Nullable HashMap<String, Jsonable> map) {
        this.clientMetadata = map;
    }

    public final void setCompression(@Nullable String str) {
        this.compression = str;
    }

    public final void setEndReason(@Nullable String str) {
        this.endReason = str;
    }

    public final void setLast(boolean z) {
        this.isLast = z;
    }

    public final void setShouldBeUploaded(boolean z) {
        this.shouldBeUploaded = z;
    }

    public final void setStopTimeMillis(long j) {
        this.stopTimeMillis = j;
    }

    public final void setUploadFilename(@Nullable String str) {
        this.uploadFilename = str;
    }

    public final void setUploadingStatus(@NotNull DataUploaderItemStatus dataUploaderItemStatus) {
        Intrinsics.h(dataUploaderItemStatus, "<set-?>");
        this.uploadingStatus = dataUploaderItemStatus;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DataUploaderItem(id=");
        sb.append(this.id);
        sb.append(", dataType=");
        sb.append(this.dataType);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", stopTimeMillis=");
        sb.append(this.stopTimeMillis);
        sb.append(", bytesCount=");
        sb.append(this.bytesCount);
        sb.append(", endReason=");
        sb.append(this.endReason);
        sb.append(", isLast=");
        sb.append(this.isLast);
        sb.append(", uploadingStatus=");
        sb.append(this.uploadingStatus);
        sb.append(", uploadFilename=");
        sb.append(this.uploadFilename);
        sb.append(", compression=");
        sb.append(this.compression);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", clientMetadata=");
        sb.append(this.clientMetadata);
        sb.append(", shouldBeUploaded=");
        return b.s(sb, this.shouldBeUploaded, ')');
    }
}
