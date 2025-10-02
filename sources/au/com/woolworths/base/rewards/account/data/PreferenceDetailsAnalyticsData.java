package au.com.woolworths.base.rewards.account.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/PreferenceDetailsAnalyticsData;", "", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PreferenceDetailsAnalyticsData {
    public static final int $stable = 0;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    public PreferenceDetailsAnalyticsData(@NotNull String label) {
        Intrinsics.h(label, "label");
        this.label = label;
    }

    public static /* synthetic */ PreferenceDetailsAnalyticsData copy$default(PreferenceDetailsAnalyticsData preferenceDetailsAnalyticsData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preferenceDetailsAnalyticsData.label;
        }
        return preferenceDetailsAnalyticsData.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final PreferenceDetailsAnalyticsData copy(@NotNull String label) {
        Intrinsics.h(label, "label");
        return new PreferenceDetailsAnalyticsData(label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PreferenceDetailsAnalyticsData) && Intrinsics.c(this.label, ((PreferenceDetailsAnalyticsData) other).label);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.label.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("PreferenceDetailsAnalyticsData(label=", this.label, ")");
    }
}
