package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposableLambdaKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1688a = new Object();

    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final ComposableLambdaImpl b(Composer composer, int i, Lambda lambda) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.J(Integer.rotateLeft(i, 1), f1688a);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            composableLambdaImpl = new ComposableLambdaImpl(lambda, true, i);
            composer.A(composableLambdaImpl);
        } else {
            Intrinsics.f(objG, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) objG;
            composableLambdaImpl.o(lambda);
        }
        composer.M();
        return composableLambdaImpl;
    }

    public static final ComposableLambdaImpl c(int i, Function function, Composer composer) {
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new ComposableLambdaImpl(function, true, i);
            composer.A(objG);
        }
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) objG;
        composableLambdaImpl.o(function);
        return composableLambdaImpl;
    }

    public static final boolean d(RecomposeScope recomposeScope, RecomposeScope recomposeScope2) {
        if (recomposeScope == null) {
            return true;
        }
        if (!(recomposeScope instanceof RecomposeScopeImpl) || !(recomposeScope2 instanceof RecomposeScopeImpl)) {
            return false;
        }
        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
        return !recomposeScopeImpl.b() || recomposeScope.equals(recomposeScope2) || Intrinsics.c(recomposeScopeImpl.c, ((RecomposeScopeImpl) recomposeScope2).c);
    }
}
