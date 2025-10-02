package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorImage;", "", "usage", "", "version", "", "imageId", "offset", "Lme/oriient/internal/services/dataManager/floorMetadata/Offset;", "pixelToMeter", "", "url", "(Ljava/lang/String;ILjava/lang/String;Lme/oriient/internal/services/dataManager/floorMetadata/Offset;DLjava/lang/String;)V", "getImageId", "()Ljava/lang/String;", "getOffset", "()Lme/oriient/internal/services/dataManager/floorMetadata/Offset;", "getPixelToMeter", "()D", "getUrl", "getUsage", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FloorImage {

    @NotNull
    private final String imageId;

    @NotNull
    private final Offset offset;
    private final double pixelToMeter;

    @NotNull
    private final String url;

    @NotNull
    private final String usage;
    private final int version;

    public FloorImage(@NotNull String usage, int i, @NotNull String imageId, @NotNull Offset offset, double d, @NotNull String url) {
        Intrinsics.h(usage, "usage");
        Intrinsics.h(imageId, "imageId");
        Intrinsics.h(offset, "offset");
        Intrinsics.h(url, "url");
        this.usage = usage;
        this.version = i;
        this.imageId = imageId;
        this.offset = offset;
        this.pixelToMeter = d;
        this.url = url;
    }

    public static /* synthetic */ FloorImage copy$default(FloorImage floorImage, String str, int i, String str2, Offset offset, double d, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = floorImage.usage;
        }
        if ((i2 & 2) != 0) {
            i = floorImage.version;
        }
        if ((i2 & 4) != 0) {
            str2 = floorImage.imageId;
        }
        if ((i2 & 8) != 0) {
            offset = floorImage.offset;
        }
        if ((i2 & 16) != 0) {
            d = floorImage.pixelToMeter;
        }
        if ((i2 & 32) != 0) {
            str3 = floorImage.url;
        }
        String str4 = str3;
        double d2 = d;
        return floorImage.copy(str, i, str2, offset, d2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUsage() {
        return this.usage;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Offset getOffset() {
        return this.offset;
    }

    /* renamed from: component5, reason: from getter */
    public final double getPixelToMeter() {
        return this.pixelToMeter;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final FloorImage copy(@NotNull String usage, int version, @NotNull String imageId, @NotNull Offset offset, double pixelToMeter, @NotNull String url) {
        Intrinsics.h(usage, "usage");
        Intrinsics.h(imageId, "imageId");
        Intrinsics.h(offset, "offset");
        Intrinsics.h(url, "url");
        return new FloorImage(usage, version, imageId, offset, pixelToMeter, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorImage)) {
            return false;
        }
        FloorImage floorImage = (FloorImage) other;
        return Intrinsics.c(this.usage, floorImage.usage) && this.version == floorImage.version && Intrinsics.c(this.imageId, floorImage.imageId) && Intrinsics.c(this.offset, floorImage.offset) && Double.compare(this.pixelToMeter, floorImage.pixelToMeter) == 0 && Intrinsics.c(this.url, floorImage.url);
    }

    @NotNull
    public final String getImageId() {
        return this.imageId;
    }

    @NotNull
    public final Offset getOffset() {
        return this.offset;
    }

    public final double getPixelToMeter() {
        return this.pixelToMeter;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getUsage() {
        return this.usage;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.url.hashCode() + me.oriient.internal.infra.locationManager.J.a(this.pixelToMeter, (this.offset.hashCode() + me.oriient.internal.infra.rest.a.a(this.imageId, me.oriient.internal.services.config.a.a(this.version, this.usage.hashCode() * 31, 31), 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorImage(usage=");
        sb.append(this.usage);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", imageId=");
        sb.append(this.imageId);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", pixelToMeter=");
        sb.append(this.pixelToMeter);
        sb.append(", url=");
        return me.oriient.internal.infra.rest.e.a(sb, this.url, ')');
    }
}
