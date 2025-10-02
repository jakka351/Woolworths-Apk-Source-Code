package au.com.woolworths.shop.lists.data.sync;

import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/ShoppingListsSyncUpDelta;", "Lau/com/woolworths/shop/lists/data/sync/SyncDelta;", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsSyncUpDelta implements SyncDelta<ShoppingListEntity> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12288a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;

    public ShoppingListsSyncUpDelta(List localLists) {
        Intrinsics.h(localLists, "localLists");
        List list = localLists;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ShoppingListEntity) obj).getRemoteId() == null) {
                arrayList.add(obj);
            }
        }
        this.f12288a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            ShoppingListEntity shoppingListEntity = (ShoppingListEntity) obj2;
            if (shoppingListEntity.getRemoteId() != null && shoppingListEntity.isLocalEdited()) {
                arrayList2.add(obj2);
            }
        }
        this.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((ShoppingListEntity) obj3).isLocalDeleted()) {
                arrayList3.add(obj3);
            }
        }
        this.c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            ShoppingListEntity shoppingListEntity2 = (ShoppingListEntity) obj4;
            if (shoppingListEntity2.getRemoteId() != null && !shoppingListEntity2.isLocalDeleted()) {
                arrayList4.add(obj4);
            }
        }
        this.d = arrayList4;
    }

    @Override // au.com.woolworths.shop.lists.data.sync.SyncDelta
    /* renamed from: a, reason: from getter */
    public final ArrayList getF12288a() {
        return this.f12288a;
    }

    @Override // au.com.woolworths.shop.lists.data.sync.SyncDelta
    /* renamed from: b, reason: from getter */
    public final ArrayList getB() {
        return this.b;
    }
}
