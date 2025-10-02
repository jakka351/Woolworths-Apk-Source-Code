package au.com.woolworths.rewards.base.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsTermsAndConditionsData;", "Landroid/os/Parcelable;", "title", "", "termsAndConditions", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getTermsAndConditions", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsTermsAndConditionsData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<RewardsTermsAndConditionsData> CREATOR = new Creator();

    @SerializedName("termsAndConditions")
    @NotNull
    private final String termsAndConditions;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsTermsAndConditionsData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsTermsAndConditionsData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsTermsAndConditionsData(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsTermsAndConditionsData[] newArray(int i) {
            return new RewardsTermsAndConditionsData[i];
        }
    }

    public RewardsTermsAndConditionsData(@NotNull String title, @NotNull String termsAndConditions) {
        Intrinsics.h(title, "title");
        Intrinsics.h(termsAndConditions, "termsAndConditions");
        this.title = title;
        this.termsAndConditions = termsAndConditions;
    }

    public static /* synthetic */ RewardsTermsAndConditionsData copy$default(RewardsTermsAndConditionsData rewardsTermsAndConditionsData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsTermsAndConditionsData.title;
        }
        if ((i & 2) != 0) {
            str2 = rewardsTermsAndConditionsData.termsAndConditions;
        }
        return rewardsTermsAndConditionsData.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    @NotNull
    public final RewardsTermsAndConditionsData copy(@NotNull String title, @NotNull String termsAndConditions) {
        Intrinsics.h(title, "title");
        Intrinsics.h(termsAndConditions, "termsAndConditions");
        return new RewardsTermsAndConditionsData(title, termsAndConditions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsTermsAndConditionsData)) {
            return false;
        }
        RewardsTermsAndConditionsData rewardsTermsAndConditionsData = (RewardsTermsAndConditionsData) other;
        return Intrinsics.c(this.title, rewardsTermsAndConditionsData.title) && Intrinsics.c(this.termsAndConditions, rewardsTermsAndConditionsData.termsAndConditions);
    }

    @NotNull
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.termsAndConditions.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.j("RewardsTermsAndConditionsData(title=", this.title, ", termsAndConditions=", this.termsAndConditions, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.termsAndConditions);
    }
}
