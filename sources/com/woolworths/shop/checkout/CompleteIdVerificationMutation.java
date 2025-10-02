package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CompleteIdVerificationInput;
import au.com.woolworths.shop.graphql.type.adapter.CompleteIdVerificationInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.CompleteIdVerificationMutation_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$Data;", "Data", "CompleteIdVerification", "OnIdVerificationCompleteSuccess", "OnIdVerificationCompleteFail", "IdVerificationBottomSheet", "PrimaryButton", "SecondaryButton", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CompleteIdVerificationMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final CompleteIdVerificationInput f21828a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$CompleteIdVerification;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CompleteIdVerification {

        /* renamed from: a, reason: collision with root package name */
        public final String f21829a;
        public final OnIdVerificationCompleteSuccess b;
        public final OnIdVerificationCompleteFail c;

        public CompleteIdVerification(String __typename, OnIdVerificationCompleteSuccess onIdVerificationCompleteSuccess, OnIdVerificationCompleteFail onIdVerificationCompleteFail) {
            Intrinsics.h(__typename, "__typename");
            this.f21829a = __typename;
            this.b = onIdVerificationCompleteSuccess;
            this.c = onIdVerificationCompleteFail;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompleteIdVerification)) {
                return false;
            }
            CompleteIdVerification completeIdVerification = (CompleteIdVerification) obj;
            return Intrinsics.c(this.f21829a, completeIdVerification.f21829a) && Intrinsics.c(this.b, completeIdVerification.b) && Intrinsics.c(this.c, completeIdVerification.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21829a.hashCode() * 31;
            OnIdVerificationCompleteSuccess onIdVerificationCompleteSuccess = this.b;
            int iHashCode2 = (iHashCode + (onIdVerificationCompleteSuccess == null ? 0 : onIdVerificationCompleteSuccess.f21833a.hashCode())) * 31;
            OnIdVerificationCompleteFail onIdVerificationCompleteFail = this.c;
            return iHashCode2 + (onIdVerificationCompleteFail != null ? onIdVerificationCompleteFail.f21832a.hashCode() : 0);
        }

        public final String toString() {
            return "CompleteIdVerification(__typename=" + this.f21829a + ", onIdVerificationCompleteSuccess=" + this.b + ", onIdVerificationCompleteFail=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CompleteIdVerification f21830a;

        public Data(CompleteIdVerification completeIdVerification) {
            this.f21830a = completeIdVerification;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21830a, ((Data) obj).f21830a);
        }

        public final int hashCode() {
            return this.f21830a.hashCode();
        }

        public final String toString() {
            return "Data(completeIdVerification=" + this.f21830a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$IdVerificationBottomSheet;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IdVerificationBottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f21831a;
        public final String b;
        public final ArrayList c;
        public final PrimaryButton d;
        public final SecondaryButton e;

        public IdVerificationBottomSheet(String str, String str2, ArrayList arrayList, PrimaryButton primaryButton, SecondaryButton secondaryButton) {
            this.f21831a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = primaryButton;
            this.e = secondaryButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdVerificationBottomSheet)) {
                return false;
            }
            IdVerificationBottomSheet idVerificationBottomSheet = (IdVerificationBottomSheet) obj;
            return this.f21831a.equals(idVerificationBottomSheet.f21831a) && this.b.equals(idVerificationBottomSheet.b) && this.c.equals(idVerificationBottomSheet.c) && Intrinsics.c(this.d, idVerificationBottomSheet.d) && Intrinsics.c(this.e, idVerificationBottomSheet.e);
        }

        public final int hashCode() {
            int iB = a.b(b.c(this.f21831a.hashCode() * 31, 31, this.b), 31, this.c);
            PrimaryButton primaryButton = this.d;
            int iHashCode = (iB + (primaryButton == null ? 0 : primaryButton.hashCode())) * 31;
            SecondaryButton secondaryButton = this.e;
            return iHashCode + (secondaryButton != null ? secondaryButton.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("IdVerificationBottomSheet(title=", this.f21831a, ", body=", this.b, ", imageUrls=");
            sbV.append(this.c);
            sbV.append(", primaryButton=");
            sbV.append(this.d);
            sbV.append(", secondaryButton=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$OnIdVerificationCompleteFail;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnIdVerificationCompleteFail {

        /* renamed from: a, reason: collision with root package name */
        public final IdVerificationBottomSheet f21832a;

        public OnIdVerificationCompleteFail(IdVerificationBottomSheet idVerificationBottomSheet) {
            this.f21832a = idVerificationBottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnIdVerificationCompleteFail) && Intrinsics.c(this.f21832a, ((OnIdVerificationCompleteFail) obj).f21832a);
        }

        public final int hashCode() {
            return this.f21832a.hashCode();
        }

        public final String toString() {
            return "OnIdVerificationCompleteFail(idVerificationBottomSheet=" + this.f21832a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$OnIdVerificationCompleteSuccess;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnIdVerificationCompleteSuccess {

        /* renamed from: a, reason: collision with root package name */
        public final String f21833a;

        public OnIdVerificationCompleteSuccess(String str) {
            this.f21833a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnIdVerificationCompleteSuccess) && Intrinsics.c(this.f21833a, ((OnIdVerificationCompleteSuccess) obj).f21833a);
        }

        public final int hashCode() {
            return this.f21833a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnIdVerificationCompleteSuccess(message=", this.f21833a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$PrimaryButton;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f21834a;
        public final ButtonStyle b;
        public final boolean c;

        public PrimaryButton(String str, ButtonStyle buttonStyle, boolean z) {
            this.f21834a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryButton)) {
                return false;
            }
            PrimaryButton primaryButton = (PrimaryButton) obj;
            return Intrinsics.c(this.f21834a, primaryButton.f21834a) && this.b == primaryButton.b && this.c == primaryButton.c;
        }

        public final int hashCode() {
            int iHashCode = this.f21834a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return YU.a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("PrimaryButton(label=", this.f21834a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/CompleteIdVerificationMutation$SecondaryButton;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f21835a;
        public final ButtonStyle b;
        public final boolean c;

        public SecondaryButton(String str, ButtonStyle buttonStyle, boolean z) {
            this.f21835a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecondaryButton)) {
                return false;
            }
            SecondaryButton secondaryButton = (SecondaryButton) obj;
            return Intrinsics.c(this.f21835a, secondaryButton.f21835a) && this.b == secondaryButton.b && this.c == secondaryButton.c;
        }

        public final int hashCode() {
            int iHashCode = this.f21835a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return YU.a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("SecondaryButton(label=", this.f21835a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    public CompleteIdVerificationMutation(CompleteIdVerificationInput completeIdVerificationInput) {
        this.f21828a = completeIdVerificationInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CompleteIdVerificationMutation_ResponseAdapter.Data.f21969a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation completeIdVerification($input: CompleteIdVerificationInput!) { completeIdVerification(completeIdVerificationInput: $input) { __typename ... on IdVerificationCompleteSuccess { message } ... on IdVerificationCompleteFail { idVerificationBottomSheet { title body imageUrls primaryButton { label style enabled } secondaryButton { label style enabled } } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompleteIdVerificationMutation) && Intrinsics.c(this.f21828a, ((CompleteIdVerificationMutation) obj).f21828a);
    }

    public final int hashCode() {
        return this.f21828a.f11276a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "9d076067d3d46f3ed5b140bbccfa3b533cd29c012bd9a4e2f23a54f223d1d5da";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "completeIdVerification";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(CompleteIdVerificationInput_InputAdapter.f12055a, false).toJson(jsonWriter, customScalarAdapters, this.f21828a);
    }

    public final String toString() {
        return "CompleteIdVerificationMutation(input=" + this.f21828a + ")";
    }
}
