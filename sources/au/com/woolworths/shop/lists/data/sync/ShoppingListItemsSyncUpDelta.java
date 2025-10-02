package au.com.woolworths.shop.lists.data.sync;

import au.com.woolworths.shop.graphql.type.CreateFreeTextItemInput;
import au.com.woolworths.shop.graphql.type.CreateProductItemInput;
import au.com.woolworths.shop.graphql.type.RemoveListItemInput;
import au.com.woolworths.shop.graphql.type.SyncListItemsInput;
import au.com.woolworths.shop.graphql.type.UpdateFreeTextItemInput;
import au.com.woolworths.shop.graphql.type.UpdateProductItemInput;
import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import au.com.woolworths.shop.lists.data.entity.ShoppingListItemEntity;
import au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import com.apollographql.apollo.api.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/ShoppingListItemsSyncUpDelta;", "Lau/com/woolworths/shop/lists/data/sync/SyncDelta;", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListItemEntity;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ShoppingListItemsSyncUpDelta implements SyncDelta<ShoppingListItemEntity> {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingListWithItemsEntity f12285a;
    public final boolean b;

    public ShoppingListItemsSyncUpDelta(ShoppingListWithItemsEntity shoppingListWithItemsEntity) {
        ShoppingListEntity shoppingList;
        this.f12285a = shoppingListWithItemsEntity;
        boolean z = false;
        if (shoppingListWithItemsEntity != null && (shoppingList = shoppingListWithItemsEntity.getShoppingList()) != null && (shoppingList.isRemoteEdited() || !getF12287a().isEmpty() || !getB().isEmpty() || !e().isEmpty())) {
            z = true;
        }
        this.b = z;
    }

    @Override // au.com.woolworths.shop.lists.data.sync.SyncDelta
    /* renamed from: a */
    public final ArrayList getF12287a() {
        List listD = d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((ShoppingListItemEntity) obj).getRemoteId() == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // au.com.woolworths.shop.lists.data.sync.SyncDelta
    /* renamed from: b */
    public final ArrayList getB() {
        List listD = d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            ShoppingListItemEntity shoppingListItemEntity = (ShoppingListItemEntity) obj;
            if (shoppingListItemEntity.getRemoteId() != null && shoppingListItemEntity.isLocalEdited() && !shoppingListItemEntity.isLocalDeleted()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final SyncListItemsInput c(ShoppingListEntity list) {
        Intrinsics.h(list, "list");
        ArrayList arrayListA = CollectionsKt.A(getF12287a(), ProductListItemEntity.class);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ProductListItemEntity productListItemEntity = (ProductListItemEntity) it.next();
            Intrinsics.h(productListItemEntity, "<this>");
            arrayList.add(new CreateProductItemInput(productListItemEntity.getProductId().getValue(), productListItemEntity.getQuantity(), productListItemEntity.isChecked()));
        }
        Class<TextListItemEntity> cls = TextListItemEntity.class;
        ArrayList arrayListA2 = CollectionsKt.A(getF12287a(), cls);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayListA2, 10));
        Iterator it2 = arrayListA2.iterator();
        while (it2.hasNext()) {
            TextListItemEntity textListItemEntity = (TextListItemEntity) it2.next();
            String referenceId = textListItemEntity.getId();
            Intrinsics.h(referenceId, "referenceId");
            arrayList2.add(new CreateFreeTextItemInput(textListItemEntity.getText(), textListItemEntity.isChecked(), new Optional.Present(referenceId)));
        }
        ArrayList arrayListA3 = CollectionsKt.A(getB(), ProductListItemEntity.class);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayListA3, 10));
        Iterator it3 = arrayListA3.iterator();
        while (it3.hasNext()) {
            ProductListItemEntity productListItemEntity2 = (ProductListItemEntity) it3.next();
            Intrinsics.h(productListItemEntity2, "<this>");
            String remoteId = productListItemEntity2.getRemoteId();
            Intrinsics.e(remoteId);
            arrayList3.add(new UpdateProductItemInput(productListItemEntity2.getQuantity(), remoteId, productListItemEntity2.getProductId().getValue(), productListItemEntity2.getRemoteTimestamp(), productListItemEntity2.isChecked()));
            cls = cls;
        }
        Class<TextListItemEntity> cls2 = cls;
        ArrayList arrayListA4 = CollectionsKt.A(getB(), cls2);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayListA4, 10));
        for (Iterator it4 = arrayListA4.iterator(); it4.hasNext(); it4 = it4) {
            TextListItemEntity textListItemEntity2 = (TextListItemEntity) it4.next();
            Intrinsics.h(textListItemEntity2, "<this>");
            String remoteId2 = textListItemEntity2.getRemoteId();
            Intrinsics.e(remoteId2);
            arrayList4.add(new UpdateFreeTextItemInput(remoteId2, textListItemEntity2.getText(), textListItemEntity2.isChecked(), textListItemEntity2.getRemoteTimestamp()));
        }
        ArrayList arrayListA5 = CollectionsKt.A(e(), ProductListItemEntity.class);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayListA5, 10));
        Iterator it5 = arrayListA5.iterator();
        while (it5.hasNext()) {
            ProductListItemEntity productListItemEntity3 = (ProductListItemEntity) it5.next();
            Intrinsics.h(productListItemEntity3, "<this>");
            String remoteId3 = productListItemEntity3.getRemoteId();
            Intrinsics.e(remoteId3);
            arrayList5.add(new RemoveListItemInput(remoteId3, productListItemEntity3.getRemoteTimestamp()));
        }
        ArrayList arrayListA6 = CollectionsKt.A(e(), cls2);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.s(arrayListA6, 10));
        Iterator it6 = arrayListA6.iterator();
        while (it6.hasNext()) {
            TextListItemEntity textListItemEntity3 = (TextListItemEntity) it6.next();
            Intrinsics.h(textListItemEntity3, "<this>");
            String remoteId4 = textListItemEntity3.getRemoteId();
            Intrinsics.e(remoteId4);
            arrayList6.add(new RemoveListItemInput(remoteId4, textListItemEntity3.getRemoteTimestamp()));
        }
        ArrayList arrayListG = CollectionsKt.G(CollectionsKt.R(arrayList5, arrayList6));
        String remoteId5 = list.getRemoteId();
        if (remoteId5 != null) {
            return new SyncListItemsInput(remoteId5, list.getRemoteTimestamp(), arrayList, arrayList2, arrayList3, arrayList4, arrayListG);
        }
        throw new IllegalArgumentException("remoteId cannot be null!");
    }

    public final List d() {
        ShoppingListWithItemsEntity shoppingListWithItemsEntity = this.f12285a;
        return shoppingListWithItemsEntity != null ? CollectionsKt.G(CollectionsKt.R(shoppingListWithItemsEntity.getAllProductItems(), shoppingListWithItemsEntity.getAllTextItems())) : EmptyList.d;
    }

    public final ArrayList e() {
        List listD = d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            ShoppingListItemEntity shoppingListItemEntity = (ShoppingListItemEntity) obj;
            if (shoppingListItemEntity.getRemoteId() != null && shoppingListItemEntity.isLocalDeleted()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getB() {
        return this.b;
    }
}
