package com.woolworths.shop.freshmag;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.freshmag.adapter.FreshMagHomeQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$Data;", "Data", "FreshMagHome", "Item", "OnFreshMagSummary", "OnHorizontalList", "Item1", "OnRecipeSummaryCard", "OnRecipeMoreCard", "ActionMetadatum", "OnRecipeTagList", "OnRecipeSource", "Companion", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FreshMagHomeQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f22712a = Optional.Absent.f13523a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$ActionMetadatum;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionMetadatum {

        /* renamed from: a, reason: collision with root package name */
        public final String f22713a;
        public final OnRecipeTagList b;
        public final OnRecipeSource c;

        public ActionMetadatum(String __typename, OnRecipeTagList onRecipeTagList, OnRecipeSource onRecipeSource) {
            Intrinsics.h(__typename, "__typename");
            this.f22713a = __typename;
            this.b = onRecipeTagList;
            this.c = onRecipeSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionMetadatum)) {
                return false;
            }
            ActionMetadatum actionMetadatum = (ActionMetadatum) obj;
            return Intrinsics.c(this.f22713a, actionMetadatum.f22713a) && Intrinsics.c(this.b, actionMetadatum.b) && Intrinsics.c(this.c, actionMetadatum.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22713a.hashCode() * 31;
            OnRecipeTagList onRecipeTagList = this.b;
            int iHashCode2 = (iHashCode + (onRecipeTagList == null ? 0 : onRecipeTagList.f22723a.hashCode())) * 31;
            OnRecipeSource onRecipeSource = this.c;
            return iHashCode2 + (onRecipeSource != null ? onRecipeSource.f22721a.hashCode() : 0);
        }

        public final String toString() {
            return "ActionMetadatum(__typename=" + this.f22713a + ", onRecipeTagList=" + this.b + ", onRecipeSource=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final FreshMagHome f22714a;

        public Data(FreshMagHome freshMagHome) {
            this.f22714a = freshMagHome;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22714a, ((Data) obj).f22714a);
        }

        public final int hashCode() {
            FreshMagHome freshMagHome = this.f22714a;
            if (freshMagHome == null) {
                return 0;
            }
            return freshMagHome.f22715a.hashCode();
        }

        public final String toString() {
            return "Data(freshMagHome=" + this.f22714a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$FreshMagHome;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FreshMagHome {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22715a;

        public FreshMagHome(ArrayList arrayList) {
            this.f22715a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FreshMagHome) && this.f22715a.equals(((FreshMagHome) obj).f22715a);
        }

        public final int hashCode() {
            return this.f22715a.hashCode();
        }

        public final String toString() {
            return a.k("FreshMagHome(items=", ")", this.f22715a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$Item;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f22716a;
        public final OnFreshMagSummary b;
        public final OnHorizontalList c;

        public Item(String __typename, OnFreshMagSummary onFreshMagSummary, OnHorizontalList onHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            this.f22716a = __typename;
            this.b = onFreshMagSummary;
            this.c = onHorizontalList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f22716a, item.f22716a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22716a.hashCode() * 31;
            OnFreshMagSummary onFreshMagSummary = this.b;
            int iHashCode2 = (iHashCode + (onFreshMagSummary == null ? 0 : onFreshMagSummary.hashCode())) * 31;
            OnHorizontalList onHorizontalList = this.c;
            return iHashCode2 + (onHorizontalList != null ? onHorizontalList.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f22716a + ", onFreshMagSummary=" + this.b + ", onHorizontalList=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$Item1;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22717a;
        public final OnRecipeSummaryCard b;
        public final OnRecipeMoreCard c;

        public Item1(String __typename, OnRecipeSummaryCard onRecipeSummaryCard, OnRecipeMoreCard onRecipeMoreCard) {
            Intrinsics.h(__typename, "__typename");
            this.f22717a = __typename;
            this.b = onRecipeSummaryCard;
            this.c = onRecipeMoreCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f22717a, item1.f22717a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22717a.hashCode() * 31;
            OnRecipeSummaryCard onRecipeSummaryCard = this.b;
            int iHashCode2 = (iHashCode + (onRecipeSummaryCard == null ? 0 : onRecipeSummaryCard.hashCode())) * 31;
            OnRecipeMoreCard onRecipeMoreCard = this.c;
            return iHashCode2 + (onRecipeMoreCard != null ? onRecipeMoreCard.f22720a.hashCode() : 0);
        }

        public final String toString() {
            return "Item1(__typename=" + this.f22717a + ", onRecipeSummaryCard=" + this.b + ", onRecipeMoreCard=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnFreshMagSummary;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFreshMagSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f22718a;
        public final String b;
        public final String c;
        public final String d;

        public OnFreshMagSummary(String str, String str2, String str3, String str4) {
            this.f22718a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFreshMagSummary)) {
                return false;
            }
            OnFreshMagSummary onFreshMagSummary = (OnFreshMagSummary) obj;
            return Intrinsics.c(this.f22718a, onFreshMagSummary.f22718a) && Intrinsics.c(this.b, onFreshMagSummary.b) && Intrinsics.c(this.c, onFreshMagSummary.c) && Intrinsics.c(this.d, onFreshMagSummary.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f22718a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(YU.a.v("OnFreshMagSummary(coverImageUrl=", this.f22718a, ", description=", this.b, ", magazineId="), this.c, ", buttonTitle=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnHorizontalList;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f22719a;
        public final String b;
        public final ArrayList c;
        public final String d;
        public final String e;

        public OnHorizontalList(String str, String str2, String str3, String str4, ArrayList arrayList) {
            this.f22719a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalList)) {
                return false;
            }
            OnHorizontalList onHorizontalList = (OnHorizontalList) obj;
            return this.f22719a.equals(onHorizontalList.f22719a) && Intrinsics.c(this.b, onHorizontalList.b) && this.c.equals(onHorizontalList.c) && Intrinsics.c(this.d, onHorizontalList.d) && Intrinsics.c(this.e, onHorizontalList.e);
        }

        public final int hashCode() {
            int iHashCode = this.f22719a.hashCode() * 31;
            String str = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            String str2 = this.d;
            int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnHorizontalList(title=", this.f22719a, ", subtitle=", this.b, ", items=");
            sbV.append(this.c);
            sbV.append(", actionTitle=");
            sbV.append(this.d);
            sbV.append(", deepLink=");
            return YU.a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnRecipeMoreCard;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeMoreCard {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22720a;

        public OnRecipeMoreCard(ArrayList arrayList) {
            this.f22720a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeMoreCard) && this.f22720a.equals(((OnRecipeMoreCard) obj).f22720a);
        }

        public final int hashCode() {
            return this.f22720a.hashCode();
        }

        public final String toString() {
            return a.k("OnRecipeMoreCard(actionMetadata=", ")", this.f22720a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnRecipeSource;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSource {

        /* renamed from: a, reason: collision with root package name */
        public final String f22721a;

        public OnRecipeSource(String str) {
            this.f22721a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeSource) && Intrinsics.c(this.f22721a, ((OnRecipeSource) obj).f22721a);
        }

        public final int hashCode() {
            return this.f22721a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnRecipeSource(source=", this.f22721a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnRecipeSummaryCard;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSummaryCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22722a;
        public final RecipeSummaryCardFragment b;

        public OnRecipeSummaryCard(String str, RecipeSummaryCardFragment recipeSummaryCardFragment) {
            this.f22722a = str;
            this.b = recipeSummaryCardFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRecipeSummaryCard)) {
                return false;
            }
            OnRecipeSummaryCard onRecipeSummaryCard = (OnRecipeSummaryCard) obj;
            return Intrinsics.c(this.f22722a, onRecipeSummaryCard.f22722a) && Intrinsics.c(this.b, onRecipeSummaryCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22722a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRecipeSummaryCard(__typename=" + this.f22722a + ", recipeSummaryCardFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/freshmag/FreshMagHomeQuery$OnRecipeTagList;", "", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeTagList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22723a;

        public OnRecipeTagList(ArrayList arrayList) {
            this.f22723a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeTagList) && this.f22723a.equals(((OnRecipeTagList) obj).f22723a);
        }

        public final int hashCode() {
            return this.f22723a.hashCode();
        }

        public final String toString() {
            return a.k("OnRecipeTagList(tags=", ")", this.f22723a);
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(FreshMagHomeQuery_ResponseAdapter.Data.f22725a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query FreshMagHome($isVideoTagOnRecipeCardEnabled: Boolean! = false ) { freshMagHome { items { __typename ... on FreshMagSummary { coverImageUrl description magazineId buttonTitle } ... on HorizontalList { title subtitle items { __typename ... on RecipeSummaryCard { __typename ...recipeSummaryCardFragment } ... on RecipeMoreCard { actionMetadata { __typename ... on RecipeTagList { tags } ... on RecipeSource { source } } } } actionTitle deepLink } } } }  fragment recipeSummaryCardFragment on RecipeSummaryCard { title image id tags sourceName isVideoAvailable @include(if: $isVideoTagOnRecipeCardEnabled) recipePrepDuration { duration altText } recipeCookDuration { duration altText } recipeCostPerServe { recipeCostPerServePrice } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FreshMagHomeQuery) && Intrinsics.c(this.f22712a, ((FreshMagHomeQuery) obj).f22712a);
    }

    public final int hashCode() {
        return this.f22712a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "1fd808057b58ef5adf82c8f3de63b52c7fd3e94fe61bfe412ff98ea5da6ee1a8";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "FreshMagHome";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f22712a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        return "FreshMagHomeQuery(isVideoTagOnRecipeCardEnabled=" + this.f22712a + ")";
    }
}
