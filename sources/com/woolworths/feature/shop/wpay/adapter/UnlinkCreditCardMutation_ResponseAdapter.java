package com.woolworths.feature.shop.wpay.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.UnlinkCreditCardMutation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkCreditCardMutation_ResponseAdapter;", "", "Data", "UnlinkCreditCard", "OnUnlinkCreditCardSuccess", "OnUnlinkCreditCardValidationFailure", "Analytics", "OnUnlinkCreditCardFailure", "Analytics1", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnlinkCreditCardMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkCreditCardMutation_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$Analytics;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<UnlinkCreditCardMutation.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f20459a = new Analytics();
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
                return new UnlinkCreditCardMutation.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UnlinkCreditCardMutation.Analytics value = (UnlinkCreditCardMutation.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20403a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkCreditCardMutation_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$Analytics1;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<UnlinkCreditCardMutation.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f20460a = new Analytics1();
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
                return new UnlinkCreditCardMutation.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UnlinkCreditCardMutation.Analytics1 value = (UnlinkCreditCardMutation.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20404a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkCreditCardMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<UnlinkCreditCardMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f20461a = new Data();
        public static final List b = CollectionsKt.Q("unlinkCreditCard");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            UnlinkCreditCardMutation.UnlinkCreditCard unlinkCreditCard = null;
            while (reader.o2(b) == 0) {
                unlinkCreditCard = (UnlinkCreditCardMutation.UnlinkCreditCard) Adapters.c(UnlinkCreditCard.f20465a, true).fromJson(reader, customScalarAdapters);
            }
            if (unlinkCreditCard != null) {
                return new UnlinkCreditCardMutation.Data(unlinkCreditCard);
            }
            Assertions.a(reader, "unlinkCreditCard");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UnlinkCreditCardMutation.Data value = (UnlinkCreditCardMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("unlinkCreditCard");
            Adapters.c(UnlinkCreditCard.f20465a, true).toJson(writer, customScalarAdapters, value.f20405a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkCreditCardMutation_ResponseAdapter$OnUnlinkCreditCardFailure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$OnUnlinkCreditCardFailure;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUnlinkCreditCardFailure implements Adapter<UnlinkCreditCardMutation.OnUnlinkCreditCardFailure> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20462a = CollectionsKt.R("errorMessage", "analytics");

        public static UnlinkCreditCardMutation.OnUnlinkCreditCardFailure a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            UnlinkCreditCardMutation.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(f20462a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    analytics1 = (UnlinkCreditCardMutation.Analytics1) Adapters.c(Analytics1.f20460a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "errorMessage");
                throw null;
            }
            if (analytics1 != null) {
                return new UnlinkCreditCardMutation.OnUnlinkCreditCardFailure(str, analytics1);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UnlinkCreditCardMutation.OnUnlinkCreditCardFailure value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorMessage");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20406a);
            writer.F1("analytics");
            Adapters.c(Analytics1.f20460a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UnlinkCreditCardMutation.OnUnlinkCreditCardFailure) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkCreditCardMutation_ResponseAdapter$OnUnlinkCreditCardSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$OnUnlinkCreditCardSuccess;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUnlinkCreditCardSuccess implements Adapter<UnlinkCreditCardMutation.OnUnlinkCreditCardSuccess> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20463a = CollectionsKt.Q("_");

        public static UnlinkCreditCardMutation.OnUnlinkCreditCardSuccess a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f20463a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new UnlinkCreditCardMutation.OnUnlinkCreditCardSuccess(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UnlinkCreditCardMutation.OnUnlinkCreditCardSuccess value = (UnlinkCreditCardMutation.OnUnlinkCreditCardSuccess) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_");
            Adapters.l.toJson(writer, customScalarAdapters, value.f20407a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkCreditCardMutation_ResponseAdapter$OnUnlinkCreditCardValidationFailure;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$OnUnlinkCreditCardValidationFailure;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUnlinkCreditCardValidationFailure implements Adapter<UnlinkCreditCardMutation.OnUnlinkCreditCardValidationFailure> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f20464a = CollectionsKt.R("errorMessage", "errorTitle", "errorButton", "analytics");

        public static UnlinkCreditCardMutation.OnUnlinkCreditCardValidationFailure a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            UnlinkCreditCardMutation.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(f20464a);
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
                    analytics = (UnlinkCreditCardMutation.Analytics) Adapters.c(Analytics.f20459a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "errorMessage");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "errorTitle");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "errorButton");
                throw null;
            }
            if (analytics != null) {
                return new UnlinkCreditCardMutation.OnUnlinkCreditCardValidationFailure(str, str2, str3, analytics);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, UnlinkCreditCardMutation.OnUnlinkCreditCardValidationFailure value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("errorMessage");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f20408a);
            writer.F1("errorTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("errorButton");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.c(Analytics.f20459a, true).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (UnlinkCreditCardMutation.OnUnlinkCreditCardValidationFailure) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/feature/shop/wpay/adapter/UnlinkCreditCardMutation_ResponseAdapter$UnlinkCreditCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$UnlinkCreditCard;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnlinkCreditCard implements Adapter<UnlinkCreditCardMutation.UnlinkCreditCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnlinkCreditCard f20465a = new UnlinkCreditCard();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            UnlinkCreditCardMutation.OnUnlinkCreditCardSuccess onUnlinkCreditCardSuccessA;
            UnlinkCreditCardMutation.OnUnlinkCreditCardValidationFailure onUnlinkCreditCardValidationFailureA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            UnlinkCreditCardMutation.OnUnlinkCreditCardFailure onUnlinkCreditCardFailureA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("UnlinkCreditCardSuccess"))) {
                reader.o();
                onUnlinkCreditCardSuccessA = OnUnlinkCreditCardSuccess.a(reader, customScalarAdapters);
            } else {
                onUnlinkCreditCardSuccessA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("UnlinkCreditCardValidationFailure"))) {
                reader.o();
                onUnlinkCreditCardValidationFailureA = OnUnlinkCreditCardValidationFailure.a(reader, customScalarAdapters);
            } else {
                onUnlinkCreditCardValidationFailureA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("UnlinkCreditCardFailure"))) {
                reader.o();
                onUnlinkCreditCardFailureA = OnUnlinkCreditCardFailure.a(reader, customScalarAdapters);
            }
            return new UnlinkCreditCardMutation.UnlinkCreditCard(str, onUnlinkCreditCardSuccessA, onUnlinkCreditCardValidationFailureA, onUnlinkCreditCardFailureA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            UnlinkCreditCardMutation.UnlinkCreditCard value = (UnlinkCreditCardMutation.UnlinkCreditCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f20409a);
            UnlinkCreditCardMutation.OnUnlinkCreditCardSuccess onUnlinkCreditCardSuccess = value.b;
            if (onUnlinkCreditCardSuccess != null) {
                List list = OnUnlinkCreditCardSuccess.f20463a;
                writer.F1("_");
                Adapters.l.toJson(writer, customScalarAdapters, onUnlinkCreditCardSuccess.f20407a);
            }
            UnlinkCreditCardMutation.OnUnlinkCreditCardValidationFailure onUnlinkCreditCardValidationFailure = value.c;
            if (onUnlinkCreditCardValidationFailure != null) {
                OnUnlinkCreditCardValidationFailure.b(writer, customScalarAdapters, onUnlinkCreditCardValidationFailure);
            }
            UnlinkCreditCardMutation.OnUnlinkCreditCardFailure onUnlinkCreditCardFailure = value.d;
            if (onUnlinkCreditCardFailure != null) {
                OnUnlinkCreditCardFailure.b(writer, customScalarAdapters, onUnlinkCreditCardFailure);
            }
        }
    }
}
