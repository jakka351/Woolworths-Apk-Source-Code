package io.branch.coroutines;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.branch.data.InstallReferrerResult;
import io.branch.referral.BranchLogger;
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

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lio/branch/data/InstallReferrerResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.InstallReferrersKt$getGooglePlayStoreReferrerDetails$2", f = "InstallReferrers.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InstallReferrersKt$getGooglePlayStoreReferrerDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InstallReferrerResult>, Object> {
    public int p;
    public final /* synthetic */ Context q;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/branch/coroutines/InstallReferrersKt$getGooglePlayStoreReferrerDetails$2$1", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: io.branch.coroutines.InstallReferrersKt$getGooglePlayStoreReferrerDetails$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements InstallReferrerStateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CompletableDeferred f23838a;
        public final /* synthetic */ InstallReferrerClient b;

        public AnonymousClass1(CompletableDeferred completableDeferred, InstallReferrerClient installReferrerClient) {
            this.f23838a = completableDeferred;
            this.b = installReferrerClient;
        }

        public final void a(int i) {
            BranchLogger.f("Caught getGooglePlayStoreReferrerDetails onInstallReferrerSetupFinished response code: " + i);
            InstallReferrerResult installReferrerResult = null;
            InstallReferrerClient installReferrerClient = this.b;
            CompletableDeferred completableDeferred = this.f23838a;
            if (i == 0) {
                try {
                    ReferrerDetails referrerDetailsB = installReferrerClient.b();
                    installReferrerResult = new InstallReferrerResult("PlayStore", referrerDetailsB.b(), referrerDetailsB.a(), true, referrerDetailsB.c());
                } catch (Exception e) {
                    BranchLogger.f("Caught getGooglePlayStoreReferrerDetails installReferrer exception: " + e);
                }
                completableDeferred.h(installReferrerResult);
            } else {
                completableDeferred.h(null);
            }
            installReferrerClient.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrersKt$getGooglePlayStoreReferrerDetails$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.q = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstallReferrersKt$getGooglePlayStoreReferrerDetails$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstallReferrersKt$getGooglePlayStoreReferrerDetails$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CompletableDeferred completableDeferredA = CompletableDeferredKt.a();
                InstallReferrerClient installReferrerClientA = new InstallReferrerClient.Builder(this.q.getApplicationContext()).a();
                installReferrerClientA.c(new AnonymousClass1(completableDeferredA, installReferrerClientA));
                this.p = 1;
                obj = completableDeferredA.await(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return (InstallReferrerResult) obj;
        } catch (Exception e) {
            BranchLogger.f("Caught getGooglePlayStoreReferrerDetails exception: " + e);
            return null;
        }
    }
}
