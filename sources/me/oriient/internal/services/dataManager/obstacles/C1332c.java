package me.oriient.internal.services.dataManager.obstacles;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.AuthError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.auth.Credentials;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1332c implements InterfaceC1330a {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25247a;
    public final Lazy b;

    public C1332c() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25247a = di.inject(reflectionFactory.b(InterfaceC1333d.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(AuthManager.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.internal.services.dataManager.obstacles.w r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataManager.obstacles.C1331b
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataManager.obstacles.b r0 = (me.oriient.internal.services.dataManager.obstacles.C1331b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.obstacles.b r0 = new me.oriient.internal.services.dataManager.obstacles.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25246a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r7)
            goto L57
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            kotlin.Lazy r7 = r5.f25247a
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.dataManager.obstacles.d r7 = (me.oriient.internal.services.dataManager.obstacles.InterfaceC1333d) r7
            r0.c = r4
            me.oriient.internal.services.dataManager.obstacles.t r7 = (me.oriient.internal.services.dataManager.obstacles.C1348t) r7
            r7.getClass()
            me.oriient.internal.services.dataManager.obstacles.s r0 = new me.oriient.internal.services.dataManager.obstacles.s
            r0.<init>(r6, r7)
            kotlinx.coroutines.CoroutineScope r6 = r7.f25262a
            me.oriient.internal.services.dataManager.obstacles.n r2 = new me.oriient.internal.services.dataManager.obstacles.n
            r4 = 0
            r2.<init>(r0, r7, r4)
            r7 = 3
            kotlinx.coroutines.BuildersKt.c(r6, r4, r4, r2, r7)
            if (r3 != r1) goto L57
            return r1
        L57:
            me.oriient.internal.infra.utils.core.Outcome$Success r6 = new me.oriient.internal.infra.utils.core.Outcome$Success
            r6.<init>(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.obstacles.C1332c.a(me.oriient.internal.services.dataManager.obstacles.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object clean(Continuation continuation) {
        C1348t c1348t = (C1348t) ((InterfaceC1333d) this.f25247a.getD());
        c1348t.getClass();
        BuildersKt.c(c1348t.f25262a, null, null, new C1343n(new C1342m(c1348t), c1348t, null), 3);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object cleanData(Object obj, Continuation continuation) {
        String spaceId;
        C1349u c1349u = (C1349u) obj;
        Credentials credentials = (Credentials) ((AuthManager) this.b.getD()).getCredentials().getValue();
        Unit unit = Unit.f24250a;
        if (credentials != null && (spaceId = credentials.getSpaceId()) != null) {
            InterfaceC1333d interfaceC1333d = (InterfaceC1333d) this.f25247a.getD();
            String str = c1349u.f25263a;
            String str2 = c1349u.b;
            C1348t c1348t = (C1348t) interfaceC1333d;
            c1348t.getClass();
            BuildersKt.c(c1348t.f25262a, null, null, new C1343n(new C1338i(c1348t, str, str2, spaceId), c1348t, null), 3);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        }
        return unit;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object getData(Object obj, boolean z, Continuation continuation) {
        String spaceId;
        C1349u c1349u = (C1349u) obj;
        Credentials credentials = (Credentials) ((AuthManager) this.b.getD()).getCredentials().getValue();
        if (credentials == null || (spaceId = credentials.getSpaceId()) == null) {
            return new Outcome.Failure(new AuthError());
        }
        InterfaceC1333d interfaceC1333d = (InterfaceC1333d) this.f25247a.getD();
        String str = c1349u.f25263a;
        String str2 = c1349u.b;
        C1348t c1348t = (C1348t) interfaceC1333d;
        c1348t.getClass();
        return BuildersKt.f(c1348t.f25262a.getE(), new C1344o(new r(c1348t, str, str2, spaceId), c1348t, null), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final /* bridge */ /* synthetic */ Object save(Object obj, Object obj2, Continuation continuation) {
        return a((w) obj2, continuation);
    }
}
