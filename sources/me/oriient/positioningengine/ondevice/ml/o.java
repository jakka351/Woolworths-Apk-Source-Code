package me.oriient.positioningengine.ondevice.ml;

import kotlin.Lazy;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.FileManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.dataManager.engine.EngineVersionProvider;
import me.oriient.positioningengine.common.DiKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class o implements i {

    @NotNull
    public static final j Companion = new j();

    /* renamed from: a, reason: collision with root package name */
    public final String f26461a;
    public final String b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public o() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        String shortVersion = ((EngineVersionProvider) di.get(reflectionFactory.b(EngineVersionProvider.class), null)).getShortVersion();
        this.f26461a = shortVersion;
        this.b = YU.a.g(shortVersion, "_config");
        this.c = DiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.d = DiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
        this.e = DiKt.getDi().inject(reflectionFactory.b(p.class));
        this.f = DiKt.getDi().inject(reflectionFactory.b(FileManager.class), FileManager.FileManagerFolders.FILES.getDiKey());
        this.g = DiKt.getDi().inject(reflectionFactory.b(me.oriient.positioningengine.common.config.c.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.positioningengine.ondevice.ml.o r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof me.oriient.positioningengine.ondevice.ml.k
            if (r0 == 0) goto L16
            r0 = r5
            me.oriient.positioningengine.ondevice.ml.k r0 = (me.oriient.positioningengine.ondevice.ml.k) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            me.oriient.positioningengine.ondevice.ml.k r0 = new me.oriient.positioningengine.ondevice.ml.k
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            me.oriient.positioningengine.ondevice.ml.o r4 = r0.f26457a
            kotlin.ResultKt.b(r5)
            goto L4e
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.b(r5)
            kotlin.Lazy r5 = r4.e
            java.lang.Object r5 = r5.getD()
            me.oriient.positioningengine.ondevice.ml.p r5 = (me.oriient.positioningengine.ondevice.ml.p) r5
            java.lang.String r2 = r4.f26461a
            r0.f26457a = r4
            r0.d = r3
            me.oriient.positioningengine.ondevice.ml.u r5 = (me.oriient.positioningengine.ondevice.ml.u) r5
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            me.oriient.internal.infra.utils.core.Outcome r5 = (me.oriient.internal.infra.utils.core.Outcome) r5
            boolean r0 = r5 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r0 == 0) goto L90
            kotlin.Lazy r0 = r4.f
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.infra.utils.core.FileManager r0 = (me.oriient.internal.infra.utils.core.FileManager) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "oriientConfigurations"
            r1.<init>(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = r4.b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r0 = r0.getOrCreateFile(r1)
            kotlin.Lazy r4 = r4.f
            java.lang.Object r4 = r4.getD()
            me.oriient.internal.infra.utils.core.FileManager r4 = (me.oriient.internal.infra.utils.core.FileManager) r4
            me.oriient.internal.infra.utils.core.Outcome$Success r5 = (me.oriient.internal.infra.utils.core.Outcome.Success) r5
            java.lang.Object r5 = r5.getValue()
            byte[] r5 = (byte[]) r5
            r4.writeFile(r0, r5)
            me.oriient.internal.infra.utils.core.Outcome$Success r4 = new me.oriient.internal.infra.utils.core.Outcome$Success
            kotlin.Unit r5 = kotlin.Unit.f24250a
            r4.<init>(r5)
            return r4
        L90:
            boolean r4 = r5 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r4 == 0) goto La0
            me.oriient.internal.infra.utils.core.Outcome$Failure r4 = new me.oriient.internal.infra.utils.core.Outcome$Failure
            me.oriient.internal.infra.utils.core.Outcome$Failure r5 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r5
            java.lang.Exception r5 = r5.getValue()
            r4.<init>(r5)
            return r4
        La0:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.ml.o.a(me.oriient.positioningengine.ondevice.ml.o, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
