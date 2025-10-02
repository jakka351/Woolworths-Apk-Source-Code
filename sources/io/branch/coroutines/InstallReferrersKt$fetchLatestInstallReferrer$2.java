package io.branch.coroutines;

import android.content.Context;
import io.branch.data.InstallReferrerResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lio/branch/data/InstallReferrerResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.branch.coroutines.InstallReferrersKt$fetchLatestInstallReferrer$2", f = "InstallReferrers.kt", l = {345, 345, 345, 345, 345}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class InstallReferrersKt$fetchLatestInstallReferrer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InstallReferrerResult>, Object> {
    public Object p;
    public Object q;
    public Object r;
    public InstallReferrerResult[] s;
    public InstallReferrerResult[] t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Context x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrersKt$fetchLatestInstallReferrer$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.x = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InstallReferrersKt$fetchLatestInstallReferrer$2 installReferrersKt$fetchLatestInstallReferrer$2 = new InstallReferrersKt$fetchLatestInstallReferrer$2(this.x, continuation);
        installReferrersKt$fetchLatestInstallReferrer$2.w = obj;
        return installReferrersKt$fetchLatestInstallReferrer$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstallReferrersKt$fetchLatestInstallReferrer$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0230  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.coroutines.InstallReferrersKt$fetchLatestInstallReferrer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
