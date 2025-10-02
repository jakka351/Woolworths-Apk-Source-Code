package io.branch.coroutines;

import android.content.Context;
import io.branch.data.InstallReferrerResult;
import io.branch.referral.BranchLogger;
import io.branch.referral.PrefHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lio/branch/data/InstallReferrerResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.InstallReferrersKt$getMetaInstallReferrerDetails$2", f = "InstallReferrers.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InstallReferrersKt$getMetaInstallReferrerDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InstallReferrerResult>, Object> {
    public final /* synthetic */ Context p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrersKt$getMetaInstallReferrerDetails$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.p = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstallReferrersKt$getMetaInstallReferrerDetails$2(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstallReferrersKt$getMetaInstallReferrerDetails$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            String str = PrefHelper.h;
            if (str != null && str.length() != 0) {
                Context context = this.p;
                String strConcat = "content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str);
                String strConcat2 = "content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str);
                InstallReferrerResult installReferrerResultB = InstallReferrersKt.b(context, strConcat);
                InstallReferrerResult installReferrerResultB2 = InstallReferrersKt.b(context, strConcat2);
                return (installReferrerResultB == null || installReferrerResultB2 == null) ? installReferrerResultB == null ? installReferrerResultB2 : installReferrerResultB : installReferrerResultB.d > installReferrerResultB2.d ? installReferrerResultB : installReferrerResultB2;
            }
            BranchLogger.a("No Facebook App ID provided. Can't check for Meta Install Referrer");
            return null;
        } catch (Exception e) {
            BranchLogger.b("Exception in getMetaInstallReferrerDetails: " + e);
            return null;
        }
    }
}
