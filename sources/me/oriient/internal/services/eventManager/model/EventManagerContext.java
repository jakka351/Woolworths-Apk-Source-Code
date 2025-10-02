package me.oriient.internal.services.eventManager.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.rest.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u001d"}, d2 = {"Lme/oriient/internal/services/eventManager/model/EventManagerContext;", "", "sessionId", "", "url", "spaceId", "senderId", "senderName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSenderId", "()Ljava/lang/String;", "getSenderName", "setSenderName", "(Ljava/lang/String;)V", "getSessionId", "getSpaceId", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EventManagerContext {

    @NotNull
    private final String senderId;

    @Nullable
    private String senderName;

    @NotNull
    private final String sessionId;

    @NotNull
    private final String spaceId;

    @NotNull
    private final String url;

    public EventManagerContext(@NotNull String sessionId, @NotNull String url, @NotNull String spaceId, @NotNull String senderId, @Nullable String str) {
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(url, "url");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(senderId, "senderId");
        this.sessionId = sessionId;
        this.url = url;
        this.spaceId = spaceId;
        this.senderId = senderId;
        this.senderName = str;
    }

    public static /* synthetic */ EventManagerContext copy$default(EventManagerContext eventManagerContext, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventManagerContext.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = eventManagerContext.url;
        }
        if ((i & 4) != 0) {
            str3 = eventManagerContext.spaceId;
        }
        if ((i & 8) != 0) {
            str4 = eventManagerContext.senderId;
        }
        if ((i & 16) != 0) {
            str5 = eventManagerContext.senderName;
        }
        String str6 = str5;
        String str7 = str3;
        return eventManagerContext.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    public final EventManagerContext copy(@NotNull String sessionId, @NotNull String url, @NotNull String spaceId, @NotNull String senderId, @Nullable String senderName) {
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(url, "url");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(senderId, "senderId");
        return new EventManagerContext(sessionId, url, spaceId, senderId, senderName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventManagerContext)) {
            return false;
        }
        EventManagerContext eventManagerContext = (EventManagerContext) other;
        return Intrinsics.c(this.sessionId, eventManagerContext.sessionId) && Intrinsics.c(this.url, eventManagerContext.url) && Intrinsics.c(this.spaceId, eventManagerContext.spaceId) && Intrinsics.c(this.senderId, eventManagerContext.senderId) && Intrinsics.c(this.senderName, eventManagerContext.senderName);
    }

    @NotNull
    public final String getSenderId() {
        return this.senderId;
    }

    @Nullable
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.rest.a.a(this.senderId, me.oriient.internal.infra.rest.a.a(this.spaceId, me.oriient.internal.infra.rest.a.a(this.url, this.sessionId.hashCode() * 31, 31), 31), 31);
        String str = this.senderName;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final void setSenderName(@Nullable String str) {
        this.senderName = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("EventManagerContext(sessionId=");
        sb.append(this.sessionId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", spaceId=");
        sb.append(this.spaceId);
        sb.append(", senderId=");
        sb.append(this.senderId);
        sb.append(", senderName=");
        return e.a(sb, this.senderName, ')');
    }
}
