package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/SignMark;", "", "id", "", TextBundle.TEXT_ENTRY, "coordinates", "Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "metadata", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkMetadata;", "rawMetadata", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkMetadata;Ljava/lang/String;)V", "getCoordinates", "()Lme/oriient/internal/services/dataManager/common/IndoorCoordinate;", "getId", "()Ljava/lang/String;", "getMetadata", "()Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkMetadata;", "getRawMetadata", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SignMark {

    @NotNull
    private final IndoorCoordinate coordinates;

    @NotNull
    private final String id;

    @NotNull
    private final SignMarkMetadata metadata;

    @Nullable
    private final String rawMetadata;

    @NotNull
    private final String text;

    public SignMark(@NotNull String id, @NotNull String text, @NotNull IndoorCoordinate coordinates, @NotNull SignMarkMetadata metadata, @Nullable String str) {
        Intrinsics.h(id, "id");
        Intrinsics.h(text, "text");
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(metadata, "metadata");
        this.id = id;
        this.text = text;
        this.coordinates = coordinates;
        this.metadata = metadata;
        this.rawMetadata = str;
    }

    public static /* synthetic */ SignMark copy$default(SignMark signMark, String str, String str2, IndoorCoordinate indoorCoordinate, SignMarkMetadata signMarkMetadata, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signMark.id;
        }
        if ((i & 2) != 0) {
            str2 = signMark.text;
        }
        if ((i & 4) != 0) {
            indoorCoordinate = signMark.coordinates;
        }
        if ((i & 8) != 0) {
            signMarkMetadata = signMark.metadata;
        }
        if ((i & 16) != 0) {
            str3 = signMark.rawMetadata;
        }
        String str4 = str3;
        IndoorCoordinate indoorCoordinate2 = indoorCoordinate;
        return signMark.copy(str, str2, indoorCoordinate2, signMarkMetadata, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IndoorCoordinate getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final SignMarkMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRawMetadata() {
        return this.rawMetadata;
    }

    @NotNull
    public final SignMark copy(@NotNull String id, @NotNull String text, @NotNull IndoorCoordinate coordinates, @NotNull SignMarkMetadata metadata, @Nullable String rawMetadata) {
        Intrinsics.h(id, "id");
        Intrinsics.h(text, "text");
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(metadata, "metadata");
        return new SignMark(id, text, coordinates, metadata, rawMetadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignMark)) {
            return false;
        }
        SignMark signMark = (SignMark) other;
        return Intrinsics.c(this.id, signMark.id) && Intrinsics.c(this.text, signMark.text) && Intrinsics.c(this.coordinates, signMark.coordinates) && Intrinsics.c(this.metadata, signMark.metadata) && Intrinsics.c(this.rawMetadata, signMark.rawMetadata);
    }

    @NotNull
    public final IndoorCoordinate getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final SignMarkMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    public final String getRawMetadata() {
        return this.rawMetadata;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = (this.metadata.hashCode() + ((this.coordinates.hashCode() + me.oriient.internal.infra.rest.a.a(this.text, this.id.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.rawMetadata;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SignMark(id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", coordinates=");
        sb.append(this.coordinates);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", rawMetadata=");
        return me.oriient.internal.infra.rest.e.a(sb, this.rawMetadata, ')');
    }
}
