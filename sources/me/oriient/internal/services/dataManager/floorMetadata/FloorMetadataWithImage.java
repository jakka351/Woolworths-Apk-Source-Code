package me.oriient.internal.services.dataManager.floorMetadata;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadataWithImage;", "", "metadata", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;", "image", "Landroid/graphics/Bitmap;", "(Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;Landroid/graphics/Bitmap;)V", "getImage", "()Landroid/graphics/Bitmap;", "getMetadata", "()Lme/oriient/internal/services/dataManager/floorMetadata/FloorMetadata;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FloorMetadataWithImage {

    @NotNull
    private final Bitmap image;

    @NotNull
    private final FloorMetadata metadata;

    public FloorMetadataWithImage(@NotNull FloorMetadata metadata, @NotNull Bitmap image) {
        Intrinsics.h(metadata, "metadata");
        Intrinsics.h(image, "image");
        this.metadata = metadata;
        this.image = image;
    }

    public static /* synthetic */ FloorMetadataWithImage copy$default(FloorMetadataWithImage floorMetadataWithImage, FloorMetadata floorMetadata, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            floorMetadata = floorMetadataWithImage.metadata;
        }
        if ((i & 2) != 0) {
            bitmap = floorMetadataWithImage.image;
        }
        return floorMetadataWithImage.copy(floorMetadata, bitmap);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FloorMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    @NotNull
    public final FloorMetadataWithImage copy(@NotNull FloorMetadata metadata, @NotNull Bitmap image) {
        Intrinsics.h(metadata, "metadata");
        Intrinsics.h(image, "image");
        return new FloorMetadataWithImage(metadata, image);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorMetadataWithImage)) {
            return false;
        }
        FloorMetadataWithImage floorMetadataWithImage = (FloorMetadataWithImage) other;
        return Intrinsics.c(this.metadata, floorMetadataWithImage.metadata) && Intrinsics.c(this.image, floorMetadataWithImage.image);
    }

    @NotNull
    public final Bitmap getImage() {
        return this.image;
    }

    @NotNull
    public final FloorMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.image.hashCode() + (this.metadata.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FloorMetadataWithImage(metadata=" + this.metadata + ", image=" + this.image + ')';
    }
}
