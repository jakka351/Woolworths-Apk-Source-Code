package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposablesKt {
    public static final RecomposeScope a(Composer composer) {
        RecomposeScopeImpl recomposeScopeImplD = composer.D();
        if (recomposeScopeImplD == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer.k(recomposeScopeImplD);
        return recomposeScopeImplD;
    }

    public static final void b() {
        throw new IllegalStateException("Invalid applier");
    }
}
