package au.com.woolworths.feature.product.list.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/analytics/SeeResultsClickSource;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeeResultsClickSource {
    public static final SeeResultsClickSource e;
    public static final SeeResultsClickSource f;
    public static final /* synthetic */ SeeResultsClickSource[] g;
    public static final /* synthetic */ EnumEntries h;
    public final Action d;

    static {
        SeeResultsClickSource seeResultsClickSource = new SeeResultsClickSource(0, ProductListOptionsActions.k, "MAIN_FILTER");
        e = seeResultsClickSource;
        SeeResultsClickSource seeResultsClickSource2 = new SeeResultsClickSource(1, ProductListOptionsFiltersActions.j, "CHILD_FILTER");
        f = seeResultsClickSource2;
        SeeResultsClickSource[] seeResultsClickSourceArr = {seeResultsClickSource, seeResultsClickSource2};
        g = seeResultsClickSourceArr;
        h = EnumEntriesKt.a(seeResultsClickSourceArr);
    }

    public SeeResultsClickSource(int i, Action action, String str) {
        this.d = action;
    }

    public static SeeResultsClickSource valueOf(String str) {
        return (SeeResultsClickSource) Enum.valueOf(SeeResultsClickSource.class, str);
    }

    public static SeeResultsClickSource[] values() {
        return (SeeResultsClickSource[]) g.clone();
    }
}
