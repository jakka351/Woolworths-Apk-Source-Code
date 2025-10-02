package au.com.woolworths.android.onesite.models.search;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Entity
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/android/onesite/models/search/RecentSearch;", "", RecentSearch.COLUMN_NAME_SEARCH_TERM, "", "id", RecentSearch.COLUMN_NAME_SEARCH_DATE_TIME, "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "(Ljava/lang/String;)V", "getSearchTerm", "()Ljava/lang/String;", "getId", "getSearchDateTime", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecentSearch {

    @NotNull
    public static final String COLUMN_NAME_ID = "id";

    @NotNull
    public static final String COLUMN_NAME_SEARCH_DATE_TIME = "searchDateTime";

    @NotNull
    public static final String COLUMN_NAME_SEARCH_TERM = "searchTerm";

    @NotNull
    public static final String TABLE_NAME = "recentSearch";

    @PrimaryKey
    @ColumnInfo
    @NotNull
    private final String id;

    @ColumnInfo
    @NotNull
    private final Date searchDateTime;

    @ColumnInfo
    @NotNull
    private final String searchTerm;
    public static final int $stable = 8;

    public RecentSearch(@NotNull String searchTerm, @NotNull String id, @NotNull Date searchDateTime) {
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(id, "id");
        Intrinsics.h(searchDateTime, "searchDateTime");
        this.searchTerm = searchTerm;
        this.id = id;
        this.searchDateTime = searchDateTime;
    }

    public static /* synthetic */ RecentSearch copy$default(RecentSearch recentSearch, String str, String str2, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentSearch.searchTerm;
        }
        if ((i & 2) != 0) {
            str2 = recentSearch.id;
        }
        if ((i & 4) != 0) {
            date = recentSearch.searchDateTime;
        }
        return recentSearch.copy(str, str2, date);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Date getSearchDateTime() {
        return this.searchDateTime;
    }

    @NotNull
    public final RecentSearch copy(@NotNull String searchTerm, @NotNull String id, @NotNull Date searchDateTime) {
        Intrinsics.h(searchTerm, "searchTerm");
        Intrinsics.h(id, "id");
        Intrinsics.h(searchDateTime, "searchDateTime");
        return new RecentSearch(searchTerm, id, searchDateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentSearch)) {
            return false;
        }
        RecentSearch recentSearch = (RecentSearch) other;
        return Intrinsics.c(this.searchTerm, recentSearch.searchTerm) && Intrinsics.c(this.id, recentSearch.id) && Intrinsics.c(this.searchDateTime, recentSearch.searchDateTime);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Date getSearchDateTime() {
        return this.searchDateTime;
    }

    @NotNull
    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public int hashCode() {
        return this.searchDateTime.hashCode() + b.c(this.searchTerm.hashCode() * 31, 31, this.id);
    }

    @NotNull
    public String toString() {
        String str = this.searchTerm;
        String str2 = this.id;
        Date date = this.searchDateTime;
        StringBuilder sbV = a.v("RecentSearch(searchTerm=", str, ", id=", str2, ", searchDateTime=");
        sbV.append(date);
        sbV.append(")");
        return sbV.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Ignore
    public RecentSearch(@NotNull String searchTerm) {
        Intrinsics.h(searchTerm, "searchTerm");
        String string = UUID.randomUUID().toString();
        Intrinsics.g(string, "toString(...)");
        Date time = Calendar.getInstance().getTime();
        Intrinsics.g(time, "getTime(...)");
        this(searchTerm, string, time);
    }
}
