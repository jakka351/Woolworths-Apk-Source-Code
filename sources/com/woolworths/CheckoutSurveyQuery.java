package com.woolworths;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.SurveyQuestionType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.adapter.CheckoutSurveyQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/CheckoutSurveyQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/CheckoutSurveyQuery$Data;", "Data", "CheckoutSurvey", "Question", "VocSurvey", "Cta", "Companion", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CheckoutSurveyQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f19212a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/CheckoutSurveyQuery$CheckoutSurvey;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutSurvey {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19213a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final VocSurvey f;

        public CheckoutSurvey(ArrayList arrayList, String str, String str2, String str3, String str4, VocSurvey vocSurvey) {
            this.f19213a = arrayList;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = vocSurvey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutSurvey)) {
                return false;
            }
            CheckoutSurvey checkoutSurvey = (CheckoutSurvey) obj;
            return this.f19213a.equals(checkoutSurvey.f19213a) && this.b.equals(checkoutSurvey.b) && this.c.equals(checkoutSurvey.c) && Intrinsics.c(this.d, checkoutSurvey.d) && this.e.equals(checkoutSurvey.e) && Intrinsics.c(this.f, checkoutSurvey.f);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f19213a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
            VocSurvey vocSurvey = this.f;
            return iC2 + (vocSurvey != null ? vocSurvey.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CheckoutSurvey(questions=");
            sb.append(this.f19213a);
            sb.append(", responseId=");
            sb.append(this.b);
            sb.append(", surveyId=");
            a.B(sb, this.c, ", commentButtonText=", this.d, ", commentTitleText=");
            sb.append(this.e);
            sb.append(", vocSurvey=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/CheckoutSurveyQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/CheckoutSurveyQuery$Cta;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f19214a;
        public final ButtonStyle b;
        public final boolean c;

        public Cta(String str, ButtonStyle buttonStyle, boolean z) {
            this.f19214a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f19214a, cta.f19214a) && this.b == cta.b && this.c == cta.c;
        }

        public final int hashCode() {
            int iHashCode = this.f19214a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return YU.a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("Cta(label=", this.f19214a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/CheckoutSurveyQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CheckoutSurvey f19215a;

        public Data(CheckoutSurvey checkoutSurvey) {
            this.f19215a = checkoutSurvey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19215a, ((Data) obj).f19215a);
        }

        public final int hashCode() {
            CheckoutSurvey checkoutSurvey = this.f19215a;
            if (checkoutSurvey == null) {
                return 0;
            }
            return checkoutSurvey.hashCode();
        }

        public final String toString() {
            return "Data(checkoutSurvey=" + this.f19215a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/CheckoutSurveyQuery$Question;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Question {

        /* renamed from: a, reason: collision with root package name */
        public final String f19216a;
        public final String b;
        public final SurveyQuestionType c;

        public Question(String str, String str2, SurveyQuestionType surveyQuestionType) {
            this.f19216a = str;
            this.b = str2;
            this.c = surveyQuestionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Question)) {
                return false;
            }
            Question question = (Question) obj;
            return Intrinsics.c(this.f19216a, question.f19216a) && Intrinsics.c(this.b, question.b) && this.c == question.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19216a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Question(id=", this.f19216a, ", text=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/CheckoutSurveyQuery$VocSurvey;", "", "voc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VocSurvey {

        /* renamed from: a, reason: collision with root package name */
        public final String f19217a;
        public final String b;
        public final String c;
        public final Cta d;
        public final String e;

        public VocSurvey(String str, String str2, String str3, Cta cta, String str4) {
            this.f19217a = str;
            this.b = str2;
            this.c = str3;
            this.d = cta;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VocSurvey)) {
                return false;
            }
            VocSurvey vocSurvey = (VocSurvey) obj;
            return Intrinsics.c(this.f19217a, vocSurvey.f19217a) && Intrinsics.c(this.b, vocSurvey.b) && Intrinsics.c(this.c, vocSurvey.c) && Intrinsics.c(this.d, vocSurvey.d) && Intrinsics.c(this.e, vocSurvey.e);
        }

        public final int hashCode() {
            String str = this.f19217a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (this.d.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.e;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("VocSurvey(surveyUrl=", this.f19217a, ", promptTitle=", this.b, ", promptSubTitle=");
            sbV.append(this.c);
            sbV.append(", cta=");
            sbV.append(this.d);
            sbV.append(", screenTitle=");
            return YU.a.o(sbV, this.e, ")");
        }
    }

    public CheckoutSurveyQuery(Optional optional) {
        this.f19212a = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CheckoutSurveyQuery_ResponseAdapter.Data.f19223a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CheckoutSurvey($mode: ShoppingModeType) { checkoutSurvey(mode: $mode) { questions { id text type } responseId surveyId commentButtonText: commentPrompt commentTitleText: commentText vocSurvey { surveyUrl promptTitle promptSubTitle cta { label style enabled } screenTitle } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutSurveyQuery) && Intrinsics.c(this.f19212a, ((CheckoutSurveyQuery) obj).f19212a);
    }

    public final int hashCode() {
        return this.f19212a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "9628d66d4abdb494ff0e0e3a867ee081a692b0f7c581377283c830b697ca8fc4";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CheckoutSurvey";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f19212a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("mode");
            Adapters.d(Adapters.b(ShoppingModeType_ResponseAdapter.f12118a)).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "CheckoutSurveyQuery(mode=" + this.f19212a + ")";
    }
}
