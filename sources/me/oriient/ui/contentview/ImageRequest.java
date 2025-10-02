package me.oriient.ui.contentview;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.models.PixelCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lme/oriient/ui/contentview/ImageRequest;", "", "()V", "toString", "", "Bitmap", "Deferred", "Lme/oriient/ui/contentview/ImageRequest$Bitmap;", "Lme/oriient/ui/contentview/ImageRequest$Deferred;", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ImageRequest {

    @Keep
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lme/oriient/ui/contentview/ImageRequest$Bitmap;", "Lme/oriient/ui/contentview/ImageRequest;", "value", "Landroid/graphics/Bitmap;", "anchorPoint", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "(Landroid/graphics/Bitmap;Lme/oriient/ui/contentview/models/PixelCoordinate;)V", "getAnchorPoint", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "getValue", "()Landroid/graphics/Bitmap;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Bitmap extends ImageRequest {

        @Nullable
        private final PixelCoordinate anchorPoint;

        @NotNull
        private final android.graphics.Bitmap value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bitmap(@NotNull android.graphics.Bitmap value, @Nullable PixelCoordinate pixelCoordinate) {
            super(null);
            Intrinsics.h(value, "value");
            this.value = value;
            this.anchorPoint = pixelCoordinate;
        }

        public static /* synthetic */ Bitmap copy$default(Bitmap bitmap, android.graphics.Bitmap bitmap2, PixelCoordinate pixelCoordinate, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap2 = bitmap.value;
            }
            if ((i & 2) != 0) {
                pixelCoordinate = bitmap.anchorPoint;
            }
            return bitmap.copy(bitmap2, pixelCoordinate);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final android.graphics.Bitmap getValue() {
            return this.value;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final PixelCoordinate getAnchorPoint() {
            return this.anchorPoint;
        }

        @NotNull
        public final Bitmap copy(@NotNull android.graphics.Bitmap value, @Nullable PixelCoordinate anchorPoint) {
            Intrinsics.h(value, "value");
            return new Bitmap(value, anchorPoint);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bitmap)) {
                return false;
            }
            Bitmap bitmap = (Bitmap) other;
            return Intrinsics.c(this.value, bitmap.value) && Intrinsics.c(this.anchorPoint, bitmap.anchorPoint);
        }

        @Nullable
        public final PixelCoordinate getAnchorPoint() {
            return this.anchorPoint;
        }

        @NotNull
        public final android.graphics.Bitmap getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = this.value.hashCode() * 31;
            PixelCoordinate pixelCoordinate = this.anchorPoint;
            return iHashCode + (pixelCoordinate == null ? 0 : pixelCoordinate.hashCode());
        }

        @Override // me.oriient.ui.contentview.ImageRequest
        @NotNull
        public String toString() {
            return "Bitmap(value=" + this.value + ", anchorPoint=" + this.anchorPoint + ')';
        }

        public /* synthetic */ Bitmap(android.graphics.Bitmap bitmap, PixelCoordinate pixelCoordinate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, (i & 2) != 0 ? null : pixelCoordinate);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\u0007J$\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\f\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R)\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lme/oriient/ui/contentview/ImageRequest$Deferred;", "Lme/oriient/ui/contentview/ImageRequest;", "loader", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getLoader", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "component1", "copy", "(Lkotlin/jvm/functions/Function1;)Lme/oriient/ui/contentview/ImageRequest$Deferred;", "equals", "other", "hashCode", "", "toString", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Deferred extends ImageRequest {

        @NotNull
        private final Function1<Continuation<? super Boolean>, Object> loader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Deferred(@NotNull Function1<? super Continuation<? super Boolean>, ? extends Object> loader) {
            super(null);
            Intrinsics.h(loader, "loader");
            this.loader = loader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Deferred copy$default(Deferred deferred, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = deferred.loader;
            }
            return deferred.copy(function1);
        }

        @NotNull
        public final Function1<Continuation<? super Boolean>, Object> component1() {
            return this.loader;
        }

        @NotNull
        public final Deferred copy(@NotNull Function1<? super Continuation<? super Boolean>, ? extends Object> loader) {
            Intrinsics.h(loader, "loader");
            return new Deferred(loader);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deferred) && Intrinsics.c(this.loader, ((Deferred) other).loader);
        }

        @NotNull
        public final Function1<Continuation<? super Boolean>, Object> getLoader() {
            return this.loader;
        }

        public int hashCode() {
            return this.loader.hashCode();
        }

        @Override // me.oriient.ui.contentview.ImageRequest
        @NotNull
        public String toString() {
            return "Deferred(loader=" + this.loader + ')';
        }
    }

    public /* synthetic */ ImageRequest(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        return String.valueOf(this);
    }

    private ImageRequest() {
    }
}
