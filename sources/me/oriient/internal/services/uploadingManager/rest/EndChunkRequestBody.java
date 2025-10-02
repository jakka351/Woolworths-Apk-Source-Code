package me.oriient.internal.services.uploadingManager.rest;

import androidx.annotation.Keep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ?2\u00020\u0001:\u0002>?B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bq\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017BU\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0018J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0014HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003Jm\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00102\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0006HÖ\u0001J\t\u00105\u001a\u00020\bHÖ\u0001J&\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<HÁ\u0001¢\u0006\u0002\b=R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010%R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a¨\u0006@"}, d2 = {"Lme/oriient/internal/services/uploadingManager/rest/EndChunkRequestBody;", "", "item", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;)V", "seen1", "", "apiKeyId", "", "sessionId", "filename", "chunkStartTimeMilliUtc", "", "chunkEndTimeMilliUtc", "chunkDurationMilli", "chunkSize", "", "chunkNum", "endReason", "isLast", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJDILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJDILjava/lang/String;Z)V", "getApiKeyId", "()Ljava/lang/String;", "getChunkDurationMilli", "()J", "getChunkEndTimeMilliUtc", "getChunkNum", "()I", "getChunkSize", "()D", "getChunkStartTimeMilliUtc", "getEndReason", "getFilename", "()Z", "getSessionId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class EndChunkRequestBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final String apiKeyId;
    private final long chunkDurationMilli;
    private final long chunkEndTimeMilliUtc;
    private final int chunkNum;
    private final double chunkSize;
    private final long chunkStartTimeMilliUtc;

    @NotNull
    private final String endReason;

    @NotNull
    private final String filename;
    private final boolean isLast;

    @NotNull
    private final String sessionId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/uploadingManager/rest/EndChunkRequestBody$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/uploadingManager/rest/EndChunkRequestBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<EndChunkRequestBody> serializer() {
            return EndChunkRequestBody$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ EndChunkRequestBody(int i, String str, String str2, String str3, long j, long j2, long j3, double d, int i2, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.a(i, 1023, EndChunkRequestBody$$serializer.INSTANCE.getB());
            throw null;
        }
        this.apiKeyId = str;
        this.sessionId = str2;
        this.filename = str3;
        this.chunkStartTimeMilliUtc = j;
        this.chunkEndTimeMilliUtc = j2;
        this.chunkDurationMilli = j3;
        this.chunkSize = d;
        this.chunkNum = i2;
        this.endReason = str4;
        this.isLast = z;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(EndChunkRequestBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.apiKeyId);
        output.p(serialDesc, 1, self.sessionId);
        output.p(serialDesc, 2, self.filename);
        output.t(serialDesc, 3, self.chunkStartTimeMilliUtc);
        output.t(serialDesc, 4, self.chunkEndTimeMilliUtc);
        output.t(serialDesc, 5, self.chunkDurationMilli);
        output.G(serialDesc, 6, self.chunkSize);
        output.C(7, self.chunkNum, serialDesc);
        output.p(serialDesc, 8, self.endReason);
        output.o(serialDesc, 9, self.isLast);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApiKeyId() {
        return this.apiKeyId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* renamed from: component4, reason: from getter */
    public final long getChunkStartTimeMilliUtc() {
        return this.chunkStartTimeMilliUtc;
    }

    /* renamed from: component5, reason: from getter */
    public final long getChunkEndTimeMilliUtc() {
        return this.chunkEndTimeMilliUtc;
    }

    /* renamed from: component6, reason: from getter */
    public final long getChunkDurationMilli() {
        return this.chunkDurationMilli;
    }

    /* renamed from: component7, reason: from getter */
    public final double getChunkSize() {
        return this.chunkSize;
    }

    /* renamed from: component8, reason: from getter */
    public final int getChunkNum() {
        return this.chunkNum;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getEndReason() {
        return this.endReason;
    }

    @NotNull
    public final EndChunkRequestBody copy(@NotNull String apiKeyId, @NotNull String sessionId, @NotNull String filename, long chunkStartTimeMilliUtc, long chunkEndTimeMilliUtc, long chunkDurationMilli, double chunkSize, int chunkNum, @NotNull String endReason, boolean isLast) {
        Intrinsics.h(apiKeyId, "apiKeyId");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(filename, "filename");
        Intrinsics.h(endReason, "endReason");
        return new EndChunkRequestBody(apiKeyId, sessionId, filename, chunkStartTimeMilliUtc, chunkEndTimeMilliUtc, chunkDurationMilli, chunkSize, chunkNum, endReason, isLast);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndChunkRequestBody)) {
            return false;
        }
        EndChunkRequestBody endChunkRequestBody = (EndChunkRequestBody) other;
        return Intrinsics.c(this.apiKeyId, endChunkRequestBody.apiKeyId) && Intrinsics.c(this.sessionId, endChunkRequestBody.sessionId) && Intrinsics.c(this.filename, endChunkRequestBody.filename) && this.chunkStartTimeMilliUtc == endChunkRequestBody.chunkStartTimeMilliUtc && this.chunkEndTimeMilliUtc == endChunkRequestBody.chunkEndTimeMilliUtc && this.chunkDurationMilli == endChunkRequestBody.chunkDurationMilli && Double.compare(this.chunkSize, endChunkRequestBody.chunkSize) == 0 && this.chunkNum == endChunkRequestBody.chunkNum && Intrinsics.c(this.endReason, endChunkRequestBody.endReason) && this.isLast == endChunkRequestBody.isLast;
    }

    @NotNull
    public final String getApiKeyId() {
        return this.apiKeyId;
    }

    public final long getChunkDurationMilli() {
        return this.chunkDurationMilli;
    }

    public final long getChunkEndTimeMilliUtc() {
        return this.chunkEndTimeMilliUtc;
    }

    public final int getChunkNum() {
        return this.chunkNum;
    }

    public final double getChunkSize() {
        return this.chunkSize;
    }

    public final long getChunkStartTimeMilliUtc() {
        return this.chunkStartTimeMilliUtc;
    }

    @NotNull
    public final String getEndReason() {
        return this.endReason;
    }

    @NotNull
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLast) + me.oriient.internal.infra.rest.a.a(this.endReason, me.oriient.internal.services.config.a.a(this.chunkNum, J.a(this.chunkSize, K.a(this.chunkDurationMilli, K.a(this.chunkEndTimeMilliUtc, K.a(this.chunkStartTimeMilliUtc, me.oriient.internal.infra.rest.a.a(this.filename, me.oriient.internal.infra.rest.a.a(this.sessionId, this.apiKeyId.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isLast() {
        return this.isLast;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EndChunkRequestBody(apiKeyId=");
        sb.append(this.apiKeyId);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", filename=");
        sb.append(this.filename);
        sb.append(", chunkStartTimeMilliUtc=");
        sb.append(this.chunkStartTimeMilliUtc);
        sb.append(", chunkEndTimeMilliUtc=");
        sb.append(this.chunkEndTimeMilliUtc);
        sb.append(", chunkDurationMilli=");
        sb.append(this.chunkDurationMilli);
        sb.append(", chunkSize=");
        sb.append(this.chunkSize);
        sb.append(", chunkNum=");
        sb.append(this.chunkNum);
        sb.append(", endReason=");
        sb.append(this.endReason);
        sb.append(", isLast=");
        return androidx.camera.core.impl.b.s(sb, this.isLast, ')');
    }

    public EndChunkRequestBody(@NotNull String apiKeyId, @NotNull String sessionId, @NotNull String filename, long j, long j2, long j3, double d, int i, @NotNull String endReason, boolean z) {
        Intrinsics.h(apiKeyId, "apiKeyId");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(filename, "filename");
        Intrinsics.h(endReason, "endReason");
        this.apiKeyId = apiKeyId;
        this.sessionId = sessionId;
        this.filename = filename;
        this.chunkStartTimeMilliUtc = j;
        this.chunkEndTimeMilliUtc = j2;
        this.chunkDurationMilli = j3;
        this.chunkSize = d;
        this.chunkNum = i;
        this.endReason = endReason;
        this.isLast = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EndChunkRequestBody(@NotNull DataUploaderItem item) {
        Intrinsics.h(item, "item");
        String apiKey = item.getMetadata().getApiKey();
        String sessionId = item.getSessionId();
        String uploadFilename = item.getUploadFilename();
        uploadFilename = uploadFilename == null ? "" : uploadFilename;
        long startTimeMillis = item.getMetadata().getStartTimeMillis();
        long stopTimeMillis = item.getStopTimeMillis();
        long jAbs = Math.abs(item.getStopTimeMillis() - item.getMetadata().getStartTimeMillis());
        double bytesCount = item.getBytesCount() / 1024.0d;
        int indexInSession = item.getMetadata().getIndexInSession();
        String endReason = item.getEndReason();
        this(apiKey, sessionId, uploadFilename, startTimeMillis, stopTimeMillis, jAbs, bytesCount, indexInSession, endReason == null ? "" : endReason, item.isLast());
    }
}
