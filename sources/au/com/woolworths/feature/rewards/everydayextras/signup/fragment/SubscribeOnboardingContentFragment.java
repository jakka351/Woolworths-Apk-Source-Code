package au.com.woolworths.feature.rewards.everydayextras.signup.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "ContentItem", "OnDownloadableAsset", "OnTitleTextItem", "OnParagraphTextItem", "OnIconListItemWithNestedItems", "NestedItem", "OnNestedMarkdownContent", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscribeOnboardingContentFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f6184a;
    public final String b;
    public final ArrayList c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$ContentItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6185a;
        public final OnDownloadableAsset b;
        public final OnTitleTextItem c;
        public final OnParagraphTextItem d;
        public final OnIconListItemWithNestedItems e;

        public ContentItem(String __typename, OnDownloadableAsset onDownloadableAsset, OnTitleTextItem onTitleTextItem, OnParagraphTextItem onParagraphTextItem, OnIconListItemWithNestedItems onIconListItemWithNestedItems) {
            Intrinsics.h(__typename, "__typename");
            this.f6185a = __typename;
            this.b = onDownloadableAsset;
            this.c = onTitleTextItem;
            this.d = onParagraphTextItem;
            this.e = onIconListItemWithNestedItems;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem)) {
                return false;
            }
            ContentItem contentItem = (ContentItem) obj;
            return Intrinsics.c(this.f6185a, contentItem.f6185a) && Intrinsics.c(this.b, contentItem.b) && Intrinsics.c(this.c, contentItem.c) && Intrinsics.c(this.d, contentItem.d) && Intrinsics.c(this.e, contentItem.e);
        }

        public final int hashCode() {
            int iHashCode = this.f6185a.hashCode() * 31;
            OnDownloadableAsset onDownloadableAsset = this.b;
            int iHashCode2 = (iHashCode + (onDownloadableAsset == null ? 0 : onDownloadableAsset.hashCode())) * 31;
            OnTitleTextItem onTitleTextItem = this.c;
            int iHashCode3 = (iHashCode2 + (onTitleTextItem == null ? 0 : onTitleTextItem.hashCode())) * 31;
            OnParagraphTextItem onParagraphTextItem = this.d;
            int iHashCode4 = (iHashCode3 + (onParagraphTextItem == null ? 0 : onParagraphTextItem.hashCode())) * 31;
            OnIconListItemWithNestedItems onIconListItemWithNestedItems = this.e;
            return iHashCode4 + (onIconListItemWithNestedItems != null ? onIconListItemWithNestedItems.hashCode() : 0);
        }

        public final String toString() {
            return "ContentItem(__typename=" + this.f6185a + ", onDownloadableAsset=" + this.b + ", onTitleTextItem=" + this.c + ", onParagraphTextItem=" + this.d + ", onIconListItemWithNestedItems=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$NestedItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NestedItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6186a;
        public final OnNestedMarkdownContent b;

        public NestedItem(String __typename, OnNestedMarkdownContent onNestedMarkdownContent) {
            Intrinsics.h(__typename, "__typename");
            this.f6186a = __typename;
            this.b = onNestedMarkdownContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NestedItem)) {
                return false;
            }
            NestedItem nestedItem = (NestedItem) obj;
            return Intrinsics.c(this.f6186a, nestedItem.f6186a) && Intrinsics.c(this.b, nestedItem.b);
        }

        public final int hashCode() {
            int iHashCode = this.f6186a.hashCode() * 31;
            OnNestedMarkdownContent onNestedMarkdownContent = this.b;
            return iHashCode + (onNestedMarkdownContent == null ? 0 : onNestedMarkdownContent.hashCode());
        }

        public final String toString() {
            return "NestedItem(__typename=" + this.f6186a + ", onNestedMarkdownContent=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnDownloadableAsset;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDownloadableAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f6187a;
        public final DownloadableAssetType b;
        public final String c;
        public final int d;
        public final int e;
        public final DownloadableAssetFit f;
        public final String g;

        public OnDownloadableAsset(String str, DownloadableAssetType downloadableAssetType, String str2, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str3) {
            this.f6187a = str;
            this.b = downloadableAssetType;
            this.c = str2;
            this.d = i;
            this.e = i2;
            this.f = downloadableAssetFit;
            this.g = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDownloadableAsset)) {
                return false;
            }
            OnDownloadableAsset onDownloadableAsset = (OnDownloadableAsset) obj;
            return Intrinsics.c(this.f6187a, onDownloadableAsset.f6187a) && this.b == onDownloadableAsset.b && Intrinsics.c(this.c, onDownloadableAsset.c) && this.d == onDownloadableAsset.d && this.e == onDownloadableAsset.e && this.f == onDownloadableAsset.f && Intrinsics.c(this.g, onDownloadableAsset.g);
        }

        public final int hashCode() {
            int iA = b.a(this.e, b.a(this.d, b.c((this.b.hashCode() + (this.f6187a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.f;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.g;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnDownloadableAsset(__typename=");
            sb.append(this.f6187a);
            sb.append(", assetType=");
            sb.append(this.b);
            sb.append(", assetUrl=");
            a.x(this.d, this.c, ", assetWidth=", ", assetHeight=", sb);
            sb.append(this.e);
            sb.append(", fit=");
            sb.append(this.f);
            sb.append(", altText=");
            return a.o(sb, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnIconListItemWithNestedItems;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnIconListItemWithNestedItems {

        /* renamed from: a, reason: collision with root package name */
        public final String f6188a;
        public final String b;
        public final ArrayList c;

        public OnIconListItemWithNestedItems(String str, String str2, ArrayList arrayList) {
            this.f6188a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnIconListItemWithNestedItems)) {
                return false;
            }
            OnIconListItemWithNestedItems onIconListItemWithNestedItems = (OnIconListItemWithNestedItems) obj;
            return this.f6188a.equals(onIconListItemWithNestedItems.f6188a) && this.b.equals(onIconListItemWithNestedItems.b) && this.c.equals(onIconListItemWithNestedItems.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f6188a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnIconListItemWithNestedItems(__typename=", this.f6188a, ", iconUrl=", this.b, ", nestedItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnNestedMarkdownContent;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnNestedMarkdownContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f6189a;
        public final String b;

        public OnNestedMarkdownContent(String str, String str2) {
            this.f6189a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnNestedMarkdownContent)) {
                return false;
            }
            OnNestedMarkdownContent onNestedMarkdownContent = (OnNestedMarkdownContent) obj;
            return Intrinsics.c(this.f6189a, onNestedMarkdownContent.f6189a) && Intrinsics.c(this.b, onNestedMarkdownContent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6189a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnNestedMarkdownContent(__typename=", this.f6189a, ", content=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnParagraphTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6190a;
        public final String b;
        public final String c;

        public OnParagraphTextItem(String str, String str2, String str3) {
            this.f6190a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnParagraphTextItem)) {
                return false;
            }
            OnParagraphTextItem onParagraphTextItem = (OnParagraphTextItem) obj;
            return Intrinsics.c(this.f6190a, onParagraphTextItem.f6190a) && Intrinsics.c(this.b, onParagraphTextItem.b) && Intrinsics.c(this.c, onParagraphTextItem.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f6190a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("OnParagraphTextItem(__typename=", this.f6190a, ", content=", this.b, ", alignment="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeOnboardingContentFragment$OnTitleTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTitleTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f6191a;
        public final String b;

        public OnTitleTextItem(String str, String str2) {
            this.f6191a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTitleTextItem)) {
                return false;
            }
            OnTitleTextItem onTitleTextItem = (OnTitleTextItem) obj;
            return Intrinsics.c(this.f6191a, onTitleTextItem.f6191a) && Intrinsics.c(this.b, onTitleTextItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6191a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnTitleTextItem(__typename=", this.f6191a, ", content=", this.b, ")");
        }
    }

    public SubscribeOnboardingContentFragment(String str, String str2, ArrayList arrayList) {
        this.f6184a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeOnboardingContentFragment)) {
            return false;
        }
        SubscribeOnboardingContentFragment subscribeOnboardingContentFragment = (SubscribeOnboardingContentFragment) obj;
        return this.f6184a.equals(subscribeOnboardingContentFragment.f6184a) && this.b.equals(subscribeOnboardingContentFragment.b) && this.c.equals(subscribeOnboardingContentFragment.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f6184a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return android.support.v4.media.session.a.q(")", a.v("SubscribeOnboardingContentFragment(__typename=", this.f6184a, ", id=", this.b, ", contentItems="), this.c);
    }
}
