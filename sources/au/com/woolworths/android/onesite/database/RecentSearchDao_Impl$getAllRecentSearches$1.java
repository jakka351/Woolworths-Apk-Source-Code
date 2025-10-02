package au.com.woolworths.android.onesite.database;

import YU.a;
import android.database.Cursor;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.android.onesite.utils.Locales;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"au/com/woolworths/android/onesite/database/RecentSearchDao_Impl$getAllRecentSearches$1", "Ljava/util/concurrent/Callable;", "", "Lau/com/woolworths/android/onesite/models/search/RecentSearch;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecentSearchDao_Impl$getAllRecentSearches$1 implements Callable<List<? extends RecentSearch>> {
    public final /* synthetic */ RecentSearchDao_Impl d;
    public final /* synthetic */ RoomSQLiteQuery e;

    public RecentSearchDao_Impl$getAllRecentSearches$1(RecentSearchDao_Impl recentSearchDao_Impl, RoomSQLiteQuery roomSQLiteQuery) {
        this.d = recentSearchDao_Impl;
        this.e = roomSQLiteQuery;
    }

    @Override // java.util.concurrent.Callable
    public final List<? extends RecentSearch> call() {
        Cursor cursorB = DBUtil.b(this.d.f4242a, this.e, false);
        try {
            int iB = CursorUtil.b(cursorB, RecentSearch.COLUMN_NAME_SEARCH_TERM);
            int iB2 = CursorUtil.b(cursorB, "id");
            int iB3 = CursorUtil.b(cursorB, RecentSearch.COLUMN_NAME_SEARCH_DATE_TIME);
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB);
                Intrinsics.g(string, "getString(...)");
                String string2 = cursorB.getString(iB2);
                Intrinsics.g(string2, "getString(...)");
                Date date = null;
                String string3 = cursorB.isNull(iB3) ? null : cursorB.getString(iB3);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locales.a());
                if (string3 != null) {
                    try {
                        if (!StringsKt.D(string3)) {
                            date = simpleDateFormat.parse(string3);
                        }
                    } catch (ParseException e) {
                        Bark.Companion companion = Bark.f8483a;
                        Bark.Barker.c(new ReportOwner(ReportOwner.Squad.m), e, a.h("Parse exception in getDateFromString, when parsing '", string3, "'"), 8);
                    }
                }
                if (date == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                arrayList.add(new RecentSearch(string, string2, date));
            }
            cursorB.close();
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            throw th;
        }
    }

    public final void finalize() {
        this.e.release();
    }
}
