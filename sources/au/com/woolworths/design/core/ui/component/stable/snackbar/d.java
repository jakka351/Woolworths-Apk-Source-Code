package au.com.woolworths.design.core.ui.component.stable.snackbar;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ SnackbarData e;

    public /* synthetic */ d(SnackbarData snackbarData, int i) {
        this.d = i;
        this.e = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                FadeInFadeOutAnimationItem it = (FadeInFadeOutAnimationItem) obj;
                Intrinsics.h(it, "it");
                return Boolean.valueOf(Intrinsics.c(it.f4766a, this.e));
            default:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.n(semantics, 0);
                SemanticsPropertiesKt.d(semantics, new e(this.e, 0));
                return Unit.f24250a;
        }
    }
}
