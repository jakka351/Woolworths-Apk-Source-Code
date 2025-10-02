package au.com.woolworths.feature.shop.more.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreEReceipts;", "", "", "title", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreEReceipts {

    @SerializedName("title")
    @NotNull
    private final String title;

    public MoreEReceipts(@NotNull String title) {
        Intrinsics.h(title, "title");
        this.title = title;
    }

    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MoreEReceipts) && Intrinsics.c(this.title, ((MoreEReceipts) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return a.h("MoreEReceipts(title=", this.title, ")");
    }
}
