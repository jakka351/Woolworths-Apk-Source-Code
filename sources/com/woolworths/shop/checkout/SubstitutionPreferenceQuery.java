package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.SubstitutionPreferenceInput;
import au.com.woolworths.shop.graphql.type.adapter.SubstitutionPreferenceInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.SubstitutionPreferenceQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000e\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Data;", "Data", "SubstitutionPreference", "ProductToBeSubstituteSection", "CheaperSubstitutesSection", "Banner", "SubstitutionPreferenceOptionsSection", "InsetBanner", "Action", "Item", "ProductSubstitutesSection", "Substitution", "SubstitutionPreferenceFooter", "Button", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SubstitutionPreferenceQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final SubstitutionPreferenceInput f21895a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Action;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f21896a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f21896a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f21896a == action.f21896a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f21896a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f21896a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Banner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21897a;
        public final String b;
        public final BroadcastBannerType c;
        public final String d;
        public final Boolean e;
        public final String f;
        public final String g;

        public Banner(BroadcastBannerType broadcastBannerType, Boolean bool, String str, String str2, String str3, String str4, String str5) {
            this.f21897a = str;
            this.b = str2;
            this.c = broadcastBannerType;
            this.d = str3;
            this.e = bool;
            this.f = str4;
            this.g = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return Intrinsics.c(this.f21897a, banner.f21897a) && Intrinsics.c(this.b, banner.b) && this.c == banner.c && Intrinsics.c(this.d, banner.d) && Intrinsics.c(this.e, banner.e) && Intrinsics.c(this.f, banner.f) && Intrinsics.c(this.g, banner.g);
        }

        public final int hashCode() {
            int iHashCode = this.f21897a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
            Boolean bool = this.e;
            int iHashCode2 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Banner(title=", this.f21897a, ", subtitle=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", imageUrl=");
            sbV.append(this.d);
            sbV.append(", dismissible=");
            sbV.append(this.e);
            sbV.append(", bannerId=");
            sbV.append(this.f);
            sbV.append(", analyticsLabel=");
            return YU.a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Button;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f21898a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;

        public Button(String str, String str2, ButtonStyle buttonStyle, boolean z) {
            this.f21898a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f21898a, button.f21898a) && Intrinsics.c(this.b, button.b) && this.c == button.c && this.d == button.d;
        }

        public final int hashCode() {
            int iHashCode = this.f21898a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonStyle buttonStyle = this.c;
            return Boolean.hashCode(this.d) + ((iHashCode2 + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.n(YU.a.v("Button(label=", this.f21898a, ", action=", this.b, ", style="), this.c, ", enabled=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$CheaperSubstitutesSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheaperSubstitutesSection {

        /* renamed from: a, reason: collision with root package name */
        public final Banner f21899a;

        public CheaperSubstitutesSection(Banner banner) {
            this.f21899a = banner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheaperSubstitutesSection) && Intrinsics.c(this.f21899a, ((CheaperSubstitutesSection) obj).f21899a);
        }

        public final int hashCode() {
            return this.f21899a.hashCode();
        }

        public final String toString() {
            return "CheaperSubstitutesSection(banner=" + this.f21899a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final SubstitutionPreference f21900a;

        public Data(SubstitutionPreference substitutionPreference) {
            this.f21900a = substitutionPreference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21900a, ((Data) obj).f21900a);
        }

        public final int hashCode() {
            return this.f21900a.hashCode();
        }

        public final String toString() {
            return "Data(substitutionPreference=" + this.f21900a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$InsetBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21901a;
        public final InsetBannerDisplayType b;
        public final Action c;

        public InsetBanner(String str, InsetBannerDisplayType insetBannerDisplayType, Action action) {
            this.f21901a = str;
            this.b = insetBannerDisplayType;
            this.c = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetBanner)) {
                return false;
            }
            InsetBanner insetBanner = (InsetBanner) obj;
            return Intrinsics.c(this.f21901a, insetBanner.f21901a) && this.b == insetBanner.b && Intrinsics.c(this.c, insetBanner.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f21901a.hashCode() * 31)) * 31;
            Action action = this.c;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        public final String toString() {
            return "InsetBanner(message=" + this.f21901a + ", displayType=" + this.b + ", action=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Item;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21902a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final boolean f;

        public Item(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
            this.f21902a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
            this.e = str3;
            this.f = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21902a, item.f21902a) && Intrinsics.c(this.b, item.b) && this.c == item.c && this.d == item.d && Intrinsics.c(this.e, item.e) && this.f == item.f;
        }

        public final int hashCode() {
            int iE = b.e(b.e(b.c(this.f21902a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            return Boolean.hashCode(this.f) + ((iE + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Item(id=", this.f21902a, ", title=", this.b, ", isSelected=");
            au.com.woolworths.android.onesite.a.D(sbV, this.c, ", isEnabled=", this.d, ", description=");
            return d.r(this.e, ", showProducts=", ")", sbV, this.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$ProductSubstitutesSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductSubstitutesSection {

        /* renamed from: a, reason: collision with root package name */
        public final List f21903a;

        public ProductSubstitutesSection(List list) {
            this.f21903a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductSubstitutesSection) && Intrinsics.c(this.f21903a, ((ProductSubstitutesSection) obj).f21903a);
        }

        public final int hashCode() {
            List list = this.f21903a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.l("ProductSubstitutesSection(substitutions=", ")", this.f21903a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$ProductToBeSubstituteSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductToBeSubstituteSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f21904a;
        public final String b;
        public final String c;

        public ProductToBeSubstituteSection(String str, String str2, String str3) {
            this.f21904a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductToBeSubstituteSection)) {
                return false;
            }
            ProductToBeSubstituteSection productToBeSubstituteSection = (ProductToBeSubstituteSection) obj;
            return Intrinsics.c(this.f21904a, productToBeSubstituteSection.f21904a) && Intrinsics.c(this.b, productToBeSubstituteSection.b) && Intrinsics.c(this.c, productToBeSubstituteSection.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21904a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("ProductToBeSubstituteSection(name=", this.f21904a, ", productId=", this.b, ", imageUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$Substitution;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Substitution {

        /* renamed from: a, reason: collision with root package name */
        public final String f21905a;
        public final double b;
        public final String c;
        public final String d;
        public final boolean e;

        public Substitution(double d, String str, String str2, String str3, boolean z) {
            this.f21905a = str;
            this.b = d;
            this.c = str2;
            this.d = str3;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Substitution)) {
                return false;
            }
            Substitution substitution = (Substitution) obj;
            return Intrinsics.c(this.f21905a, substitution.f21905a) && Double.compare(this.b, substitution.b) == 0 && Intrinsics.c(this.c, substitution.c) && Intrinsics.c(this.d, substitution.d) && this.e == substitution.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + b.c(b.c(android.support.v4.media.session.a.a(this.b, this.f21905a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "Substitution(name=", this.f21905a, ", quantity=");
            a.B(sbR, ", productId=", this.c, ", imageUrl=", this.d);
            sbR.append(", isSelected=");
            sbR.append(this.e);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$SubstitutionPreference;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubstitutionPreference {

        /* renamed from: a, reason: collision with root package name */
        public final ProductToBeSubstituteSection f21906a;
        public final CheaperSubstitutesSection b;
        public final SubstitutionPreferenceOptionsSection c;
        public final ProductSubstitutesSection d;
        public final SubstitutionPreferenceFooter e;

        public SubstitutionPreference(ProductToBeSubstituteSection productToBeSubstituteSection, CheaperSubstitutesSection cheaperSubstitutesSection, SubstitutionPreferenceOptionsSection substitutionPreferenceOptionsSection, ProductSubstitutesSection productSubstitutesSection, SubstitutionPreferenceFooter substitutionPreferenceFooter) {
            this.f21906a = productToBeSubstituteSection;
            this.b = cheaperSubstitutesSection;
            this.c = substitutionPreferenceOptionsSection;
            this.d = productSubstitutesSection;
            this.e = substitutionPreferenceFooter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubstitutionPreference)) {
                return false;
            }
            SubstitutionPreference substitutionPreference = (SubstitutionPreference) obj;
            return Intrinsics.c(this.f21906a, substitutionPreference.f21906a) && Intrinsics.c(this.b, substitutionPreference.b) && Intrinsics.c(this.c, substitutionPreference.c) && Intrinsics.c(this.d, substitutionPreference.d) && Intrinsics.c(this.e, substitutionPreference.e);
        }

        public final int hashCode() {
            return this.e.f21907a.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.f21899a.hashCode() + (this.f21906a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "SubstitutionPreference(productToBeSubstituteSection=" + this.f21906a + ", cheaperSubstitutesSection=" + this.b + ", substitutionPreferenceOptionsSection=" + this.c + ", productSubstitutesSection=" + this.d + ", substitutionPreferenceFooter=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$SubstitutionPreferenceFooter;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubstitutionPreferenceFooter {

        /* renamed from: a, reason: collision with root package name */
        public final Button f21907a;

        public SubstitutionPreferenceFooter(Button button) {
            this.f21907a = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubstitutionPreferenceFooter) && Intrinsics.c(this.f21907a, ((SubstitutionPreferenceFooter) obj).f21907a);
        }

        public final int hashCode() {
            return this.f21907a.hashCode();
        }

        public final String toString() {
            return "SubstitutionPreferenceFooter(button=" + this.f21907a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/SubstitutionPreferenceQuery$SubstitutionPreferenceOptionsSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubstitutionPreferenceOptionsSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f21908a;
        public final InsetBanner b;
        public final ArrayList c;

        public SubstitutionPreferenceOptionsSection(String str, InsetBanner insetBanner, ArrayList arrayList) {
            this.f21908a = str;
            this.b = insetBanner;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubstitutionPreferenceOptionsSection)) {
                return false;
            }
            SubstitutionPreferenceOptionsSection substitutionPreferenceOptionsSection = (SubstitutionPreferenceOptionsSection) obj;
            return this.f21908a.equals(substitutionPreferenceOptionsSection.f21908a) && Intrinsics.c(this.b, substitutionPreferenceOptionsSection.b) && this.c.equals(substitutionPreferenceOptionsSection.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21908a.hashCode() * 31;
            InsetBanner insetBanner = this.b;
            return this.c.hashCode() + ((iHashCode + (insetBanner == null ? 0 : insetBanner.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubstitutionPreferenceOptionsSection(title=");
            sb.append(this.f21908a);
            sb.append(", insetBanner=");
            sb.append(this.b);
            sb.append(", items=");
            return android.support.v4.media.session.a.q(")", sb, this.c);
        }
    }

    public SubstitutionPreferenceQuery(SubstitutionPreferenceInput substitutionPreferenceInput) {
        this.f21895a = substitutionPreferenceInput;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(SubstitutionPreferenceQuery_ResponseAdapter.Data.f22028a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query substitutionPreference($input: SubstitutionPreferenceInput!) { substitutionPreference(substitutionPreferenceInput: $input) { productToBeSubstituteSection { name productId imageUrl } cheaperSubstitutesSection { banner { title subtitle type imageUrl dismissible bannerId analyticsLabel } } substitutionPreferenceOptionsSection { title insetBanner { message displayType action { placement type label url } } items { id title isSelected isEnabled description showProducts } } productSubstitutesSection { substitutions { name quantity productId imageUrl isSelected } } substitutionPreferenceFooter { button { label action style enabled } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubstitutionPreferenceQuery) && Intrinsics.c(this.f21895a, ((SubstitutionPreferenceQuery) obj).f21895a);
    }

    public final int hashCode() {
        return this.f21895a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "2541d857f68443de167be7ca008be45335d9367299e3a5b9b3cbffeb11d52f00";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "substitutionPreference";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(SubstitutionPreferenceInput_InputAdapter.f12123a, false).toJson(jsonWriter, customScalarAdapters, this.f21895a);
    }

    public final String toString() {
        return "SubstitutionPreferenceQuery(input=" + this.f21895a + ")";
    }
}
