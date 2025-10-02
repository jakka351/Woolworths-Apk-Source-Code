package au.com.woolworths.foundation.force.upgrade.impl;

import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/foundation/force/upgrade/data/UpgradeConfig;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.force.upgrade.impl.AppConfigRepositoryImpl$clearStoredAppConfig$2", f = "AppConfigRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AppConfigRepositoryImpl$clearStoredAppConfig$2 extends SuspendLambda implements Function2<UpgradeConfig, Continuation<? super UpgradeConfig>, Object> {
    public AppConfigRepositoryImpl$clearStoredAppConfig$2() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppConfigRepositoryImpl$clearStoredAppConfig$2(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((AppConfigRepositoryImpl$clearStoredAppConfig$2) create((UpgradeConfig) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return null;
    }
}
