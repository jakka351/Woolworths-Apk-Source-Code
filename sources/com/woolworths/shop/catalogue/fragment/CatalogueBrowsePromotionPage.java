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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowsePromotionPage;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Item", "OnCatalogueBrowsePromotionPageHeader", "OnProductCard", "OnCatalogueBrowsePromotionPageButton", "Button", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CatalogueBrowsePromotionPage implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f21761a;
    public final int b;
    public final String c;
    public final String d;
    public final ArrayList e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowsePromotionPage$Button;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f21762a;
        public final CatalogueButton b;

        public Button(String str, CatalogueButton catalogueButton) {
            this.f21762a = str;
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
            return Intrinsics.c(this.f21762a, button.f21762a) && Intrinsics.c(this.b, button.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21762a.hashCode() * 31);
        }

        public final String toString() {
            return "Button(__typename=" + this.f21762a + ", catalogueButton=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowsePromotionPage$Item;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21763a;
        public final OnCatalogueBrowsePromotionPageHeader b;
        public final OnProductCard c;
        public final OnCatalogueBrowsePromotionPageButton d;

        public Item(String __typename, OnCatalogueBrowsePromotionPageHeader onCatalogueBrowsePromotionPageHeader, OnProductCard onProductCard, OnCatalogueBrowsePromotionPageButton onCatalogueBrowsePromotionPageButton) {
            Intrinsics.h(__typename, "__typename");
            this.f21763a = __typename;
            this.b = onCatalogueBrowsePromotionPageHeader;
            this.c = onProductCard;
            this.d = onCatalogueBrowsePromotionPageButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21763a, item.f21763a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21763a.hashCode() * 31;
            OnCatalogueBrowsePromotionPageHeader onCatalogueBrowsePromotionPageHeader = this.b;
            int iHashCode2 = (iHashCode + (onCatalogueBrowsePromotionPageHeader == null ? 0 : onCatalogueBrowsePromotionPageHeader.hashCode())) * 31;
            OnProductCard onProductCard = this.c;
            int iHashCode3 = (iHashCode2 + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnCatalogueBrowsePromotionPageButton onCatalogueBrowsePromotionPageButton = this.d;
            return iHashCode3 + (onCatalogueBrowsePromotionPageButton != null ? onCatalogueBrowsePromotionPageButton.f21764a.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f21763a + ", onCatalogueBrowsePromotionPageHeader=" + this.b + ", onProductCard=" + this.c + ", onCatalogueBrowsePromotionPageButton=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowsePromotionPage$OnCatalogueBrowsePromotionPageButton;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueBrowsePromotionPageButton {

        /* renamed from: a, reason: collision with root package name */
        public final Button f21764a;

        public OnCatalogueBrowsePromotionPageButton(Button button) {
            this.f21764a = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCatalogueBrowsePromotionPageButton) && Intrinsics.c(this.f21764a, ((OnCatalogueBrowsePromotionPageButton) obj).f21764a);
        }

        public final int hashCode() {
            return this.f21764a.hashCode();
        }

        public final String toString() {
            return "OnCatalogueBrowsePromotionPageButton(button=" + this.f21764a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowsePromotionPage$OnCatalogueBrowsePromotionPageHeader;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueBrowsePromotionPageHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f21765a;
        public final String b;

        public OnCatalogueBrowsePromotionPageHeader(String str, String str2) {
            this.f21765a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueBrowsePromotionPageHeader)) {
                return false;
            }
            OnCatalogueBrowsePromotionPageHeader onCatalogueBrowsePromotionPageHeader = (OnCatalogueBrowsePromotionPageHeader) obj;
            return Intrinsics.c(this.f21765a, onCatalogueBrowsePromotionPageHeader.f21765a) && Intrinsics.c(this.b, onCatalogueBrowsePromotionPageHeader.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21765a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnCatalogueBrowsePromotionPageHeader(title=", this.f21765a, ", iconUrl=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/catalogue/fragment/CatalogueBrowsePromotionPage$OnProductCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21766a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f21766a = str;
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
            return Intrinsics.c(this.f21766a, onProductCard.f21766a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21766a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f21766a, ", productCard=", this.b, ")");
        }
    }

    public CatalogueBrowsePromotionPage(String str, int i, String str2, String str3, ArrayList arrayList) {
        this.f21761a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueBrowsePromotionPage)) {
            return false;
        }
        CatalogueBrowsePromotionPage catalogueBrowsePromotionPage = (CatalogueBrowsePromotionPage) obj;
        return this.f21761a.equals(catalogueBrowsePromotionPage.f21761a) && this.b == catalogueBrowsePromotionPage.b && this.c.equals(catalogueBrowsePromotionPage.c) && Intrinsics.c(this.d, catalogueBrowsePromotionPage.d) && this.e.equals(catalogueBrowsePromotionPage.e);
    }

    public final int hashCode() {
        int iC = b.c(b.a(this.b, this.f21761a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbU = b.u("CatalogueBrowsePromotionPage(id=", this.b, this.f21761a, ", pageNumber=", ", backgroundUrl=");
        androidx.constraintlayout.core.state.a.B(sbU, this.c, ", backgroundColor=", this.d, ", items=");
        return android.support.v4.media.session.a.q(")", sbU, this.e);
    }
}
