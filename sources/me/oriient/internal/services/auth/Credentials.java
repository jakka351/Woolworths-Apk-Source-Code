package me.oriient.internal.services.auth;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lme/oriient/internal/services/auth/Credentials;", "", "apiKey", "", "spaceId", "(Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getSpaceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Credentials {

    @NotNull
    private final String apiKey;

    @NotNull
    private final String spaceId;

    public Credentials(@NotNull String apiKey, @NotNull String spaceId) {
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        this.apiKey = apiKey;
        this.spaceId = spaceId;
    }

    public static /* synthetic */ Credentials copy$default(Credentials credentials, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentials.apiKey;
        }
        if ((i & 2) != 0) {
            str2 = credentials.spaceId;
        }
        return credentials.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSpaceId() {
        return this.spaceId;
    }

    @NotNull
    public final Credentials copy(@NotNull String apiKey, @NotNull String spaceId) {
        Intrinsics.h(apiKey, "apiKey");
        Intrinsics.h(spaceId, "spaceId");
        return new Credentials(apiKey, spaceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Credentials)) {
            return false;
        }
        Credentials credentials = (Credentials) other;
        return Intrinsics.c(this.apiKey, credentials.apiKey) && Intrinsics.c(this.spaceId, credentials.spaceId);
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    public final String getSpaceId() {
        return this.spaceId;
    }

    public int hashCode() {
        return this.spaceId.hashCode() + (this.apiKey.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Credentials(apiKey=");
        sb.append(this.apiKey);
        sb.append(", spaceId=");
        return me.oriient.internal.infra.rest.e.a(sb, this.spaceId, ')');
    }
}
