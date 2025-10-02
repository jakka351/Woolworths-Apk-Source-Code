package au.com.woolworths.foundation.rewards.cart.update.data.model;

import au.com.woolworths.foundation.rewards.cart.update.data.UpdateCartQuantitiesMutation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cart-update-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class UpdateCartQuantitiesMutationUpdateCartQuantitiesPage1ExtKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static final UpdatedCartQuantities a(UpdateCartQuantitiesMutation.UpdateCartQuantitiesPage1 updateCartQuantitiesPage1) {
        ?? arrayList;
        Intrinsics.h(updateCartQuantitiesPage1, "<this>");
        int i = updateCartQuantitiesPage1.f8560a;
        List list = updateCartQuantitiesPage1.b;
        if (list != null) {
            List<UpdateCartQuantitiesMutation.UpdatedCartQuantity> list2 = list;
            arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            for (UpdateCartQuantitiesMutation.UpdatedCartQuantity updatedCartQuantity : list2) {
                Intrinsics.h(updatedCartQuantity, "<this>");
                arrayList.add(new UpdatedCartQuantity(updatedCartQuantity.f8561a, updatedCartQuantity.b, updatedCartQuantity.c));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.d;
        }
        return new UpdatedCartQuantities(i, arrayList, updateCartQuantitiesPage1.c, updateCartQuantitiesPage1.d, updateCartQuantitiesPage1.e);
    }
}
