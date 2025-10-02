package me.oriient.ui.contentview.clustering;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import me.oriient.ui.contentview.clustering.Clusterable;
import me.oriient.ui.contentview.models.PixelMatrix;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J*\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lme/oriient/ui/contentview/clustering/ClusteringStrategy;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lme/oriient/ui/contentview/clustering/Clusterable;", "", "cluster", "", "items", "matrix", "Lme/oriient/ui/contentview/models/PixelMatrix;", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ClusteringStrategy<T extends Clusterable> {
    @NotNull
    List<List<T>> cluster(@NotNull List<? extends T> items, @NotNull PixelMatrix matrix);
}
