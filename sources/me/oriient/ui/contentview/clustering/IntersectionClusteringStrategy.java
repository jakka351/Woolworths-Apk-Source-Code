package me.oriient.ui.contentview.clustering;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ui.contentview.clustering.Clusterable;
import me.oriient.ui.contentview.models.AnchorPoint;
import me.oriient.ui.contentview.models.PixelCoordinate;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.models.PixelRect;
import me.oriient.ui.contentview.models.PixelSize;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001aB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001b"}, d2 = {"Lme/oriient/ui/contentview/clustering/IntersectionClusteringStrategy;", "Lme/oriient/ui/contentview/clustering/Clusterable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/ui/contentview/clustering/ClusteringStrategy;", "Lme/oriient/ui/contentview/models/AnchorPoint;", "itemLocalAnchorPoint", "clusterLocalAnchorPoint", "<init>", "(Lme/oriient/ui/contentview/models/AnchorPoint;Lme/oriient/ui/contentview/models/AnchorPoint;)V", "Lme/oriient/ui/contentview/models/PixelSize;", "size", "Lme/oriient/ui/contentview/models/PixelCoordinate;", "coordinates", "anchorPoint", "Lme/oriient/ui/contentview/models/PixelMatrix;", "scaleMatrix", "Lme/oriient/ui/contentview/models/PixelRect;", "createScaledRectangle", "(Lme/oriient/ui/contentview/models/PixelSize;Lme/oriient/ui/contentview/models/PixelCoordinate;Lme/oriient/ui/contentview/models/AnchorPoint;Lme/oriient/ui/contentview/models/PixelMatrix;)Lme/oriient/ui/contentview/models/PixelRect;", "", "items", "matrix", "cluster", "(Ljava/util/List;Lme/oriient/ui/contentview/models/PixelMatrix;)Ljava/util/List;", "Lme/oriient/ui/contentview/models/AnchorPoint;", "Companion", "a", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntersectionClusteringStrategy<T extends Clusterable> implements ClusteringStrategy<T> {

    @NotNull
    private static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "IntersectionClusteringStrategy";

    @NotNull
    private final AnchorPoint clusterLocalAnchorPoint;

    @NotNull
    private final AnchorPoint itemLocalAnchorPoint;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Function2 {
        final /* synthetic */ PixelMatrix b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PixelMatrix pixelMatrix) {
            super(2);
            this.b = pixelMatrix;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Clusterable item, List cluster) {
            Intrinsics.h(item, "item");
            Intrinsics.h(cluster, "cluster");
            Clusterable clusterable = (Clusterable) CollectionsKt.F(cluster);
            if (clusterable == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(IntersectionClusteringStrategy.this.createScaledRectangle(item.getItemSize(), item.getPixelCoordinate(), IntersectionClusteringStrategy.this.itemLocalAnchorPoint, this.b).intersect(IntersectionClusteringStrategy.this.createScaledRectangle(cluster.size() == 1 ? clusterable.getItemSize() : clusterable.getClusterSize(), clusterable.getPixelCoordinate(), IntersectionClusteringStrategy.this.clusterLocalAnchorPoint, this.b)));
        }
    }

    public IntersectionClusteringStrategy(@NotNull AnchorPoint itemLocalAnchorPoint, @NotNull AnchorPoint clusterLocalAnchorPoint) {
        Intrinsics.h(itemLocalAnchorPoint, "itemLocalAnchorPoint");
        Intrinsics.h(clusterLocalAnchorPoint, "clusterLocalAnchorPoint");
        this.itemLocalAnchorPoint = itemLocalAnchorPoint;
        this.clusterLocalAnchorPoint = clusterLocalAnchorPoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PixelRect createScaledRectangle(PixelSize size, PixelCoordinate coordinates, AnchorPoint anchorPoint, PixelMatrix scaleMatrix) {
        PixelCoordinate pixelCoordinateMapCoordinate = scaleMatrix.mapCoordinate(coordinates);
        float f = 1;
        return new PixelRect(ExtensionsKt.getPx(pixelCoordinateMapCoordinate.getX() - (anchorPoint.getX() * size.getWidth())), ExtensionsKt.getPx(pixelCoordinateMapCoordinate.getY() - (anchorPoint.getY() * size.getHeight())), ExtensionsKt.getPx((Math.abs(f - anchorPoint.getX()) * size.getWidth()) + pixelCoordinateMapCoordinate.getX()), ExtensionsKt.getPx((Math.abs(f - anchorPoint.getY()) * size.getHeight()) + pixelCoordinateMapCoordinate.getY()), null);
    }

    @Override // me.oriient.ui.contentview.clustering.ClusteringStrategy
    @NotNull
    public List<List<T>> cluster(@NotNull List<? extends T> items, @NotNull PixelMatrix matrix) {
        Intrinsics.h(items, "items");
        Intrinsics.h(matrix, "matrix");
        return me.oriient.ui.contentview.clustering.a.b(items, new b(matrix));
    }
}
