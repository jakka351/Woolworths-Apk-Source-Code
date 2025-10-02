package au.com.woolworths.feature.shop.wpay.ui.wpay;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.foundation.shop.olive.voice.analytics.VoiceAnalytics;
import au.com.woolworths.shop.checkout.domain.model.PreferenceId;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel;
import com.google.accompanist.permissions.PermissionState;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i(Object obj, int i, Object obj2, boolean z) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.f = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ((Function1) this.e).invoke(new WPayForOrderContract.UiEvent.PaymentMethod.PayPal.Select(((PaymentMethodItem.PayPal.Linked) ((PaymentMethodItem.PayPal) this.g)).f8308a, this.f));
                break;
            case 1:
                ((Function1) this.e).invoke(new WPayForOrderContract.UiEvent.GiftCard.Delete((String) this.g, this.f));
                break;
            case 2:
                VoiceAnalytics voiceAnalytics = (VoiceAnalytics) this.e;
                PermissionState permissionState = (PermissionState) this.g;
                if (this.f) {
                    final String str = voiceAnalytics.c;
                    final VoiceProductAssistantAnalytics.Assistant.Action action = new VoiceProductAssistantAnalytics.Assistant(str).h;
                    action.getClass();
                    voiceAnalytics.a(new Event(str, action) { // from class: au.com.woolworths.analytics.supers.products.VoiceProductAssistantAnalytics$Assistant$Action$waitingStateOliveClicked$1
                        public final String d;
                        public final Object e;

                        {
                            this.d = YU.a.h("voiceproduct", str, "_buttonclick");
                            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                            spreadBuilder.b(action.f4046a.g);
                            androidx.constraintlayout.core.state.a.z("event.Action", "button_click", spreadBuilder, "event.Label", "tap on olive voice search");
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.e = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d, reason: from getter */
                        public final String getD() {
                            return this.d;
                        }

                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj;
                            return Intrinsics.c(this.d, event.getD()) && Intrinsics.c(this.e, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.e;
                        }
                    });
                }
                permissionState.a();
                break;
            default:
                CheckoutDetailsViewModel checkoutDetailsViewModel = (CheckoutDetailsViewModel) this.e;
                checkoutDetailsViewModel.L6(checkoutDetailsViewModel.j, (PreferenceId) this.g, !this.f);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ i(boolean z, VoiceAnalytics voiceAnalytics, PermissionState permissionState) {
        this.d = 2;
        this.f = z;
        this.e = voiceAnalytics;
        this.g = permissionState;
    }
}
