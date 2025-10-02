package au.com.woolworths.feature.shop.storelocator.details.models;

import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpOption;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpType;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"storelocator_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StoreExtKt {
    public static final String a(Store store) {
        Object next;
        Intrinsics.h(store, "<this>");
        Iterator it = store.n.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PickUpType) next).e == PickUpOption.d) {
                break;
            }
        }
        PickUpType pickUpType = (PickUpType) next;
        if (pickUpType != null) {
            return pickUpType.d;
        }
        return null;
    }

    public static final String b(Store store) {
        Object next;
        Intrinsics.h(store, "<this>");
        Iterator it = store.n.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PickUpType) next).e == PickUpOption.f) {
                break;
            }
        }
        PickUpType pickUpType = (PickUpType) next;
        if (pickUpType != null) {
            return pickUpType.d;
        }
        return null;
    }

    public static final String c(Store store) {
        Object next;
        Intrinsics.h(store, "<this>");
        Iterator it = store.n.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            PickUpOption pickUpOption = ((PickUpType) next).e;
            if (pickUpOption == PickUpOption.f || pickUpOption == PickUpOption.d) {
                break;
            }
        }
        PickUpType pickUpType = (PickUpType) next;
        if (pickUpType != null) {
            return pickUpType.h;
        }
        return null;
    }
}
