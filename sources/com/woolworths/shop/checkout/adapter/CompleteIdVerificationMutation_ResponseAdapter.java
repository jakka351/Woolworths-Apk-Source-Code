package com.woolworths.shop.checkout.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.CompleteIdVerificationMutation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/CompleteIdVerificationMutation_ResponseAdapter;", "", "Data", "CompleteIdVerification", "OnIdVerificationCompleteSuccess", "OnIdVerificationCompleteFail", "IdVerificationBottomSheet", "PrimaryButton", "SecondaryButton", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompleteIdVerificationMutation_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/CompleteIdVerificationMutation_ResponseAdapter$CompleteIdVerification;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$CompleteIdVerification;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CompleteIdVerification implements Adapter<CompleteIdVerificationMutation.CompleteIdVerification> {

        /* renamed from: a, reason: collision with root package name */
        public static final CompleteIdVerification f21968a = new CompleteIdVerification();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            CompleteIdVerificationMutation.OnIdVerificationCompleteSuccess onIdVerificationCompleteSuccessA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            CompleteIdVerificationMutation.OnIdVerificationCompleteFail onIdVerificationCompleteFailA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("IdVerificationCompleteSuccess"))) {
                reader.o();
                onIdVerificationCompleteSuccessA = OnIdVerificationCompleteSuccess.a(reader, customScalarAdapters);
            } else {
                onIdVerificationCompleteSuccessA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("IdVerificationCompleteFail"))) {
                reader.o();
                onIdVerificationCompleteFailA = OnIdVerificationCompleteFail.a(reader, customScalarAdapters);
            }
            return new CompleteIdVerificationMutation.CompleteIdVerification(str, onIdVerificationCompleteSuccessA, onIdVerificationCompleteFailA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CompleteIdVerificationMutation.CompleteIdVerification value = (CompleteIdVerificationMutation.CompleteIdVerification) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21829a);
            CompleteIdVerificationMutation.OnIdVerificationCompleteSuccess onIdVerificationCompleteSuccess = value.b;
            if (onIdVerificationCompleteSuccess != null) {
                OnIdVerificationCompleteSuccess.b(writer, customScalarAdapters, onIdVerificationCompleteSuccess);
            }
            CompleteIdVerificationMutation.OnIdVerificationCompleteFail onIdVerificationCompleteFail = value.c;
            if (onIdVerificationCompleteFail != null) {
                OnIdVerificationCompleteFail.b(writer, customScalarAdapters, onIdVerificationCompleteFail);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/CompleteIdVerificationMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CompleteIdVerificationMutation.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21969a = new Data();
        public static final List b = CollectionsKt.Q("completeIdVerification");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CompleteIdVerificationMutation.CompleteIdVerification completeIdVerification = null;
            while (reader.o2(b) == 0) {
                completeIdVerification = (CompleteIdVerificationMutation.CompleteIdVerification) Adapters.c(CompleteIdVerification.f21968a, true).fromJson(reader, customScalarAdapters);
            }
            if (completeIdVerification != null) {
                return new CompleteIdVerificationMutation.Data(completeIdVerification);
            }
            Assertions.a(reader, "completeIdVerification");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CompleteIdVerificationMutation.Data value = (CompleteIdVerificationMutation.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("completeIdVerification");
            Adapters.c(CompleteIdVerification.f21968a, true).toJson(writer, customScalarAdapters, value.f21830a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/CompleteIdVerificationMutation_ResponseAdapter$IdVerificationBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$IdVerificationBottomSheet;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdVerificationBottomSheet implements Adapter<CompleteIdVerificationMutation.IdVerificationBottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final IdVerificationBottomSheet f21970a = new IdVerificationBottomSheet();
        public static final List b = CollectionsKt.R("title", "body", "imageUrls", "primaryButton", "secondaryButton");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            CompleteIdVerificationMutation.PrimaryButton primaryButton = null;
            CompleteIdVerificationMutation.SecondaryButton secondaryButton = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    primaryButton = (CompleteIdVerificationMutation.PrimaryButton) Adapters.b(Adapters.c(PrimaryButton.f21973a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    secondaryButton = (CompleteIdVerificationMutation.SecondaryButton) Adapters.b(Adapters.c(SecondaryButton.f21974a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "body");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new CompleteIdVerificationMutation.IdVerificationBottomSheet(str, str2, arrayListFromJson, primaryButton, secondaryButton);
            }
            Assertions.a(reader, "imageUrls");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CompleteIdVerificationMutation.IdVerificationBottomSheet value = (CompleteIdVerificationMutation.IdVerificationBottomSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21831a);
            writer.F1("body");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrls");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.c);
            writer.F1("primaryButton");
            Adapters.b(Adapters.c(PrimaryButton.f21973a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("secondaryButton");
            Adapters.b(Adapters.c(SecondaryButton.f21974a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/CompleteIdVerificationMutation_ResponseAdapter$OnIdVerificationCompleteFail;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$OnIdVerificationCompleteFail;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnIdVerificationCompleteFail implements Adapter<CompleteIdVerificationMutation.OnIdVerificationCompleteFail> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21971a = CollectionsKt.Q("idVerificationBottomSheet");

        public static CompleteIdVerificationMutation.OnIdVerificationCompleteFail a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CompleteIdVerificationMutation.IdVerificationBottomSheet idVerificationBottomSheet = null;
            while (reader.o2(f21971a) == 0) {
                idVerificationBottomSheet = (CompleteIdVerificationMutation.IdVerificationBottomSheet) Adapters.c(IdVerificationBottomSheet.f21970a, false).fromJson(reader, customScalarAdapters);
            }
            if (idVerificationBottomSheet != null) {
                return new CompleteIdVerificationMutation.OnIdVerificationCompleteFail(idVerificationBottomSheet);
            }
            Assertions.a(reader, "idVerificationBottomSheet");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CompleteIdVerificationMutation.OnIdVerificationCompleteFail value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("idVerificationBottomSheet");
            Adapters.c(IdVerificationBottomSheet.f21970a, false).toJson(writer, customScalarAdapters, value.f21832a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CompleteIdVerificationMutation.OnIdVerificationCompleteFail) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/CompleteIdVerificationMutation_ResponseAdapter$OnIdVerificationCompleteSuccess;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$OnIdVerificationCompleteSuccess;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnIdVerificationCompleteSuccess implements Adapter<CompleteIdVerificationMutation.OnIdVerificationCompleteSuccess> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f21972a = CollectionsKt.Q("message");

        public static CompleteIdVerificationMutation.OnIdVerificationCompleteSuccess a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f21972a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new CompleteIdVerificationMutation.OnIdVerificationCompleteSuccess(str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, CompleteIdVerificationMutation.OnIdVerificationCompleteSuccess value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21833a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (CompleteIdVerificationMutation.OnIdVerificationCompleteSuccess) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/CompleteIdVerificationMutation_ResponseAdapter$PrimaryButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$PrimaryButton;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryButton implements Adapter<CompleteIdVerificationMutation.PrimaryButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryButton f21973a = new PrimaryButton();
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
                return new CompleteIdVerificationMutation.PrimaryButton(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CompleteIdVerificationMutation.PrimaryButton value = (CompleteIdVerificationMutation.PrimaryButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21834a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/checkout/adapter/CompleteIdVerificationMutation_ResponseAdapter$SecondaryButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$SecondaryButton;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryButton implements Adapter<CompleteIdVerificationMutation.SecondaryButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryButton f21974a = new SecondaryButton();
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
                return new CompleteIdVerificationMutation.SecondaryButton(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CompleteIdVerificationMutation.SecondaryButton value = (CompleteIdVerificationMutation.SecondaryButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21835a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }
}
