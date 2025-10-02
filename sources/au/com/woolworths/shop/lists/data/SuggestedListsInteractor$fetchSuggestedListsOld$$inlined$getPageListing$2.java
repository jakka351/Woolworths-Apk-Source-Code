package au.com.woolworths.shop.lists.data;

import androidx.lifecycle.LiveData;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$2 implements Function1<PageKeyedPagingSource<Integer, SuggestedListItem>, LiveData<NetworkState>> {
    public static final SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$2 d = new SuggestedListsInteractor$fetchSuggestedListsOld$$inlined$getPageListing$2();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PageKeyedPagingSource) obj).d;
    }
}
