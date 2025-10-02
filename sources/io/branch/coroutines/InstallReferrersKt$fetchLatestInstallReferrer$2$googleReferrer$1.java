package io.branch.coroutines;

import android.content.Context;
import io.branch.data.InstallReferrerResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lio/branch/data/InstallReferrerResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.InstallReferrersKt$fetchLatestInstallReferrer$2$googleReferrer$1", f = "InstallReferrers.kt", l = {339}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InstallReferrersKt$fetchLatestInstallReferrer$2$googleReferrer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InstallReferrerResult>, Object> {
    public int p;
    public final /* synthetic */ Context q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrersKt$fetchLatestInstallReferrer$2$googleReferrer$1(Context context, Continuation continuation) {
        super(2, continuation);
        this.q = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstallReferrersKt$fetchLatestInstallReferrer$2$googleReferrer$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstallReferrersKt$fetchLatestInstallReferrer$2$googleReferrer$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        this.p = 1;
        Object objF = BuildersKt.f(Dispatchers.f24691a, new InstallReferrersKt$getGooglePlayStoreReferrerDetails$2(this.q, null), this);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }
}
