package me.oriient.positioningengine.support.engineManager;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;", "", "apiKey", "", "ipsDomain", "spaceId", "userSessionId", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getIpsDomain", "getSpaceId", "getUserId", "getUserSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PositioningEngineCredentials {

    @NotNull
    private final String apiKey;

    @NotNull
    private final String ipsDomain;

    @NotNull
    private final String spaceId;

    @NotNull
    private final String userId;

    @NotNull
    private final String userSessionId;

    public PositioningEngineCredentials(@NotNull String apiKey, @NotNull String ipsDomain, @NotNull String spaceId, @NotNull String userSessionId, @NotNull String userId) {
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(ipsDomain, "ipsDomain");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(userId, "userId");
        this.apiKey = apiKey;
        this.ipsDomain = ipsDomain;
        this.spaceId = spaceId;
        this.userSessionId = userSessionId;
        this.userId = userId;
    }

    public static /* synthetic */ PositioningEngineCredentials copy$default(PositioningEngineCredentials positioningEngineCredentials, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positioningEngineCredentials.apiKey;
        }
        if ((i & 2) != 0) {
            str2 = positioningEngineCredentials.ipsDomain;
        }
        if ((i & 4) != 0) {
            str3 = positioningEngineCredentials.spaceId;
        }
        if ((i & 8) != 0) {
            str4 = positioningEngineCredentials.userSessionId;
        }
        if ((i & 16) != 0) {
            str5 = positioningEngineCredentials.userId;
        }
        String str6 = str5;
        String str7 = str3;
        return positioningEngineCredentials.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIpsDomain() {
        return this.ipsDomain;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final PositioningEngineCredentials copy(@NotNull String apiKey, @NotNull String ipsDomain, @NotNull String spaceId, @NotNull String userSessionId, @NotNull String userId) {
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(ipsDomain, "ipsDomain");
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(userId, "userId");
        return new PositioningEngineCredentials(apiKey, ipsDomain, spaceId, userSessionId, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositioningEngineCredentials)) {
            return false;
        }
        PositioningEngineCredentials positioningEngineCredentials = (PositioningEngineCredentials) other;
        return Intrinsics.c(this.apiKey, positioningEngineCredentials.apiKey) && Intrinsics.c(this.ipsDomain, positioningEngineCredentials.ipsDomain) && Intrinsics.c(this.spaceId, positioningEngineCredentials.spaceId) && Intrinsics.c(this.userSessionId, positioningEngineCredentials.userSessionId) && Intrinsics.c(this.userId, positioningEngineCredentials.userId);
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    public final String getIpsDomain() {
        return this.ipsDomain;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public int hashCode() {
        return this.userId.hashCode() + me.oriient.positioningengine.common.z.a(this.userSessionId, me.oriient.positioningengine.common.z.a(this.spaceId, me.oriient.positioningengine.common.z.a(this.ipsDomain, this.apiKey.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PositioningEngineCredentials(apiKey=");
        sb.append(this.apiKey);
        sb.append(", ipsDomain=");
        sb.append(this.ipsDomain);
        sb.append(", spaceId=");
        sb.append(this.spaceId);
        sb.append(", userSessionId=");
        sb.append(this.userSessionId);
        sb.append(", userId=");
        return androidx.camera.core.impl.b.r(sb, this.userId, ')');
    }
}
