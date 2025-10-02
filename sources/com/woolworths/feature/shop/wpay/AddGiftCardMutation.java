package com.woolworths.feature.shop.wpay;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.AddGiftCardInput;
import au.com.woolworths.shop.graphql.type.adapter.AddGiftCardInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.adapter.AddGiftCardMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/AddGiftCardMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/feature/shop/wpay/AddGiftCardMutation$Data;", "Data", "AddGiftCard", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AddGiftCardMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final AddGiftCardInput f20359a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/AddGiftCardMutation$AddGiftCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddGiftCard {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f20360a;
        public final String b;
        public final String c;

        public AddGiftCard(boolean z, String str, String str2) {
            this.f20360a = z;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddGiftCard)) {
                return false;
            }
            AddGiftCard addGiftCard = (AddGiftCard) obj;
            return this.f20360a == addGiftCard.f20360a && Intrinsics.c(this.b, addGiftCard.b) && Intrinsics.c(this.c, addGiftCard.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f20360a) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(au.com.woolworths.android.onesite.a.t("AddGiftCard(success=", ", id=", this.b, ", message=", this.f20360a), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/AddGiftCardMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/AddGiftCardMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final AddGiftCard f20361a;

        public Data(AddGiftCard addGiftCard) {
            this.f20361a = addGiftCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20361a, ((Data) obj).f20361a);
        }

        public final int hashCode() {
            return this.f20361a.hashCode();
        }

        public final String toString() {
            return "Data(addGiftCard=" + this.f20361a + ")";
        }
    }

    public AddGiftCardMutation(AddGiftCardInput addGiftCardInput) {
        this.f20359a = addGiftCardInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(AddGiftCardMutation_ResponseAdapter.Data.f20420a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation AddGiftCard($input: AddGiftCardInput!) { addGiftCard(addGiftCardInput: $input) { success id message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddGiftCardMutation) && Intrinsics.c(this.f20359a, ((AddGiftCardMutation) obj).f20359a);
    }

    public final int hashCode() {
        return this.f20359a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "d105a9d8a2e3cbc547dcbb5a9aeeb4f375ff78acb54bccfe6973f6af24dccb3f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AddGiftCard";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(AddGiftCardInput_InputAdapter.f12033a, false).toJson(jsonWriter, customScalarAdapters, this.f20359a);
    }

    public final String toString() {
        return "AddGiftCardMutation(input=" + this.f20359a + ")";
    }
}
