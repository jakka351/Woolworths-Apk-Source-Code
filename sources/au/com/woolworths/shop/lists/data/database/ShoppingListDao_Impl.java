package au.com.woolworths.shop.lists.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.collection.ArrayMap;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl;
import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ShoppingListDao_Impl;", "Lau/com/woolworths/shop/lists/data/database/ShoppingListDao;", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShoppingListDao_Impl implements ShoppingListDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12274a;
    public final AnonymousClass1 b;
    public final AnonymousClass2 c;
    public final AnonymousClass3 d;
    public final AnonymousClass6 e;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/ShoppingListDao_Impl$1", "Landroidx/room/EntityInsertionAdapter;", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertionAdapter<ShoppingListEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR ABORT INTO `shopping_list` (`id`,`created_at`,`updated_at`,`remote_id`,`remote_timestamp`,`edited`,`deleted`,`remote_edited`,`last_synced_time`,`title`,`color`,`watchlisted`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            ShoppingListEntity entity = (ShoppingListEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.getId());
            statement.C0(2, entity.getLocalCreatedAt());
            statement.C0(3, entity.getLocalUpdatedAt());
            String remoteId = entity.getRemoteId();
            if (remoteId == null) {
                statement.N0(4);
            } else {
                statement.z(4, remoteId);
            }
            statement.C0(5, entity.getRemoteTimestamp());
            statement.C0(6, entity.isLocalEdited() ? 1L : 0L);
            statement.C0(7, entity.isLocalDeleted() ? 1L : 0L);
            statement.C0(8, entity.isRemoteEdited() ? 1L : 0L);
            statement.C0(9, entity.getLastSyncedTime());
            statement.z(10, entity.getTitle());
            statement.C0(11, entity.getColor());
            Boolean boolIsWatchlist = entity.isWatchlist();
            if ((boolIsWatchlist != null ? Integer.valueOf(boolIsWatchlist.booleanValue() ? 1 : 0) : null) == null) {
                statement.N0(12);
            } else {
                statement.C0(12, r6.intValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/ShoppingListDao_Impl$2", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityDeletionOrUpdateAdapter<ShoppingListEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM `shopping_list` WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            ShoppingListEntity entity = (ShoppingListEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/ShoppingListDao_Impl$3", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$3, reason: invalid class name */
    public final class AnonymousClass3 extends EntityDeletionOrUpdateAdapter<ShoppingListEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE OR ABORT `shopping_list` SET `id` = ?,`created_at` = ?,`updated_at` = ?,`remote_id` = ?,`remote_timestamp` = ?,`edited` = ?,`deleted` = ?,`remote_edited` = ?,`last_synced_time` = ?,`title` = ?,`color` = ?,`watchlisted` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            ShoppingListEntity entity = (ShoppingListEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.getId());
            statement.C0(2, entity.getLocalCreatedAt());
            statement.C0(3, entity.getLocalUpdatedAt());
            String remoteId = entity.getRemoteId();
            if (remoteId == null) {
                statement.N0(4);
            } else {
                statement.z(4, remoteId);
            }
            statement.C0(5, entity.getRemoteTimestamp());
            statement.C0(6, entity.isLocalEdited() ? 1L : 0L);
            statement.C0(7, entity.isLocalDeleted() ? 1L : 0L);
            statement.C0(8, entity.isRemoteEdited() ? 1L : 0L);
            statement.C0(9, entity.getLastSyncedTime());
            statement.z(10, entity.getTitle());
            statement.C0(11, entity.getColor());
            Boolean boolIsWatchlist = entity.isWatchlist();
            if ((boolIsWatchlist != null ? Integer.valueOf(boolIsWatchlist.booleanValue() ? 1 : 0) : null) == null) {
                statement.N0(12);
            } else {
                statement.C0(12, r0.intValue());
            }
            statement.z(13, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/ShoppingListDao_Impl$4", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$4, reason: invalid class name */
    public final class AnonymousClass4 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM shopping_list WHERE id = ?";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/ShoppingListDao_Impl$5", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$5, reason: invalid class name */
    public final class AnonymousClass5 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM shopping_list WHERE remote_id = ?";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/ShoppingListDao_Impl$6", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$6, reason: invalid class name */
    public final class AnonymousClass6 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM shopping_list";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ShoppingListDao_Impl$Companion;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShoppingListDao_Impl(RoomDatabase roomDatabase) {
        this.f12274a = roomDatabase;
        this.b = new AnonymousClass1(roomDatabase);
        this.c = new AnonymousClass2(roomDatabase);
        this.d = new AnonymousClass3(roomDatabase);
        new AnonymousClass4(roomDatabase);
        new AnonymousClass5(roomDatabase);
        this.e = new AnonymousClass6(roomDatabase);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object a(Continuation continuation) {
        return CoroutinesRoom.Companion.b(this.f12274a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$deleteAll$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                ShoppingListDao_Impl shoppingListDao_Impl = this.d;
                ShoppingListDao_Impl.AnonymousClass6 anonymousClass6 = shoppingListDao_Impl.e;
                RoomDatabase roomDatabase = shoppingListDao_Impl.f12274a;
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

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object b(final ShoppingListEntity shoppingListEntity, Continuation continuation) {
        return CoroutinesRoom.Companion.b(this.f12274a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$delete$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                ShoppingListDao_Impl shoppingListDao_Impl = this.d;
                RoomDatabase roomDatabase = shoppingListDao_Impl.f12274a;
                roomDatabase.c();
                try {
                    int iE = shoppingListDao_Impl.c.e(shoppingListEntity);
                    roomDatabase.r();
                    return Integer.valueOf(iE);
                } finally {
                    roomDatabase.l();
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object c(Continuation continuation) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM shopping_list WHERE deleted = 0 ORDER BY updated_at DESC");
        return CoroutinesRoom.Companion.c(this.f12274a, false, new CancellationSignal(), new Callable<List<? extends ShoppingListEntity>>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$fetchAll$2
            @Override // java.util.concurrent.Callable
            public final List<? extends ShoppingListEntity> call() throws Throwable {
                RoomSQLiteQuery roomSQLiteQuery;
                int iB;
                int iB2;
                int iB3;
                int iB4;
                int iB5;
                int iB6;
                int iB7;
                int iB8;
                int iB9;
                int iB10;
                int iB11;
                int iB12;
                boolean z;
                RoomDatabase roomDatabase = this.d.f12274a;
                RoomSQLiteQuery roomSQLiteQuery2 = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery2, false);
                try {
                    iB = CursorUtil.b(cursorB, "id");
                    iB2 = CursorUtil.b(cursorB, "created_at");
                    iB3 = CursorUtil.b(cursorB, "updated_at");
                    iB4 = CursorUtil.b(cursorB, "remote_id");
                    iB5 = CursorUtil.b(cursorB, "remote_timestamp");
                    iB6 = CursorUtil.b(cursorB, "edited");
                    iB7 = CursorUtil.b(cursorB, "deleted");
                    iB8 = CursorUtil.b(cursorB, "remote_edited");
                    iB9 = CursorUtil.b(cursorB, "last_synced_time");
                    iB10 = CursorUtil.b(cursorB, "title");
                    iB11 = CursorUtil.b(cursorB, "color");
                    iB12 = CursorUtil.b(cursorB, "watchlisted");
                    roomSQLiteQuery = roomSQLiteQuery2;
                } catch (Throwable th) {
                    th = th;
                    roomSQLiteQuery = roomSQLiteQuery2;
                }
                try {
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        long j = cursorB.getLong(iB2);
                        long j2 = cursorB.getLong(iB3);
                        Boolean boolValueOf = null;
                        String string2 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                        long j3 = cursorB.getLong(iB5);
                        boolean z2 = true;
                        if (cursorB.getInt(iB6) != 0) {
                            z = true;
                        } else {
                            z = true;
                            z2 = false;
                        }
                        boolean z3 = cursorB.getInt(iB7) != 0 ? z : false;
                        boolean z4 = cursorB.getInt(iB8) != 0 ? z : false;
                        long j4 = cursorB.getLong(iB9);
                        String string3 = cursorB.getString(iB10);
                        Intrinsics.g(string3, "getString(...)");
                        int i = cursorB.getInt(iB11);
                        Integer numValueOf = cursorB.isNull(iB12) ? null : Integer.valueOf(cursorB.getInt(iB12));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        }
                        arrayList.add(new ShoppingListEntity(string, j, j2, string2, j3, z2, z3, z4, j4, string3, i, boolValueOf));
                    }
                    cursorB.close();
                    roomSQLiteQuery.release();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursorB.close();
                    roomSQLiteQuery.release();
                    throw th;
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object d(Continuation continuation) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT COUNT(id) from shopping_list WHERE deleted = 0");
        return CoroutinesRoom.Companion.c(this.f12274a, false, new CancellationSignal(), new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$countAll$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                RoomDatabase roomDatabase = this.d.f12274a;
                RoomSQLiteQuery roomSQLiteQuery = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery, false);
                try {
                    Integer numValueOf = Integer.valueOf(cursorB.moveToFirst() ? cursorB.getInt(0) : 0);
                    cursorB.close();
                    roomSQLiteQuery.release();
                    return numValueOf;
                } catch (Throwable th) {
                    cursorB.close();
                    roomSQLiteQuery.release();
                    throw th;
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Flow e() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT id FROM shopping_list WHERE watchlisted = 1");
        Callable<String> callable = new Callable<String>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$fetchWatchlistId$1
            @Override // java.util.concurrent.Callable
            public final String call() {
                Cursor cursorB = DBUtil.b(this.d.f12274a, roomSQLiteQueryA, false);
                try {
                    String string = null;
                    if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                        string = cursorB.getString(0);
                    }
                    return string;
                } finally {
                    cursorB.close();
                }
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        return CoroutinesRoom.Companion.a(this.f12274a, false, new String[]{"shopping_list"}, callable);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Flow f(String id) {
        Intrinsics.h(id, "id");
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM shopping_list WHERE id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, id);
        Callable<ShoppingListWithItemsEntity> callable = new Callable<ShoppingListWithItemsEntity>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$listWithItems$1
            @Override // java.util.concurrent.Callable
            public final ShoppingListWithItemsEntity call() throws Throwable {
                int i;
                ShoppingListDao_Impl shoppingListDao_Impl = this.d;
                RoomDatabase roomDatabase = shoppingListDao_Impl.f12274a;
                roomDatabase.c();
                try {
                    try {
                        Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQueryA, true);
                        try {
                            int iB = CursorUtil.b(cursorB, "id");
                            int iB2 = CursorUtil.b(cursorB, "created_at");
                            int iB3 = CursorUtil.b(cursorB, "updated_at");
                            int iB4 = CursorUtil.b(cursorB, "remote_id");
                            int iB5 = CursorUtil.b(cursorB, "remote_timestamp");
                            int iB6 = CursorUtil.b(cursorB, "edited");
                            int iB7 = CursorUtil.b(cursorB, "deleted");
                            int iB8 = CursorUtil.b(cursorB, "remote_edited");
                            int iB9 = CursorUtil.b(cursorB, "last_synced_time");
                            int iB10 = CursorUtil.b(cursorB, "title");
                            int iB11 = CursorUtil.b(cursorB, "color");
                            int iB12 = CursorUtil.b(cursorB, "watchlisted");
                            try {
                                ArrayMap arrayMap = new ArrayMap(0);
                                ArrayMap arrayMap2 = new ArrayMap(0);
                                while (cursorB.moveToNext()) {
                                    int i2 = iB11;
                                    String string = cursorB.getString(iB);
                                    Intrinsics.g(string, "getString(...)");
                                    if (arrayMap.containsKey(string)) {
                                        i = iB10;
                                    } else {
                                        i = iB10;
                                        arrayMap.put(string, new ArrayList());
                                    }
                                    String string2 = cursorB.getString(iB);
                                    Intrinsics.g(string2, "getString(...)");
                                    if (!arrayMap2.containsKey(string2)) {
                                        arrayMap2.put(string2, new ArrayList());
                                    }
                                    iB11 = i2;
                                    iB10 = i;
                                }
                                int i3 = iB11;
                                int i4 = iB10;
                                cursorB.moveToPosition(-1);
                                shoppingListDao_Impl.o(arrayMap);
                                shoppingListDao_Impl.p(arrayMap2);
                                ShoppingListWithItemsEntity shoppingListWithItemsEntity = null;
                                Boolean boolValueOf = null;
                                if (cursorB.moveToFirst()) {
                                    String string3 = cursorB.getString(iB);
                                    Intrinsics.g(string3, "getString(...)");
                                    long j = cursorB.getLong(iB2);
                                    long j2 = cursorB.getLong(iB3);
                                    String string4 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                                    long j3 = cursorB.getLong(iB5);
                                    boolean z = cursorB.getInt(iB6) != 0;
                                    boolean z2 = cursorB.getInt(iB7) != 0;
                                    boolean z3 = cursorB.getInt(iB8) != 0;
                                    long j4 = cursorB.getLong(iB9);
                                    String string5 = cursorB.getString(i4);
                                    Intrinsics.g(string5, "getString(...)");
                                    int i5 = cursorB.getInt(i3);
                                    Integer numValueOf = cursorB.isNull(iB12) ? null : Integer.valueOf(cursorB.getInt(iB12));
                                    if (numValueOf != null) {
                                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                                    }
                                    ShoppingListEntity shoppingListEntity = new ShoppingListEntity(string3, j, j2, string4, j3, z, z2, z3, j4, string5, i5, boolValueOf);
                                    String string6 = cursorB.getString(iB);
                                    Intrinsics.g(string6, "getString(...)");
                                    Object objE = MapsKt.e(string6, arrayMap);
                                    Intrinsics.g(objE, "getValue(...)");
                                    String string7 = cursorB.getString(iB);
                                    Intrinsics.g(string7, "getString(...)");
                                    Object objE2 = MapsKt.e(string7, arrayMap2);
                                    Intrinsics.g(objE2, "getValue(...)");
                                    shoppingListWithItemsEntity = new ShoppingListWithItemsEntity(shoppingListEntity, (ArrayList) objE, (ArrayList) objE2);
                                }
                                roomDatabase.r();
                                cursorB.close();
                                roomDatabase.l();
                                return shoppingListWithItemsEntity;
                            } catch (Throwable th) {
                                th = th;
                                cursorB.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        roomDatabase.l();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    roomDatabase.l();
                    throw th;
                }
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        return CoroutinesRoom.Companion.a(this.f12274a, true, new String[]{"product_list_item", "text_list_item", "shopping_list"}, callable);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Flow g() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM shopping_list WHERE deleted = 0 ORDER BY updated_at DESC");
        Callable<List<? extends ShoppingListEntity>> callable = new Callable<List<? extends ShoppingListEntity>>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$allLists$1
            @Override // java.util.concurrent.Callable
            public final List<? extends ShoppingListEntity> call() {
                boolean z;
                Cursor cursorB = DBUtil.b(this.d.f12274a, roomSQLiteQueryA, false);
                try {
                    int iB = CursorUtil.b(cursorB, "id");
                    int iB2 = CursorUtil.b(cursorB, "created_at");
                    int iB3 = CursorUtil.b(cursorB, "updated_at");
                    int iB4 = CursorUtil.b(cursorB, "remote_id");
                    int iB5 = CursorUtil.b(cursorB, "remote_timestamp");
                    int iB6 = CursorUtil.b(cursorB, "edited");
                    int iB7 = CursorUtil.b(cursorB, "deleted");
                    int iB8 = CursorUtil.b(cursorB, "remote_edited");
                    int iB9 = CursorUtil.b(cursorB, "last_synced_time");
                    int iB10 = CursorUtil.b(cursorB, "title");
                    int iB11 = CursorUtil.b(cursorB, "color");
                    int iB12 = CursorUtil.b(cursorB, "watchlisted");
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        long j = cursorB.getLong(iB2);
                        long j2 = cursorB.getLong(iB3);
                        Boolean boolValueOf = null;
                        String string2 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                        long j3 = cursorB.getLong(iB5);
                        boolean z2 = true;
                        if (cursorB.getInt(iB6) != 0) {
                            z = true;
                        } else {
                            z = true;
                            z2 = false;
                        }
                        boolean z3 = cursorB.getInt(iB7) != 0 ? z : false;
                        boolean z4 = cursorB.getInt(iB8) != 0 ? z : false;
                        long j4 = cursorB.getLong(iB9);
                        String string3 = cursorB.getString(iB10);
                        Intrinsics.g(string3, "getString(...)");
                        int i = cursorB.getInt(iB11);
                        Integer numValueOf = cursorB.isNull(iB12) ? null : Integer.valueOf(cursorB.getInt(iB12));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        }
                        arrayList.add(new ShoppingListEntity(string, j, j2, string2, j3, z2, z3, z4, j4, string3, i, boolValueOf));
                    }
                    cursorB.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorB.close();
                    throw th;
                }
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        return CoroutinesRoom.Companion.a(this.f12274a, false, new String[]{"shopping_list"}, callable);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object h(String str, Continuation continuation) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM shopping_list WHERE id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, str);
        return CoroutinesRoom.Companion.c(this.f12274a, true, new CancellationSignal(), new Callable<ShoppingListWithItemsEntity>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$fetchWithItems$2
            @Override // java.util.concurrent.Callable
            public final ShoppingListWithItemsEntity call() throws Throwable {
                RoomSQLiteQuery roomSQLiteQuery;
                int iB;
                int iB2;
                int iB3;
                int iB4;
                int iB5;
                int iB6;
                int iB7;
                int iB8;
                int iB9;
                int iB10;
                int iB11;
                int i;
                RoomSQLiteQuery roomSQLiteQuery2 = roomSQLiteQueryA;
                ShoppingListDao_Impl shoppingListDao_Impl = this.d;
                RoomDatabase roomDatabase = shoppingListDao_Impl.f12274a;
                roomDatabase.c();
                try {
                    try {
                        Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery2, true);
                        try {
                            iB = CursorUtil.b(cursorB, "id");
                            iB2 = CursorUtil.b(cursorB, "created_at");
                            iB3 = CursorUtil.b(cursorB, "updated_at");
                            iB4 = CursorUtil.b(cursorB, "remote_id");
                            iB5 = CursorUtil.b(cursorB, "remote_timestamp");
                            iB6 = CursorUtil.b(cursorB, "edited");
                            iB7 = CursorUtil.b(cursorB, "deleted");
                            iB8 = CursorUtil.b(cursorB, "remote_edited");
                            iB9 = CursorUtil.b(cursorB, "last_synced_time");
                            iB10 = CursorUtil.b(cursorB, "title");
                            iB11 = CursorUtil.b(cursorB, "color");
                            roomSQLiteQuery = roomSQLiteQuery2;
                        } catch (Throwable th) {
                            th = th;
                            roomSQLiteQuery = roomSQLiteQuery2;
                        }
                        try {
                            int iB12 = CursorUtil.b(cursorB, "watchlisted");
                            try {
                                ArrayMap arrayMap = new ArrayMap(0);
                                ArrayMap arrayMap2 = new ArrayMap(0);
                                while (cursorB.moveToNext()) {
                                    int i2 = iB11;
                                    String string = cursorB.getString(iB);
                                    Intrinsics.g(string, "getString(...)");
                                    if (arrayMap.containsKey(string)) {
                                        i = iB10;
                                    } else {
                                        i = iB10;
                                        arrayMap.put(string, new ArrayList());
                                    }
                                    String string2 = cursorB.getString(iB);
                                    Intrinsics.g(string2, "getString(...)");
                                    if (!arrayMap2.containsKey(string2)) {
                                        arrayMap2.put(string2, new ArrayList());
                                    }
                                    iB11 = i2;
                                    iB10 = i;
                                }
                                int i3 = iB11;
                                int i4 = iB10;
                                cursorB.moveToPosition(-1);
                                shoppingListDao_Impl.o(arrayMap);
                                shoppingListDao_Impl.p(arrayMap2);
                                ShoppingListWithItemsEntity shoppingListWithItemsEntity = null;
                                Boolean boolValueOf = null;
                                if (cursorB.moveToFirst()) {
                                    String string3 = cursorB.getString(iB);
                                    Intrinsics.g(string3, "getString(...)");
                                    long j = cursorB.getLong(iB2);
                                    long j2 = cursorB.getLong(iB3);
                                    String string4 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                                    long j3 = cursorB.getLong(iB5);
                                    boolean z = cursorB.getInt(iB6) != 0;
                                    boolean z2 = cursorB.getInt(iB7) != 0;
                                    boolean z3 = cursorB.getInt(iB8) != 0;
                                    long j4 = cursorB.getLong(iB9);
                                    String string5 = cursorB.getString(i4);
                                    Intrinsics.g(string5, "getString(...)");
                                    int i5 = cursorB.getInt(i3);
                                    Integer numValueOf = cursorB.isNull(iB12) ? null : Integer.valueOf(cursorB.getInt(iB12));
                                    if (numValueOf != null) {
                                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                                    }
                                    ShoppingListEntity shoppingListEntity = new ShoppingListEntity(string3, j, j2, string4, j3, z, z2, z3, j4, string5, i5, boolValueOf);
                                    String string6 = cursorB.getString(iB);
                                    Intrinsics.g(string6, "getString(...)");
                                    Object objE = MapsKt.e(string6, arrayMap);
                                    Intrinsics.g(objE, "getValue(...)");
                                    String string7 = cursorB.getString(iB);
                                    Intrinsics.g(string7, "getString(...)");
                                    Object objE2 = MapsKt.e(string7, arrayMap2);
                                    Intrinsics.g(objE2, "getValue(...)");
                                    shoppingListWithItemsEntity = new ShoppingListWithItemsEntity(shoppingListEntity, (ArrayList) objE, (ArrayList) objE2);
                                }
                                roomDatabase.r();
                                cursorB.close();
                                roomSQLiteQuery.release();
                                roomDatabase.l();
                                return shoppingListWithItemsEntity;
                            } catch (Throwable th2) {
                                th = th2;
                                cursorB.close();
                                roomSQLiteQuery.release();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursorB.close();
                            roomSQLiteQuery.release();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        roomDatabase.l();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    roomDatabase.l();
                    throw th;
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object i(final ArrayList arrayList, Continuation continuation) {
        return CoroutinesRoom.Companion.b(this.f12274a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$deleteByIds$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                StringBuilder sbS = YU.a.s("DELETE FROM shopping_list WHERE id IN (");
                ArrayList arrayList2 = arrayList;
                StringUtil.a(arrayList2.size(), sbS);
                sbS.append(")");
                String string = sbS.toString();
                Intrinsics.g(string, "toString(...)");
                RoomDatabase roomDatabase = this.f12274a;
                SupportSQLiteStatement supportSQLiteStatementD = roomDatabase.d(string);
                Iterator it = arrayList2.iterator();
                int i = 1;
                while (it.hasNext()) {
                    supportSQLiteStatementD.z(i, (String) it.next());
                    i++;
                }
                roomDatabase.c();
                try {
                    int iP = supportSQLiteStatementD.P();
                    roomDatabase.r();
                    return Integer.valueOf(iP);
                } finally {
                    roomDatabase.l();
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Flow j() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM shopping_list WHERE deleted = 0 ORDER BY updated_at DESC");
        Callable<List<? extends ShoppingListWithItemsEntity>> callable = new Callable<List<? extends ShoppingListWithItemsEntity>>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$allListsWithItems$1
            @Override // java.util.concurrent.Callable
            public final List<? extends ShoppingListWithItemsEntity> call() throws Throwable {
                String str;
                int i;
                ShoppingListDao_Impl shoppingListDao_Impl = this.d;
                RoomDatabase roomDatabase = shoppingListDao_Impl.f12274a;
                roomDatabase.c();
                try {
                    try {
                        Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQueryA, true);
                        try {
                            int iB = CursorUtil.b(cursorB, "id");
                            int iB2 = CursorUtil.b(cursorB, "created_at");
                            int iB3 = CursorUtil.b(cursorB, "updated_at");
                            int iB4 = CursorUtil.b(cursorB, "remote_id");
                            int iB5 = CursorUtil.b(cursorB, "remote_timestamp");
                            int iB6 = CursorUtil.b(cursorB, "edited");
                            int iB7 = CursorUtil.b(cursorB, "deleted");
                            int iB8 = CursorUtil.b(cursorB, "remote_edited");
                            int iB9 = CursorUtil.b(cursorB, "last_synced_time");
                            int iB10 = CursorUtil.b(cursorB, "title");
                            int iB11 = CursorUtil.b(cursorB, "color");
                            int iB12 = CursorUtil.b(cursorB, "watchlisted");
                            try {
                                String str2 = "getValue(...)";
                                ArrayMap arrayMap = new ArrayMap(0);
                                int i2 = iB12;
                                ArrayMap arrayMap2 = new ArrayMap(0);
                                while (true) {
                                    str = "getString(...)";
                                    if (!cursorB.moveToNext()) {
                                        break;
                                    }
                                    int i3 = iB11;
                                    String string = cursorB.getString(iB);
                                    Intrinsics.g(string, "getString(...)");
                                    if (arrayMap.containsKey(string)) {
                                        i = iB10;
                                    } else {
                                        i = iB10;
                                        arrayMap.put(string, new ArrayList());
                                    }
                                    String string2 = cursorB.getString(iB);
                                    Intrinsics.g(string2, "getString(...)");
                                    if (!arrayMap2.containsKey(string2)) {
                                        arrayMap2.put(string2, new ArrayList());
                                    }
                                    iB11 = i3;
                                    iB10 = i;
                                }
                                int i4 = iB11;
                                int i5 = iB10;
                                cursorB.moveToPosition(-1);
                                shoppingListDao_Impl.o(arrayMap);
                                shoppingListDao_Impl.p(arrayMap2);
                                ArrayList arrayList = new ArrayList(cursorB.getCount());
                                while (cursorB.moveToNext()) {
                                    String string3 = cursorB.getString(iB);
                                    Intrinsics.g(string3, str);
                                    long j = cursorB.getLong(iB2);
                                    long j2 = cursorB.getLong(iB3);
                                    Boolean boolValueOf = null;
                                    String string4 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                                    long j3 = cursorB.getLong(iB5);
                                    boolean z = cursorB.getInt(iB6) != 0;
                                    boolean z2 = cursorB.getInt(iB7) != 0;
                                    boolean z3 = cursorB.getInt(iB8) != 0;
                                    long j4 = cursorB.getLong(iB9);
                                    int i6 = i5;
                                    String string5 = cursorB.getString(i6);
                                    Intrinsics.g(string5, str);
                                    int i7 = i4;
                                    int i8 = cursorB.getInt(i7);
                                    i4 = i7;
                                    int i9 = i2;
                                    Integer numValueOf = cursorB.isNull(i9) ? null : Integer.valueOf(cursorB.getInt(i9));
                                    if (numValueOf != null) {
                                        boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                                    }
                                    ShoppingListEntity shoppingListEntity = new ShoppingListEntity(string3, j, j2, string4, j3, z, z2, z3, j4, string5, i8, boolValueOf);
                                    i2 = i9;
                                    int i10 = iB2;
                                    String string6 = cursorB.getString(iB);
                                    Intrinsics.g(string6, str);
                                    Object objE = MapsKt.e(string6, arrayMap);
                                    ArrayMap arrayMap3 = arrayMap;
                                    String str3 = str2;
                                    Intrinsics.g(objE, str3);
                                    int i11 = iB3;
                                    String string7 = cursorB.getString(iB);
                                    Intrinsics.g(string7, str);
                                    Object objE2 = MapsKt.e(string7, arrayMap2);
                                    Intrinsics.g(objE2, str3);
                                    arrayList.add(new ShoppingListWithItemsEntity(shoppingListEntity, (ArrayList) objE, (ArrayList) objE2));
                                    iB3 = i11;
                                    iB2 = i10;
                                    str = str;
                                    str2 = str3;
                                    i5 = i6;
                                    arrayMap = arrayMap3;
                                }
                                roomDatabase.r();
                                cursorB.close();
                                roomDatabase.l();
                                return arrayList;
                            } catch (Throwable th) {
                                th = th;
                                cursorB.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        roomDatabase.l();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    roomDatabase.l();
                    throw th;
                }
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        return CoroutinesRoom.Companion.a(this.f12274a, true, new String[]{"product_list_item", "text_list_item", "shopping_list"}, callable);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object k(String str, ContinuationImpl continuationImpl) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM shopping_list WHERE id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, str);
        return CoroutinesRoom.Companion.c(this.f12274a, false, new CancellationSignal(), new Callable<ShoppingListEntity>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$fetch$2
            @Override // java.util.concurrent.Callable
            public final ShoppingListEntity call() {
                RoomDatabase roomDatabase = this.d.f12274a;
                RoomSQLiteQuery roomSQLiteQuery = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery, false);
                try {
                    int iB = CursorUtil.b(cursorB, "id");
                    int iB2 = CursorUtil.b(cursorB, "created_at");
                    int iB3 = CursorUtil.b(cursorB, "updated_at");
                    int iB4 = CursorUtil.b(cursorB, "remote_id");
                    int iB5 = CursorUtil.b(cursorB, "remote_timestamp");
                    int iB6 = CursorUtil.b(cursorB, "edited");
                    int iB7 = CursorUtil.b(cursorB, "deleted");
                    int iB8 = CursorUtil.b(cursorB, "remote_edited");
                    int iB9 = CursorUtil.b(cursorB, "last_synced_time");
                    int iB10 = CursorUtil.b(cursorB, "title");
                    int iB11 = CursorUtil.b(cursorB, "color");
                    int iB12 = CursorUtil.b(cursorB, "watchlisted");
                    ShoppingListEntity shoppingListEntity = null;
                    Boolean boolValueOf = null;
                    if (cursorB.moveToFirst()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        long j = cursorB.getLong(iB2);
                        long j2 = cursorB.getLong(iB3);
                        String string2 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                        long j3 = cursorB.getLong(iB5);
                        boolean z = cursorB.getInt(iB6) != 0;
                        boolean z2 = cursorB.getInt(iB7) != 0;
                        boolean z3 = cursorB.getInt(iB8) != 0;
                        long j4 = cursorB.getLong(iB9);
                        String string3 = cursorB.getString(iB10);
                        Intrinsics.g(string3, "getString(...)");
                        int i = cursorB.getInt(iB11);
                        Integer numValueOf = cursorB.isNull(iB12) ? null : Integer.valueOf(cursorB.getInt(iB12));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        shoppingListEntity = new ShoppingListEntity(string, j, j2, string2, j3, z, z2, z3, j4, string3, i, boolValueOf);
                    }
                    cursorB.close();
                    roomSQLiteQuery.release();
                    return shoppingListEntity;
                } catch (Throwable th) {
                    cursorB.close();
                    roomSQLiteQuery.release();
                    throw th;
                }
            }
        }, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object l(final ShoppingListEntity shoppingListEntity, ContinuationImpl continuationImpl) {
        return CoroutinesRoom.Companion.b(this.f12274a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$update$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                ShoppingListDao_Impl shoppingListDao_Impl = this.d;
                RoomDatabase roomDatabase = shoppingListDao_Impl.f12274a;
                roomDatabase.c();
                try {
                    int iE = shoppingListDao_Impl.d.e(shoppingListEntity);
                    roomDatabase.r();
                    return Integer.valueOf(iE);
                } finally {
                    roomDatabase.l();
                }
            }
        }, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object m(final ShoppingListEntity shoppingListEntity, ContinuationImpl continuationImpl) {
        Object objB = CoroutinesRoom.Companion.b(this.f12274a, new Callable<Unit>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$insert$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                ShoppingListDao_Impl shoppingListDao_Impl = this.d;
                RoomDatabase roomDatabase = shoppingListDao_Impl.f12274a;
                roomDatabase.c();
                try {
                    shoppingListDao_Impl.b.e(shoppingListEntity);
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

    @Override // au.com.woolworths.shop.lists.data.database.ShoppingListDao
    public final Object n(Continuation continuation) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * from shopping_list ORDER BY title ASC");
        return CoroutinesRoom.Companion.c(this.f12274a, false, new CancellationSignal(), new Callable<List<? extends ShoppingListEntity>>() { // from class: au.com.woolworths.shop.lists.data.database.ShoppingListDao_Impl$fetchAllIncludingDeleted$2
            @Override // java.util.concurrent.Callable
            public final List<? extends ShoppingListEntity> call() throws Throwable {
                RoomSQLiteQuery roomSQLiteQuery;
                int iB;
                int iB2;
                int iB3;
                int iB4;
                int iB5;
                int iB6;
                int iB7;
                int iB8;
                int iB9;
                int iB10;
                int iB11;
                int iB12;
                boolean z;
                RoomDatabase roomDatabase = this.d.f12274a;
                RoomSQLiteQuery roomSQLiteQuery2 = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery2, false);
                try {
                    iB = CursorUtil.b(cursorB, "id");
                    iB2 = CursorUtil.b(cursorB, "created_at");
                    iB3 = CursorUtil.b(cursorB, "updated_at");
                    iB4 = CursorUtil.b(cursorB, "remote_id");
                    iB5 = CursorUtil.b(cursorB, "remote_timestamp");
                    iB6 = CursorUtil.b(cursorB, "edited");
                    iB7 = CursorUtil.b(cursorB, "deleted");
                    iB8 = CursorUtil.b(cursorB, "remote_edited");
                    iB9 = CursorUtil.b(cursorB, "last_synced_time");
                    iB10 = CursorUtil.b(cursorB, "title");
                    iB11 = CursorUtil.b(cursorB, "color");
                    iB12 = CursorUtil.b(cursorB, "watchlisted");
                    roomSQLiteQuery = roomSQLiteQuery2;
                } catch (Throwable th) {
                    th = th;
                    roomSQLiteQuery = roomSQLiteQuery2;
                }
                try {
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, "getString(...)");
                        long j = cursorB.getLong(iB2);
                        long j2 = cursorB.getLong(iB3);
                        Boolean boolValueOf = null;
                        String string2 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                        long j3 = cursorB.getLong(iB5);
                        boolean z2 = true;
                        if (cursorB.getInt(iB6) != 0) {
                            z = true;
                        } else {
                            z = true;
                            z2 = false;
                        }
                        boolean z3 = cursorB.getInt(iB7) != 0 ? z : false;
                        boolean z4 = cursorB.getInt(iB8) != 0 ? z : false;
                        long j4 = cursorB.getLong(iB9);
                        String string3 = cursorB.getString(iB10);
                        Intrinsics.g(string3, "getString(...)");
                        int i = cursorB.getInt(iB11);
                        Integer numValueOf = cursorB.isNull(iB12) ? null : Integer.valueOf(cursorB.getInt(iB12));
                        if (numValueOf != null) {
                            if (numValueOf.intValue() == 0) {
                                z = false;
                            }
                            boolValueOf = Boolean.valueOf(z);
                        }
                        arrayList.add(new ShoppingListEntity(string, j, j2, string2, j3, z2, z3, z4, j4, string3, i, boolValueOf));
                    }
                    cursorB.close();
                    roomSQLiteQuery.release();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursorB.close();
                    roomSQLiteQuery.release();
                    throw th;
                }
            }
        }, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(ArrayMap arrayMap) {
        Set setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            RelationUtil.a(arrayMap, new a(this, 0));
            return;
        }
        StringBuilder sbS = YU.a.s("SELECT `id`,`list_id`,`created_at`,`updated_at`,`remote_id`,`remote_timestamp`,`edited`,`deleted`,`checked`,`product_id`,`quantity`,`product_found_in_response` FROM `product_list_item` WHERE `list_id` IN (");
        int size = setKeySet.size();
        StringUtil.a(size, sbS);
        sbS.append(")");
        String string = sbS.toString();
        Intrinsics.g(string, "toString(...)");
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        int i2 = 1;
        while (it.hasNext()) {
            roomSQLiteQueryA.z(i2, (String) it.next());
            i2++;
        }
        Cursor cursorB = DBUtil.b(this.f12274a, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorB, "list_id");
            if (iA == -1) {
                return;
            }
            while (cursorB.moveToNext()) {
                String string2 = cursorB.getString(iA);
                Intrinsics.g(string2, "getString(...)");
                ArrayList arrayList = (ArrayList) arrayMap.get(string2);
                if (arrayList != null) {
                    String string3 = cursorB.getString(0);
                    Intrinsics.g(string3, "getString(...)");
                    String string4 = cursorB.getString(i);
                    Intrinsics.g(string4, "getString(...)");
                    long j = cursorB.getLong(2);
                    long j2 = cursorB.getLong(3);
                    String string5 = cursorB.isNull(4) ? null : cursorB.getString(4);
                    long j3 = cursorB.getLong(5);
                    boolean z = cursorB.getInt(6) != 0 ? i : 0;
                    boolean z2 = cursorB.getInt(7) != 0 ? i : 0;
                    boolean z3 = cursorB.getInt(8) != 0 ? i : 0;
                    String string6 = cursorB.getString(9);
                    Intrinsics.g(string6, "getString(...)");
                    arrayList.add(new ProductListItemEntity(string3, string4, j, j2, string5, j3, z, z2, z3, ProductId.INSTANCE.create(string6), cursorB.getFloat(10), cursorB.getInt(11) != 0));
                    i = 1;
                }
            }
        } finally {
            cursorB.close();
        }
    }

    public final void p(ArrayMap arrayMap) {
        Set setKeySet = arrayMap.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (arrayMap.getSize() > 999) {
            RelationUtil.a(arrayMap, new a(this, 1));
            return;
        }
        StringBuilder sbS = YU.a.s("SELECT `id`,`list_id`,`created_at`,`updated_at`,`remote_id`,`remote_timestamp`,`edited`,`deleted`,`checked`,`text` FROM `text_list_item` WHERE `list_id` IN (");
        int size = setKeySet.size();
        StringUtil.a(size, sbS);
        sbS.append(")");
        String string = sbS.toString();
        Intrinsics.g(string, "toString(...)");
        TreeMap treeMap = RoomSQLiteQuery.l;
        RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            roomSQLiteQueryA.z(i, (String) it.next());
            i++;
        }
        Cursor cursorB = DBUtil.b(this.f12274a, roomSQLiteQueryA, false);
        try {
            int iA = CursorUtil.a(cursorB, "list_id");
            if (iA == -1) {
                return;
            }
            while (cursorB.moveToNext()) {
                String string2 = cursorB.getString(iA);
                Intrinsics.g(string2, "getString(...)");
                ArrayList arrayList = (ArrayList) arrayMap.get(string2);
                if (arrayList != null) {
                    String string3 = cursorB.getString(0);
                    Intrinsics.g(string3, "getString(...)");
                    String string4 = cursorB.getString(1);
                    Intrinsics.g(string4, "getString(...)");
                    long j = cursorB.getLong(2);
                    long j2 = cursorB.getLong(3);
                    String string5 = cursorB.isNull(4) ? null : cursorB.getString(4);
                    long j3 = cursorB.getLong(5);
                    boolean z = cursorB.getInt(6) != 0;
                    boolean z2 = cursorB.getInt(7) != 0;
                    boolean z3 = cursorB.getInt(8) != 0;
                    String string6 = cursorB.getString(9);
                    Intrinsics.g(string6, "getString(...)");
                    arrayList.add(new TextListItemEntity(string3, string4, j, j2, string5, j3, z, z2, z3, string6));
                }
            }
        } finally {
            cursorB.close();
        }
    }
}
