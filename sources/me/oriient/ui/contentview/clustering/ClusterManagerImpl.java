package me.oriient.ui.contentview.clustering;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.ui.contentview.ContentView;
import me.oriient.ui.contentview.MapScaleListener;
import me.oriient.ui.contentview.clustering.Clusterable;
import me.oriient.ui.contentview.models.Content;
import me.oriient.ui.contentview.models.ContentId;
import me.oriient.ui.contentview.models.PixelMatrix;
import me.oriient.ui.contentview.utils.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 D*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002EFBc\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u0012\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00172\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jk\u0010 \u001a\u00020\u00132\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u001a2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u001dH\u0002¢\u0006\u0004\b \u0010!JW\u0010\"\u001a\u00020\u00132\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u001a2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u001a2\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u001dH\u0002¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000bH\u0002¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u000bH\u0002¢\u0006\u0004\b&\u0010%J#\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00132\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b/\u0010%J\u000f\u00100\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u00101J%\u00104\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b2\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u000bH\u0016¢\u0006\u0004\b4\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R,\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00108R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00109R(\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010:R.\u0010;\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u000b0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lme/oriient/ui/contentview/clustering/ClusterManagerImpl;", "Lme/oriient/ui/contentview/clustering/Clusterable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/ui/contentview/clustering/ClusterManager;", "", "minScaleChangeForRecalculation", "", "minRecalculationTimeIntervalMillis", "Lme/oriient/ui/contentview/clustering/ClusteringStrategy;", "clusteringStrategy", "Lkotlin/Function1;", "", "Lme/oriient/ui/contentview/models/Content;", "singleItemProvider", "clusterItemProvider", "<init>", "(DJLme/oriient/ui/contentview/clustering/ClusteringStrategy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lme/oriient/ui/contentview/models/PixelMatrix;", "matrix", "", "evaluateState", "(Lme/oriient/ui/contentview/models/PixelMatrix;)V", "clusters", "", "createClustersMap", "(Ljava/util/List;)Ljava/util/Map;", "", "currentClusters", "newClusters", "", "clustersToAdd", "clustersToRemove", "findNewClusters", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "findDisappearedClusters", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "removeClustersFromMap", "(Ljava/util/List;)V", "addClustersToMap", "cluster", "provideContent", "(Ljava/util/List;)Ljava/util/List;", "Lme/oriient/ui/contentview/ContentView;", "mapView", "attachMapView", "(Lme/oriient/ui/contentview/ContentView;)V", "items", "setItems", "detachMapView", "()V", "Lme/oriient/ui/contentview/models/ContentId;", "contentIds", "findItemsInsideCluster", "D", "J", "Lme/oriient/ui/contentview/clustering/ClusteringStrategy;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "Ljava/util/Map;", "clusterContentIds", "", "lastScaleUsedForRecalculation", "Ljava/lang/Float;", "lastInteractionTimeMillis", "Lme/oriient/ui/contentview/ContentView;", "Lme/oriient/ui/contentview/MapScaleListener;", "scaleListener", "Lme/oriient/ui/contentview/MapScaleListener;", "Companion", "a", "b", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ClusterManagerImpl<T extends Clusterable> implements ClusterManager<T> {

    @NotNull
    private static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "ClusterManager";

    @NotNull
    private Map<List<T>, List<ContentId>> clusterContentIds;

    @NotNull
    private final Function1<List<? extends T>, List<Content>> clusterItemProvider;

    @NotNull
    private final ClusteringStrategy<T> clusteringStrategy;

    @NotNull
    private Map<T, List<T>> currentClusters;

    @NotNull
    private List<? extends T> items;
    private long lastInteractionTimeMillis;

    @Nullable
    private Float lastScaleUsedForRecalculation;

    @Nullable
    private ContentView mapView;
    private final long minRecalculationTimeIntervalMillis;
    private final double minScaleChangeForRecalculation;

    @NotNull
    private final MapScaleListener scaleListener;

    @NotNull
    private final Function1<T, List<Content>> singleItemProvider;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b implements MapScaleListener {
        public b() {
        }

        @Override // me.oriient.ui.contentview.MapScaleListener
        public void onScaleChanged(PixelMatrix matrix) {
            Intrinsics.h(matrix, "matrix");
            if (ClusterManagerImpl.this.mapView != null && System.currentTimeMillis() - ClusterManagerImpl.this.lastInteractionTimeMillis >= ClusterManagerImpl.this.minRecalculationTimeIntervalMillis) {
                ClusterManagerImpl.this.lastInteractionTimeMillis = System.currentTimeMillis();
                if (ClusterManagerImpl.this.lastScaleUsedForRecalculation != null) {
                    if (Math.abs(matrix.getScaleFactor$ui_content_view_publishRelease().a() - r0.floatValue()) >= ClusterManagerImpl.this.minScaleChangeForRecalculation) {
                        ClusterManagerImpl.this.evaluateState(matrix);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClusterManagerImpl(double d, long j, @NotNull ClusteringStrategy<T> clusteringStrategy, @NotNull Function1<? super T, ? extends List<? extends Content>> singleItemProvider, @NotNull Function1<? super List<? extends T>, ? extends List<? extends Content>> clusterItemProvider) {
        Intrinsics.h(clusteringStrategy, "clusteringStrategy");
        Intrinsics.h(singleItemProvider, "singleItemProvider");
        Intrinsics.h(clusterItemProvider, "clusterItemProvider");
        this.minScaleChangeForRecalculation = d;
        this.minRecalculationTimeIntervalMillis = j;
        this.clusteringStrategy = clusteringStrategy;
        this.singleItemProvider = singleItemProvider;
        this.clusterItemProvider = clusterItemProvider;
        this.items = EmptyList.d;
        this.currentClusters = new LinkedHashMap();
        this.clusterContentIds = new LinkedHashMap();
        this.scaleListener = new b();
    }

    private final void addClustersToMap(List<? extends List<? extends T>> clusters) {
        for (List<? extends T> list : clusters) {
            if (!list.isEmpty()) {
                List<Content> listProvideContent = provideContent(list);
                Map<List<T>, List<ContentId>> map = this.clusterContentIds;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(listProvideContent, 10));
                Iterator<T> it = listProvideContent.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Content) it.next()).getContentId());
                }
                map.put(list, arrayList);
                ContentView contentView = this.mapView;
                if (contentView != null) {
                    contentView.addContent(listProvideContent);
                }
            }
        }
    }

    private final Map<T, List<T>> createClustersMap(List<? extends List<? extends T>> clusters) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!clusters.isEmpty()) {
            Iterator<T> it = clusters.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                Clusterable clusterable = (Clusterable) CollectionsKt.F(list);
                if (clusterable != null) {
                    linkedHashMap.put(clusterable, list);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evaluateState(PixelMatrix matrix) {
        ContentView contentView = this.mapView;
        if (contentView == null) {
            return;
        }
        this.lastScaleUsedForRecalculation = Float.valueOf(matrix.getScaleFactor$ui_content_view_publishRelease().a());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float fA = me.oriient.ui.contentview.models.b.a(matrix.getScaleFactor$ui_content_view_publishRelease(), ExtensionsKt.getPx(contentView.getWidth()));
        List<? extends T> list = this.items;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            Clusterable clusterable = (Clusterable) obj;
            if (!clusterable.getVisibleRanges().isEmpty()) {
                List<Clusterable.VisibleZoomRange> visibleRanges = clusterable.getVisibleRanges();
                if (!(visibleRanges instanceof Collection) || !visibleRanges.isEmpty()) {
                    for (Clusterable.VisibleZoomRange visibleZoomRange : visibleRanges) {
                        Float abovePixels = visibleZoomRange.getAbovePixels();
                        if (abovePixels == null || abovePixels.floatValue() <= fA) {
                            Float belowPixels = visibleZoomRange.getBelowPixels();
                            if (belowPixels == null || belowPixels.floatValue() >= fA) {
                            }
                        }
                    }
                }
            }
            arrayList3.add(obj);
        }
        Map<T, List<T>> mapCreateClustersMap = createClustersMap(this.clusteringStrategy.cluster(arrayList3, matrix));
        findNewClusters(this.currentClusters, mapCreateClustersMap, arrayList, arrayList2);
        findDisappearedClusters(this.currentClusters, mapCreateClustersMap, arrayList2);
        removeClustersFromMap(arrayList2);
        addClustersToMap(arrayList);
        this.currentClusters = mapCreateClustersMap;
    }

    private final void findDisappearedClusters(Map<T, ? extends List<? extends T>> currentClusters, Map<T, ? extends List<? extends T>> newClusters, List<List<T>> clustersToRemove) {
        for (Map.Entry<T, ? extends List<? extends T>> entry : currentClusters.entrySet()) {
            T key = entry.getKey();
            List<? extends T> value = entry.getValue();
            if (!newClusters.containsKey(key)) {
                clustersToRemove.add(value);
            }
        }
    }

    private final void findNewClusters(Map<T, ? extends List<? extends T>> currentClusters, Map<T, ? extends List<? extends T>> newClusters, List<List<T>> clustersToAdd, List<List<T>> clustersToRemove) {
        for (Map.Entry<T, ? extends List<? extends T>> entry : newClusters.entrySet()) {
            T key = entry.getKey();
            List<? extends T> value = entry.getValue();
            List<? extends T> list = currentClusters.get(key);
            if (list == null) {
                clustersToAdd.add(value);
            } else if (!Intrinsics.c(value, list)) {
                clustersToRemove.add(list);
                clustersToAdd.add(value);
            }
        }
    }

    private final List<Content> provideContent(List<? extends T> cluster) {
        return cluster.size() == 1 ? (List) this.singleItemProvider.invoke(CollectionsKt.D(cluster)) : (List) this.clusterItemProvider.invoke(cluster);
    }

    private final void removeClustersFromMap(List<? extends List<? extends T>> clusters) {
        List<ContentId> list;
        Iterator<T> it = clusters.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            if (!list2.isEmpty() && (list = this.clusterContentIds.get(list2)) != null) {
                ContentView contentView = this.mapView;
                if (contentView != null) {
                    contentView.removeContent(list);
                }
                this.clusterContentIds.remove(list2);
            }
        }
    }

    @Override // me.oriient.ui.contentview.clustering.ClusterManager
    public void attachMapView(@NotNull ContentView mapView) {
        Intrinsics.h(mapView, "mapView");
        this.mapView = mapView;
        mapView.addScaleListener(this.scaleListener);
        evaluateState(mapView.getCurrentTransformations());
    }

    @Override // me.oriient.ui.contentview.clustering.ClusterManager
    public void detachMapView() {
        for (List<ContentId> list : this.clusterContentIds.values()) {
            ContentView contentView = this.mapView;
            if (contentView != null) {
                contentView.removeContent(list);
            }
        }
        this.currentClusters.clear();
        this.clusterContentIds.clear();
        ContentView contentView2 = this.mapView;
        if (contentView2 != null) {
            contentView2.removeScaleListener(this.scaleListener);
        }
        this.mapView = null;
    }

    @Override // me.oriient.ui.contentview.clustering.ClusterManager
    @Nullable
    public List<T> findItemsInsideCluster(@NotNull List<ContentId> contentIds) {
        Intrinsics.h(contentIds, "contentIds");
        Map<List<T>, List<ContentId>> map = this.clusterContentIds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<List<T>, List<ContentId>> entry : map.entrySet()) {
            List<ContentId> value = entry.getValue();
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator<T> it = value.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (contentIds.contains((ContentId) it.next())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
            }
        }
        List<T> list = (List) CollectionsKt.E(linkedHashMap.keySet());
        if (list == null || list.size() != 1) {
            return list;
        }
        return null;
    }

    @Override // me.oriient.ui.contentview.clustering.ClusterManager
    public void setItems(@NotNull List<? extends T> items) {
        Intrinsics.h(items, "items");
        this.items = items;
        ContentView contentView = this.mapView;
        if (contentView == null) {
            return;
        }
        evaluateState(contentView.getCurrentTransformations());
    }

    public /* synthetic */ ClusterManagerImpl(double d, long j, ClusteringStrategy clusteringStrategy, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.001d : d, (i & 2) != 0 ? 100L : j, clusteringStrategy, function1, function12);
    }
}
