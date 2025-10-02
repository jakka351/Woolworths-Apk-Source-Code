package au.com.woolworths.rewards.base.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\nJ\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\nJ%\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006-"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockButton;", "Landroid/os/Parcelable;", AnnotatedPrivateKey.LABEL, "", "loadingStateLabel", "sliderLabel", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getLoadingStateLabel", "getSliderLabel", "getIconUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$base_rewards_app_release", "$serializer", "Companion", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class RewardsRedemptionUnlockButton implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @SerializedName("loadingStateLabel")
    @Nullable
    private final String loadingStateLabel;

    @SerializedName("sliderLabel")
    @Nullable
    private final String sliderLabel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<RewardsRedemptionUnlockButton> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockButton$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockButton;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RewardsRedemptionUnlockButton> serializer() {
            return RewardsRedemptionUnlockButton$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsRedemptionUnlockButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsRedemptionUnlockButton createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsRedemptionUnlockButton(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsRedemptionUnlockButton[] newArray(int i) {
            return new RewardsRedemptionUnlockButton[i];
        }
    }

    public /* synthetic */ RewardsRedemptionUnlockButton(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, RewardsRedemptionUnlockButton$$serializer.INSTANCE.getB());
            throw null;
        }
        this.label = str;
        this.loadingStateLabel = str2;
        this.sliderLabel = str3;
        this.iconUrl = str4;
    }

    public static /* synthetic */ RewardsRedemptionUnlockButton copy$default(RewardsRedemptionUnlockButton rewardsRedemptionUnlockButton, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsRedemptionUnlockButton.label;
        }
        if ((i & 2) != 0) {
            str2 = rewardsRedemptionUnlockButton.loadingStateLabel;
        }
        if ((i & 4) != 0) {
            str3 = rewardsRedemptionUnlockButton.sliderLabel;
        }
        if ((i & 8) != 0) {
            str4 = rewardsRedemptionUnlockButton.iconUrl;
        }
        return rewardsRedemptionUnlockButton.copy(str, str2, str3, str4);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$base_rewards_app_release(RewardsRedemptionUnlockButton self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.label);
        StringSerializer stringSerializer = StringSerializer.f24821a;
        output.w(serialDesc, 1, stringSerializer, self.loadingStateLabel);
        output.w(serialDesc, 2, stringSerializer, self.sliderLabel);
        output.w(serialDesc, 3, stringSerializer, self.iconUrl);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getLoadingStateLabel() {
        return this.loadingStateLabel;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getSliderLabel() {
        return this.sliderLabel;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final RewardsRedemptionUnlockButton copy(@NotNull String label, @Nullable String loadingStateLabel, @Nullable String sliderLabel, @Nullable String iconUrl) {
        Intrinsics.h(label, "label");
        return new RewardsRedemptionUnlockButton(label, loadingStateLabel, sliderLabel, iconUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsRedemptionUnlockButton)) {
            return false;
        }
        RewardsRedemptionUnlockButton rewardsRedemptionUnlockButton = (RewardsRedemptionUnlockButton) other;
        return Intrinsics.c(this.label, rewardsRedemptionUnlockButton.label) && Intrinsics.c(this.loadingStateLabel, rewardsRedemptionUnlockButton.loadingStateLabel) && Intrinsics.c(this.sliderLabel, rewardsRedemptionUnlockButton.sliderLabel) && Intrinsics.c(this.iconUrl, rewardsRedemptionUnlockButton.iconUrl);
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getLoadingStateLabel() {
        return this.loadingStateLabel;
    }

    @Nullable
    public final String getSliderLabel() {
        return this.sliderLabel;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.loadingStateLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sliderLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.label;
        String str2 = this.loadingStateLabel;
        return a.l(YU.a.v("RewardsRedemptionUnlockButton(label=", str, ", loadingStateLabel=", str2, ", sliderLabel="), this.sliderLabel, ", iconUrl=", this.iconUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.label);
        dest.writeString(this.loadingStateLabel);
        dest.writeString(this.sliderLabel);
        dest.writeString(this.iconUrl);
    }

    public RewardsRedemptionUnlockButton(@NotNull String label, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.h(label, "label");
        this.label = label;
        this.loadingStateLabel = str;
        this.sliderLabel = str2;
        this.iconUrl = str3;
    }
}
