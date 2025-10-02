package com.woolworths.feature.shop.marketplace.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Banner", "PromotionContent", "Action", "OnPromotionMarkdownContent", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromotionBannerFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final Banner f19834a;
    public final PromotionContent b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment$Action;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f19835a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f19835a = insetBannerActionPlacement;
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
            return this.f19835a == action.f19835a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f19835a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f19835a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment$Banner;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f19836a;
        public final String b;
        public final String c;
        public final String d;
        public final Action e;

        public Banner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action) {
            this.f19836a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return this.f19836a == banner.f19836a && Intrinsics.c(this.b, banner.b) && Intrinsics.c(this.c, banner.c) && Intrinsics.c(this.d, banner.d) && Intrinsics.c(this.e, banner.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f19836a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.e;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("Banner(displayType=", this.f19836a, ", message=", this.b, ", iconUrl=");
            a.B(sbU, this.c, ", bannerTitle=", this.d, ", action=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment$OnPromotionMarkdownContent;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionMarkdownContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f19837a;
        public final String b;

        public OnPromotionMarkdownContent(String str, String str2) {
            this.f19837a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPromotionMarkdownContent)) {
                return false;
            }
            OnPromotionMarkdownContent onPromotionMarkdownContent = (OnPromotionMarkdownContent) obj;
            return Intrinsics.c(this.f19837a, onPromotionMarkdownContent.f19837a) && Intrinsics.c(this.b, onPromotionMarkdownContent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19837a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnPromotionMarkdownContent(promotionMarkdownTitle=", this.f19837a, ", promotionMarkdownText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/marketplace/fragment/PromotionBannerFragment$PromotionContent;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromotionContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f19838a;
        public final OnPromotionMarkdownContent b;

        public PromotionContent(String __typename, OnPromotionMarkdownContent onPromotionMarkdownContent) {
            Intrinsics.h(__typename, "__typename");
            this.f19838a = __typename;
            this.b = onPromotionMarkdownContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionContent)) {
                return false;
            }
            PromotionContent promotionContent = (PromotionContent) obj;
            return Intrinsics.c(this.f19838a, promotionContent.f19838a) && Intrinsics.c(this.b, promotionContent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19838a.hashCode() * 31;
            OnPromotionMarkdownContent onPromotionMarkdownContent = this.b;
            return iHashCode + (onPromotionMarkdownContent == null ? 0 : onPromotionMarkdownContent.hashCode());
        }

        public final String toString() {
            return "PromotionContent(__typename=" + this.f19838a + ", onPromotionMarkdownContent=" + this.b + ")";
        }
    }

    public PromotionBannerFragment(Banner banner, PromotionContent promotionContent) {
        this.f19834a = banner;
        this.b = promotionContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionBannerFragment)) {
            return false;
        }
        PromotionBannerFragment promotionBannerFragment = (PromotionBannerFragment) obj;
        return Intrinsics.c(this.f19834a, promotionBannerFragment.f19834a) && Intrinsics.c(this.b, promotionBannerFragment.b);
    }

    public final int hashCode() {
        int iHashCode = this.f19834a.hashCode() * 31;
        PromotionContent promotionContent = this.b;
        return iHashCode + (promotionContent == null ? 0 : promotionContent.hashCode());
    }

    public final String toString() {
        return "PromotionBannerFragment(banner=" + this.f19834a + ", promotionContent=" + this.b + ")";
    }
}
