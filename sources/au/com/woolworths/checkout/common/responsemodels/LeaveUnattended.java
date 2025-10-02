package au.com.woolworths.checkout.common.responsemodels;

import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/LeaveUnattended;", "", "showLeaveUnattended", "", "disableLeaveUnattended", "canLeaveUnattended", "warningMessage", "", "<init>", "(ZZZLjava/lang/String;)V", "getShowLeaveUnattended", "()Z", "getDisableLeaveUnattended", "getCanLeaveUnattended", "getWarningMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LeaveUnattended {

    @SerializedName("CanLeaveUnattended")
    private final boolean canLeaveUnattended;

    @SerializedName("DisableLeaveUnattended")
    private final boolean disableLeaveUnattended;

    @SerializedName("ShowLeaveUnattended")
    private final boolean showLeaveUnattended;

    @SerializedName("WarningMessage")
    @NotNull
    private final String warningMessage;

    public LeaveUnattended(boolean z, boolean z2, boolean z3, @NotNull String warningMessage) {
        Intrinsics.h(warningMessage, "warningMessage");
        this.showLeaveUnattended = z;
        this.disableLeaveUnattended = z2;
        this.canLeaveUnattended = z3;
        this.warningMessage = warningMessage;
    }

    public static /* synthetic */ LeaveUnattended copy$default(LeaveUnattended leaveUnattended, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = leaveUnattended.showLeaveUnattended;
        }
        if ((i & 2) != 0) {
            z2 = leaveUnattended.disableLeaveUnattended;
        }
        if ((i & 4) != 0) {
            z3 = leaveUnattended.canLeaveUnattended;
        }
        if ((i & 8) != 0) {
            str = leaveUnattended.warningMessage;
        }
        return leaveUnattended.copy(z, z2, z3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowLeaveUnattended() {
        return this.showLeaveUnattended;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDisableLeaveUnattended() {
        return this.disableLeaveUnattended;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanLeaveUnattended() {
        return this.canLeaveUnattended;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    @NotNull
    public final LeaveUnattended copy(boolean showLeaveUnattended, boolean disableLeaveUnattended, boolean canLeaveUnattended, @NotNull String warningMessage) {
        Intrinsics.h(warningMessage, "warningMessage");
        return new LeaveUnattended(showLeaveUnattended, disableLeaveUnattended, canLeaveUnattended, warningMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaveUnattended)) {
            return false;
        }
        LeaveUnattended leaveUnattended = (LeaveUnattended) other;
        return this.showLeaveUnattended == leaveUnattended.showLeaveUnattended && this.disableLeaveUnattended == leaveUnattended.disableLeaveUnattended && this.canLeaveUnattended == leaveUnattended.canLeaveUnattended && Intrinsics.c(this.warningMessage, leaveUnattended.warningMessage);
    }

    public final boolean getCanLeaveUnattended() {
        return this.canLeaveUnattended;
    }

    public final boolean getDisableLeaveUnattended() {
        return this.disableLeaveUnattended;
    }

    public final boolean getShowLeaveUnattended() {
        return this.showLeaveUnattended;
    }

    @NotNull
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        return this.warningMessage.hashCode() + b.e(b.e(Boolean.hashCode(this.showLeaveUnattended) * 31, 31, this.disableLeaveUnattended), 31, this.canLeaveUnattended);
    }

    @NotNull
    public String toString() {
        boolean z = this.showLeaveUnattended;
        boolean z2 = this.disableLeaveUnattended;
        boolean z3 = this.canLeaveUnattended;
        String str = this.warningMessage;
        StringBuilder sbV = b.v("LeaveUnattended(showLeaveUnattended=", ", disableLeaveUnattended=", ", canLeaveUnattended=", z, z2);
        sbV.append(z3);
        sbV.append(", warningMessage=");
        sbV.append(str);
        sbV.append(")");
        return sbV.toString();
    }
}
