package me.oriient.internal.services.uploadingManager.rest;

import androidx.annotation.Keep;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.infra.rest.HttpEncoding;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0017J\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ2\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ4\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H¦@¢\u0006\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest;", "", "sendEndChunk", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "item", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendStartChunk", "Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest$FileUploadDestinationData;", "callerMethod", "", "useJwtAuthentication", "", "(Ljava/lang/String;Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFile", "url", "file", "Ljava/io/File;", "contentEncoding", "Lme/oriient/internal/infra/rest/HttpEncoding;", "(Ljava/lang/String;Ljava/io/File;Lme/oriient/internal/infra/rest/HttpEncoding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FileUploadDestinationData", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataUploaderRest {

    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B7\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J&\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÁ\u0001¢\u0006\u0002\b$R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006'"}, d2 = {"Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest$FileUploadDestinationData;", "", "seen1", "", "uploadUrl", "", "expirationTimeUtc", "", "filename", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;JLjava/lang/String;)V", "getExpirationTimeUtc$annotations", "()V", "getExpirationTimeUtc", "()J", "getFilename", "()Ljava/lang/String;", "getUploadUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class FileUploadDestinationData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private final long expirationTimeUtc;

        @NotNull
        private final String filename;

        @NotNull
        private final String uploadUrl;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest$FileUploadDestinationData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/uploadingManager/rest/DataUploaderRest$FileUploadDestinationData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<FileUploadDestinationData> serializer() {
                return DataUploaderRest$FileUploadDestinationData$$serializer.INSTANCE;
            }
        }

        @Deprecated
        public /* synthetic */ FileUploadDestinationData(int i, String str, @SerialName long j, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.a(i, 7, DataUploaderRest$FileUploadDestinationData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.uploadUrl = str;
            this.expirationTimeUtc = j;
            this.filename = str2;
        }

        public static /* synthetic */ FileUploadDestinationData copy$default(FileUploadDestinationData fileUploadDestinationData, String str, long j, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fileUploadDestinationData.uploadUrl;
            }
            if ((i & 2) != 0) {
                j = fileUploadDestinationData.expirationTimeUtc;
            }
            if ((i & 4) != 0) {
                str2 = fileUploadDestinationData.filename;
            }
            return fileUploadDestinationData.copy(str, j, str2);
        }

        @SerialName
        public static /* synthetic */ void getExpirationTimeUtc$annotations() {
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(FileUploadDestinationData self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.p(serialDesc, 0, self.uploadUrl);
            output.t(serialDesc, 1, self.expirationTimeUtc);
            output.p(serialDesc, 2, self.filename);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUploadUrl() {
            return this.uploadUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final long getExpirationTimeUtc() {
            return this.expirationTimeUtc;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        public final FileUploadDestinationData copy(@NotNull String uploadUrl, long expirationTimeUtc, @NotNull String filename) {
            Intrinsics.h(uploadUrl, "uploadUrl");
            Intrinsics.h(filename, "filename");
            return new FileUploadDestinationData(uploadUrl, expirationTimeUtc, filename);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileUploadDestinationData)) {
                return false;
            }
            FileUploadDestinationData fileUploadDestinationData = (FileUploadDestinationData) other;
            return Intrinsics.c(this.uploadUrl, fileUploadDestinationData.uploadUrl) && this.expirationTimeUtc == fileUploadDestinationData.expirationTimeUtc && Intrinsics.c(this.filename, fileUploadDestinationData.filename);
        }

        public final long getExpirationTimeUtc() {
            return this.expirationTimeUtc;
        }

        @NotNull
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        public final String getUploadUrl() {
            return this.uploadUrl;
        }

        public int hashCode() {
            return this.filename.hashCode() + K.a(this.expirationTimeUtc, this.uploadUrl.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("FileUploadDestinationData(uploadUrl=");
            sb.append(this.uploadUrl);
            sb.append(", expirationTimeUtc=");
            sb.append(this.expirationTimeUtc);
            sb.append(", filename=");
            return me.oriient.internal.infra.rest.e.a(sb, this.filename, ')');
        }

        public FileUploadDestinationData(@NotNull String uploadUrl, long j, @NotNull String filename) {
            Intrinsics.h(uploadUrl, "uploadUrl");
            Intrinsics.h(filename, "filename");
            this.uploadUrl = uploadUrl;
            this.expirationTimeUtc = j;
            this.filename = filename;
        }
    }

    @Nullable
    Object sendEndChunk(@NotNull DataUploaderItem dataUploaderItem, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation);

    @Nullable
    Object sendStartChunk(@NotNull String str, @NotNull DataUploaderItem dataUploaderItem, boolean z, @NotNull Continuation<? super Outcome<FileUploadDestinationData, OriientError>> continuation);

    @Nullable
    Object uploadFile(@NotNull String str, @NotNull File file, @Nullable HttpEncoding httpEncoding, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation);
}
