package au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataEntity;
import java.time.Instant;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/SyncMetadataDao_Impl;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/SyncMetadataDao;", "Companion", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncMetadataDao_Impl implements SyncMetadataDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f8417a;
    public final EntityUpsertionAdapter b;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/SyncMetadataDao_Impl$1", "Landroidx/room/EntityInsertionAdapter;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/SyncMetadataEntity;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertionAdapter<SyncMetadataEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT INTO `sync_metadata` (`user_id`,`resource_type`,`last_sync_time`) VALUES (?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            SyncMetadataEntity entity = (SyncMetadataEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.f8419a);
            SyncMetadataEntity.ResourceType resourceType = SyncMetadataEntity.ResourceType.d;
            SyncMetadataDao_Impl.d();
            statement.z(2, "InboxMessages");
            String string = entity.b.toString();
            Intrinsics.g(string, "toString(...)");
            statement.z(3, string);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/SyncMetadataDao_Impl$2", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/SyncMetadataEntity;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityDeletionOrUpdateAdapter<SyncMetadataEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE `sync_metadata` SET `user_id` = ?,`resource_type` = ?,`last_sync_time` = ? WHERE `user_id` = ? AND `resource_type` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            SyncMetadataEntity entity = (SyncMetadataEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            String str = entity.f8419a;
            statement.z(1, str);
            SyncMetadataEntity.ResourceType resourceType = SyncMetadataEntity.ResourceType.d;
            SyncMetadataDao_Impl.d();
            statement.z(2, "InboxMessages");
            String string = entity.b.toString();
            Intrinsics.g(string, "toString(...)");
            statement.z(3, string);
            statement.z(4, str);
            SyncMetadataDao_Impl.d();
            statement.z(5, "InboxMessages");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/SyncMetadataDao_Impl$Companion;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8418a;

        static {
            int[] iArr = new int[SyncMetadataEntity.ResourceType.values().length];
            try {
                SyncMetadataEntity.ResourceType resourceType = SyncMetadataEntity.ResourceType.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8418a = iArr;
        }
    }

    public SyncMetadataDao_Impl(RoomDatabase roomDatabase) {
        this.f8417a = roomDatabase;
        this.b = new EntityUpsertionAdapter(new AnonymousClass1(roomDatabase), new AnonymousClass2(roomDatabase));
    }

    public static void d() {
        SyncMetadataEntity.ResourceType resourceType = SyncMetadataEntity.ResourceType.d;
        if (WhenMappings.f8418a[0] != 1) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void e(SyncMetadataDao_Impl syncMetadataDao_Impl, String str) {
        if (!str.equals("InboxMessages")) {
            throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
        SyncMetadataEntity.ResourceType resourceType = SyncMetadataEntity.ResourceType.d;
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao
    public final Object a(final SyncMetadataEntity syncMetadataEntity, Continuation continuation) {
        Object objB = CoroutinesRoom.Companion.b(this.f8417a, new Callable<Unit>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao_Impl$upsert$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                SyncMetadataDao_Impl syncMetadataDao_Impl = this.d;
                RoomDatabase roomDatabase = syncMetadataDao_Impl.f8417a;
                roomDatabase.c();
                try {
                    EntityUpsertionAdapter entityUpsertionAdapter = syncMetadataDao_Impl.b;
                    SyncMetadataEntity syncMetadataEntity2 = syncMetadataEntity;
                    entityUpsertionAdapter.getClass();
                    try {
                        entityUpsertionAdapter.f3710a.e(syncMetadataEntity2);
                    } catch (SQLiteConstraintException e) {
                        String message = e.getMessage();
                        if (message == null) {
                            throw e;
                        }
                        if (!StringsKt.o(message, "unique", true) && !StringsKt.o(message, "2067", false) && !StringsKt.o(message, "1555", false)) {
                            throw e;
                        }
                        entityUpsertionAdapter.b.e(syncMetadataEntity2);
                    }
                    roomDatabase.r();
                    roomDatabase.l();
                    return Unit.f24250a;
                } catch (Throwable th) {
                    roomDatabase.l();
                    throw th;
                }
            }
        }, continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao
    public final Flow b(String userId) {
        SyncMetadataEntity.ResourceType resourceType = SyncMetadataEntity.ResourceType.d;
        Intrinsics.h(userId, "userId");
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(2, "SELECT * FROM sync_metadata where user_id = ? AND resource_type = ?");
        roomSQLiteQueryA.z(1, userId);
        d();
        roomSQLiteQueryA.z(2, "InboxMessages");
        Callable<SyncMetadataEntity> callable = new Callable<SyncMetadataEntity>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao_Impl$streamByUserIdAndType$1
            @Override // java.util.concurrent.Callable
            public final SyncMetadataEntity call() {
                SyncMetadataEntity syncMetadataEntity;
                SyncMetadataDao_Impl syncMetadataDao_Impl = this.d;
                Cursor cursorB = DBUtil.b(syncMetadataDao_Impl.f8417a, roomSQLiteQueryA, false);
                try {
                    int iB = CursorUtil.b(cursorB, "user_id");
                    int iB2 = CursorUtil.b(cursorB, "resource_type");
                    int iB3 = CursorUtil.b(cursorB, "last_sync_time");
                    if (cursorB.moveToFirst()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = cursorB.getString(iB2);
                        Intrinsics.g(string2, "getString(...)");
                        SyncMetadataDao_Impl.e(syncMetadataDao_Impl, string2);
                        SyncMetadataEntity.ResourceType resourceType2 = SyncMetadataEntity.ResourceType.d;
                        String string3 = cursorB.getString(iB3);
                        Intrinsics.g(string3, "getString(...)");
                        Instant instant = Instant.parse(string3);
                        Intrinsics.g(instant, "parse(...)");
                        syncMetadataEntity = new SyncMetadataEntity(string, instant);
                    } else {
                        syncMetadataEntity = null;
                    }
                    return syncMetadataEntity;
                } finally {
                    cursorB.close();
                }
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        return CoroutinesRoom.Companion.a(this.f8417a, false, new String[]{"sync_metadata"}, callable);
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao
    public final Object c(String str, Continuation continuation) {
        SyncMetadataEntity.ResourceType resourceType = SyncMetadataEntity.ResourceType.d;
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(2, "SELECT * FROM sync_metadata where user_id = ? AND resource_type = ?");
        roomSQLiteQueryA.z(1, str);
        d();
        roomSQLiteQueryA.z(2, "InboxMessages");
        return CoroutinesRoom.Companion.c(this.f8417a, false, new CancellationSignal(), new Callable<SyncMetadataEntity>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.SyncMetadataDao_Impl$findByUserIdAndType$2
            @Override // java.util.concurrent.Callable
            public final SyncMetadataEntity call() {
                SyncMetadataEntity syncMetadataEntity;
                SyncMetadataDao_Impl syncMetadataDao_Impl = this.d;
                RoomDatabase roomDatabase = syncMetadataDao_Impl.f8417a;
                RoomSQLiteQuery roomSQLiteQuery = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery, false);
                try {
                    int iB = CursorUtil.b(cursorB, "user_id");
                    int iB2 = CursorUtil.b(cursorB, "resource_type");
                    int iB3 = CursorUtil.b(cursorB, "last_sync_time");
                    if (cursorB.moveToFirst()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = cursorB.getString(iB2);
                        Intrinsics.g(string2, "getString(...)");
                        SyncMetadataDao_Impl.e(syncMetadataDao_Impl, string2);
                        SyncMetadataEntity.ResourceType resourceType2 = SyncMetadataEntity.ResourceType.d;
                        String string3 = cursorB.getString(iB3);
                        Intrinsics.g(string3, "getString(...)");
                        Instant instant = Instant.parse(string3);
                        Intrinsics.g(instant, "parse(...)");
                        syncMetadataEntity = new SyncMetadataEntity(string, instant);
                    } else {
                        syncMetadataEntity = null;
                    }
                    return syncMetadataEntity;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, continuation);
    }
}
