package au.com.woolworths.feature.shop.notification.preferences.interactor;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/interactor/PreferencesCommInteractor;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesCommInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedFlowImpl f7941a;
    public final Flow b;

    public PreferencesCommInteractor() {
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.f7941a = sharedFlowImplB;
        this.b = FlowKt.a(sharedFlowImplB);
    }
}
