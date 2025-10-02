package androidx.compose.runtime;

import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DoubleState extends State<Double> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    double f();

    @Override // androidx.compose.runtime.State
    default Double getValue() {
        return Double.valueOf(f());
    }
}
