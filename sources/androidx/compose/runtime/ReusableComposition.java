package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/PausableComposition;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ReusableComposition extends Composition {
    void deactivate();

    void t(ComposableLambdaImpl composableLambdaImpl);
}
