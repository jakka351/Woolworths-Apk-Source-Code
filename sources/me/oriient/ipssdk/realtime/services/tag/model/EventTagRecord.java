package me.oriient.ipssdk.realtime.services.tag.model;

import YU.a;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lme/oriient/ipssdk/realtime/services/tag/model/EventTagRecord;", "", "tag", "Lme/oriient/ipssdk/realtime/services/tag/model/EventTag;", "spaceId", "", "status", "Lme/oriient/ipssdk/realtime/services/tag/model/TagSendingStatus;", "retries", "", "(Lme/oriient/ipssdk/realtime/services/tag/model/EventTag;Ljava/lang/String;Lme/oriient/ipssdk/realtime/services/tag/model/TagSendingStatus;I)V", "getRetries", "()I", "getSpaceId", "()Ljava/lang/String;", "setSpaceId", "(Ljava/lang/String;)V", "getStatus", "()Lme/oriient/ipssdk/realtime/services/tag/model/TagSendingStatus;", "setStatus", "(Lme/oriient/ipssdk/realtime/services/tag/model/TagSendingStatus;)V", "getTag", "()Lme/oriient/ipssdk/realtime/services/tag/model/EventTag;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EventTagRecord {
    private final int retries;

    @Nullable
    private String spaceId;

    @NotNull
    private TagSendingStatus status;

    @NotNull
    private final EventTag tag;

    public EventTagRecord(@NotNull EventTag tag, @Nullable String str, @NotNull TagSendingStatus status, int i) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(status, "status");
        this.tag = tag;
        this.spaceId = str;
        this.status = status;
        this.retries = i;
    }

    public static /* synthetic */ EventTagRecord copy$default(EventTagRecord eventTagRecord, EventTag eventTag, String str, TagSendingStatus tagSendingStatus, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eventTag = eventTagRecord.tag;
        }
        if ((i2 & 2) != 0) {
            str = eventTagRecord.spaceId;
        }
        if ((i2 & 4) != 0) {
            tagSendingStatus = eventTagRecord.status;
        }
        if ((i2 & 8) != 0) {
            i = eventTagRecord.retries;
        }
        return eventTagRecord.copy(eventTag, str, tagSendingStatus, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EventTag getTag() {
        return this.tag;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TagSendingStatus getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRetries() {
        return this.retries;
    }

    @NotNull
    public final EventTagRecord copy(@NotNull EventTag tag, @Nullable String spaceId, @NotNull TagSendingStatus status, int retries) {
        Intrinsics.h(tag, "tag");
        Intrinsics.h(status, "status");
        return new EventTagRecord(tag, spaceId, status, retries);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventTagRecord)) {
            return false;
        }
        EventTagRecord eventTagRecord = (EventTagRecord) other;
        return Intrinsics.c(this.tag, eventTagRecord.tag) && Intrinsics.c(this.spaceId, eventTagRecord.spaceId) && this.status == eventTagRecord.status && this.retries == eventTagRecord.retries;
    }

    public final int getRetries() {
        return this.retries;
    }

    @Nullable
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    public final TagSendingStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final EventTag getTag() {
        return this.tag;
    }

    public int hashCode() {
        int iHashCode = this.tag.hashCode() * 31;
        String str = this.spaceId;
        return Integer.hashCode(this.retries) + ((this.status.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final void setSpaceId(@Nullable String str) {
        this.spaceId = str;
    }

    public final void setStatus(@NotNull TagSendingStatus tagSendingStatus) {
        Intrinsics.h(tagSendingStatus, "<set-?>");
        this.status = tagSendingStatus;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EventTagRecord(tag=");
        sb.append(this.tag);
        sb.append(", spaceId=");
        sb.append(this.spaceId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", retries=");
        return a.l(sb, this.retries, ')');
    }

    public /* synthetic */ EventTagRecord(EventTag eventTag, String str, TagSendingStatus tagSendingStatus, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventTag, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? TagSendingStatus.NEW : tagSendingStatus, (i2 & 8) != 0 ? 0 : i);
    }
}
