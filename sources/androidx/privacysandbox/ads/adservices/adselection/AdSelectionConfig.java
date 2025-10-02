package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
/* loaded from: classes2.dex */
public final class AdSelectionConfig {
    public static final AdSelectionConfig e;

    /* renamed from: a, reason: collision with root package name */
    public final AdTechIdentifier f3617a;
    public final AdSelectionSignals b;
    public final AdSelectionSignals c;
    public final Map d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig$Companion;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static final class Companion {
    }

    static {
        AdTechIdentifier adTechIdentifier = new AdTechIdentifier();
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.g(EMPTY, "EMPTY");
        e = new AdSelectionConfig(adTechIdentifier, new AdSelectionSignals(), new AdSelectionSignals(), EmptyMap.d);
    }

    public AdSelectionConfig(AdTechIdentifier adTechIdentifier, AdSelectionSignals adSelectionSignals, AdSelectionSignals adSelectionSignals2, Map map) {
        Uri trustedScoringSignalsUri = Uri.EMPTY;
        Intrinsics.h(trustedScoringSignalsUri, "decisionLogicUri");
        Intrinsics.h(trustedScoringSignalsUri, "trustedScoringSignalsUri");
        this.f3617a = adTechIdentifier;
        this.b = adSelectionSignals;
        this.c = adSelectionSignals2;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) obj;
        if (!this.f3617a.equals(adSelectionConfig.f3617a)) {
            return false;
        }
        Uri uri = Uri.EMPTY;
        if (!Intrinsics.c(uri, uri)) {
            return false;
        }
        EmptyList emptyList = EmptyList.d;
        return emptyList.equals(emptyList) && this.b.equals(adSelectionConfig.b) && this.c.equals(adSelectionConfig.c) && this.d.equals(adSelectionConfig.d) && Intrinsics.c(uri, uri);
    }

    public final int hashCode() {
        Uri uri = Uri.EMPTY;
        return uri.hashCode() + (((uri.hashCode() * 31) + 1) * 923521);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdSelectionConfig: seller=");
        sb.append(this.f3617a);
        sb.append(", decisionLogicUri='");
        Uri uri = Uri.EMPTY;
        sb.append(uri);
        sb.append("', customAudienceBuyers=");
        sb.append(EmptyList.d);
        sb.append(", adSelectionSignals=");
        sb.append(this.b);
        sb.append(", sellerSignals=");
        sb.append(this.c);
        sb.append(", perBuyerSignals=");
        sb.append(this.d);
        sb.append(", trustedScoringSignalsUri=");
        sb.append(uri);
        return sb.toString();
    }
}
