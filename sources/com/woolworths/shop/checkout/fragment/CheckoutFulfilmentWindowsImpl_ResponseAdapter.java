package com.woolworths.shop.checkout.fragment;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.CoreTagUI;
import au.com.woolworths.sdui.shop.fragment.CoreTagUIImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.CheckoutBadgeStyle;
import au.com.woolworths.shop.graphql.type.DeliveryNowStatus;
import au.com.woolworths.shop.graphql.type.DirectToBootNowStatus;
import au.com.woolworths.shop.graphql.type.FulfilmentWindowSlotSelectionOptionId;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.BadgeType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CheckoutBadgeStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DeliveryNowStatus_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DirectToBootNowStatus_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.FulfilmentWindowSlotSelectionOptionId_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.k;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows;
import com.woolworths.shop.checkout.fragment.FulfilmentExtraInfoImpl_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.SelectionInfoImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b6\bÇ\u0002\u0018\u00002\u00020\u0001:5\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456¨\u00067"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter;", "", "CheckoutFulfilmentWindows", "Subheader", "Action", "Footer", "SuggestedGroup", "Slot", "Badge", "SelectionInfo", "Tag", "Status", "BottomSheet", "Option", "FooterV2", "ExtraInfoButton", "ExtraInfo", "DeliveryNowV2", "Tag1", "Status1", "Info", "Item", "DeliveryNowV2Badge", "AltLabel", "SelectionInfo1", "DirectToBootNow", "DirectToBootNowV2", "Tag2", "Status2", "DirectToBootNowV2Badge", "AltLabel1", "TileBadge", "SelectionInfo2", "SelectionOptionsState", "Group", "Message", "Slot1", "Badge1", "SelectionInfo3", "SelectionOptionsState1", "Tag3", "Status3", "SlotsV2", "Badge2", "SelectionInfo4", "Tag4", "Status4", "FeesInfo", "SelectionOptionsInfo", "SelectionOption", "Icon", "SelectionOptionsInfoTag", "AltLabel2", "DisabledBadge", "AltLabel3", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CheckoutFulfilmentWindowsImpl_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Action;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<CheckoutFulfilmentWindows.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f22425a = new Action();
        public static final List b = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerActionPlacementA = InsetBannerActionPlacement_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerActionTypeA = InsetBannerActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerActionPlacementA == null) {
                Assertions.a(reader, "placement");
                throw null;
            }
            if (insetBannerActionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new CheckoutFulfilmentWindows.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Action value = (CheckoutFulfilmentWindows.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f22373a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$AltLabel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$AltLabel;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AltLabel implements Adapter<CheckoutFulfilmentWindows.AltLabel> {

        /* renamed from: a, reason: collision with root package name */
        public static final AltLabel f22426a = new AltLabel();
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
                return new CheckoutFulfilmentWindows.AltLabel(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.AltLabel value = (CheckoutFulfilmentWindows.AltLabel) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22374a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$AltLabel1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$AltLabel1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AltLabel1 implements Adapter<CheckoutFulfilmentWindows.AltLabel1> {

        /* renamed from: a, reason: collision with root package name */
        public static final AltLabel1 f22427a = new AltLabel1();
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
                return new CheckoutFulfilmentWindows.AltLabel1(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.AltLabel1 value = (CheckoutFulfilmentWindows.AltLabel1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22375a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$AltLabel2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$AltLabel2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AltLabel2 implements Adapter<CheckoutFulfilmentWindows.AltLabel2> {

        /* renamed from: a, reason: collision with root package name */
        public static final AltLabel2 f22428a = new AltLabel2();
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
                return new CheckoutFulfilmentWindows.AltLabel2(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.AltLabel2 value = (CheckoutFulfilmentWindows.AltLabel2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22376a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$AltLabel3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$AltLabel3;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AltLabel3 implements Adapter<CheckoutFulfilmentWindows.AltLabel3> {

        /* renamed from: a, reason: collision with root package name */
        public static final AltLabel3 f22429a = new AltLabel3();
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
                return new CheckoutFulfilmentWindows.AltLabel3(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.AltLabel3 value = (CheckoutFulfilmentWindows.AltLabel3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22377a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Badge;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge implements Adapter<CheckoutFulfilmentWindows.Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge f22430a = new Badge();
        public static final List b = CollectionsKt.R("title", "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutBadgeStyle checkoutBadgeStyleA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    checkoutBadgeStyleA = CheckoutBadgeStyle_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (checkoutBadgeStyleA != null) {
                return new CheckoutFulfilmentWindows.Badge(str, checkoutBadgeStyleA);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Badge value = (CheckoutFulfilmentWindows.Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22378a);
            writer.F1("style");
            CheckoutBadgeStyle_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Badge1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Badge1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge1 implements Adapter<CheckoutFulfilmentWindows.Badge1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge1 f22431a = new Badge1();
        public static final List b = CollectionsKt.R("title", "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutBadgeStyle checkoutBadgeStyleA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    checkoutBadgeStyleA = CheckoutBadgeStyle_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (checkoutBadgeStyleA != null) {
                return new CheckoutFulfilmentWindows.Badge1(str, checkoutBadgeStyleA);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Badge1 value = (CheckoutFulfilmentWindows.Badge1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22379a);
            writer.F1("style");
            CheckoutBadgeStyle_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Badge2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Badge2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge2 implements Adapter<CheckoutFulfilmentWindows.Badge2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge2 f22432a = new Badge2();
        public static final List b = CollectionsKt.R("title", "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutBadgeStyle checkoutBadgeStyleA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    checkoutBadgeStyleA = CheckoutBadgeStyle_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (checkoutBadgeStyleA != null) {
                return new CheckoutFulfilmentWindows.Badge2(str, checkoutBadgeStyleA);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Badge2 value = (CheckoutFulfilmentWindows.Badge2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22380a);
            writer.F1("style");
            CheckoutBadgeStyle_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$BottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$BottomSheet;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomSheet implements Adapter<CheckoutFulfilmentWindows.BottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final BottomSheet f22433a = new BottomSheet();
        public static final List b = CollectionsKt.R("bottomSheetTitle", "bottomSheetBody");

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
                Assertions.a(reader, "bottomSheetTitle");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutFulfilmentWindows.BottomSheet(str, str2);
            }
            Assertions.a(reader, "bottomSheetBody");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.BottomSheet value = (CheckoutFulfilmentWindows.BottomSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bottomSheetTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22381a);
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$CheckoutFulfilmentWindows;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutFulfilmentWindows implements Adapter<com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f22434a = CollectionsKt.R("title", "header", "subheader", NotificationMessage.NOTIF_KEY_SUB_TITLE, "footer", "sectionHeader", "suggestedGroup", "options", "feesInfo", "selectionOptionsInfo");

        public static com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CheckoutFulfilmentWindows.Subheader subheader = null;
            String str3 = null;
            CheckoutFulfilmentWindows.Footer footer = null;
            String str4 = null;
            CheckoutFulfilmentWindows.SuggestedGroup suggestedGroup = null;
            ArrayList arrayListFromJson = null;
            CheckoutFulfilmentWindows.FeesInfo feesInfo = null;
            CheckoutFulfilmentWindows.SelectionOptionsInfo selectionOptionsInfo = null;
            while (true) {
                switch (reader.o2(f22434a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        subheader = (CheckoutFulfilmentWindows.Subheader) Adapters.b(Adapters.c(Subheader.f22470a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        footer = (CheckoutFulfilmentWindows.Footer) Adapters.b(Adapters.c(Footer.f22444a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        suggestedGroup = (CheckoutFulfilmentWindows.SuggestedGroup) Adapters.b(Adapters.c(SuggestedGroup.f22471a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        arrayListFromJson = Adapters.a(Adapters.c(Option.f22451a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        feesInfo = (CheckoutFulfilmentWindows.FeesInfo) Adapters.b(Adapters.c(FeesInfo.f22443a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        selectionOptionsInfo = (CheckoutFulfilmentWindows.SelectionOptionsInfo) Adapters.b(Adapters.c(SelectionOptionsInfo.f22458a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "header");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows(str, str2, subheader, str3, footer, str4, suggestedGroup, arrayListFromJson, feesInfo, selectionOptionsInfo);
                        }
                        Assertions.a(reader, "options");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22372a);
            writer.F1("header");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("subheader");
            Adapters.b(Adapters.c(Subheader.f22470a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f22444a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("sectionHeader");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("suggestedGroup");
            Adapters.b(Adapters.c(SuggestedGroup.f22471a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("options");
            Adapters.a(Adapters.c(Option.f22451a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("feesInfo");
            Adapters.b(Adapters.c(FeesInfo.f22443a, true)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("selectionOptionsInfo");
            Adapters.b(Adapters.c(SelectionOptionsInfo.f22458a, false)).toJson(writer, customScalarAdapters, value.j);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$DeliveryNowV2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DeliveryNowV2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowV2 implements Adapter<CheckoutFulfilmentWindows.DeliveryNowV2> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryNowV2 f22435a = new DeliveryNowV2();
        public static final List b = CollectionsKt.R("id", "startTime", k.a.g, "statuses", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "secondarySubtitle", "sectionTitle", "imageUrl", "messageTitle", "buttonTitle", "info", "isSelected", "isEnabled", "deliveryNowV2Badge", "selectionInfo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            List list = null;
            List list2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            CheckoutFulfilmentWindows.Info info = null;
            CheckoutFulfilmentWindows.DeliveryNowV2Badge deliveryNowV2Badge = null;
            CheckoutFulfilmentWindows.SelectionInfo1 selectionInfo1 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool = bool2;
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Tag1.f22473a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(Status1.f22466a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 9:
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 10:
                        str8 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 11:
                        bool = bool2;
                        info = (CheckoutFulfilmentWindows.Info) Adapters.c(Info.f22448a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 13:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 14:
                        bool = bool2;
                        deliveryNowV2Badge = (CheckoutFulfilmentWindows.DeliveryNowV2Badge) Adapters.b(Adapters.c(DeliveryNowV2Badge.f22436a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 15:
                        bool = bool2;
                        selectionInfo1 = (CheckoutFulfilmentWindows.SelectionInfo1) Adapters.b(Adapters.c(SelectionInfo1.f22453a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (num == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        Boolean bool5 = bool3;
                        int iIntValue = num.intValue();
                        if (str == null) {
                            Assertions.a(reader, "startTime");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "sectionTitle");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (str7 == null) {
                            Assertions.a(reader, "messageTitle");
                            throw null;
                        }
                        if (str8 == null) {
                            Assertions.a(reader, "buttonTitle");
                            throw null;
                        }
                        if (info == null) {
                            Assertions.a(reader, "info");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (bool5 != null) {
                            return new CheckoutFulfilmentWindows.DeliveryNowV2(iIntValue, str, list, list2, str2, str3, str4, str5, str6, str7, str8, info, zBooleanValue, bool5.booleanValue(), deliveryNowV2Badge, selectionInfo1);
                        }
                        Assertions.a(reader, "isEnabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.DeliveryNowV2 value = (CheckoutFulfilmentWindows.DeliveryNowV2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            d.y(value.f22382a, Adapters.b, writer, customScalarAdapters, "startTime");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(k.a.g);
            Adapters.b(Adapters.a(Adapters.c(Tag1.f22473a, true))).toJson(writer, customScalarAdapters, value.c);
            writer.F1("statuses");
            Adapters.b(Adapters.a(Adapters.c(Status1.f22466a, true))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("secondarySubtitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.g);
            writer.F1("sectionTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
            writer.F1("messageTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.j);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.k);
            writer.F1("info");
            Adapters.c(Info.f22448a, false).toJson(writer, customScalarAdapters, value.l);
            writer.F1("isSelected");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.m, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isEnabled");
            d.B(value.n, adapters$BooleanAdapter$1, writer, customScalarAdapters, "deliveryNowV2Badge");
            Adapters.b(Adapters.c(DeliveryNowV2Badge.f22436a, false)).toJson(writer, customScalarAdapters, value.o);
            writer.F1("selectionInfo");
            Adapters.b(Adapters.c(SelectionInfo1.f22453a, true)).toJson(writer, customScalarAdapters, value.p);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$DeliveryNowV2Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DeliveryNowV2Badge;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowV2Badge implements Adapter<CheckoutFulfilmentWindows.DeliveryNowV2Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryNowV2Badge f22436a = new DeliveryNowV2Badge();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "altLabel", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutFulfilmentWindows.AltLabel altLabel = null;
            BadgeType badgeTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    altLabel = (CheckoutFulfilmentWindows.AltLabel) Adapters.b(Adapters.c(AltLabel.f22426a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
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
                return new CheckoutFulfilmentWindows.DeliveryNowV2Badge(str, altLabel, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.DeliveryNowV2Badge value = (CheckoutFulfilmentWindows.DeliveryNowV2Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22383a);
            writer.F1("altLabel");
            Adapters.b(Adapters.c(AltLabel.f22426a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$DirectToBootNow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DirectToBootNow;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DirectToBootNow implements Adapter<CheckoutFulfilmentWindows.DirectToBootNow> {

        /* renamed from: a, reason: collision with root package name */
        public static final DirectToBootNow f22437a = new DirectToBootNow();
        public static final List b = CollectionsKt.R("id", "startTime", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "secondarySubtitle", "sectionTitle", "imageUrl", "isSelected");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    default:
                        Boolean bool3 = bool2;
                        if (num == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        int iIntValue = num.intValue();
                        if (str == null) {
                            Assertions.a(reader, "startTime");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "sectionTitle");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (bool3 != null) {
                            return new CheckoutFulfilmentWindows.DirectToBootNow(iIntValue, str, str2, str3, str4, str5, str6, bool3.booleanValue());
                        }
                        Assertions.a(reader, "isSelected");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.DirectToBootNow value = (CheckoutFulfilmentWindows.DirectToBootNow) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            d.y(value.f22384a, Adapters.b, writer, customScalarAdapters, "startTime");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("secondarySubtitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("sectionTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("isSelected");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.h));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$DirectToBootNowV2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DirectToBootNowV2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DirectToBootNowV2 implements Adapter<CheckoutFulfilmentWindows.DirectToBootNowV2> {

        /* renamed from: a, reason: collision with root package name */
        public static final DirectToBootNowV2 f22438a = new DirectToBootNowV2();
        public static final List b = CollectionsKt.R("id", "startTime", k.a.g, "statuses", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "secondarySubtitle", "sectionTitle", "imageUrl", "isSelected", "isEnabled", "directToBootNowV2Badge", "tileBadge", "selectionInfo", "selectionOptionsState");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            List list = null;
            List list2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            CheckoutFulfilmentWindows.DirectToBootNowV2Badge directToBootNowV2Badge = null;
            CheckoutFulfilmentWindows.TileBadge tileBadge = null;
            CheckoutFulfilmentWindows.SelectionInfo2 selectionInfo2 = null;
            CheckoutFulfilmentWindows.SelectionOptionsState selectionOptionsState = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool = bool2;
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Tag2.f22474a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(Status2.f22467a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 9:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 10:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 11:
                        directToBootNowV2Badge = (CheckoutFulfilmentWindows.DirectToBootNowV2Badge) Adapters.b(Adapters.c(DirectToBootNowV2Badge.f22439a, false)).fromJson(reader, customScalarAdapters);
                        continue;
                    case 12:
                        tileBadge = (CheckoutFulfilmentWindows.TileBadge) Adapters.b(Adapters.c(TileBadge.f22477a, false)).fromJson(reader, customScalarAdapters);
                        continue;
                    case 13:
                        bool = bool2;
                        selectionInfo2 = (CheckoutFulfilmentWindows.SelectionInfo2) Adapters.b(Adapters.c(SelectionInfo2.f22454a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 14:
                        selectionOptionsState = (CheckoutFulfilmentWindows.SelectionOptionsState) Adapters.b(Adapters.c(SelectionOptionsState.f22460a, false)).fromJson(reader, customScalarAdapters);
                        continue;
                    default:
                        Boolean bool4 = bool2;
                        if (num == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        Boolean bool5 = bool3;
                        int iIntValue = num.intValue();
                        if (str == null) {
                            Assertions.a(reader, "startTime");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "sectionTitle");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (bool5 != null) {
                            return new CheckoutFulfilmentWindows.DirectToBootNowV2(iIntValue, str, list, list2, str2, str3, str4, str5, str6, zBooleanValue, bool5.booleanValue(), directToBootNowV2Badge, tileBadge, selectionInfo2, selectionOptionsState);
                        }
                        Assertions.a(reader, "isEnabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.DirectToBootNowV2 value = (CheckoutFulfilmentWindows.DirectToBootNowV2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            d.y(value.f22385a, Adapters.b, writer, customScalarAdapters, "startTime");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(k.a.g);
            Adapters.b(Adapters.a(Adapters.c(Tag2.f22474a, true))).toJson(writer, customScalarAdapters, value.c);
            writer.F1("statuses");
            Adapters.b(Adapters.a(Adapters.c(Status2.f22467a, true))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("secondarySubtitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.g);
            writer.F1("sectionTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
            writer.F1("isSelected");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.j, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isEnabled");
            d.B(value.k, adapters$BooleanAdapter$1, writer, customScalarAdapters, "directToBootNowV2Badge");
            Adapters.b(Adapters.c(DirectToBootNowV2Badge.f22439a, false)).toJson(writer, customScalarAdapters, value.l);
            writer.F1("tileBadge");
            Adapters.b(Adapters.c(TileBadge.f22477a, false)).toJson(writer, customScalarAdapters, value.m);
            writer.F1("selectionInfo");
            Adapters.b(Adapters.c(SelectionInfo2.f22454a, true)).toJson(writer, customScalarAdapters, value.n);
            writer.F1("selectionOptionsState");
            Adapters.b(Adapters.c(SelectionOptionsState.f22460a, false)).toJson(writer, customScalarAdapters, value.o);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$DirectToBootNowV2Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DirectToBootNowV2Badge;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DirectToBootNowV2Badge implements Adapter<CheckoutFulfilmentWindows.DirectToBootNowV2Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final DirectToBootNowV2Badge f22439a = new DirectToBootNowV2Badge();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "altLabel", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutFulfilmentWindows.AltLabel1 altLabel1 = null;
            BadgeType badgeTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    altLabel1 = (CheckoutFulfilmentWindows.AltLabel1) Adapters.b(Adapters.c(AltLabel1.f22427a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
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
                return new CheckoutFulfilmentWindows.DirectToBootNowV2Badge(str, altLabel1, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.DirectToBootNowV2Badge value = (CheckoutFulfilmentWindows.DirectToBootNowV2Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22386a);
            writer.F1("altLabel");
            Adapters.b(Adapters.c(AltLabel1.f22427a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$DisabledBadge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$DisabledBadge;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DisabledBadge implements Adapter<CheckoutFulfilmentWindows.DisabledBadge> {

        /* renamed from: a, reason: collision with root package name */
        public static final DisabledBadge f22440a = new DisabledBadge();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "altLabel", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutFulfilmentWindows.AltLabel3 altLabel3 = null;
            BadgeType badgeTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    altLabel3 = (CheckoutFulfilmentWindows.AltLabel3) Adapters.b(Adapters.c(AltLabel3.f22429a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
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
                return new CheckoutFulfilmentWindows.DisabledBadge(str, altLabel3, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.DisabledBadge value = (CheckoutFulfilmentWindows.DisabledBadge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22387a);
            writer.F1("altLabel");
            Adapters.b(Adapters.c(AltLabel3.f22429a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$ExtraInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$ExtraInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraInfo implements Adapter<CheckoutFulfilmentWindows.ExtraInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExtraInfo f22441a = new ExtraInfo();
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
            FulfilmentExtraInfo fulfilmentExtraInfoA = FulfilmentExtraInfoImpl_ResponseAdapter.FulfilmentExtraInfo.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.ExtraInfo(str, fulfilmentExtraInfoA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.ExtraInfo value = (CheckoutFulfilmentWindows.ExtraInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22388a);
            List list = FulfilmentExtraInfoImpl_ResponseAdapter.FulfilmentExtraInfo.f22514a;
            FulfilmentExtraInfoImpl_ResponseAdapter.FulfilmentExtraInfo.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$ExtraInfoButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$ExtraInfoButton;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraInfoButton implements Adapter<CheckoutFulfilmentWindows.ExtraInfoButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExtraInfoButton f22442a = new ExtraInfoButton();
        public static final List b = CollectionsKt.R("messageTitle", "buttonTitle");

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
                Assertions.a(reader, "messageTitle");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutFulfilmentWindows.ExtraInfoButton(str, str2);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.ExtraInfoButton value = (CheckoutFulfilmentWindows.ExtraInfoButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("messageTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22389a);
            writer.F1("buttonTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$FeesInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$FeesInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeesInfo implements Adapter<CheckoutFulfilmentWindows.FeesInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final FeesInfo f22443a = new FeesInfo();
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
            FulfilmentExtraInfo fulfilmentExtraInfoA = FulfilmentExtraInfoImpl_ResponseAdapter.FulfilmentExtraInfo.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.FeesInfo(str, fulfilmentExtraInfoA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.FeesInfo value = (CheckoutFulfilmentWindows.FeesInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22390a);
            List list = FulfilmentExtraInfoImpl_ResponseAdapter.FulfilmentExtraInfo.f22514a;
            FulfilmentExtraInfoImpl_ResponseAdapter.FulfilmentExtraInfo.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Footer;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<CheckoutFulfilmentWindows.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f22444a = new Footer();
        public static final List b = CollectionsKt.Q("buttonTitle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CheckoutFulfilmentWindows.Footer(str);
            }
            Assertions.a(reader, "buttonTitle");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Footer value = (CheckoutFulfilmentWindows.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22391a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$FooterV2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$FooterV2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterV2 implements Adapter<CheckoutFulfilmentWindows.FooterV2> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterV2 f22445a = new FooterV2();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isSpecial");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
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
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (bool != null) {
                return new CheckoutFulfilmentWindows.FooterV2(str, str2, bool.booleanValue());
            }
            Assertions.a(reader, "isSpecial");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.FooterV2 value = (CheckoutFulfilmentWindows.FooterV2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22392a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isSpecial");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Group;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Group;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Group implements Adapter<CheckoutFulfilmentWindows.Group> {

        /* renamed from: a, reason: collision with root package name */
        public static final Group f22446a = new Group();
        public static final List b = CollectionsKt.R("title", "isSelected", "imageUrl", "message", NotificationMessage.NOTIF_KEY_SUB_TITLE, "slots", "slotsV2");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            CheckoutFulfilmentWindows.Message message = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            List list = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        message = (CheckoutFulfilmentWindows.Message) Adapters.b(Adapters.c(Message.f22450a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        arrayListFromJson = Adapters.a(Adapters.c(Slot1.f22463a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        list = (List) Adapters.b(Adapters.a(Adapters.c(SlotsV2.f22464a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (bool3 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        boolean zBooleanValue = bool3.booleanValue();
                        if (str2 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new CheckoutFulfilmentWindows.Group(str, zBooleanValue, str2, message, str3, arrayListFromJson, list);
                        }
                        Assertions.a(reader, "slots");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Group value = (CheckoutFulfilmentWindows.Group) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22393a);
            writer.F1("isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("message");
            Adapters.b(Adapters.c(Message.f22450a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("slots");
            Adapters.a(Adapters.c(Slot1.f22463a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("slotsV2");
            Adapters.b(Adapters.a(Adapters.c(SlotsV2.f22464a, false))).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Icon;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<CheckoutFulfilmentWindows.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f22447a = new Icon();
        public static final List b = CollectionsKt.Q("coreIconName");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CheckoutFulfilmentWindows.Icon(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Icon value = (CheckoutFulfilmentWindows.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22394a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Info;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Info;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Info implements Adapter<CheckoutFulfilmentWindows.Info> {

        /* renamed from: a, reason: collision with root package name */
        public static final Info f22448a = new Info();
        public static final List b = CollectionsKt.R("title", "items");

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
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f22449a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutFulfilmentWindows.Info(str, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Info value = (CheckoutFulfilmentWindows.Info) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22395a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f22449a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Item;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<CheckoutFulfilmentWindows.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f22449a = new Item();
        public static final List b = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "imageUrl");

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
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (str3 != null) {
                return new CheckoutFulfilmentWindows.Item(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Item value = (CheckoutFulfilmentWindows.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22396a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Message;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Message;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message implements Adapter<CheckoutFulfilmentWindows.Message> {

        /* renamed from: a, reason: collision with root package name */
        public static final Message f22450a = new Message();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE);

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
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new CheckoutFulfilmentWindows.Message(str, str2);
            }
            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Message value = (CheckoutFulfilmentWindows.Message) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22397a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Option;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Option;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Option implements Adapter<CheckoutFulfilmentWindows.Option> {

        /* renamed from: a, reason: collision with root package name */
        public static final Option f22451a = new Option();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isAvailable", "isSelected", "footer", "footerV2", "sectionTitle", "extraInfoButton", "extraInfo", "deliveryNowV2", "deliveryNowStatus", "directToBootNow", "directToBootNowV2", "directToBootNowStatus", "groups");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            Boolean bool3 = null;
            String str3 = null;
            CheckoutFulfilmentWindows.FooterV2 footerV2 = null;
            String str4 = null;
            CheckoutFulfilmentWindows.ExtraInfoButton extraInfoButton = null;
            CheckoutFulfilmentWindows.ExtraInfo extraInfo = null;
            CheckoutFulfilmentWindows.DeliveryNowV2 deliveryNowV2 = null;
            DeliveryNowStatus deliveryNowStatusA = null;
            CheckoutFulfilmentWindows.DirectToBootNow directToBootNow = null;
            CheckoutFulfilmentWindows.DirectToBootNowV2 directToBootNowV2 = null;
            DirectToBootNowStatus directToBootNowStatusA = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool = bool2;
                        footerV2 = (CheckoutFulfilmentWindows.FooterV2) Adapters.b(Adapters.c(FooterV2.f22445a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        bool = bool2;
                        extraInfoButton = (CheckoutFulfilmentWindows.ExtraInfoButton) Adapters.b(Adapters.c(ExtraInfoButton.f22442a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bool = bool2;
                        extraInfo = (CheckoutFulfilmentWindows.ExtraInfo) Adapters.b(Adapters.c(ExtraInfo.f22441a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        bool = bool2;
                        deliveryNowV2 = (CheckoutFulfilmentWindows.DeliveryNowV2) Adapters.b(Adapters.c(DeliveryNowV2.f22435a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        deliveryNowStatusA = DeliveryNowStatus_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 11:
                        bool = bool2;
                        directToBootNow = (CheckoutFulfilmentWindows.DirectToBootNow) Adapters.b(Adapters.c(DirectToBootNow.f22437a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        bool = bool2;
                        directToBootNowV2 = (CheckoutFulfilmentWindows.DirectToBootNowV2) Adapters.b(Adapters.c(DirectToBootNowV2.f22438a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        directToBootNowStatusA = DirectToBootNowStatus_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 14:
                        bool = bool2;
                        arrayListFromJson = Adapters.a(Adapters.c(Group.f22446a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "isAvailable");
                            throw null;
                        }
                        Boolean bool5 = bool3;
                        boolean zBooleanValue = bool4.booleanValue();
                        if (bool5 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        boolean zBooleanValue2 = bool5.booleanValue();
                        if (str3 == null) {
                            Assertions.a(reader, "footer");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "sectionTitle");
                            throw null;
                        }
                        if (deliveryNowStatusA == null) {
                            Assertions.a(reader, "deliveryNowStatus");
                            throw null;
                        }
                        if (directToBootNowStatusA == null) {
                            Assertions.a(reader, "directToBootNowStatus");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new CheckoutFulfilmentWindows.Option(str, str2, zBooleanValue, zBooleanValue2, str3, footerV2, str4, extraInfoButton, extraInfo, deliveryNowV2, deliveryNowStatusA, directToBootNow, directToBootNowV2, directToBootNowStatusA, arrayListFromJson);
                        }
                        Assertions.a(reader, "groups");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Option value = (CheckoutFulfilmentWindows.Option) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22398a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("isAvailable");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.c, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isSelected");
            d.B(value.d, adapters$BooleanAdapter$1, writer, customScalarAdapters, "footer");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("footerV2");
            Adapters.b(Adapters.c(FooterV2.f22445a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("sectionTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("extraInfoButton");
            Adapters.b(Adapters.c(ExtraInfoButton.f22442a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("extraInfo");
            Adapters.b(Adapters.c(ExtraInfo.f22441a, true)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("deliveryNowV2");
            Adapters.b(Adapters.c(DeliveryNowV2.f22435a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("deliveryNowStatus");
            writer.v0(value.k.d);
            writer.F1("directToBootNow");
            Adapters.b(Adapters.c(DirectToBootNow.f22437a, false)).toJson(writer, customScalarAdapters, value.l);
            writer.F1("directToBootNowV2");
            Adapters.b(Adapters.c(DirectToBootNowV2.f22438a, false)).toJson(writer, customScalarAdapters, value.m);
            writer.F1("directToBootNowStatus");
            writer.v0(value.n.d);
            writer.F1("groups");
            Adapters.a(Adapters.c(Group.f22446a, false)).toJson(writer, customScalarAdapters, value.o);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionInfo implements Adapter<CheckoutFulfilmentWindows.SelectionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionInfo f22452a = new SelectionInfo();
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
            com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfoA = SelectionInfoImpl_ResponseAdapter.SelectionInfo.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.SelectionInfo(str, selectionInfoA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionInfo value = (CheckoutFulfilmentWindows.SelectionInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22399a);
            List list = SelectionInfoImpl_ResponseAdapter.SelectionInfo.f22537a;
            SelectionInfoImpl_ResponseAdapter.SelectionInfo.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionInfo1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionInfo1 implements Adapter<CheckoutFulfilmentWindows.SelectionInfo1> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionInfo1 f22453a = new SelectionInfo1();
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
            com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfoA = SelectionInfoImpl_ResponseAdapter.SelectionInfo.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.SelectionInfo1(str, selectionInfoA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionInfo1 value = (CheckoutFulfilmentWindows.SelectionInfo1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22400a);
            List list = SelectionInfoImpl_ResponseAdapter.SelectionInfo.f22537a;
            SelectionInfoImpl_ResponseAdapter.SelectionInfo.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionInfo2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionInfo2 implements Adapter<CheckoutFulfilmentWindows.SelectionInfo2> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionInfo2 f22454a = new SelectionInfo2();
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
            com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfoA = SelectionInfoImpl_ResponseAdapter.SelectionInfo.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.SelectionInfo2(str, selectionInfoA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionInfo2 value = (CheckoutFulfilmentWindows.SelectionInfo2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22401a);
            List list = SelectionInfoImpl_ResponseAdapter.SelectionInfo.f22537a;
            SelectionInfoImpl_ResponseAdapter.SelectionInfo.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionInfo3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo3;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionInfo3 implements Adapter<CheckoutFulfilmentWindows.SelectionInfo3> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionInfo3 f22455a = new SelectionInfo3();
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
            com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfoA = SelectionInfoImpl_ResponseAdapter.SelectionInfo.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.SelectionInfo3(str, selectionInfoA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionInfo3 value = (CheckoutFulfilmentWindows.SelectionInfo3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22402a);
            List list = SelectionInfoImpl_ResponseAdapter.SelectionInfo.f22537a;
            SelectionInfoImpl_ResponseAdapter.SelectionInfo.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionInfo4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionInfo4;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionInfo4 implements Adapter<CheckoutFulfilmentWindows.SelectionInfo4> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionInfo4 f22456a = new SelectionInfo4();
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
            com.woolworths.shop.checkout.fragment.SelectionInfo selectionInfoA = SelectionInfoImpl_ResponseAdapter.SelectionInfo.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.SelectionInfo4(str, selectionInfoA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionInfo4 value = (CheckoutFulfilmentWindows.SelectionInfo4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22403a);
            List list = SelectionInfoImpl_ResponseAdapter.SelectionInfo.f22537a;
            SelectionInfoImpl_ResponseAdapter.SelectionInfo.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionOption;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOption;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionOption implements Adapter<CheckoutFulfilmentWindows.SelectionOption> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionOption f22457a = new SelectionOption();
        public static final List b = CollectionsKt.R("selectionOptionId", lqlqqlq.mmm006Dm006Dm, BarcodePickDeserializer.FIELD_ICON, "title", "selectionOptionsInfoTags", "disabledBadge", "disabledTitle", "disabledDescription");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionIdA = null;
            String str = null;
            CheckoutFulfilmentWindows.Icon icon = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            CheckoutFulfilmentWindows.DisabledBadge disabledBadge = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        fulfilmentWindowSlotSelectionOptionIdA = FulfilmentWindowSlotSelectionOptionId_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        icon = (CheckoutFulfilmentWindows.Icon) Adapters.c(Icon.f22447a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson = Adapters.a(Adapters.c(SelectionOptionsInfoTag.f22459a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        disabledBadge = (CheckoutFulfilmentWindows.DisabledBadge) Adapters.c(DisabledBadge.f22440a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (fulfilmentWindowSlotSelectionOptionIdA == null) {
                            Assertions.a(reader, "selectionOptionId");
                            throw null;
                        }
                        if (str == null) {
                            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                            throw null;
                        }
                        if (icon == null) {
                            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "selectionOptionsInfoTags");
                            throw null;
                        }
                        if (disabledBadge == null) {
                            Assertions.a(reader, "disabledBadge");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "disabledTitle");
                            throw null;
                        }
                        if (str4 != null) {
                            return new CheckoutFulfilmentWindows.SelectionOption(fulfilmentWindowSlotSelectionOptionIdA, str, icon, str2, arrayListFromJson, disabledBadge, str3, str4);
                        }
                        Assertions.a(reader, "disabledDescription");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionOption value = (CheckoutFulfilmentWindows.SelectionOption) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("selectionOptionId");
            writer.v0(value.f22404a.d);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f22447a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("selectionOptionsInfoTags");
            Adapters.a(Adapters.c(SelectionOptionsInfoTag.f22459a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("disabledBadge");
            Adapters.c(DisabledBadge.f22440a, false).toJson(writer, customScalarAdapters, value.f);
            writer.F1("disabledTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("disabledDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionOptionsInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOptionsInfo;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionOptionsInfo implements Adapter<CheckoutFulfilmentWindows.SelectionOptionsInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionOptionsInfo f22458a = new SelectionOptionsInfo();
        public static final List b = CollectionsKt.R("title", "selectionOptions");

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
                    arrayListFromJson = Adapters.a(Adapters.c(SelectionOption.f22457a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CheckoutFulfilmentWindows.SelectionOptionsInfo(str, arrayListFromJson);
            }
            Assertions.a(reader, "selectionOptions");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionOptionsInfo value = (CheckoutFulfilmentWindows.SelectionOptionsInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22405a);
            writer.F1("selectionOptions");
            Adapters.a(Adapters.c(SelectionOption.f22457a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionOptionsInfoTag;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOptionsInfoTag;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionOptionsInfoTag implements Adapter<CheckoutFulfilmentWindows.SelectionOptionsInfoTag> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionOptionsInfoTag f22459a = new SelectionOptionsInfoTag();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "altLabel", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            CheckoutFulfilmentWindows.AltLabel2 altLabel2 = null;
            BadgeType badgeTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    altLabel2 = (CheckoutFulfilmentWindows.AltLabel2) Adapters.b(Adapters.c(AltLabel2.f22428a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
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
                return new CheckoutFulfilmentWindows.SelectionOptionsInfoTag(str, altLabel2, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionOptionsInfoTag value = (CheckoutFulfilmentWindows.SelectionOptionsInfoTag) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22406a);
            writer.F1("altLabel");
            Adapters.b(Adapters.c(AltLabel2.f22428a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionOptionsState;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOptionsState;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionOptionsState implements Adapter<CheckoutFulfilmentWindows.SelectionOptionsState> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionOptionsState f22460a = new SelectionOptionsState();
        public static final List b = CollectionsKt.R("enabledOptions", "excludedOptions", "selectedOption", "isLastWindow");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                FulfilmentWindowSlotSelectionOptionId_ResponseAdapter fulfilmentWindowSlotSelectionOptionId_ResponseAdapter = FulfilmentWindowSlotSelectionOptionId_ResponseAdapter.f12075a;
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson2 = Adapters.a(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    fulfilmentWindowSlotSelectionOptionId = (FulfilmentWindowSlotSelectionOptionId) Adapters.b(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "enabledOptions");
                throw null;
            }
            if (arrayListFromJson2 == null) {
                Assertions.a(reader, "excludedOptions");
                throw null;
            }
            if (bool != null) {
                return new CheckoutFulfilmentWindows.SelectionOptionsState(arrayListFromJson, arrayListFromJson2, fulfilmentWindowSlotSelectionOptionId, bool.booleanValue());
            }
            Assertions.a(reader, "isLastWindow");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionOptionsState value = (CheckoutFulfilmentWindows.SelectionOptionsState) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("enabledOptions");
            FulfilmentWindowSlotSelectionOptionId_ResponseAdapter fulfilmentWindowSlotSelectionOptionId_ResponseAdapter = FulfilmentWindowSlotSelectionOptionId_ResponseAdapter.f12075a;
            Adapters.a(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).toJson(writer, customScalarAdapters, value.f22407a);
            writer.F1("excludedOptions");
            Adapters.a(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).toJson(writer, customScalarAdapters, value.b);
            writer.F1("selectedOption");
            Adapters.b(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).toJson(writer, customScalarAdapters, value.c);
            writer.F1("isLastWindow");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SelectionOptionsState1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SelectionOptionsState1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectionOptionsState1 implements Adapter<CheckoutFulfilmentWindows.SelectionOptionsState1> {

        /* renamed from: a, reason: collision with root package name */
        public static final SelectionOptionsState1 f22461a = new SelectionOptionsState1();
        public static final List b = CollectionsKt.R("enabledOptions", "excludedOptions", "selectedOption", "isLastWindow");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            FulfilmentWindowSlotSelectionOptionId fulfilmentWindowSlotSelectionOptionId = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                FulfilmentWindowSlotSelectionOptionId_ResponseAdapter fulfilmentWindowSlotSelectionOptionId_ResponseAdapter = FulfilmentWindowSlotSelectionOptionId_ResponseAdapter.f12075a;
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson2 = Adapters.a(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    fulfilmentWindowSlotSelectionOptionId = (FulfilmentWindowSlotSelectionOptionId) Adapters.b(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "enabledOptions");
                throw null;
            }
            if (arrayListFromJson2 == null) {
                Assertions.a(reader, "excludedOptions");
                throw null;
            }
            if (bool != null) {
                return new CheckoutFulfilmentWindows.SelectionOptionsState1(arrayListFromJson, arrayListFromJson2, fulfilmentWindowSlotSelectionOptionId, bool.booleanValue());
            }
            Assertions.a(reader, "isLastWindow");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SelectionOptionsState1 value = (CheckoutFulfilmentWindows.SelectionOptionsState1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("enabledOptions");
            FulfilmentWindowSlotSelectionOptionId_ResponseAdapter fulfilmentWindowSlotSelectionOptionId_ResponseAdapter = FulfilmentWindowSlotSelectionOptionId_ResponseAdapter.f12075a;
            Adapters.a(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).toJson(writer, customScalarAdapters, value.f22408a);
            writer.F1("excludedOptions");
            Adapters.a(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).toJson(writer, customScalarAdapters, value.b);
            writer.F1("selectedOption");
            Adapters.b(fulfilmentWindowSlotSelectionOptionId_ResponseAdapter).toJson(writer, customScalarAdapters, value.c);
            writer.F1("isLastWindow");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Slot;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Slot;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Slot implements Adapter<CheckoutFulfilmentWindows.Slot> {

        /* renamed from: a, reason: collision with root package name */
        public static final Slot f22462a = new Slot();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "startTime", "id", "isAvailable", "isSelected", "isPartnerDriver", "sectionTitle", "badges", "selectionInfo", k.a.g, "statuses");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            CheckoutFulfilmentWindows.SelectionInfo selectionInfo = null;
            List list = null;
            List list2 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        num = num2;
                        arrayListFromJson = Adapters.a(Adapters.c(Badge.f22430a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        num = num2;
                        selectionInfo = (CheckoutFulfilmentWindows.SelectionInfo) Adapters.b(Adapters.c(SelectionInfo.f22452a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        num = num2;
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Tag.f22472a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        num = num2;
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(Status.f22465a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num3 = num2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "startTime");
                            throw null;
                        }
                        if (num3 == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        Boolean bool4 = bool;
                        int iIntValue = num3.intValue();
                        if (bool4 == null) {
                            Assertions.a(reader, "isAvailable");
                            throw null;
                        }
                        Boolean bool5 = bool2;
                        boolean zBooleanValue = bool4.booleanValue();
                        if (bool5 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        Boolean bool6 = bool3;
                        boolean zBooleanValue2 = bool5.booleanValue();
                        if (bool6 == null) {
                            Assertions.a(reader, "isPartnerDriver");
                            throw null;
                        }
                        boolean zBooleanValue3 = bool6.booleanValue();
                        if (str4 == null) {
                            Assertions.a(reader, "sectionTitle");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new CheckoutFulfilmentWindows.Slot(str, str2, str3, iIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, str4, arrayListFromJson, selectionInfo, list, list2);
                        }
                        Assertions.a(reader, "badges");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Slot value = (CheckoutFulfilmentWindows.Slot) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22409a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("startTime");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "isAvailable");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.e, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isSelected");
            d.B(value.f, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isPartnerDriver");
            d.B(value.g, adapters$BooleanAdapter$1, writer, customScalarAdapters, "sectionTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("badges");
            Adapters.a(Adapters.c(Badge.f22430a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("selectionInfo");
            Adapters.b(Adapters.c(SelectionInfo.f22452a, true)).toJson(writer, customScalarAdapters, value.j);
            writer.F1(k.a.g);
            Adapters.b(Adapters.a(Adapters.c(Tag.f22472a, true))).toJson(writer, customScalarAdapters, value.k);
            writer.F1("statuses");
            Adapters.b(Adapters.a(Adapters.c(Status.f22465a, true))).toJson(writer, customScalarAdapters, value.l);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Slot1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Slot1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Slot1 implements Adapter<CheckoutFulfilmentWindows.Slot1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Slot1 f22463a = new Slot1();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "startTime", "id", "isAvailable", "isSelected", "isPartnerDriver", "sectionTitle", "badges", "selectionInfo", "selectionOptionsState", k.a.g, "statuses");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            CheckoutFulfilmentWindows.SelectionInfo3 selectionInfo3 = null;
            CheckoutFulfilmentWindows.SelectionOptionsState1 selectionOptionsState1 = null;
            List list = null;
            List list2 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        num = num2;
                        arrayListFromJson = Adapters.a(Adapters.c(Badge1.f22431a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        num = num2;
                        selectionInfo3 = (CheckoutFulfilmentWindows.SelectionInfo3) Adapters.b(Adapters.c(SelectionInfo3.f22455a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        num = num2;
                        selectionOptionsState1 = (CheckoutFulfilmentWindows.SelectionOptionsState1) Adapters.b(Adapters.c(SelectionOptionsState1.f22461a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        num = num2;
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Tag3.f22475a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        num = num2;
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(Status3.f22468a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num3 = num2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "startTime");
                            throw null;
                        }
                        if (num3 == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        Boolean bool4 = bool;
                        int iIntValue = num3.intValue();
                        if (bool4 == null) {
                            Assertions.a(reader, "isAvailable");
                            throw null;
                        }
                        Boolean bool5 = bool2;
                        boolean zBooleanValue = bool4.booleanValue();
                        if (bool5 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        Boolean bool6 = bool3;
                        boolean zBooleanValue2 = bool5.booleanValue();
                        if (bool6 == null) {
                            Assertions.a(reader, "isPartnerDriver");
                            throw null;
                        }
                        boolean zBooleanValue3 = bool6.booleanValue();
                        if (str4 == null) {
                            Assertions.a(reader, "sectionTitle");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new CheckoutFulfilmentWindows.Slot1(str, str2, str3, iIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, str4, arrayListFromJson, selectionInfo3, selectionOptionsState1, list, list2);
                        }
                        Assertions.a(reader, "badges");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Slot1 value = (CheckoutFulfilmentWindows.Slot1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22410a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("startTime");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "isAvailable");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.e, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isSelected");
            d.B(value.f, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isPartnerDriver");
            d.B(value.g, adapters$BooleanAdapter$1, writer, customScalarAdapters, "sectionTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("badges");
            Adapters.a(Adapters.c(Badge1.f22431a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("selectionInfo");
            Adapters.b(Adapters.c(SelectionInfo3.f22455a, true)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("selectionOptionsState");
            Adapters.b(Adapters.c(SelectionOptionsState1.f22461a, false)).toJson(writer, customScalarAdapters, value.k);
            writer.F1(k.a.g);
            Adapters.b(Adapters.a(Adapters.c(Tag3.f22475a, true))).toJson(writer, customScalarAdapters, value.l);
            writer.F1("statuses");
            Adapters.b(Adapters.a(Adapters.c(Status3.f22468a, true))).toJson(writer, customScalarAdapters, value.m);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SlotsV2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SlotsV2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SlotsV2 implements Adapter<CheckoutFulfilmentWindows.SlotsV2> {

        /* renamed from: a, reason: collision with root package name */
        public static final SlotsV2 f22464a = new SlotsV2();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "startTime", "id", "isAvailable", "isSelected", "isPartnerDriver", "sectionTitle", "badges", "selectionInfo", k.a.g, "statuses");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            CheckoutFulfilmentWindows.SelectionInfo4 selectionInfo4 = null;
            List list = null;
            List list2 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 6:
                        bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 7:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        continue;
                    case 8:
                        num = num2;
                        arrayListFromJson = Adapters.a(Adapters.c(Badge2.f22432a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        num = num2;
                        selectionInfo4 = (CheckoutFulfilmentWindows.SelectionInfo4) Adapters.b(Adapters.c(SelectionInfo4.f22456a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        num = num2;
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Tag4.f22476a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        num = num2;
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(Status4.f22469a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num3 = num2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "startTime");
                            throw null;
                        }
                        if (num3 == null) {
                            Assertions.a(reader, "id");
                            throw null;
                        }
                        Boolean bool4 = bool;
                        int iIntValue = num3.intValue();
                        if (bool4 == null) {
                            Assertions.a(reader, "isAvailable");
                            throw null;
                        }
                        Boolean bool5 = bool2;
                        boolean zBooleanValue = bool4.booleanValue();
                        if (bool5 == null) {
                            Assertions.a(reader, "isSelected");
                            throw null;
                        }
                        Boolean bool6 = bool3;
                        boolean zBooleanValue2 = bool5.booleanValue();
                        if (bool6 == null) {
                            Assertions.a(reader, "isPartnerDriver");
                            throw null;
                        }
                        boolean zBooleanValue3 = bool6.booleanValue();
                        if (str4 == null) {
                            Assertions.a(reader, "sectionTitle");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new CheckoutFulfilmentWindows.SlotsV2(str, str2, str3, iIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, str4, arrayListFromJson, selectionInfo4, list, list2);
                        }
                        Assertions.a(reader, "badges");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SlotsV2 value = (CheckoutFulfilmentWindows.SlotsV2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22411a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("startTime");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "isAvailable");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.e, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isSelected");
            d.B(value.f, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isPartnerDriver");
            d.B(value.g, adapters$BooleanAdapter$1, writer, customScalarAdapters, "sectionTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("badges");
            Adapters.a(Adapters.c(Badge2.f22432a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("selectionInfo");
            Adapters.b(Adapters.c(SelectionInfo4.f22456a, true)).toJson(writer, customScalarAdapters, value.j);
            writer.F1(k.a.g);
            Adapters.b(Adapters.a(Adapters.c(Tag4.f22476a, true))).toJson(writer, customScalarAdapters, value.k);
            writer.F1("statuses");
            Adapters.b(Adapters.a(Adapters.c(Status4.f22469a, true))).toJson(writer, customScalarAdapters, value.l);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Status;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status implements Adapter<CheckoutFulfilmentWindows.Status> {

        /* renamed from: a, reason: collision with root package name */
        public static final Status f22465a = new Status();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Status(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Status value = (CheckoutFulfilmentWindows.Status) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22412a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Status1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status1 implements Adapter<CheckoutFulfilmentWindows.Status1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Status1 f22466a = new Status1();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Status1(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Status1 value = (CheckoutFulfilmentWindows.Status1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22413a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Status2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status2 implements Adapter<CheckoutFulfilmentWindows.Status2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Status2 f22467a = new Status2();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Status2(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Status2 value = (CheckoutFulfilmentWindows.Status2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22414a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Status3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status3;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status3 implements Adapter<CheckoutFulfilmentWindows.Status3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Status3 f22468a = new Status3();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Status3(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Status3 value = (CheckoutFulfilmentWindows.Status3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22415a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Status4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Status4;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status4 implements Adapter<CheckoutFulfilmentWindows.Status4> {

        /* renamed from: a, reason: collision with root package name */
        public static final Status4 f22469a = new Status4();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Status4(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Status4 value = (CheckoutFulfilmentWindows.Status4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22416a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Subheader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Subheader;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Subheader implements Adapter<CheckoutFulfilmentWindows.Subheader> {

        /* renamed from: a, reason: collision with root package name */
        public static final Subheader f22470a = new Subheader();
        public static final List b = CollectionsKt.R("displayType", "message", "bannerTitle", "iconUrl", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            CheckoutFulfilmentWindows.Action action = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    action = (CheckoutFulfilmentWindows.Action) Adapters.b(Adapters.c(Action.f22425a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new CheckoutFulfilmentWindows.Subheader(insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Subheader value = (CheckoutFulfilmentWindows.Subheader) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22417a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f22425a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$SuggestedGroup;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$SuggestedGroup;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SuggestedGroup implements Adapter<CheckoutFulfilmentWindows.SuggestedGroup> {

        /* renamed from: a, reason: collision with root package name */
        public static final SuggestedGroup f22471a = new SuggestedGroup();
        public static final List b = CollectionsKt.R("title", "slots", "bottomSheet");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            CheckoutFulfilmentWindows.BottomSheet bottomSheet = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Slot.f22462a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bottomSheet = (CheckoutFulfilmentWindows.BottomSheet) Adapters.c(BottomSheet.f22433a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "slots");
                throw null;
            }
            if (bottomSheet != null) {
                return new CheckoutFulfilmentWindows.SuggestedGroup(str, arrayListFromJson, bottomSheet);
            }
            Assertions.a(reader, "bottomSheet");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.SuggestedGroup value = (CheckoutFulfilmentWindows.SuggestedGroup) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22418a);
            writer.F1("slots");
            Adapters.a(Adapters.c(Slot.f22462a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("bottomSheet");
            Adapters.c(BottomSheet.f22433a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Tag;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tag implements Adapter<CheckoutFulfilmentWindows.Tag> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tag f22472a = new Tag();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Tag(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Tag value = (CheckoutFulfilmentWindows.Tag) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22419a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Tag1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag1;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tag1 implements Adapter<CheckoutFulfilmentWindows.Tag1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tag1 f22473a = new Tag1();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Tag1(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Tag1 value = (CheckoutFulfilmentWindows.Tag1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22420a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Tag2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag2;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tag2 implements Adapter<CheckoutFulfilmentWindows.Tag2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tag2 f22474a = new Tag2();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Tag2(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Tag2 value = (CheckoutFulfilmentWindows.Tag2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22421a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Tag3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag3;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tag3 implements Adapter<CheckoutFulfilmentWindows.Tag3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tag3 f22475a = new Tag3();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Tag3(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Tag3 value = (CheckoutFulfilmentWindows.Tag3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22422a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$Tag4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$Tag4;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Tag4 implements Adapter<CheckoutFulfilmentWindows.Tag4> {

        /* renamed from: a, reason: collision with root package name */
        public static final Tag4 f22476a = new Tag4();
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
            CoreTagUI coreTagUIA = CoreTagUIImpl_ResponseAdapter.CoreTagUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new CheckoutFulfilmentWindows.Tag4(str, coreTagUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.Tag4 value = (CheckoutFulfilmentWindows.Tag4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22423a);
            List list = CoreTagUIImpl_ResponseAdapter.CoreTagUI.f10068a;
            CoreTagUIImpl_ResponseAdapter.CoreTagUI.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindowsImpl_ResponseAdapter$TileBadge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/fragment/CheckoutFulfilmentWindows$TileBadge;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TileBadge implements Adapter<CheckoutFulfilmentWindows.TileBadge> {

        /* renamed from: a, reason: collision with root package name */
        public static final TileBadge f22477a = new TileBadge();
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
                return new CheckoutFulfilmentWindows.TileBadge(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutFulfilmentWindows.TileBadge value = (CheckoutFulfilmentWindows.TileBadge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22424a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }
}
