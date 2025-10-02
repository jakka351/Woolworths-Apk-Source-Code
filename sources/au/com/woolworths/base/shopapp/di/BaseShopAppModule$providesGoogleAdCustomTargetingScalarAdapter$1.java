package au.com.woolworths.base.shopapp.di;

import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/base/shopapp/di/BaseShopAppModule$providesGoogleAdCustomTargetingScalarAdapter$1", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/android/onesite/graphql/GoogleAdCustomTargeting;", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BaseShopAppModule$providesGoogleAdCustomTargetingScalarAdapter$1 implements Adapter<GoogleAdCustomTargeting> {
    @Override // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
        Intrinsics.h(reader, "reader");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        return new GoogleAdCustomTargeting((Map) Adapters.g.fromJson(reader, customScalarAdapters));
    }

    @Override // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
        GoogleAdCustomTargeting value = (GoogleAdCustomTargeting) obj;
        Intrinsics.h(writer, "writer");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Intrinsics.h(value, "value");
        Adapters.g.toJson(writer, customScalarAdapters, value);
    }
}
