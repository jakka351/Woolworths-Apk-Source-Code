package androidx.compose.runtime;

import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/runtime/FloatState;", "Landroidx/compose/runtime/MutableState;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MutableFloatState extends FloatState, MutableState<Float> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.runtime.FloatState
    float a();

    default void l(float f) {
        p(f);
    }

    void p(float f);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        l(((Number) obj).floatValue());
    }

    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    /* renamed from: getValue */
    default Float getD() {
        return Float.valueOf(a());
    }
}
