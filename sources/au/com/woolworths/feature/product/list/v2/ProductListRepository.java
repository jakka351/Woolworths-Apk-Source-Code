package au.com.woolworths.feature.product.list.v2;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.shop.graphql.type.ProductFilterOption;
import com.apollographql.apollo.ApolloClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListRepository;", "", "Companion", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f5498a;
    public final FeatureToggleManager b;
    public final SharedPreferences c;
    public final SupportedLinksHelper d;
    public final ShopAppFlavorInteractor e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListRepository$Companion;", "", "", "PRODUCT_LIST_DISPLAY_MODE", "Ljava/lang/String;", "PRODUCT_LIST_PERSISTED_CHIP_IDS", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductListRepository(ApolloClient apolloClient, FeatureToggleManager featureToggleManager, SharedPreferences sharedPreferences, SupportedLinksHelper supportedLinksHelper, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        Intrinsics.h(apolloClient, "apolloClient");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        this.f5498a = apolloClient;
        this.b = featureToggleManager;
        this.c = sharedPreferences;
        this.d = supportedLinksHelper;
        this.e = shopAppFlavorInteractor;
    }

    public static ArrayList c(Map map) {
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new ProductFilterOption((String) entry.getKey(), (List) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r34, java.lang.String r35, java.lang.Integer r36, java.util.List r37, java.lang.String r38, java.util.Map r39, kotlin.coroutines.jvm.internal.ContinuationImpl r40) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.v2.ProductListRepository.a(java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.lang.String, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final List b() {
        Set<String> stringSet = this.c.getStringSet("product_list_persisted_chip_ids", EmptySet.d);
        if (stringSet != null) {
            return CollectionsKt.G0(stringSet);
        }
        return null;
    }
}
