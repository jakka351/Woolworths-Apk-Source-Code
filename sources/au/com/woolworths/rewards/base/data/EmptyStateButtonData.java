package au.com.woolworths.rewards.base.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/rewards/base/data/EmptyStateButtonData;", "", "title", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EmptyStateButtonData {
    public static final int $stable = 0;

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    public EmptyStateButtonData(@NotNull String title, @NotNull String url) {
        Intrinsics.h(title, "title");
        Intrinsics.h(url, "url");
        this.title = title;
        this.url = url;
    }

    public static /* synthetic */ EmptyStateButtonData copy$default(EmptyStateButtonData emptyStateButtonData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emptyStateButtonData.title;
        }
        if ((i & 2) != 0) {
            str2 = emptyStateButtonData.url;
        }
        return emptyStateButtonData.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final EmptyStateButtonData copy(@NotNull String title, @NotNull String url) {
        Intrinsics.h(title, "title");
        Intrinsics.h(url, "url");
        return new EmptyStateButtonData(title, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateButtonData)) {
            return false;
        }
        EmptyStateButtonData emptyStateButtonData = (EmptyStateButtonData) other;
        return Intrinsics.c(this.title, emptyStateButtonData.title) && Intrinsics.c(this.url, emptyStateButtonData.url);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.j("EmptyStateButtonData(title=", this.title, ", url=", this.url, ")");
    }
}
