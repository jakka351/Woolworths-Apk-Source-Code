package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
/* loaded from: classes2.dex */
public final class AdSelectionOutcome {

    /* renamed from: a, reason: collision with root package name */
    public final long f3621a;
    public final Uri b;

    @ExperimentalFeatures.Ext10OptIn
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome$Companion;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.g(EMPTY, "EMPTY");
        new AdSelectionOutcome(0L, EMPTY);
    }

    public AdSelectionOutcome(long j, Uri uri) {
        this.f3621a = j;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionOutcome)) {
            return false;
        }
        AdSelectionOutcome adSelectionOutcome = (AdSelectionOutcome) obj;
        return this.f3621a == adSelectionOutcome.f3621a && Intrinsics.c(this.b, adSelectionOutcome.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f3621a) * 31);
    }

    public final String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.f3621a + ", renderUri=" + this.b;
    }

    public AdSelectionOutcome(android.adservices.adselection.AdSelectionOutcome response) {
        Intrinsics.h(response, "response");
        long adSelectionId = response.getAdSelectionId();
        Uri renderUri = response.getRenderUri();
        Intrinsics.g(renderUri, "response.renderUri");
        this.f3621a = adSelectionId;
        this.b = renderUri;
    }
}
