package au.com.woolworths.pagingutils;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/pagingutils/PageData;", "K", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "paging-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PageData<K, T> {
    List getItems();

    Object getNextPageKey();

    int getTotalCount();
}
