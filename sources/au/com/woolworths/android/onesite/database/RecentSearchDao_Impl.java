package au.com.woolworths.android.onesite.database;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.android.onesite.utils.Locales;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/database/RecentSearchDao_Impl;", "Lau/com/woolworths/android/onesite/database/RecentSearchDao;", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecentSearchDao_Impl extends RecentSearchDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f4242a;
    public final AnonymousClass1 b;
    public final AnonymousClass3 c;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/android/onesite/database/RecentSearchDao_Impl$1", "Landroidx/room/EntityInsertionAdapter;", "Lau/com/woolworths/android/onesite/models/search/RecentSearch;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.android.onesite.database.RecentSearchDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertionAdapter<RecentSearch> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `recentSearch` (`searchTerm`,`id`,`searchDateTime`) VALUES (?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            RecentSearch entity = (RecentSearch) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.getSearchTerm());
            statement.z(2, entity.getId());
            Date searchDateTime = entity.getSearchDateTime();
            String str = searchDateTime == null ? null : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locales.a()).format(Long.valueOf(searchDateTime.getTime()));
            if (str == null) {
                statement.N0(3);
            } else {
                statement.z(3, str);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/android/onesite/database/RecentSearchDao_Impl$2", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/android/onesite/models/search/RecentSearch;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.android.onesite.database.RecentSearchDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityDeletionOrUpdateAdapter<RecentSearch> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM `recentSearch` WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            RecentSearch entity = (RecentSearch) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/database/RecentSearchDao_Impl$3", "Landroidx/room/SharedSQLiteStatement;", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.android.onesite.database.RecentSearchDao_Impl$3, reason: invalid class name */
    public final class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM recentSearch";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/database/RecentSearchDao_Impl$Companion;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RecentSearchDao_Impl(RoomDatabase roomDatabase) {
        this.f4242a = roomDatabase;
        this.b = new AnonymousClass1(roomDatabase);
        new AnonymousClass2(roomDatabase);
        this.c = new AnonymousClass3(roomDatabase);
    }

    @Override // au.com.woolworths.android.onesite.database.RecentSearchDao
    public final void a() {
        RoomDatabase roomDatabase = this.f4242a;
        roomDatabase.b();
        AnonymousClass3 anonymousClass3 = this.c;
        SupportSQLiteStatement supportSQLiteStatementA = anonymousClass3.a();
        try {
            roomDatabase.c();
            try {
                supportSQLiteStatementA.P();
                roomDatabase.r();
            } finally {
                roomDatabase.l();
            }
        } finally {
            anonymousClass3.c(supportSQLiteStatementA);
        }
    }

    @Override // au.com.woolworths.android.onesite.database.RecentSearchDao
    public final FlowableFlatMapMaybe b() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM recentSearch ORDER BY searchDateTime DESC");
        return RxRoom.a(this.f4242a, new String[]{RecentSearch.TABLE_NAME}, new RecentSearchDao_Impl$getAllRecentSearches$1(this, roomSQLiteQueryA));
    }

    @Override // au.com.woolworths.android.onesite.database.RecentSearchDao
    public final void c(RecentSearch... recentSearches) {
        Intrinsics.h(recentSearches, "recentSearches");
        RoomDatabase roomDatabase = this.f4242a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            AnonymousClass1 anonymousClass1 = this.b;
            anonymousClass1.getClass();
            SupportSQLiteStatement supportSQLiteStatementA = anonymousClass1.a();
            try {
                for (RecentSearch recentSearch : recentSearches) {
                    anonymousClass1.d(supportSQLiteStatementA, recentSearch);
                    supportSQLiteStatementA.M1();
                }
                anonymousClass1.c(supportSQLiteStatementA);
                roomDatabase.r();
            } catch (Throwable th) {
                anonymousClass1.c(supportSQLiteStatementA);
                throw th;
            }
        } finally {
            roomDatabase.l();
        }
    }

    @Override // au.com.woolworths.android.onesite.database.RecentSearchDao
    public final void d(List recentSearches) {
        Intrinsics.h(recentSearches, "recentSearches");
        RoomDatabase roomDatabase = this.f4242a;
        roomDatabase.c();
        try {
            super.d(recentSearches);
            roomDatabase.r();
        } finally {
            roomDatabase.l();
        }
    }
}
