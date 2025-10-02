package com.woolworths.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.SurveyQuestionType;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.SurveyQuestionType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.CheckoutSurveyQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/adapter/CheckoutSurveyQuery_ResponseAdapter;", "", "Data", "CheckoutSurvey", "Question", "VocSurvey", "Cta", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutSurveyQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/adapter/CheckoutSurveyQuery_ResponseAdapter$CheckoutSurvey;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/CheckoutSurveyQuery$CheckoutSurvey;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutSurvey implements Adapter<CheckoutSurveyQuery.CheckoutSurvey> {

        /* renamed from: a, reason: collision with root package name */
        public static final CheckoutSurvey f19221a = new CheckoutSurvey();
        public static final List b = CollectionsKt.R("questions", "responseId", "surveyId", "commentButtonText", "commentTitleText", "vocSurvey");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            CheckoutSurveyQuery.VocSurvey vocSurvey = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Question.f19224a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    vocSurvey = (CheckoutSurveyQuery.VocSurvey) Adapters.b(Adapters.c(VocSurvey.f19225a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "questions");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "responseId");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "surveyId");
                throw null;
            }
            if (str4 != null) {
                return new CheckoutSurveyQuery.CheckoutSurvey(arrayListFromJson, str, str2, str3, str4, vocSurvey);
            }
            Assertions.a(reader, "commentTitleText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutSurveyQuery.CheckoutSurvey value = (CheckoutSurveyQuery.CheckoutSurvey) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("questions");
            Adapters.a(Adapters.c(Question.f19224a, false)).toJson(writer, customScalarAdapters, value.f19213a);
            writer.F1("responseId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("surveyId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("commentButtonText");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("commentTitleText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("vocSurvey");
            Adapters.b(Adapters.c(VocSurvey.f19225a, false)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/adapter/CheckoutSurveyQuery_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/CheckoutSurveyQuery$Cta;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<CheckoutSurveyQuery.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f19222a = new Cta();
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
                return new CheckoutSurveyQuery.Cta(str, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutSurveyQuery.Cta value = (CheckoutSurveyQuery.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f19214a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.c));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/adapter/CheckoutSurveyQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/CheckoutSurveyQuery$Data;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<CheckoutSurveyQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f19223a = new Data();
        public static final List b = CollectionsKt.Q("checkoutSurvey");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CheckoutSurveyQuery.CheckoutSurvey checkoutSurvey = null;
            while (reader.o2(b) == 0) {
                checkoutSurvey = (CheckoutSurveyQuery.CheckoutSurvey) Adapters.b(Adapters.c(CheckoutSurvey.f19221a, false)).fromJson(reader, customScalarAdapters);
            }
            return new CheckoutSurveyQuery.Data(checkoutSurvey);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutSurveyQuery.Data value = (CheckoutSurveyQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("checkoutSurvey");
            Adapters.b(Adapters.c(CheckoutSurvey.f19221a, false)).toJson(writer, customScalarAdapters, value.f19215a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/adapter/CheckoutSurveyQuery_ResponseAdapter$Question;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/CheckoutSurveyQuery$Question;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Question implements Adapter<CheckoutSurveyQuery.Question> {

        /* renamed from: a, reason: collision with root package name */
        public static final Question f19224a = new Question();
        public static final List b = CollectionsKt.R("id", TextBundle.TEXT_ENTRY, "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            SurveyQuestionType surveyQuestionTypeA = null;
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
                    surveyQuestionTypeA = SurveyQuestionType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (surveyQuestionTypeA != null) {
                return new CheckoutSurveyQuery.Question(str, str2, surveyQuestionTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutSurveyQuery.Question value = (CheckoutSurveyQuery.Question) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f19216a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            writer.v0(value.c.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/adapter/CheckoutSurveyQuery_ResponseAdapter$VocSurvey;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/CheckoutSurveyQuery$VocSurvey;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VocSurvey implements Adapter<CheckoutSurveyQuery.VocSurvey> {

        /* renamed from: a, reason: collision with root package name */
        public static final VocSurvey f19225a = new VocSurvey();
        public static final List b = CollectionsKt.R("surveyUrl", "promptTitle", "promptSubTitle", "cta", "screenTitle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            CheckoutSurveyQuery.Cta cta = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    cta = (CheckoutSurveyQuery.Cta) Adapters.c(Cta.f19222a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, "promptTitle");
                throw null;
            }
            if (cta != null) {
                return new CheckoutSurveyQuery.VocSurvey(str, str2, str3, cta, str4);
            }
            Assertions.a(reader, "cta");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            CheckoutSurveyQuery.VocSurvey value = (CheckoutSurveyQuery.VocSurvey) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("surveyUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f19217a);
            writer.F1("promptTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("promptSubTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("cta");
            Adapters.c(Cta.f19222a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("screenTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }
    }
}
