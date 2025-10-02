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
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.converters.ProductIdTypeConverter;
import au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl;
import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ProductListItemDao_Impl;", "Lau/com/woolworths/shop/lists/data/database/ProductListItemDao;", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProductListItemDao_Impl implements ProductListItemDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12273a;
    public final AnonymousClass1 b;
    public final AnonymousClass2 c;
    public final AnonymousClass3 d;
    public final AnonymousClass6 e;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/ProductListItemDao_Impl$1", "Landroidx/room/EntityInsertionAdapter;", "Lau/com/woolworths/shop/lists/data/entity/ProductListItemEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertionAdapter<ProductListItemEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR ABORT INTO `product_list_item` (`id`,`list_id`,`created_at`,`updated_at`,`remote_id`,`remote_timestamp`,`edited`,`deleted`,`checked`,`product_id`,`quantity`,`product_found_in_response`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            ProductListItemEntity entity = (ProductListItemEntity) obj;
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
            statement.z(10, ProductIdTypeConverter.a(entity.getProductId()));
            statement.j2(entity.getQuantity(), 11);
            statement.C0(12, entity.getProductFoundInResponse() ? 1L : 0L);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/ProductListItemDao_Impl$2", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/shop/lists/data/entity/ProductListItemEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityDeletionOrUpdateAdapter<ProductListItemEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM `product_list_item` WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            ProductListItemEntity entity = (ProductListItemEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.z(1, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/ProductListItemDao_Impl$3", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "Lau/com/woolworths/shop/lists/data/entity/ProductListItemEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$3, reason: invalid class name */
    public final class AnonymousClass3 extends EntityDeletionOrUpdateAdapter<ProductListItemEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "UPDATE OR ABORT `product_list_item` SET `id` = ?,`list_id` = ?,`created_at` = ?,`updated_at` = ?,`remote_id` = ?,`remote_timestamp` = ?,`edited` = ?,`deleted` = ?,`checked` = ?,`product_id` = ?,`quantity` = ?,`product_found_in_response` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            ProductListItemEntity entity = (ProductListItemEntity) obj;
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
            statement.z(10, ProductIdTypeConverter.a(entity.getProductId()));
            statement.j2(entity.getQuantity(), 11);
            statement.C0(12, entity.getProductFoundInResponse() ? 1L : 0L);
            statement.z(13, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/ProductListItemDao_Impl$4", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$4, reason: invalid class name */
    public final class AnonymousClass4 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM product_list_item WHERE id = ?";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/ProductListItemDao_Impl$5", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$5, reason: invalid class name */
    public final class AnonymousClass5 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM product_list_item WHERE list_id = ?";
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/ProductListItemDao_Impl$6", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$6, reason: invalid class name */
    public final class AnonymousClass6 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM product_list_item";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/ProductListItemDao_Impl$Companion;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductListItemDao_Impl(RoomDatabase roomDatabase) {
        this.f12273a = roomDatabase;
        this.b = new AnonymousClass1(roomDatabase);
        this.c = new AnonymousClass2(roomDatabase);
        this.d = new AnonymousClass3(roomDatabase);
        new AnonymousClass4(roomDatabase);
        new AnonymousClass5(roomDatabase);
        this.e = new AnonymousClass6(roomDatabase);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object a(Continuation continuation) {
        return CoroutinesRoom.Companion.b(this.f12273a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$deleteAllItems$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                ProductListItemDao_Impl productListItemDao_Impl = this.d;
                ProductListItemDao_Impl.AnonymousClass6 anonymousClass6 = productListItemDao_Impl.e;
                RoomDatabase roomDatabase = productListItemDao_Impl.f12273a;
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

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object b(String str, ContinuationImpl continuationImpl) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM product_list_item WHERE list_id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, str);
        return CoroutinesRoom.Companion.c(this.f12273a, false, new CancellationSignal(), new Callable<List<? extends ProductListItemEntity>>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$fetchItemsByListId$2
            @Override // java.util.concurrent.Callable
            public final List<? extends ProductListItemEntity> call() throws Throwable {
                RoomSQLiteQuery roomSQLiteQuery;
                String str2 = "getString(...)";
                RoomDatabase roomDatabase = this.d.f12273a;
                RoomSQLiteQuery roomSQLiteQuery2 = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery2, false);
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
                    int iB10 = CursorUtil.b(cursorB, "product_id");
                    int iB11 = CursorUtil.b(cursorB, "quantity");
                    int iB12 = CursorUtil.b(cursorB, "product_found_in_response");
                    roomSQLiteQuery = roomSQLiteQuery2;
                    try {
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string = cursorB.getString(iB);
                            Intrinsics.g(string, str2);
                            String string2 = cursorB.getString(iB2);
                            Intrinsics.g(string2, str2);
                            long j = cursorB.getLong(iB3);
                            long j2 = cursorB.getLong(iB4);
                            String string3 = cursorB.isNull(iB5) ? null : cursorB.getString(iB5);
                            long j3 = cursorB.getLong(iB6);
                            boolean z = cursorB.getInt(iB7) != 0;
                            boolean z2 = cursorB.getInt(iB8) != 0;
                            boolean z3 = cursorB.getInt(iB9) != 0;
                            String string4 = cursorB.getString(iB10);
                            Intrinsics.g(string4, str2);
                            String str3 = str2;
                            arrayList.add(new ProductListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, ProductId.INSTANCE.create(string4), cursorB.getFloat(iB11), cursorB.getInt(iB12) != 0));
                            str2 = str3;
                        }
                        cursorB.close();
                        roomSQLiteQuery.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        cursorB.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    roomSQLiteQuery = roomSQLiteQuery2;
                }
            }
        }, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object c(Continuation continuation) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM product_list_item");
        return CoroutinesRoom.Companion.c(this.f12273a, false, new CancellationSignal(), new Callable<List<? extends ProductListItemEntity>>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$fetchAll$2
            @Override // java.util.concurrent.Callable
            public final List<? extends ProductListItemEntity> call() throws Throwable {
                RoomSQLiteQuery roomSQLiteQuery;
                String str = "getString(...)";
                RoomDatabase roomDatabase = this.d.f12273a;
                RoomSQLiteQuery roomSQLiteQuery2 = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery2, false);
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
                    int iB10 = CursorUtil.b(cursorB, "product_id");
                    int iB11 = CursorUtil.b(cursorB, "quantity");
                    int iB12 = CursorUtil.b(cursorB, "product_found_in_response");
                    roomSQLiteQuery = roomSQLiteQuery2;
                    try {
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string = cursorB.getString(iB);
                            Intrinsics.g(string, str);
                            String string2 = cursorB.getString(iB2);
                            Intrinsics.g(string2, str);
                            long j = cursorB.getLong(iB3);
                            long j2 = cursorB.getLong(iB4);
                            String string3 = cursorB.isNull(iB5) ? null : cursorB.getString(iB5);
                            long j3 = cursorB.getLong(iB6);
                            boolean z = cursorB.getInt(iB7) != 0;
                            boolean z2 = cursorB.getInt(iB8) != 0;
                            boolean z3 = cursorB.getInt(iB9) != 0;
                            String string4 = cursorB.getString(iB10);
                            Intrinsics.g(string4, str);
                            String str2 = str;
                            arrayList.add(new ProductListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, ProductId.INSTANCE.create(string4), cursorB.getFloat(iB11), cursorB.getInt(iB12) != 0));
                            str = str2;
                        }
                        cursorB.close();
                        roomSQLiteQuery.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        cursorB.close();
                        roomSQLiteQuery.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    roomSQLiteQuery = roomSQLiteQuery2;
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Flow d(String listId) {
        Intrinsics.h(listId, "listId");
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM product_list_item WHERE list_id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, listId);
        Callable<List<? extends ProductListItemEntity>> callable = new Callable<List<? extends ProductListItemEntity>>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$itemsInList$1
            @Override // java.util.concurrent.Callable
            public final List<? extends ProductListItemEntity> call() {
                String str = "getString(...)";
                Cursor cursorB = DBUtil.b(this.d.f12273a, roomSQLiteQueryA, false);
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
                    int iB10 = CursorUtil.b(cursorB, "product_id");
                    int iB11 = CursorUtil.b(cursorB, "quantity");
                    int iB12 = CursorUtil.b(cursorB, "product_found_in_response");
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string = cursorB.getString(iB);
                        Intrinsics.g(string, str);
                        String string2 = cursorB.getString(iB2);
                        Intrinsics.g(string2, str);
                        long j = cursorB.getLong(iB3);
                        long j2 = cursorB.getLong(iB4);
                        String string3 = cursorB.isNull(iB5) ? null : cursorB.getString(iB5);
                        long j3 = cursorB.getLong(iB6);
                        boolean z = cursorB.getInt(iB7) != 0;
                        boolean z2 = cursorB.getInt(iB8) != 0;
                        boolean z3 = cursorB.getInt(iB9) != 0;
                        String string4 = cursorB.getString(iB10);
                        Intrinsics.g(string4, str);
                        String str2 = str;
                        arrayList.add(new ProductListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, ProductId.INSTANCE.create(string4), cursorB.getFloat(iB11), cursorB.getInt(iB12) != 0));
                        str = str2;
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
        return CoroutinesRoom.Companion.a(this.f12273a, false, new String[]{"product_list_item"}, callable);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object e(String str, SuspendLambda suspendLambda) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM product_list_item WHERE id = ? AND deleted = 0");
        roomSQLiteQueryA.z(1, str);
        return CoroutinesRoom.Companion.c(this.f12273a, false, new CancellationSignal(), new Callable<ProductListItemEntity>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$fetchItemById$2
            @Override // java.util.concurrent.Callable
            public final ProductListItemEntity call() {
                RoomDatabase roomDatabase = this.d.f12273a;
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
                    int iB10 = CursorUtil.b(cursorB, "product_id");
                    int iB11 = CursorUtil.b(cursorB, "quantity");
                    int iB12 = CursorUtil.b(cursorB, "product_found_in_response");
                    ProductListItemEntity productListItemEntity = null;
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
                        productListItemEntity = new ProductListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, ProductId.INSTANCE.create(string4), cursorB.getFloat(iB11), cursorB.getInt(iB12) != 0);
                    }
                    return productListItemEntity;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, suspendLambda);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object f(ContinuationImpl continuationImpl) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT DISTINCT product_id FROM product_list_item");
        return CoroutinesRoom.Companion.c(this.f12273a, false, new CancellationSignal(), new Callable<List<? extends ProductId>>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$fetchAllProductIds$2
            @Override // java.util.concurrent.Callable
            public final List<? extends ProductId> call() {
                RoomDatabase roomDatabase = this.d.f12273a;
                RoomSQLiteQuery roomSQLiteQuery = roomSQLiteQueryA;
                Cursor cursorB = DBUtil.b(roomDatabase, roomSQLiteQuery, false);
                try {
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string = cursorB.getString(0);
                        Intrinsics.g(string, "getString(...)");
                        arrayList.add(ProductId.INSTANCE.create(string));
                    }
                    return arrayList;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, continuationImpl);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object g(final ProductListItemEntity productListItemEntity, ContinuationImpl continuationImpl) {
        Object objB = CoroutinesRoom.Companion.b(this.f12273a, new Callable<Unit>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$insert$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                ProductListItemDao_Impl productListItemDao_Impl = this.d;
                RoomDatabase roomDatabase = productListItemDao_Impl.f12273a;
                roomDatabase.c();
                try {
                    productListItemDao_Impl.b.e(productListItemEntity);
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

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object h(String str, Continuation continuation) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(1, "SELECT * FROM product_list_item WHERE remote_id = ?");
        roomSQLiteQueryA.z(1, str);
        return CoroutinesRoom.Companion.c(this.f12273a, false, new CancellationSignal(), new Callable<ProductListItemEntity>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$fetchItemByRemoteId$2
            @Override // java.util.concurrent.Callable
            public final ProductListItemEntity call() {
                RoomDatabase roomDatabase = this.d.f12273a;
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
                    int iB10 = CursorUtil.b(cursorB, "product_id");
                    int iB11 = CursorUtil.b(cursorB, "quantity");
                    int iB12 = CursorUtil.b(cursorB, "product_found_in_response");
                    ProductListItemEntity productListItemEntity = null;
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
                        productListItemEntity = new ProductListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, ProductId.INSTANCE.create(string4), cursorB.getFloat(iB11), cursorB.getInt(iB12) != 0);
                    }
                    return productListItemEntity;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object i(String str, ProductId productId, SuspendLambda suspendLambda) {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(2, "SELECT * FROM product_list_item WHERE list_id = ? AND product_id = ?");
        roomSQLiteQueryA.z(1, str);
        roomSQLiteQueryA.z(2, ProductIdTypeConverter.a(productId));
        return CoroutinesRoom.Companion.c(this.f12273a, false, new CancellationSignal(), new Callable<ProductListItemEntity>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$fetchItemByProductIdIncludingDeleted$2
            @Override // java.util.concurrent.Callable
            public final ProductListItemEntity call() {
                RoomDatabase roomDatabase = this.d.f12273a;
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
                    int iB10 = CursorUtil.b(cursorB, "product_id");
                    int iB11 = CursorUtil.b(cursorB, "quantity");
                    int iB12 = CursorUtil.b(cursorB, "product_found_in_response");
                    ProductListItemEntity productListItemEntity = null;
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
                        productListItemEntity = new ProductListItemEntity(string, string2, j, j2, string3, j3, z, z2, z3, ProductId.INSTANCE.create(string4), cursorB.getFloat(iB11), cursorB.getInt(iB12) != 0);
                    }
                    return productListItemEntity;
                } finally {
                    cursorB.close();
                    roomSQLiteQuery.release();
                }
            }
        }, suspendLambda);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object j(final ProductListItemEntity productListItemEntity, SuspendLambda suspendLambda) {
        return CoroutinesRoom.Companion.b(this.f12273a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$delete$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                ProductListItemDao_Impl productListItemDao_Impl = this.d;
                RoomDatabase roomDatabase = productListItemDao_Impl.f12273a;
                roomDatabase.c();
                try {
                    int iE = productListItemDao_Impl.c.e(productListItemEntity);
                    roomDatabase.r();
                    return Integer.valueOf(iE);
                } finally {
                    roomDatabase.l();
                }
            }
        }, suspendLambda);
    }

    @Override // au.com.woolworths.shop.lists.data.database.ProductListItemDao
    public final Object k(final ProductListItemEntity productListItemEntity, ContinuationImpl continuationImpl) {
        Object objB = CoroutinesRoom.Companion.b(this.f12273a, new Callable<Unit>() { // from class: au.com.woolworths.shop.lists.data.database.ProductListItemDao_Impl$update$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                ProductListItemDao_Impl productListItemDao_Impl = this.d;
                RoomDatabase roomDatabase = productListItemDao_Impl.f12273a;
                roomDatabase.c();
                try {
                    productListItemDao_Impl.d.e(productListItemEntity);
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
