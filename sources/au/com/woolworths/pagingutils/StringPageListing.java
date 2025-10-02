package au.com.woolworths.pagingutils;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Deprecated;
import kotlin.Metadata;

@Deprecated
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/pagingutils/StringPageListing;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lau/com/woolworths/pagingutils/PageListing;", "", "paging-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StringPageListing<T> implements PageListing<String, T> {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StringPageListing);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "StringPageListing(pagedList=null, networkState=null, initialLoad=null, refresh=null, totalCount=null, lastLoadedPage=null)";
    }
}
