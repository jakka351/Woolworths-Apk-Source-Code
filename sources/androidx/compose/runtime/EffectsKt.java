package androidx.compose.runtime;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class EffectsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DisposableEffectScope f1636a = new DisposableEffectScope();

    public static final void a(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract, Function1 function1, Composer composer) {
        boolean zN = composer.n(activityResultRegistry) | composer.n(str) | composer.n(activityResultContract);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new DisposableEffectImpl(function1);
            composer.A(objG);
        }
    }

    public static final void b(Object obj, Object obj2, Function1 function1, Composer composer) {
        boolean zN = composer.n(obj) | composer.n(obj2);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new DisposableEffectImpl(function1);
            composer.A(objG);
        }
    }

    public static final void c(Object obj, Function1 function1, Composer composer) {
        boolean zN = composer.n(obj);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new DisposableEffectImpl(function1);
            composer.A(objG);
        }
    }

    public static final void d(Object[] objArr, Function1 function1, Composer composer) {
        boolean zN = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zN |= composer.n(obj);
        }
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            composer.A(new DisposableEffectImpl(function1));
        }
    }

    public static final void e(Composer composer, Object obj, Function2 function2) {
        CoroutineContext coroutineContextY = composer.y();
        boolean zN = composer.n(obj);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new LaunchedEffectImpl(coroutineContextY, function2);
            composer.A(objG);
        }
    }

    public static final void f(Object obj, Object obj2, Function2 function2, Composer composer) {
        CoroutineContext coroutineContextY = composer.y();
        boolean zN = composer.n(obj) | composer.n(obj2);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new LaunchedEffectImpl(coroutineContextY, function2);
            composer.A(objG);
        }
    }

    public static final void g(Object[] objArr, Function2 function2, Composer composer) {
        CoroutineContext coroutineContextY = composer.y();
        boolean zN = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zN |= composer.n(obj);
        }
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            composer.A(new LaunchedEffectImpl(coroutineContextY, function2));
        }
    }
}
