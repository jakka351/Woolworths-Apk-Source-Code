package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements SaverScope, FunctionAdapter {
    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean a(Object obj) {
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return new FunctionReferenceImpl(1, null, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SaverScope) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
