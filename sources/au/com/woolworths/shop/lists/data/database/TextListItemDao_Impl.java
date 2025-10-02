package au.com.woolworths.shop.lists.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.i18n.TextBundle;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/TextListItemDao_Impl;", "Lau/com/woolworths/shop/lists/data/database/TextListItemDao;", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextListItemDao_Impl implements TextListItemDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12275a;
    public final AnonymousClass1 b;
    public final AnonymousClass2 c;
    public final AnonymousClass3 d;
    public final AnonymousClass6 e;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/TextListItemDao_Impl$1", "Landroidx/room/EntityInsertionAdapter;", "Lau/com/woolworths/shop/lists/data/entity/TextListItemEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertionAdapter<TextListItemEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR ABORT INTO `text_list_item` (`id`,`list_id`,`created_at`,`updated_at`,`remote_id`,`remote_timestamp`,`edited`,`deleted`,`checked`,`text`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            TextListItemEntity entity = (TextListItemEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.getId());
            statement.z(2, entity.getListId());
            statement.C0(3, entity.getLocalCreatedAt());
            statement.C0(4, entity.getLocalUpdatedAt());
            String remoteId = entity.getRemoteId();
            if (remoteId == null) {
                statement.N0(5);
            } else {
                statement.z(5, remoteId);
            }
            statement.C0(6, entity.getRemoteTimestamp());
            statement.C0(7, entity.isLocalEdited() ? 1L : 0L);
            statement.C0(8, entity.isLocalDeleted() ? 1L : 0L);
            statement.C0(9, entity.isChecked() ? 1L : 0L);
            statement.z(10, entity.getText());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/TextListItemDao_Impl$2", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/shop/lists/data/entity/TextListItemEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityDeletionOrUpdateAdapter<TextListItemEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM `text_list_item` WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            TextListItemEntity entity = (TextListItemEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/TextListItemDao_Impl$3", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/shop/lists/data/entity/TextListItemEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$3, reason: invalid class name */
    public final class AnonymousClass3 extends EntityDeletionOrUpdateAdapter<TextListItemEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE OR ABORT `text_list_item` SET `id` = ?,`list_id` = ?,`created_at` = ?,`updated_at` = ?,`remote_id` = ?,`remote_timestamp` = ?,`edited` = ?,`deleted` = ?,`checked` = ?,`text` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            TextListItemEntity entity = (TextListItemEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.getId());
            statement.z(2, entity.getListId());
            statement.C0(3, entity.getLocalCreatedAt());
            statement.C0(4, entity.getLocalUpdatedAt());
            String remoteId = entity.getRemoteId();
            if (remoteId == null) {
                statement.N0(5);
            } else {
                statement.z(5, remoteId);
            }
            statement.C0(6, entity.getRemoteTimestamp());
            statement.C0(7, entity.isLocalEdited() ? 1L : 0L);
            statement.C0(8, entity.isLocalDeleted() ? 1L : 0L);
            statement.C0(9, entity.isChecked() ? 1L : 0L);
            statement.z(10, entity.getText());
            statement.z(11, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/TextListItemDao_Impl$4", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$4, reason: invalid class name */
    public final class AnonymousClass4 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM text_list_item WHERE id = ?";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/TextListItemDao_Impl$5", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$5, reason: invalid class name */
    public final class AnonymousClass5 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM text_list_item WHERE list_id = ?";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/TextListItemDao_Impl$6", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$6, reason: invalid class name */
    public final class AnonymousClass6 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM text_list_item";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/TextListItemDao_Impl$Companion;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public TextListItemDao_Impl(RoomDatabase roomDatabase) {
        this.f12275a = roomDatabase;
        this.b = new AnonymousClass1(roomDatabase);
        this.c = new AnonymousClass2(roomDatabase);
        this.d = new AnonymousClass3(roomDatabase);
        new AnonymousClass4(roomDatabase);
        new AnonymousClass5(roomDatabase);
        this.e = new AnonymousClass6(roomDatabase);
    }

    @Override // au.com.woolworths.shop.lists.data.database.TextListItemDao
    public final Object a(Continuation continuation) {
        return CoroutinesRoom.Companion.b(this.f12275a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$deleteAllItems$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                TextListItemDao_Impl textListItemDao_Impl = this.d;
                TextListItemDao_Impl.AnonymousClass6 anonymousClass6 = textListItemDao_Impl.e;
                RoomDatabase roomDatabase = textListItemDao_Impl.f12275a;
                SupportSQLiteStatement supportSQLiteStatementA = anonymousClass6.a();
                try {
                    roomDatabase.c();
                    try {
                        int iP = supportSQLiteStatementA.P();
                        roomDatabase.r();
                        return Integer.valueOf(iP);
                    } finally {
                        roomDatabase.l();
                    }
                } finally {
                    anonymousClass6.c(supportSQLiteStatementA);
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.TextListItemDao
    public final Object b(String str, ContinuationImpl continuationImpl) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM text_list_item WHERE list_id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, str);
        return CoroutinesRoom.Companion.c(this.f12275a, false, new CancellationSignal(), new Callable<List<? extends TextListItemEntity>>() { // from class: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$fetchItemsByListId$2
            @Override // java.util.concurrent.Callable
            public final List<? extends TextListItemEntity> call() {
                RoomDatabase roomDatabase = this.d.f12275a;
                RoomSQLiteQuery roomSQLiteQuery = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery, false);
                try {
                    int iB = CursorUtil.b(cursorB, "id");
                    int iB2 = CursorUtil.b(cursorB, "list_id");
                    int iB3 = CursorUtil.b(cursorB, "created_at");
                    int iB4 = CursorUtil.b(cursorB, "updated_at");
                    int iB5 = CursorUtil.b(cursorB, "remote_id");
                    int iB6 = CursorUtil.b(cursorB, "remote_timestamp");
                    int iB7 = CursorUtil.b(cursorB, "edited");
                    int iB8 = CursorUtil.b(cursorB, "deleted");
                    int iB9 = CursorUtil.b(cursorB, "checked");
                    int iB10 = CursorUtil.b(cursorB, TextBundle.TEXT_ENTRY);
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = cursorB.getString(iB2);
                        Intrinsics.g(string2, "getString(...)");
                        long j = cursorB.getLong(iB3);
                        long j2 = cursorB.getLong(iB4);
                        String string3 = cursorB.isNull(iB5) ? null : cursorB.getString(iB5);
                        long j3 = cursorB.getLong(iB6);
                        boolean z = cursorB.getInt(iB7) != 0;
                        boolean z2 = cursorB.getInt(iB8) != 0;
                        boolean z3 = cursorB.getInt(iB9) != 0;
                        String string4 = cursorB.getString(iB10);
                        Intrinsics.g(string4, "getString(...)");
                        arrayList.add(new TextListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, string4));
                    }
                    return arrayList;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.database.TextListItemDao
    public final Object c(final TextListItemEntity textListItemEntity, ContinuationImpl continuationImpl) {
        Object objB = CoroutinesRoom.Companion.b(this.f12275a, new Callable<Unit>() { // from class: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$update$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                TextListItemDao_Impl textListItemDao_Impl = this.d;
                RoomDatabase roomDatabase = textListItemDao_Impl.f12275a;
                roomDatabase.c();
                try {
                    textListItemDao_Impl.d.e(textListItemEntity);
                    roomDatabase.r();
                    roomDatabase.l();
                    return Unit.f24250a;
                } catch (Throwable th) {
                    roomDatabase.l();
                    throw th;
                }
            }
        }, continuationImpl);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @Override // au.com.woolworths.shop.lists.data.database.TextListItemDao
    public final Flow d(String listId) {
        Intrinsics.h(listId, "listId");
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM text_list_item WHERE list_id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, listId);
        Callable<List<? extends TextListItemEntity>> callable = new Callable<List<? extends TextListItemEntity>>() { // from class: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$itemsInList$1
            @Override // java.util.concurrent.Callable
            public final List<? extends TextListItemEntity> call() {
                Cursor cursorB = DBUtil.b(this.d.f12275a, roomSQLiteQueryA, false);
                try {
                    int iB = CursorUtil.b(cursorB, "id");
                    int iB2 = CursorUtil.b(cursorB, "list_id");
                    int iB3 = CursorUtil.b(cursorB, "created_at");
                    int iB4 = CursorUtil.b(cursorB, "updated_at");
                    int iB5 = CursorUtil.b(cursorB, "remote_id");
                    int iB6 = CursorUtil.b(cursorB, "remote_timestamp");
                    int iB7 = CursorUtil.b(cursorB, "edited");
                    int iB8 = CursorUtil.b(cursorB, "deleted");
                    int iB9 = CursorUtil.b(cursorB, "checked");
                    int iB10 = CursorUtil.b(cursorB, TextBundle.TEXT_ENTRY);
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = cursorB.getString(iB2);
                        Intrinsics.g(string2, "getString(...)");
                        long j = cursorB.getLong(iB3);
                        long j2 = cursorB.getLong(iB4);
                        String string3 = cursorB.isNull(iB5) ? null : cursorB.getString(iB5);
                        long j3 = cursorB.getLong(iB6);
                        boolean z = cursorB.getInt(iB7) != 0;
                        boolean z2 = cursorB.getInt(iB8) != 0;
                        boolean z3 = cursorB.getInt(iB9) != 0;
                        String string4 = cursorB.getString(iB10);
                        Intrinsics.g(string4, "getString(...)");
                        arrayList.add(new TextListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, string4));
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
        return CoroutinesRoom.Companion.a(this.f12275a, false, new String[]{"text_list_item"}, callable);
    }

    @Override // au.com.woolworths.shop.lists.data.database.TextListItemDao
    public final Object e(String str, SuspendLambda suspendLambda) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM text_list_item WHERE id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, str);
        return CoroutinesRoom.Companion.c(this.f12275a, false, new CancellationSignal(), new Callable<TextListItemEntity>() { // from class: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$fetchItemById$2
            @Override // java.util.concurrent.Callable
            public final TextListItemEntity call() {
                RoomDatabase roomDatabase = this.d.f12275a;
                RoomSQLiteQuery roomSQLiteQuery = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery, false);
                try {
                    int iB = CursorUtil.b(cursorB, "id");
                    int iB2 = CursorUtil.b(cursorB, "list_id");
                    int iB3 = CursorUtil.b(cursorB, "created_at");
                    int iB4 = CursorUtil.b(cursorB, "updated_at");
                    int iB5 = CursorUtil.b(cursorB, "remote_id");
                    int iB6 = CursorUtil.b(cursorB, "remote_timestamp");
                    int iB7 = CursorUtil.b(cursorB, "edited");
                    int iB8 = CursorUtil.b(cursorB, "deleted");
                    int iB9 = CursorUtil.b(cursorB, "checked");
                    int iB10 = CursorUtil.b(cursorB, TextBundle.TEXT_ENTRY);
                    TextListItemEntity textListItemEntity = null;
                    if (cursorB.moveToFirst()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = cursorB.getString(iB2);
                        Intrinsics.g(string2, "getString(...)");
                        long j = cursorB.getLong(iB3);
                        long j2 = cursorB.getLong(iB4);
                        String string3 = cursorB.isNull(iB5) ? null : cursorB.getString(iB5);
                        long j3 = cursorB.getLong(iB6);
                        boolean z = cursorB.getInt(iB7) != 0;
                        boolean z2 = cursorB.getInt(iB8) != 0;
                        boolean z3 = cursorB.getInt(iB9) != 0;
                        String string4 = cursorB.getString(iB10);
                        Intrinsics.g(string4, "getString(...)");
                        textListItemEntity = new TextListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, string4);
                    }
                    return textListItemEntity;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, suspendLambda);
    }

    @Override // au.com.woolworths.shop.lists.data.database.TextListItemDao
    public final Object f(final TextListItemEntity textListItemEntity, SuspendLambda suspendLambda) {
        return CoroutinesRoom.Companion.b(this.f12275a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$delete$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                TextListItemDao_Impl textListItemDao_Impl = this.d;
                RoomDatabase roomDatabase = textListItemDao_Impl.f12275a;
                roomDatabase.c();
                try {
                    int iE = textListItemDao_Impl.c.e(textListItemEntity);
                    roomDatabase.r();
                    return Integer.valueOf(iE);
                } finally {
                    roomDatabase.l();
                }
            }
        }, suspendLambda);
    }

    @Override // au.com.woolworths.shop.lists.data.database.TextListItemDao
    public final Object g(String str, SuspendLambda suspendLambda) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM text_list_item WHERE remote_id = ?");
        roomSQLiteQueryA.z(1, str);
        return CoroutinesRoom.Companion.c(this.f12275a, false, new CancellationSignal(), new Callable<TextListItemEntity>() { // from class: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$fetchItemByRemoteId$2
            @Override // java.util.concurrent.Callable
            public final TextListItemEntity call() {
                RoomDatabase roomDatabase = this.d.f12275a;
                RoomSQLiteQuery roomSQLiteQuery = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery, false);
                try {
                    int iB = CursorUtil.b(cursorB, "id");
                    int iB2 = CursorUtil.b(cursorB, "list_id");
                    int iB3 = CursorUtil.b(cursorB, "created_at");
                    int iB4 = CursorUtil.b(cursorB, "updated_at");
                    int iB5 = CursorUtil.b(cursorB, "remote_id");
                    int iB6 = CursorUtil.b(cursorB, "remote_timestamp");
                    int iB7 = CursorUtil.b(cursorB, "edited");
                    int iB8 = CursorUtil.b(cursorB, "deleted");
                    int iB9 = CursorUtil.b(cursorB, "checked");
                    int iB10 = CursorUtil.b(cursorB, TextBundle.TEXT_ENTRY);
                    TextListItemEntity textListItemEntity = null;
                    if (cursorB.moveToFirst()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        String string2 = cursorB.getString(iB2);
                        Intrinsics.g(string2, "getString(...)");
                        long j = cursorB.getLong(iB3);
                        long j2 = cursorB.getLong(iB4);
                        String string3 = cursorB.isNull(iB5) ? null : cursorB.getString(iB5);
                        long j3 = cursorB.getLong(iB6);
                        boolean z = cursorB.getInt(iB7) != 0;
                        boolean z2 = cursorB.getInt(iB8) != 0;
                        boolean z3 = cursorB.getInt(iB9) != 0;
                        String string4 = cursorB.getString(iB10);
                        Intrinsics.g(string4, "getString(...)");
                        textListItemEntity = new TextListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, string4);
                    }
                    return textListItemEntity;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, suspendLambda);
    }

    @Override // au.com.woolworths.shop.lists.data.database.TextListItemDao
    public final Object h(final TextListItemEntity textListItemEntity, ContinuationImpl continuationImpl) {
        Object objB = CoroutinesRoom.Companion.b(this.f12275a, new Callable<Unit>() { // from class: au.com.woolworths.shop.lists.data.database.TextListItemDao_Impl$insert$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                TextListItemDao_Impl textListItemDao_Impl = this.d;
                RoomDatabase roomDatabase = textListItemDao_Impl.f12275a;
                roomDatabase.c();
                try {
                    textListItemDao_Impl.b.e(textListItemEntity);
                    roomDatabase.r();
                    roomDatabase.l();
                    return Unit.f24250a;
                } catch (Throwable th) {
                    roomDatabase.l();
                    throw th;
                }
            }
        }, continuationImpl);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }
}
