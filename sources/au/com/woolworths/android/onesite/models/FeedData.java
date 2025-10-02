package au.com.woolworths.android.onesite.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lau/com/woolworths/android/onesite/models/FeedData;", "", "items", "", "message", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FeedData {

    @SerializedName("items")
    @NotNull
    private final List<Object> items;

    @SerializedName("message")
    @Nullable
    private final String message;

    public FeedData(@NotNull List<? extends Object> items, @Nullable String str) {
        Intrinsics.h(items, "items");
        this.items = items;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedData copy$default(FeedData feedData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feedData.items;
        }
        if ((i & 2) != 0) {
            str = feedData.message;
        }
        return feedData.copy(list, str);
    }

    @NotNull
    public final List<Object> component1() {
        return this.items;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final FeedData copy(@NotNull List<? extends Object> items, @Nullable String message) {
        Intrinsics.h(items, "items");
        return new FeedData(items, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedData)) {
            return false;
        }
        FeedData feedData = (FeedData) other;
        return Intrinsics.c(this.items, feedData.items) && Intrinsics.c(this.message, feedData.message);
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "FeedData(items=" + this.items + ", message=" + this.message + ")";
    }
}
