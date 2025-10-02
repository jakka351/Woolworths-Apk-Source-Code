package au.com.woolworths.pagingutils;

import androidx.paging.PagedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"paging-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PageListingKt {
    public static final void a(NumericPageListing numericPageListing) {
        Intrinsics.h(numericPageListing, "<this>");
        PagedList pagedList = (PagedList) numericPageListing.f9175a.e();
        if (pagedList != null) {
            pagedList.o();
        }
    }
}
