package io.branch.coroutines;

import android.text.TextUtils;
import io.branch.referral.Branch;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.DeviceSignalsKt$getUserAgentSync$2", f = "DeviceSignals.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class DeviceSignalsKt$getUserAgentSync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeviceSignalsKt$getUserAgentSync$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        if (!TextUtils.isEmpty(Branch.o)) {
            BranchLogger.e("UserAgent cached " + Branch.o);
            return Branch.o;
        }
        try {
            BranchLogger.e("Begin getUserAgentSync " + Thread.currentThread());
            throw null;
        } catch (Exception e) {
            BranchLogger.b("Failed to retrieve userAgent string. " + e.getMessage());
            return null;
        }
    }
}
