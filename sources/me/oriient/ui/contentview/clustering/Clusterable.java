package me.oriient.ui.contentview.clustering;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lme/oriient/ui/contentview/clustering/Clusterable;", "", "clusterSize", "Lme/oriient/ui/contentview/models/PixelSize;", "getClusterSize", "()Lme/oriient/ui/contentview/models/PixelSize;", "itemSize", "getItemSize", "pixelCoordinate", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "getPixelCoordinate", "()Lme/oriient/ui/contentview/models/PixelCoordinate;", "visibleRanges", "", "Lme/oriient/ui/contentview/clustering/Clusterable$VisibleZoomRange;", "getVisibleRanges", "()Ljava/util/List;", "VisibleZoomRange", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Clusterable {

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lme/oriient/ui/contentview/clustering/Clusterable$VisibleZoomRange;", "", "abovePixels", "", "belowPixels", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getAbovePixels", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBelowPixels", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lme/oriient/ui/contentview/clustering/Clusterable$VisibleZoomRange;", "equals", "", "other", "hashCode", "", "toString", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VisibleZoomRange {

        @Nullable
        private final Float abovePixels;

        @Nullable
        private final Float belowPixels;

        public VisibleZoomRange(@Nullable Float f, @Nullable Float f2) {
            this.abovePixels = f;
            this.belowPixels = f2;
        }

        public static /* synthetic */ VisibleZoomRange copy$default(VisibleZoomRange visibleZoomRange, Float f, Float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = visibleZoomRange.abovePixels;
            }
            if ((i & 2) != 0) {
                f2 = visibleZoomRange.belowPixels;
            }
            return visibleZoomRange.copy(f, f2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Float getAbovePixels() {
            return this.abovePixels;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Float getBelowPixels() {
            return this.belowPixels;
        }

        @NotNull
        public final VisibleZoomRange copy(@Nullable Float abovePixels, @Nullable Float belowPixels) {
            return new VisibleZoomRange(abovePixels, belowPixels);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VisibleZoomRange)) {
                return false;
            }
            VisibleZoomRange visibleZoomRange = (VisibleZoomRange) other;
            return Intrinsics.c(this.abovePixels, visibleZoomRange.abovePixels) && Intrinsics.c(this.belowPixels, visibleZoomRange.belowPixels);
        }

        @Nullable
        public final Float getAbovePixels() {
            return this.abovePixels;
        }

        @Nullable
        public final Float getBelowPixels() {
            return this.belowPixels;
        }

        public int hashCode() {
            Float f = this.abovePixels;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.belowPixels;
            return iHashCode + (f2 != null ? f2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VisibleZoomRange(abovePixels=" + this.abovePixels + ", belowPixels=" + this.belowPixels + ')';
        }
    }

    @NotNull
    PixelSize getClusterSize();

    @NotNull
    PixelSize getItemSize();

    @NotNull
    PixelCoordinate getPixelCoordinate();

    @NotNull
    List<VisibleZoomRange> getVisibleRanges();
}
