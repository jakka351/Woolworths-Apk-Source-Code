package au.com.woolworths.android.onesite.modules.splash;

import android.os.Build;
import au.com.woolworths.android.onesite.repository.ConfigManagerImpl;
import au.com.woolworths.foundation.force.upgrade.impl.AppConfigClientImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.splash.SplashViewModel$checkForAppUpdates$1$configJob$1", f = "SplashViewModel.kt", l = {74, 81}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SplashViewModel$checkForAppUpdates$1$configJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    public int p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ SplashViewModel r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashViewModel$checkForAppUpdates$1$configJob$1(boolean z, SplashViewModel splashViewModel, String str, Continuation continuation) {
        super(2, continuation);
        String str2 = Build.VERSION.RELEASE;
        this.q = z;
        this.r = splashViewModel;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = Build.VERSION.RELEASE;
        return new SplashViewModel$checkForAppUpdates$1$configJob$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SplashViewModel$checkForAppUpdates$1$configJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        String str = Build.VERSION.RELEASE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                return obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        boolean z = this.q;
        String str2 = this.s;
        SplashViewModel splashViewModel = this.r;
        if (z) {
            AppConfigClientImpl appConfigClientImpl = splashViewModel.i;
            Boolean bool = Boolean.TRUE;
            this.p = 1;
            Object objB = appConfigClientImpl.b(str2, str, bool, this);
            if (objB != coroutineSingletons) {
                return objB;
            }
        } else {
            ConfigManagerImpl configManagerImpl = splashViewModel.h;
            String strJ = splashViewModel.e.j();
            this.p = 2;
            Object objA = configManagerImpl.a(str2, str, strJ, this);
            if (objA != coroutineSingletons) {
                return objA;
            }
        }
        return coroutineSingletons;
    }
}
