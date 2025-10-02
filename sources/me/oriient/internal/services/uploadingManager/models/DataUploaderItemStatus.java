package me.oriient.internal.services.uploadingManager.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;", "", "(Ljava/lang/String;I)V", "COLLECTING", "READY_FOR_ZIPPING", "ZIPPING", "READY_FOR_UPLOAD", "UPLOADING", "UPLOADED", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataUploaderItemStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataUploaderItemStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final DataUploaderItemStatus COLLECTING = new DataUploaderItemStatus("COLLECTING", 0);
    public static final DataUploaderItemStatus READY_FOR_ZIPPING = new DataUploaderItemStatus("READY_FOR_ZIPPING", 1);
    public static final DataUploaderItemStatus ZIPPING = new DataUploaderItemStatus("ZIPPING", 2);
    public static final DataUploaderItemStatus READY_FOR_UPLOAD = new DataUploaderItemStatus("READY_FOR_UPLOAD", 3);
    public static final DataUploaderItemStatus UPLOADING = new DataUploaderItemStatus("UPLOADING", 4);
    public static final DataUploaderItemStatus UPLOADED = new DataUploaderItemStatus("UPLOADED", 5);

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus$Companion;", "", "()V", "from", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderItemStatus;", "rawValue", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final DataUploaderItemStatus from(@Nullable String rawValue) {
            if (rawValue == null) {
                return null;
            }
            for (DataUploaderItemStatus dataUploaderItemStatus : DataUploaderItemStatus.values()) {
                if (Intrinsics.c(dataUploaderItemStatus.name(), rawValue)) {
                    return dataUploaderItemStatus;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ DataUploaderItemStatus[] $values() {
        return new DataUploaderItemStatus[]{COLLECTING, READY_FOR_ZIPPING, ZIPPING, READY_FOR_UPLOAD, UPLOADING, UPLOADED};
    }

    static {
        DataUploaderItemStatus[] dataUploaderItemStatusArr$values = $values();
        $VALUES = dataUploaderItemStatusArr$values;
        $ENTRIES = EnumEntriesKt.a(dataUploaderItemStatusArr$values);
        INSTANCE = new Companion(null);
    }

    private DataUploaderItemStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<DataUploaderItemStatus> getEntries() {
        return $ENTRIES;
    }

    public static DataUploaderItemStatus valueOf(String str) {
        return (DataUploaderItemStatus) Enum.valueOf(DataUploaderItemStatus.class, str);
    }

    public static DataUploaderItemStatus[] values() {
        return (DataUploaderItemStatus[]) $VALUES.clone();
    }
}
