package me.oriient.internal.services.uploadingManager;

import androidx.annotation.Keep;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.uploadingManager.models.DataUploaderDataType;
import me.oriient.internal.services.uploadingManager.models.DataUploaderItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u001e"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager;", "", "allSessionsDirectories", "", "", "dataType", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "calculateStoredRecordsData", "Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager$FileManagerStats;", "compress", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/internal/infra/utils/core/OriientError;", "item", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;", "(Lme/oriient/internal/services/uploadingManager/models/DataUploaderItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compressedFilePath", "doesCompressedFileExist", "", "doesOriginalFileExist", "fileHandle", "Ljava/io/File;", "originalFilePath", "printStatus", "removeCompressedFile", "removeOriginalFile", "removeSessionData", "sessionId", "Companion", "FileManagerStats", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataUploaderFilesManager {

    @NotNull
    public static final String COMPRESSION_EXTENSION = "gzip";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager$Companion;", "", "()V", "COMPRESSION_EXTENSION", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String COMPRESSION_EXTENSION = "gzip";

        private Companion() {
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lme/oriient/internal/services/uploadingManager/DataUploaderFilesManager$FileManagerStats;", "", "recordsCount", "", "totalSizeBytes", "", "freeSizeBytes", "(IJJ)V", "getFreeSizeBytes", "()J", "getRecordsCount", "()I", "getTotalSizeBytes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileManagerStats {
        private final long freeSizeBytes;
        private final int recordsCount;
        private final long totalSizeBytes;

        public FileManagerStats(int i, long j, long j2) {
            this.recordsCount = i;
            this.totalSizeBytes = j;
            this.freeSizeBytes = j2;
        }

        public static /* synthetic */ FileManagerStats copy$default(FileManagerStats fileManagerStats, int i, long j, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = fileManagerStats.recordsCount;
            }
            if ((i2 & 2) != 0) {
                j = fileManagerStats.totalSizeBytes;
            }
            if ((i2 & 4) != 0) {
                j2 = fileManagerStats.freeSizeBytes;
            }
            return fileManagerStats.copy(i, j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRecordsCount() {
            return this.recordsCount;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTotalSizeBytes() {
            return this.totalSizeBytes;
        }

        /* renamed from: component3, reason: from getter */
        public final long getFreeSizeBytes() {
            return this.freeSizeBytes;
        }

        @NotNull
        public final FileManagerStats copy(int recordsCount, long totalSizeBytes, long freeSizeBytes) {
            return new FileManagerStats(recordsCount, totalSizeBytes, freeSizeBytes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileManagerStats)) {
                return false;
            }
            FileManagerStats fileManagerStats = (FileManagerStats) other;
            return this.recordsCount == fileManagerStats.recordsCount && this.totalSizeBytes == fileManagerStats.totalSizeBytes && this.freeSizeBytes == fileManagerStats.freeSizeBytes;
        }

        public final long getFreeSizeBytes() {
            return this.freeSizeBytes;
        }

        public final int getRecordsCount() {
            return this.recordsCount;
        }

        public final long getTotalSizeBytes() {
            return this.totalSizeBytes;
        }

        public int hashCode() {
            return Long.hashCode(this.freeSizeBytes) + me.oriient.internal.infra.locationManager.K.a(this.totalSizeBytes, Integer.hashCode(this.recordsCount) * 31, 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("FileManagerStats(recordsCount=");
            sb.append(this.recordsCount);
            sb.append(", totalSizeBytes=");
            sb.append(this.totalSizeBytes);
            sb.append(", freeSizeBytes=");
            return androidx.camera.core.impl.b.q(sb, this.freeSizeBytes, ')');
        }
    }

    @NotNull
    List<String> allSessionsDirectories(@NotNull DataUploaderDataType dataType);

    @NotNull
    FileManagerStats calculateStoredRecordsData();

    @Nullable
    Object compress(@NotNull DataUploaderItem dataUploaderItem, @NotNull Continuation<? super Outcome<Unit, OriientError>> continuation);

    @NotNull
    String compressedFilePath(@NotNull DataUploaderItem item);

    boolean doesCompressedFileExist(@NotNull DataUploaderItem item);

    boolean doesOriginalFileExist(@NotNull DataUploaderItem item);

    @NotNull
    File fileHandle(@NotNull DataUploaderItem item);

    @NotNull
    String originalFilePath(@NotNull DataUploaderItem item);

    void printStatus(@NotNull DataUploaderDataType dataType);

    void removeCompressedFile(@NotNull DataUploaderItem item);

    void removeOriginalFile(@NotNull DataUploaderItem item);

    void removeSessionData(@NotNull String sessionId, @NotNull DataUploaderDataType dataType);
}
