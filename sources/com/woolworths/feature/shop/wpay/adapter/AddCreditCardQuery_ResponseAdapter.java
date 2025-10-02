package com.woolworths.feature.shop.wpay.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.AddCreditCardQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/AddCreditCardQuery_ResponseAdapter;", "", "Data", "AddCreditCard", "ClickAnalytics", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddCreditCardQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/AddCreditCardQuery_ResponseAdapter$AddCreditCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/AddCreditCardQuery$AddCreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddCreditCard implements Adapter<AddCreditCardQuery.AddCreditCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final AddCreditCard f20416a = new AddCreditCard();
        public static final List b = CollectionsKt.R("url", "isMandatorySave", "infoText", "clickAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            String str2 = null;
            AddCreditCardQuery.ClickAnalytics clickAnalytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    clickAnalytics = (AddCreditCardQuery.ClickAnalytics) Adapters.c(ClickAnalytics.f20417a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isMandatorySave");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (clickAnalytics != null) {
                return new AddCreditCardQuery.AddCreditCard(str, zBooleanValue, str2, clickAnalytics);
            }
            Assertions.a(reader, "clickAnalytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AddCreditCardQuery.AddCreditCard value = (AddCreditCardQuery.AddCreditCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20356a);
            writer.F1("isMandatorySave");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, "infoText");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("clickAnalytics");
            Adapters.c(ClickAnalytics.f20417a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/AddCreditCardQuery_ResponseAdapter$ClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/AddCreditCardQuery$ClickAnalytics;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickAnalytics implements Adapter<AddCreditCardQuery.ClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ClickAnalytics f20417a = new ClickAnalytics();
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
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new AddCreditCardQuery.ClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AddCreditCardQuery.ClickAnalytics value = (AddCreditCardQuery.ClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20357a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/AddCreditCardQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/AddCreditCardQuery$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<AddCreditCardQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20418a = new Data();
        public static final List b = CollectionsKt.Q("addCreditCard");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AddCreditCardQuery.AddCreditCard addCreditCard = null;
            while (reader.o2(b) == 0) {
                addCreditCard = (AddCreditCardQuery.AddCreditCard) Adapters.c(AddCreditCard.f20416a, false).fromJson(reader, customScalarAdapters);
            }
            if (addCreditCard != null) {
                return new AddCreditCardQuery.Data(addCreditCard);
            }
            Assertions.a(reader, "addCreditCard");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            AddCreditCardQuery.Data value = (AddCreditCardQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("addCreditCard");
            Adapters.c(AddCreditCard.f20416a, false).toJson(writer, customScalarAdapters, value.f20358a);
        }
    }
}
