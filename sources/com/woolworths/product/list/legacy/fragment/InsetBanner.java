package com.woolworths.product.list.legacy.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Fragment;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/InsetBanner;", "Lcom/apollographql/apollo/api/Fragment$Data;", "displayType", "Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "message", "", "bannerTitle", "iconUrl", UrlHandler.ACTION, "Lcom/woolworths/product/list/legacy/fragment/InsetBanner$Action;", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/woolworths/product/list/legacy/fragment/InsetBanner$Action;)V", "getDisplayType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerDisplayType;", "getMessage", "()Ljava/lang/String;", "getBannerTitle", "getIconUrl", "getAction", "()Lcom/woolworths/product/list/legacy/fragment/InsetBanner$Action;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Action", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InsetBanner implements Fragment.Data {
    public static final int $stable = 0;

    @Nullable
    private final Action action;

    @Nullable
    private final String bannerTitle;

    @NotNull
    private final InsetBannerDisplayType displayType;

    @Nullable
    private final String iconUrl;

    @NotNull
    private final String message;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/InsetBanner$Action;", "", "placement", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "type", "Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", AnnotatedPrivateKey.LABEL, "", "url", "<init>", "(Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionPlacement;", "getType", "()Lau/com/woolworths/shop/graphql/type/InsetBannerActionType;", "getLabel", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {
        public static final int $stable = 0;

        @NotNull
        private final String label;

        @NotNull
        private final InsetBannerActionPlacement placement;

        @NotNull
        private final InsetBannerActionType type;

        @Nullable
        private final String url;

        public Action(@NotNull InsetBannerActionPlacement placement, @NotNull InsetBannerActionType type, @NotNull String label, @Nullable String str) {
            Intrinsics.h(placement, "placement");
            Intrinsics.h(type, "type");
            Intrinsics.h(label, "label");
            this.placement = placement;
            this.type = type;
            this.label = label;
            this.url = str;
        }

        public static /* synthetic */ Action copy$default(Action action, InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                insetBannerActionPlacement = action.placement;
            }
            if ((i & 2) != 0) {
                insetBannerActionType = action.type;
            }
            if ((i & 4) != 0) {
                str = action.label;
            }
            if ((i & 8) != 0) {
                str2 = action.url;
            }
            return action.copy(insetBannerActionPlacement, insetBannerActionType, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final InsetBannerActionPlacement getPlacement() {
            return this.placement;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final InsetBannerActionType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Action copy(@NotNull InsetBannerActionPlacement placement, @NotNull InsetBannerActionType type, @NotNull String label, @Nullable String url) {
            Intrinsics.h(placement, "placement");
            Intrinsics.h(type, "type");
            Intrinsics.h(label, "label");
            return new Action(placement, type, label, url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return this.placement == action.placement && this.type == action.type && Intrinsics.c(this.label, action.label) && Intrinsics.c(this.url, action.url);
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final InsetBannerActionPlacement getPlacement() {
            return this.placement;
        }

        @NotNull
        public final InsetBannerActionType getType() {
            return this.type;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iC = b.c(d.c(this.type, this.placement.hashCode() * 31, 31), 31, this.label);
            String str = this.url;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            InsetBannerActionPlacement insetBannerActionPlacement = this.placement;
            InsetBannerActionType insetBannerActionType = this.type;
            return a.l(d.t("Action(placement=", insetBannerActionPlacement, ", type=", insetBannerActionType, ", label="), this.label, ", url=", this.url, ")");
        }
    }

    public InsetBanner(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String str, @Nullable String str2, @Nullable Action action) {
        Intrinsics.h(displayType, "displayType");
        Intrinsics.h(message, "message");
        this.displayType = displayType;
        this.message = message;
        this.bannerTitle = str;
        this.iconUrl = str2;
        this.action = action;
    }

    public static /* synthetic */ InsetBanner copy$default(InsetBanner insetBanner, InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action, int i, Object obj) {
        if ((i & 1) != 0) {
            insetBannerDisplayType = insetBanner.displayType;
        }
        if ((i & 2) != 0) {
            str = insetBanner.message;
        }
        if ((i & 4) != 0) {
            str2 = insetBanner.bannerTitle;
        }
        if ((i & 8) != 0) {
            str3 = insetBanner.iconUrl;
        }
        if ((i & 16) != 0) {
            action = insetBanner.action;
        }
        Action action2 = action;
        String str4 = str2;
        return insetBanner.copy(insetBannerDisplayType, str, str4, str3, action2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InsetBannerDisplayType getDisplayType() {
        return this.displayType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final InsetBanner copy(@NotNull InsetBannerDisplayType displayType, @NotNull String message, @Nullable String bannerTitle, @Nullable String iconUrl, @Nullable Action action) {
        Intrinsics.h(displayType, "displayType");
        Intrinsics.h(message, "message");
        return new InsetBanner(displayType, message, bannerTitle, iconUrl, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsetBanner)) {
            return false;
        }
        InsetBanner insetBanner = (InsetBanner) other;
        return this.displayType == insetBanner.displayType && Intrinsics.c(this.message, insetBanner.message) && Intrinsics.c(this.bannerTitle, insetBanner.bannerTitle) && Intrinsics.c(this.iconUrl, insetBanner.iconUrl) && Intrinsics.c(this.action, insetBanner.action);
    }

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final String getBannerTitle() {
        return this.bannerTitle;
    }

    @NotNull
    public final InsetBannerDisplayType getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iC = b.c(this.displayType.hashCode() * 31, 31, this.message);
        String str = this.bannerTitle;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.action;
        return iHashCode2 + (action != null ? action.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        InsetBannerDisplayType insetBannerDisplayType = this.displayType;
        String str = this.message;
        String str2 = this.bannerTitle;
        String str3 = this.iconUrl;
        Action action = this.action;
        StringBuilder sbU = d.u("InsetBanner(displayType=", insetBannerDisplayType, ", message=", str, ", bannerTitle=");
        a.B(sbU, str2, ", iconUrl=", str3, ", action=");
        sbU.append(action);
        sbU.append(")");
        return sbU.toString();
    }
}
