package androidx.privacysandbox.ads.adservices.java.customaudience;

import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1", f = "CustomAudienceManagerFutures.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CustomAudienceManagerFutures.Api33Ext4JavaImpl q;
    public final /* synthetic */ LeaveCustomAudienceRequest r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(CustomAudienceManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl, LeaveCustomAudienceRequest leaveCustomAudienceRequest, Continuation continuation) {
        super(2, continuation);
        this.q = api33Ext4JavaImpl;
        this.r = leaveCustomAudienceRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1 customAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1 = (CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        customAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return Unit.f24250a;
        }
        ResultKt.b(obj);
        Intrinsics.e(null);
        this.p = 1;
        throw null;
    }
}
