package au.com.woolworths.feature.rewards.everydayextras.signup.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasChoosePlanQuery;
import au.com.woolworths.rewards.graphql.type.BadgeType;
import au.com.woolworths.rewards.graphql.type.EverydayExtraButtonStyle;
import au.com.woolworths.rewards.graphql.type.SpacerType;
import au.com.woolworths.rewards.graphql.type.adapter.BadgeType_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraButtonStyle_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.adapter.SpacerType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter;", "", "Data", "EverydayExtraChoosePlan", "Content", "ContentItem", "OnTitleTextItem", "OnSmallAppIconListItem", "OnEverydayExtraSubscribePlan", "Badge", "OnSpacer", "OnEverydayExtraButton", "Footer", "FooterItem", "OnEverydayExtraButton1", "OnNoteTextItem", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasChoosePlanQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Badge;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge implements Adapter<EverydayExtrasChoosePlanQuery.Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge f5984a = new Badge();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            BadgeType badgeTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    badgeTypeA = BadgeType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (badgeTypeA != null) {
                return new EverydayExtrasChoosePlanQuery.Badge(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasChoosePlanQuery.Badge value = (EverydayExtrasChoosePlanQuery.Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5865a);
            writer.F1("type");
            writer.v0(value.b.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$Content;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Content;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content implements Adapter<EverydayExtrasChoosePlanQuery.Content> {

        /* renamed from: a, reason: collision with root package name */
        public static final Content f5985a = new Content();
        public static final List b = CollectionsKt.R("__typename", "id", "contentItems");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
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
                    arrayListFromJson = Adapters.a(Adapters.c(ContentItem.f5986a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasChoosePlanQuery.Content(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "contentItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasChoosePlanQuery.Content value = (EverydayExtrasChoosePlanQuery.Content) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5866a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contentItems");
            Adapters.a(Adapters.c(ContentItem.f5986a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$ContentItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$ContentItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentItem implements Adapter<EverydayExtrasChoosePlanQuery.ContentItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentItem f5986a = new ContentItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtrasChoosePlanQuery.OnTitleTextItem onTitleTextItemA;
            EverydayExtrasChoosePlanQuery.OnSmallAppIconListItem onSmallAppIconListItemA;
            EverydayExtrasChoosePlanQuery.OnEverydayExtraSubscribePlan onEverydayExtraSubscribePlanA;
            EverydayExtrasChoosePlanQuery.OnSpacer onSpacerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtrasChoosePlanQuery.OnEverydayExtraButton onEverydayExtraButtonA = null;
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
            if (a.C(set2, set, null, str, BooleanExpressions.c("SmallAppIconListItem"))) {
                reader.o();
                onSmallAppIconListItemA = OnSmallAppIconListItem.a(reader, customScalarAdapters);
            } else {
                onSmallAppIconListItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraSubscribePlan"))) {
                reader.o();
                onEverydayExtraSubscribePlanA = OnEverydayExtraSubscribePlan.a(reader, customScalarAdapters);
            } else {
                onEverydayExtraSubscribePlanA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Spacer"))) {
                reader.o();
                onSpacerA = OnSpacer.a(reader, customScalarAdapters);
            } else {
                onSpacerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraButton"))) {
                reader.o();
                onEverydayExtraButtonA = OnEverydayExtraButton.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasChoosePlanQuery.ContentItem(str, onTitleTextItemA, onSmallAppIconListItemA, onEverydayExtraSubscribePlanA, onSpacerA, onEverydayExtraButtonA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasChoosePlanQuery.ContentItem value = (EverydayExtrasChoosePlanQuery.ContentItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5867a);
            EverydayExtrasChoosePlanQuery.OnTitleTextItem onTitleTextItem = value.b;
            if (onTitleTextItem != null) {
                OnTitleTextItem.b(writer, customScalarAdapters, onTitleTextItem);
            }
            EverydayExtrasChoosePlanQuery.OnSmallAppIconListItem onSmallAppIconListItem = value.c;
            if (onSmallAppIconListItem != null) {
                OnSmallAppIconListItem.b(writer, customScalarAdapters, onSmallAppIconListItem);
            }
            EverydayExtrasChoosePlanQuery.OnEverydayExtraSubscribePlan onEverydayExtraSubscribePlan = value.d;
            if (onEverydayExtraSubscribePlan != null) {
                OnEverydayExtraSubscribePlan.b(writer, customScalarAdapters, onEverydayExtraSubscribePlan);
            }
            EverydayExtrasChoosePlanQuery.OnSpacer onSpacer = value.e;
            if (onSpacer != null) {
                OnSpacer.b(writer, customScalarAdapters, onSpacer);
            }
            EverydayExtrasChoosePlanQuery.OnEverydayExtraButton onEverydayExtraButton = value.f;
            if (onEverydayExtraButton != null) {
                OnEverydayExtraButton.b(writer, customScalarAdapters, onEverydayExtraButton);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<EverydayExtrasChoosePlanQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f5987a = new Data();
        public static final List b = CollectionsKt.Q("everydayExtraChoosePlan");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EverydayExtrasChoosePlanQuery.EverydayExtraChoosePlan everydayExtraChoosePlan = null;
            while (reader.o2(b) == 0) {
                everydayExtraChoosePlan = (EverydayExtrasChoosePlanQuery.EverydayExtraChoosePlan) Adapters.b(Adapters.c(EverydayExtraChoosePlan.f5988a, false)).fromJson(reader, customScalarAdapters);
            }
            return new EverydayExtrasChoosePlanQuery.Data(everydayExtraChoosePlan);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasChoosePlanQuery.Data value = (EverydayExtrasChoosePlanQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("everydayExtraChoosePlan");
            Adapters.b(Adapters.c(EverydayExtraChoosePlan.f5988a, false)).toJson(writer, customScalarAdapters, value.f5868a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$EverydayExtraChoosePlan;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$EverydayExtraChoosePlan;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EverydayExtraChoosePlan implements Adapter<EverydayExtrasChoosePlanQuery.EverydayExtraChoosePlan> {

        /* renamed from: a, reason: collision with root package name */
        public static final EverydayExtraChoosePlan f5988a = new EverydayExtraChoosePlan();
        public static final List b = CollectionsKt.R("__typename", "navigationTitle", "content", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            EverydayExtrasChoosePlanQuery.Content content = null;
            EverydayExtrasChoosePlanQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    content = (EverydayExtrasChoosePlanQuery.Content) Adapters.c(Content.f5985a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    footer = (EverydayExtrasChoosePlanQuery.Footer) Adapters.b(Adapters.c(Footer.f5989a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (content != null) {
                return new EverydayExtrasChoosePlanQuery.EverydayExtraChoosePlan(str, str2, content, footer);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasChoosePlanQuery.EverydayExtraChoosePlan value = (EverydayExtrasChoosePlanQuery.EverydayExtraChoosePlan) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5869a);
            writer.F1("navigationTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("content");
            Adapters.c(Content.f5985a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f5989a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Footer;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<EverydayExtrasChoosePlanQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f5989a = new Footer();
        public static final List b = CollectionsKt.R("__typename", "id", "footerItems");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
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
                    arrayListFromJson = Adapters.a(Adapters.c(FooterItem.f5990a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EverydayExtrasChoosePlanQuery.Footer(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "footerItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasChoosePlanQuery.Footer value = (EverydayExtrasChoosePlanQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5870a);
            writer.F1("id");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("footerItems");
            Adapters.a(Adapters.c(FooterItem.f5990a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$FooterItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$FooterItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterItem implements Adapter<EverydayExtrasChoosePlanQuery.FooterItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterItem f5990a = new FooterItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EverydayExtrasChoosePlanQuery.OnEverydayExtraButton1 onEverydayExtraButton1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EverydayExtrasChoosePlanQuery.OnNoteTextItem onNoteTextItemA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("EverydayExtraButton"))) {
                reader.o();
                onEverydayExtraButton1A = OnEverydayExtraButton1.a(reader, customScalarAdapters);
            } else {
                onEverydayExtraButton1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("NoteTextItem"))) {
                reader.o();
                onNoteTextItemA = OnNoteTextItem.a(reader, customScalarAdapters);
            }
            return new EverydayExtrasChoosePlanQuery.FooterItem(str, onEverydayExtraButton1A, onNoteTextItemA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EverydayExtrasChoosePlanQuery.FooterItem value = (EverydayExtrasChoosePlanQuery.FooterItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5871a);
            EverydayExtrasChoosePlanQuery.OnEverydayExtraButton1 onEverydayExtraButton1 = value.b;
            if (onEverydayExtraButton1 != null) {
                OnEverydayExtraButton1.b(writer, customScalarAdapters, onEverydayExtraButton1);
            }
            EverydayExtrasChoosePlanQuery.OnNoteTextItem onNoteTextItem = value.c;
            if (onNoteTextItem != null) {
                OnNoteTextItem.b(writer, customScalarAdapters, onNoteTextItem);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$OnEverydayExtraButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnEverydayExtraButton;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraButton implements Adapter<EverydayExtrasChoosePlanQuery.OnEverydayExtraButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5991a = CollectionsKt.R("__typename", AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style");

        public static EverydayExtrasChoosePlanQuery.OnEverydayExtraButton a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            EverydayExtraButtonStyle everydayExtraButtonStyle = null;
            while (true) {
                int iO2 = reader.o2(f5991a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    everydayExtraButtonStyle = (EverydayExtraButtonStyle) Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str3 != null) {
                return new EverydayExtrasChoosePlanQuery.OnEverydayExtraButton(str, str2, str3, everydayExtraButtonStyle);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasChoosePlanQuery.OnEverydayExtraButton value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5872a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("style");
            Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasChoosePlanQuery.OnEverydayExtraButton) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$OnEverydayExtraButton1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnEverydayExtraButton1;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraButton1 implements Adapter<EverydayExtrasChoosePlanQuery.OnEverydayExtraButton1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5992a = CollectionsKt.R("__typename", AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "actionUrl", "style");

        public static EverydayExtrasChoosePlanQuery.OnEverydayExtraButton1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            EverydayExtraButtonStyle everydayExtraButtonStyle = null;
            while (true) {
                int iO2 = reader.o2(f5992a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    everydayExtraButtonStyle = (EverydayExtraButtonStyle) Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str3 != null) {
                return new EverydayExtrasChoosePlanQuery.OnEverydayExtraButton1(str, str2, str3, str4, everydayExtraButtonStyle);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasChoosePlanQuery.OnEverydayExtraButton1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5873a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("style");
            Adapters.b(EverydayExtraButtonStyle_ResponseAdapter.f9950a).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasChoosePlanQuery.OnEverydayExtraButton1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$OnEverydayExtraSubscribePlan;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnEverydayExtraSubscribePlan;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEverydayExtraSubscribePlan implements Adapter<EverydayExtrasChoosePlanQuery.OnEverydayExtraSubscribePlan> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5993a = CollectionsKt.R("__typename", "identifier", "planTitle", NotificationMessage.NOTIF_KEY_SUB_TITLE, "price", "badge");

        public static EverydayExtrasChoosePlanQuery.OnEverydayExtraSubscribePlan a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            EverydayExtrasChoosePlanQuery.Badge badge = null;
            while (true) {
                int iO2 = reader.o2(f5993a);
                if (iO2 == 0) {
                    num = num2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    num = num2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = num2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    num = num2;
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    num = num2;
                    badge = (EverydayExtrasChoosePlanQuery.Badge) Adapters.b(Adapters.c(Badge.f5984a, false)).fromJson(reader, customScalarAdapters);
                }
                num2 = num;
            }
            Integer num3 = num2;
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "identifier");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "planTitle");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (num3 != null) {
                return new EverydayExtrasChoosePlanQuery.OnEverydayExtraSubscribePlan(str, str2, str3, str4, num3.intValue(), badge);
            }
            Assertions.a(reader, "price");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasChoosePlanQuery.OnEverydayExtraSubscribePlan value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5874a);
            writer.F1("identifier");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("planTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("price");
            d.y(value.e, Adapters.b, writer, customScalarAdapters, "badge");
            Adapters.b(Adapters.c(Badge.f5984a, false)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasChoosePlanQuery.OnEverydayExtraSubscribePlan) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$OnNoteTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnNoteTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnNoteTextItem implements Adapter<EverydayExtrasChoosePlanQuery.OnNoteTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5994a = CollectionsKt.R("__typename", "content");

        public static EverydayExtrasChoosePlanQuery.OnNoteTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f5994a);
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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasChoosePlanQuery.OnNoteTextItem(str, str2);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasChoosePlanQuery.OnNoteTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5875a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasChoosePlanQuery.OnNoteTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$OnSmallAppIconListItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnSmallAppIconListItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSmallAppIconListItem implements Adapter<EverydayExtrasChoosePlanQuery.OnSmallAppIconListItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5995a = CollectionsKt.R("__typename", "iconUrl", AnnotatedPrivateKey.LABEL);

        public static EverydayExtrasChoosePlanQuery.OnSmallAppIconListItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f5995a);
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
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str3 != null) {
                return new EverydayExtrasChoosePlanQuery.OnSmallAppIconListItem(str, str2, str3);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasChoosePlanQuery.OnSmallAppIconListItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5876a);
            writer.F1("iconUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasChoosePlanQuery.OnSmallAppIconListItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$OnSpacer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnSpacer;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnSpacer implements Adapter<EverydayExtrasChoosePlanQuery.OnSpacer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5996a = CollectionsKt.R("__typename", "size");

        public static EverydayExtrasChoosePlanQuery.OnSpacer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            SpacerType spacerTypeA = null;
            while (true) {
                int iO2 = reader.o2(f5996a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    spacerTypeA = SpacerType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (spacerTypeA != null) {
                return new EverydayExtrasChoosePlanQuery.OnSpacer(str, spacerTypeA);
            }
            Assertions.a(reader, "size");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasChoosePlanQuery.OnSpacer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5877a);
            writer.F1("size");
            writer.v0(value.b.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasChoosePlanQuery.OnSpacer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/adapter/EverydayExtrasChoosePlanQuery_ResponseAdapter$OnTitleTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnTitleTextItem;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnTitleTextItem implements Adapter<EverydayExtrasChoosePlanQuery.OnTitleTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5997a = CollectionsKt.R("__typename", "content");

        public static EverydayExtrasChoosePlanQuery.OnTitleTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f5997a);
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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 != null) {
                return new EverydayExtrasChoosePlanQuery.OnTitleTextItem(str, str2);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EverydayExtrasChoosePlanQuery.OnTitleTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5878a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EverydayExtrasChoosePlanQuery.OnTitleTextItem) obj);
        }
    }
}
