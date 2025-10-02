package me.oriient.ui.contentview.clustering;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import me.oriient.ui.contentview.ContentView;
import me.oriient.ui.contentview.clustering.Clusterable;
import me.oriient.ui.contentview.models.ContentId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nH&J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&¨\u0006\u000f"}, d2 = {"Lme/oriient/ui/contentview/clustering/ClusterManager;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/ui/contentview/clustering/Clusterable;", "", "attachMapView", "", "mapView", "Lme/oriient/ui/contentview/ContentView;", "detachMapView", "findItemsInsideCluster", "", "contentIds", "Lme/oriient/ui/contentview/models/ContentId;", "setItems", "items", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ClusterManager<T extends Clusterable> {
    void attachMapView(@NotNull ContentView mapView);

    void detachMapView();

    @Nullable
    List<T> findItemsInsideCluster(@NotNull List<ContentId> contentIds);

    void setItems(@NotNull List<? extends T> items);
}
