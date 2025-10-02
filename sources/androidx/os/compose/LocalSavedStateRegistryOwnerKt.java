package androidx.os.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"savedstate-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LocalSavedStateRegistryOwnerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ProvidableCompositionLocal f3733a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1;
     */
    static {
        /*
            r0 = 0
            java.lang.Class<androidx.savedstate.SavedStateRegistryOwner> r1 = androidx.os.SavedStateRegistryOwner.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2e
            kotlin.jvm.internal.Intrinsics.e(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalSavedStateRegistryOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "getAnnotations(...)"
            kotlin.jvm.internal.Intrinsics.g(r2, r3)     // Catch: java.lang.Throwable -> L2e
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2e
            r4 = 0
        L21:
            if (r4 >= r3) goto L30
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L2e
            boolean r5 = r5 instanceof kotlin.Deprecated     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L2b
        L29:
            r1 = r0
            goto L3f
        L2b:
            int r4 = r4 + 1
            goto L21
        L2e:
            r1 = move-exception
            goto L3b
        L30:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L29
            androidx.compose.runtime.ProvidableCompositionLocal r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1     // Catch: java.lang.Throwable -> L2e
            goto L3f
        L3b:
            kotlin.Result$Failure r1 = kotlin.ResultKt.a(r1)
        L3f:
            boolean r2 = r1 instanceof kotlin.Result.Failure
            if (r2 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = (androidx.compose.runtime.ProvidableCompositionLocal) r0
            if (r0 != 0) goto L55
            androidx.lifecycle.viewmodel.compose.a r0 = new androidx.lifecycle.viewmodel.compose.a
            r1 = 1
            r0.<init>(r1)
            androidx.compose.runtime.StaticProvidableCompositionLocal r1 = new androidx.compose.runtime.StaticProvidableCompositionLocal
            r1.<init>(r0)
            r0 = r1
        L55:
            androidx.os.compose.LocalSavedStateRegistryOwnerKt.f3733a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.os.compose.LocalSavedStateRegistryOwnerKt.<clinit>():void");
    }
}
