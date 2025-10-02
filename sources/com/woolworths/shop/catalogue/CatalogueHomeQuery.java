package com.woolworths.shop.catalogue;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.CatalogueHomeCardTrackingValidity;
import au.com.woolworths.shop.graphql.type.CatalogueHomeSaleFinderStore;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.adapter.CatalogueHomeSaleFinderStore_InputAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.catalogue.adapter.CatalogueHomeQuery_ResponseAdapter;
import com.woolworths.shop.catalogue.fragment.CatalogueButton;
import com.woolworths.shop.catalogue.fragment.CatalogueHomeCard;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\r\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Data;", "Data", "CatalogueHome", "Item", "OnCatalogueHomeChangeStore", "Button", "OnCatalogueHomeCatalogueCard", "SneakPeek", "Tracking", "OnCatalogueHomeSpecialsCard", "OnCatalogueHomeTermsAndConditions", "Button1", "Term", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueHomeQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional.Present f21651a;
    public final ShoppingModeType b;
    public final CatalogueHomeSaleFinderStore c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Button;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f21652a;
        public final CatalogueButton b;

        public Button(String str, CatalogueButton catalogueButton) {
            this.f21652a = str;
            this.b = catalogueButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f21652a, button.f21652a) && Intrinsics.c(this.b, button.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21652a.hashCode() * 31);
        }

        public final String toString() {
            return "Button(__typename=" + this.f21652a + ", catalogueButton=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Button1;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21653a;
        public final CatalogueButton b;

        public Button1(String str, CatalogueButton catalogueButton) {
            this.f21653a = str;
            this.b = catalogueButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button1)) {
                return false;
            }
            Button1 button1 = (Button1) obj;
            return Intrinsics.c(this.f21653a, button1.f21653a) && Intrinsics.c(this.b, button1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21653a.hashCode() * 31);
        }

        public final String toString() {
            return "Button1(__typename=" + this.f21653a + ", catalogueButton=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$CatalogueHome;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CatalogueHome {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f21654a;

        public CatalogueHome(ArrayList arrayList) {
            this.f21654a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CatalogueHome) && this.f21654a.equals(((CatalogueHome) obj).f21654a);
        }

        public final int hashCode() {
            return this.f21654a.hashCode();
        }

        public final String toString() {
            return a.k("CatalogueHome(items=", ")", this.f21654a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CatalogueHome f21655a;

        public Data(CatalogueHome catalogueHome) {
            this.f21655a = catalogueHome;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21655a, ((Data) obj).f21655a);
        }

        public final int hashCode() {
            CatalogueHome catalogueHome = this.f21655a;
            if (catalogueHome == null) {
                return 0;
            }
            return catalogueHome.f21654a.hashCode();
        }

        public final String toString() {
            return "Data(catalogueHome=" + this.f21655a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Item;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21656a;
        public final OnCatalogueHomeChangeStore b;
        public final OnCatalogueHomeCatalogueCard c;
        public final OnCatalogueHomeSpecialsCard d;
        public final OnCatalogueHomeTermsAndConditions e;

        public Item(String __typename, OnCatalogueHomeChangeStore onCatalogueHomeChangeStore, OnCatalogueHomeCatalogueCard onCatalogueHomeCatalogueCard, OnCatalogueHomeSpecialsCard onCatalogueHomeSpecialsCard, OnCatalogueHomeTermsAndConditions onCatalogueHomeTermsAndConditions) {
            Intrinsics.h(__typename, "__typename");
            this.f21656a = __typename;
            this.b = onCatalogueHomeChangeStore;
            this.c = onCatalogueHomeCatalogueCard;
            this.d = onCatalogueHomeSpecialsCard;
            this.e = onCatalogueHomeTermsAndConditions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21656a, item.f21656a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e);
        }

        public final int hashCode() {
            int iHashCode = this.f21656a.hashCode() * 31;
            OnCatalogueHomeChangeStore onCatalogueHomeChangeStore = this.b;
            int iHashCode2 = (iHashCode + (onCatalogueHomeChangeStore == null ? 0 : onCatalogueHomeChangeStore.hashCode())) * 31;
            OnCatalogueHomeCatalogueCard onCatalogueHomeCatalogueCard = this.c;
            int iHashCode3 = (iHashCode2 + (onCatalogueHomeCatalogueCard == null ? 0 : onCatalogueHomeCatalogueCard.hashCode())) * 31;
            OnCatalogueHomeSpecialsCard onCatalogueHomeSpecialsCard = this.d;
            int iHashCode4 = (iHashCode3 + (onCatalogueHomeSpecialsCard == null ? 0 : onCatalogueHomeSpecialsCard.hashCode())) * 31;
            OnCatalogueHomeTermsAndConditions onCatalogueHomeTermsAndConditions = this.e;
            return iHashCode4 + (onCatalogueHomeTermsAndConditions != null ? onCatalogueHomeTermsAndConditions.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f21656a + ", onCatalogueHomeChangeStore=" + this.b + ", onCatalogueHomeCatalogueCard=" + this.c + ", onCatalogueHomeSpecialsCard=" + this.d + ", onCatalogueHomeTermsAndConditions=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$OnCatalogueHomeCatalogueCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueHomeCatalogueCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21657a;
        public final String b;
        public final String c;
        public final SneakPeek d;
        public final Tracking e;
        public final CatalogueHomeCard f;

        public OnCatalogueHomeCatalogueCard(String str, String str2, String str3, SneakPeek sneakPeek, Tracking tracking, CatalogueHomeCard catalogueHomeCard) {
            this.f21657a = str;
            this.b = str2;
            this.c = str3;
            this.d = sneakPeek;
            this.e = tracking;
            this.f = catalogueHomeCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueHomeCatalogueCard)) {
                return false;
            }
            OnCatalogueHomeCatalogueCard onCatalogueHomeCatalogueCard = (OnCatalogueHomeCatalogueCard) obj;
            return Intrinsics.c(this.f21657a, onCatalogueHomeCatalogueCard.f21657a) && Intrinsics.c(this.b, onCatalogueHomeCatalogueCard.b) && Intrinsics.c(this.c, onCatalogueHomeCatalogueCard.c) && Intrinsics.c(this.d, onCatalogueHomeCatalogueCard.d) && Intrinsics.c(this.e, onCatalogueHomeCatalogueCard.e) && Intrinsics.c(this.f, onCatalogueHomeCatalogueCard.f);
        }

        public final int hashCode() {
            int iC = b.c(this.f21657a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            SneakPeek sneakPeek = this.d;
            return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (sneakPeek != null ? sneakPeek.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnCatalogueHomeCatalogueCard(__typename=", this.f21657a, ", dateDisplay=", this.b, ", pagePath=");
            sbV.append(this.c);
            sbV.append(", sneakPeek=");
            sbV.append(this.d);
            sbV.append(", tracking=");
            sbV.append(this.e);
            sbV.append(", catalogueHomeCard=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$OnCatalogueHomeChangeStore;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueHomeChangeStore {

        /* renamed from: a, reason: collision with root package name */
        public final String f21658a;
        public final String b;
        public final Button c;

        public OnCatalogueHomeChangeStore(String str, String str2, Button button) {
            this.f21658a = str;
            this.b = str2;
            this.c = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueHomeChangeStore)) {
                return false;
            }
            OnCatalogueHomeChangeStore onCatalogueHomeChangeStore = (OnCatalogueHomeChangeStore) obj;
            return Intrinsics.c(this.f21658a, onCatalogueHomeChangeStore.f21658a) && Intrinsics.c(this.b, onCatalogueHomeChangeStore.b) && Intrinsics.c(this.c, onCatalogueHomeChangeStore.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21658a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnCatalogueHomeChangeStore(storeName=", this.f21658a, ", postCode=", this.b, ", button=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$OnCatalogueHomeSpecialsCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueHomeSpecialsCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21659a;
        public final CatalogueHomeCard b;

        public OnCatalogueHomeSpecialsCard(String str, CatalogueHomeCard catalogueHomeCard) {
            this.f21659a = str;
            this.b = catalogueHomeCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueHomeSpecialsCard)) {
                return false;
            }
            OnCatalogueHomeSpecialsCard onCatalogueHomeSpecialsCard = (OnCatalogueHomeSpecialsCard) obj;
            return Intrinsics.c(this.f21659a, onCatalogueHomeSpecialsCard.f21659a) && Intrinsics.c(this.b, onCatalogueHomeSpecialsCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21659a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCatalogueHomeSpecialsCard(__typename=" + this.f21659a + ", catalogueHomeCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$OnCatalogueHomeTermsAndConditions;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueHomeTermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final Button1 f21660a;
        public final ArrayList b;

        public OnCatalogueHomeTermsAndConditions(Button1 button1, ArrayList arrayList) {
            this.f21660a = button1;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueHomeTermsAndConditions)) {
                return false;
            }
            OnCatalogueHomeTermsAndConditions onCatalogueHomeTermsAndConditions = (OnCatalogueHomeTermsAndConditions) obj;
            return this.f21660a.equals(onCatalogueHomeTermsAndConditions.f21660a) && this.b.equals(onCatalogueHomeTermsAndConditions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21660a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCatalogueHomeTermsAndConditions(button=" + this.f21660a + ", terms=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$SneakPeek;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SneakPeek {

        /* renamed from: a, reason: collision with root package name */
        public final String f21661a;
        public final String b;
        public final String c;

        public SneakPeek(String str, String str2, String str3) {
            this.f21661a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SneakPeek)) {
                return false;
            }
            SneakPeek sneakPeek = (SneakPeek) obj;
            return Intrinsics.c(this.f21661a, sneakPeek.f21661a) && Intrinsics.c(this.b, sneakPeek.b) && Intrinsics.c(this.c, sneakPeek.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21661a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("SneakPeek(title=", this.f21661a, ", subtitle=", this.b, ", dateDisplay="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Term;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Term {

        /* renamed from: a, reason: collision with root package name */
        public final String f21662a;
        public final String b;

        public Term(String str, String str2) {
            this.f21662a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Term)) {
                return false;
            }
            Term term = (Term) obj;
            return Intrinsics.c(this.f21662a, term.f21662a) && Intrinsics.c(this.b, term.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21662a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Term(title=", this.f21662a, ", body=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/CatalogueHomeQuery$Tracking;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tracking {

        /* renamed from: a, reason: collision with root package name */
        public final String f21663a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final CatalogueHomeCardTrackingValidity h;

        public Tracking(String str, String str2, String str3, String str4, String str5, String str6, String str7, CatalogueHomeCardTrackingValidity catalogueHomeCardTrackingValidity) {
            this.f21663a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = catalogueHomeCardTrackingValidity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tracking)) {
                return false;
            }
            Tracking tracking = (Tracking) obj;
            return Intrinsics.c(this.f21663a, tracking.f21663a) && Intrinsics.c(this.b, tracking.b) && Intrinsics.c(this.c, tracking.c) && Intrinsics.c(this.d, tracking.d) && Intrinsics.c(this.e, tracking.e) && Intrinsics.c(this.f, tracking.f) && Intrinsics.c(this.g, tracking.g) && this.h == tracking.h;
        }

        public final int hashCode() {
            return this.h.hashCode() + b.c(b.c(b.c(b.c(b.c(b.c(this.f21663a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Tracking(id=", this.f21663a, ", postCode=", this.b, ", endDate=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", publishDate=", this.d, ", startDate=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", state=", this.f, ", type=");
            sbV.append(this.g);
            sbV.append(", validity=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    public CatalogueHomeQuery(Optional.Present present, ShoppingModeType shoppingModeType, CatalogueHomeSaleFinderStore catalogueHomeSaleFinderStore) {
        this.f21651a = present;
        this.b = shoppingModeType;
        this.c = catalogueHomeSaleFinderStore;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CatalogueHomeQuery_ResponseAdapter.Data.f21707a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CatalogueHome($storeId: String, $shoppingMode: ShoppingModeType!, $catalogueHomeSaleFinderStore: CatalogueHomeSaleFinderStore!) { catalogueHome(storeId: $storeId, mode: $shoppingMode, catalogueHomeSaleFinderStore: $catalogueHomeSaleFinderStore) { items { __typename ... on CatalogueHomeChangeStore { storeName postCode button { __typename ...catalogueButton } } ... on CatalogueHomeCatalogueCard { __typename ...catalogueHomeCard dateDisplay pagePath sneakPeek { title subtitle dateDisplay } tracking { id postCode endDate publishDate startDate state type validity } } ... on CatalogueHomeSpecialsCard { __typename ...catalogueHomeCard } ... on CatalogueHomeTermsAndConditions { button { __typename ...catalogueButton } terms { title body } } } } }  fragment catalogueButton on Button { label action style enabled }  fragment catalogueHomeCard on CatalogueHomeCard { id image title }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueHomeQuery)) {
            return false;
        }
        CatalogueHomeQuery catalogueHomeQuery = (CatalogueHomeQuery) obj;
        return this.f21651a.equals(catalogueHomeQuery.f21651a) && this.b == catalogueHomeQuery.b && this.c.equals(catalogueHomeQuery.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f21651a.hashCode() * 31)) * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "acf55223421a82195e662d2843fbb0116cd4f514adb420ba4c169764cf869bea";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CatalogueHome";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("storeId");
        Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, this.f21651a);
        jsonWriter.F1("shoppingMode");
        ShoppingModeType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
        jsonWriter.F1("catalogueHomeSaleFinderStore");
        Adapters.c(CatalogueHomeSaleFinderStore_InputAdapter.f12047a, false).toJson(jsonWriter, customScalarAdapters, this.c);
    }

    public final String toString() {
        return "CatalogueHomeQuery(storeId=" + this.f21651a + ", shoppingMode=" + this.b + ", catalogueHomeSaleFinderStore=" + this.c + ")";
    }
}
