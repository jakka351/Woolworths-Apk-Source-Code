package au.com.woolworths.feature.shop.healthylifefoodtracker.data;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import java.util.ArrayList;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/data/FoodTrackerContentFeed;", "Lau/com/woolworths/feature/shop/healthylifefoodtracker/data/FoodTrackerPage;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FoodTrackerContentFeed implements FoodTrackerPage {

    /* renamed from: a, reason: collision with root package name */
    public final String f7165a;
    public final DownloadableAsset b;
    public final ArrayList c;
    public final FoodTrackerFooterCard d;

    public FoodTrackerContentFeed(String str, DownloadableAsset downloadableAsset, ArrayList arrayList, FoodTrackerFooterCard foodTrackerFooterCard) {
        this.f7165a = str;
        this.b = downloadableAsset;
        this.c = arrayList;
        this.d = foodTrackerFooterCard;
    }

    @Override // au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage
    /* renamed from: a, reason: from getter */
    public final String getF7165a() {
        return this.f7165a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoodTrackerContentFeed)) {
            return false;
        }
        FoodTrackerContentFeed foodTrackerContentFeed = (FoodTrackerContentFeed) obj;
        return this.f7165a.equals(foodTrackerContentFeed.f7165a) && this.b.equals(foodTrackerContentFeed.b) && this.c.equals(foodTrackerContentFeed.c) && this.d.equals(foodTrackerContentFeed.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.b((this.b.hashCode() + (this.f7165a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "FoodTrackerContentFeed(navigationTitle=" + this.f7165a + ", headerAsset=" + this.b + ", content=" + this.c + ", footer=" + this.d + ")";
    }
}
