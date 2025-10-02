package au.com.woolworths.rewards.base.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/rewards/base/data/HeaderIconAction;", "", "CartAction", "AccountAction", "SearchAction", "InfoAction", "CardAction", "Lau/com/woolworths/rewards/base/data/HeaderIconAction$AccountAction;", "Lau/com/woolworths/rewards/base/data/HeaderIconAction$CardAction;", "Lau/com/woolworths/rewards/base/data/HeaderIconAction$CartAction;", "Lau/com/woolworths/rewards/base/data/HeaderIconAction$InfoAction;", "Lau/com/woolworths/rewards/base/data/HeaderIconAction$SearchAction;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HeaderIconAction {

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/rewards/base/data/HeaderIconAction$AccountAction;", "Lau/com/woolworths/rewards/base/data/HeaderIconAction;", "iconAsset", "Lau/com/woolworths/rewards/base/data/IconAsset;", "actionUrl", "", "<init>", "(Lau/com/woolworths/rewards/base/data/IconAsset;Ljava/lang/String;)V", "getIconAsset", "()Lau/com/woolworths/rewards/base/data/IconAsset;", "getActionUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountAction implements HeaderIconAction {
        public static final int $stable = 8;

        @NotNull
        private final String actionUrl;

        @NotNull
        private final IconAsset iconAsset;

        public AccountAction(@NotNull IconAsset iconAsset, @NotNull String actionUrl) {
            Intrinsics.h(iconAsset, "iconAsset");
            Intrinsics.h(actionUrl, "actionUrl");
            this.iconAsset = iconAsset;
            this.actionUrl = actionUrl;
        }

        public static /* synthetic */ AccountAction copy$default(AccountAction accountAction, IconAsset iconAsset, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                iconAsset = accountAction.iconAsset;
            }
            if ((i & 2) != 0) {
                str = accountAction.actionUrl;
            }
            return accountAction.copy(iconAsset, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconAsset getIconAsset() {
            return this.iconAsset;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @NotNull
        public final AccountAction copy(@NotNull IconAsset iconAsset, @NotNull String actionUrl) {
            Intrinsics.h(iconAsset, "iconAsset");
            Intrinsics.h(actionUrl, "actionUrl");
            return new AccountAction(iconAsset, actionUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountAction)) {
                return false;
            }
            AccountAction accountAction = (AccountAction) other;
            return Intrinsics.c(this.iconAsset, accountAction.iconAsset) && Intrinsics.c(this.actionUrl, accountAction.actionUrl);
        }

        @NotNull
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @NotNull
        public final IconAsset getIconAsset() {
            return this.iconAsset;
        }

        public int hashCode() {
            return this.actionUrl.hashCode() + (this.iconAsset.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AccountAction(iconAsset=" + this.iconAsset + ", actionUrl=" + this.actionUrl + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/rewards/base/data/HeaderIconAction$CardAction;", "Lau/com/woolworths/rewards/base/data/HeaderIconAction;", "actionUrl", "", "<init>", "(Ljava/lang/String;)V", "getActionUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CardAction implements HeaderIconAction {
        public static final int $stable = 0;

        @NotNull
        private final String actionUrl;

        public CardAction(@NotNull String actionUrl) {
            Intrinsics.h(actionUrl, "actionUrl");
            this.actionUrl = actionUrl;
        }

        public static /* synthetic */ CardAction copy$default(CardAction cardAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardAction.actionUrl;
            }
            return cardAction.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @NotNull
        public final CardAction copy(@NotNull String actionUrl) {
            Intrinsics.h(actionUrl, "actionUrl");
            return new CardAction(actionUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CardAction) && Intrinsics.c(this.actionUrl, ((CardAction) other).actionUrl);
        }

        @NotNull
        public final String getActionUrl() {
            return this.actionUrl;
        }

        public int hashCode() {
            return this.actionUrl.hashCode();
        }

        @NotNull
        public String toString() {
            return a.h("CardAction(actionUrl=", this.actionUrl, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/rewards/base/data/HeaderIconAction$CartAction;", "Lau/com/woolworths/rewards/base/data/HeaderIconAction;", "iconAsset", "Lau/com/woolworths/rewards/base/data/IconAsset;", "actionUrl", "", "<init>", "(Lau/com/woolworths/rewards/base/data/IconAsset;Ljava/lang/String;)V", "getIconAsset", "()Lau/com/woolworths/rewards/base/data/IconAsset;", "getActionUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartAction implements HeaderIconAction {
        public static final int $stable = 8;

        @NotNull
        private final String actionUrl;

        @NotNull
        private final IconAsset iconAsset;

        public CartAction(@NotNull IconAsset iconAsset, @NotNull String actionUrl) {
            Intrinsics.h(iconAsset, "iconAsset");
            Intrinsics.h(actionUrl, "actionUrl");
            this.iconAsset = iconAsset;
            this.actionUrl = actionUrl;
        }

        public static /* synthetic */ CartAction copy$default(CartAction cartAction, IconAsset iconAsset, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                iconAsset = cartAction.iconAsset;
            }
            if ((i & 2) != 0) {
                str = cartAction.actionUrl;
            }
            return cartAction.copy(iconAsset, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconAsset getIconAsset() {
            return this.iconAsset;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @NotNull
        public final CartAction copy(@NotNull IconAsset iconAsset, @NotNull String actionUrl) {
            Intrinsics.h(iconAsset, "iconAsset");
            Intrinsics.h(actionUrl, "actionUrl");
            return new CartAction(iconAsset, actionUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartAction)) {
                return false;
            }
            CartAction cartAction = (CartAction) other;
            return Intrinsics.c(this.iconAsset, cartAction.iconAsset) && Intrinsics.c(this.actionUrl, cartAction.actionUrl);
        }

        @NotNull
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @NotNull
        public final IconAsset getIconAsset() {
            return this.iconAsset;
        }

        public int hashCode() {
            return this.actionUrl.hashCode() + (this.iconAsset.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CartAction(iconAsset=" + this.iconAsset + ", actionUrl=" + this.actionUrl + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/rewards/base/data/HeaderIconAction$InfoAction;", "Lau/com/woolworths/rewards/base/data/HeaderIconAction;", "iconAsset", "Lau/com/woolworths/rewards/base/data/IconAsset;", "actionUrl", "", "<init>", "(Lau/com/woolworths/rewards/base/data/IconAsset;Ljava/lang/String;)V", "getIconAsset", "()Lau/com/woolworths/rewards/base/data/IconAsset;", "getActionUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoAction implements HeaderIconAction {
        public static final int $stable = 8;

        @NotNull
        private final String actionUrl;

        @NotNull
        private final IconAsset iconAsset;

        public InfoAction(@NotNull IconAsset iconAsset, @NotNull String actionUrl) {
            Intrinsics.h(iconAsset, "iconAsset");
            Intrinsics.h(actionUrl, "actionUrl");
            this.iconAsset = iconAsset;
            this.actionUrl = actionUrl;
        }

        public static /* synthetic */ InfoAction copy$default(InfoAction infoAction, IconAsset iconAsset, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                iconAsset = infoAction.iconAsset;
            }
            if ((i & 2) != 0) {
                str = infoAction.actionUrl;
            }
            return infoAction.copy(iconAsset, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconAsset getIconAsset() {
            return this.iconAsset;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @NotNull
        public final InfoAction copy(@NotNull IconAsset iconAsset, @NotNull String actionUrl) {
            Intrinsics.h(iconAsset, "iconAsset");
            Intrinsics.h(actionUrl, "actionUrl");
            return new InfoAction(iconAsset, actionUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoAction)) {
                return false;
            }
            InfoAction infoAction = (InfoAction) other;
            return Intrinsics.c(this.iconAsset, infoAction.iconAsset) && Intrinsics.c(this.actionUrl, infoAction.actionUrl);
        }

        @NotNull
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @NotNull
        public final IconAsset getIconAsset() {
            return this.iconAsset;
        }

        public int hashCode() {
            return this.actionUrl.hashCode() + (this.iconAsset.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "InfoAction(iconAsset=" + this.iconAsset + ", actionUrl=" + this.actionUrl + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/rewards/base/data/HeaderIconAction$SearchAction;", "Lau/com/woolworths/rewards/base/data/HeaderIconAction;", "iconAsset", "Lau/com/woolworths/rewards/base/data/IconAsset;", "actionUrl", "", "<init>", "(Lau/com/woolworths/rewards/base/data/IconAsset;Ljava/lang/String;)V", "getIconAsset", "()Lau/com/woolworths/rewards/base/data/IconAsset;", "getActionUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SearchAction implements HeaderIconAction {
        public static final int $stable = 8;

        @NotNull
        private final String actionUrl;

        @NotNull
        private final IconAsset iconAsset;

        public SearchAction(@NotNull IconAsset iconAsset, @NotNull String actionUrl) {
            Intrinsics.h(iconAsset, "iconAsset");
            Intrinsics.h(actionUrl, "actionUrl");
            this.iconAsset = iconAsset;
            this.actionUrl = actionUrl;
        }

        public static /* synthetic */ SearchAction copy$default(SearchAction searchAction, IconAsset iconAsset, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                iconAsset = searchAction.iconAsset;
            }
            if ((i & 2) != 0) {
                str = searchAction.actionUrl;
            }
            return searchAction.copy(iconAsset, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconAsset getIconAsset() {
            return this.iconAsset;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @NotNull
        public final SearchAction copy(@NotNull IconAsset iconAsset, @NotNull String actionUrl) {
            Intrinsics.h(iconAsset, "iconAsset");
            Intrinsics.h(actionUrl, "actionUrl");
            return new SearchAction(iconAsset, actionUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchAction)) {
                return false;
            }
            SearchAction searchAction = (SearchAction) other;
            return Intrinsics.c(this.iconAsset, searchAction.iconAsset) && Intrinsics.c(this.actionUrl, searchAction.actionUrl);
        }

        @NotNull
        public final String getActionUrl() {
            return this.actionUrl;
        }

        @NotNull
        public final IconAsset getIconAsset() {
            return this.iconAsset;
        }

        public int hashCode() {
            return this.actionUrl.hashCode() + (this.iconAsset.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "SearchAction(iconAsset=" + this.iconAsset + ", actionUrl=" + this.actionUrl + ")";
        }
    }
}
