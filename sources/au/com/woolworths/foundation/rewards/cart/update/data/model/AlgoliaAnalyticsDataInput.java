package au.com.woolworths.foundation.rewards.cart.update.data.model;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/model/AlgoliaAnalyticsDataInput;", "", "", "queryId", "indexName", "objectId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getQueryId", "()Ljava/lang/String;", "getIndexName", "getObjectId", "Companion", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AlgoliaAnalyticsDataInput {

    @SerializedName("indexName")
    @NotNull
    private final String indexName;

    @SerializedName("objectId")
    @NotNull
    private final String objectId;

    @SerializedName("queryId")
    @NotNull
    private final String queryId;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/update/data/model/AlgoliaAnalyticsDataInput$Companion;", "", "cart-update-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public AlgoliaAnalyticsDataInput(@NotNull String queryId, @NotNull String indexName, @NotNull String objectId) {
        Intrinsics.h(queryId, "queryId");
        Intrinsics.h(indexName, "indexName");
        Intrinsics.h(objectId, "objectId");
        this.queryId = queryId;
        this.indexName = indexName;
        this.objectId = objectId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlgoliaAnalyticsDataInput)) {
            return false;
        }
        AlgoliaAnalyticsDataInput algoliaAnalyticsDataInput = (AlgoliaAnalyticsDataInput) obj;
        return Intrinsics.c(this.queryId, algoliaAnalyticsDataInput.queryId) && Intrinsics.c(this.indexName, algoliaAnalyticsDataInput.indexName) && Intrinsics.c(this.objectId, algoliaAnalyticsDataInput.objectId);
    }

    public final int hashCode() {
        return this.objectId.hashCode() + b.c(this.queryId.hashCode() * 31, 31, this.indexName);
    }

    public final String toString() {
        String str = this.queryId;
        String str2 = this.indexName;
        return a.o(a.v("AlgoliaAnalyticsDataInput(queryId=", str, ", indexName=", str2, ", objectId="), this.objectId, ")");
    }
}
