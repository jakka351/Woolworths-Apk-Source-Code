package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.common.ofs.L;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSSignMark;", "", "id", "", TextBundle.TEXT_ENTRY, "coordinates", "Lme/oriient/ipssdk/api/models/IPSCoordinate;", "metadata", "Lme/oriient/ipssdk/api/models/IPSSignMarkMetadata;", "rawMetadata", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/ipssdk/api/models/IPSCoordinate;Lme/oriient/ipssdk/api/models/IPSSignMarkMetadata;Ljava/lang/String;)V", "getCoordinates", "()Lme/oriient/ipssdk/api/models/IPSCoordinate;", "getId", "()Ljava/lang/String;", "getMetadata", "()Lme/oriient/ipssdk/api/models/IPSSignMarkMetadata;", "getRawMetadata", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IPSSignMark {

    @NotNull
    private final IPSCoordinate coordinates;

    @NotNull
    private final String id;

    @NotNull
    private final IPSSignMarkMetadata metadata;

    @Nullable
    private final String rawMetadata;

    @NotNull
    private final String text;

    public IPSSignMark(@NotNull String id, @NotNull String text, @NotNull IPSCoordinate coordinates, @NotNull IPSSignMarkMetadata metadata, @Nullable String str) {
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

    public static /* synthetic */ IPSSignMark copy$default(IPSSignMark iPSSignMark, String str, String str2, IPSCoordinate iPSCoordinate, IPSSignMarkMetadata iPSSignMarkMetadata, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iPSSignMark.id;
        }
        if ((i & 2) != 0) {
            str2 = iPSSignMark.text;
        }
        if ((i & 4) != 0) {
            iPSCoordinate = iPSSignMark.coordinates;
        }
        if ((i & 8) != 0) {
            iPSSignMarkMetadata = iPSSignMark.metadata;
        }
        if ((i & 16) != 0) {
            str3 = iPSSignMark.rawMetadata;
        }
        String str4 = str3;
        IPSCoordinate iPSCoordinate2 = iPSCoordinate;
        return iPSSignMark.copy(str, str2, iPSCoordinate2, iPSSignMarkMetadata, str4);
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
    public final IPSCoordinate getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IPSSignMarkMetadata getMetadata() {
        return this.metadata;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRawMetadata() {
        return this.rawMetadata;
    }

    @NotNull
    public final IPSSignMark copy(@NotNull String id, @NotNull String text, @NotNull IPSCoordinate coordinates, @NotNull IPSSignMarkMetadata metadata, @Nullable String rawMetadata) {
        Intrinsics.h(id, "id");
        Intrinsics.h(text, "text");
        Intrinsics.h(coordinates, "coordinates");
        Intrinsics.h(metadata, "metadata");
        return new IPSSignMark(id, text, coordinates, metadata, rawMetadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IPSSignMark)) {
            return false;
        }
        IPSSignMark iPSSignMark = (IPSSignMark) other;
        return Intrinsics.c(this.id, iPSSignMark.id) && Intrinsics.c(this.text, iPSSignMark.text) && Intrinsics.c(this.coordinates, iPSSignMark.coordinates) && Intrinsics.c(this.metadata, iPSSignMark.metadata) && Intrinsics.c(this.rawMetadata, iPSSignMark.rawMetadata);
    }

    @NotNull
    public final IPSCoordinate getCoordinates() {
        return this.coordinates;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final IPSSignMarkMetadata getMetadata() {
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
        int iHashCode = (this.metadata.hashCode() + ((this.coordinates.hashCode() + L.a(this.text, this.id.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.rawMetadata;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IPSSignMark(id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", coordinates=");
        sb.append(this.coordinates);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", rawMetadata=");
        return b.r(sb, this.rawMetadata, ')');
    }
}
