package au.com.woolworths.feature.shop.storelocator.legacy.pickup.apis;

import au.com.woolworths.foundation.shop.storelocator.models.PickUpSuburbApiModel;
import au.com.woolworths.foundation.shop.storelocator.models.PickUpSuburbResponse;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"storelocator-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PickUpSuburbResponseExtKt {
    public static final ArrayList a(PickUpSuburbResponse pickUpSuburbResponse) {
        Intrinsics.h(pickUpSuburbResponse, "<this>");
        List<PickUpSuburbApiModel> suburbs = pickUpSuburbResponse.getSuburbs();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(suburbs, 10));
        for (PickUpSuburbApiModel pickUpSuburbApiModel : suburbs) {
            Intrinsics.h(pickUpSuburbApiModel, "<this>");
            arrayList.add(new PickUpSuburb(pickUpSuburbApiModel.getName(), pickUpSuburbApiModel.getState(), pickUpSuburbApiModel.getPostcode()));
        }
        return arrayList;
    }
}
