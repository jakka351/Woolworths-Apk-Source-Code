package com.woolworths.shop.catalogue.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Item", "OnCatalogueBrowseCategoryPageHeader", "OnProductCard", "OnCatalogueBrowseCategoryPageButton", "Button", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueBrowseCategoryPage implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f21749a;
    public final int b;
    public final String c;
    public final String d;
    public final ArrayList e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$Button;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f21750a;
        public final CatalogueButton b;

        public Button(String str, CatalogueButton catalogueButton) {
            this.f21750a = str;
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
            return Intrinsics.c(this.f21750a, button.f21750a) && Intrinsics.c(this.b, button.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21750a.hashCode() * 31);
        }

        public final String toString() {
            return "Button(__typename=" + this.f21750a + ", catalogueButton=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$Item;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21751a;
        public final OnCatalogueBrowseCategoryPageHeader b;
        public final OnProductCard c;
        public final OnCatalogueBrowseCategoryPageButton d;

        public Item(String __typename, OnCatalogueBrowseCategoryPageHeader onCatalogueBrowseCategoryPageHeader, OnProductCard onProductCard, OnCatalogueBrowseCategoryPageButton onCatalogueBrowseCategoryPageButton) {
            Intrinsics.h(__typename, "__typename");
            this.f21751a = __typename;
            this.b = onCatalogueBrowseCategoryPageHeader;
            this.c = onProductCard;
            this.d = onCatalogueBrowseCategoryPageButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21751a, item.f21751a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21751a.hashCode() * 31;
            OnCatalogueBrowseCategoryPageHeader onCatalogueBrowseCategoryPageHeader = this.b;
            int iHashCode2 = (iHashCode + (onCatalogueBrowseCategoryPageHeader == null ? 0 : onCatalogueBrowseCategoryPageHeader.hashCode())) * 31;
            OnProductCard onProductCard = this.c;
            int iHashCode3 = (iHashCode2 + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnCatalogueBrowseCategoryPageButton onCatalogueBrowseCategoryPageButton = this.d;
            return iHashCode3 + (onCatalogueBrowseCategoryPageButton != null ? onCatalogueBrowseCategoryPageButton.f21752a.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f21751a + ", onCatalogueBrowseCategoryPageHeader=" + this.b + ", onProductCard=" + this.c + ", onCatalogueBrowseCategoryPageButton=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$OnCatalogueBrowseCategoryPageButton;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueBrowseCategoryPageButton {

        /* renamed from: a, reason: collision with root package name */
        public final Button f21752a;

        public OnCatalogueBrowseCategoryPageButton(Button button) {
            this.f21752a = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCatalogueBrowseCategoryPageButton) && Intrinsics.c(this.f21752a, ((OnCatalogueBrowseCategoryPageButton) obj).f21752a);
        }

        public final int hashCode() {
            return this.f21752a.hashCode();
        }

        public final String toString() {
            return "OnCatalogueBrowseCategoryPageButton(button=" + this.f21752a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$OnCatalogueBrowseCategoryPageHeader;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueBrowseCategoryPageHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f21753a;
        public final String b;

        public OnCatalogueBrowseCategoryPageHeader(String str, String str2) {
            this.f21753a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueBrowseCategoryPageHeader)) {
                return false;
            }
            OnCatalogueBrowseCategoryPageHeader onCatalogueBrowseCategoryPageHeader = (OnCatalogueBrowseCategoryPageHeader) obj;
            return Intrinsics.c(this.f21753a, onCatalogueBrowseCategoryPageHeader.f21753a) && Intrinsics.c(this.b, onCatalogueBrowseCategoryPageHeader.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21753a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnCatalogueBrowseCategoryPageHeader(title=", this.f21753a, ", iconUrl=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowseCategoryPage$OnProductCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21754a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f21754a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCard)) {
                return false;
            }
            OnProductCard onProductCard = (OnProductCard) obj;
            return Intrinsics.c(this.f21754a, onProductCard.f21754a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21754a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f21754a, ", productCard=", this.b, ")");
        }
    }

    public CatalogueBrowseCategoryPage(String str, int i, String str2, String str3, ArrayList arrayList) {
        this.f21749a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueBrowseCategoryPage)) {
            return false;
        }
        CatalogueBrowseCategoryPage catalogueBrowseCategoryPage = (CatalogueBrowseCategoryPage) obj;
        return this.f21749a.equals(catalogueBrowseCategoryPage.f21749a) && this.b == catalogueBrowseCategoryPage.b && this.c.equals(catalogueBrowseCategoryPage.c) && Intrinsics.c(this.d, catalogueBrowseCategoryPage.d) && this.e.equals(catalogueBrowseCategoryPage.e);
    }

    public final int hashCode() {
        int iC = b.c(b.a(this.b, this.f21749a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbU = b.u("CatalogueBrowseCategoryPage(id=", this.b, this.f21749a, ", pageNumber=", ", backgroundUrl=");
        androidx.constraintlayout.core.state.a.B(sbU, this.c, ", backgroundColor=", this.d, ", items=");
        return android.support.v4.media.session.a.q(")", sbU, this.e);
    }
}
