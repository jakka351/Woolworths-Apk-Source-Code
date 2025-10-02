package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.data.ContentCta$$serializer;
import com.google.gson.annotations.SerializedName;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\nHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionCoachMark;", "", "title", "", lqlqqlq.mmm006Dm006Dm, "cta", "Lau/com/woolworths/android/onesite/data/ContentCta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/data/ContentCta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getCta", "()Lau/com/woolworths/android/onesite/data/ContentCta;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$base_rewards_account_release", "$serializer", "Companion", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class RewardsRedemptionCoachMark {

    @SerializedName("cta")
    @NotNull
    private final ContentCta cta;

    @SerializedName(lqlqqlq.mmm006Dm006Dm)
    @NotNull
    private final String description;

    @SerializedName("title")
    @NotNull
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionCoachMark$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionCoachMark;", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<RewardsRedemptionCoachMark> serializer() {
            return RewardsRedemptionCoachMark$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RewardsRedemptionCoachMark(int i, String str, String str2, ContentCta contentCta, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, RewardsRedemptionCoachMark$$serializer.INSTANCE.getB());
            throw null;
        }
        this.title = str;
        this.description = str2;
        this.cta = contentCta;
    }

    public static /* synthetic */ RewardsRedemptionCoachMark copy$default(RewardsRedemptionCoachMark rewardsRedemptionCoachMark, String str, String str2, ContentCta contentCta, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsRedemptionCoachMark.title;
        }
        if ((i & 2) != 0) {
            str2 = rewardsRedemptionCoachMark.description;
        }
        if ((i & 4) != 0) {
            contentCta = rewardsRedemptionCoachMark.cta;
        }
        return rewardsRedemptionCoachMark.copy(str, str2, contentCta);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$base_rewards_account_release(RewardsRedemptionCoachMark self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.title);
        output.p(serialDesc, 1, self.description);
        output.F(serialDesc, 2, ContentCta$$serializer.f4240a, self.cta);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ContentCta getCta() {
        return this.cta;
    }

    @NotNull
    public final RewardsRedemptionCoachMark copy(@NotNull String title, @NotNull String description, @NotNull ContentCta cta) {
        Intrinsics.h(title, "title");
        Intrinsics.h(description, "description");
        Intrinsics.h(cta, "cta");
        return new RewardsRedemptionCoachMark(title, description, cta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsRedemptionCoachMark)) {
            return false;
        }
        RewardsRedemptionCoachMark rewardsRedemptionCoachMark = (RewardsRedemptionCoachMark) other;
        return Intrinsics.c(this.title, rewardsRedemptionCoachMark.title) && Intrinsics.c(this.description, rewardsRedemptionCoachMark.description) && Intrinsics.c(this.cta, rewardsRedemptionCoachMark.cta);
    }

    @NotNull
    public final ContentCta getCta() {
        return this.cta;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cta.hashCode() + b.c(this.title.hashCode() * 31, 31, this.description);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        ContentCta contentCta = this.cta;
        StringBuilder sbV = a.v("RewardsRedemptionCoachMark(title=", str, ", description=", str2, ", cta=");
        sbV.append(contentCta);
        sbV.append(")");
        return sbV.toString();
    }

    public RewardsRedemptionCoachMark(@NotNull String title, @NotNull String description, @NotNull ContentCta cta) {
        Intrinsics.h(title, "title");
        Intrinsics.h(description, "description");
        Intrinsics.h(cta, "cta");
        this.title = title;
        this.description = description;
        this.cta = cta;
    }
}
