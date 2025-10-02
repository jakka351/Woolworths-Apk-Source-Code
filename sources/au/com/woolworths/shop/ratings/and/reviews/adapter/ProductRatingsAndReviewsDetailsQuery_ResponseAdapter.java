package au.com.woolworths.shop.ratings.and.reviews.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.ratings.and.reviews.ProductRatingsAndReviewsDetailsQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import fragment.RatingsAndReviewsRatingsDetails;
import fragment.RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter;", "", "Data", "ProductRatingsAndReviewsDetails", "Ratings", "Review", "Section", "OnRatingsAndReviewsReviewItemRating", "OnRatingsAndReviewsReviewItemReviewTitle", "OnRatingsAndReviewsReviewItemRecommendation", "OnRatingsAndReviewsReviewItemInfo", "OnRatingsAndReviewsReviewItemBody", "Cta", "LinkAction", "LinkTextWithAlt", "PageInfo", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductRatingsAndReviewsDetailsQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Cta;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<ProductRatingsAndReviewsDetailsQuery.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f12702a = new Cta();
        public static final List b = CollectionsKt.R("linkId", "linkAction", "linkTextWithAlt");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductRatingsAndReviewsDetailsQuery.LinkAction linkAction = null;
            ProductRatingsAndReviewsDetailsQuery.LinkTextWithAlt linkTextWithAlt = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    linkAction = (ProductRatingsAndReviewsDetailsQuery.LinkAction) Adapters.c(LinkAction.f12704a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    linkTextWithAlt = (ProductRatingsAndReviewsDetailsQuery.LinkTextWithAlt) Adapters.c(LinkTextWithAlt.f12705a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (linkAction == null) {
                Assertions.a(reader, "linkAction");
                throw null;
            }
            if (linkTextWithAlt != null) {
                return new ProductRatingsAndReviewsDetailsQuery.Cta(str, linkAction, linkTextWithAlt);
            }
            Assertions.a(reader, "linkTextWithAlt");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.Cta value = (ProductRatingsAndReviewsDetailsQuery.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.f12669a);
            writer.F1("linkAction");
            Adapters.c(LinkAction.f12704a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt.f12705a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Data;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductRatingsAndReviewsDetailsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12703a = new Data();
        public static final List b = CollectionsKt.Q("productRatingsAndReviewsDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductRatingsAndReviewsDetailsQuery.ProductRatingsAndReviewsDetails productRatingsAndReviewsDetails = null;
            while (reader.o2(b) == 0) {
                productRatingsAndReviewsDetails = (ProductRatingsAndReviewsDetailsQuery.ProductRatingsAndReviewsDetails) Adapters.b(Adapters.c(ProductRatingsAndReviewsDetails.f12712a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ProductRatingsAndReviewsDetailsQuery.Data(productRatingsAndReviewsDetails);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.Data value = (ProductRatingsAndReviewsDetailsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productRatingsAndReviewsDetails");
            Adapters.b(Adapters.c(ProductRatingsAndReviewsDetails.f12712a, false)).toJson(writer, customScalarAdapters, value.f12670a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$LinkAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$LinkAction;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction implements Adapter<ProductRatingsAndReviewsDetailsQuery.LinkAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction f12704a = new LinkAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductRatingsAndReviewsDetailsQuery.LinkAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.LinkAction value = (ProductRatingsAndReviewsDetailsQuery.LinkAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f12671a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$LinkTextWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$LinkTextWithAlt;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt implements Adapter<ProductRatingsAndReviewsDetailsQuery.LinkTextWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt f12705a = new LinkTextWithAlt();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str2 != null) {
                return new ProductRatingsAndReviewsDetailsQuery.LinkTextWithAlt(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.LinkTextWithAlt value = (ProductRatingsAndReviewsDetailsQuery.LinkTextWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12672a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$OnRatingsAndReviewsReviewItemBody;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemBody;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemBody implements Adapter<ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12706a = CollectionsKt.Q("content");

        public static ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemBody a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12706a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemBody(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemBody value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12673a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemBody) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$OnRatingsAndReviewsReviewItemInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemInfo;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemInfo implements Adapter<ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12707a = CollectionsKt.R("userName", "createdAt");

        public static ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f12707a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "userName");
                throw null;
            }
            if (str2 != null) {
                return new ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemInfo(str, str2);
            }
            Assertions.a(reader, "createdAt");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("userName");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12674a);
            writer.F1("createdAt");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemInfo) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$OnRatingsAndReviewsReviewItemRating;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemRating;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemRating implements Adapter<ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRating> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12708a = CollectionsKt.R("rating", "maximumRating", TextBundle.TEXT_ENTRY);

        public static ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRating a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f12708a);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "rating");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 != null) {
                return new ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRating(iIntValue, num2.intValue(), str);
            }
            Assertions.a(reader, "maximumRating");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRating value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rating");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f12675a, adapters$IntAdapter$1, writer, customScalarAdapters, "maximumRating");
            d.y(value.b, adapters$IntAdapter$1, writer, customScalarAdapters, TextBundle.TEXT_ENTRY);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRating) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$OnRatingsAndReviewsReviewItemRecommendation;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemRecommendation;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemRecommendation implements Adapter<ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRecommendation> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12709a = CollectionsKt.Q("recommendationText");

        public static ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRecommendation a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12709a) == 0) {
                str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
            }
            return new ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRecommendation(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRecommendation value = (ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRecommendation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("recommendationText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f12676a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$OnRatingsAndReviewsReviewItemReviewTitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$OnRatingsAndReviewsReviewItemReviewTitle;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewItemReviewTitle implements Adapter<ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemReviewTitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12710a = CollectionsKt.Q("title");

        public static ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemReviewTitle a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12710a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemReviewTitle(str);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemReviewTitle value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12677a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemReviewTitle) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$PageInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$PageInfo;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageInfo implements Adapter<ProductRatingsAndReviewsDetailsQuery.PageInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final PageInfo f12711a = new PageInfo();
        public static final List b = CollectionsKt.Q("nextPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            while (reader.o2(b) == 0) {
                num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
            }
            return new ProductRatingsAndReviewsDetailsQuery.PageInfo(num);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.PageInfo value = (ProductRatingsAndReviewsDetailsQuery.PageInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("nextPage");
            Adapters.k.toJson(writer, customScalarAdapters, value.f12678a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$ProductRatingsAndReviewsDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$ProductRatingsAndReviewsDetails;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductRatingsAndReviewsDetails implements Adapter<ProductRatingsAndReviewsDetailsQuery.ProductRatingsAndReviewsDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductRatingsAndReviewsDetails f12712a = new ProductRatingsAndReviewsDetails();
        public static final List b = CollectionsKt.R("ratings", "reviews", "cta", "pageInfo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductRatingsAndReviewsDetailsQuery.Ratings ratings = null;
            ArrayList arrayListFromJson = null;
            ProductRatingsAndReviewsDetailsQuery.Cta cta = null;
            ProductRatingsAndReviewsDetailsQuery.PageInfo pageInfo = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    ratings = (ProductRatingsAndReviewsDetailsQuery.Ratings) Adapters.b(Adapters.c(Ratings.f12713a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Review.f12714a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    cta = (ProductRatingsAndReviewsDetailsQuery.Cta) Adapters.b(Adapters.c(Cta.f12702a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    pageInfo = (ProductRatingsAndReviewsDetailsQuery.PageInfo) Adapters.b(Adapters.c(PageInfo.f12711a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ProductRatingsAndReviewsDetailsQuery.ProductRatingsAndReviewsDetails(ratings, arrayListFromJson, cta, pageInfo);
            }
            Assertions.a(reader, "reviews");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.ProductRatingsAndReviewsDetails value = (ProductRatingsAndReviewsDetailsQuery.ProductRatingsAndReviewsDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ratings");
            Adapters.b(Adapters.c(Ratings.f12713a, true)).toJson(writer, customScalarAdapters, value.f12679a);
            writer.F1("reviews");
            Adapters.a(Adapters.c(Review.f12714a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f12702a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("pageInfo");
            Adapters.b(Adapters.c(PageInfo.f12711a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$Ratings;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Ratings;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Ratings implements Adapter<ProductRatingsAndReviewsDetailsQuery.Ratings> {

        /* renamed from: a, reason: collision with root package name */
        public static final Ratings f12713a = new Ratings();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetailsA = RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter.RatingsAndReviewsRatingsDetails.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductRatingsAndReviewsDetailsQuery.Ratings(str, ratingsAndReviewsRatingsDetailsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.Ratings value = (ProductRatingsAndReviewsDetailsQuery.Ratings) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12680a);
            List list = RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter.RatingsAndReviewsRatingsDetails.f23815a;
            RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter.RatingsAndReviewsRatingsDetails.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$Review;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Review;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Review implements Adapter<ProductRatingsAndReviewsDetailsQuery.Review> {

        /* renamed from: a, reason: collision with root package name */
        public static final Review f12714a = new Review();
        public static final List b = CollectionsKt.Q("sections");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Section.f12715a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ProductRatingsAndReviewsDetailsQuery.Review(arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.Review value = (ProductRatingsAndReviewsDetailsQuery.Review) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f12715a, true)).toJson(writer, customScalarAdapters, value.f12681a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/adapter/ProductRatingsAndReviewsDetailsQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/ratings/and/reviews/ProductRatingsAndReviewsDetailsQuery$Section;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<ProductRatingsAndReviewsDetailsQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f12715a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRatingA;
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitleA;
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendationA;
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfoA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBodyA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemRating"))) {
                reader.o();
                onRatingsAndReviewsReviewItemRatingA = OnRatingsAndReviewsReviewItemRating.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewItemRatingA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemReviewTitle"))) {
                reader.o();
                onRatingsAndReviewsReviewItemReviewTitleA = OnRatingsAndReviewsReviewItemReviewTitle.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewItemReviewTitleA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemRecommendation"))) {
                reader.o();
                onRatingsAndReviewsReviewItemRecommendationA = OnRatingsAndReviewsReviewItemRecommendation.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewItemRecommendationA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemInfo"))) {
                reader.o();
                onRatingsAndReviewsReviewItemInfoA = OnRatingsAndReviewsReviewItemInfo.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewItemInfoA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewItemBody"))) {
                reader.o();
                onRatingsAndReviewsReviewItemBodyA = OnRatingsAndReviewsReviewItemBody.a(reader, customScalarAdapters);
            }
            return new ProductRatingsAndReviewsDetailsQuery.Section(str, onRatingsAndReviewsReviewItemRatingA, onRatingsAndReviewsReviewItemReviewTitleA, onRatingsAndReviewsReviewItemRecommendationA, onRatingsAndReviewsReviewItemInfoA, onRatingsAndReviewsReviewItemBodyA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductRatingsAndReviewsDetailsQuery.Section value = (ProductRatingsAndReviewsDetailsQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12682a);
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRating = value.b;
            if (onRatingsAndReviewsReviewItemRating != null) {
                OnRatingsAndReviewsReviewItemRating.b(writer, customScalarAdapters, onRatingsAndReviewsReviewItemRating);
            }
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitle = value.c;
            if (onRatingsAndReviewsReviewItemReviewTitle != null) {
                OnRatingsAndReviewsReviewItemReviewTitle.b(writer, customScalarAdapters, onRatingsAndReviewsReviewItemReviewTitle);
            }
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendation = value.d;
            if (onRatingsAndReviewsReviewItemRecommendation != null) {
                List list = OnRatingsAndReviewsReviewItemRecommendation.f12709a;
                writer.F1("recommendationText");
                Adapters.i.toJson(writer, customScalarAdapters, onRatingsAndReviewsReviewItemRecommendation.f12676a);
            }
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfo = value.e;
            if (onRatingsAndReviewsReviewItemInfo != null) {
                OnRatingsAndReviewsReviewItemInfo.b(writer, customScalarAdapters, onRatingsAndReviewsReviewItemInfo);
            }
            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBody = value.f;
            if (onRatingsAndReviewsReviewItemBody != null) {
                OnRatingsAndReviewsReviewItemBody.b(writer, customScalarAdapters, onRatingsAndReviewsReviewItemBody);
            }
        }
    }
}
