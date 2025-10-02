package au.com.woolworths.feature.shop.instore.navigation.map;

import au.com.woolworths.feature.shop.instore.navigation.map.domain.BuildingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.CredentialsInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.InstoreNavigationInteractorImpl$fetchCurrentStoreMap$2", f = "InstoreNavigationInteractorImpl.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreNavigationInteractorImpl$fetchCurrentStoreMap$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    public int p;
    public final /* synthetic */ InstoreNavigationInteractorImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreNavigationInteractorImpl$fetchCurrentStoreMap$2(InstoreNavigationInteractorImpl instoreNavigationInteractorImpl, Continuation continuation) {
        super(2, continuation);
        this.q = instoreNavigationInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreNavigationInteractorImpl$fetchCurrentStoreMap$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreNavigationInteractorImpl$fetchCurrentStoreMap$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            InstoreNavigationInteractorImpl instoreNavigationInteractorImpl = this.q;
            String strA = instoreNavigationInteractorImpl.a();
            zBooleanValue = false;
            if (strA != null) {
                Timber.f27013a.b("fetchCurrentStoreMap() storeId = ".concat(strA), new Object[0]);
                CredentialsInteractor credentialsInteractor = instoreNavigationInteractorImpl.c;
                BuildingInteractor buildingInteractor = instoreNavigationInteractorImpl.d;
                this.p = 1;
                obj = InstoreNavigationInteractorImpl.h(instoreNavigationInteractorImpl, credentialsInteractor, buildingInteractor, strA, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }
}
