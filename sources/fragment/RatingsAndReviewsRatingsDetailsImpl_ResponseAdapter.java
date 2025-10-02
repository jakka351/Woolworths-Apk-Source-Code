package fragment;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import fragment.RatingsAndReviewsRatingsDetails;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter;", "", "RatingsAndReviewsRatingsDetails", "Section", "OnRatingsAndReviewsRatingDistributionOverview", "RatingText", "Cta", "LinkAction", "LinkTextWithAlt", "OnRatingsAndReviewsRatingDistributionDetails", "Item", "OnRatingsAndReviewsRatingDistributionWriteReview", "Button", "ButtonAction", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$Button;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<RatingsAndReviewsRatingsDetails.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f23805a = new Button();
        public static final List b = CollectionsKt.R("buttonId", AnnotatedPrivateKey.LABEL, "enabled", "buttonAction", "iconUrl", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            RatingsAndReviewsRatingsDetails.ButtonAction buttonAction = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    buttonAction = (RatingsAndReviewsRatingsDetails.ButtonAction) Adapters.b(Adapters.c(ButtonAction.f23806a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 != null) {
                return new RatingsAndReviewsRatingsDetails.Button(str, str2, bool3.booleanValue(), buttonAction, str3, str4);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsRatingsDetails.Button value = (RatingsAndReviewsRatingsDetails.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23794a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "buttonAction");
            Adapters.b(Adapters.c(ButtonAction.f23806a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$ButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$ButtonAction;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction implements Adapter<RatingsAndReviewsRatingsDetails.ButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction f23806a = new ButtonAction();
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
                return new RatingsAndReviewsRatingsDetails.ButtonAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsRatingsDetails.ButtonAction value = (RatingsAndReviewsRatingsDetails.ButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23795a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$Cta;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<RatingsAndReviewsRatingsDetails.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f23807a = new Cta();
        public static final List b = CollectionsKt.R("linkId", "linkAction", "linkTextWithAlt");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            RatingsAndReviewsRatingsDetails.LinkAction linkAction = null;
            RatingsAndReviewsRatingsDetails.LinkTextWithAlt linkTextWithAlt = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    linkAction = (RatingsAndReviewsRatingsDetails.LinkAction) Adapters.c(LinkAction.f23809a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    linkTextWithAlt = (RatingsAndReviewsRatingsDetails.LinkTextWithAlt) Adapters.c(LinkTextWithAlt.f23810a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (linkAction == null) {
                Assertions.a(reader, "linkAction");
                throw null;
            }
            if (linkTextWithAlt != null) {
                return new RatingsAndReviewsRatingsDetails.Cta(str, linkAction, linkTextWithAlt);
            }
            Assertions.a(reader, "linkTextWithAlt");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsRatingsDetails.Cta value = (RatingsAndReviewsRatingsDetails.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23796a);
            writer.F1("linkAction");
            Adapters.c(LinkAction.f23809a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt.f23810a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$Item;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<RatingsAndReviewsRatingsDetails.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f23808a = new Item();
        public static final List b = CollectionsKt.R("ratingScore", "percentage", "ratingCount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Double d = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "ratingScore");
                throw null;
            }
            if (d == null) {
                Assertions.a(reader, "percentage");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (str2 != null) {
                return new RatingsAndReviewsRatingsDetails.Item(dDoubleValue, str, str2);
            }
            Assertions.a(reader, "ratingCount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsRatingsDetails.Item value = (RatingsAndReviewsRatingsDetails.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ratingScore");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23797a);
            writer.F1("percentage");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("ratingCount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$LinkAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$LinkAction;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction implements Adapter<RatingsAndReviewsRatingsDetails.LinkAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction f23809a = new LinkAction();
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
                return new RatingsAndReviewsRatingsDetails.LinkAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsRatingsDetails.LinkAction value = (RatingsAndReviewsRatingsDetails.LinkAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23798a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$LinkTextWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$LinkTextWithAlt;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt implements Adapter<RatingsAndReviewsRatingsDetails.LinkTextWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt f23810a = new LinkTextWithAlt();
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
                return new RatingsAndReviewsRatingsDetails.LinkTextWithAlt(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsRatingsDetails.LinkTextWithAlt value = (RatingsAndReviewsRatingsDetails.LinkTextWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23799a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$OnRatingsAndReviewsRatingDistributionDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$OnRatingsAndReviewsRatingDistributionDetails;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsRatingDistributionDetails implements Adapter<RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23811a = CollectionsKt.Q("items");

        public static RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23811a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item.f23808a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionDetails(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f23808a, false)).toJson(writer, customScalarAdapters, value.f23800a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionDetails) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$OnRatingsAndReviewsRatingDistributionOverview;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$OnRatingsAndReviewsRatingDistributionOverview;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsRatingDistributionOverview implements Adapter<RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionOverview> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23812a = CollectionsKt.R("averageRating", "displayRatings", "ratingText", "maximumRating", "totalReviewsText", "cta");

        public static RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionOverview a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            Double d2 = null;
            Integer num2 = null;
            RatingsAndReviewsRatingsDetails.RatingText ratingText = null;
            String str = null;
            RatingsAndReviewsRatingsDetails.Cta cta = null;
            while (true) {
                int iO2 = reader.o2(f23812a);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 != 1) {
                    if (iO2 == 2) {
                        num = num2;
                        ratingText = (RatingsAndReviewsRatingsDetails.RatingText) Adapters.c(RatingText.f23814a, false).fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 4) {
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 5) {
                            break;
                        }
                        num = num2;
                        cta = (RatingsAndReviewsRatingsDetails.Cta) Adapters.b(Adapters.c(Cta.f23807a, false)).fromJson(reader, customScalarAdapters);
                    }
                    num2 = num;
                } else {
                    d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                }
            }
            Integer num3 = num2;
            if (d == null) {
                Assertions.a(reader, "averageRating");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (d2 == null) {
                Assertions.a(reader, "displayRatings");
                throw null;
            }
            double dDoubleValue2 = d2.doubleValue();
            if (ratingText == null) {
                Assertions.a(reader, "ratingText");
                throw null;
            }
            if (num3 == null) {
                Assertions.a(reader, "maximumRating");
                throw null;
            }
            int iIntValue = num3.intValue();
            if (str != null) {
                return new RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionOverview(dDoubleValue, dDoubleValue2, ratingText, iIntValue, str, cta);
            }
            Assertions.a(reader, "totalReviewsText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionOverview value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("averageRating");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f23801a));
            writer.F1("displayRatings");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("ratingText");
            Adapters.c(RatingText.f23814a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("maximumRating");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "totalReviewsText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.e);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f23807a, false)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionOverview) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$OnRatingsAndReviewsRatingDistributionWriteReview;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$OnRatingsAndReviewsRatingDistributionWriteReview;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsRatingDistributionWriteReview implements Adapter<RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionWriteReview> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23813a = CollectionsKt.Q("button");

        public static RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionWriteReview a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            RatingsAndReviewsRatingsDetails.Button button = null;
            while (reader.o2(f23813a) == 0) {
                button = (RatingsAndReviewsRatingsDetails.Button) Adapters.c(Button.f23805a, false).fromJson(reader, customScalarAdapters);
            }
            if (button != null) {
                return new RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionWriteReview(button);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionWriteReview value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f23805a, false).toJson(writer, customScalarAdapters, value.f23802a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionWriteReview) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$RatingText;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$RatingText;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RatingText implements Adapter<RatingsAndReviewsRatingsDetails.RatingText> {

        /* renamed from: a, reason: collision with root package name */
        public static final RatingText f23814a = new RatingText();
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
                return new RatingsAndReviewsRatingsDetails.RatingText(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsRatingsDetails.RatingText value = (RatingsAndReviewsRatingsDetails.RatingText) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23803a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$RatingsAndReviewsRatingsDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RatingsAndReviewsRatingsDetails implements Adapter<fragment.RatingsAndReviewsRatingsDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23815a = CollectionsKt.Q("sections");

        public static fragment.RatingsAndReviewsRatingsDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23815a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Section.f23816a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new fragment.RatingsAndReviewsRatingsDetails(arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, fragment.RatingsAndReviewsRatingsDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f23816a, true)).toJson(writer, customScalarAdapters, value.f23793a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (fragment.RatingsAndReviewsRatingsDetails) obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfragment/RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lfragment/RatingsAndReviewsRatingsDetails$Section;", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<RatingsAndReviewsRatingsDetails.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f23816a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionOverview onRatingsAndReviewsRatingDistributionOverviewA;
            RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionDetails onRatingsAndReviewsRatingDistributionDetailsA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionWriteReview onRatingsAndReviewsRatingDistributionWriteReviewA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsRatingDistributionOverview"))) {
                reader.o();
                onRatingsAndReviewsRatingDistributionOverviewA = OnRatingsAndReviewsRatingDistributionOverview.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsRatingDistributionOverviewA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsRatingDistributionDetails"))) {
                reader.o();
                onRatingsAndReviewsRatingDistributionDetailsA = OnRatingsAndReviewsRatingDistributionDetails.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsRatingDistributionDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsRatingDistributionWriteReview"))) {
                reader.o();
                onRatingsAndReviewsRatingDistributionWriteReviewA = OnRatingsAndReviewsRatingDistributionWriteReview.a(reader, customScalarAdapters);
            }
            return new RatingsAndReviewsRatingsDetails.Section(str, onRatingsAndReviewsRatingDistributionOverviewA, onRatingsAndReviewsRatingDistributionDetailsA, onRatingsAndReviewsRatingDistributionWriteReviewA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            RatingsAndReviewsRatingsDetails.Section value = (RatingsAndReviewsRatingsDetails.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23804a);
            RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionOverview onRatingsAndReviewsRatingDistributionOverview = value.b;
            if (onRatingsAndReviewsRatingDistributionOverview != null) {
                OnRatingsAndReviewsRatingDistributionOverview.b(writer, customScalarAdapters, onRatingsAndReviewsRatingDistributionOverview);
            }
            RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionDetails onRatingsAndReviewsRatingDistributionDetails = value.c;
            if (onRatingsAndReviewsRatingDistributionDetails != null) {
                OnRatingsAndReviewsRatingDistributionDetails.b(writer, customScalarAdapters, onRatingsAndReviewsRatingDistributionDetails);
            }
            RatingsAndReviewsRatingsDetails.OnRatingsAndReviewsRatingDistributionWriteReview onRatingsAndReviewsRatingDistributionWriteReview = value.d;
            if (onRatingsAndReviewsRatingDistributionWriteReview != null) {
                OnRatingsAndReviewsRatingDistributionWriteReview.b(writer, customScalarAdapters, onRatingsAndReviewsRatingDistributionWriteReview);
            }
        }
    }
}
