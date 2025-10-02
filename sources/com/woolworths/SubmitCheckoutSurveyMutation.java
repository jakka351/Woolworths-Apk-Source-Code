package com.woolworths;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.graphql.type.DeviceInfo;
import au.com.woolworths.shop.graphql.type.adapter.DeviceInfo_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.adapter.SubmitCheckoutSurveyMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/SubmitCheckoutSurveyMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/SubmitCheckoutSurveyMutation$Data;", "Data", "Companion", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SubmitCheckoutSurveyMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f19219a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final DeviceInfo g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/SubmitCheckoutSurveyMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/SubmitCheckoutSurveyMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f19220a;

        public Data(boolean z) {
            this.f19220a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && this.f19220a == ((Data) obj).f19220a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f19220a);
        }

        public final String toString() {
            return a.n("Data(submitCheckoutSurvey=", ")", this.f19220a);
        }
    }

    public SubmitCheckoutSurveyMutation(String surveyId, String responseId, String score, String comment, String orderNumber, String questionId, DeviceInfo deviceInfo) {
        Intrinsics.h(surveyId, "surveyId");
        Intrinsics.h(responseId, "responseId");
        Intrinsics.h(score, "score");
        Intrinsics.h(comment, "comment");
        Intrinsics.h(orderNumber, "orderNumber");
        Intrinsics.h(questionId, "questionId");
        Intrinsics.h(deviceInfo, "deviceInfo");
        this.f19219a = surveyId;
        this.b = responseId;
        this.c = score;
        this.d = comment;
        this.e = orderNumber;
        this.f = questionId;
        this.g = deviceInfo;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SubmitCheckoutSurveyMutation_ResponseAdapter.Data.f19226a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation SubmitCheckoutSurvey($surveyId: ID!, $responseId: ID!, $score: String!, $comment: String!, $orderNumber: String!, $questionId: ID!, $deviceInfo: DeviceInfo!) { submitCheckoutSurvey(surveyId: $surveyId, responseId: $responseId, response: $score, comment: $comment, orderNumber: $orderNumber, questionId: $questionId, device: $deviceInfo) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitCheckoutSurveyMutation)) {
            return false;
        }
        SubmitCheckoutSurveyMutation submitCheckoutSurveyMutation = (SubmitCheckoutSurveyMutation) obj;
        return Intrinsics.c(this.f19219a, submitCheckoutSurveyMutation.f19219a) && Intrinsics.c(this.b, submitCheckoutSurveyMutation.b) && Intrinsics.c(this.c, submitCheckoutSurveyMutation.c) && Intrinsics.c(this.d, submitCheckoutSurveyMutation.d) && Intrinsics.c(this.e, submitCheckoutSurveyMutation.e) && Intrinsics.c(this.f, submitCheckoutSurveyMutation.f) && Intrinsics.c(this.g, submitCheckoutSurveyMutation.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b.c(b.c(b.c(b.c(b.c(this.f19219a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "b530b255b5aa44c02fea36df2bf9c8fbb320792c9b31cc7b8ca84fb1eacfc2c3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SubmitCheckoutSurvey";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("surveyId");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.f19219a);
        jsonWriter.F1("responseId");
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.b);
        jsonWriter.F1("score");
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.c);
        jsonWriter.F1("comment");
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.d);
        jsonWriter.F1("orderNumber");
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.e);
        jsonWriter.F1("questionId");
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.f);
        jsonWriter.F1("deviceInfo");
        Adapters.c(DeviceInfo_InputAdapter.f12069a, false).toJson(jsonWriter, customScalarAdapters, this.g);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("SubmitCheckoutSurveyMutation(surveyId=", this.f19219a, ", responseId=", this.b, ", score=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", comment=", this.d, ", orderNumber=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", questionId=", this.f, ", deviceInfo=");
        sbV.append(this.g);
        sbV.append(")");
        return sbV.toString();
    }
}
