package com.woolworths.feature.shop.shippingcalculator;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.shippingcalculator.adapter.SearchSuburbsByTermQuery_ResponseAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/shippingcalculator/SearchSuburbsByTermQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/shippingcalculator/SearchSuburbsByTermQuery$Data;", "Data", "SearchSuburbsByTerm", "Companion", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SearchSuburbsByTermQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20317a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/shippingcalculator/SearchSuburbsByTermQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/shippingcalculator/SearchSuburbsByTermQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final List f20318a;

        public Data(List list) {
            this.f20318a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20318a, ((Data) obj).f20318a);
        }

        public final int hashCode() {
            List list = this.f20318a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return a.l("Data(searchSuburbsByTerm=", ")", this.f20318a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/shippingcalculator/SearchSuburbsByTermQuery$SearchSuburbsByTerm;", "", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SearchSuburbsByTerm {

        /* renamed from: a, reason: collision with root package name */
        public final String f20319a;
        public final String b;
        public final String c;

        public SearchSuburbsByTerm(String str, String str2, String str3) {
            this.f20319a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchSuburbsByTerm)) {
                return false;
            }
            SearchSuburbsByTerm searchSuburbsByTerm = (SearchSuburbsByTerm) obj;
            return Intrinsics.c(this.f20319a, searchSuburbsByTerm.f20319a) && Intrinsics.c(this.b, searchSuburbsByTerm.b) && Intrinsics.c(this.c, searchSuburbsByTerm.c);
        }

        public final int hashCode() {
            String str = this.f20319a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("SearchSuburbsByTerm(postcode=", this.f20319a, ", state=", this.b, ", text="), this.c, ")");
        }
    }

    public SearchSuburbsByTermQuery(String term) {
        Intrinsics.h(term, "term");
        this.f20317a = term;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SearchSuburbsByTermQuery_ResponseAdapter.Data.f20320a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query searchSuburbsByTerm($term: String!) { searchSuburbsByTerm(term: $term) { postcode state text } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchSuburbsByTermQuery) && Intrinsics.c(this.f20317a, ((SearchSuburbsByTermQuery) obj).f20317a);
    }

    public final int hashCode() {
        return this.f20317a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "3ca3b4ea342d4146d4c135d8bcea6a793facdd1f3e8b83c2226f5100c2c8f723";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "searchSuburbsByTerm";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("term");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20317a);
    }

    public final String toString() {
        return YU.a.h("SearchSuburbsByTermQuery(term=", this.f20317a, ")");
    }
}
