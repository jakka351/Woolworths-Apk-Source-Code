package au.com.woolworths.feature.rewards.offers.spinsurprise.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/spinsurprise/data/SpinSurpriseLinks;", "", "", "initialUrl", "", "internalUrls", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SpinSurpriseLinks {

    @SerializedName("initialUrl")
    @NotNull
    private final String initialUrl;

    @SerializedName("internalUrls")
    @NotNull
    private final List<String> internalUrls;

    public SpinSurpriseLinks(@NotNull String initialUrl, @NotNull List<String> internalUrls) {
        Intrinsics.h(initialUrl, "initialUrl");
        Intrinsics.h(internalUrls, "internalUrls");
        this.initialUrl = initialUrl;
        this.internalUrls = internalUrls;
    }

    /* renamed from: a, reason: from getter */
    public final String getInitialUrl() {
        return this.initialUrl;
    }

    /* renamed from: b, reason: from getter */
    public final List getInternalUrls() {
        return this.internalUrls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpinSurpriseLinks)) {
            return false;
        }
        SpinSurpriseLinks spinSurpriseLinks = (SpinSurpriseLinks) obj;
        return Intrinsics.c(this.initialUrl, spinSurpriseLinks.initialUrl) && Intrinsics.c(this.internalUrls, spinSurpriseLinks.internalUrls);
    }

    public final int hashCode() {
        return this.internalUrls.hashCode() + (this.initialUrl.hashCode() * 31);
    }

    public final String toString() {
        return a.i("SpinSurpriseLinks(initialUrl=", this.initialUrl, ", internalUrls=", ")", this.internalUrls);
    }
}
