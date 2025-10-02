package com.woolworths.feature.shop.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.adapter.LinkCreditCardMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/LinkCreditCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/wpay/LinkCreditCardMutation$Data;", "Data", "LinkCreditCard", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LinkCreditCardMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20362a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/LinkCreditCardMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/LinkCreditCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final LinkCreditCard f20363a;

        public Data(LinkCreditCard linkCreditCard) {
            this.f20363a = linkCreditCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20363a, ((Data) obj).f20363a);
        }

        public final int hashCode() {
            return this.f20363a.hashCode();
        }

        public final String toString() {
            return "Data(linkCreditCard=" + this.f20363a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/LinkCreditCardMutation$LinkCreditCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20364a;
        public final String b;

        public LinkCreditCard(boolean z, String str) {
            this.f20364a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkCreditCard)) {
                return false;
            }
            LinkCreditCard linkCreditCard = (LinkCreditCard) obj;
            return this.f20364a == linkCreditCard.f20364a && Intrinsics.c(this.b, linkCreditCard.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f20364a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.m("LinkCreditCard(success=", this.f20364a, ", paymentMethodId=", this.b, ")");
        }
    }

    public LinkCreditCardMutation(String checkoutSessionId) {
        Intrinsics.h(checkoutSessionId, "checkoutSessionId");
        this.f20362a = checkoutSessionId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(LinkCreditCardMutation_ResponseAdapter.Data.f20421a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation LinkCreditCard($checkoutSessionId: String!) { linkCreditCard(checkoutSessionId: $checkoutSessionId) { success paymentMethodId } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkCreditCardMutation) && Intrinsics.c(this.f20362a, ((LinkCreditCardMutation) obj).f20362a);
    }

    public final int hashCode() {
        return this.f20362a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "cac6251e0033fc6ce70db38c7bcec26897c5682ea9d651048d24b179c6cfbad4";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "LinkCreditCard";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("checkoutSessionId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20362a);
    }

    public final String toString() {
        return YU.a.h("LinkCreditCardMutation(checkoutSessionId=", this.f20362a, ")");
    }
}
