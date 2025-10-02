package me.oriient.navigation.ondevice.navgraph;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.auth.Credentials;
import me.oriient.navigation.common.DiKt;
import me.oriient.navigation.common.util.NavigationError;

/* renamed from: me.oriient.navigation.ondevice.navgraph.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1797c implements InterfaceC1795a {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26309a;
    public final Lazy b;

    public C1797c() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26309a = dependencyInjectionA.inject(reflectionFactory.b(InterfaceC1798d.class));
        this.b = DiKt.a().inject(reflectionFactory.b(AuthManager.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.navigation.ondevice.navgraph.NavGraphRecord r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.navigation.ondevice.navgraph.C1796b
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.navigation.ondevice.navgraph.b r0 = (me.oriient.navigation.ondevice.navgraph.C1796b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.navigation.ondevice.navgraph.b r0 = new me.oriient.navigation.ondevice.navgraph.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f26308a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r7)
            goto L4e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            kotlin.Lazy r7 = r5.f26309a
            java.lang.Object r7 = r7.getD()
            me.oriient.navigation.ondevice.navgraph.d r7 = (me.oriient.navigation.ondevice.navgraph.InterfaceC1798d) r7
            r0.c = r4
            me.oriient.navigation.ondevice.navgraph.v r7 = (me.oriient.navigation.ondevice.navgraph.v) r7
            r7.getClass()
            me.oriient.navigation.ondevice.navgraph.u r0 = new me.oriient.navigation.ondevice.navgraph.u
            r0.<init>(r6, r7)
            r7.a(r0)
            if (r3 != r1) goto L4e
            return r1
        L4e:
            me.oriient.internal.infra.utils.core.Outcome$Success r6 = new me.oriient.internal.infra.utils.core.Outcome$Success
            r6.<init>(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.navigation.ondevice.navgraph.C1797c.a(me.oriient.navigation.ondevice.navgraph.NavGraphRecord, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object clean(Continuation continuation) {
        v vVar = (v) ((InterfaceC1798d) this.f26309a.getD());
        vVar.getClass();
        vVar.a(new C1808n(vVar));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object cleanData(Object obj, Continuation continuation) {
        String spaceId;
        w wVar = (w) obj;
        Credentials credentials = (Credentials) ((AuthManager) this.b.getD()).getCredentials().getValue();
        Unit unit = Unit.f24250a;
        if (credentials != null && (spaceId = credentials.getSpaceId()) != null) {
            InterfaceC1798d interfaceC1798d = (InterfaceC1798d) this.f26309a.getD();
            String str = wVar.f26327a;
            String str2 = wVar.b;
            v vVar = (v) interfaceC1798d;
            vVar.getClass();
            vVar.a(new C1804j(vVar, str, str2, spaceId));
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        }
        return unit;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object getData(Object obj, boolean z, Continuation continuation) {
        String spaceId;
        w wVar = (w) obj;
        Credentials credentials = (Credentials) ((AuthManager) this.b.getD()).getCredentials().getValue();
        if (credentials == null || (spaceId = credentials.getSpaceId()) == null) {
            return new Outcome.Failure(NavigationError.AuthError.INSTANCE);
        }
        InterfaceC1798d interfaceC1798d = (InterfaceC1798d) this.f26309a.getD();
        String str = wVar.f26327a;
        String str2 = wVar.b;
        v vVar = (v) interfaceC1798d;
        vVar.getClass();
        return BuildersKt.f(((CoroutineScope) vVar.e.getD()).getE(), new C1810p(new t(vVar, str, str2, spaceId), vVar, null), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final /* bridge */ /* synthetic */ Object save(Object obj, Object obj2, Continuation continuation) {
        return a((NavGraphRecord) obj2, continuation);
    }
}
