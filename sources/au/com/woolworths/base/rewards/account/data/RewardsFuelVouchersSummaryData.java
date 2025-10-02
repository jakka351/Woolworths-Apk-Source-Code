package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
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
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsFuelVouchersSummaryData;", "", AnnotatedPrivateKey.LABEL, "", "numberOfVouchers", "", "availableVouchers", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getNumberOfVouchers", "()I", "getAvailableVouchers", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$base_rewards_account_release", "$serializer", "Companion", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class RewardsFuelVouchersSummaryData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("availableVouchers")
    @Nullable
    private final String availableVouchers;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    @SerializedName("numberOfVouchers")
    private final int numberOfVouchers;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsFuelVouchersSummaryData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/rewards/account/data/RewardsFuelVouchersSummaryData;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RewardsFuelVouchersSummaryData> serializer() {
            return RewardsFuelVouchersSummaryData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RewardsFuelVouchersSummaryData(int i, String str, int i2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, RewardsFuelVouchersSummaryData$$serializer.INSTANCE.getB());
            throw null;
        }
        this.label = str;
        this.numberOfVouchers = i2;
        this.availableVouchers = str2;
    }

    public static /* synthetic */ RewardsFuelVouchersSummaryData copy$default(RewardsFuelVouchersSummaryData rewardsFuelVouchersSummaryData, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = rewardsFuelVouchersSummaryData.label;
        }
        if ((i2 & 2) != 0) {
            i = rewardsFuelVouchersSummaryData.numberOfVouchers;
        }
        if ((i2 & 4) != 0) {
            str2 = rewardsFuelVouchersSummaryData.availableVouchers;
        }
        return rewardsFuelVouchersSummaryData.copy(str, i, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$base_rewards_account_release(RewardsFuelVouchersSummaryData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.label);
        output.C(1, self.numberOfVouchers, serialDesc);
        output.w(serialDesc, 2, StringSerializer.f24821a, self.availableVouchers);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumberOfVouchers() {
        return this.numberOfVouchers;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAvailableVouchers() {
        return this.availableVouchers;
    }

    @NotNull
    public final RewardsFuelVouchersSummaryData copy(@NotNull String label, int numberOfVouchers, @Nullable String availableVouchers) {
        Intrinsics.h(label, "label");
        return new RewardsFuelVouchersSummaryData(label, numberOfVouchers, availableVouchers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsFuelVouchersSummaryData)) {
            return false;
        }
        RewardsFuelVouchersSummaryData rewardsFuelVouchersSummaryData = (RewardsFuelVouchersSummaryData) other;
        return Intrinsics.c(this.label, rewardsFuelVouchersSummaryData.label) && this.numberOfVouchers == rewardsFuelVouchersSummaryData.numberOfVouchers && Intrinsics.c(this.availableVouchers, rewardsFuelVouchersSummaryData.availableVouchers);
    }

    @Nullable
    public final String getAvailableVouchers() {
        return this.availableVouchers;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final int getNumberOfVouchers() {
        return this.numberOfVouchers;
    }

    public int hashCode() {
        int iA = b.a(this.numberOfVouchers, this.label.hashCode() * 31, 31);
        String str = this.availableVouchers;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.label;
        int i = this.numberOfVouchers;
        return a.o(b.u("RewardsFuelVouchersSummaryData(label=", i, str, ", numberOfVouchers=", ", availableVouchers="), this.availableVouchers, ")");
    }

    public RewardsFuelVouchersSummaryData(@NotNull String label, int i, @Nullable String str) {
        Intrinsics.h(label, "label");
        this.label = label;
        this.numberOfVouchers = i;
        this.availableVouchers = str;
    }
}
