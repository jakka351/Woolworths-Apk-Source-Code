package com.woolworths.rewards.promo;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.promo.adapter.RewardsAppModalQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/promo/RewardsAppModalQuery$Data;", "Data", "RewardsAppModal", "HeaderImage", "InfoItem", "OnFeatureInfoBulletItem", "OnFeatureInfoText", "Footer", "PrimaryCta", "SecondaryCta", "Companion", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsAppModalQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsAppModal f21057a;

        public Data(RewardsAppModal rewardsAppModal) {
            this.f21057a = rewardsAppModal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21057a, ((Data) obj).f21057a);
        }

        public final int hashCode() {
            RewardsAppModal rewardsAppModal = this.f21057a;
            if (rewardsAppModal == null) {
                return 0;
            }
            return rewardsAppModal.hashCode();
        }

        public final String toString() {
            return "Data(rewardsAppModal=" + this.f21057a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$Footer;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final PrimaryCta f21058a;
        public final SecondaryCta b;

        public Footer(PrimaryCta primaryCta, SecondaryCta secondaryCta) {
            this.f21058a = primaryCta;
            this.b = secondaryCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f21058a, footer.f21058a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21058a.hashCode() * 31;
            SecondaryCta secondaryCta = this.b;
            return iHashCode + (secondaryCta == null ? 0 : secondaryCta.hashCode());
        }

        public final String toString() {
            return "Footer(primaryCta=" + this.f21058a + ", secondaryCta=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$HeaderImage;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderImage {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f21059a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public HeaderImage(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f21059a = downloadableAssetType;
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
            if (!(obj instanceof HeaderImage)) {
                return false;
            }
            HeaderImage headerImage = (HeaderImage) obj;
            return this.f21059a == headerImage.f21059a && Intrinsics.c(this.b, headerImage.b) && this.c == headerImage.c && this.d == headerImage.d && this.e == headerImage.e && Intrinsics.c(this.f, headerImage.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f21059a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderImage(assetType=");
            sb.append(this.f21059a);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$InfoItem;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f21060a;
        public final OnFeatureInfoBulletItem b;
        public final OnFeatureInfoText c;

        public InfoItem(String __typename, OnFeatureInfoBulletItem onFeatureInfoBulletItem, OnFeatureInfoText onFeatureInfoText) {
            Intrinsics.h(__typename, "__typename");
            this.f21060a = __typename;
            this.b = onFeatureInfoBulletItem;
            this.c = onFeatureInfoText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoItem)) {
                return false;
            }
            InfoItem infoItem = (InfoItem) obj;
            return Intrinsics.c(this.f21060a, infoItem.f21060a) && Intrinsics.c(this.b, infoItem.b) && Intrinsics.c(this.c, infoItem.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21060a.hashCode() * 31;
            OnFeatureInfoBulletItem onFeatureInfoBulletItem = this.b;
            int iHashCode2 = (iHashCode + (onFeatureInfoBulletItem == null ? 0 : onFeatureInfoBulletItem.hashCode())) * 31;
            OnFeatureInfoText onFeatureInfoText = this.c;
            return iHashCode2 + (onFeatureInfoText != null ? onFeatureInfoText.f21062a.hashCode() : 0);
        }

        public final String toString() {
            return "InfoItem(__typename=" + this.f21060a + ", onFeatureInfoBulletItem=" + this.b + ", onFeatureInfoText=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$OnFeatureInfoBulletItem;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFeatureInfoBulletItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f21061a;
        public final String b;
        public final String c;

        public OnFeatureInfoBulletItem(String str, String str2, String str3) {
            this.f21061a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFeatureInfoBulletItem)) {
                return false;
            }
            OnFeatureInfoBulletItem onFeatureInfoBulletItem = (OnFeatureInfoBulletItem) obj;
            return Intrinsics.c(this.f21061a, onFeatureInfoBulletItem.f21061a) && Intrinsics.c(this.b, onFeatureInfoBulletItem.b) && Intrinsics.c(this.c, onFeatureInfoBulletItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21061a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("OnFeatureInfoBulletItem(iconUrl=", this.f21061a, ", title=", this.b, ", content="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$OnFeatureInfoText;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFeatureInfoText {

        /* renamed from: a, reason: collision with root package name */
        public final String f21062a;

        public OnFeatureInfoText(String str) {
            this.f21062a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFeatureInfoText) && Intrinsics.c(this.f21062a, ((OnFeatureInfoText) obj).f21062a);
        }

        public final int hashCode() {
            return this.f21062a.hashCode();
        }

        public final String toString() {
            return a.h("OnFeatureInfoText(markdownContent=", this.f21062a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$PrimaryCta;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f21063a;
        public final String b;

        public PrimaryCta(String str, String str2) {
            this.f21063a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryCta)) {
                return false;
            }
            PrimaryCta primaryCta = (PrimaryCta) obj;
            return Intrinsics.c(this.f21063a, primaryCta.f21063a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21063a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("PrimaryCta(label=", this.f21063a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$RewardsAppModal;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsAppModal {

        /* renamed from: a, reason: collision with root package name */
        public final HeaderImage f21064a;
        public final String b;
        public final String c;
        public final ArrayList d;
        public final Footer e;

        public RewardsAppModal(HeaderImage headerImage, String str, String str2, ArrayList arrayList, Footer footer) {
            this.f21064a = headerImage;
            this.b = str;
            this.c = str2;
            this.d = arrayList;
            this.e = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsAppModal)) {
                return false;
            }
            RewardsAppModal rewardsAppModal = (RewardsAppModal) obj;
            return Intrinsics.c(this.f21064a, rewardsAppModal.f21064a) && this.b.equals(rewardsAppModal.b) && this.c.equals(rewardsAppModal.c) && this.d.equals(rewardsAppModal.d) && Intrinsics.c(this.e, rewardsAppModal.e);
        }

        public final int hashCode() {
            HeaderImage headerImage = this.f21064a;
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(b.c((headerImage == null ? 0 : headerImage.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
            Footer footer = this.e;
            return iB + (footer != null ? footer.hashCode() : 0);
        }

        public final String toString() {
            return "RewardsAppModal(headerImage=" + this.f21064a + ", title=" + this.b + ", summary=" + this.c + ", infoItems=" + this.d + ", footer=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/RewardsAppModalQuery$SecondaryCta;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f21065a;
        public final String b;

        public SecondaryCta(String str, String str2) {
            this.f21065a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecondaryCta)) {
                return false;
            }
            SecondaryCta secondaryCta = (SecondaryCta) obj;
            return Intrinsics.c(this.f21065a, secondaryCta.f21065a) && Intrinsics.c(this.b, secondaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21065a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("SecondaryCta(label=", this.f21065a, ", url=", this.b, ")");
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RewardsAppModalQuery_ResponseAdapter.Data.f21066a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query RewardsAppModal($rewardsAppModalId: String!) { rewardsAppModal(id: $rewardsAppModalId) { headerImage { assetType assetUrl assetWidth assetHeight fit altText } title summary infoItems { __typename ... on FeatureInfoBulletItem { iconUrl title content } ... on FeatureInfoText { markdownContent } } footer { primaryCta { label url } secondaryCta { label url } } } }";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RewardsAppModalQuery);
    }

    public final int hashCode() {
        return 1082138216;
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c8f2d46cacb68619f7f30ea9163d8078b3718b97aa26fc90571c31f3165955ce";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RewardsAppModal";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("rewardsAppModalId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, "rewardsAppRedemption");
    }

    public final String toString() {
        return "RewardsAppModalQuery(rewardsAppModalId=rewardsAppRedemption)";
    }
}
