package au.com.woolworths.base.wallet;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u0015H\u0014J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\u0012\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0%H&J\u001f\u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0%2\u0006\u0010\u0017\u001a\u00028\u0000H&¢\u0006\u0002\u0010(R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lau/com/woolworths/base/wallet/ShimmerTypedEpoxyController;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/airbnb/epoxy/EpoxyController;", "<init>", "()V", "value", "", "isDataLoading", "()Z", "currentData", "getCurrentData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "generatedIds", "", "", "realToGeneratedIdsMap", "", "", "allowModelBuildRequests", "startShimmerEffect", "", "setData", "data", "(Ljava/lang/Object;)V", "requestModelBuildInternal", "requestModelBuild", "moveModel", "fromPosition", "", "toPosition", "requestDelayedModelBuild", "delayMs", "buildModels", "buildInitialModels", "buildModelsForLoadedData", "createShimmerModels", "", "Lcom/airbnb/epoxy/EpoxyModel;", "createModels", "(Ljava/lang/Object;)Ljava/util/List;", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class ShimmerTypedEpoxyController<T> extends EpoxyController {
    public static final int $stable = 8;

    @NotNull
    private static final String ID_PREFIX = "generated_item_id_";
    private boolean allowModelBuildRequests;

    @Nullable
    private T currentData;
    private boolean isDataLoading;

    @NotNull
    private final Set<String> generatedIds = new LinkedHashSet();

    @NotNull
    private final Map<Long, String> realToGeneratedIdsMap = new LinkedHashMap();

    private final void buildInitialModels() {
        this.generatedIds.clear();
        this.realToGeneratedIdsMap.clear();
        List<EpoxyModel<?>> listCreateShimmerModels = createShimmerModels();
        if (listCreateShimmerModels.isEmpty()) {
            throw new IllegalStateException("Number of shimmered items cannot be 0");
        }
        int i = 0;
        for (T t : listCreateShimmerModels) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            String str = ID_PREFIX + i;
            ((EpoxyModel) t).p(str);
            this.generatedIds.add(str);
            i = i2;
        }
        add(listCreateShimmerModels);
    }

    private final void buildModelsForLoadedData() {
        List<? extends EpoxyModel<?>> listCreateModels;
        T t = this.currentData;
        if (t == null || (listCreateModels = createModels(t)) == null) {
            listCreateModels = EmptyList.d;
        }
        if (!this.realToGeneratedIdsMap.isEmpty() || this.generatedIds.isEmpty()) {
            Iterator<T> it = listCreateModels.iterator();
            while (it.hasNext()) {
                EpoxyModel epoxyModel = (EpoxyModel) it.next();
                String str = this.realToGeneratedIdsMap.get(Long.valueOf(epoxyModel.d));
                if (str != null) {
                    epoxyModel.p(str);
                }
            }
        } else {
            int i = 0;
            for (T t2 : listCreateModels) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                EpoxyModel epoxyModel2 = (EpoxyModel) t2;
                String strD = a.d(i, ID_PREFIX);
                if (this.generatedIds.contains(strD)) {
                    this.realToGeneratedIdsMap.put(Long.valueOf(epoxyModel2.d), strD);
                    epoxyModel2.p(strD);
                }
                i = i2;
            }
            this.generatedIds.clear();
        }
        add(listCreateModels);
    }

    private final void requestModelBuildInternal() {
        this.allowModelBuildRequests = true;
        requestModelBuild();
        this.allowModelBuildRequests = false;
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        if (this.isDataLoading) {
            buildInitialModels();
        } else {
            buildModelsForLoadedData();
        }
    }

    @NotNull
    public abstract List<EpoxyModel<?>> createModels(T data);

    @NotNull
    public abstract List<EpoxyModel<?>> createShimmerModels();

    @Nullable
    public final T getCurrentData() {
        return this.currentData;
    }

    /* renamed from: isDataLoading, reason: from getter */
    public final boolean getIsDataLoading() {
        return this.isDataLoading;
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void moveModel(int fromPosition, int toPosition) {
        this.allowModelBuildRequests = true;
        super.moveModel(fromPosition, toPosition);
        this.allowModelBuildRequests = false;
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void requestDelayedModelBuild(int delayMs) {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestDelayedModelBuild(delayMs);
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void requestModelBuild() {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestModelBuild();
    }

    public final void setData(T data) {
        this.isDataLoading = false;
        this.currentData = data;
        requestModelBuildInternal();
    }

    public final void startShimmerEffect() {
        this.isDataLoading = true;
        requestModelBuildInternal();
    }
}
