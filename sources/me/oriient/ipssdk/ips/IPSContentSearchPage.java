package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.realtime.ips.SearchPage;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lme/oriient/ipssdk/ips/IPSContentSearchPage;", "Lme/oriient/ipssdk/realtime/ips/SearchPage;", "buildingId", "", RecentSearch.COLUMN_NAME_SEARCH_TERM, "pageSize", "", "url", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IPSContentSearchPage extends SearchPage {

    @NotNull
    private final String buildingId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IPSContentSearchPage(@NotNull String buildingId, @NotNull String searchTerm, int i, @NotNull String url) {
        super(searchTerm, i, url);
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(url, "url");
        this.buildingId = buildingId;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }
}
