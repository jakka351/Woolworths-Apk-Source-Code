package com.woolworths.feature.shop.contentpage.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.BannerImageFormat;
import au.com.woolworths.shop.graphql.type.BannerTextPosition;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner;", "Lcom/apollographql/apollo/api/Fragment$Data;", "EditorialBannerImage", "EditorialBannerAction", "EditorialBannerFooter", "EditorialBannerAnalytics", "Logo", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EditorialBanner implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f19756a;
    public final String b;
    public final EditorialBannerImage c;
    public final String d;
    public final String e;
    public final EditorialBannerAction f;
    public final EditorialBannerFooter g;
    public final BannerImageFormat h;
    public final BannerTextPosition i;
    public final EditorialBannerAnalytics j;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$EditorialBannerAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditorialBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19757a;
        public final ActionFields b;

        public EditorialBannerAction(String str, ActionFields actionFields) {
            this.f19757a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditorialBannerAction)) {
                return false;
            }
            EditorialBannerAction editorialBannerAction = (EditorialBannerAction) obj;
            return Intrinsics.c(this.f19757a, editorialBannerAction.f19757a) && Intrinsics.c(this.b, editorialBannerAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19757a.hashCode() * 31);
        }

        public final String toString() {
            return "EditorialBannerAction(__typename=" + this.f19757a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$EditorialBannerAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditorialBannerAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19758a;
        public final AnalyticsFields b;

        public EditorialBannerAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19758a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditorialBannerAnalytics)) {
                return false;
            }
            EditorialBannerAnalytics editorialBannerAnalytics = (EditorialBannerAnalytics) obj;
            return Intrinsics.c(this.f19758a, editorialBannerAnalytics.f19758a) && Intrinsics.c(this.b, editorialBannerAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19758a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("EditorialBannerAnalytics(__typename=", this.f19758a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$EditorialBannerFooter;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditorialBannerFooter {

        /* renamed from: a, reason: collision with root package name */
        public final FooterStyle f19759a;
        public final String b;
        public final Logo c;

        public EditorialBannerFooter(FooterStyle footerStyle, String str, Logo logo) {
            this.f19759a = footerStyle;
            this.b = str;
            this.c = logo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditorialBannerFooter)) {
                return false;
            }
            EditorialBannerFooter editorialBannerFooter = (EditorialBannerFooter) obj;
            return this.f19759a == editorialBannerFooter.f19759a && Intrinsics.c(this.b, editorialBannerFooter.b) && Intrinsics.c(this.c, editorialBannerFooter.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19759a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Logo logo = this.c;
            return iHashCode2 + (logo != null ? logo.hashCode() : 0);
        }

        public final String toString() {
            return "EditorialBannerFooter(style=" + this.f19759a + ", text=" + this.b + ", logo=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$EditorialBannerImage;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditorialBannerImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f19760a;
        public final String b;

        public EditorialBannerImage(String str, String str2) {
            this.f19760a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditorialBannerImage)) {
                return false;
            }
            EditorialBannerImage editorialBannerImage = (EditorialBannerImage) obj;
            return Intrinsics.c(this.f19760a, editorialBannerImage.f19760a) && Intrinsics.c(this.b, editorialBannerImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19760a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("EditorialBannerImage(imageUrl=", this.f19760a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/EditorialBanner$Logo;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Logo {

        /* renamed from: a, reason: collision with root package name */
        public final String f19761a;
        public final String b;

        public Logo(String str, String str2) {
            this.f19761a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) obj;
            return Intrinsics.c(this.f19761a, logo.f19761a) && Intrinsics.c(this.b, logo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19761a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Logo(imageUrl=", this.f19761a, ", altText=", this.b, ")");
        }
    }

    public EditorialBanner(String str, String str2, EditorialBannerImage editorialBannerImage, String str3, String str4, EditorialBannerAction editorialBannerAction, EditorialBannerFooter editorialBannerFooter, BannerImageFormat bannerImageFormat, BannerTextPosition bannerTextPosition, EditorialBannerAnalytics editorialBannerAnalytics) {
        this.f19756a = str;
        this.b = str2;
        this.c = editorialBannerImage;
        this.d = str3;
        this.e = str4;
        this.f = editorialBannerAction;
        this.g = editorialBannerFooter;
        this.h = bannerImageFormat;
        this.i = bannerTextPosition;
        this.j = editorialBannerAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorialBanner)) {
            return false;
        }
        EditorialBanner editorialBanner = (EditorialBanner) obj;
        return Intrinsics.c(this.f19756a, editorialBanner.f19756a) && Intrinsics.c(this.b, editorialBanner.b) && Intrinsics.c(this.c, editorialBanner.c) && Intrinsics.c(this.d, editorialBanner.d) && Intrinsics.c(this.e, editorialBanner.e) && Intrinsics.c(this.f, editorialBanner.f) && Intrinsics.c(this.g, editorialBanner.g) && this.h == editorialBanner.h && this.i == editorialBanner.i && Intrinsics.c(this.j, editorialBanner.j);
    }

    public final int hashCode() {
        int iC = b.c(this.f19756a.hashCode() * 31, 31, this.b);
        EditorialBannerImage editorialBannerImage = this.c;
        int iHashCode = (iC + (editorialBannerImage == null ? 0 : editorialBannerImage.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EditorialBannerAction editorialBannerAction = this.f;
        int iHashCode4 = (iHashCode3 + (editorialBannerAction == null ? 0 : editorialBannerAction.hashCode())) * 31;
        EditorialBannerFooter editorialBannerFooter = this.g;
        int iHashCode5 = (this.h.hashCode() + ((iHashCode4 + (editorialBannerFooter == null ? 0 : editorialBannerFooter.hashCode())) * 31)) * 31;
        BannerTextPosition bannerTextPosition = this.i;
        int iHashCode6 = (iHashCode5 + (bannerTextPosition == null ? 0 : bannerTextPosition.hashCode())) * 31;
        EditorialBannerAnalytics editorialBannerAnalytics = this.j;
        return iHashCode6 + (editorialBannerAnalytics != null ? editorialBannerAnalytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("EditorialBanner(editorialBannerId=", this.f19756a, ", editorialBannerBackgroundColour=", this.b, ", editorialBannerImage=");
        sbV.append(this.c);
        sbV.append(", editorialBannerTitle=");
        sbV.append(this.d);
        sbV.append(", editorialBannerSubtitle=");
        sbV.append(this.e);
        sbV.append(", editorialBannerAction=");
        sbV.append(this.f);
        sbV.append(", editorialBannerFooter=");
        sbV.append(this.g);
        sbV.append(", editorialBannerImageFormat=");
        sbV.append(this.h);
        sbV.append(", editorialBannerTextPosition=");
        sbV.append(this.i);
        sbV.append(", editorialBannerAnalytics=");
        sbV.append(this.j);
        sbV.append(")");
        return sbV.toString();
    }
}
