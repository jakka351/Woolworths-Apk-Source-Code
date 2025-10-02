package me.oriient.navigation.ondevice.navgraph;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.services.dataManager.rest.RestHelper;
import me.oriient.navigation.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class G implements B {

    @NotNull
    private static final C Companion = new C();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26298a = DiKt.a().inject(Reflection.f24268a.b(RestHelper.class));

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof me.oriient.navigation.ondevice.navgraph.D
            if (r0 == 0) goto L14
            r0 = r9
            me.oriient.navigation.ondevice.navgraph.D r0 = (me.oriient.navigation.ondevice.navgraph.D) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            me.oriient.navigation.ondevice.navgraph.D r0 = new me.oriient.navigation.ondevice.navgraph.D
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.f26295a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.ResultKt.b(r9)
            goto L4c
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.ResultKt.b(r9)
            kotlin.Lazy r9 = r7.f26298a
            java.lang.Object r9 = r9.getD()
            r1 = r9
            me.oriient.internal.services.dataManager.rest.RestHelper r1 = (me.oriient.internal.services.dataManager.rest.RestHelper) r1
            me.oriient.navigation.ondevice.navgraph.E r5 = me.oriient.navigation.ondevice.navgraph.E.f26296a
            r6.c = r2
            java.lang.String r2 = "NavGraphRest"
            r4 = 1
            r3 = r8
            java.lang.Object r9 = r1.getStringData(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            me.oriient.internal.infra.utils.core.Outcome r9 = (me.oriient.internal.infra.utils.core.Outcome) r9
            me.oriient.navigation.ondevice.navgraph.F r8 = me.oriient.navigation.ondevice.navgraph.F.f26297a
            me.oriient.internal.infra.utils.core.Outcome r8 = r9.mapFailure(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.ondevice.navgraph.G.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
