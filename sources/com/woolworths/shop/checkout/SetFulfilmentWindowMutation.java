package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.CollectionModeId;
import au.com.woolworths.shop.graphql.type.adapter.FulfilmentWindowSlotSelectionOptionId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.SetFulfilmentWindowMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/SetFulfilmentWindowMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/SetFulfilmentWindowMutation$Data;", "Data", "SetFulfilmentWindow", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SetFulfilmentWindowMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final int f21892a;
    public final String b;
    public final Optional c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/SetFulfilmentWindowMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SetFulfilmentWindowMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SetFulfilmentWindow f21893a;

        public Data(SetFulfilmentWindow setFulfilmentWindow) {
            this.f21893a = setFulfilmentWindow;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21893a, ((Data) obj).f21893a);
        }

        public final int hashCode() {
            SetFulfilmentWindow setFulfilmentWindow = this.f21893a;
            if (setFulfilmentWindow == null) {
                return 0;
            }
            return setFulfilmentWindow.hashCode();
        }

        public final String toString() {
            return "Data(setFulfilmentWindow=" + this.f21893a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SetFulfilmentWindowMutation$SetFulfilmentWindow;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetFulfilmentWindow {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f21894a;
        public final CollectionModeId b;

        public SetFulfilmentWindow(Boolean bool, CollectionModeId collectionModeId) {
            this.f21894a = bool;
            this.b = collectionModeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetFulfilmentWindow)) {
                return false;
            }
            SetFulfilmentWindow setFulfilmentWindow = (SetFulfilmentWindow) obj;
            return Intrinsics.c(this.f21894a, setFulfilmentWindow.f21894a) && this.b == setFulfilmentWindow.b;
        }

        public final int hashCode() {
            Boolean bool = this.f21894a;
            return this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31);
        }

        public final String toString() {
            return "SetFulfilmentWindow(_excluded=" + this.f21894a + ", modeId=" + this.b + ")";
        }
    }

    public SetFulfilmentWindowMutation(int i, String windowDate, Optional windowOption) {
        Intrinsics.h(windowDate, "windowDate");
        Intrinsics.h(windowOption, "windowOption");
        this.f21892a = i;
        this.b = windowDate;
        this.c = windowOption;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SetFulfilmentWindowMutation_ResponseAdapter.Data.f22022a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation SetFulfilmentWindow($windowId: Int!, $windowDate: String!, $windowOption: FulfilmentWindowSlotSelectionOptionId) { setFulfilmentWindow(windowId: $windowId, windowDate: $windowDate, windowOption: $windowOption) { _excluded: _ modeId } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetFulfilmentWindowMutation)) {
            return false;
        }
        SetFulfilmentWindowMutation setFulfilmentWindowMutation = (SetFulfilmentWindowMutation) obj;
        return this.f21892a == setFulfilmentWindowMutation.f21892a && Intrinsics.c(this.b, setFulfilmentWindowMutation.b) && Intrinsics.c(this.c, setFulfilmentWindowMutation.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(Integer.hashCode(this.f21892a) * 31, 31, this.b);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "75bf151e0de1b7a33c0f8e19a57587a7b898f43747592cb410df0558c17c333e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SetFulfilmentWindow";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("windowId");
        d.y(this.f21892a, Adapters.b, jsonWriter, customScalarAdapters, "windowDate");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.b);
        Optional optional = this.c;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("windowOption");
            Adapters.d(Adapters.b(FulfilmentWindowSlotSelectionOptionId_ResponseAdapter.f12075a)).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return a.o(androidx.constraintlayout.core.state.a.p("SetFulfilmentWindowMutation(windowId=", this.f21892a, ", windowDate=", this.b, ", windowOption="), this.c, ")");
    }
}
