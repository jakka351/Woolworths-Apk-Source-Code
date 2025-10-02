package au.com.woolworths.feature.shop.haveyouforgotten;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.foundation.shop.cart.data.model.CartFooterData;
import au.com.woolworths.shop.cart.data.CartRepositoryImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenViewModel$fetchFooter$1", f = "HaveYouForgottenViewModel.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class HaveYouForgottenViewModel$fetchFooter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ HaveYouForgottenViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HaveYouForgottenViewModel$fetchFooter$1(HaveYouForgottenViewModel haveYouForgottenViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = haveYouForgottenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HaveYouForgottenViewModel$fetchFooter$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HaveYouForgottenViewModel$fetchFooter$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        HaveYouForgottenViewModel haveYouForgottenViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CartRepositoryImpl cartRepositoryImpl = haveYouForgottenViewModel.e;
                this.p = 1;
                obj = cartRepositoryImpl.c(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            CartFooterData cartFooterData = (CartFooterData) obj;
            AnalyticsManager analyticsManager = haveYouForgottenViewModel.f;
            final String value = cartFooterData.c;
            Intrinsics.h(value, "value");
            analyticsManager.g(new Event(value) { // from class: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenAnalytics$HaveYouForgotten$Action$Companion$footerImpression$1
                public final Object d;

                {
                    this.d = MapsKt.j(new Pair("screen.Name", "Have You Forgotten Screen"), new Pair("app.Section", "Checkout"), new Pair("event.Category", "info"), new Pair("event.Action", "impression"), new Pair("event.Label", "Have You Forgotten Footer"), new Pair("event.Value", String.valueOf(value)));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "impression";
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            HaveYouForgottenViewModel.p6(haveYouForgottenViewModel, cartFooterData);
        } catch (NoConnectivityException unused) {
            HaveYouForgottenViewModel.p6(haveYouForgottenViewModel, null);
        } catch (ServerErrorException unused2) {
            HaveYouForgottenViewModel.p6(haveYouForgottenViewModel, null);
        }
        return Unit.f24250a;
    }
}
