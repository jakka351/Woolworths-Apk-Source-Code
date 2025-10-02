package au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.design.core.ui.ExperimentalCoreDesignApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@ExperimentalCoreDesignApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/modalbottomsheet/SheetState;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SheetState {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.material3.SheetState f4725a;

    public SheetState(androidx.compose.material3.SheetState sheetState) {
        Intrinsics.h(sheetState, "sheetState");
        this.f4725a = sheetState;
    }

    public final Object a(Continuation continuation) {
        Object objC = this.f4725a.c(continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }
}
