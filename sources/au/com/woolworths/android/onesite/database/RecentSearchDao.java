package au.com.woolworths.android.onesite.database;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Dao;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Dao
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/database/RecentSearchDao;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class RecentSearchDao {
    public abstract void a();

    public abstract FlowableFlatMapMaybe b();

    public abstract void c(RecentSearch... recentSearchArr);

    public void d(List recentSearches) {
        Intrinsics.h(recentSearches, "recentSearches");
        a();
        RecentSearch[] recentSearchArr = (RecentSearch[]) recentSearches.toArray(new RecentSearch[0]);
        c((RecentSearch[]) Arrays.copyOf(recentSearchArr, recentSearchArr.length));
    }
}
