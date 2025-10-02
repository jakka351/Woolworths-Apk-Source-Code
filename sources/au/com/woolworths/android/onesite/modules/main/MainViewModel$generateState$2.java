package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.modules.main.MainViewModel$generateState$2", f = "MainViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MainViewModel$generateState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ MainViewModel q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Screen s;
    public final /* synthetic */ UpgradeConfig t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$generateState$2(Function0 function0, MainViewModel mainViewModel, boolean z, Screen screen, UpgradeConfig upgradeConfig, Continuation continuation) {
        super(2, continuation);
        this.p = function0;
        this.q = mainViewModel;
        this.r = z;
        this.s = screen;
        this.t = upgradeConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$generateState$2(this.p, this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        MainViewModel$generateState$2 mainViewModel$generateState$2 = (MainViewModel$generateState$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        mainViewModel$generateState$2.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.main.MainViewModel$generateState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
