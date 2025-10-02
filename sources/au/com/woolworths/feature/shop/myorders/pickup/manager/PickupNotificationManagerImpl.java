package au.com.woolworths.feature.shop.myorders.pickup.manager;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/pickup/manager/PickupNotificationManagerImpl;", "Lau/com/woolworths/feature/shop/myorders/pickup/manager/PickupNotificationManager;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Companion", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickupNotificationManagerImpl implements PickupNotificationManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7887a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/pickup/manager/PickupNotificationManagerImpl$Companion;", "", "", "TAG_PREFIX", "Ljava/lang/String;", "", "NOTIF_ID", "I", "", "ACQUIRE_LOCK_TIME", "J", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public PickupNotificationManagerImpl(@NotNull Context appContext) {
        Intrinsics.h(appContext, "appContext");
        this.f7887a = appContext;
    }
}
