package au.com.woolworths.feature.shop.more.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreFeed;", "", "", "feed", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreFeed {

    @SerializedName("feed")
    @NotNull
    private final List<Object> feed;

    public MoreFeed(@NotNull List<? extends Object> feed) {
        Intrinsics.h(feed, "feed");
        this.feed = feed;
    }

    /* renamed from: a, reason: from getter */
    public final List getFeed() {
        return this.feed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoreFeed) && Intrinsics.c(this.feed, ((MoreFeed) obj).feed);
    }

    public final int hashCode() {
        return this.feed.hashCode();
    }

    public final String toString() {
        return a.l("MoreFeed(feed=", ")", this.feed);
    }
}
