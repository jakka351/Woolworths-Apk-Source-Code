package au.com.woolworths.base.rewards.account.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsVouchersSummaryData;", "", AnnotatedPrivateKey.LABEL, "", "availableVouchers", "actionUrl", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getAvailableVouchers", "getActionUrl", "getIconUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$base_rewards_account_release", "$serializer", "Companion", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class RewardsVouchersSummaryData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String actionUrl;

    @NotNull
    private final String availableVouchers;

    @NotNull
    private final String iconUrl;

    @NotNull
    private final String label;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsVouchersSummaryData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/rewards/account/data/RewardsVouchersSummaryData;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RewardsVouchersSummaryData> serializer() {
            return RewardsVouchersSummaryData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RewardsVouchersSummaryData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.a(i, 15, RewardsVouchersSummaryData$$serializer.INSTANCE.getB());
            throw null;
        }
        this.label = str;
        this.availableVouchers = str2;
        this.actionUrl = str3;
        this.iconUrl = str4;
    }

    public static /* synthetic */ RewardsVouchersSummaryData copy$default(RewardsVouchersSummaryData rewardsVouchersSummaryData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsVouchersSummaryData.label;
        }
        if ((i & 2) != 0) {
            str2 = rewardsVouchersSummaryData.availableVouchers;
        }
        if ((i & 4) != 0) {
            str3 = rewardsVouchersSummaryData.actionUrl;
        }
        if ((i & 8) != 0) {
            str4 = rewardsVouchersSummaryData.iconUrl;
        }
        return rewardsVouchersSummaryData.copy(str, str2, str3, str4);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$base_rewards_account_release(RewardsVouchersSummaryData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.label);
        output.p(serialDesc, 1, self.availableVouchers);
        output.p(serialDesc, 2, self.actionUrl);
        output.p(serialDesc, 3, self.iconUrl);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAvailableVouchers() {
        return this.availableVouchers;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final RewardsVouchersSummaryData copy(@NotNull String label, @NotNull String availableVouchers, @NotNull String actionUrl, @NotNull String iconUrl) {
        Intrinsics.h(label, "label");
        Intrinsics.h(availableVouchers, "availableVouchers");
        Intrinsics.h(actionUrl, "actionUrl");
        Intrinsics.h(iconUrl, "iconUrl");
        return new RewardsVouchersSummaryData(label, availableVouchers, actionUrl, iconUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsVouchersSummaryData)) {
            return false;
        }
        RewardsVouchersSummaryData rewardsVouchersSummaryData = (RewardsVouchersSummaryData) other;
        return Intrinsics.c(this.label, rewardsVouchersSummaryData.label) && Intrinsics.c(this.availableVouchers, rewardsVouchersSummaryData.availableVouchers) && Intrinsics.c(this.actionUrl, rewardsVouchersSummaryData.actionUrl) && Intrinsics.c(this.iconUrl, rewardsVouchersSummaryData.iconUrl);
    }

    @NotNull
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @NotNull
    public final String getAvailableVouchers() {
        return this.availableVouchers;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.iconUrl.hashCode() + b.c(b.c(this.label.hashCode() * 31, 31, this.availableVouchers), 31, this.actionUrl);
    }

    @NotNull
    public String toString() {
        String str = this.label;
        String str2 = this.availableVouchers;
        return a.l(YU.a.v("RewardsVouchersSummaryData(label=", str, ", availableVouchers=", str2, ", actionUrl="), this.actionUrl, ", iconUrl=", this.iconUrl, ")");
    }

    public RewardsVouchersSummaryData(@NotNull String label, @NotNull String availableVouchers, @NotNull String actionUrl, @NotNull String iconUrl) {
        Intrinsics.h(label, "label");
        Intrinsics.h(availableVouchers, "availableVouchers");
        Intrinsics.h(actionUrl, "actionUrl");
        Intrinsics.h(iconUrl, "iconUrl");
        this.label = label;
        this.availableVouchers = availableVouchers;
        this.actionUrl = actionUrl;
        this.iconUrl = iconUrl;
    }
}
