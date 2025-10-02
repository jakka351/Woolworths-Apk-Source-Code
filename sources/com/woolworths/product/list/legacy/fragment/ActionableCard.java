package com.woolworths.product.list.legacy.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.CardHeight;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/ActionableCard;", "Lcom/apollographql/apollo/api/Fragment$Data;", "image", "", "altText", "cardHeight", "Lau/com/woolworths/shop/graphql/type/CardHeight;", "link", "analytics", "Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/shop/graphql/type/CardHeight;Ljava/lang/String;Lau/com/woolworths/analytics/graphql/TealiumAnalytics;)V", "getImage", "()Ljava/lang/String;", "getAltText", "getCardHeight", "()Lau/com/woolworths/shop/graphql/type/CardHeight;", "getLink", "getAnalytics", "()Lau/com/woolworths/analytics/graphql/TealiumAnalytics;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ActionableCard implements Fragment.Data {
    public static final int $stable = 8;

    @NotNull
    private final String altText;

    @Nullable
    private final TealiumAnalytics analytics;

    @NotNull
    private final CardHeight cardHeight;

    @NotNull
    private final String image;

    @NotNull
    private final String link;

    public ActionableCard(@NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @NotNull String link, @Nullable TealiumAnalytics tealiumAnalytics) {
        Intrinsics.h(image, "image");
        Intrinsics.h(altText, "altText");
        Intrinsics.h(cardHeight, "cardHeight");
        Intrinsics.h(link, "link");
        this.image = image;
        this.altText = altText;
        this.cardHeight = cardHeight;
        this.link = link;
        this.analytics = tealiumAnalytics;
    }

    public static /* synthetic */ ActionableCard copy$default(ActionableCard actionableCard, String str, String str2, CardHeight cardHeight, String str3, TealiumAnalytics tealiumAnalytics, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionableCard.image;
        }
        if ((i & 2) != 0) {
            str2 = actionableCard.altText;
        }
        if ((i & 4) != 0) {
            cardHeight = actionableCard.cardHeight;
        }
        if ((i & 8) != 0) {
            str3 = actionableCard.link;
        }
        if ((i & 16) != 0) {
            tealiumAnalytics = actionableCard.analytics;
        }
        TealiumAnalytics tealiumAnalytics2 = tealiumAnalytics;
        CardHeight cardHeight2 = cardHeight;
        return actionableCard.copy(str, str2, cardHeight2, str3, tealiumAnalytics2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CardHeight getCardHeight() {
        return this.cardHeight;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final TealiumAnalytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final ActionableCard copy(@NotNull String image, @NotNull String altText, @NotNull CardHeight cardHeight, @NotNull String link, @Nullable TealiumAnalytics analytics) {
        Intrinsics.h(image, "image");
        Intrinsics.h(altText, "altText");
        Intrinsics.h(cardHeight, "cardHeight");
        Intrinsics.h(link, "link");
        return new ActionableCard(image, altText, cardHeight, link, analytics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionableCard)) {
            return false;
        }
        ActionableCard actionableCard = (ActionableCard) other;
        return Intrinsics.c(this.image, actionableCard.image) && Intrinsics.c(this.altText, actionableCard.altText) && this.cardHeight == actionableCard.cardHeight && Intrinsics.c(this.link, actionableCard.link) && Intrinsics.c(this.analytics, actionableCard.analytics);
    }

    @NotNull
    public final String getAltText() {
        return this.altText;
    }

    @Nullable
    public final TealiumAnalytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final CardHeight getCardHeight() {
        return this.cardHeight;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public int hashCode() {
        int iC = b.c(d.b(this.cardHeight, b.c(this.image.hashCode() * 31, 31, this.altText), 31), 31, this.link);
        TealiumAnalytics tealiumAnalytics = this.analytics;
        return iC + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.altText;
        CardHeight cardHeight = this.cardHeight;
        String str3 = this.link;
        TealiumAnalytics tealiumAnalytics = this.analytics;
        StringBuilder sbV = a.v("ActionableCard(image=", str, ", altText=", str2, ", cardHeight=");
        sbV.append(cardHeight);
        sbV.append(", link=");
        sbV.append(str3);
        sbV.append(", analytics=");
        sbV.append(tealiumAnalytics);
        sbV.append(")");
        return sbV.toString();
    }
}
