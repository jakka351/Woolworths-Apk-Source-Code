package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresExtension.Container
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public class AdIdManagerImplCommon extends AdIdManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.adservices.adid.AdIdManager f3616a;

    public AdIdManagerImplCommon(android.adservices.adid.AdIdManager mAdIdManager) {
        Intrinsics.h(mAdIdManager, "mAdIdManager");
        this.f3616a = mAdIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.RequiresPermission
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon r4, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.adid.AdId> r5) {
        /*
            boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1 r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1 r0 = new androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon r4 = r0.p
            kotlin.ResultKt.b(r5)
            goto L5d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r5)
            r0.p = r4
            r0.s = r3
            r4.getClass()
            kotlinx.coroutines.CancellableContinuationImpl r5 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r5.<init>(r3, r0)
            r5.o()
            android.adservices.adid.AdIdManager r0 = r4.f3616a
            androidx.arch.core.executor.a r2 = new androidx.arch.core.executor.a
            r3 = 2
            r2.<init>(r3)
            android.os.OutcomeReceiver r3 = androidx.core.os.OutcomeReceiverKt.a(r5)
            androidx.media3.datasource.c.q(r0, r2, r3)
            java.lang.Object r5 = r5.n()
            if (r5 != r1) goto L5d
            return r1
        L5d:
            android.adservices.adid.AdId r5 = androidx.media3.datasource.c.a(r5)
            r4.getClass()
            androidx.privacysandbox.ads.adservices.adid.AdId r4 = new androidx.privacysandbox.ads.adservices.adid.AdId
            java.lang.String r0 = androidx.media3.datasource.c.p(r5)
            java.lang.String r1 = "response.adId"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            boolean r5 = androidx.media3.datasource.c.y(r5)
            r4.<init>(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.b(androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object a(@NotNull Continuation<? super AdId> continuation) {
        return b(this, continuation);
    }
}
