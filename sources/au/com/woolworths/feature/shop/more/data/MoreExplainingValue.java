package au.com.woolworths.feature.shop.more.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreExplainingValue;", "", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreExplainingValue {

    @SerializedName("title")
    @NotNull
    private final String title;

    @SerializedName("url")
    @Nullable
    private final String url;

    public MoreExplainingValue(@NotNull String title, @Nullable String str) {
        Intrinsics.h(title, "title");
        this.title = title;
        this.url = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreExplainingValue)) {
            return false;
        }
        MoreExplainingValue moreExplainingValue = (MoreExplainingValue) obj;
        return Intrinsics.c(this.title, moreExplainingValue.title) && Intrinsics.c(this.url, moreExplainingValue.url);
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.url;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.j("MoreExplainingValue(title=", this.title, ", url=", this.url, ")");
    }
}
