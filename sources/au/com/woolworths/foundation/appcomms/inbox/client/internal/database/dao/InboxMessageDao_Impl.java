package au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao;

import YU.a;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageDao_Impl;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageDao;", "Companion", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InboxMessageDao_Impl extends InboxMessageDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f8415a;
    public final AnonymousClass1 b;
    public final AnonymousClass2 c;
    public final AnonymousClass3 d;
    public final AnonymousClass4 e;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageDao_Impl$1", "Landroidx/room/EntityInsertionAdapter;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageEntity;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertionAdapter<InboxMessageEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR ABORT INTO `inbox_message` (`id`,`user_id`,`campaign_code`,`campaign_variant`,`title`,`body`,`cta`,`created_on`,`ttl`,`seen`,`deleted`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            String strC;
            InboxMessageEntity entity = (InboxMessageEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.f8416a);
            statement.z(2, entity.b);
            statement.z(3, entity.c);
            String str = entity.d;
            if (str == null) {
                statement.N0(4);
            } else {
                statement.z(4, str);
            }
            String str2 = entity.e;
            if (str2 == null) {
                statement.N0(5);
            } else {
                statement.z(5, str2);
            }
            String str3 = entity.f;
            if (str3 == null) {
                statement.N0(6);
            } else {
                statement.z(6, str3);
            }
            CtaEntity ctaEntity = entity.g;
            if (ctaEntity != null) {
                Json.Default r1 = Json.d;
                r1.getClass();
                strC = r1.c(CtaEntity.INSTANCE.serializer(), ctaEntity);
            } else {
                strC = null;
            }
            if (strC == null) {
                statement.N0(7);
            } else {
                statement.z(7, strC);
            }
            statement.z(8, entity.h);
            statement.z(9, entity.i);
            statement.C0(10, entity.j ? 1L : 0L);
            statement.C0(11, entity.k ? 1L : 0L);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageDao_Impl$2", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageEntity;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityDeletionOrUpdateAdapter<InboxMessageEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE OR ABORT `inbox_message` SET `id` = ?,`user_id` = ?,`campaign_code` = ?,`campaign_variant` = ?,`title` = ?,`body` = ?,`cta` = ?,`created_on` = ?,`ttl` = ?,`seen` = ?,`deleted` = ? WHERE `id` = ? AND `user_id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            String strC;
            InboxMessageEntity entity = (InboxMessageEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            String str = entity.f8416a;
            statement.z(1, str);
            String str2 = entity.b;
            statement.z(2, str2);
            statement.z(3, entity.c);
            String str3 = entity.d;
            if (str3 == null) {
                statement.N0(4);
            } else {
                statement.z(4, str3);
            }
            String str4 = entity.e;
            if (str4 == null) {
                statement.N0(5);
            } else {
                statement.z(5, str4);
            }
            String str5 = entity.f;
            if (str5 == null) {
                statement.N0(6);
            } else {
                statement.z(6, str5);
            }
            CtaEntity ctaEntity = entity.g;
            if (ctaEntity != null) {
                Json.Default r3 = Json.d;
                r3.getClass();
                strC = r3.c(CtaEntity.INSTANCE.serializer(), ctaEntity);
            } else {
                strC = null;
            }
            if (strC == null) {
                statement.N0(7);
            } else {
                statement.z(7, strC);
            }
            statement.z(8, entity.h);
            statement.z(9, entity.i);
            statement.C0(10, entity.j ? 1L : 0L);
            statement.C0(11, entity.k ? 1L : 0L);
            statement.z(12, str);
            statement.z(13, str2);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageDao_Impl$3", "Landroidx/room/SharedSQLiteStatement;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$3, reason: invalid class name */
    public final class AnonymousClass3 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE inbox_message SET deleted = 1 WHERE id = ?";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageDao_Impl$4", "Landroidx/room/SharedSQLiteStatement;", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$4, reason: invalid class name */
    public final class AnonymousClass4 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE inbox_message SET deleted = 1 WHERE user_id = ?";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/client/internal/database/dao/InboxMessageDao_Impl$Companion;", "", "inbox-client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public InboxMessageDao_Impl(RoomDatabase roomDatabase) {
        this.f8415a = roomDatabase;
        this.b = new AnonymousClass1(roomDatabase);
        this.c = new AnonymousClass2(roomDatabase);
        this.d = new AnonymousClass3(roomDatabase);
        this.e = new AnonymousClass4(roomDatabase);
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao
    public final Object a(String str, String str2, Continuation continuation) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(2, "SELECT * FROM inbox_message WHERE id = ? AND user_id = ?");
        roomSQLiteQueryA.z(1, str);
        roomSQLiteQueryA.z(2, str2);
        return CoroutinesRoom.Companion.c(this.f8415a, false, new CancellationSignal(), new Callable<InboxMessageEntity>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$findByIdAndUserId$2
            @Override // java.util.concurrent.Callable
            public final InboxMessageEntity call() {
                RoomDatabase roomDatabase = this.d.f8415a;
                RoomSQLiteQuery roomSQLiteQuery = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery, false);
                try {
                    int iB = CursorUtil.b(cursorB, "id");
                    int iB2 = CursorUtil.b(cursorB, "user_id");
                    int iB3 = CursorUtil.b(cursorB, "campaign_code");
                    int iB4 = CursorUtil.b(cursorB, "campaign_variant");
                    int iB5 = CursorUtil.b(cursorB, "title");
                    int iB6 = CursorUtil.b(cursorB, "body");
                    int iB7 = CursorUtil.b(cursorB, "cta");
                    int iB8 = CursorUtil.b(cursorB, "created_on");
                    int iB9 = CursorUtil.b(cursorB, "ttl");
                    int iB10 = CursorUtil.b(cursorB, "seen");
                    int iB11 = CursorUtil.b(cursorB, "deleted");
                    InboxMessageEntity inboxMessageEntity = null;
                    CtaEntity ctaEntity = null;
                    if (cursorB.moveToFirst()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = cursorB.getString(iB2);
                        Intrinsics.g(string2, "getString(...)");
                        String string3 = cursorB.getString(iB3);
                        Intrinsics.g(string3, "getString(...)");
                        String string4 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                        String string5 = cursorB.isNull(iB5) ? null : cursorB.getString(iB5);
                        String string6 = cursorB.isNull(iB6) ? null : cursorB.getString(iB6);
                        String string7 = cursorB.isNull(iB7) ? null : cursorB.getString(iB7);
                        if (string7 != null) {
                            Json.Default r9 = Json.d;
                            r9.getClass();
                            ctaEntity = (CtaEntity) r9.b(CtaEntity.INSTANCE.serializer(), string7);
                        }
                        CtaEntity ctaEntity2 = ctaEntity;
                        String string8 = cursorB.getString(iB8);
                        Intrinsics.g(string8, "getString(...)");
                        String string9 = cursorB.getString(iB9);
                        Intrinsics.g(string9, "getString(...)");
                        inboxMessageEntity = new InboxMessageEntity(string, string2, string3, string4, string5, string6, ctaEntity2, string8, string9, cursorB.getInt(iB10) != 0, cursorB.getInt(iB11) != 0);
                    }
                    return inboxMessageEntity;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao
    public final Object b(final InboxMessageEntity inboxMessageEntity, Continuation continuation) {
        Object objB = CoroutinesRoom.Companion.b(this.f8415a, new Callable<Unit>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$insert$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                InboxMessageDao_Impl inboxMessageDao_Impl = this.d;
                RoomDatabase roomDatabase = inboxMessageDao_Impl.f8415a;
                roomDatabase.c();
                try {
                    inboxMessageDao_Impl.b.e(inboxMessageEntity);
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

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao
    public final Object c(final String str, Continuation continuation) {
        Object objB = CoroutinesRoom.Companion.b(this.f8415a, new Callable<Unit>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$markAsDeleted$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                InboxMessageDao_Impl inboxMessageDao_Impl = this.d;
                InboxMessageDao_Impl.AnonymousClass3 anonymousClass3 = inboxMessageDao_Impl.d;
                RoomDatabase roomDatabase = inboxMessageDao_Impl.f8415a;
                SupportSQLiteStatement supportSQLiteStatementA = anonymousClass3.a();
                supportSQLiteStatementA.z(1, str);
                try {
                    roomDatabase.c();
                    try {
                        supportSQLiteStatementA.P();
                        roomDatabase.r();
                        anonymousClass3.c(supportSQLiteStatementA);
                        return Unit.f24250a;
                    } finally {
                        roomDatabase.l();
                    }
                } catch (Throwable th) {
                    anonymousClass3.c(supportSQLiteStatementA);
                    throw th;
                }
            }
        }, continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao
    public final Object d(final String str, Continuation continuation) {
        Object objB = CoroutinesRoom.Companion.b(this.f8415a, new Callable<Unit>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$markAsDeletedByUserId$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                InboxMessageDao_Impl inboxMessageDao_Impl = this.d;
                InboxMessageDao_Impl.AnonymousClass4 anonymousClass4 = inboxMessageDao_Impl.e;
                RoomDatabase roomDatabase = inboxMessageDao_Impl.f8415a;
                SupportSQLiteStatement supportSQLiteStatementA = anonymousClass4.a();
                supportSQLiteStatementA.z(1, str);
                try {
                    roomDatabase.c();
                    try {
                        supportSQLiteStatementA.P();
                        roomDatabase.r();
                        anonymousClass4.c(supportSQLiteStatementA);
                        return Unit.f24250a;
                    } finally {
                        roomDatabase.l();
                    }
                } catch (Throwable th) {
                    anonymousClass4.c(supportSQLiteStatementA);
                    throw th;
                }
            }
        }, continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao
    public final Object e(final ArrayList arrayList, Continuation continuation) {
        Object objB = CoroutinesRoom.Companion.b(this.f8415a, new Callable<Unit>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$markAsSeen$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                StringBuilder sbS = a.s("UPDATE inbox_message SET seen = 1 WHERE id IN (");
                ArrayList arrayList2 = arrayList;
                StringUtil.a(arrayList2.size(), sbS);
                sbS.append(")");
                String string = sbS.toString();
                Intrinsics.g(string, "toString(...)");
                RoomDatabase roomDatabase = this.f8415a;
                SupportSQLiteStatement supportSQLiteStatementD = roomDatabase.d(string);
                Iterator it = arrayList2.iterator();
                int i = 1;
                while (it.hasNext()) {
                    supportSQLiteStatementD.z(i, (String) it.next());
                    i++;
                }
                roomDatabase.c();
                try {
                    supportSQLiteStatementD.P();
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

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao
    public final Flow f(String userId) {
        Intrinsics.h(userId, "userId");
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM inbox_message WHERE user_id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, userId);
        Callable<List<? extends InboxMessageEntity>> callable = new Callable<List<? extends InboxMessageEntity>>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$streamByUserId$1
            @Override // java.util.concurrent.Callable
            public final List<? extends InboxMessageEntity> call() {
                String str;
                String string;
                int i;
                String str2;
                Cursor cursorB = DBUtil.b(this.d.f8415a, roomSQLiteQueryA, false);
                try {
                    int iB = CursorUtil.b(cursorB, "id");
                    int iB2 = CursorUtil.b(cursorB, "user_id");
                    int iB3 = CursorUtil.b(cursorB, "campaign_code");
                    int iB4 = CursorUtil.b(cursorB, "campaign_variant");
                    int iB5 = CursorUtil.b(cursorB, "title");
                    int iB6 = CursorUtil.b(cursorB, "body");
                    int iB7 = CursorUtil.b(cursorB, "cta");
                    int iB8 = CursorUtil.b(cursorB, "created_on");
                    int iB9 = CursorUtil.b(cursorB, "ttl");
                    int iB10 = CursorUtil.b(cursorB, "seen");
                    int iB11 = CursorUtil.b(cursorB, "deleted");
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string2 = cursorB.getString(iB);
                        Intrinsics.g(string2, "getString(...)");
                        String string3 = cursorB.getString(iB2);
                        Intrinsics.g(string3, "getString(...)");
                        String string4 = cursorB.getString(iB3);
                        Intrinsics.g(string4, "getString(...)");
                        CtaEntity ctaEntity = null;
                        String string5 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                        String string6 = cursorB.isNull(iB5) ? null : cursorB.getString(iB5);
                        String string7 = cursorB.isNull(iB6) ? null : cursorB.getString(iB6);
                        if (cursorB.isNull(iB7)) {
                            str = string4;
                            string = null;
                        } else {
                            str = string4;
                            string = cursorB.getString(iB7);
                        }
                        if (string != null) {
                            i = iB;
                            Json.Default r3 = Json.d;
                            r3.getClass();
                            str2 = string2;
                            ctaEntity = (CtaEntity) r3.b(CtaEntity.INSTANCE.serializer(), string);
                        } else {
                            i = iB;
                            str2 = string2;
                        }
                        String string8 = cursorB.getString(iB8);
                        Intrinsics.g(string8, "getString(...)");
                        String string9 = cursorB.getString(iB9);
                        Intrinsics.g(string9, "getString(...)");
                        arrayList.add(new InboxMessageEntity(str2, string3, str, string5, string6, string7, ctaEntity, string8, string9, cursorB.getInt(iB10) != 0, cursorB.getInt(iB11) != 0));
                        iB = i;
                    }
                    return arrayList;
                } finally {
                    cursorB.close();
                }
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        return CoroutinesRoom.Companion.a(this.f8415a, false, new String[]{"inbox_message"}, callable);
    }

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao
    public final Object g(final InboxMessageEntity inboxMessageEntity, Continuation continuation) {
        Object objB = CoroutinesRoom.Companion.b(this.f8415a, new Callable<Unit>() { // from class: au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao_Impl$update$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                InboxMessageDao_Impl inboxMessageDao_Impl = this.d;
                RoomDatabase roomDatabase = inboxMessageDao_Impl.f8415a;
                roomDatabase.c();
                try {
                    inboxMessageDao_Impl.c.e(inboxMessageEntity);
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

    @Override // au.com.woolworths.foundation.appcomms.inbox.client.internal.database.dao.InboxMessageDao
    public final Object h(ArrayList arrayList, String str, Continuation continuation) {
        Object objA = RoomDatabaseKt.a(this.f8415a, new InboxMessageDao_Impl$upsert$2(this, arrayList, str, null), continuation);
        return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
    }
}
