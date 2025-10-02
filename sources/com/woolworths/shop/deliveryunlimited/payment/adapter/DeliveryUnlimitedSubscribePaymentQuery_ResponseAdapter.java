package com.woolworths.shop.deliveryunlimited.payment.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.shop.deliveryunlimited.payment.DeliveryUnlimitedSubscribePaymentQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter;", "", "Data", "DeliveryUnlimitedSubscribePayment", "IconItem", "Footer", "Button", "Terms", "Term", "Link", "Button1", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Button;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<DeliveryUnlimitedSubscribePaymentQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f22592a = new Button();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new DeliveryUnlimitedSubscribePaymentQuery.Button(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribePaymentQuery.Button value = (DeliveryUnlimitedSubscribePaymentQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22576a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter$Button1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Button1;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button1 implements Adapter<DeliveryUnlimitedSubscribePaymentQuery.Button1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button1 f22593a = new Button1();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new DeliveryUnlimitedSubscribePaymentQuery.Button1(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribePaymentQuery.Button1 value = (DeliveryUnlimitedSubscribePaymentQuery.Button1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22577a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Data;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<DeliveryUnlimitedSubscribePaymentQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f22594a = new Data();
        public static final List b = CollectionsKt.Q("deliveryUnlimitedSubscribePayment");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedSubscribePaymentQuery.DeliveryUnlimitedSubscribePayment deliveryUnlimitedSubscribePayment = null;
            while (reader.o2(b) == 0) {
                deliveryUnlimitedSubscribePayment = (DeliveryUnlimitedSubscribePaymentQuery.DeliveryUnlimitedSubscribePayment) Adapters.c(DeliveryUnlimitedSubscribePayment.f22595a, false).fromJson(reader, customScalarAdapters);
            }
            if (deliveryUnlimitedSubscribePayment != null) {
                return new DeliveryUnlimitedSubscribePaymentQuery.Data(deliveryUnlimitedSubscribePayment);
            }
            Assertions.a(reader, "deliveryUnlimitedSubscribePayment");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribePaymentQuery.Data value = (DeliveryUnlimitedSubscribePaymentQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("deliveryUnlimitedSubscribePayment");
            Adapters.c(DeliveryUnlimitedSubscribePayment.f22595a, false).toJson(writer, customScalarAdapters, value.f22578a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter$DeliveryUnlimitedSubscribePayment;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$DeliveryUnlimitedSubscribePayment;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryUnlimitedSubscribePayment implements Adapter<DeliveryUnlimitedSubscribePaymentQuery.DeliveryUnlimitedSubscribePayment> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryUnlimitedSubscribePayment f22595a = new DeliveryUnlimitedSubscribePayment();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "priceDescription", "priceLabel", "price", lqlqqlq.mmm006Dm006Dm, "iconItem", "footer", "terms");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            DeliveryUnlimitedSubscribePaymentQuery.IconItem iconItem = null;
            DeliveryUnlimitedSubscribePaymentQuery.Footer footer = null;
            DeliveryUnlimitedSubscribePaymentQuery.Terms terms = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        num = num2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num = num2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        num = num2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        iconItem = (DeliveryUnlimitedSubscribePaymentQuery.IconItem) Adapters.b(Adapters.c(IconItem.f22597a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        footer = (DeliveryUnlimitedSubscribePaymentQuery.Footer) Adapters.c(Footer.f22596a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = num2;
                        terms = (DeliveryUnlimitedSubscribePaymentQuery.Terms) Adapters.c(Terms.f22600a, false).fromJson(reader, customScalarAdapters);
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
                            Assertions.a(reader, "priceDescription");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "priceLabel");
                            throw null;
                        }
                        if (num3 == null) {
                            Assertions.a(reader, "price");
                            throw null;
                        }
                        int iIntValue = num3.intValue();
                        if (footer == null) {
                            Assertions.a(reader, "footer");
                            throw null;
                        }
                        if (terms != null) {
                            return new DeliveryUnlimitedSubscribePaymentQuery.DeliveryUnlimitedSubscribePayment(str, str2, str3, str4, iIntValue, str5, iconItem, footer, terms);
                        }
                        Assertions.a(reader, "terms");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribePaymentQuery.DeliveryUnlimitedSubscribePayment value = (DeliveryUnlimitedSubscribePaymentQuery.DeliveryUnlimitedSubscribePayment) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22579a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("priceDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("priceLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("price");
            d.y(value.e, Adapters.b, writer, customScalarAdapters, lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("iconItem");
            Adapters.b(Adapters.c(IconItem.f22597a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("footer");
            Adapters.c(Footer.f22596a, false).toJson(writer, customScalarAdapters, value.h);
            writer.F1("terms");
            Adapters.c(Terms.f22600a, false).toJson(writer, customScalarAdapters, value.i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Footer;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<DeliveryUnlimitedSubscribePaymentQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f22596a = new Footer();
        public static final List b = CollectionsKt.R("button", "disclaimer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            DeliveryUnlimitedSubscribePaymentQuery.Button button = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    button = (DeliveryUnlimitedSubscribePaymentQuery.Button) Adapters.c(Button.f22592a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (button == null) {
                Assertions.a(reader, "button");
                throw null;
            }
            if (str != null) {
                return new DeliveryUnlimitedSubscribePaymentQuery.Footer(button, str);
            }
            Assertions.a(reader, "disclaimer");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribePaymentQuery.Footer value = (DeliveryUnlimitedSubscribePaymentQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f22592a, false).toJson(writer, customScalarAdapters, value.f22580a);
            writer.F1("disclaimer");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter$IconItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$IconItem;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IconItem implements Adapter<DeliveryUnlimitedSubscribePaymentQuery.IconItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final IconItem f22597a = new IconItem();
        public static final List b = CollectionsKt.R("iconUrl", AnnotatedPrivateKey.LABEL);

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
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 != null) {
                return new DeliveryUnlimitedSubscribePaymentQuery.IconItem(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribePaymentQuery.IconItem value = (DeliveryUnlimitedSubscribePaymentQuery.IconItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22581a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter$Link;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Link;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Link implements Adapter<DeliveryUnlimitedSubscribePaymentQuery.Link> {

        /* renamed from: a, reason: collision with root package name */
        public static final Link f22598a = new Link();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "url");

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
                return new DeliveryUnlimitedSubscribePaymentQuery.Link(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribePaymentQuery.Link value = (DeliveryUnlimitedSubscribePaymentQuery.Link) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22582a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter$Term;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Term;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Term implements Adapter<DeliveryUnlimitedSubscribePaymentQuery.Term> {

        /* renamed from: a, reason: collision with root package name */
        public static final Term f22599a = new Term();
        public static final List b = CollectionsKt.R("title", "links");

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
                    arrayListFromJson = Adapters.a(Adapters.c(Link.f22598a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new DeliveryUnlimitedSubscribePaymentQuery.Term(str, arrayListFromJson);
            }
            Assertions.a(reader, "links");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribePaymentQuery.Term value = (DeliveryUnlimitedSubscribePaymentQuery.Term) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22583a);
            writer.F1("links");
            Adapters.a(Adapters.c(Link.f22598a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/adapter/DeliveryUnlimitedSubscribePaymentQuery_ResponseAdapter$Terms;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/deliveryunlimited/payment/DeliveryUnlimitedSubscribePaymentQuery$Terms;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Terms implements Adapter<DeliveryUnlimitedSubscribePaymentQuery.Terms> {

        /* renamed from: a, reason: collision with root package name */
        public static final Terms f22600a = new Terms();
        public static final List b = CollectionsKt.R("title", "terms", "button");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            DeliveryUnlimitedSubscribePaymentQuery.Button1 button1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Term.f22599a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    button1 = (DeliveryUnlimitedSubscribePaymentQuery.Button1) Adapters.c(Button1.f22593a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "terms");
                throw null;
            }
            if (button1 != null) {
                return new DeliveryUnlimitedSubscribePaymentQuery.Terms(str, arrayListFromJson, button1);
            }
            Assertions.a(reader, "button");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            DeliveryUnlimitedSubscribePaymentQuery.Terms value = (DeliveryUnlimitedSubscribePaymentQuery.Terms) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22584a);
            writer.F1("terms");
            Adapters.a(Adapters.c(Term.f22599a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("button");
            Adapters.c(Button1.f22593a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }
}
