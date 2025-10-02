package com.woolworths.feature.shop.wpay;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.adapter.UnlinkCreditCardMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$Data;", "Data", "UnlinkCreditCard", "OnUnlinkCreditCardSuccess", "OnUnlinkCreditCardValidationFailure", "Analytics", "OnUnlinkCreditCardFailure", "Analytics1", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UnlinkCreditCardMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20402a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$Analytics;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20403a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f20403a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f20403a, analytics.f20403a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20403a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f20403a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$Analytics1;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20404a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f20404a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f20404a, analytics1.f20404a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20404a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f20404a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UnlinkCreditCard f20405a;

        public Data(UnlinkCreditCard unlinkCreditCard) {
            this.f20405a = unlinkCreditCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20405a, ((Data) obj).f20405a);
        }

        public final int hashCode() {
            return this.f20405a.hashCode();
        }

        public final String toString() {
            return "Data(unlinkCreditCard=" + this.f20405a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$OnUnlinkCreditCardFailure;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUnlinkCreditCardFailure {

        /* renamed from: a, reason: collision with root package name */
        public final String f20406a;
        public final Analytics1 b;

        public OnUnlinkCreditCardFailure(String str, Analytics1 analytics1) {
            this.f20406a = str;
            this.b = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnUnlinkCreditCardFailure)) {
                return false;
            }
            OnUnlinkCreditCardFailure onUnlinkCreditCardFailure = (OnUnlinkCreditCardFailure) obj;
            return Intrinsics.c(this.f20406a, onUnlinkCreditCardFailure.f20406a) && Intrinsics.c(this.b, onUnlinkCreditCardFailure.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20406a.hashCode() * 31);
        }

        public final String toString() {
            return "OnUnlinkCreditCardFailure(errorMessage=" + this.f20406a + ", analytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$OnUnlinkCreditCardSuccess;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUnlinkCreditCardSuccess {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f20407a;

        public OnUnlinkCreditCardSuccess(Boolean bool) {
            this.f20407a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnUnlinkCreditCardSuccess) && Intrinsics.c(this.f20407a, ((OnUnlinkCreditCardSuccess) obj).f20407a);
        }

        public final int hashCode() {
            Boolean bool = this.f20407a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return a.k(this.f20407a, "OnUnlinkCreditCardSuccess(_=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$OnUnlinkCreditCardValidationFailure;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUnlinkCreditCardValidationFailure {

        /* renamed from: a, reason: collision with root package name */
        public final String f20408a;
        public final String b;
        public final String c;
        public final Analytics d;

        public OnUnlinkCreditCardValidationFailure(String str, String str2, String str3, Analytics analytics) {
            this.f20408a = str;
            this.b = str2;
            this.c = str3;
            this.d = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnUnlinkCreditCardValidationFailure)) {
                return false;
            }
            OnUnlinkCreditCardValidationFailure onUnlinkCreditCardValidationFailure = (OnUnlinkCreditCardValidationFailure) obj;
            return Intrinsics.c(this.f20408a, onUnlinkCreditCardValidationFailure.f20408a) && Intrinsics.c(this.b, onUnlinkCreditCardValidationFailure.b) && Intrinsics.c(this.c, onUnlinkCreditCardValidationFailure.c) && Intrinsics.c(this.d, onUnlinkCreditCardValidationFailure.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f20408a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnUnlinkCreditCardValidationFailure(errorMessage=", this.f20408a, ", errorTitle=", this.b, ", errorButton=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkCreditCardMutation$UnlinkCreditCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnlinkCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20409a;
        public final OnUnlinkCreditCardSuccess b;
        public final OnUnlinkCreditCardValidationFailure c;
        public final OnUnlinkCreditCardFailure d;

        public UnlinkCreditCard(String __typename, OnUnlinkCreditCardSuccess onUnlinkCreditCardSuccess, OnUnlinkCreditCardValidationFailure onUnlinkCreditCardValidationFailure, OnUnlinkCreditCardFailure onUnlinkCreditCardFailure) {
            Intrinsics.h(__typename, "__typename");
            this.f20409a = __typename;
            this.b = onUnlinkCreditCardSuccess;
            this.c = onUnlinkCreditCardValidationFailure;
            this.d = onUnlinkCreditCardFailure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnlinkCreditCard)) {
                return false;
            }
            UnlinkCreditCard unlinkCreditCard = (UnlinkCreditCard) obj;
            return Intrinsics.c(this.f20409a, unlinkCreditCard.f20409a) && Intrinsics.c(this.b, unlinkCreditCard.b) && Intrinsics.c(this.c, unlinkCreditCard.c) && Intrinsics.c(this.d, unlinkCreditCard.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20409a.hashCode() * 31;
            OnUnlinkCreditCardSuccess onUnlinkCreditCardSuccess = this.b;
            int iHashCode2 = (iHashCode + (onUnlinkCreditCardSuccess == null ? 0 : onUnlinkCreditCardSuccess.hashCode())) * 31;
            OnUnlinkCreditCardValidationFailure onUnlinkCreditCardValidationFailure = this.c;
            int iHashCode3 = (iHashCode2 + (onUnlinkCreditCardValidationFailure == null ? 0 : onUnlinkCreditCardValidationFailure.hashCode())) * 31;
            OnUnlinkCreditCardFailure onUnlinkCreditCardFailure = this.d;
            return iHashCode3 + (onUnlinkCreditCardFailure != null ? onUnlinkCreditCardFailure.hashCode() : 0);
        }

        public final String toString() {
            return "UnlinkCreditCard(__typename=" + this.f20409a + ", onUnlinkCreditCardSuccess=" + this.b + ", onUnlinkCreditCardValidationFailure=" + this.c + ", onUnlinkCreditCardFailure=" + this.d + ")";
        }
    }

    public UnlinkCreditCardMutation(String creditCardId) {
        Intrinsics.h(creditCardId, "creditCardId");
        this.f20402a = creditCardId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UnlinkCreditCardMutation_ResponseAdapter.Data.f20461a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UnlinkCreditCard($creditCardId: String!) { unlinkCreditCard(creditCardId: $creditCardId) { __typename ... on UnlinkCreditCardSuccess { _ } ... on UnlinkCreditCardValidationFailure { errorMessage errorTitle errorButton analytics { __typename ...analyticsFields } } ... on UnlinkCreditCardFailure { errorMessage analytics { __typename ...analyticsFields } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnlinkCreditCardMutation) && Intrinsics.c(this.f20402a, ((UnlinkCreditCardMutation) obj).f20402a);
    }

    public final int hashCode() {
        return this.f20402a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "da057cafc80262d78bc86a93725b4fbe937193f94777ccb9caa9b96e1a33cda5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UnlinkCreditCard";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("creditCardId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20402a);
    }

    public final String toString() {
        return YU.a.h("UnlinkCreditCardMutation(creditCardId=", this.f20402a, ")");
    }
}
