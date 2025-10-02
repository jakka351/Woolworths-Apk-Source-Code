package com.woolworths.feature.shop.wpay;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.adapter.UnlinkGiftCardMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkGiftCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/wpay/UnlinkGiftCardMutation$Data;", "Data", "UnlinkGiftCard", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UnlinkGiftCardMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20410a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkGiftCardMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkGiftCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UnlinkGiftCard f20411a;

        public Data(UnlinkGiftCard unlinkGiftCard) {
            this.f20411a = unlinkGiftCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20411a, ((Data) obj).f20411a);
        }

        public final int hashCode() {
            return this.f20411a.hashCode();
        }

        public final String toString() {
            return "Data(unlinkGiftCard=" + this.f20411a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/UnlinkGiftCardMutation$UnlinkGiftCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnlinkGiftCard {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20412a;
        public final String b;

        public UnlinkGiftCard(boolean z, String str) {
            this.f20412a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnlinkGiftCard)) {
                return false;
            }
            UnlinkGiftCard unlinkGiftCard = (UnlinkGiftCard) obj;
            return this.f20412a == unlinkGiftCard.f20412a && Intrinsics.c(this.b, unlinkGiftCard.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f20412a) * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.m("UnlinkGiftCard(success=", this.f20412a, ", message=", this.b, ")");
        }
    }

    public UnlinkGiftCardMutation(String giftCardId) {
        Intrinsics.h(giftCardId, "giftCardId");
        this.f20410a = giftCardId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UnlinkGiftCardMutation_ResponseAdapter.Data.f20466a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation UnlinkGiftCard($giftCardId: String!) { unlinkGiftCard(giftCardId: $giftCardId) { success message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnlinkGiftCardMutation) && Intrinsics.c(this.f20410a, ((UnlinkGiftCardMutation) obj).f20410a);
    }

    public final int hashCode() {
        return this.f20410a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "40395491a358c087986774ceaec16173016bff80ce3fc61ec8df3e43ab4467fd";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "UnlinkGiftCard";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("giftCardId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20410a);
    }

    public final String toString() {
        return YU.a.h("UnlinkGiftCardMutation(giftCardId=", this.f20410a, ")");
    }
}
