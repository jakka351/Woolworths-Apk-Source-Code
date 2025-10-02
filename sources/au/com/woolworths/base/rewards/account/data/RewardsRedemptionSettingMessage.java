package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionSettingMessage;", "", "title", "", "message", "buttonLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getButtonLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsRedemptionSettingMessage {
    public static final int $stable = 0;

    @SerializedName("buttonLabel")
    @NotNull
    private final String buttonLabel;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("title")
    @Nullable
    private final String title;

    public RewardsRedemptionSettingMessage(@Nullable String str, @NotNull String message, @NotNull String buttonLabel) {
        Intrinsics.h(message, "message");
        Intrinsics.h(buttonLabel, "buttonLabel");
        this.title = str;
        this.message = message;
        this.buttonLabel = buttonLabel;
    }

    public static /* synthetic */ RewardsRedemptionSettingMessage copy$default(RewardsRedemptionSettingMessage rewardsRedemptionSettingMessage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsRedemptionSettingMessage.title;
        }
        if ((i & 2) != 0) {
            str2 = rewardsRedemptionSettingMessage.message;
        }
        if ((i & 4) != 0) {
            str3 = rewardsRedemptionSettingMessage.buttonLabel;
        }
        return rewardsRedemptionSettingMessage.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    @NotNull
    public final RewardsRedemptionSettingMessage copy(@Nullable String title, @NotNull String message, @NotNull String buttonLabel) {
        Intrinsics.h(message, "message");
        Intrinsics.h(buttonLabel, "buttonLabel");
        return new RewardsRedemptionSettingMessage(title, message, buttonLabel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsRedemptionSettingMessage)) {
            return false;
        }
        RewardsRedemptionSettingMessage rewardsRedemptionSettingMessage = (RewardsRedemptionSettingMessage) other;
        return Intrinsics.c(this.title, rewardsRedemptionSettingMessage.title) && Intrinsics.c(this.message, rewardsRedemptionSettingMessage.message) && Intrinsics.c(this.buttonLabel, rewardsRedemptionSettingMessage.buttonLabel);
    }

    @NotNull
    public final String getButtonLabel() {
        return this.buttonLabel;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return this.buttonLabel.hashCode() + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.message;
        return a.o(a.v("RewardsRedemptionSettingMessage(title=", str, ", message=", str2, ", buttonLabel="), this.buttonLabel, ")");
    }
}
