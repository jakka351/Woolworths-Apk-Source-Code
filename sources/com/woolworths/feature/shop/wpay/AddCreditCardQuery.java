package com.woolworths.feature.shop.wpay;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.AddCreditCardInput;
import au.com.woolworths.shop.graphql.type.adapter.AddCreditCardInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.adapter.AddCreditCardQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/feature/shop/wpay/AddCreditCardQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/wpay/AddCreditCardQuery$Data;", "Data", "AddCreditCard", "ClickAnalytics", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AddCreditCardQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final AddCreditCardInput f20355a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/AddCreditCardQuery$AddCreditCard;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddCreditCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20356a;
        public final boolean b;
        public final String c;
        public final ClickAnalytics d;

        public AddCreditCard(String str, boolean z, String str2, ClickAnalytics clickAnalytics) {
            this.f20356a = str;
            this.b = z;
            this.c = str2;
            this.d = clickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddCreditCard)) {
                return false;
            }
            AddCreditCard addCreditCard = (AddCreditCard) obj;
            return Intrinsics.c(this.f20356a, addCreditCard.f20356a) && this.b == addCreditCard.b && Intrinsics.c(this.c, addCreditCard.c) && Intrinsics.c(this.d, addCreditCard.d);
        }

        public final int hashCode() {
            int iE = b.e(this.f20356a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = a.q("AddCreditCard(url=", this.f20356a, ", isMandatorySave=", ", infoText=", this.b);
            sbQ.append(this.c);
            sbQ.append(", clickAnalytics=");
            sbQ.append(this.d);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/AddCreditCardQuery$ClickAnalytics;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20357a;
        public final AnalyticsFields b;

        public ClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f20357a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickAnalytics)) {
                return false;
            }
            ClickAnalytics clickAnalytics = (ClickAnalytics) obj;
            return Intrinsics.c(this.f20357a, clickAnalytics.f20357a) && Intrinsics.c(this.b, clickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20357a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ClickAnalytics(__typename=", this.f20357a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/AddCreditCardQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/AddCreditCardQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final AddCreditCard f20358a;

        public Data(AddCreditCard addCreditCard) {
            this.f20358a = addCreditCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20358a, ((Data) obj).f20358a);
        }

        public final int hashCode() {
            return this.f20358a.hashCode();
        }

        public final String toString() {
            return "Data(addCreditCard=" + this.f20358a + ")";
        }
    }

    public AddCreditCardQuery(AddCreditCardInput addCreditCardInput) {
        this.f20355a = addCreditCardInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(AddCreditCardQuery_ResponseAdapter.Data.f20418a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query AddCreditCard($addCreditCardInput: AddCreditCardInput!) { addCreditCard(addCreditCardInput: $addCreditCardInput) { url isMandatorySave infoText clickAnalytics { __typename ...analyticsFields } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddCreditCardQuery) && Intrinsics.c(this.f20355a, ((AddCreditCardQuery) obj).f20355a);
    }

    public final int hashCode() {
        return this.f20355a.f11003a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "322bd6e29d5e590179d56d27b7f59a9e225b2203a52f1296c2516a13e51e4498";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AddCreditCard";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("addCreditCardInput");
        Adapters.c(AddCreditCardInput_InputAdapter.f12032a, false).toJson(jsonWriter, customScalarAdapters, this.f20355a);
    }

    public final String toString() {
        return "AddCreditCardQuery(addCreditCardInput=" + this.f20355a + ")";
    }
}
