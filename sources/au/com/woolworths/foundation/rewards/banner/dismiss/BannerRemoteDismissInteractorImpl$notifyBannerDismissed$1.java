package au.com.woolworths.foundation.rewards.banner.dismiss;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl", f = "BannerRemoteDismissInteractorImpl.kt", l = {17, 19}, m = "notifyBannerDismissed")
/* loaded from: classes4.dex */
final class BannerRemoteDismissInteractorImpl$notifyBannerDismissed$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ BannerRemoteDismissInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerRemoteDismissInteractorImpl$notifyBannerDismissed$1(BannerRemoteDismissInteractorImpl bannerRemoteDismissInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = bannerRemoteDismissInteractorImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(com.medallia.digital.mobilesdk.l8.b.b, r10) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:11:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.q = r10
            int r10 = r9.s
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.s = r10
            r1 = r10 & r0
            au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl r2 = r9.r
            if (r1 == 0) goto L14
            int r10 = r10 - r0
            r9.s = r10
            r10 = r9
            goto L19
        L14:
            au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl$notifyBannerDismissed$1 r10 = new au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl$notifyBannerDismissed$1
            r10.<init>(r2, r9)
        L19:
            java.lang.Object r0 = r10.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r10.s
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            java.lang.String r3 = r10.p
            kotlin.ResultKt.b(r0)
        L2c:
            r0 = r3
            goto L40
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            java.lang.String r3 = r10.p
            kotlin.ResultKt.b(r0)
            goto L4e
        L3c:
            kotlin.ResultKt.b(r0)
            r0 = 0
        L40:
            r10.p = r0
            r10.s = r5
            java.lang.Object r3 = r2.a(r0, r10)
            if (r3 != r1) goto L4b
            goto L63
        L4b:
            r8 = r3
            r3 = r0
            r0 = r8
        L4e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L64
            r10.p = r3
            r10.s = r4
            r6 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.b(r6, r10)
            if (r0 != r1) goto L2c
        L63:
            return r1
        L64:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractorImpl$notifyBannerDismissed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
