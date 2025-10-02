package me.oriient.ipssdk.api.models;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSFloorImage;", "", "()V", "IPSFloorBitmapImage", "IPSFloorSvgImage", "Lme/oriient/ipssdk/api/models/IPSFloorImage$IPSFloorBitmapImage;", "Lme/oriient/ipssdk/api/models/IPSFloorImage$IPSFloorSvgImage;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class IPSFloorImage {

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSFloorImage$IPSFloorBitmapImage;", "Lme/oriient/ipssdk/api/models/IPSFloorImage;", "image", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getImage", "()Landroid/graphics/Bitmap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IPSFloorBitmapImage extends IPSFloorImage {

        @NotNull
        private final Bitmap image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IPSFloorBitmapImage(@NotNull Bitmap image) {
            super(null);
            Intrinsics.h(image, "image");
            this.image = image;
        }

        public static /* synthetic */ IPSFloorBitmapImage copy$default(IPSFloorBitmapImage iPSFloorBitmapImage, Bitmap bitmap, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = iPSFloorBitmapImage.image;
            }
            return iPSFloorBitmapImage.copy(bitmap);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Bitmap getImage() {
            return this.image;
        }

        @NotNull
        public final IPSFloorBitmapImage copy(@NotNull Bitmap image) {
            Intrinsics.h(image, "image");
            return new IPSFloorBitmapImage(image);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IPSFloorBitmapImage) && Intrinsics.c(this.image, ((IPSFloorBitmapImage) other).image);
        }

        @NotNull
        public final Bitmap getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        @NotNull
        public String toString() {
            return "IPSFloorBitmapImage(image=" + this.image + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSFloorImage$IPSFloorSvgImage;", "Lme/oriient/ipssdk/api/models/IPSFloorImage;", "image", "Lme/oriient/ipssdk/api/models/IPSSvgImage;", "(Lme/oriient/ipssdk/api/models/IPSSvgImage;)V", "getImage", "()Lme/oriient/ipssdk/api/models/IPSSvgImage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IPSFloorSvgImage extends IPSFloorImage {

        @NotNull
        private final IPSSvgImage image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IPSFloorSvgImage(@NotNull IPSSvgImage image) {
            super(null);
            Intrinsics.h(image, "image");
            this.image = image;
        }

        public static /* synthetic */ IPSFloorSvgImage copy$default(IPSFloorSvgImage iPSFloorSvgImage, IPSSvgImage iPSSvgImage, int i, Object obj) {
            if ((i & 1) != 0) {
                iPSSvgImage = iPSFloorSvgImage.image;
            }
            return iPSFloorSvgImage.copy(iPSSvgImage);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IPSSvgImage getImage() {
            return this.image;
        }

        @NotNull
        public final IPSFloorSvgImage copy(@NotNull IPSSvgImage image) {
            Intrinsics.h(image, "image");
            return new IPSFloorSvgImage(image);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IPSFloorSvgImage) && Intrinsics.c(this.image, ((IPSFloorSvgImage) other).image);
        }

        @NotNull
        public final IPSSvgImage getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        @NotNull
        public String toString() {
            return "IPSFloorSvgImage(image=" + this.image + ')';
        }
    }

    public /* synthetic */ IPSFloorImage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IPSFloorImage() {
    }
}
