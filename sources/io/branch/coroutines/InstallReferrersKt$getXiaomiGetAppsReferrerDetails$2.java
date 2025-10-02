package io.branch.coroutines;

import android.content.Context;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import io.branch.data.InstallReferrerResult;
import io.branch.referral.BranchLogger;
import io.branch.referral.util.DependencyUtilsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lio/branch/data/InstallReferrerResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.InstallReferrersKt$getXiaomiGetAppsReferrerDetails$2", f = "InstallReferrers.kt", l = {226}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InstallReferrersKt$getXiaomiGetAppsReferrerDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InstallReferrerResult>, Object> {
    public int p;
    public final /* synthetic */ Context q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrersKt$getXiaomiGetAppsReferrerDetails$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.q = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstallReferrersKt$getXiaomiGetAppsReferrerDetails$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstallReferrersKt$getXiaomiGetAppsReferrerDetails$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
        } catch (Exception e) {
            BranchLogger.f("Caught getXiaomiGetAppsReferrerDetails exception: " + e);
        }
        if (i == 0) {
            ResultKt.b(obj);
            if (DependencyUtilsKt.a("com.miui.referrer.api.GetAppsReferrerClient")) {
                final CompletableDeferred completableDeferredA = CompletableDeferredKt.a();
                GetAppsReferrerClient.Companion.newBuilder(this.q).build().startConnection(new GetAppsReferrerStateListener() { // from class: io.branch.coroutines.InstallReferrersKt$getXiaomiGetAppsReferrerDetails$2.1
                });
                this.p = 1;
                obj = completableDeferredA.await(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return (InstallReferrerResult) obj;
    }
}
