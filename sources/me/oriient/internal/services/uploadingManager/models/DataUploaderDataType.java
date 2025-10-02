package me.oriient.internal.services.uploadingManager.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.rest.HttpEncoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "", "shouldApplyCompression", "", "formatVersionTypeKey", "", "strValue", "contentEncoding", "Lme/oriient/internal/infra/rest/HttpEncoding;", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Lme/oriient/internal/infra/rest/HttpEncoding;)V", "getContentEncoding", "()Lme/oriient/internal/infra/rest/HttpEncoding;", "getFormatVersionTypeKey", "()Ljava/lang/String;", "getShouldApplyCompression", "()Z", "getStrValue", "SENSOR", "POSITION", "VALIDATION", "APP_EVENTS", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataUploaderDataType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataUploaderDataType[] $VALUES;
    public static final DataUploaderDataType APP_EVENTS;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final DataUploaderDataType POSITION;
    public static final DataUploaderDataType SENSOR = new DataUploaderDataType("SENSOR", 0, true, "rsmpFormatVersion", "sensor", null, 8, null);
    public static final DataUploaderDataType VALIDATION;

    @Nullable
    private final HttpEncoding contentEncoding;

    @NotNull
    private final String formatVersionTypeKey;
    private final boolean shouldApplyCompression;

    @NotNull
    private final String strValue;

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType$Companion;", "", "()V", "from", "Lme/oriient/internal/services/uploadingManager/models/DataUploaderDataType;", "rawValue", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final DataUploaderDataType from(@NotNull String rawValue) {
            Intrinsics.h(rawValue, "rawValue");
            for (DataUploaderDataType dataUploaderDataType : DataUploaderDataType.values()) {
                if (Intrinsics.c(dataUploaderDataType.getStrValue(), rawValue)) {
                    return dataUploaderDataType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ DataUploaderDataType[] $values() {
        return new DataUploaderDataType[]{SENSOR, POSITION, VALIDATION, APP_EVENTS};
    }

    static {
        HttpEncoding httpEncoding = HttpEncoding.GZIP;
        POSITION = new DataUploaderDataType("POSITION", 1, true, "positionFormatVersion", "position", httpEncoding);
        VALIDATION = new DataUploaderDataType("VALIDATION", 2, false, "validationFormatVersion", "validation", null, 8, null);
        APP_EVENTS = new DataUploaderDataType("APP_EVENTS", 3, true, "eventsFormatVersion", "events", httpEncoding);
        DataUploaderDataType[] dataUploaderDataTypeArr$values = $values();
        $VALUES = dataUploaderDataTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(dataUploaderDataTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private DataUploaderDataType(String str, int i, boolean z, String str2, String str3, HttpEncoding httpEncoding) {
        this.shouldApplyCompression = z;
        this.formatVersionTypeKey = str2;
        this.strValue = str3;
        this.contentEncoding = httpEncoding;
    }

    @NotNull
    public static EnumEntries<DataUploaderDataType> getEntries() {
        return $ENTRIES;
    }

    public static DataUploaderDataType valueOf(String str) {
        return (DataUploaderDataType) Enum.valueOf(DataUploaderDataType.class, str);
    }

    public static DataUploaderDataType[] values() {
        return (DataUploaderDataType[]) $VALUES.clone();
    }

    @Nullable
    public final HttpEncoding getContentEncoding() {
        return this.contentEncoding;
    }

    @NotNull
    public final String getFormatVersionTypeKey() {
        return this.formatVersionTypeKey;
    }

    public final boolean getShouldApplyCompression() {
        return this.shouldApplyCompression;
    }

    @NotNull
    public final String getStrValue() {
        return this.strValue;
    }

    public /* synthetic */ DataUploaderDataType(String str, int i, boolean z, String str2, String str3, HttpEncoding httpEncoding, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, z, str2, str3, (i2 & 8) != 0 ? null : httpEncoding);
    }
}
