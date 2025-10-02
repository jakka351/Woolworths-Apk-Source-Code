package au.com.woolworths.feature.shop.storelocator;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.shop.storelocator.StoreLocatorRepository;
import au.com.woolworths.foundation.shop.storelocator.models.LocationDivision;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpOption;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpType;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.TradingHours;
import au.com.woolworths.shop.graphql.type.PickupOption;
import com.apollographql.apollo.ApolloClient;
import com.woolworths.feature.shop.storelocator.fragment.Store;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorRepositoryImpl;", "Lau/com/woolworths/foundation/shop/storelocator/StoreLocatorRepository;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StoreLocatorRepositoryImpl implements StoreLocatorRepository {

    /* renamed from: a, reason: collision with root package name */
    public final ApolloClient f8129a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PickupOption.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PickupOption.Companion companion = PickupOption.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PickupOption.Companion companion2 = PickupOption.e;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PickupOption.Companion companion3 = PickupOption.e;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PickupOption.Companion companion4 = PickupOption.e;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public StoreLocatorRepositoryImpl(ApolloClient apolloClient) {
        Intrinsics.h(apolloClient, "apolloClient");
        this.f8129a = apolloClient;
    }

    public static Store c(com.woolworths.feature.shop.storelocator.fragment.Store store) {
        PickUpOption pickUpOption;
        String str = store.b;
        LocationDivision locationDivision = LocationDivision.d;
        String str2 = store.c;
        String str3 = store.d;
        double d = store.h;
        double d2 = store.i;
        String strValueOf = String.valueOf(store.j);
        String str4 = store.f;
        if (str4 == null) {
            str4 = "";
        }
        ArrayList arrayList = store.e;
        ArrayList<Store.InstoreTradingHour> arrayList2 = store.g;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        for (Store.InstoreTradingHour instoreTradingHour : arrayList2) {
            arrayList3.add(new TradingHours(instoreTradingHour.f20343a, instoreTradingHour.b));
            str = str;
        }
        String str5 = str;
        ArrayList<Store.PickupType> arrayList4 = store.l;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList4, 10));
        for (Store.PickupType pickupType : arrayList4) {
            String strValueOf2 = String.valueOf(pickupType.f20344a);
            int iOrdinal = pickupType.c.ordinal();
            if (iOrdinal == 0) {
                pickUpOption = PickUpOption.d;
            } else if (iOrdinal == 1) {
                pickUpOption = PickUpOption.e;
            } else if (iOrdinal == 2) {
                pickUpOption = PickUpOption.f;
            } else if (iOrdinal == 3) {
                pickUpOption = PickUpOption.g;
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                pickUpOption = PickUpOption.f;
            }
            arrayList5.add(new PickUpType(strValueOf2, pickUpOption, pickupType.d, pickupType.e, pickupType.b));
        }
        return new au.com.woolworths.foundation.shop.storelocator.pickup.models.Store(str5, locationDivision, str2, str3, d, d2, strValueOf, str4, arrayList, arrayList3, arrayList5, str3, null, null, 12288);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(double r13, double r15, kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.StoreLocatorRepositoryImpl.a(double, double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.StoreLocatorRepositoryImpl.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
