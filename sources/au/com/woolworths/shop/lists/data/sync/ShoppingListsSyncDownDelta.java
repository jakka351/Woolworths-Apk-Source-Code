package au.com.woolworths.shop.lists.data.sync;

import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/ShoppingListsSyncDownDelta;", "Lau/com/woolworths/shop/lists/data/sync/SyncDelta;", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListsSyncDownDelta implements SyncDelta<ShoppingListEntity> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12287a;
    public final ArrayList b;
    public final ArrayList c;

    public ShoppingListsSyncDownDelta(List localLists, ArrayList arrayList, ArrayList arrayList2) {
        Object next;
        Object next2;
        Intrinsics.h(localLists, "localLists");
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next3 = it.next();
            ShoppingListEntity shoppingListEntity = (ShoppingListEntity) next3;
            List list = localLists;
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (Intrinsics.c(((ShoppingListEntity) next2).getId(), shoppingListEntity.getId())) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            if (next2 == null && shoppingListEntity.getRemoteId() != null) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next4 = it3.next();
                    if (Intrinsics.c(((ShoppingListEntity) next4).getRemoteId(), shoppingListEntity.getRemoteId())) {
                        obj = next4;
                        break;
                    }
                }
                if (obj == null) {
                    arrayList3.add(next3);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ShoppingListEntity shoppingListEntity2 = (ShoppingListEntity) it4.next();
            arrayList4.add(shoppingListEntity2.copy((4094 & 1) != 0 ? shoppingListEntity2.id : null, (4094 & 2) != 0 ? shoppingListEntity2.localCreatedAt : 0L, (4094 & 4) != 0 ? shoppingListEntity2.localUpdatedAt : 0L, (4094 & 8) != 0 ? shoppingListEntity2.remoteId : null, (4094 & 16) != 0 ? shoppingListEntity2.remoteTimestamp : 0L, (4094 & 32) != 0 ? shoppingListEntity2.isLocalEdited : false, (4094 & 64) != 0 ? shoppingListEntity2.isLocalDeleted : false, (4094 & 128) != 0 ? shoppingListEntity2.isRemoteEdited : true, (4094 & 256) != 0 ? shoppingListEntity2.lastSyncedTime : 0L, (4094 & 512) != 0 ? shoppingListEntity2.title : null, (4094 & 1024) != 0 ? shoppingListEntity2.color : 0, (4094 & 2048) != 0 ? shoppingListEntity2.isWatchlist : null));
        }
        this.f12287a = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            ShoppingListEntity shoppingListEntity3 = (ShoppingListEntity) it5.next();
            Iterator it6 = localLists.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                }
                next = it6.next();
                ShoppingListEntity shoppingListEntity4 = (ShoppingListEntity) next;
                if ((Intrinsics.c(shoppingListEntity4.getRemoteId(), shoppingListEntity3.getRemoteId()) && (shoppingListEntity4.getRemoteTimestamp() != shoppingListEntity3.getRemoteTimestamp() || !Intrinsics.c(shoppingListEntity4.getTitle(), shoppingListEntity3.getTitle()) || shoppingListEntity4.getColor() != shoppingListEntity3.getColor())) || Intrinsics.c(shoppingListEntity4.getId(), shoppingListEntity3.getId())) {
                    break;
                }
            }
            ShoppingListEntity shoppingListEntity5 = (ShoppingListEntity) next;
            ShoppingListEntity shoppingListEntityCopy = shoppingListEntity5 != null ? shoppingListEntity3.copy((4094 & 1) != 0 ? shoppingListEntity3.id : shoppingListEntity5.getId(), (4094 & 2) != 0 ? shoppingListEntity3.localCreatedAt : 0L, (4094 & 4) != 0 ? shoppingListEntity3.localUpdatedAt : shoppingListEntity3.getRemoteTimestamp(), (4094 & 8) != 0 ? shoppingListEntity3.remoteId : null, (4094 & 16) != 0 ? shoppingListEntity3.remoteTimestamp : shoppingListEntity5.getRemoteTimestamp(), (4094 & 32) != 0 ? shoppingListEntity3.isLocalEdited : false, (4094 & 64) != 0 ? shoppingListEntity3.isLocalDeleted : false, (4094 & 128) != 0 ? shoppingListEntity3.isRemoteEdited : shoppingListEntity3.getRemoteTimestamp() != shoppingListEntity5.getRemoteTimestamp(), (4094 & 256) != 0 ? shoppingListEntity3.lastSyncedTime : 0L, (4094 & 512) != 0 ? shoppingListEntity3.title : null, (4094 & 1024) != 0 ? shoppingListEntity3.color : 0, (4094 & 2048) != 0 ? shoppingListEntity3.isWatchlist : null) : null;
            if (shoppingListEntityCopy != null) {
                arrayList5.add(shoppingListEntityCopy);
            }
        }
        this.b = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : localLists) {
            ShoppingListEntity shoppingListEntity6 = (ShoppingListEntity) obj2;
            if (shoppingListEntity6.getRemoteId() != null && arrayList2.contains(shoppingListEntity6.getRemoteId())) {
                arrayList6.add(obj2);
            }
        }
        this.c = arrayList6;
    }

    @Override // au.com.woolworths.shop.lists.data.sync.SyncDelta
    /* renamed from: a, reason: from getter */
    public final ArrayList getF12287a() {
        return this.f12287a;
    }

    @Override // au.com.woolworths.shop.lists.data.sync.SyncDelta
    /* renamed from: b, reason: from getter */
    public final ArrayList getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final ArrayList getC() {
        return this.c;
    }
}
