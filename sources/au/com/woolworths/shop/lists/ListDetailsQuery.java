package au.com.woolworths.shop.lists;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.ListDetailsInput;
import au.com.woolworths.shop.graphql.type.adapter.ListDetailsInput_InputAdapter;
import au.com.woolworths.shop.lists.adapter.ListDetailsQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/lists/ListDetailsQuery$Data;", "Data", "ListDetails", "Total", "Summary", "Section", "OnListDetailsTotalSectionHeader", "OnListDetailsPotentialSavings", "OnListDetailsRewardsSummary", "Disclaimer", "Overview", "ProductAction", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ListDetailsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ListDetailsInput f12215a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ListDetails f12216a;

        public Data(ListDetails listDetails) {
            this.f12216a = listDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12216a, ((Data) obj).f12216a);
        }

        public final int hashCode() {
            return this.f12216a.hashCode();
        }

        public final String toString() {
            return "Data(listDetails=" + this.f12216a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$Disclaimer;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Disclaimer {

        /* renamed from: a, reason: collision with root package name */
        public final String f12217a;

        public Disclaimer(String str) {
            this.f12217a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Disclaimer) && Intrinsics.c(this.f12217a, ((Disclaimer) obj).f12217a);
        }

        public final int hashCode() {
            return this.f12217a.hashCode();
        }

        public final String toString() {
            return a.h("Disclaimer(text=", this.f12217a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$ListDetails;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListDetails {

        /* renamed from: a, reason: collision with root package name */
        public final Total f12218a;
        public final List b;

        public ListDetails(Total total, List list) {
            this.f12218a = total;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListDetails)) {
                return false;
            }
            ListDetails listDetails = (ListDetails) obj;
            return Intrinsics.c(this.f12218a, listDetails.f12218a) && Intrinsics.c(this.b, listDetails.b);
        }

        public final int hashCode() {
            Total total = this.f12218a;
            int iHashCode = (total == null ? 0 : total.hashCode()) * 31;
            List list = this.b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "ListDetails(total=" + this.f12218a + ", productActions=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$OnListDetailsPotentialSavings;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnListDetailsPotentialSavings {

        /* renamed from: a, reason: collision with root package name */
        public final String f12219a;
        public final String b;

        public OnListDetailsPotentialSavings(String str, String str2) {
            this.f12219a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnListDetailsPotentialSavings)) {
                return false;
            }
            OnListDetailsPotentialSavings onListDetailsPotentialSavings = (OnListDetailsPotentialSavings) obj;
            return Intrinsics.c(this.f12219a, onListDetailsPotentialSavings.f12219a) && Intrinsics.c(this.b, onListDetailsPotentialSavings.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12219a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnListDetailsPotentialSavings(label=", this.f12219a, ", value=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$OnListDetailsRewardsSummary;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnListDetailsRewardsSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f12220a;
        public final String b;
        public final String c;

        public OnListDetailsRewardsSummary(String str, String str2, String str3) {
            this.f12220a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnListDetailsRewardsSummary)) {
                return false;
            }
            OnListDetailsRewardsSummary onListDetailsRewardsSummary = (OnListDetailsRewardsSummary) obj;
            return Intrinsics.c(this.f12220a, onListDetailsRewardsSummary.f12220a) && Intrinsics.c(this.b, onListDetailsRewardsSummary.b) && Intrinsics.c(this.c, onListDetailsRewardsSummary.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f12220a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("OnListDetailsRewardsSummary(label=", this.f12220a, ", value=", this.b, ", imageUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$OnListDetailsTotalSectionHeader;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnListDetailsTotalSectionHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f12221a;
        public final String b;

        public OnListDetailsTotalSectionHeader(String str, String str2) {
            this.f12221a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnListDetailsTotalSectionHeader)) {
                return false;
            }
            OnListDetailsTotalSectionHeader onListDetailsTotalSectionHeader = (OnListDetailsTotalSectionHeader) obj;
            return Intrinsics.c(this.f12221a, onListDetailsTotalSectionHeader.f12221a) && Intrinsics.c(this.b, onListDetailsTotalSectionHeader.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12221a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnListDetailsTotalSectionHeader(label=", this.f12221a, ", value=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$Overview;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Overview {

        /* renamed from: a, reason: collision with root package name */
        public final String f12222a;
        public final String b;
        public final String c;

        public Overview(String str, String str2, String str3) {
            this.f12222a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Overview)) {
                return false;
            }
            Overview overview = (Overview) obj;
            return Intrinsics.c(this.f12222a, overview.f12222a) && Intrinsics.c(this.b, overview.b) && Intrinsics.c(this.c, overview.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f12222a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Overview(label=", this.f12222a, ", value=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$ProductAction;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f12223a;
        public final String b;
        public final String c;

        public ProductAction(String str, String str2, String str3) {
            this.f12223a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductAction)) {
                return false;
            }
            ProductAction productAction = (ProductAction) obj;
            return Intrinsics.c(this.f12223a, productAction.f12223a) && Intrinsics.c(this.b, productAction.b) && Intrinsics.c(this.c, productAction.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f12223a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("ProductAction(productId=", this.f12223a, ", action=", this.b, ", label="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$Section;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f12224a;
        public final OnListDetailsTotalSectionHeader b;
        public final OnListDetailsPotentialSavings c;
        public final OnListDetailsRewardsSummary d;

        public Section(String __typename, OnListDetailsTotalSectionHeader onListDetailsTotalSectionHeader, OnListDetailsPotentialSavings onListDetailsPotentialSavings, OnListDetailsRewardsSummary onListDetailsRewardsSummary) {
            Intrinsics.h(__typename, "__typename");
            this.f12224a = __typename;
            this.b = onListDetailsTotalSectionHeader;
            this.c = onListDetailsPotentialSavings;
            this.d = onListDetailsRewardsSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f12224a, section.f12224a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c) && Intrinsics.c(this.d, section.d);
        }

        public final int hashCode() {
            int iHashCode = this.f12224a.hashCode() * 31;
            OnListDetailsTotalSectionHeader onListDetailsTotalSectionHeader = this.b;
            int iHashCode2 = (iHashCode + (onListDetailsTotalSectionHeader == null ? 0 : onListDetailsTotalSectionHeader.hashCode())) * 31;
            OnListDetailsPotentialSavings onListDetailsPotentialSavings = this.c;
            int iHashCode3 = (iHashCode2 + (onListDetailsPotentialSavings == null ? 0 : onListDetailsPotentialSavings.hashCode())) * 31;
            OnListDetailsRewardsSummary onListDetailsRewardsSummary = this.d;
            return iHashCode3 + (onListDetailsRewardsSummary != null ? onListDetailsRewardsSummary.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f12224a + ", onListDetailsTotalSectionHeader=" + this.b + ", onListDetailsPotentialSavings=" + this.c + ", onListDetailsRewardsSummary=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$Summary;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Summary {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12225a;

        public Summary(ArrayList arrayList) {
            this.f12225a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Summary) && this.f12225a.equals(((Summary) obj).f12225a);
        }

        public final int hashCode() {
            return this.f12225a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("Summary(sections=", ")", this.f12225a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ListDetailsQuery$Total;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Total {

        /* renamed from: a, reason: collision with root package name */
        public final Summary f12226a;
        public final Disclaimer b;
        public final Overview c;

        public Total(Summary summary, Disclaimer disclaimer, Overview overview) {
            this.f12226a = summary;
            this.b = disclaimer;
            this.c = overview;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Total)) {
                return false;
            }
            Total total = (Total) obj;
            return Intrinsics.c(this.f12226a, total.f12226a) && Intrinsics.c(this.b, total.b) && Intrinsics.c(this.c, total.c);
        }

        public final int hashCode() {
            Summary summary = this.f12226a;
            int iHashCode = (summary == null ? 0 : summary.f12225a.hashCode()) * 31;
            Disclaimer disclaimer = this.b;
            int iHashCode2 = (iHashCode + (disclaimer == null ? 0 : disclaimer.f12217a.hashCode())) * 31;
            Overview overview = this.c;
            return iHashCode2 + (overview != null ? overview.hashCode() : 0);
        }

        public final String toString() {
            return "Total(summary=" + this.f12226a + ", disclaimer=" + this.b + ", overview=" + this.c + ")";
        }
    }

    public ListDetailsQuery(ListDetailsInput listDetailsInput) {
        this.f12215a = listDetailsInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ListDetailsQuery_ResponseAdapter.Data.f12235a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ListDetails($listDetailsInput: ListDetailsInput!) { listDetails(listDetailsInput: $listDetailsInput) { total { summary { sections { __typename ... on ListDetailsTotalSectionHeader { label value } ... on ListDetailsPotentialSavings { label value } ... on ListDetailsRewardsSummary { label value imageUrl } } } disclaimer { text } overview { label value altText } } productActions { productId action label } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListDetailsQuery) && Intrinsics.c(this.f12215a, ((ListDetailsQuery) obj).f12215a);
    }

    public final int hashCode() {
        return this.f12215a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "489e6b702b230b3d9faf8d808fc079272ec227210b4ad85ea92cd944b32f7162";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ListDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("listDetailsInput");
        Adapters.c(ListDetailsInput_InputAdapter.f12082a, false).toJson(jsonWriter, customScalarAdapters, this.f12215a);
    }

    public final String toString() {
        return "ListDetailsQuery(listDetailsInput=" + this.f12215a + ")";
    }
}
