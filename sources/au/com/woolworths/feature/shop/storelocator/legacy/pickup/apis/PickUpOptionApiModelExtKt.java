package au.com.woolworths.feature.shop.storelocator.legacy.pickup.apis;

import au.com.woolworths.android.onesite.modules.storelocator.apis.PickUpOptionApiModel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"storelocator-legacy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickUpOptionApiModelExtKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8190a;

        static {
            int[] iArr = new int[PickUpOptionApiModel.values().length];
            try {
                iArr[PickUpOptionApiModel.DRIVE_THRU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PickUpOptionApiModel.IN_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8190a = iArr;
        }
    }
}
