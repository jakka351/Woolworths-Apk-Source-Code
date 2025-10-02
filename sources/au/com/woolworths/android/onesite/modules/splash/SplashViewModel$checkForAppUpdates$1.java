package au.com.woolworths.android.onesite.modules.splash;

import android.os.Build;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.models.config.ConfigResponse;
import au.com.woolworths.android.onesite.modules.splash.SplashScreenContract;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import au.com.woolworths.foundation.force.upgrade.data.UpgradePromptType;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeType;
import au.com.woolworths.foundation.force.upgrade.extension.UpgradePromptTypeExtensionKt;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.splash.SplashViewModel$checkForAppUpdates$1", f = "SplashViewModel.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SplashViewModel$checkForAppUpdates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SplashViewModel r;
    public final /* synthetic */ FunctionReferenceImpl s;
    public final /* synthetic */ String t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.splash.SplashViewModel$checkForAppUpdates$1$1", f = "SplashViewModel.kt", l = {87}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.splash.SplashViewModel$checkForAppUpdates$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;
        public final /* synthetic */ Deferred r;
        public final /* synthetic */ FunctionReferenceImpl s;
        public final /* synthetic */ boolean t;
        public final /* synthetic */ SplashViewModel u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Deferred deferred, Function0 function0, boolean z, SplashViewModel splashViewModel, Continuation continuation) {
            super(2, continuation);
            this.r = deferred;
            this.s = (FunctionReferenceImpl) function0;
            this.t = z;
            this.u = splashViewModel;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, this.u, continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SplashViewModel splashViewModel = this.u;
            SharedFlowImpl sharedFlowImpl = splashViewModel.o;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.q = (CoroutineScope) this.q;
                this.p = 1;
                obj = this.r.await(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ?? r2 = this.s;
            if (obj != null) {
                r2.invoke();
                if (this.t) {
                    UpgradeConfig upgradeConfig = obj instanceof UpgradeConfig ? (UpgradeConfig) obj : null;
                    if (upgradeConfig == null) {
                        splashViewModel.q6();
                    } else {
                        UpgradeType f8501a = upgradeConfig.getF8501a();
                        UpgradePromptType b = upgradeConfig.getB();
                        UpgradeType upgradeType = UpgradeType.e;
                        if (f8501a == upgradeType && UpgradePromptTypeExtensionKt.b(b)) {
                            sharedFlowImpl.f(new SplashScreenContract.Action.ShowAppFlexibleUpdate(upgradeConfig));
                        } else if (f8501a == upgradeType && UpgradePromptTypeExtensionKt.a(b)) {
                            sharedFlowImpl.f(new SplashScreenContract.Action.ShowAppForcedUpdate(upgradeConfig));
                        } else {
                            UpgradeType upgradeType2 = UpgradeType.f;
                            if (f8501a == upgradeType2 && UpgradePromptTypeExtensionKt.b(b)) {
                                sharedFlowImpl.f(new SplashScreenContract.Action.ShowOsFlexibleUpdate(upgradeConfig));
                            } else if (f8501a == upgradeType2 && UpgradePromptTypeExtensionKt.a(b)) {
                                sharedFlowImpl.f(new SplashScreenContract.Action.ShowOsForcedUpdate(upgradeConfig));
                            } else {
                                splashViewModel.q6();
                            }
                        }
                    }
                } else {
                    ConfigResponse configResponse = (ConfigResponse) obj;
                    int configStatus = configResponse.getConfigStatus();
                    if (configStatus == 0) {
                        sharedFlowImpl.f(new SplashScreenContract.Action.ShowUnsupportedOsDialog(configResponse.getStatus()));
                        SplashViewModel.r6(splashViewModel, ActionData.Companion.a("Show OS Unsupported"));
                    } else if (configStatus == 1) {
                        sharedFlowImpl.f(new SplashScreenContract.Action.ShowForceUpdateDialog(configResponse.getStatus()));
                        SplashViewModel.r6(splashViewModel, ActionData.Companion.a("Show Force Update"));
                    } else if (configStatus != 2) {
                        splashViewModel.q6();
                    } else {
                        sharedFlowImpl.f(new SplashScreenContract.Action.ShowUpdateAvailableDialog(configResponse.getStatus(), configResponse.getAppLatestVersion()));
                        SplashViewModel.r6(splashViewModel, ActionData.Companion.a("Show App Update"));
                    }
                }
            } else {
                r2.invoke();
                splashViewModel.q6();
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SplashViewModel$checkForAppUpdates$1(SplashViewModel splashViewModel, Function0 function0, String str, Continuation continuation) {
        super(2, continuation);
        String str2 = Build.VERSION.RELEASE;
        this.r = splashViewModel;
        this.s = (FunctionReferenceImpl) function0;
        this.t = str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = Build.VERSION.RELEASE;
        SplashViewModel$checkForAppUpdates$1 splashViewModel$checkForAppUpdates$1 = new SplashViewModel$checkForAppUpdates$1(this.r, this.s, this.t, continuation);
        splashViewModel$checkForAppUpdates$1.q = obj;
        return splashViewModel$checkForAppUpdates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashViewModel$checkForAppUpdates$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        SplashViewModel splashViewModel = this.r;
        ShopAccountInteractor shopAccountInteractor = splashViewModel.k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        ?? r2 = this.s;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            boolean zC = splashViewModel.l.c(BaseShopAppFeature.Y);
            if (shopAccountInteractor.S()) {
                splashViewModel.j.a();
            }
            if (zC && !shopAccountInteractor.S()) {
                r2.invoke();
                splashViewModel.q6();
            }
            String str = Build.VERSION.RELEASE;
            Deferred deferredA = BuildersKt.a(coroutineScope, null, new SplashViewModel$checkForAppUpdates$1$configJob$1(zC, splashViewModel, this.t, null), 3);
            try {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(deferredA, r2, zC, splashViewModel, null);
                this.q = deferredA;
                this.p = 1;
                if (TimeoutKt.b(3000L, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (TimeoutCancellationException unused) {
                deferred = deferredA;
                r2.invoke();
                deferred.cancel((CancellationException) null);
                splashViewModel.q6();
                return Unit.f24250a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            deferred = (Deferred) this.q;
            try {
                ResultKt.b(obj);
            } catch (TimeoutCancellationException unused2) {
                r2.invoke();
                deferred.cancel((CancellationException) null);
                splashViewModel.q6();
                return Unit.f24250a;
            }
        }
        return Unit.f24250a;
    }
}
