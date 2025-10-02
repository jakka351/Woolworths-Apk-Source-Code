package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.shop.addtolist.ItemAddToListBindingModel_;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import com.airbnb.epoxy.Typed2EpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetEpoxyController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "Lau/com/woolworths/shop/lists/data/model/ShoppingList;", "", "itemClickListener", "Lau/com/woolworths/shop/addtolist/add/ListItemClickListener;", "<init>", "(Lau/com/woolworths/shop/addtolist/add/ListItemClickListener;)V", "buildModels", "", "list", "shoppingListIdBeingSaved", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AddToListBottomSheetEpoxyController extends Typed2EpoxyController<List<? extends ShoppingList>, String> {

    @NotNull
    private final ListItemClickListener itemClickListener;

    public AddToListBottomSheetEpoxyController(@NotNull ListItemClickListener itemClickListener) {
        Intrinsics.h(itemClickListener, "itemClickListener");
        this.itemClickListener = itemClickListener;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public /* bridge */ /* synthetic */ void buildModels(List<? extends ShoppingList> list, String str) {
        buildModels2((List<ShoppingList>) list, str);
    }

    /* renamed from: buildModels, reason: avoid collision after fix types in other method */
    public void buildModels2(@NotNull List<ShoppingList> list, @Nullable String shoppingListIdBeingSaved) {
        Intrinsics.h(list, "list");
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            ShoppingList shoppingList = (ShoppingList) obj;
            ItemAddToListBindingModel_ itemAddToListBindingModel_ = new ItemAddToListBindingModel_();
            itemAddToListBindingModel_.M(shoppingList.getId());
            itemAddToListBindingModel_.t();
            itemAddToListBindingModel_.o = shoppingList;
            itemAddToListBindingModel_.t();
            itemAddToListBindingModel_.n = i2;
            ListItemClickListener listItemClickListener = this.itemClickListener;
            itemAddToListBindingModel_.t();
            itemAddToListBindingModel_.p = listItemClickListener;
            Boolean boolValueOf = Boolean.valueOf(Intrinsics.c(shoppingListIdBeingSaved, shoppingList.getId()));
            itemAddToListBindingModel_.t();
            itemAddToListBindingModel_.q = boolValueOf;
            add(itemAddToListBindingModel_);
            i = i2;
        }
    }
}
