package me.oriient.internal.services.uploadingManager.models;

import androidx.annotation.Keep;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\nHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00060"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemMetadata;", "Ljava/io/Serializable;", "uploadingUrl", "", "apiKey", "spaceId", "sessionStartTimeMillis", "", "startTimeMillis", "indexInSession", "", "batteryLevel", "", "dataFormatVersion", "sessionType", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderSessionType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIDDLme/oriient/internal/services/uploadingManager/models/DataUploaderSessionType;)V", "getApiKey", "()Ljava/lang/String;", "getBatteryLevel", "()D", "getDataFormatVersion", "getIndexInSession", "()I", "getSessionStartTimeMillis", "()J", "getSessionType", "()Lme/oriient/internal/services/uploadingManager/models/DataUploaderSessionType;", "getSpaceId", "getStartTimeMillis", "getUploadingUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DataUploaderItemMetadata implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final String apiKey;
    private final double batteryLevel;
    private final double dataFormatVersion;
    private final int indexInSession;
    private final long sessionStartTimeMillis;

    @NotNull
    private final DataUploaderSessionType sessionType;

    @NotNull
    private final String spaceId;
    private final long startTimeMillis;

    @NotNull
    private final String uploadingUrl;

    public DataUploaderItemMetadata(@NotNull String uploadingUrl, @NotNull String apiKey, @NotNull String spaceId, long j, long j2, int i, double d, double d2, @NotNull DataUploaderSessionType sessionType) {
        Intrinsics.h(uploadingUrl, "uploadingUrl");
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(sessionType, "sessionType");
        this.uploadingUrl = uploadingUrl;
        this.apiKey = apiKey;
        this.spaceId = spaceId;
        this.sessionStartTimeMillis = j;
        this.startTimeMillis = j2;
        this.indexInSession = i;
        this.batteryLevel = d;
        this.dataFormatVersion = d2;
        this.sessionType = sessionType;
    }

    public static /* synthetic */ DataUploaderItemMetadata copy$default(DataUploaderItemMetadata dataUploaderItemMetadata, String str, String str2, String str3, long j, long j2, int i, double d, double d2, DataUploaderSessionType dataUploaderSessionType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dataUploaderItemMetadata.uploadingUrl;
        }
        return dataUploaderItemMetadata.copy(str, (i2 & 2) != 0 ? dataUploaderItemMetadata.apiKey : str2, (i2 & 4) != 0 ? dataUploaderItemMetadata.spaceId : str3, (i2 & 8) != 0 ? dataUploaderItemMetadata.sessionStartTimeMillis : j, (i2 & 16) != 0 ? dataUploaderItemMetadata.startTimeMillis : j2, (i2 & 32) != 0 ? dataUploaderItemMetadata.indexInSession : i, (i2 & 64) != 0 ? dataUploaderItemMetadata.batteryLevel : d, (i2 & 128) != 0 ? dataUploaderItemMetadata.dataFormatVersion : d2, (i2 & 256) != 0 ? dataUploaderItemMetadata.sessionType : dataUploaderSessionType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUploadingUrl() {
        return this.uploadingUrl;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSessionStartTimeMillis() {
        return this.sessionStartTimeMillis;
    }

    /* renamed from: component5, reason: from getter */
    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    /* renamed from: component6, reason: from getter */
    public final int getIndexInSession() {
        return this.indexInSession;
    }

    /* renamed from: component7, reason: from getter */
    public final double getBatteryLevel() {
        return this.batteryLevel;
    }

    /* renamed from: component8, reason: from getter */
    public final double getDataFormatVersion() {
        return this.dataFormatVersion;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final DataUploaderSessionType getSessionType() {
        return this.sessionType;
    }

    @NotNull
    public final DataUploaderItemMetadata copy(@NotNull String uploadingUrl, @NotNull String apiKey, @NotNull String spaceId, long sessionStartTimeMillis, long startTimeMillis, int indexInSession, double batteryLevel, double dataFormatVersion, @NotNull DataUploaderSessionType sessionType) {
        Intrinsics.h(uploadingUrl, "uploadingUrl");
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(sessionType, "sessionType");
        return new DataUploaderItemMetadata(uploadingUrl, apiKey, spaceId, sessionStartTimeMillis, startTimeMillis, indexInSession, batteryLevel, dataFormatVersion, sessionType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataUploaderItemMetadata)) {
            return false;
        }
        DataUploaderItemMetadata dataUploaderItemMetadata = (DataUploaderItemMetadata) other;
        return Intrinsics.c(this.uploadingUrl, dataUploaderItemMetadata.uploadingUrl) && Intrinsics.c(this.apiKey, dataUploaderItemMetadata.apiKey) && Intrinsics.c(this.spaceId, dataUploaderItemMetadata.spaceId) && this.sessionStartTimeMillis == dataUploaderItemMetadata.sessionStartTimeMillis && this.startTimeMillis == dataUploaderItemMetadata.startTimeMillis && this.indexInSession == dataUploaderItemMetadata.indexInSession && Double.compare(this.batteryLevel, dataUploaderItemMetadata.batteryLevel) == 0 && Double.compare(this.dataFormatVersion, dataUploaderItemMetadata.dataFormatVersion) == 0 && this.sessionType == dataUploaderItemMetadata.sessionType;
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    public final double getBatteryLevel() {
        return this.batteryLevel;
    }

    public final double getDataFormatVersion() {
        return this.dataFormatVersion;
    }

    public final int getIndexInSession() {
        return this.indexInSession;
    }

    public final long getSessionStartTimeMillis() {
        return this.sessionStartTimeMillis;
    }

    @NotNull
    public final DataUploaderSessionType getSessionType() {
        return this.sessionType;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    @NotNull
    public final String getUploadingUrl() {
        return this.uploadingUrl;
    }

    public int hashCode() {
        return this.sessionType.hashCode() + J.a(this.dataFormatVersion, J.a(this.batteryLevel, me.oriient.internal.services.config.a.a(this.indexInSession, K.a(this.startTimeMillis, K.a(this.sessionStartTimeMillis, me.oriient.internal.infra.rest.a.a(this.spaceId, me.oriient.internal.infra.rest.a.a(this.apiKey, this.uploadingUrl.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "DataUploaderItemMetadata(uploadingUrl=" + this.uploadingUrl + ", apiKey=" + this.apiKey + ", spaceId=" + this.spaceId + ", sessionStartTimeMillis=" + this.sessionStartTimeMillis + ", startTimeMillis=" + this.startTimeMillis + ", indexInSession=" + this.indexInSession + ", batteryLevel=" + this.batteryLevel + ", dataFormatVersion=" + this.dataFormatVersion + ", sessionType=" + this.sessionType + ')';
    }
}
