package io.branch.coroutines;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.branch.referral.BranchLogger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.AdvertisingIdsKt$getGoogleAdvertisingInfoObject$2", f = "AdvertisingIds.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AdvertisingIdsKt$getGoogleAdvertisingInfoObject$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AdvertisingIdClient.Info>, Object> {
    public final /* synthetic */ Context p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertisingIdsKt$getGoogleAdvertisingInfoObject$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.p = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdvertisingIdsKt$getGoogleAdvertisingInfoObject$2(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdvertisingIdsKt$getGoogleAdvertisingInfoObject$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.p);
        } catch (Exception e) {
            BranchLogger.f("Caught getGoogleAdvertisingInfoObject exception: " + e);
            return null;
        }
    }
}
