package me.oriient.internal.services.dataManager.mapGrid;

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
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1305c implements InterfaceC1303a {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f25210a;
    public final Lazy b;
    public final Lazy c;

    public C1305c() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25210a = di.inject(reflectionFactory.b(AuthManager.class));
        this.b = InternalDiKt.getDi().inject(reflectionFactory.b(InterfaceC1306d.class));
        this.c = InternalDiKt.getDi().inject(reflectionFactory.b(EngineVersionProvider.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.internal.services.dataManager.mapGrid.MapGridRecord r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof me.oriient.internal.services.dataManager.mapGrid.C1304b
            if (r0 == 0) goto L13
            r0 = r7
            me.oriient.internal.services.dataManager.mapGrid.b r0 = (me.oriient.internal.services.dataManager.mapGrid.C1304b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.mapGrid.b r0 = new me.oriient.internal.services.dataManager.mapGrid.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f25209a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r7)
            goto L72
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.b(r7)
            kotlin.Lazy r7 = r5.f25210a
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.auth.AuthManager r7 = (me.oriient.internal.services.auth.AuthManager) r7
            kotlinx.coroutines.flow.StateFlow r7 = r7.getCredentials()
            java.lang.Object r7 = r7.getValue()
            me.oriient.internal.services.auth.Credentials r7 = (me.oriient.internal.services.auth.Credentials) r7
            if (r7 == 0) goto L78
            java.lang.String r7 = r7.getSpaceId()
            if (r7 != 0) goto L4f
            goto L78
        L4f:
            kotlin.Lazy r2 = r5.b
            java.lang.Object r2 = r2.getD()
            me.oriient.internal.services.dataManager.mapGrid.d r2 = (me.oriient.internal.services.dataManager.mapGrid.InterfaceC1306d) r2
            r0.c = r4
            me.oriient.internal.services.dataManager.mapGrid.t r2 = (me.oriient.internal.services.dataManager.mapGrid.C1321t) r2
            r2.getClass()
            me.oriient.internal.services.dataManager.mapGrid.s r0 = new me.oriient.internal.services.dataManager.mapGrid.s
            r0.<init>(r6, r2, r7)
            kotlinx.coroutines.CoroutineScope r6 = r2.f25225a
            me.oriient.internal.services.dataManager.mapGrid.n r7 = new me.oriient.internal.services.dataManager.mapGrid.n
            r4 = 0
            r7.<init>(r0, r2, r4)
            r0 = 3
            kotlinx.coroutines.BuildersKt.c(r6, r4, r4, r7, r0)
            if (r3 != r1) goto L72
            return r1
        L72:
            me.oriient.internal.infra.utils.core.Outcome$Success r6 = new me.oriient.internal.infra.utils.core.Outcome$Success
            r6.<init>(r3)
            return r6
        L78:
            me.oriient.internal.infra.utils.core.Outcome$Failure r6 = new me.oriient.internal.infra.utils.core.Outcome$Failure
            me.oriient.internal.infra.utils.core.AuthError r7 = new me.oriient.internal.infra.utils.core.AuthError
            r7.<init>()
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.mapGrid.C1305c.a(me.oriient.internal.services.dataManager.mapGrid.MapGridRecord, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object clean(Continuation continuation) {
        C1321t c1321t = (C1321t) ((InterfaceC1306d) this.b.getD());
        c1321t.getClass();
        BuildersKt.c(c1321t.f25225a, null, null, new C1316n(new C1315m(c1321t), c1321t, null), 3);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object cleanData(Object obj, Continuation continuation) {
        String spaceId;
        C1324w c1324w = (C1324w) obj;
        Credentials credentials = (Credentials) ((AuthManager) this.f25210a.getD()).getCredentials().getValue();
        Unit unit = Unit.f24250a;
        if (credentials != null && (spaceId = credentials.getSpaceId()) != null) {
            InterfaceC1306d interfaceC1306d = (InterfaceC1306d) this.b.getD();
            String str = c1324w.f25227a;
            String str2 = c1324w.b;
            String str3 = c1324w.c;
            C1321t c1321t = (C1321t) interfaceC1306d;
            c1321t.getClass();
            BuildersKt.c(c1321t.f25225a, null, null, new C1316n(new C1311i(c1321t, str, str2, str3, spaceId), c1321t, null), 3);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        }
        return unit;
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final Object getData(Object obj, boolean z, Continuation continuation) {
        String spaceId;
        C1324w c1324w = (C1324w) obj;
        Credentials credentials = (Credentials) ((AuthManager) this.f25210a.getD()).getCredentials().getValue();
        if (credentials == null || (spaceId = credentials.getSpaceId()) == null) {
            return new Outcome.Failure(new AuthError());
        }
        InterfaceC1306d interfaceC1306d = (InterfaceC1306d) this.b.getD();
        String str = c1324w.f25227a;
        String str2 = c1324w.b;
        String str3 = c1324w.c;
        String shortVersion = ((EngineVersionProvider) this.c.getD()).getShortVersion();
        C1321t c1321t = (C1321t) interfaceC1306d;
        c1321t.getClass();
        return BuildersKt.f(c1321t.f25225a.getE(), new C1317o(new r(c1321t, str, str2, str3, spaceId, shortVersion), c1321t, null), continuation);
    }

    @Override // me.oriient.internal.services.dataManager.DataCache
    public final /* bridge */ /* synthetic */ Object save(Object obj, Object obj2, Continuation continuation) {
        return a((MapGridRecord) obj2, continuation);
    }
}
