package au.com.woolworths.feature.shop.storelocator.legacy.pickup.apis;

import au.com.woolworths.android.onesite.modules.storelocator.apis.DivisionApiModel;
import au.com.woolworths.android.onesite.modules.storelocator.apis.PickUpLocationApiModel;
import au.com.woolworths.android.onesite.modules.storelocator.apis.PickUpLocationsResponse;
import au.com.woolworths.android.onesite.modules.storelocator.apis.PickUpOptionApiModel;
import au.com.woolworths.android.onesite.modules.storelocator.apis.PickUpTypeApiModel;
import au.com.woolworths.android.onesite.modules.storelocator.apis.TradingHoursApiModel;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.apis.DivisionApiModelExtKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.apis.PickUpOptionApiModelExtKt;
import au.com.woolworths.foundation.shop.storelocator.models.LocationDivision;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpOption;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpType;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.TradingHours;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"storelocator-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PickUpLocationsResponseExtKt {
    public static final ArrayList a(PickUpLocationsResponse pickUpLocationsResponse) {
        LocationDivision locationDivision;
        PickUpOption pickUpOption;
        String str = "<this>";
        Intrinsics.h(pickUpLocationsResponse, "<this>");
        List locations = pickUpLocationsResponse.getLocations();
        int i = 10;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(locations, 10));
        Iterator it = locations.iterator();
        while (it.hasNext()) {
            PickUpLocationApiModel pickUpLocationApiModel = (PickUpLocationApiModel) it.next();
            Intrinsics.h(pickUpLocationApiModel, str);
            String storeNumber = pickUpLocationApiModel.getStoreNumber();
            DivisionApiModel division = pickUpLocationApiModel.getDivision();
            Intrinsics.h(division, str);
            int i2 = DivisionApiModelExtKt.WhenMappings.f8189a[division.ordinal()];
            if (i2 == 1) {
                locationDivision = LocationDivision.d;
            } else if (i2 == 2) {
                locationDivision = LocationDivision.f;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                locationDivision = LocationDivision.e;
            }
            String displayableName = pickUpLocationApiModel.getDisplayableName();
            String displayableAddress = pickUpLocationApiModel.getDisplayableAddress();
            double latitude = pickUpLocationApiModel.getLatitude();
            double longitude = pickUpLocationApiModel.getLongitude();
            String distance = pickUpLocationApiModel.getDistance();
            if (distance == null) {
                distance = "";
            }
            String phone = pickUpLocationApiModel.getPhone();
            String str2 = phone != null ? phone : "";
            List facilities = pickUpLocationApiModel.getFacilities();
            List tradingHours = pickUpLocationApiModel.getTradingHours();
            Iterator it2 = it;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(tradingHours, i));
            for (Iterator it3 = tradingHours.iterator(); it3.hasNext(); it3 = it3) {
                TradingHoursApiModel tradingHoursApiModel = (TradingHoursApiModel) it3.next();
                Intrinsics.h(tradingHoursApiModel, str);
                arrayList2.add(new TradingHours(tradingHoursApiModel.getDay(), tradingHoursApiModel.getOpenHour()));
            }
            List<PickUpTypeApiModel> pickUpTypes = pickUpLocationApiModel.getPickUpTypes();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(pickUpTypes, 10));
            for (PickUpTypeApiModel pickUpTypeApiModel : pickUpTypes) {
                Intrinsics.h(pickUpTypeApiModel, str);
                String addressId = pickUpTypeApiModel.getAddressId();
                PickUpOptionApiModel type = pickUpTypeApiModel.getType();
                Intrinsics.h(type, str);
                int i3 = PickUpOptionApiModelExtKt.WhenMappings.f8190a[type.ordinal()];
                String str3 = str;
                if (i3 == 1) {
                    pickUpOption = PickUpOption.d;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pickUpOption = PickUpOption.f;
                }
                arrayList3.add(new PickUpType(addressId, pickUpOption, pickUpTypeApiModel.getLabel(), pickUpTypeApiModel.getText(), pickUpTypeApiModel.getShoppingModeId()));
                str = str3;
            }
            arrayList.add(new Store(storeNumber, locationDivision, displayableName, displayableAddress, latitude, longitude, distance, str2, facilities, arrayList2, arrayList3, null, null, pickUpLocationApiModel.getSupportedCollectionTypes(), 6144));
            it = it2;
            i = 10;
        }
        return arrayList;
    }
}
