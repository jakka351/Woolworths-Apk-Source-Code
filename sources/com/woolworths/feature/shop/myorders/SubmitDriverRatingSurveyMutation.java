package com.woolworths.feature.shop.myorders;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.myorders.adapter.SubmitDriverRatingSurveyMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/feature/shop/myorders/SubmitDriverRatingSurveyMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/myorders/SubmitDriverRatingSurveyMutation$Data;", "Data", "SubmitDriverRatingSurvey", "Error", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubmitDriverRatingSurveyMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20018a;
    public final String b;
    public final String c;
    public final Optional.Present d;
    public final Optional.Present e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/myorders/SubmitDriverRatingSurveyMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/SubmitDriverRatingSurveyMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SubmitDriverRatingSurvey f20019a;

        public Data(SubmitDriverRatingSurvey submitDriverRatingSurvey) {
            this.f20019a = submitDriverRatingSurvey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20019a, ((Data) obj).f20019a);
        }

        public final int hashCode() {
            return this.f20019a.hashCode();
        }

        public final String toString() {
            return "Data(submitDriverRatingSurvey=" + this.f20019a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/SubmitDriverRatingSurveyMutation$Error;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error {

        /* renamed from: a, reason: collision with root package name */
        public final String f20020a;
        public final String b;

        public Error(String str, String str2) {
            this.f20020a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.c(this.f20020a, error.f20020a) && Intrinsics.c(this.b, error.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20020a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Error(code=", this.f20020a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/myorders/SubmitDriverRatingSurveyMutation$SubmitDriverRatingSurvey;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubmitDriverRatingSurvey {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20021a;
        public final String b;
        public final Error c;

        public SubmitDriverRatingSurvey(boolean z, String str, Error error) {
            this.f20021a = z;
            this.b = str;
            this.c = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitDriverRatingSurvey)) {
                return false;
            }
            SubmitDriverRatingSurvey submitDriverRatingSurvey = (SubmitDriverRatingSurvey) obj;
            return this.f20021a == submitDriverRatingSurvey.f20021a && Intrinsics.c(this.b, submitDriverRatingSurvey.b) && Intrinsics.c(this.c, submitDriverRatingSurvey.c);
        }

        public final int hashCode() {
            int iC = b.c(Boolean.hashCode(this.f20021a) * 31, 31, this.b);
            Error error = this.c;
            return iC + (error == null ? 0 : error.hashCode());
        }

        public final String toString() {
            StringBuilder sbT = au.com.woolworths.android.onesite.a.t("SubmitDriverRatingSurvey(success=", ", message=", this.b, ", error=", this.f20021a);
            sbT.append(this.c);
            sbT.append(")");
            return sbT.toString();
        }
    }

    public SubmitDriverRatingSurveyMutation(String str, String starRating, String str2, Optional.Present present, Optional.Present present2) {
        Intrinsics.h(starRating, "starRating");
        this.f20018a = str;
        this.b = starRating;
        this.c = str2;
        this.d = present;
        this.e = present2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SubmitDriverRatingSurveyMutation_ResponseAdapter.Data.f20185a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation SubmitDriverRatingSurvey($surveyId: ID!, $starRating: String!, $orderNumber: String!, $comment: String, $selectedChips: [String]) { submitDriverRatingSurvey(surveyId: $surveyId, starRating: $starRating, orderNumber: $orderNumber, comment: $comment, selectedChips: $selectedChips) { success message error { code message } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitDriverRatingSurveyMutation)) {
            return false;
        }
        SubmitDriverRatingSurveyMutation submitDriverRatingSurveyMutation = (SubmitDriverRatingSurveyMutation) obj;
        return this.f20018a.equals(submitDriverRatingSurveyMutation.f20018a) && Intrinsics.c(this.b, submitDriverRatingSurveyMutation.b) && this.c.equals(submitDriverRatingSurveyMutation.c) && this.d.equals(submitDriverRatingSurveyMutation.d) && this.e.equals(submitDriverRatingSurveyMutation.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.b(this.d, b.c(b.c(this.f20018a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "53cc9c9a5870f1ac3e8df2faffd96f7001d80e8f1b47080b0b81406873f3604a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SubmitDriverRatingSurvey";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("surveyId");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.f20018a);
        jsonWriter.F1("starRating");
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.b);
        jsonWriter.F1("orderNumber");
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.c);
        jsonWriter.F1("comment");
        NullableAdapter nullableAdapter = Adapters.i;
        Adapters.d(nullableAdapter).toJson(jsonWriter, customScalarAdapters, this.d);
        jsonWriter.F1("selectedChips");
        Adapters.d(Adapters.b(Adapters.a(nullableAdapter))).toJson(jsonWriter, customScalarAdapters, this.e);
    }

    public final String toString() {
        StringBuilder sbV = a.v("SubmitDriverRatingSurveyMutation(surveyId=", this.f20018a, ", starRating=", this.b, ", orderNumber=");
        sbV.append(this.c);
        sbV.append(", comment=");
        sbV.append(this.d);
        sbV.append(", selectedChips=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
