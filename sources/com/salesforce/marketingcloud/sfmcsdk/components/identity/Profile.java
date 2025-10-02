package com.salesforce.marketingcloud.sfmcsdk.components.identity;

import android.support.v4.media.session.a;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J+\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Profile;", "", "profileId", "", k.a.h, "", "(Ljava/lang/String;Ljava/util/Map;)V", "getAttributes", "()Ljava/util/Map;", "getProfileId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Profile {

    @NotNull
    private final Map<String, String> attributes;

    @NotNull
    private final String profileId;

    public Profile(@NotNull String profileId, @NotNull Map<String, String> attributes) {
        Intrinsics.h(profileId, "profileId");
        Intrinsics.h(attributes, "attributes");
        this.profileId = profileId;
        this.attributes = attributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Profile copy$default(Profile profile, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profile.profileId;
        }
        if ((i & 2) != 0) {
            map = profile.attributes;
        }
        return profile.copy(str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProfileId() {
        return this.profileId;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.attributes;
    }

    @NotNull
    public final Profile copy(@NotNull String profileId, @NotNull Map<String, String> attributes) {
        Intrinsics.h(profileId, "profileId");
        Intrinsics.h(attributes, "attributes");
        return new Profile(profileId, attributes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) other;
        return Intrinsics.c(this.profileId, profile.profileId) && Intrinsics.c(this.attributes, profile.attributes);
    }

    @NotNull
    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final String getProfileId() {
        return this.profileId;
    }

    public int hashCode() {
        return this.attributes.hashCode() + (this.profileId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Profile(profileId=");
        sb.append(this.profileId);
        sb.append(", attributes=");
        return a.u(sb, this.attributes, ')');
    }
}
