package com.woolworths.rewards.card;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionSettingIcon;
import au.com.woolworths.rewards.graphql.type.WalletAction;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.card.adapter.RewardsCardHomePageQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Data;", "Data", "RewardsHomePage", "Balance", "RedemptionSettings", "RedemptionUnlock", "UnlockConfirmation", "HeaderImage", "Button", "CallToAction", "FuelVouchers", "WalletHomePage", "Coachmark", "BannerImage", "PrimaryCTA", "InflightPaymentData", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsCardHomePageQuery implements Query<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Balance;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Balance {

        /* renamed from: a, reason: collision with root package name */
        public final RedemptionSettings f20652a;
        public final FuelVouchers b;
        public final String c;

        public Balance(RedemptionSettings redemptionSettings, FuelVouchers fuelVouchers, String str) {
            this.f20652a = redemptionSettings;
            this.b = fuelVouchers;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Balance)) {
                return false;
            }
            Balance balance = (Balance) obj;
            return Intrinsics.c(this.f20652a, balance.f20652a) && Intrinsics.c(this.b, balance.b) && Intrinsics.c(this.c, balance.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f20652a.hashCode() * 31)) * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Balance(redemptionSettings=");
            sb.append(this.f20652a);
            sb.append(", fuelVouchers=");
            sb.append(this.b);
            sb.append(", displayName=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$BannerImage;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerImage {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f20653a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public BannerImage(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f20653a = downloadableAssetType;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = downloadableAssetFit;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerImage)) {
                return false;
            }
            BannerImage bannerImage = (BannerImage) obj;
            return this.f20653a == bannerImage.f20653a && Intrinsics.c(this.b, bannerImage.b) && this.c == bannerImage.c && this.d == bannerImage.d && this.e == bannerImage.e && Intrinsics.c(this.f, bannerImage.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f20653a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BannerImage(assetType=");
            sb.append(this.f20653a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", altText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Button;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f20654a;
        public final String b;
        public final String c;
        public final String d;

        public Button(String str, String str2, String str3, String str4) {
            this.f20654a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f20654a, button.f20654a) && Intrinsics.c(this.b, button.b) && Intrinsics.c(this.c, button.c) && Intrinsics.c(this.d, button.d);
        }

        public final int hashCode() {
            String str = this.f20654a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iC = b.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
            String str3 = this.d;
            return iC + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("Button(loadingStateLabel=", this.f20654a, ", sliderLabel=", this.b, ", label="), this.c, ", iconUrl=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$CallToAction;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CallToAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f20655a;
        public final String b;

        public CallToAction(String str, String str2) {
            this.f20655a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallToAction)) {
                return false;
            }
            CallToAction callToAction = (CallToAction) obj;
            return Intrinsics.c(this.f20655a, callToAction.f20655a) && Intrinsics.c(this.b, callToAction.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20655a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("CallToAction(label=", this.f20655a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Coachmark;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Coachmark {

        /* renamed from: a, reason: collision with root package name */
        public final String f20656a;
        public final BannerImage b;
        public final String c;
        public final String d;
        public final PrimaryCTA e;

        public Coachmark(String str, BannerImage bannerImage, String str2, String str3, PrimaryCTA primaryCTA) {
            this.f20656a = str;
            this.b = bannerImage;
            this.c = str2;
            this.d = str3;
            this.e = primaryCTA;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Coachmark)) {
                return false;
            }
            Coachmark coachmark = (Coachmark) obj;
            return Intrinsics.c(this.f20656a, coachmark.f20656a) && Intrinsics.c(this.b, coachmark.b) && Intrinsics.c(this.c, coachmark.c) && Intrinsics.c(this.d, coachmark.d) && Intrinsics.c(this.e, coachmark.e);
        }

        public final int hashCode() {
            int iHashCode = this.f20656a.hashCode() * 31;
            BannerImage bannerImage = this.b;
            int iHashCode2 = (iHashCode + (bannerImage == null ? 0 : bannerImage.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PrimaryCTA primaryCTA = this.e;
            return iHashCode4 + (primaryCTA != null ? primaryCTA.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Coachmark(id=");
            sb.append(this.f20656a);
            sb.append(", bannerImage=");
            sb.append(this.b);
            sb.append(", contentTitle=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", contentBody=", this.d, ", primaryCTA=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsHomePage f20657a;
        public final WalletHomePage b;
        public final Boolean c;

        public Data(RewardsHomePage rewardsHomePage, WalletHomePage walletHomePage, Boolean bool) {
            this.f20657a = rewardsHomePage;
            this.b = walletHomePage;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.c(this.f20657a, data.f20657a) && Intrinsics.c(this.b, data.b) && Intrinsics.c(this.c, data.c);
        }

        public final int hashCode() {
            RewardsHomePage rewardsHomePage = this.f20657a;
            int iHashCode = (this.b.hashCode() + ((rewardsHomePage == null ? 0 : rewardsHomePage.f20664a.hashCode()) * 31)) * 31;
            Boolean bool = this.c;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(rewardsHomePage=");
            sb.append(this.f20657a);
            sb.append(", walletHomePage=");
            sb.append(this.b);
            sb.append(", showCustomerValuePropositions=");
            return au.com.woolworths.android.onesite.a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$FuelVouchers;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FuelVouchers {

        /* renamed from: a, reason: collision with root package name */
        public final String f20658a;
        public final int b;

        public FuelVouchers(String str, int i) {
            this.f20658a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FuelVouchers)) {
                return false;
            }
            FuelVouchers fuelVouchers = (FuelVouchers) obj;
            return Intrinsics.c(this.f20658a, fuelVouchers.f20658a) && this.b == fuelVouchers.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f20658a.hashCode() * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.p("FuelVouchers(label=", this.b, this.f20658a, ", numberOfVouchers=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$HeaderImage;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderImage {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f20659a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;

        public HeaderImage(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit) {
            this.f20659a = downloadableAssetType;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = downloadableAssetFit;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderImage)) {
                return false;
            }
            HeaderImage headerImage = (HeaderImage) obj;
            return this.f20659a == headerImage.f20659a && Intrinsics.c(this.b, headerImage.b) && this.c == headerImage.c && this.d == headerImage.d && this.e == headerImage.e;
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f20659a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            return iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderImage(assetType=");
            sb.append(this.f20659a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$InflightPaymentData;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InflightPaymentData {

        /* renamed from: a, reason: collision with root package name */
        public final String f20660a;
        public final String b;
        public final String c;

        public InflightPaymentData(String str, String str2, String str3) {
            this.f20660a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InflightPaymentData)) {
                return false;
            }
            InflightPaymentData inflightPaymentData = (InflightPaymentData) obj;
            return Intrinsics.c(this.f20660a, inflightPaymentData.f20660a) && Intrinsics.c(this.b, inflightPaymentData.b) && Intrinsics.c(this.c, inflightPaymentData.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f20660a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("InflightPaymentData(iconUrl=", this.f20660a, ", bannerMessage=", this.b, ", snackbarMessage="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$PrimaryCTA;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCTA {

        /* renamed from: a, reason: collision with root package name */
        public final String f20661a;
        public final String b;

        public PrimaryCTA(String str, String str2) {
            this.f20661a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryCTA)) {
                return false;
            }
            PrimaryCTA primaryCTA = (PrimaryCTA) obj;
            return Intrinsics.c(this.f20661a, primaryCTA.f20661a) && Intrinsics.c(this.b, primaryCTA.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20661a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("PrimaryCTA(label=", this.f20661a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$RedemptionSettings;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RedemptionSettings {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsRedemptionSettingIcon f20662a;
        public final String b;
        public final String c;
        public final String d;
        public final RedemptionUnlock e;

        public RedemptionSettings(RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon, String str, String str2, String str3, RedemptionUnlock redemptionUnlock) {
            this.f20662a = rewardsRedemptionSettingIcon;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = redemptionUnlock;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RedemptionSettings)) {
                return false;
            }
            RedemptionSettings redemptionSettings = (RedemptionSettings) obj;
            return this.f20662a == redemptionSettings.f20662a && Intrinsics.c(this.b, redemptionSettings.b) && Intrinsics.c(this.c, redemptionSettings.c) && Intrinsics.c(this.d, redemptionSettings.d) && Intrinsics.c(this.e, redemptionSettings.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f20662a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            RedemptionUnlock redemptionUnlock = this.e;
            return iHashCode + (redemptionUnlock != null ? redemptionUnlock.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RedemptionSettings(redemptionIcon=");
            sb.append(this.f20662a);
            sb.append(", label=");
            sb.append(this.b);
            sb.append(", value=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", altText=", this.d, ", redemptionUnlock=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$RedemptionUnlock;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RedemptionUnlock {

        /* renamed from: a, reason: collision with root package name */
        public final String f20663a;
        public final String b;
        public final UnlockConfirmation c;

        public RedemptionUnlock(String str, String str2, UnlockConfirmation unlockConfirmation) {
            this.f20663a = str;
            this.b = str2;
            this.c = unlockConfirmation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RedemptionUnlock)) {
                return false;
            }
            RedemptionUnlock redemptionUnlock = (RedemptionUnlock) obj;
            return Intrinsics.c(this.f20663a, redemptionUnlock.f20663a) && Intrinsics.c(this.b, redemptionUnlock.b) && Intrinsics.c(this.c, redemptionUnlock.c);
        }

        public final int hashCode() {
            String str = this.f20663a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UnlockConfirmation unlockConfirmation = this.c;
            return iHashCode2 + (unlockConfirmation != null ? unlockConfirmation.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("RedemptionUnlock(coachMarkText=", this.f20663a, ", iconUrl=", this.b, ", unlockConfirmation=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$RewardsHomePage;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsHomePage {

        /* renamed from: a, reason: collision with root package name */
        public final Balance f20664a;

        public RewardsHomePage(Balance balance) {
            this.f20664a = balance;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RewardsHomePage) && Intrinsics.c(this.f20664a, ((RewardsHomePage) obj).f20664a);
        }

        public final int hashCode() {
            return this.f20664a.hashCode();
        }

        public final String toString() {
            return "RewardsHomePage(balance=" + this.f20664a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$UnlockConfirmation;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnlockConfirmation {

        /* renamed from: a, reason: collision with root package name */
        public final String f20665a;
        public final HeaderImage b;
        public final String c;
        public final boolean d;
        public final String e;
        public final Button f;
        public final String g;
        public final CallToAction h;
        public final Boolean i;

        public UnlockConfirmation(String str, HeaderImage headerImage, String str2, boolean z, String str3, Button button, String str4, CallToAction callToAction, Boolean bool) {
            this.f20665a = str;
            this.b = headerImage;
            this.c = str2;
            this.d = z;
            this.e = str3;
            this.f = button;
            this.g = str4;
            this.h = callToAction;
            this.i = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnlockConfirmation)) {
                return false;
            }
            UnlockConfirmation unlockConfirmation = (UnlockConfirmation) obj;
            return Intrinsics.c(this.f20665a, unlockConfirmation.f20665a) && Intrinsics.c(this.b, unlockConfirmation.b) && Intrinsics.c(this.c, unlockConfirmation.c) && this.d == unlockConfirmation.d && Intrinsics.c(this.e, unlockConfirmation.e) && Intrinsics.c(this.f, unlockConfirmation.f) && Intrinsics.c(this.g, unlockConfirmation.g) && Intrinsics.c(this.h, unlockConfirmation.h) && Intrinsics.c(this.i, unlockConfirmation.i);
        }

        public final int hashCode() {
            int iC = b.c((this.f.hashCode() + b.c(b.e(b.c((this.b.hashCode() + (this.f20665a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
            CallToAction callToAction = this.h;
            int iHashCode = (iC + (callToAction == null ? 0 : callToAction.hashCode())) * 31;
            Boolean bool = this.i;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UnlockConfirmation(iconUrl=");
            sb.append(this.f20665a);
            sb.append(", headerImage=");
            sb.append(this.b);
            sb.append(", title=");
            d.A(this.c, ", showAnimation=", ", content=", sb, this.d);
            sb.append(this.e);
            sb.append(", button=");
            sb.append(this.f);
            sb.append(", analyticsLabel=");
            sb.append(this.g);
            sb.append(", callToAction=");
            sb.append(this.h);
            sb.append(", showUnlock=");
            return au.com.woolworths.android.onesite.a.o(sb, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RewardsCardHomePageQuery$WalletHomePage;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WalletHomePage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20666a;
        public final String b;
        public final WalletAction c;
        public final Boolean d;
        public final Boolean e;
        public final String f;
        public final Coachmark g;
        public final InflightPaymentData h;

        public WalletHomePage(String str, String str2, WalletAction walletAction, Boolean bool, Boolean bool2, String str3, Coachmark coachmark, InflightPaymentData inflightPaymentData) {
            this.f20666a = str;
            this.b = str2;
            this.c = walletAction;
            this.d = bool;
            this.e = bool2;
            this.f = str3;
            this.g = coachmark;
            this.h = inflightPaymentData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WalletHomePage)) {
                return false;
            }
            WalletHomePage walletHomePage = (WalletHomePage) obj;
            return Intrinsics.c(this.f20666a, walletHomePage.f20666a) && Intrinsics.c(this.b, walletHomePage.b) && this.c == walletHomePage.c && Intrinsics.c(this.d, walletHomePage.d) && Intrinsics.c(this.e, walletHomePage.e) && Intrinsics.c(this.f, walletHomePage.f) && Intrinsics.c(this.g, walletHomePage.g) && Intrinsics.c(this.h, walletHomePage.h);
        }

        public final int hashCode() {
            String str = this.f20666a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Boolean bool = this.d;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.e;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Coachmark coachmark = this.g;
            int iHashCode6 = (iHashCode5 + (coachmark == null ? 0 : coachmark.hashCode())) * 31;
            InflightPaymentData inflightPaymentData = this.h;
            return iHashCode6 + (inflightPaymentData != null ? inflightPaymentData.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("WalletHomePage(title=", this.f20666a, ", content=", this.b, ", action=");
            sbV.append(this.c);
            sbV.append(", showWalletBadge=");
            sbV.append(this.d);
            sbV.append(", showCardTabBadge=");
            sbV.append(this.e);
            sbV.append(", tooltip=");
            sbV.append(this.f);
            sbV.append(", coachmark=");
            sbV.append(this.g);
            sbV.append(", inflightPaymentData=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RewardsCardHomePageQuery_ResponseAdapter.Data.f20679a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query RewardsCardHomePage($withRedemptionUnlock: Boolean!, $withInflightBanner: Boolean!, $paymentSessionId: ID, $withProductTourCoachmark: Boolean!, $withCustomerProfileManager: Boolean!) { rewardsHomePage { balance { redemptionSettings { redemptionIcon label value altText redemptionUnlock @include(if: $withRedemptionUnlock) { coachMarkText iconUrl unlockConfirmation { iconUrl headerImage { assetType assetUrl assetWidth assetHeight fit } title showAnimation content button { loadingStateLabel sliderLabel label iconUrl } analyticsLabel callToAction { label url } showUnlock } } } fuelVouchers { label numberOfVouchers } displayName } } walletHomePage(sessionId: $paymentSessionId) { title content action showWalletBadge showCardTabBadge tooltip coachmark @include(if: $withProductTourCoachmark) { id bannerImage { assetType assetUrl assetWidth assetHeight fit altText } contentTitle contentBody primaryCTA { label url } } inflightPaymentData @include(if: $withInflightBanner) { iconUrl bannerMessage snackbarMessage } } showCustomerValuePropositions @skip(if: $withCustomerProfileManager) }";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RewardsCardHomePageQuery);
    }

    public final int hashCode() {
        Boolean.hashCode(false);
        Boolean.hashCode(false);
        throw null;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "cdf279628a12584b101849204ed72f30db8a88bddcde75a5e37c86712085e3c0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RewardsCardHomePage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("withRedemptionUnlock");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        Boolean bool = Boolean.FALSE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("withInflightBanner");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("withProductTourCoachmark");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("withCustomerProfileManager");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
    }

    public final String toString() {
        return "RewardsCardHomePageQuery(withRedemptionUnlock=false, withInflightBanner=false, paymentSessionId=null, withProductTourCoachmark=false, withCustomerProfileManager=false)";
    }
}
