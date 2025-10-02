package au.com.woolworths.rewards.base.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\tJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tJ%\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006)"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlock;", "Landroid/os/Parcelable;", "coachMarkText", "", "unlockConfirmation", "Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation;", "<init>", "(Ljava/lang/String;Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCoachMarkText", "()Ljava/lang/String;", "getUnlockConfirmation", "()Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlockConfirmation;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$base_rewards_app_release", "$serializer", "Companion", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class RewardsRedemptionUnlock implements Parcelable {

    @SerializedName("coachMarkText")
    @Nullable
    private final String coachMarkText;

    @SerializedName("unlockConfirmation")
    @Nullable
    private final RewardsRedemptionUnlockConfirmation unlockConfirmation;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RewardsRedemptionUnlock> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlock$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/rewards/base/data/RewardsRedemptionUnlock;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RewardsRedemptionUnlock> serializer() {
            return RewardsRedemptionUnlock$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsRedemptionUnlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsRedemptionUnlock createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsRedemptionUnlock(parcel.readString(), parcel.readInt() == 0 ? null : RewardsRedemptionUnlockConfirmation.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsRedemptionUnlock[] newArray(int i) {
            return new RewardsRedemptionUnlock[i];
        }
    }

    public /* synthetic */ RewardsRedemptionUnlock(int i, String str, RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, RewardsRedemptionUnlock$$serializer.INSTANCE.getB());
            throw null;
        }
        this.coachMarkText = str;
        this.unlockConfirmation = rewardsRedemptionUnlockConfirmation;
    }

    public static /* synthetic */ RewardsRedemptionUnlock copy$default(RewardsRedemptionUnlock rewardsRedemptionUnlock, String str, RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsRedemptionUnlock.coachMarkText;
        }
        if ((i & 2) != 0) {
            rewardsRedemptionUnlockConfirmation = rewardsRedemptionUnlock.unlockConfirmation;
        }
        return rewardsRedemptionUnlock.copy(str, rewardsRedemptionUnlockConfirmation);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$base_rewards_app_release(RewardsRedemptionUnlock self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.w(serialDesc, 0, StringSerializer.f24821a, self.coachMarkText);
        output.w(serialDesc, 1, RewardsRedemptionUnlockConfirmation$$serializer.INSTANCE, self.unlockConfirmation);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCoachMarkText() {
        return this.coachMarkText;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final RewardsRedemptionUnlockConfirmation getUnlockConfirmation() {
        return this.unlockConfirmation;
    }

    @NotNull
    public final RewardsRedemptionUnlock copy(@Nullable String coachMarkText, @Nullable RewardsRedemptionUnlockConfirmation unlockConfirmation) {
        return new RewardsRedemptionUnlock(coachMarkText, unlockConfirmation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsRedemptionUnlock)) {
            return false;
        }
        RewardsRedemptionUnlock rewardsRedemptionUnlock = (RewardsRedemptionUnlock) other;
        return Intrinsics.c(this.coachMarkText, rewardsRedemptionUnlock.coachMarkText) && Intrinsics.c(this.unlockConfirmation, rewardsRedemptionUnlock.unlockConfirmation);
    }

    @Nullable
    public final String getCoachMarkText() {
        return this.coachMarkText;
    }

    @Nullable
    public final RewardsRedemptionUnlockConfirmation getUnlockConfirmation() {
        return this.unlockConfirmation;
    }

    public int hashCode() {
        String str = this.coachMarkText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation = this.unlockConfirmation;
        return iHashCode + (rewardsRedemptionUnlockConfirmation != null ? rewardsRedemptionUnlockConfirmation.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RewardsRedemptionUnlock(coachMarkText=" + this.coachMarkText + ", unlockConfirmation=" + this.unlockConfirmation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.coachMarkText);
        RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation = this.unlockConfirmation;
        if (rewardsRedemptionUnlockConfirmation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsRedemptionUnlockConfirmation.writeToParcel(dest, flags);
        }
    }

    public RewardsRedemptionUnlock(@Nullable String str, @Nullable RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation) {
        this.coachMarkText = str;
        this.unlockConfirmation = rewardsRedemptionUnlockConfirmation;
    }
}
