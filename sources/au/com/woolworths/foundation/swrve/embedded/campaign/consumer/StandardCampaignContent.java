package au.com.woolworths.foundation.swrve.embedded.campaign.consumer;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.bundles.ui.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002¨\u0006\t"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent;", "", "Companion", "PresentationStyle", "BannerAsset", "AssetType", "AssetFit", "Cta", "$serializer", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class StandardCampaignContent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, LazyKt.a(LazyThreadSafetyMode.d, new a(23)), null, null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final String f8898a;
    public final PresentationStyle b;
    public final BannerAsset c;
    public final String d;
    public final String e;
    public final Cta f;
    public final Cta g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$AssetFit;", "", "Companion", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class AssetFit {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Object d;
        public static final AssetFit e;
        public static final AssetFit f;
        public static final /* synthetic */ AssetFit[] g;
        public static final /* synthetic */ EnumEntries h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$AssetFit$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$AssetFit;", "serializer", "()Lkotlinx/serialization/KSerializer;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer<AssetFit> serializer() {
                return (KSerializer) AssetFit.d.getD();
            }
        }

        static {
            AssetFit assetFit = new AssetFit("Center", 0);
            e = assetFit;
            AssetFit assetFit2 = new AssetFit("AssetFill", 1);
            f = assetFit2;
            AssetFit[] assetFitArr = {assetFit, assetFit2};
            g = assetFitArr;
            h = EnumEntriesKt.a(assetFitArr);
            INSTANCE = new Companion();
            d = LazyKt.a(LazyThreadSafetyMode.d, new a(24));
        }

        public static AssetFit valueOf(String str) {
            return (AssetFit) Enum.valueOf(AssetFit.class, str);
        }

        public static AssetFit[] values() {
            return (AssetFit[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$AssetType;", "", "Companion", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class AssetType {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Object d;
        public static final AssetType e;
        public static final /* synthetic */ AssetType[] f;
        public static final /* synthetic */ EnumEntries g;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$AssetType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$AssetType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer<AssetType> serializer() {
                return (KSerializer) AssetType.d.getD();
            }
        }

        static {
            AssetType assetType = new AssetType("LottieAnimation", 0);
            AssetType assetType2 = new AssetType("Image", 1);
            e = assetType2;
            AssetType[] assetTypeArr = {assetType, assetType2};
            f = assetTypeArr;
            g = EnumEntriesKt.a(assetTypeArr);
            INSTANCE = new Companion();
            d = LazyKt.a(LazyThreadSafetyMode.d, new a(25));
        }

        public static AssetType valueOf(String str) {
            return (AssetType) Enum.valueOf(AssetType.class, str);
        }

        public static AssetType[] values() {
            return (AssetType[]) f.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$BannerAsset;", "", "Companion", "$serializer", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class BannerAsset {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f;

        /* renamed from: a, reason: collision with root package name */
        public final AssetType f8902a;
        public final String b;
        public final int c;
        public final int d;
        public final AssetFit e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$BannerAsset$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$BannerAsset;", "serializer", "()Lkotlinx/serialization/KSerializer;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<BannerAsset> serializer() {
                return StandardCampaignContent$BannerAsset$$serializer.f8900a;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
            f = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new a(26)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new a(27))};
        }

        public /* synthetic */ BannerAsset(int i, AssetType assetType, String str, int i2, int i3, AssetFit assetFit) {
            if (31 != (i & 31)) {
                PluginExceptionsKt.a(i, 31, StandardCampaignContent$BannerAsset$$serializer.f8900a.getDescriptor());
                throw null;
            }
            this.f8902a = assetType;
            this.b = str;
            this.c = i2;
            this.d = i3;
            this.e = assetFit;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerAsset)) {
                return false;
            }
            BannerAsset bannerAsset = (BannerAsset) obj;
            return this.f8902a == bannerAsset.f8902a && Intrinsics.c(this.b, bannerAsset.b) && this.c == bannerAsset.c && this.d == bannerAsset.d && this.e == bannerAsset.e;
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f8902a.hashCode() * 31, 31, this.b), 31), 31);
            AssetFit assetFit = this.e;
            return iA + (assetFit == null ? 0 : assetFit.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BannerAsset(assetType=");
            sb.append(this.f8902a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            YU.a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }

        public BannerAsset(int i, int i2, AssetFit assetFit) {
            this.f8902a = AssetType.e;
            this.b = "";
            this.c = i;
            this.d = i2;
            this.e = assetFit;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<StandardCampaignContent> serializer() {
            return StandardCampaignContent$$serializer.f8899a;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$Cta;", "", "Companion", "$serializer", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Cta {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name */
        public final String f8903a;
        public final String b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$Cta$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$Cta;", "serializer", "()Lkotlinx/serialization/KSerializer;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<Cta> serializer() {
                return StandardCampaignContent$Cta$$serializer.f8901a;
            }
        }

        public /* synthetic */ Cta(int i, String str, String str2) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.a(i, 3, StandardCampaignContent$Cta$$serializer.f8901a.getDescriptor());
                throw null;
            }
            this.f8903a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f8903a, cta.f8903a) && Intrinsics.c(this.b, cta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f8903a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("Cta(label=", this.f8903a, ", url=", this.b, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$PresentationStyle;", "", "Companion", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final class PresentationStyle {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Object d;
        public static final PresentationStyle e;
        public static final /* synthetic */ PresentationStyle[] f;
        public static final /* synthetic */ EnumEntries g;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$PresentationStyle$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/swrve/embedded/campaign/consumer/StandardCampaignContent$PresentationStyle;", "serializer", "()Lkotlinx/serialization/KSerializer;", "embedded-campaign_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @NotNull
            public final KSerializer<PresentationStyle> serializer() {
                return (KSerializer) PresentationStyle.d.getD();
            }
        }

        static {
            PresentationStyle presentationStyle = new PresentationStyle("BottomSheet", 0);
            e = presentationStyle;
            PresentationStyle[] presentationStyleArr = {presentationStyle, new PresentationStyle("Popup", 1)};
            f = presentationStyleArr;
            g = EnumEntriesKt.a(presentationStyleArr);
            INSTANCE = new Companion();
            d = LazyKt.a(LazyThreadSafetyMode.d, new a(28));
        }

        public static PresentationStyle valueOf(String str) {
            return (PresentationStyle) Enum.valueOf(PresentationStyle.class, str);
        }

        public static PresentationStyle[] values() {
            return (PresentationStyle[]) f.clone();
        }
    }

    public /* synthetic */ StandardCampaignContent(int i, String str, PresentationStyle presentationStyle, BannerAsset bannerAsset, String str2, String str3, Cta cta, Cta cta2) {
        if (126 != (i & 126)) {
            PluginExceptionsKt.a(i, 126, StandardCampaignContent$$serializer.f8899a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f8898a = "";
        } else {
            this.f8898a = str;
        }
        this.b = presentationStyle;
        this.c = bannerAsset;
        this.d = str2;
        this.e = str3;
        this.f = cta;
        this.g = cta2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StandardCampaignContent)) {
            return false;
        }
        StandardCampaignContent standardCampaignContent = (StandardCampaignContent) obj;
        return Intrinsics.c(this.f8898a, standardCampaignContent.f8898a) && this.b == standardCampaignContent.b && Intrinsics.c(this.c, standardCampaignContent.c) && Intrinsics.c(this.d, standardCampaignContent.d) && Intrinsics.c(this.e, standardCampaignContent.e) && Intrinsics.c(this.f, standardCampaignContent.f) && Intrinsics.c(this.g, standardCampaignContent.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f8898a.hashCode() * 31)) * 31;
        BannerAsset bannerAsset = this.c;
        int iC = b.c(b.c((iHashCode + (bannerAsset == null ? 0 : bannerAsset.hashCode())) * 31, 31, this.d), 31, this.e);
        Cta cta = this.f;
        int iHashCode2 = (iC + (cta == null ? 0 : cta.hashCode())) * 31;
        Cta cta2 = this.g;
        return iHashCode2 + (cta2 != null ? cta2.hashCode() : 0);
    }

    public final String toString() {
        return "StandardCampaignContent(swrveCampaignCode=" + this.f8898a + ", presentationStyle=" + this.b + ", bannerAsset=" + this.c + ", title=" + this.d + ", body=" + this.e + ", primaryCta=" + this.f + ", secondaryCta=" + this.g + ")";
    }
}
