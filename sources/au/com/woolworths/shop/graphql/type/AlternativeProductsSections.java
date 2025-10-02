package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/AlternativeProductsSections;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AlternativeProductsSections {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11025a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/AlternativeProductsSections$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = AlternativeProductsTargetProductSection.f11026a;
        int i2 = AlternativeProductsInsetBannerSection.f11020a;
        int i3 = AlternativeProductsProductCountSection.f11022a;
        int i4 = AlternativeProductsProductSection.f11023a;
        int i5 = AlternativeProductsNoResultSection.f11021a;
        int i6 = AlternativeProductsCtaSection.f11018a;
        f11025a = new UnionType("AlternativeProductsSections");
    }
}
