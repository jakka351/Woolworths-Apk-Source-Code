package au.com.woolworths.foundation.rewards.offers.model;

import YU.a;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.rewards.base.data.IconAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow;", "", "OfferDetailsTrackerComboRow", "MarkdownTextItem", "SubheadTextItem", "OfferDetailsInfoItem", "ImageWithAlt", "DownloadableAssetWrapper", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$DownloadableAssetWrapper;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$ImageWithAlt;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$MarkdownTextItem;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$OfferDetailsInfoItem;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$OfferDetailsTrackerComboRow;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$SubheadTextItem;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OfferDetailsCardRow {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$DownloadableAssetWrapper;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DownloadableAssetWrapper implements OfferDetailsCardRow {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAsset f8604a;

        public DownloadableAssetWrapper(DownloadableAsset downloadableAsset) {
            this.f8604a = downloadableAsset;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DownloadableAssetWrapper) && Intrinsics.c(this.f8604a, ((DownloadableAssetWrapper) obj).f8604a);
        }

        public final int hashCode() {
            return this.f8604a.hashCode();
        }

        public final String toString() {
            return "DownloadableAssetWrapper(downloadableAsset=" + this.f8604a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$ImageWithAlt;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageWithAlt implements OfferDetailsCardRow {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ImageWithAlt);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ImageWithAlt(imageUrl=null)";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$MarkdownTextItem;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarkdownTextItem implements OfferDetailsCardRow {

        /* renamed from: a, reason: collision with root package name */
        public final String f8605a;

        public MarkdownTextItem(String str) {
            this.f8605a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarkdownTextItem) && Intrinsics.c(this.f8605a, ((MarkdownTextItem) obj).f8605a);
        }

        public final int hashCode() {
            return this.f8605a.hashCode();
        }

        public final String toString() {
            return a.h("MarkdownTextItem(content=", this.f8605a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$OfferDetailsInfoItem;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsInfoItem implements OfferDetailsCardRow {

        /* renamed from: a, reason: collision with root package name */
        public final IconAsset f8606a;
        public final String b;

        public OfferDetailsInfoItem(IconAsset iconAsset, String str) {
            this.f8606a = iconAsset;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetailsInfoItem)) {
                return false;
            }
            OfferDetailsInfoItem offerDetailsInfoItem = (OfferDetailsInfoItem) obj;
            return Intrinsics.c(this.f8606a, offerDetailsInfoItem.f8606a) && Intrinsics.c(this.b, offerDetailsInfoItem.b);
        }

        public final int hashCode() {
            IconAsset iconAsset = this.f8606a;
            int iHashCode = (iconAsset == null ? 0 : iconAsset.hashCode()) * 31;
            String str = this.b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "OfferDetailsInfoItem(infoLeadingAsset=" + this.f8606a + ", infoDescription=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$OfferDetailsTrackerComboRow;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsTrackerComboRow implements OfferDetailsCardRow {

        /* renamed from: a, reason: collision with root package name */
        public final OfferDetailsTrackerRow f8607a;
        public final OfferDetailsTrackerProgressRow b;
        public final String c;

        public OfferDetailsTrackerComboRow(OfferDetailsTrackerRow offerDetailsTrackerRow, OfferDetailsTrackerProgressRow offerDetailsTrackerProgressRow, String str) {
            this.f8607a = offerDetailsTrackerRow;
            this.b = offerDetailsTrackerProgressRow;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetailsTrackerComboRow)) {
                return false;
            }
            OfferDetailsTrackerComboRow offerDetailsTrackerComboRow = (OfferDetailsTrackerComboRow) obj;
            return Intrinsics.c(this.f8607a, offerDetailsTrackerComboRow.f8607a) && Intrinsics.c(this.b, offerDetailsTrackerComboRow.b) && Intrinsics.c(this.c, offerDetailsTrackerComboRow.c);
        }

        public final int hashCode() {
            OfferDetailsTrackerRow offerDetailsTrackerRow = this.f8607a;
            int iHashCode = (offerDetailsTrackerRow == null ? 0 : offerDetailsTrackerRow.hashCode()) * 31;
            OfferDetailsTrackerProgressRow offerDetailsTrackerProgressRow = this.b;
            return this.c.hashCode() + ((iHashCode + (offerDetailsTrackerProgressRow != null ? offerDetailsTrackerProgressRow.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OfferDetailsTrackerComboRow(trackerRow=");
            sb.append(this.f8607a);
            sb.append(", progressRow=");
            sb.append(this.b);
            sb.append(", altText=");
            return a.o(sb, this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow$SubheadTextItem;", "Lau/com/woolworths/foundation/rewards/offers/model/OfferDetailsCardRow;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubheadTextItem implements OfferDetailsCardRow {

        /* renamed from: a, reason: collision with root package name */
        public final String f8608a;

        public SubheadTextItem(String str) {
            this.f8608a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubheadTextItem) && Intrinsics.c(this.f8608a, ((SubheadTextItem) obj).f8608a);
        }

        public final int hashCode() {
            return this.f8608a.hashCode();
        }

        public final String toString() {
            return a.h("SubheadTextItem(content=", this.f8608a, ")");
        }
    }
}
