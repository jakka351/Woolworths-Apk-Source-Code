package au.com.woolworths.android.onesite.modules.search.searchscreen;

import au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTile;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SearchActivity$initVoiceEntryPoints$3$1$5$1 extends FunctionReferenceImpl implements Function1<SearchTile, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SearchTile p0 = (SearchTile) obj;
        Intrinsics.h(p0, "p0");
        return Boolean.valueOf(((SearchViewConditionsChecker) this.receiver).b(p0));
    }
}
