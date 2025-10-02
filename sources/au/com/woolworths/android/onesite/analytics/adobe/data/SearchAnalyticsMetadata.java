package au.com.woolworths.android.onesite.analytics.adobe.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.search.SearchKeywordType;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/adobe/data/SearchAnalyticsMetadata;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchAnalyticsMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final SearchKeywordType f4070a;

    public SearchAnalyticsMetadata(SearchKeywordType searchKeywordType) {
        this.f4070a = searchKeywordType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchAnalyticsMetadata) && this.f4070a == ((SearchAnalyticsMetadata) obj).f4070a;
    }

    public final int hashCode() {
        return this.f4070a.hashCode();
    }

    public final String toString() {
        return "SearchAnalyticsMetadata(searchMode=" + this.f4070a + ")";
    }
}
