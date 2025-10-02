package com.woolworths.feature.shop.contentpage.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.graphql.type.InfoTileIconSlotSize;
import au.com.woolworths.shop.graphql.type.InfoTileStyle;
import au.com.woolworths.shop.graphql.type.adapter.InfoTileIconSlotSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InfoTileStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.feature.shop.contentpage.fragment.ActionFieldsImpl_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.HostedIconFieldsImpl_ResponseAdapter;
import com.woolworths.feature.shop.contentpage.fragment.InfoTileFields;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFieldsImpl_ResponseAdapter;", "", "InfoTileFields", "InfoTileIconSlot", "Icon", "OnHostedIcon", "OnInfoTileBadge", "InfoTileCta", "InfoTileCtaAction", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfoTileFieldsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFieldsImpl_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$Icon;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<InfoTileFields.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f19777a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            InfoTileFields.OnHostedIcon onHostedIconA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            InfoTileFields.OnInfoTileBadge onInfoTileBadgeA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            } else {
                onHostedIconA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InfoTileBadge"))) {
                reader.o();
                onInfoTileBadgeA = OnInfoTileBadge.a(reader, customScalarAdapters);
            }
            return new InfoTileFields.Icon(str, onHostedIconA, onInfoTileBadgeA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            InfoTileFields.Icon value = (InfoTileFields.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19771a);
            InfoTileFields.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
            InfoTileFields.OnInfoTileBadge onInfoTileBadge = value.c;
            if (onInfoTileBadge != null) {
                OnInfoTileBadge.b(writer, customScalarAdapters, onInfoTileBadge);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFieldsImpl_ResponseAdapter$InfoTileCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$InfoTileCta;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoTileCta implements Adapter<InfoTileFields.InfoTileCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final InfoTileCta f19778a = new InfoTileCta();
        public static final List b = CollectionsKt.R("infoTileCtaLabel", "infoTileCtaAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            InfoTileFields.InfoTileCtaAction infoTileCtaAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    infoTileCtaAction = (InfoTileFields.InfoTileCtaAction) Adapters.c(InfoTileCtaAction.f19779a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "infoTileCtaLabel");
                throw null;
            }
            if (infoTileCtaAction != null) {
                return new InfoTileFields.InfoTileCta(str, infoTileCtaAction);
            }
            Assertions.a(reader, "infoTileCtaAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            InfoTileFields.InfoTileCta value = (InfoTileFields.InfoTileCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("infoTileCtaLabel");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19772a);
            writer.F1("infoTileCtaAction");
            Adapters.c(InfoTileCtaAction.f19779a, true).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFieldsImpl_ResponseAdapter$InfoTileCtaAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$InfoTileCtaAction;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoTileCtaAction implements Adapter<InfoTileFields.InfoTileCtaAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final InfoTileCtaAction f19779a = new InfoTileCtaAction();
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
            ActionFields actionFieldsA = ActionFieldsImpl_ResponseAdapter.ActionFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new InfoTileFields.InfoTileCtaAction(str, actionFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            InfoTileFields.InfoTileCtaAction value = (InfoTileFields.InfoTileCtaAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19773a);
            List list = ActionFieldsImpl_ResponseAdapter.ActionFields.f19526a;
            ActionFieldsImpl_ResponseAdapter.ActionFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFieldsImpl_ResponseAdapter$InfoTileFields;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoTileFields implements Adapter<com.woolworths.feature.shop.contentpage.fragment.InfoTileFields> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19780a = CollectionsKt.R("infoTileIconSlot", "infoTileTitle", "infoTileBodyMarkdown", "infoTileCta", "infoTileStyle");

        public static com.woolworths.feature.shop.contentpage.fragment.InfoTileFields a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InfoTileFields.InfoTileIconSlot infoTileIconSlot = null;
            String str = null;
            String str2 = null;
            InfoTileFields.InfoTileCta infoTileCta = null;
            InfoTileStyle infoTileStyleA = null;
            while (true) {
                int iO2 = reader.o2(f19780a);
                if (iO2 == 0) {
                    infoTileIconSlot = (InfoTileFields.InfoTileIconSlot) Adapters.b(Adapters.c(InfoTileIconSlot.f19781a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    infoTileCta = (InfoTileFields.InfoTileCta) Adapters.b(Adapters.c(InfoTileCta.f19778a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    infoTileStyleA = InfoTileStyle_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "infoTileTitle");
                throw null;
            }
            if (infoTileStyleA != null) {
                return new com.woolworths.feature.shop.contentpage.fragment.InfoTileFields(infoTileIconSlot, str, str2, infoTileCta, infoTileStyleA);
            }
            Assertions.a(reader, "infoTileStyle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.feature.shop.contentpage.fragment.InfoTileFields value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("infoTileIconSlot");
            Adapters.b(Adapters.c(InfoTileIconSlot.f19781a, false)).toJson(writer, customScalarAdapters, value.f19770a);
            writer.F1("infoTileTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("infoTileBodyMarkdown");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("infoTileCta");
            Adapters.b(Adapters.c(InfoTileCta.f19778a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("infoTileStyle");
            writer.v0(value.e.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.feature.shop.contentpage.fragment.InfoTileFields) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFieldsImpl_ResponseAdapter$InfoTileIconSlot;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$InfoTileIconSlot;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoTileIconSlot implements Adapter<InfoTileFields.InfoTileIconSlot> {

        /* renamed from: a, reason: collision with root package name */
        public static final InfoTileIconSlot f19781a = new InfoTileIconSlot();
        public static final List b = CollectionsKt.R(BarcodePickDeserializer.FIELD_ICON, "size");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InfoTileFields.Icon icon = null;
            InfoTileIconSlotSize infoTileIconSlotSizeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    icon = (InfoTileFields.Icon) Adapters.c(Icon.f19777a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    infoTileIconSlotSizeA = InfoTileIconSlotSize_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (icon == null) {
                Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                throw null;
            }
            if (infoTileIconSlotSizeA != null) {
                return new InfoTileFields.InfoTileIconSlot(icon, infoTileIconSlotSizeA);
            }
            Assertions.a(reader, "size");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            InfoTileFields.InfoTileIconSlot value = (InfoTileFields.InfoTileIconSlot) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f19777a, true).toJson(writer, customScalarAdapters, value.f19774a);
            writer.F1("size");
            writer.v0(value.b.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFieldsImpl_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$OnHostedIcon;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<InfoTileFields.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19782a = CollectionsKt.Q("__typename");

        public static InfoTileFields.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19782a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            HostedIconFields hostedIconFieldsA = HostedIconFieldsImpl_ResponseAdapter.HostedIconFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new InfoTileFields.OnHostedIcon(str, hostedIconFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, InfoTileFields.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19775a);
            List list = HostedIconFieldsImpl_ResponseAdapter.HostedIconFields.f19769a;
            HostedIconFieldsImpl_ResponseAdapter.HostedIconFields.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (InfoTileFields.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFieldsImpl_ResponseAdapter$OnInfoTileBadge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/contentpage/fragment/InfoTileFields$OnInfoTileBadge;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInfoTileBadge implements Adapter<InfoTileFields.OnInfoTileBadge> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f19783a = CollectionsKt.Q("number");

        public static InfoTileFields.OnInfoTileBadge a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f19783a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new InfoTileFields.OnInfoTileBadge(str);
            }
            Assertions.a(reader, "number");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, InfoTileFields.OnInfoTileBadge value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("number");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19776a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (InfoTileFields.OnInfoTileBadge) obj);
        }
    }
}
