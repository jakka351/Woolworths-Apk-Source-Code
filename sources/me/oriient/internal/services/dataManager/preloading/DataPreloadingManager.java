package me.oriient.internal.services.dataManager.preloading;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.internal.infra.utils.core.OriientError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "errors", "Lkotlinx/coroutines/flow/SharedFlow;", "Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingError;", "getErrors", "()Lkotlinx/coroutines/flow/SharedFlow;", "preloadingStatusUpdates", "Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatusUpdate;", "getPreloadingStatusUpdates", "cancelAllPreloadingProcesses", "", "cancelPreloading", "buildingId", "", "getPreloadingStatus", "Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatus;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preloadData", "PreloadingError", "PreloadingStatus", "PreloadingStatusUpdate", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DataPreloadingManager extends DiProvidable {

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingError;", "", "buildingId", "", "error", "Lme/oriient/internal/infra/utils/core/OriientError;", "(Ljava/lang/String;Lme/oriient/internal/infra/utils/core/OriientError;)V", "getBuildingId", "()Ljava/lang/String;", "getError", "()Lme/oriient/internal/infra/utils/core/OriientError;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PreloadingError {

        @NotNull
        private final String buildingId;

        @NotNull
        private final OriientError error;

        public PreloadingError(@NotNull String buildingId, @NotNull OriientError error) {
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(error, "error");
            this.buildingId = buildingId;
            this.error = error;
        }

        public static /* synthetic */ PreloadingError copy$default(PreloadingError preloadingError, String str, OriientError oriientError, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preloadingError.buildingId;
            }
            if ((i & 2) != 0) {
                oriientError = preloadingError.error;
            }
            return preloadingError.copy(str, oriientError);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBuildingId() {
            return this.buildingId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OriientError getError() {
            return this.error;
        }

        @NotNull
        public final PreloadingError copy(@NotNull String buildingId, @NotNull OriientError error) {
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(error, "error");
            return new PreloadingError(buildingId, error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreloadingError)) {
                return false;
            }
            PreloadingError preloadingError = (PreloadingError) other;
            return Intrinsics.c(this.buildingId, preloadingError.buildingId) && Intrinsics.c(this.error, preloadingError.error);
        }

        @NotNull
        public final String getBuildingId() {
            return this.buildingId;
        }

        @NotNull
        public final OriientError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode() + (this.buildingId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PreloadingError(buildingId=" + this.buildingId + ", error=" + this.error + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatus;", "", "(Ljava/lang/String;I)V", "NOT_PRELOADED", "IN_PROGRESS", "READY", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PreloadingStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PreloadingStatus[] $VALUES;
        public static final PreloadingStatus NOT_PRELOADED = new PreloadingStatus("NOT_PRELOADED", 0);
        public static final PreloadingStatus IN_PROGRESS = new PreloadingStatus("IN_PROGRESS", 1);
        public static final PreloadingStatus READY = new PreloadingStatus("READY", 2);

        private static final /* synthetic */ PreloadingStatus[] $values() {
            return new PreloadingStatus[]{NOT_PRELOADED, IN_PROGRESS, READY};
        }

        static {
            PreloadingStatus[] preloadingStatusArr$values = $values();
            $VALUES = preloadingStatusArr$values;
            $ENTRIES = EnumEntriesKt.a(preloadingStatusArr$values);
        }

        private PreloadingStatus(String str, int i) {
        }

        @NotNull
        public static EnumEntries<PreloadingStatus> getEntries() {
            return $ENTRIES;
        }

        public static PreloadingStatus valueOf(String str) {
            return (PreloadingStatus) Enum.valueOf(PreloadingStatus.class, str);
        }

        public static PreloadingStatus[] values() {
            return (PreloadingStatus[]) $VALUES.clone();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatusUpdate;", "", "buildingId", "", "status", "Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatus;", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatus;)V", "getBuildingId", "()Ljava/lang/String;", "getStatus", "()Lme/oriient/internal/services/dataManager/preloading/DataPreloadingManager$PreloadingStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PreloadingStatusUpdate {

        @NotNull
        private final String buildingId;

        @NotNull
        private final PreloadingStatus status;

        public PreloadingStatusUpdate(@NotNull String buildingId, @NotNull PreloadingStatus status) {
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(status, "status");
            this.buildingId = buildingId;
            this.status = status;
        }

        public static /* synthetic */ PreloadingStatusUpdate copy$default(PreloadingStatusUpdate preloadingStatusUpdate, String str, PreloadingStatus preloadingStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preloadingStatusUpdate.buildingId;
            }
            if ((i & 2) != 0) {
                preloadingStatus = preloadingStatusUpdate.status;
            }
            return preloadingStatusUpdate.copy(str, preloadingStatus);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBuildingId() {
            return this.buildingId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PreloadingStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final PreloadingStatusUpdate copy(@NotNull String buildingId, @NotNull PreloadingStatus status) {
            Intrinsics.h(buildingId, "buildingId");
            Intrinsics.h(status, "status");
            return new PreloadingStatusUpdate(buildingId, status);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreloadingStatusUpdate)) {
                return false;
            }
            PreloadingStatusUpdate preloadingStatusUpdate = (PreloadingStatusUpdate) other;
            return Intrinsics.c(this.buildingId, preloadingStatusUpdate.buildingId) && this.status == preloadingStatusUpdate.status;
        }

        @NotNull
        public final String getBuildingId() {
            return this.buildingId;
        }

        @NotNull
        public final PreloadingStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode() + (this.buildingId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PreloadingStatusUpdate(buildingId=" + this.buildingId + ", status=" + this.status + ')';
        }
    }

    void cancelAllPreloadingProcesses();

    void cancelPreloading(@NotNull String buildingId);

    @NotNull
    SharedFlow<PreloadingError> getErrors();

    @Nullable
    Object getPreloadingStatus(@NotNull String str, @NotNull Continuation<? super PreloadingStatus> continuation);

    @NotNull
    SharedFlow<PreloadingStatusUpdate> getPreloadingStatusUpdates();

    void preloadData(@NotNull String buildingId);
}
