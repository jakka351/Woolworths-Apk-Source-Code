package au.com.woolworths.android.onesite.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/android/onesite/models/BaseResultWithSortOptions;", "", "<init>", "()V", "mSortOptions", "", "Lau/com/woolworths/android/onesite/models/SortOption;", "nextPageUrl", "", "getNextPageUrl", "()Ljava/lang/String;", "setNextPageUrl", "(Ljava/lang/String;)V", "sortOptions", "getSortOptions", "()Ljava/util/List;", "setSortOptions", "", "count", "", "getCount", "()I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseResultWithSortOptions {

    @SerializedName("sortoptions")
    @NotNull
    private List<SortOption> mSortOptions = new ArrayList();

    @SerializedName("nextpage")
    @Nullable
    private String nextPageUrl;

    public abstract int getCount();

    @Nullable
    public final String getNextPageUrl() {
        return this.nextPageUrl;
    }

    @Nullable
    public List<SortOption> getSortOptions() {
        return this.mSortOptions;
    }

    public final void setNextPageUrl(@Nullable String str) {
        this.nextPageUrl = str;
    }

    public final void setSortOptions(@NotNull List<SortOption> sortOptions) {
        Intrinsics.h(sortOptions, "sortOptions");
        this.mSortOptions = sortOptions;
    }
}
