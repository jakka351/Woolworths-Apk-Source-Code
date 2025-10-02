package io.branch.coroutines;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
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
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.DeviceSignalsKt$getUserAgentAsync$2", f = "DeviceSignals.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DeviceSignalsKt$getUserAgentAsync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public MutexImpl p;
    public Context q;
    public int r;
    public final /* synthetic */ Context s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSignalsKt$getUserAgentAsync$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeviceSignalsKt$getUserAgentAsync$2(this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DeviceSignalsKt$getUserAgentAsync$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutexImpl mutexImpl;
        Context context;
        String defaultUserAgent;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        if (i == 0) {
            ResultKt.b(obj);
            mutexImpl = DeviceSignalsKt.f23837a;
            this.p = mutexImpl;
            Context context2 = this.s;
            this.q = context2;
            this.r = 1;
            if (mutexImpl.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            context = context2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.q;
            mutexImpl = this.p;
            ResultKt.b(obj);
        }
        try {
            if (TextUtils.isEmpty(Branch.o)) {
                try {
                    BranchLogger.e("Begin getUserAgentAsync " + Thread.currentThread());
                    defaultUserAgent = WebSettings.getDefaultUserAgent(context);
                    try {
                        BranchLogger.e("End getUserAgentAsync " + Thread.currentThread() + ' ' + defaultUserAgent);
                    } catch (Exception e) {
                        e = e;
                        BranchLogger.b("Failed to retrieve userAgent string. " + e.getMessage());
                        str = defaultUserAgent;
                        return str;
                    }
                } catch (Exception e2) {
                    e = e2;
                    defaultUserAgent = null;
                }
                str = defaultUserAgent;
            } else {
                BranchLogger.e("UserAgent cached " + Branch.o);
                str = Branch.o;
            }
            return str;
        } finally {
            mutexImpl.c(null);
        }
    }
}
