package androidx.privacysandbox.ads.adservices.appsetid;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresExtension.Container
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint
@RestrictTo
@SourceDebugExtension
/* loaded from: classes2.dex */
public class AppSetIdManagerImplCommon extends AppSetIdManager {

    /* renamed from: a, reason: collision with root package name */
    public final android.adservices.appsetid.AppSetIdManager f3624a;

    public AppSetIdManagerImplCommon(android.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
        Intrinsics.h(mAppSetIdManager, "mAppSetIdManager");
        this.f3624a = mAppSetIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object b(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon r5, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.AppSetId> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1 r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1 r0 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon r5 = r0.p
            kotlin.ResultKt.b(r6)
            goto L5d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.b(r6)
            r0.p = r5
            r0.s = r3
            r5.getClass()
            kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r0)
            r6.<init>(r3, r0)
            r6.o()
            android.adservices.appsetid.AppSetIdManager r0 = r5.f3624a
            androidx.arch.core.executor.a r2 = new androidx.arch.core.executor.a
            r4 = 2
            r2.<init>(r4)
            android.os.OutcomeReceiver r4 = androidx.core.os.OutcomeReceiverKt.a(r6)
            androidx.privacysandbox.ads.adservices.adselection.a.t(r0, r2, r4)
            java.lang.Object r6 = r6.n()
            if (r6 != r1) goto L5d
            return r1
        L5d:
            android.adservices.appsetid.AppSetId r6 = androidx.privacysandbox.ads.adservices.adselection.a.c(r6)
            r5.getClass()
            int r5 = androidx.privacysandbox.ads.adservices.adselection.a.a(r6)
            java.lang.String r0 = "response.id"
            if (r5 != r3) goto L79
            androidx.privacysandbox.ads.adservices.appsetid.AppSetId r5 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetId
            java.lang.String r6 = androidx.privacysandbox.ads.adservices.adselection.a.r(r6)
            kotlin.jvm.internal.Intrinsics.g(r6, r0)
            r5.<init>(r6, r3)
            return r5
        L79:
            androidx.privacysandbox.ads.adservices.appsetid.AppSetId r5 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetId
            java.lang.String r6 = androidx.privacysandbox.ads.adservices.adselection.a.r(r6)
            kotlin.jvm.internal.Intrinsics.g(r6, r0)
            r0 = 2
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.b(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @DoNotInline
    @Nullable
    public Object a(@NotNull Continuation<? super AppSetId> continuation) {
        return b(this, continuation);
    }
}
