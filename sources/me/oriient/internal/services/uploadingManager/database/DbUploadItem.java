package me.oriient.internal.services.uploadingManager.database;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.infra.scheduler.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\u0095\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0007HÆ\u0001J\u0013\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\b\u00106\u001a\u00020\u0003H\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019¨\u00067"}, d2 = {"Lme/oriient/internal/services/uploadingManager/database/DbUploadItem;", "", "id", "", "sessionId", "dataType", "isLast", "", "endReason", "uploadFilename", "uploadingStatus", "bytesCount", "", "stopTimeMillis", "compression", "metadata", "", "clientMetadata", "shouldBeUploaded", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;[B[BZ)V", "getBytesCount", "()J", "getClientMetadata", "()[B", "getCompression", "()Ljava/lang/String;", "getDataType", "getEndReason", "getId", "()Z", "getMetadata", "getSessionId", "getShouldBeUploaded", "getStopTimeMillis", "getUploadFilename", "getUploadingStatus", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DbUploadItem {
    private final long bytesCount;

    @Nullable
    private final byte[] clientMetadata;

    @Nullable
    private final String compression;

    @NotNull
    private final String dataType;

    @Nullable
    private final String endReason;

    @NotNull
    private final String id;
    private final boolean isLast;

    @NotNull
    private final byte[] metadata;

    @NotNull
    private final String sessionId;
    private final boolean shouldBeUploaded;
    private final long stopTimeMillis;

    @Nullable
    private final String uploadFilename;

    @Nullable
    private final String uploadingStatus;

    public DbUploadItem(@NotNull String id, @NotNull String sessionId, @NotNull String dataType, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, long j, long j2, @Nullable String str4, @NotNull byte[] metadata, @Nullable byte[] bArr, boolean z2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(metadata, "metadata");
        this.id = id;
        this.sessionId = sessionId;
        this.dataType = dataType;
        this.isLast = z;
        this.endReason = str;
        this.uploadFilename = str2;
        this.uploadingStatus = str3;
        this.bytesCount = j;
        this.stopTimeMillis = j2;
        this.compression = str4;
        this.metadata = metadata;
        this.clientMetadata = bArr;
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
    public final byte[] getMetadata() {
        return this.metadata;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final byte[] getClientMetadata() {
        return this.clientMetadata;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShouldBeUploaded() {
        return this.shouldBeUploaded;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDataType() {
        return this.dataType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getEndReason() {
        return this.endReason;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getUploadFilename() {
        return this.uploadFilename;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getUploadingStatus() {
        return this.uploadingStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final long getBytesCount() {
        return this.bytesCount;
    }

    /* renamed from: component9, reason: from getter */
    public final long getStopTimeMillis() {
        return this.stopTimeMillis;
    }

    @NotNull
    public final DbUploadItem copy(@NotNull String id, @NotNull String sessionId, @NotNull String dataType, boolean isLast, @Nullable String endReason, @Nullable String uploadFilename, @Nullable String uploadingStatus, long bytesCount, long stopTimeMillis, @Nullable String compression, @NotNull byte[] metadata, @Nullable byte[] clientMetadata, boolean shouldBeUploaded) {
        Intrinsics.h(id, "id");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(dataType, "dataType");
        Intrinsics.h(metadata, "metadata");
        return new DbUploadItem(id, sessionId, dataType, isLast, endReason, uploadFilename, uploadingStatus, bytesCount, stopTimeMillis, compression, metadata, clientMetadata, shouldBeUploaded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbUploadItem)) {
            return false;
        }
        DbUploadItem dbUploadItem = (DbUploadItem) other;
        return Intrinsics.c(this.id, dbUploadItem.id) && Intrinsics.c(this.sessionId, dbUploadItem.sessionId) && Intrinsics.c(this.dataType, dbUploadItem.dataType) && this.isLast == dbUploadItem.isLast && Intrinsics.c(this.endReason, dbUploadItem.endReason) && Intrinsics.c(this.uploadFilename, dbUploadItem.uploadFilename) && Intrinsics.c(this.uploadingStatus, dbUploadItem.uploadingStatus) && this.bytesCount == dbUploadItem.bytesCount && this.stopTimeMillis == dbUploadItem.stopTimeMillis && Intrinsics.c(this.compression, dbUploadItem.compression) && Intrinsics.c(this.metadata, dbUploadItem.metadata) && Intrinsics.c(this.clientMetadata, dbUploadItem.clientMetadata) && this.shouldBeUploaded == dbUploadItem.shouldBeUploaded;
    }

    public final long getBytesCount() {
        return this.bytesCount;
    }

    @Nullable
    public final byte[] getClientMetadata() {
        return this.clientMetadata;
    }

    @Nullable
    public final String getCompression() {
        return this.compression;
    }

    @NotNull
    public final String getDataType() {
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
    public final byte[] getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
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

    @Nullable
    public final String getUploadingStatus() {
        return this.uploadingStatus;
    }

    public int hashCode() {
        int iA = a.a(this.isLast, me.oriient.internal.infra.rest.a.a(this.dataType, me.oriient.internal.infra.rest.a.a(this.sessionId, this.id.hashCode() * 31, 31), 31), 31);
        String str = this.endReason;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uploadFilename;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uploadingStatus;
        int iA2 = K.a(this.stopTimeMillis, K.a(this.bytesCount, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.compression;
        int iD = androidx.compose.ui.input.pointer.a.d((iA2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.metadata);
        byte[] bArr = this.clientMetadata;
        return Boolean.hashCode(this.shouldBeUploaded) + ((iD + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31);
    }

    public final boolean isLast() {
        return this.isLast;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("\n  |DbUploadItem [\n  |  id: ");
        sb.append(this.id);
        sb.append("\n  |  sessionId: ");
        sb.append(this.sessionId);
        sb.append("\n  |  dataType: ");
        sb.append(this.dataType);
        sb.append("\n  |  isLast: ");
        sb.append(this.isLast);
        sb.append("\n  |  endReason: ");
        sb.append(this.endReason);
        sb.append("\n  |  uploadFilename: ");
        sb.append(this.uploadFilename);
        sb.append("\n  |  uploadingStatus: ");
        sb.append(this.uploadingStatus);
        sb.append("\n  |  bytesCount: ");
        sb.append(this.bytesCount);
        sb.append("\n  |  stopTimeMillis: ");
        sb.append(this.stopTimeMillis);
        sb.append("\n  |  compression: ");
        sb.append(this.compression);
        sb.append("\n  |  metadata: ");
        String string = Arrays.toString(this.metadata);
        Intrinsics.g(string, "toString(...)");
        sb.append(string);
        sb.append("\n  |  clientMetadata: ");
        sb.append(this.clientMetadata);
        sb.append("\n  |  shouldBeUploaded: ");
        sb.append(this.shouldBeUploaded);
        sb.append("\n  |]\n  ");
        return StringsKt.n0(sb.toString());
    }
}
