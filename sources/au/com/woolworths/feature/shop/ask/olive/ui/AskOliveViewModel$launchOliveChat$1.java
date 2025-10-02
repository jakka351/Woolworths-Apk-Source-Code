package au.com.woolworths.feature.shop.ask.olive.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel$launchOliveChat$1", f = "AskOliveViewModel.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AskOliveViewModel$launchOliveChat$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AskOliveViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskOliveViewModel$launchOliveChat$1(AskOliveViewModel askOliveViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = askOliveViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskOliveViewModel$launchOliveChat$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AskOliveViewModel$launchOliveChat$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            r2 = 0
            r3 = 1
            r4 = 0
            au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel r5 = r6.q
            if (r1 == 0) goto L19
            if (r1 != r3) goto L11
            kotlin.ResultKt.b(r7)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L32 au.com.woolworths.android.onesite.network.ServerErrorException -> L3a
            goto L2b
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.ResultKt.b(r7)
            java.lang.String r7 = r5.o     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L32 au.com.woolworths.android.onesite.network.ServerErrorException -> L3a
            if (r7 != 0) goto L41
            au.com.woolworths.feature.shop.ask.olive.ui.interactor.FetchChatbotFeedInteractor r7 = r5.i     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L32 au.com.woolworths.android.onesite.network.ServerErrorException -> L3a
            r6.p = r3     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L32 au.com.woolworths.android.onesite.network.ServerErrorException -> L3a
            java.lang.Object r7 = r7.a(r6)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L32 au.com.woolworths.android.onesite.network.ServerErrorException -> L3a
            if (r7 != r0) goto L2b
            return r0
        L2b:
            au.com.woolworths.feature.shop.ask.olive.ui.model.ChatFeed r7 = (au.com.woolworths.feature.shop.ask.olive.ui.model.ChatFeed) r7     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L32 au.com.woolworths.android.onesite.network.ServerErrorException -> L3a
            java.lang.String r7 = r7.f6633a     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L32 au.com.woolworths.android.onesite.network.ServerErrorException -> L3a
            r5.o = r7     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L32 au.com.woolworths.android.onesite.network.ServerErrorException -> L3a
            goto L41
        L32:
            androidx.lifecycle.MutableLiveData r7 = r5.p
            au.com.woolworths.feature.shop.ask.olive.ui.AskOliveErrorState r0 = au.com.woolworths.feature.shop.ask.olive.ui.AskOliveErrorState.d
            au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel.r6(r7, r4, r2, r0)
            goto L41
        L3a:
            androidx.lifecycle.MutableLiveData r7 = r5.p
            au.com.woolworths.feature.shop.ask.olive.ui.AskOliveErrorState r0 = au.com.woolworths.feature.shop.ask.olive.ui.AskOliveErrorState.e
            au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel.r6(r7, r4, r2, r0)
        L41:
            java.lang.String r7 = r5.o
            if (r7 == 0) goto Lad
            au.com.woolworths.feature.shop.ask.olive.ui.model.ChatWebLink r7 = new au.com.woolworths.feature.shop.ask.olive.ui.model.ChatWebLink
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r0 = r5.j
            au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures r1 = au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures.e
            boolean r0 = r0.c(r1)
            if (r0 == 0) goto L81
            java.lang.String r0 = r5.n
            if (r0 == 0) goto L7b
            java.lang.String r1 = r5.o
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r2 = kotlin.text.StringsKt.D(r0)
            if (r2 != 0) goto L67
            java.lang.String r2 = "com.woolworths.app.version"
            java.lang.String r1 = au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel.p6(r1, r2, r0)
        L67:
            java.lang.String r0 = r5.u
            if (r0 == 0) goto L9d
            boolean r0 = kotlin.text.StringsKt.D(r0)
            if (r0 == 0) goto L72
            goto L9d
        L72:
            java.lang.String r0 = "firstExecutedQuery"
            java.lang.String r2 = r5.u
            java.lang.String r1 = au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel.p6(r1, r0, r2)
            goto L9d
        L7b:
            java.lang.String r7 = "versionName"
            kotlin.jvm.internal.Intrinsics.p(r7)
            throw r4
        L81:
            java.lang.String r0 = r5.o
            au.com.woolworths.shop.auth.ShopAccountInteractor r1 = r5.f
            boolean r2 = r1.d()
            if (r2 == 0) goto L96
            au.com.woolworths.android.onesite.models.authentication.Member r1 = r1.n()
            if (r1 == 0) goto L96
            java.lang.String r1 = r1.getAccessToken()
            goto L97
        L96:
            r1 = r4
        L97:
            java.lang.String r2 = "#com.woolworths.shop.token="
            java.lang.String r1 = androidx.camera.core.impl.b.o(r0, r2, r1)
        L9d:
            au.com.woolworths.android.onesite.appdata.AppConfig r0 = r5.e
            au.com.woolworths.android.onesite.mandy.MagicLinkConfigData r0 = r0.getD()
            java.util.Map r0 = r0.f4272a
            r7.<init>(r1, r0)
            androidx.lifecycle.MutableLiveData r0 = r5.p
            au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel.r6(r0, r7, r3, r4)
        Lad:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveViewModel$launchOliveChat$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
