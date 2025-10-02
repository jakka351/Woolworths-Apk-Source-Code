package me.oriient.ipssdk.realtime.ips;

import androidx.annotation.Keep;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/SearchPage;", "", RecentSearch.COLUMN_NAME_SEARCH_TERM, "", "pageSize", "", "url", "(Ljava/lang/String;ILjava/lang/String;)V", "getPageSize", "()I", "getSearchTerm", "()Ljava/lang/String;", "getUrl", "toString", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class SearchPage {
    private final int pageSize;

    @NotNull
    private final String searchTerm;

    @NotNull
    private final String url;

    public SearchPage(@NotNull String searchTerm, int i, @NotNull String url) throws UnsupportedEncodingException {
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(url, "url");
        this.searchTerm = searchTerm;
        this.pageSize = i;
        String strDecode = URLDecoder.decode(url, "utf-8");
        Intrinsics.g(strDecode, "decode(...)");
        this.url = strDecode;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("{searchTerm='");
        sb.append(this.searchTerm);
        sb.append("', pageSize=");
        return YU.a.l(sb, this.pageSize, '}');
    }
}
