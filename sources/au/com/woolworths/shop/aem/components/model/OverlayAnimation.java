package au.com.woolworths.shop.aem.components.model;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/aem/components/model/OverlayAnimation;", "", "", "source", "", "playCount", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "a", "()I", "shop-aem-components_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OverlayAnimation {

    @SerializedName("playCount")
    @MappedName
    private final int playCount;

    @SerializedName("source")
    @MappedName
    @NotNull
    private final String source;

    public OverlayAnimation(@NotNull String source, int i) {
        Intrinsics.h(source, "source");
        this.source = source;
        this.playCount = i;
    }

    /* renamed from: a, reason: from getter */
    public final int getPlayCount() {
        return this.playCount;
    }

    /* renamed from: b, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlayAnimation)) {
            return false;
        }
        OverlayAnimation overlayAnimation = (OverlayAnimation) obj;
        return Intrinsics.c(this.source, overlayAnimation.source) && this.playCount == overlayAnimation.playCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.playCount) + (this.source.hashCode() * 31);
    }

    public final String toString() {
        return a.p("OverlayAnimation(source=", this.playCount, this.source, ", playCount=", ")");
    }
}
