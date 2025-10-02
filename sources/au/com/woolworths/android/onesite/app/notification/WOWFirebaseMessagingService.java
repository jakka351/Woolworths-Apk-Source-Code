package au.com.woolworths.android.onesite.app.notification;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.myorders.pickup.manager.PickupNotificationHandler;
import au.com.woolworths.marketing.SwrveInteractor;
import com.swrve.sdk.ISwrve;
import com.swrve.sdk.SwrveSDKBase;
import com.woolworths.scanlibrary.services.SNGFirebaseMessagingHandler;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/app/notification/WOWFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "ShopApp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class WOWFirebaseMessagingService extends Hilt_WOWFirebaseMessagingService {
    public PickupNotificationHandler h;
    public SNGFirebaseMessagingHandler i;
    public SwrveInteractor j;

    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessageReceived(com.google.firebase.messaging.RemoteMessage r15) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.app.notification.WOWFirebaseMessagingService.onMessageReceived(com.google.firebase.messaging.RemoteMessage):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String s) {
        Intrinsics.h(s, "s");
        Timber.f27013a.b("firebase token: ".concat(s), new Object[0]);
        if (this.j == null) {
            Intrinsics.p("swrveInteractor");
            throw null;
        }
        SwrveSDKBase.a();
        ((ISwrve) SwrveSDKBase.f19075a).j(s);
    }
}
