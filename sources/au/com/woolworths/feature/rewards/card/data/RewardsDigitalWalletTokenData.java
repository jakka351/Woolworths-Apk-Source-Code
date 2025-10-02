package au.com.woolworths.feature.rewards.card.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/data/RewardsDigitalWalletTokenData;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsDigitalWalletTokenData {

    /* renamed from: a, reason: collision with root package name */
    public final String f5820a;

    public RewardsDigitalWalletTokenData(String str) {
        this.f5820a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardsDigitalWalletTokenData) && Intrinsics.c(this.f5820a, ((RewardsDigitalWalletTokenData) obj).f5820a);
    }

    public final int hashCode() {
        return this.f5820a.hashCode();
    }

    public final String toString() {
        return a.h("RewardsDigitalWalletTokenData(token=", this.f5820a, ")");
    }
}
