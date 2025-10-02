package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
import au.com.woolworths.feature.shop.contentpage.data.ContentPageData;
import au.com.woolworths.shop.aem.components.model.pagecover.PageCoverData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ContentPageContractKt {
    public static final PageCoverData a(ContentPageData contentPageData) {
        Intrinsics.h(contentPageData, "<this>");
        List list = contentPageData.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof PageCoverData) {
                arrayList.add(obj);
            }
        }
        return (PageCoverData) CollectionsKt.F(arrayList);
    }

    public static final boolean b(ContentPageContract.ViewState viewState) {
        Intrinsics.h(viewState, "<this>");
        return viewState.d && viewState.f6982a != null;
    }
}
