package com.woolworths.rewards.offers.details.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.LocalAssetIconName;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Row", "OnOfferDetailsTrackerComboRow", "TrackerRow", "RowLeadingAsset", "OnLocalAsset", "OnHostedIcon", "RowTrailingElement", "OnOfferDetailsTrackerTrailingElementLabel", "OnOfferDetailsTrackerTrailingElementPoints", "ProgressRow", "ProgressRowCircularIndicator", "PrimaryRing", "OnMarkdownTextItem", "OnSubheadTextItem", "OnOfferDetailsInfoItem", "InfoLeadingAsset", "OnLocalAsset1", "OnHostedIcon1", "OnDownloadableAsset", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OfferDetailsCardFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20802a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$InfoLeadingAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoLeadingAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f20803a;
        public final OnLocalAsset1 b;
        public final OnHostedIcon1 c;

        public InfoLeadingAsset(String __typename, OnLocalAsset1 onLocalAsset1, OnHostedIcon1 onHostedIcon1) {
            Intrinsics.h(__typename, "__typename");
            this.f20803a = __typename;
            this.b = onLocalAsset1;
            this.c = onHostedIcon1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoLeadingAsset)) {
                return false;
            }
            InfoLeadingAsset infoLeadingAsset = (InfoLeadingAsset) obj;
            return Intrinsics.c(this.f20803a, infoLeadingAsset.f20803a) && Intrinsics.c(this.b, infoLeadingAsset.b) && Intrinsics.c(this.c, infoLeadingAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20803a.hashCode() * 31;
            OnLocalAsset1 onLocalAsset1 = this.b;
            int iHashCode2 = (iHashCode + (onLocalAsset1 == null ? 0 : onLocalAsset1.f20808a.hashCode())) * 31;
            OnHostedIcon1 onHostedIcon1 = this.c;
            return iHashCode2 + (onHostedIcon1 != null ? onHostedIcon1.f20806a.hashCode() : 0);
        }

        public final String toString() {
            return "InfoLeadingAsset(__typename=" + this.f20803a + ", onLocalAsset=" + this.b + ", onHostedIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnDownloadableAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDownloadableAsset {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f20804a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public OnDownloadableAsset(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f20804a = downloadableAssetType;
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
            if (!(obj instanceof OnDownloadableAsset)) {
                return false;
            }
            OnDownloadableAsset onDownloadableAsset = (OnDownloadableAsset) obj;
            return this.f20804a == onDownloadableAsset.f20804a && Intrinsics.c(this.b, onDownloadableAsset.b) && this.c == onDownloadableAsset.c && this.d == onDownloadableAsset.d && this.e == onDownloadableAsset.e && Intrinsics.c(this.f, onDownloadableAsset.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f20804a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnDownloadableAsset(assetType=");
            sb.append(this.f20804a);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnHostedIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20805a;

        public OnHostedIcon(String str) {
            this.f20805a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f20805a, ((OnHostedIcon) obj).f20805a);
        }

        public final int hashCode() {
            return this.f20805a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f20805a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnHostedIcon1;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20806a;

        public OnHostedIcon1(String str) {
            this.f20806a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon1) && Intrinsics.c(this.f20806a, ((OnHostedIcon1) obj).f20806a);
        }

        public final int hashCode() {
            return this.f20806a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon1(url=", this.f20806a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnLocalAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLocalAsset {

        /* renamed from: a, reason: collision with root package name */
        public final LocalAssetIconName f20807a;

        public OnLocalAsset(LocalAssetIconName localAssetIconName) {
            this.f20807a = localAssetIconName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLocalAsset) && this.f20807a == ((OnLocalAsset) obj).f20807a;
        }

        public final int hashCode() {
            return this.f20807a.hashCode();
        }

        public final String toString() {
            return "OnLocalAsset(iconName=" + this.f20807a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnLocalAsset1;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLocalAsset1 {

        /* renamed from: a, reason: collision with root package name */
        public final LocalAssetIconName f20808a;

        public OnLocalAsset1(LocalAssetIconName localAssetIconName) {
            this.f20808a = localAssetIconName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLocalAsset1) && this.f20808a == ((OnLocalAsset1) obj).f20808a;
        }

        public final int hashCode() {
            return this.f20808a.hashCode();
        }

        public final String toString() {
            return "OnLocalAsset1(iconName=" + this.f20808a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnMarkdownTextItem;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMarkdownTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20809a;

        public OnMarkdownTextItem(String str) {
            this.f20809a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMarkdownTextItem) && Intrinsics.c(this.f20809a, ((OnMarkdownTextItem) obj).f20809a);
        }

        public final int hashCode() {
            return this.f20809a.hashCode();
        }

        public final String toString() {
            return a.h("OnMarkdownTextItem(content=", this.f20809a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnOfferDetailsInfoItem;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferDetailsInfoItem {

        /* renamed from: a, reason: collision with root package name */
        public final InfoLeadingAsset f20810a;
        public final String b;

        public OnOfferDetailsInfoItem(InfoLeadingAsset infoLeadingAsset, String str) {
            this.f20810a = infoLeadingAsset;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferDetailsInfoItem)) {
                return false;
            }
            OnOfferDetailsInfoItem onOfferDetailsInfoItem = (OnOfferDetailsInfoItem) obj;
            return Intrinsics.c(this.f20810a, onOfferDetailsInfoItem.f20810a) && Intrinsics.c(this.b, onOfferDetailsInfoItem.b);
        }

        public final int hashCode() {
            InfoLeadingAsset infoLeadingAsset = this.f20810a;
            int iHashCode = (infoLeadingAsset == null ? 0 : infoLeadingAsset.hashCode()) * 31;
            String str = this.b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "OnOfferDetailsInfoItem(infoLeadingAsset=" + this.f20810a + ", infoDescription=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnOfferDetailsTrackerComboRow;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferDetailsTrackerComboRow {

        /* renamed from: a, reason: collision with root package name */
        public final TrackerRow f20811a;
        public final ProgressRow b;
        public final String c;

        public OnOfferDetailsTrackerComboRow(TrackerRow trackerRow, ProgressRow progressRow, String str) {
            this.f20811a = trackerRow;
            this.b = progressRow;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferDetailsTrackerComboRow)) {
                return false;
            }
            OnOfferDetailsTrackerComboRow onOfferDetailsTrackerComboRow = (OnOfferDetailsTrackerComboRow) obj;
            return Intrinsics.c(this.f20811a, onOfferDetailsTrackerComboRow.f20811a) && Intrinsics.c(this.b, onOfferDetailsTrackerComboRow.b) && Intrinsics.c(this.c, onOfferDetailsTrackerComboRow.c);
        }

        public final int hashCode() {
            TrackerRow trackerRow = this.f20811a;
            int iHashCode = (trackerRow == null ? 0 : trackerRow.hashCode()) * 31;
            ProgressRow progressRow = this.b;
            return this.c.hashCode() + ((iHashCode + (progressRow != null ? progressRow.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnOfferDetailsTrackerComboRow(trackerRow=");
            sb.append(this.f20811a);
            sb.append(", progressRow=");
            sb.append(this.b);
            sb.append(", comboRowAltText=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnOfferDetailsTrackerTrailingElementLabel;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferDetailsTrackerTrailingElementLabel {

        /* renamed from: a, reason: collision with root package name */
        public final String f20812a;

        public OnOfferDetailsTrackerTrailingElementLabel(String str) {
            this.f20812a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOfferDetailsTrackerTrailingElementLabel) && Intrinsics.c(this.f20812a, ((OnOfferDetailsTrackerTrailingElementLabel) obj).f20812a);
        }

        public final int hashCode() {
            return this.f20812a.hashCode();
        }

        public final String toString() {
            return a.h("OnOfferDetailsTrackerTrailingElementLabel(elementLabel=", this.f20812a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnOfferDetailsTrackerTrailingElementPoints;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferDetailsTrackerTrailingElementPoints {

        /* renamed from: a, reason: collision with root package name */
        public final String f20813a;
        public final String b;

        public OnOfferDetailsTrackerTrailingElementPoints(String str, String str2) {
            this.f20813a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferDetailsTrackerTrailingElementPoints)) {
                return false;
            }
            OnOfferDetailsTrackerTrailingElementPoints onOfferDetailsTrackerTrailingElementPoints = (OnOfferDetailsTrackerTrailingElementPoints) obj;
            return Intrinsics.c(this.f20813a, onOfferDetailsTrackerTrailingElementPoints.f20813a) && Intrinsics.c(this.b, onOfferDetailsTrackerTrailingElementPoints.b);
        }

        public final int hashCode() {
            String str = this.f20813a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return a.j("OnOfferDetailsTrackerTrailingElementPoints(pointsPrefix=", this.f20813a, ", pointsLabel=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$OnSubheadTextItem;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSubheadTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f20814a;

        public OnSubheadTextItem(String str) {
            this.f20814a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSubheadTextItem) && Intrinsics.c(this.f20814a, ((OnSubheadTextItem) obj).f20814a);
        }

        public final int hashCode() {
            return this.f20814a.hashCode();
        }

        public final String toString() {
            return a.h("OnSubheadTextItem(content=", this.f20814a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$PrimaryRing;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryRing {

        /* renamed from: a, reason: collision with root package name */
        public final double f20815a;
        public final String b;

        public PrimaryRing(double d, String str) {
            this.f20815a = d;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryRing)) {
                return false;
            }
            PrimaryRing primaryRing = (PrimaryRing) obj;
            return Double.compare(this.f20815a, primaryRing.f20815a) == 0 && Intrinsics.c(this.b, primaryRing.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Double.hashCode(this.f20815a) * 31);
        }

        public final String toString() {
            return "PrimaryRing(ringPercent=" + this.f20815a + ", ringColor=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$ProgressRow;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProgressRow {

        /* renamed from: a, reason: collision with root package name */
        public final String f20816a;
        public final String b;
        public final ProgressRowCircularIndicator c;

        public ProgressRow(String str, String str2, ProgressRowCircularIndicator progressRowCircularIndicator) {
            this.f20816a = str;
            this.b = str2;
            this.c = progressRowCircularIndicator;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressRow)) {
                return false;
            }
            ProgressRow progressRow = (ProgressRow) obj;
            return Intrinsics.c(this.f20816a, progressRow.f20816a) && Intrinsics.c(this.b, progressRow.b) && Intrinsics.c(this.c, progressRow.c);
        }

        public final int hashCode() {
            String str = this.f20816a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ProgressRowCircularIndicator progressRowCircularIndicator = this.c;
            return iHashCode2 + (progressRowCircularIndicator != null ? progressRowCircularIndicator.f20817a.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ProgressRow(progressRowTitle=", this.f20816a, ", progressRowDescription=", this.b, ", progressRowCircularIndicator=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$ProgressRowCircularIndicator;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProgressRowCircularIndicator {

        /* renamed from: a, reason: collision with root package name */
        public final PrimaryRing f20817a;

        public ProgressRowCircularIndicator(PrimaryRing primaryRing) {
            this.f20817a = primaryRing;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgressRowCircularIndicator) && Intrinsics.c(this.f20817a, ((ProgressRowCircularIndicator) obj).f20817a);
        }

        public final int hashCode() {
            return this.f20817a.hashCode();
        }

        public final String toString() {
            return "ProgressRowCircularIndicator(primaryRing=" + this.f20817a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$Row;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Row {

        /* renamed from: a, reason: collision with root package name */
        public final String f20818a;
        public final OnOfferDetailsTrackerComboRow b;
        public final OnMarkdownTextItem c;
        public final OnSubheadTextItem d;
        public final OnOfferDetailsInfoItem e;
        public final OnDownloadableAsset f;

        public Row(String __typename, OnOfferDetailsTrackerComboRow onOfferDetailsTrackerComboRow, OnMarkdownTextItem onMarkdownTextItem, OnSubheadTextItem onSubheadTextItem, OnOfferDetailsInfoItem onOfferDetailsInfoItem, OnDownloadableAsset onDownloadableAsset) {
            Intrinsics.h(__typename, "__typename");
            this.f20818a = __typename;
            this.b = onOfferDetailsTrackerComboRow;
            this.c = onMarkdownTextItem;
            this.d = onSubheadTextItem;
            this.e = onOfferDetailsInfoItem;
            this.f = onDownloadableAsset;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.c(this.f20818a, row.f20818a) && Intrinsics.c(this.b, row.b) && Intrinsics.c(this.c, row.c) && Intrinsics.c(this.d, row.d) && Intrinsics.c(this.e, row.e) && Intrinsics.c(this.f, row.f);
        }

        public final int hashCode() {
            int iHashCode = this.f20818a.hashCode() * 31;
            OnOfferDetailsTrackerComboRow onOfferDetailsTrackerComboRow = this.b;
            int iHashCode2 = (iHashCode + (onOfferDetailsTrackerComboRow == null ? 0 : onOfferDetailsTrackerComboRow.hashCode())) * 31;
            OnMarkdownTextItem onMarkdownTextItem = this.c;
            int iHashCode3 = (iHashCode2 + (onMarkdownTextItem == null ? 0 : onMarkdownTextItem.f20809a.hashCode())) * 31;
            OnSubheadTextItem onSubheadTextItem = this.d;
            int iHashCode4 = (iHashCode3 + (onSubheadTextItem == null ? 0 : onSubheadTextItem.f20814a.hashCode())) * 31;
            OnOfferDetailsInfoItem onOfferDetailsInfoItem = this.e;
            int iHashCode5 = (iHashCode4 + (onOfferDetailsInfoItem == null ? 0 : onOfferDetailsInfoItem.hashCode())) * 31;
            OnDownloadableAsset onDownloadableAsset = this.f;
            return iHashCode5 + (onDownloadableAsset != null ? onDownloadableAsset.hashCode() : 0);
        }

        public final String toString() {
            return "Row(__typename=" + this.f20818a + ", onOfferDetailsTrackerComboRow=" + this.b + ", onMarkdownTextItem=" + this.c + ", onSubheadTextItem=" + this.d + ", onOfferDetailsInfoItem=" + this.e + ", onDownloadableAsset=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$RowLeadingAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowLeadingAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f20819a;
        public final OnLocalAsset b;
        public final OnHostedIcon c;

        public RowLeadingAsset(String __typename, OnLocalAsset onLocalAsset, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f20819a = __typename;
            this.b = onLocalAsset;
            this.c = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowLeadingAsset)) {
                return false;
            }
            RowLeadingAsset rowLeadingAsset = (RowLeadingAsset) obj;
            return Intrinsics.c(this.f20819a, rowLeadingAsset.f20819a) && Intrinsics.c(this.b, rowLeadingAsset.b) && Intrinsics.c(this.c, rowLeadingAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20819a.hashCode() * 31;
            OnLocalAsset onLocalAsset = this.b;
            int iHashCode2 = (iHashCode + (onLocalAsset == null ? 0 : onLocalAsset.f20807a.hashCode())) * 31;
            OnHostedIcon onHostedIcon = this.c;
            return iHashCode2 + (onHostedIcon != null ? onHostedIcon.f20805a.hashCode() : 0);
        }

        public final String toString() {
            return "RowLeadingAsset(__typename=" + this.f20819a + ", onLocalAsset=" + this.b + ", onHostedIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$RowTrailingElement;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowTrailingElement {

        /* renamed from: a, reason: collision with root package name */
        public final String f20820a;
        public final OnOfferDetailsTrackerTrailingElementLabel b;
        public final OnOfferDetailsTrackerTrailingElementPoints c;

        public RowTrailingElement(String __typename, OnOfferDetailsTrackerTrailingElementLabel onOfferDetailsTrackerTrailingElementLabel, OnOfferDetailsTrackerTrailingElementPoints onOfferDetailsTrackerTrailingElementPoints) {
            Intrinsics.h(__typename, "__typename");
            this.f20820a = __typename;
            this.b = onOfferDetailsTrackerTrailingElementLabel;
            this.c = onOfferDetailsTrackerTrailingElementPoints;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowTrailingElement)) {
                return false;
            }
            RowTrailingElement rowTrailingElement = (RowTrailingElement) obj;
            return Intrinsics.c(this.f20820a, rowTrailingElement.f20820a) && Intrinsics.c(this.b, rowTrailingElement.b) && Intrinsics.c(this.c, rowTrailingElement.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20820a.hashCode() * 31;
            OnOfferDetailsTrackerTrailingElementLabel onOfferDetailsTrackerTrailingElementLabel = this.b;
            int iHashCode2 = (iHashCode + (onOfferDetailsTrackerTrailingElementLabel == null ? 0 : onOfferDetailsTrackerTrailingElementLabel.f20812a.hashCode())) * 31;
            OnOfferDetailsTrackerTrailingElementPoints onOfferDetailsTrackerTrailingElementPoints = this.c;
            return iHashCode2 + (onOfferDetailsTrackerTrailingElementPoints != null ? onOfferDetailsTrackerTrailingElementPoints.hashCode() : 0);
        }

        public final String toString() {
            return "RowTrailingElement(__typename=" + this.f20820a + ", onOfferDetailsTrackerTrailingElementLabel=" + this.b + ", onOfferDetailsTrackerTrailingElementPoints=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsCardFragment$TrackerRow;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrackerRow {

        /* renamed from: a, reason: collision with root package name */
        public final RowLeadingAsset f20821a;
        public final String b;
        public final RowTrailingElement c;

        public TrackerRow(RowLeadingAsset rowLeadingAsset, String str, RowTrailingElement rowTrailingElement) {
            this.f20821a = rowLeadingAsset;
            this.b = str;
            this.c = rowTrailingElement;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackerRow)) {
                return false;
            }
            TrackerRow trackerRow = (TrackerRow) obj;
            return Intrinsics.c(this.f20821a, trackerRow.f20821a) && Intrinsics.c(this.b, trackerRow.b) && Intrinsics.c(this.c, trackerRow.c);
        }

        public final int hashCode() {
            RowLeadingAsset rowLeadingAsset = this.f20821a;
            int iHashCode = (rowLeadingAsset == null ? 0 : rowLeadingAsset.hashCode()) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            RowTrailingElement rowTrailingElement = this.c;
            return iHashCode2 + (rowTrailingElement != null ? rowTrailingElement.hashCode() : 0);
        }

        public final String toString() {
            return "TrackerRow(rowLeadingAsset=" + this.f20821a + ", rowLabel=" + this.b + ", rowTrailingElement=" + this.c + ")";
        }
    }

    public OfferDetailsCardFragment(ArrayList arrayList) {
        this.f20802a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OfferDetailsCardFragment) && this.f20802a.equals(((OfferDetailsCardFragment) obj).f20802a);
    }

    public final int hashCode() {
        return this.f20802a.hashCode();
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.k("OfferDetailsCardFragment(rows=", ")", this.f20802a);
    }
}
