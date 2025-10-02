package au.com.woolworths.pagingutils;

import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes4.dex */
public final class PageKeyedPagingSourceFactoryKt$getPageListing$6 implements Function1<PageKeyedPagingSource<Integer, Object>, LiveData<KeyedPageData<Integer, Object>>> {
    static {
        Intrinsics.o();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PageKeyedPagingSource) obj).g;
    }
}
