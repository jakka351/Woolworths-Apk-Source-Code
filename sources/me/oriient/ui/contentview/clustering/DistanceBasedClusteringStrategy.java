package me.oriient.ui.contentview.clustering;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ui.contentview.clustering.Clusterable;
import me.oriient.ui.contentview.models.PixelMatrix;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lme/oriient/ui/contentview/clustering/DistanceBasedClusteringStrategy;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/ui/contentview/clustering/Clusterable;", "Lme/oriient/ui/contentview/clustering/ClusteringStrategy;", "intersectionDefinition", "Lme/oriient/ui/contentview/clustering/IntersectionDefinition;", "(Lme/oriient/ui/contentview/clustering/IntersectionDefinition;)V", "cluster", "", "items", "matrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "defineMinimumDistance", "", "item", "isItemACluster", "", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DistanceBasedClusteringStrategy<T extends Clusterable> implements ClusteringStrategy<T> {

    @NotNull
    private final IntersectionDefinition intersectionDefinition;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IntersectionDefinition.values().length];
            try {
                iArr[IntersectionDefinition.DIAGONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IntersectionDefinition.MAX_SIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
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
            return Boolean.valueOf(((double) ((float) Math.hypot((double) (clusterable.getPixelCoordinate().getX() - item.getPixelCoordinate().getX()), (double) (clusterable.getPixelCoordinate().getY() - item.getPixelCoordinate().getY())))) <= DistanceBasedClusteringStrategy.this.defineMinimumDistance(item, cluster.size() == 1) / ((double) this.b.getScaleFactor$ui_content_view_publishRelease().a()));
        }
    }

    public DistanceBasedClusteringStrategy(@NotNull IntersectionDefinition intersectionDefinition) {
        Intrinsics.h(intersectionDefinition, "intersectionDefinition");
        this.intersectionDefinition = intersectionDefinition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double defineMinimumDistance(Clusterable item, boolean isItemACluster) {
        int i = a.$EnumSwitchMapping$0[this.intersectionDefinition.ordinal()];
        if (i == 1) {
            return isItemACluster ? Math.hypot(item.getItemSize().getWidth(), item.getItemSize().getHeight()) : Math.hypot(item.getClusterSize().getWidth(), item.getClusterSize().getHeight());
        }
        if (i == 2) {
            return isItemACluster ? Math.max(item.getItemSize().getWidth(), item.getItemSize().getHeight()) : Math.max(item.getClusterSize().getWidth(), item.getClusterSize().getHeight());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // me.oriient.ui.contentview.clustering.ClusteringStrategy
    @NotNull
    public List<List<T>> cluster(@NotNull List<? extends T> items, @NotNull PixelMatrix matrix) {
        Intrinsics.h(items, "items");
        Intrinsics.h(matrix, "matrix");
        return me.oriient.ui.contentview.clustering.a.b(items, new b(matrix));
    }
}
