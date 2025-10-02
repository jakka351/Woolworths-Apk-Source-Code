package au.com.woolworths.foundation.shop.storelocator;

import android.content.SharedPreferences;
import au.com.woolworths.android.onesite.modules.storelocator.models.SelectedPickUpLocation;
import au.com.woolworths.android.onesite.network.ApiInterface;
import au.com.woolworths.foundation.shop.storelocator.network.StoreLocatorApiInterface;
import com.google.gson.Gson;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/PickUpLocatorRepository;", "", "Companion", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PickUpLocatorRepository {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f8885a;
    public final SharedPreferences b;
    public final ApiInterface c;
    public final StoreLocatorApiInterface d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/PickUpLocatorRepository$Companion;", "", "", "KEY_PICK_UP_LOCATION_INFO", "Ljava/lang/String;", "KEY_PICK_UP_STORE_ADDRESS_ID", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PickUpLocatorRepository(Gson gson, SharedPreferences sharedPreferences, ApiInterface apiInterface, StoreLocatorApiInterface storeLocatorApiInterface) {
        Intrinsics.h(gson, "gson");
        Intrinsics.h(apiInterface, "apiInterface");
        this.f8885a = gson;
        this.b = sharedPreferences;
        this.c = apiInterface;
        this.d = storeLocatorApiInterface;
    }

    public final SelectedPickUpLocation a() {
        String string = this.b.getString("pick_up_location_info", null);
        if (string != null) {
            return (SelectedPickUpLocation) this.f8885a.d(SelectedPickUpLocation.class, string);
        }
        return null;
    }
}
