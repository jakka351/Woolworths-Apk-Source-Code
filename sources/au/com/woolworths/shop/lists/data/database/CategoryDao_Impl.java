package au.com.woolworths.shop.lists.data.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.converters.ProductIdTypeConverter;
import au.com.woolworths.shop.lists.data.database.CategoryDao_Impl;
import au.com.woolworths.shop.lists.data.entity.CategoryByProductEntity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/CategoryDao_Impl;", "Lau/com/woolworths/shop/lists/data/database/CategoryDao;", "Companion", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CategoryDao_Impl implements CategoryDao {

    /* renamed from: a, reason: collision with root package name */
    public final RoomDatabase f12270a;
    public final AnonymousClass1 b;
    public final AnonymousClass2 c;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"au/com/woolworths/shop/lists/data/database/CategoryDao_Impl$1", "Landroidx/room/EntityInsertionAdapter;", "Lau/com/woolworths/shop/lists/data/entity/CategoryByProductEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.CategoryDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertionAdapter<CategoryByProductEntity> {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "INSERT OR REPLACE INTO `category` (`id`,`product_id`,`name`,`category_level`) VALUES (nullif(?, 0),?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        public final void d(SupportSQLiteStatement statement, Object obj) {
            CategoryByProductEntity entity = (CategoryByProductEntity) obj;
            Intrinsics.h(statement, "statement");
            Intrinsics.h(entity, "entity");
            statement.C0(1, entity.getId());
            statement.z(2, ProductIdTypeConverter.a(entity.getProductId()));
            statement.z(3, entity.getName());
            statement.C0(4, entity.getCategoryLevel());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/lists/data/database/CategoryDao_Impl$2", "Landroidx/room/SharedSQLiteStatement;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.lists.data.database.CategoryDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends SharedSQLiteStatement {
        @Override // androidx.room.SharedSQLiteStatement
        public final String b() {
            return "DELETE FROM category";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/database/CategoryDao_Impl$Companion;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public CategoryDao_Impl(RoomDatabase roomDatabase) {
        this.f12270a = roomDatabase;
        this.b = new AnonymousClass1(roomDatabase);
        this.c = new AnonymousClass2(roomDatabase);
    }

    @Override // au.com.woolworths.shop.lists.data.database.CategoryDao
    public final Object a(Continuation continuation) {
        return CoroutinesRoom.Companion.b(this.f12270a, new Callable<Integer>() { // from class: au.com.woolworths.shop.lists.data.database.CategoryDao_Impl$deleteAllItems$2
            @Override // java.util.concurrent.Callable
            public final Integer call() {
                CategoryDao_Impl categoryDao_Impl = this.d;
                CategoryDao_Impl.AnonymousClass2 anonymousClass2 = categoryDao_Impl.c;
                RoomDatabase roomDatabase = categoryDao_Impl.f12270a;
                SupportSQLiteStatement supportSQLiteStatementA = anonymousClass2.a();
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
                    anonymousClass2.c(supportSQLiteStatementA);
                }
            }
        }, continuation);
    }

    @Override // au.com.woolworths.shop.lists.data.database.CategoryDao
    public final Object b(final ArrayList arrayList, SuspendLambda suspendLambda) {
        Object objB = CoroutinesRoom.Companion.b(this.f12270a, new Callable<Unit>() { // from class: au.com.woolworths.shop.lists.data.database.CategoryDao_Impl$insertAll$2
            @Override // java.util.concurrent.Callable
            public final Unit call() {
                CategoryDao_Impl categoryDao_Impl = this.d;
                RoomDatabase roomDatabase = categoryDao_Impl.f12270a;
                roomDatabase.c();
                try {
                    categoryDao_Impl.b.f(arrayList);
                    roomDatabase.r();
                    roomDatabase.l();
                    return Unit.f24250a;
                } catch (Throwable th) {
                    roomDatabase.l();
                    throw th;
                }
            }
        }, suspendLambda);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    @Override // au.com.woolworths.shop.lists.data.database.CategoryDao
    public final Flow c() {
        TreeMap treeMap = RoomSQLiteQuery.l;
        final RoomSQLiteQuery roomSQLiteQueryA = RoomSQLiteQuery.Companion.a(0, "SELECT * FROM category");
        Callable<CategoryByProductEntity> callable = new Callable<CategoryByProductEntity>() { // from class: au.com.woolworths.shop.lists.data.database.CategoryDao_Impl$categories$1
            @Override // java.util.concurrent.Callable
            public final CategoryByProductEntity call() {
                CategoryByProductEntity categoryByProductEntity;
                Cursor cursorB = DBUtil.b(this.d.f12270a, roomSQLiteQueryA, false);
                try {
                    int iB = CursorUtil.b(cursorB, "id");
                    int iB2 = CursorUtil.b(cursorB, "product_id");
                    int iB3 = CursorUtil.b(cursorB, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int iB4 = CursorUtil.b(cursorB, "category_level");
                    if (cursorB.moveToFirst()) {
                        long j = cursorB.getLong(iB);
                        String string = cursorB.getString(iB2);
                        Intrinsics.g(string, "getString(...)");
                        ProductId productIdCreate = ProductId.INSTANCE.create(string);
                        String string2 = cursorB.getString(iB3);
                        Intrinsics.g(string2, "getString(...)");
                        categoryByProductEntity = new CategoryByProductEntity(j, productIdCreate, string2, cursorB.getInt(iB4));
                    } else {
                        categoryByProductEntity = null;
                    }
                    return categoryByProductEntity;
                } finally {
                    cursorB.close();
                }
            }

            public final void finalize() {
                roomSQLiteQueryA.release();
            }
        };
        return CoroutinesRoom.Companion.a(this.f12270a, false, new String[]{"category"}, callable);
    }
}
