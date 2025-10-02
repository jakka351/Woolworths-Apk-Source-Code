package au.com.woolworths.rewards.base.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.ContentCta$$serializer;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.android.onesite.data.DownloadableAsset$$serializer;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002GHB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012B}\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0017J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'Jx\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\u0014J\u0013\u00106\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0014HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0014J%\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\bFR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'¨\u0006I"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation;", "Landroid/os/Parcelable;", "iconUrl", "", "headerImage", "Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "title", "content", "showAnimation", "", "button", "Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockButton;", "analyticsLabel", "callToAction", "Lau/com/woolworths/android/onesite/data/ContentCta;", "secondaryCta", "showUnlock", "<init>", "(Ljava/lang/String;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Ljava/lang/String;Ljava/lang/String;ZLau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockButton;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Ljava/lang/Boolean;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Ljava/lang/String;Ljava/lang/String;ZLau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockButton;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIconUrl", "()Ljava/lang/String;", "getHeaderImage", "()Lau/com/woolworths/android/onesite/data/DownloadableAsset;", "getTitle", "getContent", "getShowAnimation", "()Z", "getButton", "()Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockButton;", "getAnalyticsLabel", "getCallToAction", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "getSecondaryCta", "getShowUnlock", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lau/com/woolworths/android/onesite/data/DownloadableAsset;Ljava/lang/String;Ljava/lang/String;ZLau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockButton;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lau/com/woolworths/android/onesite/data/ContentCta;Ljava/lang/Boolean;)Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$base_rewards_app_release", "$serializer", "Companion", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class RewardsRedemptionUnlockConfirmation implements Parcelable {

    @SerializedName("analyticsLabel")
    @NotNull
    private final String analyticsLabel;

    @SerializedName("button")
    @NotNull
    private final RewardsRedemptionUnlockButton button;

    @SerializedName("callToAction")
    @Nullable
    private final ContentCta callToAction;

    @SerializedName("content")
    @NotNull
    private final String content;

    @SerializedName("headerImage")
    @NotNull
    private final DownloadableAsset headerImage;

    @SerializedName("iconUrl")
    @NotNull
    private final String iconUrl;

    @SerializedName("secondaryCta")
    @Nullable
    private final ContentCta secondaryCta;

    @SerializedName("showAnimation")
    private final boolean showAnimation;

    @SerializedName("showUnlock")
    @Nullable
    private final Boolean showUnlock;

    @SerializedName("title")
    @NotNull
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RewardsRedemptionUnlockConfirmation> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RewardsRedemptionUnlockConfirmation> serializer() {
            return RewardsRedemptionUnlockConfirmation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsRedemptionUnlockConfirmation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsRedemptionUnlockConfirmation createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            DownloadableAsset downloadableAsset = (DownloadableAsset) parcel.readParcelable(RewardsRedemptionUnlockConfirmation.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            RewardsRedemptionUnlockButton rewardsRedemptionUnlockButtonCreateFromParcel = RewardsRedemptionUnlockButton.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            ContentCta contentCta = (ContentCta) parcel.readParcelable(RewardsRedemptionUnlockConfirmation.class.getClassLoader());
            ContentCta contentCta2 = (ContentCta) parcel.readParcelable(RewardsRedemptionUnlockConfirmation.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RewardsRedemptionUnlockConfirmation(string, downloadableAsset, string2, string3, z, rewardsRedemptionUnlockButtonCreateFromParcel, string4, contentCta, contentCta2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsRedemptionUnlockConfirmation[] newArray(int i) {
            return new RewardsRedemptionUnlockConfirmation[i];
        }
    }

    public /* synthetic */ RewardsRedemptionUnlockConfirmation(int i, String str, DownloadableAsset downloadableAsset, String str2, String str3, boolean z, RewardsRedemptionUnlockButton rewardsRedemptionUnlockButton, String str4, ContentCta contentCta, ContentCta contentCta2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.a(i, 1023, RewardsRedemptionUnlockConfirmation$$serializer.INSTANCE.getB());
            throw null;
        }
        this.iconUrl = str;
        this.headerImage = downloadableAsset;
        this.title = str2;
        this.content = str3;
        this.showAnimation = z;
        this.button = rewardsRedemptionUnlockButton;
        this.analyticsLabel = str4;
        this.callToAction = contentCta;
        this.secondaryCta = contentCta2;
        this.showUnlock = bool;
    }

    public static /* synthetic */ RewardsRedemptionUnlockConfirmation copy$default(RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation, String str, DownloadableAsset downloadableAsset, String str2, String str3, boolean z, RewardsRedemptionUnlockButton rewardsRedemptionUnlockButton, String str4, ContentCta contentCta, ContentCta contentCta2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsRedemptionUnlockConfirmation.iconUrl;
        }
        if ((i & 2) != 0) {
            downloadableAsset = rewardsRedemptionUnlockConfirmation.headerImage;
        }
        if ((i & 4) != 0) {
            str2 = rewardsRedemptionUnlockConfirmation.title;
        }
        if ((i & 8) != 0) {
            str3 = rewardsRedemptionUnlockConfirmation.content;
        }
        if ((i & 16) != 0) {
            z = rewardsRedemptionUnlockConfirmation.showAnimation;
        }
        if ((i & 32) != 0) {
            rewardsRedemptionUnlockButton = rewardsRedemptionUnlockConfirmation.button;
        }
        if ((i & 64) != 0) {
            str4 = rewardsRedemptionUnlockConfirmation.analyticsLabel;
        }
        if ((i & 128) != 0) {
            contentCta = rewardsRedemptionUnlockConfirmation.callToAction;
        }
        if ((i & 256) != 0) {
            contentCta2 = rewardsRedemptionUnlockConfirmation.secondaryCta;
        }
        if ((i & 512) != 0) {
            bool = rewardsRedemptionUnlockConfirmation.showUnlock;
        }
        ContentCta contentCta3 = contentCta2;
        Boolean bool2 = bool;
        String str5 = str4;
        ContentCta contentCta4 = contentCta;
        boolean z2 = z;
        RewardsRedemptionUnlockButton rewardsRedemptionUnlockButton2 = rewardsRedemptionUnlockButton;
        return rewardsRedemptionUnlockConfirmation.copy(str, downloadableAsset, str2, str3, z2, rewardsRedemptionUnlockButton2, str5, contentCta4, contentCta3, bool2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$base_rewards_app_release(RewardsRedemptionUnlockConfirmation self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.iconUrl);
        output.F(serialDesc, 1, DownloadableAsset$$serializer.f4241a, self.headerImage);
        output.p(serialDesc, 2, self.title);
        output.p(serialDesc, 3, self.content);
        output.o(serialDesc, 4, self.showAnimation);
        output.F(serialDesc, 5, RewardsRedemptionUnlockButton$$serializer.INSTANCE, self.button);
        output.p(serialDesc, 6, self.analyticsLabel);
        ContentCta$$serializer contentCta$$serializer = ContentCta$$serializer.f4240a;
        output.w(serialDesc, 7, contentCta$$serializer, self.callToAction);
        output.w(serialDesc, 8, contentCta$$serializer, self.secondaryCta);
        output.w(serialDesc, 9, BooleanSerializer.f24779a, self.showUnlock);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getShowUnlock() {
        return this.showUnlock;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DownloadableAsset getHeaderImage() {
        return this.headerImage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowAnimation() {
        return this.showAnimation;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final RewardsRedemptionUnlockButton getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final ContentCta getCallToAction() {
        return this.callToAction;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final ContentCta getSecondaryCta() {
        return this.secondaryCta;
    }

    @NotNull
    public final RewardsRedemptionUnlockConfirmation copy(@NotNull String iconUrl, @NotNull DownloadableAsset headerImage, @NotNull String title, @NotNull String content, boolean showAnimation, @NotNull RewardsRedemptionUnlockButton button, @NotNull String analyticsLabel, @Nullable ContentCta callToAction, @Nullable ContentCta secondaryCta, @Nullable Boolean showUnlock) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(headerImage, "headerImage");
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        Intrinsics.h(button, "button");
        Intrinsics.h(analyticsLabel, "analyticsLabel");
        return new RewardsRedemptionUnlockConfirmation(iconUrl, headerImage, title, content, showAnimation, button, analyticsLabel, callToAction, secondaryCta, showUnlock);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsRedemptionUnlockConfirmation)) {
            return false;
        }
        RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation = (RewardsRedemptionUnlockConfirmation) other;
        return Intrinsics.c(this.iconUrl, rewardsRedemptionUnlockConfirmation.iconUrl) && Intrinsics.c(this.headerImage, rewardsRedemptionUnlockConfirmation.headerImage) && Intrinsics.c(this.title, rewardsRedemptionUnlockConfirmation.title) && Intrinsics.c(this.content, rewardsRedemptionUnlockConfirmation.content) && this.showAnimation == rewardsRedemptionUnlockConfirmation.showAnimation && Intrinsics.c(this.button, rewardsRedemptionUnlockConfirmation.button) && Intrinsics.c(this.analyticsLabel, rewardsRedemptionUnlockConfirmation.analyticsLabel) && Intrinsics.c(this.callToAction, rewardsRedemptionUnlockConfirmation.callToAction) && Intrinsics.c(this.secondaryCta, rewardsRedemptionUnlockConfirmation.secondaryCta) && Intrinsics.c(this.showUnlock, rewardsRedemptionUnlockConfirmation.showUnlock);
    }

    @NotNull
    public final String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    @NotNull
    public final RewardsRedemptionUnlockButton getButton() {
        return this.button;
    }

    @Nullable
    public final ContentCta getCallToAction() {
        return this.callToAction;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final DownloadableAsset getHeaderImage() {
        return this.headerImage;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final ContentCta getSecondaryCta() {
        return this.secondaryCta;
    }

    public final boolean getShowAnimation() {
        return this.showAnimation;
    }

    @Nullable
    public final Boolean getShowUnlock() {
        return this.showUnlock;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = b.c((this.button.hashCode() + b.e(b.c(b.c((this.headerImage.hashCode() + (this.iconUrl.hashCode() * 31)) * 31, 31, this.title), 31, this.content), 31, this.showAnimation)) * 31, 31, this.analyticsLabel);
        ContentCta contentCta = this.callToAction;
        int iHashCode = (iC + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
        ContentCta contentCta2 = this.secondaryCta;
        int iHashCode2 = (iHashCode + (contentCta2 == null ? 0 : contentCta2.hashCode())) * 31;
        Boolean bool = this.showUnlock;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.iconUrl;
        DownloadableAsset downloadableAsset = this.headerImage;
        String str2 = this.title;
        String str3 = this.content;
        boolean z = this.showAnimation;
        RewardsRedemptionUnlockButton rewardsRedemptionUnlockButton = this.button;
        String str4 = this.analyticsLabel;
        ContentCta contentCta = this.callToAction;
        ContentCta contentCta2 = this.secondaryCta;
        Boolean bool = this.showUnlock;
        StringBuilder sb = new StringBuilder("RewardsRedemptionUnlockConfirmation(iconUrl=");
        sb.append(str);
        sb.append(", headerImage=");
        sb.append(downloadableAsset);
        sb.append(", title=");
        a.B(sb, str2, ", content=", str3, ", showAnimation=");
        sb.append(z);
        sb.append(", button=");
        sb.append(rewardsRedemptionUnlockButton);
        sb.append(", analyticsLabel=");
        sb.append(str4);
        sb.append(", callToAction=");
        sb.append(contentCta);
        sb.append(", secondaryCta=");
        sb.append(contentCta2);
        sb.append(", showUnlock=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.iconUrl);
        dest.writeParcelable(this.headerImage, flags);
        dest.writeString(this.title);
        dest.writeString(this.content);
        dest.writeInt(this.showAnimation ? 1 : 0);
        this.button.writeToParcel(dest, flags);
        dest.writeString(this.analyticsLabel);
        dest.writeParcelable(this.callToAction, flags);
        dest.writeParcelable(this.secondaryCta, flags);
        Boolean bool = this.showUnlock;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public RewardsRedemptionUnlockConfirmation(@NotNull String iconUrl, @NotNull DownloadableAsset headerImage, @NotNull String title, @NotNull String content, boolean z, @NotNull RewardsRedemptionUnlockButton button, @NotNull String analyticsLabel, @Nullable ContentCta contentCta, @Nullable ContentCta contentCta2, @Nullable Boolean bool) {
        Intrinsics.h(iconUrl, "iconUrl");
        Intrinsics.h(headerImage, "headerImage");
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        Intrinsics.h(button, "button");
        Intrinsics.h(analyticsLabel, "analyticsLabel");
        this.iconUrl = iconUrl;
        this.headerImage = headerImage;
        this.title = title;
        this.content = content;
        this.showAnimation = z;
        this.button = button;
        this.analyticsLabel = analyticsLabel;
        this.callToAction = contentCta;
        this.secondaryCta = contentCta2;
        this.showUnlock = bool;
    }
}
