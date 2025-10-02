package au.com.woolworths.feature.rewards.everydayextras.signup.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSummaryQuery;
import au.com.woolworths.rewards.graphql.type.DividerType;
import au.com.woolworths.rewards.graphql.type.EverydayExtraButtonStyle;
import au.com.woolworths.rewards.graphql.type.adapter.DividerType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraButtonStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter;", "", "Data", "EverydayExtraSummary", "Content", "ContentItem", "OnTitleTextItem", "OnCheckableTextItem", "OnSubheadTextItem", "OnParagraphTextItem", "OnDivider", "OnEverydayExtraWpayPayment", "Errors", "CardErrors", "ErrorItem", "ExternalSystemError", "CardProvider", "OnEverydayExtraSelectedPlan", "Button", "OnSmallAppIconListItem", "Footer", "FooterItem", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasSummaryQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Button;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<EverydayExtrasSummaryQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f6048a = new Button();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "style", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            EverydayExtraButtonStyle everydayExtraButtonStyle = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    everydayExtraButtonStyle = (EverydayExtraButtonStyle) Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasSummaryQuery.Button(everydayExtraButtonStyle, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.Button value = (EverydayExtrasSummaryQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5950a);
            writer.F1("style");
            Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$CardErrors;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$CardErrors;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardErrors implements Adapter<EverydayExtrasSummaryQuery.CardErrors> {

        /* renamed from: a, reason: collision with root package name */
        public static final CardErrors f6049a = new CardErrors();
        public static final List b = CollectionsKt.R("title", "errorItems");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ErrorItem.f6054a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasSummaryQuery.CardErrors(str, arrayListFromJson);
            }
            Assertions.a(reader, "errorItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.CardErrors value = (EverydayExtrasSummaryQuery.CardErrors) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5951a);
            writer.F1("errorItems");
            Adapters.a(Adapters.c(ErrorItem.f6054a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$CardProvider;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$CardProvider;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardProvider implements Adapter<EverydayExtrasSummaryQuery.CardProvider> {

        /* renamed from: a, reason: collision with root package name */
        public static final CardProvider f6050a = new CardProvider();
        public static final List b = CollectionsKt.R("altText", "iconUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new EverydayExtrasSummaryQuery.CardProvider(str, str2);
            }
            Assertions.a(reader, "iconUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.CardProvider value = (EverydayExtrasSummaryQuery.CardProvider) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f5952a);
            writer.F1("iconUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Content;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<EverydayExtrasSummaryQuery.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f6051a = new Content();
        public static final List b = CollectionsKt.R("id", "contentItems");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ContentItem.f6052a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasSummaryQuery.Content(str, arrayListFromJson);
            }
            Assertions.a(reader, "contentItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.Content value = (EverydayExtrasSummaryQuery.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5953a);
            writer.F1("contentItems");
            Adapters.a(Adapters.c(ContentItem.f6052a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$ContentItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$ContentItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentItem implements Adapter<EverydayExtrasSummaryQuery.ContentItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentItem f6052a = new ContentItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtrasSummaryQuery.OnTitleTextItem onTitleTextItemA;
            EverydayExtrasSummaryQuery.OnCheckableTextItem onCheckableTextItemA;
            EverydayExtrasSummaryQuery.OnSubheadTextItem onSubheadTextItemA;
            EverydayExtrasSummaryQuery.OnParagraphTextItem onParagraphTextItemA;
            EverydayExtrasSummaryQuery.OnDivider onDividerA;
            EverydayExtrasSummaryQuery.OnEverydayExtraWpayPayment onEverydayExtraWpayPaymentA;
            EverydayExtrasSummaryQuery.OnEverydayExtraSelectedPlan onEverydayExtraSelectedPlanA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtrasSummaryQuery.OnSmallAppIconListItem onSmallAppIconListItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("TitleTextItem"))) {
                reader.o();
                onTitleTextItemA = OnTitleTextItem.a(reader, customScalarAdapters);
            } else {
                onTitleTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CheckableTextItem"))) {
                reader.o();
                onCheckableTextItemA = OnCheckableTextItem.a(reader, customScalarAdapters);
            } else {
                onCheckableTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("SubheadTextItem"))) {
                reader.o();
                onSubheadTextItemA = OnSubheadTextItem.a(reader, customScalarAdapters);
            } else {
                onSubheadTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ParagraphTextItem"))) {
                reader.o();
                onParagraphTextItemA = OnParagraphTextItem.a(reader, customScalarAdapters);
            } else {
                onParagraphTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Divider"))) {
                reader.o();
                onDividerA = OnDivider.a(reader, customScalarAdapters);
            } else {
                onDividerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraWpayPayment"))) {
                reader.o();
                onEverydayExtraWpayPaymentA = OnEverydayExtraWpayPayment.a(reader, customScalarAdapters);
            } else {
                onEverydayExtraWpayPaymentA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraSelectedPlan"))) {
                reader.o();
                onEverydayExtraSelectedPlanA = OnEverydayExtraSelectedPlan.a(reader, customScalarAdapters);
            } else {
                onEverydayExtraSelectedPlanA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("SmallAppIconListItem"))) {
                reader.o();
                onSmallAppIconListItemA = OnSmallAppIconListItem.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasSummaryQuery.ContentItem(str, onTitleTextItemA, onCheckableTextItemA, onSubheadTextItemA, onParagraphTextItemA, onDividerA, onEverydayExtraWpayPaymentA, onEverydayExtraSelectedPlanA, onSmallAppIconListItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.ContentItem value = (EverydayExtrasSummaryQuery.ContentItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5954a);
            EverydayExtrasSummaryQuery.OnTitleTextItem onTitleTextItem = value.b;
            if (onTitleTextItem != null) {
                OnTitleTextItem.b(writer, customScalarAdapters, onTitleTextItem);
            }
            EverydayExtrasSummaryQuery.OnCheckableTextItem onCheckableTextItem = value.c;
            if (onCheckableTextItem != null) {
                OnCheckableTextItem.b(writer, customScalarAdapters, onCheckableTextItem);
            }
            EverydayExtrasSummaryQuery.OnSubheadTextItem onSubheadTextItem = value.d;
            if (onSubheadTextItem != null) {
                OnSubheadTextItem.b(writer, customScalarAdapters, onSubheadTextItem);
            }
            EverydayExtrasSummaryQuery.OnParagraphTextItem onParagraphTextItem = value.e;
            if (onParagraphTextItem != null) {
                OnParagraphTextItem.b(writer, customScalarAdapters, onParagraphTextItem);
            }
            EverydayExtrasSummaryQuery.OnDivider onDivider = value.f;
            if (onDivider != null) {
                List list = OnDivider.f6061a;
                writer.F1("type");
                DividerType_ResponseAdapter.b(writer, customScalarAdapters, onDivider.f5963a);
            }
            EverydayExtrasSummaryQuery.OnEverydayExtraWpayPayment onEverydayExtraWpayPayment = value.g;
            if (onEverydayExtraWpayPayment != null) {
                OnEverydayExtraWpayPayment.b(writer, customScalarAdapters, onEverydayExtraWpayPayment);
            }
            EverydayExtrasSummaryQuery.OnEverydayExtraSelectedPlan onEverydayExtraSelectedPlan = value.h;
            if (onEverydayExtraSelectedPlan != null) {
                OnEverydayExtraSelectedPlan.b(writer, customScalarAdapters, onEverydayExtraSelectedPlan);
            }
            EverydayExtrasSummaryQuery.OnSmallAppIconListItem onSmallAppIconListItem = value.i;
            if (onSmallAppIconListItem != null) {
                OnSmallAppIconListItem.b(writer, customScalarAdapters, onSmallAppIconListItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<EverydayExtrasSummaryQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f6053a = new Data();
        public static final List b = CollectionsKt.Q("everydayExtraSummary");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtrasSummaryQuery.EverydayExtraSummary everydayExtraSummary = null;
            while (reader.o2(b) == 0) {
                everydayExtraSummary = (EverydayExtrasSummaryQuery.EverydayExtraSummary) Adapters.b(Adapters.c(EverydayExtraSummary.f6056a, false)).fromJson(reader, customScalarAdapters);
            }
            return new EverydayExtrasSummaryQuery.Data(everydayExtraSummary);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.Data value = (EverydayExtrasSummaryQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("everydayExtraSummary");
            Adapters.b(Adapters.c(EverydayExtraSummary.f6056a, false)).toJson(writer, customScalarAdapters, value.f5955a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$ErrorItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$ErrorItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorItem implements Adapter<EverydayExtrasSummaryQuery.ErrorItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ErrorItem f6054a = new ErrorItem();
        public static final List b = CollectionsKt.R("domId", "key", "value");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "domId");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "key");
                throw null;
            }
            if (str3 != null) {
                return new EverydayExtrasSummaryQuery.ErrorItem(str, str2, str3);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.ErrorItem value = (EverydayExtrasSummaryQuery.ErrorItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("domId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5956a);
            writer.F1("key");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$Errors;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Errors;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Errors implements Adapter<EverydayExtrasSummaryQuery.Errors> {

        /* renamed from: a, reason: collision with root package name */
        public static final Errors f6055a = new Errors();
        public static final List b = CollectionsKt.R("__typename", "cardErrors", "externalSystemError");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            EverydayExtrasSummaryQuery.CardErrors cardErrors = null;
            EverydayExtrasSummaryQuery.ExternalSystemError externalSystemError = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    cardErrors = (EverydayExtrasSummaryQuery.CardErrors) Adapters.c(CardErrors.f6049a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    externalSystemError = (EverydayExtrasSummaryQuery.ExternalSystemError) Adapters.c(ExternalSystemError.f6057a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (cardErrors == null) {
                Assertions.a(reader, "cardErrors");
                throw null;
            }
            if (externalSystemError != null) {
                return new EverydayExtrasSummaryQuery.Errors(str, cardErrors, externalSystemError);
            }
            Assertions.a(reader, "externalSystemError");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.Errors value = (EverydayExtrasSummaryQuery.Errors) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5957a);
            writer.F1("cardErrors");
            Adapters.c(CardErrors.f6049a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("externalSystemError");
            Adapters.c(ExternalSystemError.f6057a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$EverydayExtraSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$EverydayExtraSummary;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EverydayExtraSummary implements Adapter<EverydayExtrasSummaryQuery.EverydayExtraSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final EverydayExtraSummary f6056a = new EverydayExtraSummary();
        public static final List b = CollectionsKt.R("navigationTitle", "content", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            EverydayExtrasSummaryQuery.Content content = null;
            EverydayExtrasSummaryQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    content = (EverydayExtrasSummaryQuery.Content) Adapters.c(Content.f6051a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (EverydayExtrasSummaryQuery.Footer) Adapters.c(Footer.f6058a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "navigationTitle");
                throw null;
            }
            if (content == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (footer != null) {
                return new EverydayExtrasSummaryQuery.EverydayExtraSummary(str, content, footer);
            }
            Assertions.a(reader, "footer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.EverydayExtraSummary value = (EverydayExtrasSummaryQuery.EverydayExtraSummary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("navigationTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5958a);
            writer.F1("content");
            Adapters.c(Content.f6051a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footer");
            Adapters.c(Footer.f6058a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$ExternalSystemError;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$ExternalSystemError;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExternalSystemError implements Adapter<EverydayExtrasSummaryQuery.ExternalSystemError> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExternalSystemError f6057a = new ExternalSystemError();
        public static final List b = CollectionsKt.R("__typename", "title", "value");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new EverydayExtrasSummaryQuery.ExternalSystemError(str, str2, str3);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.ExternalSystemError value = (EverydayExtrasSummaryQuery.ExternalSystemError) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5959a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$Footer;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<EverydayExtrasSummaryQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f6058a = new Footer();
        public static final List b = CollectionsKt.R("id", "footerItems");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(FooterItem.f6059a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasSummaryQuery.Footer(str, arrayListFromJson);
            }
            Assertions.a(reader, "footerItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.Footer value = (EverydayExtrasSummaryQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5960a);
            writer.F1("footerItems");
            Adapters.a(Adapters.c(FooterItem.f6059a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$FooterItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$FooterItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterItem implements Adapter<EverydayExtrasSummaryQuery.FooterItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterItem f6059a = new FooterItem();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            EverydayExtraButtonStyle everydayExtraButtonStyle = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    everydayExtraButtonStyle = (EverydayExtraButtonStyle) Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasSummaryQuery.FooterItem(everydayExtraButtonStyle, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.FooterItem value = (EverydayExtrasSummaryQuery.FooterItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5961a);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$OnCheckableTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnCheckableTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCheckableTextItem implements Adapter<EverydayExtrasSummaryQuery.OnCheckableTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6060a = CollectionsKt.R("content", "isRequired", "errorText");

        public static EverydayExtrasSummaryQuery.OnCheckableTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f6060a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (bool != null) {
                return new EverydayExtrasSummaryQuery.OnCheckableTextItem(str, str2, bool.booleanValue());
            }
            Assertions.a(reader, "isRequired");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasSummaryQuery.OnCheckableTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5962a);
            writer.F1("isRequired");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "errorText");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasSummaryQuery.OnCheckableTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$OnDivider;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnDivider;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDivider implements Adapter<EverydayExtrasSummaryQuery.OnDivider> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6061a = CollectionsKt.Q("type");

        public static EverydayExtrasSummaryQuery.OnDivider a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DividerType dividerTypeA = null;
            while (reader.o2(f6061a) == 0) {
                dividerTypeA = DividerType_ResponseAdapter.a(reader, customScalarAdapters);
            }
            if (dividerTypeA != null) {
                return new EverydayExtrasSummaryQuery.OnDivider(dividerTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasSummaryQuery.OnDivider value = (EverydayExtrasSummaryQuery.OnDivider) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            DividerType_ResponseAdapter.b(writer, customScalarAdapters, value.f5963a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$OnEverydayExtraSelectedPlan;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnEverydayExtraSelectedPlan;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraSelectedPlan implements Adapter<EverydayExtrasSummaryQuery.OnEverydayExtraSelectedPlan> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6062a = CollectionsKt.R("title", "price", "button");

        public static EverydayExtrasSummaryQuery.OnEverydayExtraSelectedPlan a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            EverydayExtrasSummaryQuery.Button button = null;
            while (true) {
                int iO2 = reader.o2(f6062a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    button = (EverydayExtrasSummaryQuery.Button) Adapters.c(Button.f6048a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (num == null) {
                Assertions.a(reader, "price");
                throw null;
            }
            int iIntValue = num.intValue();
            if (button != null) {
                return new EverydayExtrasSummaryQuery.OnEverydayExtraSelectedPlan(str, iIntValue, button);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasSummaryQuery.OnEverydayExtraSelectedPlan value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5964a);
            writer.F1("price");
            d.y(value.b, Adapters.b, writer, customScalarAdapters, "button");
            Adapters.c(Button.f6048a, false).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasSummaryQuery.OnEverydayExtraSelectedPlan) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$OnEverydayExtraWpayPayment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnEverydayExtraWpayPayment;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraWpayPayment implements Adapter<EverydayExtrasSummaryQuery.OnEverydayExtraWpayPayment> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6063a = CollectionsKt.R("titleIcon", "title", AnnotatedPrivateKey.LABEL, "labelIcon", "errors", "cardProvidersLabel", "cardProviders");

        public static EverydayExtrasSummaryQuery.OnEverydayExtraWpayPayment a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            EverydayExtrasSummaryQuery.Errors errors = null;
            String str5 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                switch (reader.o2(f6063a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        errors = (EverydayExtrasSummaryQuery.Errors) Adapters.c(Errors.f6055a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        arrayListFromJson = Adapters.a(Adapters.c(CardProvider.f6050a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "titleIcon");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "labelIcon");
                            throw null;
                        }
                        if (errors == null) {
                            Assertions.a(reader, "errors");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "cardProvidersLabel");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new EverydayExtrasSummaryQuery.OnEverydayExtraWpayPayment(str, str2, str3, str4, errors, str5, arrayListFromJson);
                        }
                        Assertions.a(reader, "cardProviders");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasSummaryQuery.OnEverydayExtraWpayPayment value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("titleIcon");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5965a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("labelIcon");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("errors");
            Adapters.c(Errors.f6055a, false).toJson(writer, customScalarAdapters, value.e);
            writer.F1("cardProvidersLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("cardProviders");
            Adapters.a(Adapters.c(CardProvider.f6050a, false)).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasSummaryQuery.OnEverydayExtraWpayPayment) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$OnParagraphTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnParagraphTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem implements Adapter<EverydayExtrasSummaryQuery.OnParagraphTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6064a = CollectionsKt.Q("content");

        public static EverydayExtrasSummaryQuery.OnParagraphTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f6064a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EverydayExtrasSummaryQuery.OnParagraphTextItem(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasSummaryQuery.OnParagraphTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5966a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasSummaryQuery.OnParagraphTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$OnSmallAppIconListItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnSmallAppIconListItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSmallAppIconListItem implements Adapter<EverydayExtrasSummaryQuery.OnSmallAppIconListItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6065a = CollectionsKt.R("iconUrl", AnnotatedPrivateKey.LABEL);

        public static EverydayExtrasSummaryQuery.OnSmallAppIconListItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f6065a);
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
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasSummaryQuery.OnSmallAppIconListItem(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasSummaryQuery.OnSmallAppIconListItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5967a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasSummaryQuery.OnSmallAppIconListItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$OnSubheadTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnSubheadTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSubheadTextItem implements Adapter<EverydayExtrasSummaryQuery.OnSubheadTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6066a = CollectionsKt.Q("content");

        public static EverydayExtrasSummaryQuery.OnSubheadTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f6066a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EverydayExtrasSummaryQuery.OnSubheadTextItem(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasSummaryQuery.OnSubheadTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5968a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasSummaryQuery.OnSubheadTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasSummaryQuery_ResponseAdapter$OnTitleTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSummaryQuery$OnTitleTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTitleTextItem implements Adapter<EverydayExtrasSummaryQuery.OnTitleTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f6067a = CollectionsKt.Q("content");

        public static EverydayExtrasSummaryQuery.OnTitleTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f6067a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EverydayExtrasSummaryQuery.OnTitleTextItem(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasSummaryQuery.OnTitleTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5969a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasSummaryQuery.OnTitleTextItem) obj);
        }
    }
}
