package au.com.woolworths.feature.product.list.legacy;

import android.content.SharedPreferences;
import android.net.Uri;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$loadZeroResultComposeUi$1$1$1$5$1 extends FunctionReferenceImpl implements Function2<ActionData, AnalyticsData, Unit> {
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ActionData p0 = (ActionData) obj;
        AnalyticsData analyticsData = (AnalyticsData) obj2;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        AnalyticsManager analyticsManager = productListViewModel.g;
        ProductListInteractor productListInteractor = productListViewModel.e;
        AnalyticsData analytics = p0.getAnalytics();
        if (analytics != null) {
            analyticsManager.g(AnalyticsDataKt.a(AnalyticsDataKt.c(analytics, analyticsData, false)));
        }
        int iOrdinal = p0.getType().ordinal();
        if (iOrdinal == 0) {
            Uri uri = Uri.parse(p0.getAction());
            String path = uri.getPath();
            if (Intrinsics.c(path, "clearPersistedChip")) {
                String queryParameter = uri.getQueryParameter("id");
                if (queryParameter != null) {
                    productListInteractor.x(queryParameter);
                } else {
                    SharedPreferences.Editor editorEdit = productListInteractor.f5328a.f5342a.edit();
                    editorEdit.remove("product_list_persisted_chip_ids");
                    editorEdit.apply();
                }
                ProductListViewModel.t6(productListViewModel, productListViewModel.w6(), null, null, productListViewModel.w6().f.d, null, true, productListInteractor.f5328a.l(), 22);
            } else {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.i), "Action not supported: " + path, null, 12);
            }
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            productListViewModel.v.f(new ProductListContract.Actions.LaunchDeeplink(p0.getAction(), null));
            AnalyticsData analytics2 = p0.getAnalytics();
            if (analytics2 != null) {
                analyticsManager.g(AnalyticsDataKt.a(analytics2));
            }
        }
        return Unit.f24250a;
    }
}
