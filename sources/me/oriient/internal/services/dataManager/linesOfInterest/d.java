package me.oriient.internal.services.dataManager.linesOfInterest;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataManager.DataRepositoryImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d implements LinesOfInterestRepository {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final DataRepositoryImpl f25187a;

    public d(DataRepositoryImpl linesOfInterestDataRepository) {
        Intrinsics.h(linesOfInterestDataRepository, "linesOfInterestDataRepository");
        this.f25187a = linesOfInterestDataRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r6.cleanData(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // me.oriient.internal.services.dataManager.linesOfInterest.LinesOfInterestRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getLinesOfInterest(java.lang.String r6, boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof me.oriient.internal.services.dataManager.linesOfInterest.c
            if (r0 == 0) goto L13
            r0 = r8
            me.oriient.internal.services.dataManager.linesOfInterest.c r0 = (me.oriient.internal.services.dataManager.linesOfInterest.c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.internal.services.dataManager.linesOfInterest.c r0 = new me.oriient.internal.services.dataManager.linesOfInterest.c
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            me.oriient.internal.services.dataManager.linesOfInterest.i r6 = r0.b
            me.oriient.internal.services.dataManager.linesOfInterest.d r7 = r0.f25186a
            kotlin.ResultKt.b(r8)
            goto L5a
        L3a:
            kotlin.ResultKt.b(r8)
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r6, r8)
            me.oriient.internal.services.dataManager.linesOfInterest.i r8 = new me.oriient.internal.services.dataManager.linesOfInterest.i
            r8.<init>(r6)
            if (r7 == 0) goto L58
            me.oriient.internal.services.dataManager.DataRepositoryImpl r6 = r5.f25187a
            r0.f25186a = r5
            r0.b = r8
            r0.e = r4
            java.lang.Object r6 = r6.cleanData(r8, r0)
            if (r6 != r1) goto L58
            goto L6a
        L58:
            r7 = r5
            r6 = r8
        L5a:
            me.oriient.internal.services.dataManager.DataRepositoryImpl r7 = r7.f25187a
            r8 = 0
            r0.f25186a = r8
            r0.b = r8
            r0.e = r3
            r8 = 0
            java.lang.Object r6 = r7.getData(r6, r8, r0)
            if (r6 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.dataManager.linesOfInterest.d.getLinesOfInterest(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
