package me.oriient.ipssdk.realtime.services.tag.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/TagSendingStatus;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "NEW", "IN_PROGRESS", "Companion", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TagSendingStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TagSendingStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int code;
    public static final TagSendingStatus NEW = new TagSendingStatus("NEW", 0, 0);
    public static final TagSendingStatus IN_PROGRESS = new TagSendingStatus("IN_PROGRESS", 1, 1);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/TagSendingStatus$Companion;", "", "", "code", "Lme/oriient/ipssdk/realtime/services/tag/model/TagSendingStatus;", "fromCode", "(I)Lme/oriient/ipssdk/realtime/services/tag/model/TagSendingStatus;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final TagSendingStatus fromCode(int code) {
            if (code != 0 && code == 1) {
                return TagSendingStatus.IN_PROGRESS;
            }
            return TagSendingStatus.NEW;
        }
    }

    private static final /* synthetic */ TagSendingStatus[] $values() {
        return new TagSendingStatus[]{NEW, IN_PROGRESS};
    }

    static {
        TagSendingStatus[] tagSendingStatusArr$values = $values();
        $VALUES = tagSendingStatusArr$values;
        $ENTRIES = EnumEntriesKt.a(tagSendingStatusArr$values);
        INSTANCE = new Companion(null);
    }

    private TagSendingStatus(String str, int i, int i2) {
        this.code = i2;
    }

    @NotNull
    public static EnumEntries<TagSendingStatus> getEntries() {
        return $ENTRIES;
    }

    public static TagSendingStatus valueOf(String str) {
        return (TagSendingStatus) Enum.valueOf(TagSendingStatus.class, str);
    }

    public static TagSendingStatus[] values() {
        return (TagSendingStatus[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
