package com.woolworths.rewards.card;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.card.adapter.RedemptionUnlockMutation_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/rewards/card/RedemptionUnlockMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/card/RedemptionUnlockMutation$Data;", "Data", "RewardsRedemptionUnlock", "HeaderImage", "Button", "CallToAction", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RedemptionUnlockMutation implements Mutation<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RedemptionUnlockMutation$Button;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f20647a;
        public final String b;
        public final String c;

        public Button(String str, String str2, String str3) {
            this.f20647a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f20647a, button.f20647a) && Intrinsics.c(this.b, button.b) && Intrinsics.c(this.c, button.c);
        }

        public final int hashCode() {
            String str = this.f20647a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Button(loadingStateLabel=", this.f20647a, ", label=", this.b, ", iconUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RedemptionUnlockMutation$CallToAction;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CallToAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f20648a;
        public final String b;

        public CallToAction(String str, String str2) {
            this.f20648a = str;
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
            return Intrinsics.c(this.f20648a, callToAction.f20648a) && Intrinsics.c(this.b, callToAction.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20648a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("CallToAction(label=", this.f20648a, ", url=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/card/RedemptionUnlockMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RedemptionUnlockMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsRedemptionUnlock f20649a;

        public Data(RewardsRedemptionUnlock rewardsRedemptionUnlock) {
            this.f20649a = rewardsRedemptionUnlock;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20649a, ((Data) obj).f20649a);
        }

        public final int hashCode() {
            RewardsRedemptionUnlock rewardsRedemptionUnlock = this.f20649a;
            if (rewardsRedemptionUnlock == null) {
                return 0;
            }
            return rewardsRedemptionUnlock.hashCode();
        }

        public final String toString() {
            return "Data(rewardsRedemptionUnlock=" + this.f20649a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RedemptionUnlockMutation$HeaderImage;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderImage {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f20650a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;

        public HeaderImage(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit) {
            this.f20650a = downloadableAssetType;
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
            return this.f20650a == headerImage.f20650a && Intrinsics.c(this.b, headerImage.b) && this.c == headerImage.c && this.d == headerImage.d && this.e == headerImage.e;
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f20650a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            return iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeaderImage(assetType=");
            sb.append(this.f20650a);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/RedemptionUnlockMutation$RewardsRedemptionUnlock;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsRedemptionUnlock {

        /* renamed from: a, reason: collision with root package name */
        public final String f20651a;
        public final HeaderImage b;
        public final String c;
        public final boolean d;
        public final String e;
        public final Button f;
        public final String g;
        public final CallToAction h;
        public final Boolean i;

        public RewardsRedemptionUnlock(String str, HeaderImage headerImage, String str2, boolean z, String str3, Button button, String str4, CallToAction callToAction, Boolean bool) {
            this.f20651a = str;
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
            if (!(obj instanceof RewardsRedemptionUnlock)) {
                return false;
            }
            RewardsRedemptionUnlock rewardsRedemptionUnlock = (RewardsRedemptionUnlock) obj;
            return Intrinsics.c(this.f20651a, rewardsRedemptionUnlock.f20651a) && Intrinsics.c(this.b, rewardsRedemptionUnlock.b) && Intrinsics.c(this.c, rewardsRedemptionUnlock.c) && this.d == rewardsRedemptionUnlock.d && Intrinsics.c(this.e, rewardsRedemptionUnlock.e) && Intrinsics.c(this.f, rewardsRedemptionUnlock.f) && Intrinsics.c(this.g, rewardsRedemptionUnlock.g) && Intrinsics.c(this.h, rewardsRedemptionUnlock.h) && Intrinsics.c(this.i, rewardsRedemptionUnlock.i);
        }

        public final int hashCode() {
            int iC = b.c((this.f.hashCode() + b.c(b.e(b.c((this.b.hashCode() + (this.f20651a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
            CallToAction callToAction = this.h;
            int iHashCode = (iC + (callToAction == null ? 0 : callToAction.hashCode())) * 31;
            Boolean bool = this.i;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RewardsRedemptionUnlock(iconUrl=");
            sb.append(this.f20651a);
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

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RedemptionUnlockMutation_ResponseAdapter.Data.f20671a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RedemptionUnlock { rewardsRedemptionUnlock { iconUrl headerImage { assetType assetUrl assetWidth assetHeight fit } title showAnimation content button { loadingStateLabel label iconUrl } analyticsLabel callToAction { label url } showUnlock } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == RedemptionUnlockMutation.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(RedemptionUnlockMutation.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "0a2b72d6592603dfdb539ff8181e65e98d7048ca7777ad339b9c49d79df477bf";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RedemptionUnlock";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
