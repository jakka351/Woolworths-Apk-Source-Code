package au.com.woolworths.shop.checkout.ui.compose;

import android.view.ViewGroup;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ComposeView;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.e;
                MutableState mutableState = (MutableState) this.f;
                ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) this.g;
                Intrinsics.h((LayoutCoordinates) obj, "it");
                mutableState.setValue(Boolean.TRUE);
                BuildersKt.c(coroutineScope, null, null, new IdVerificationBottomSheetKt$IdVerificationBottomSheet$1$1$1(modalBottomSheetState, null), 3);
                break;
            default:
                au.com.woolworths.shop.checkout.ui.fulfilmentwindows.a aVar = (au.com.woolworths.shop.checkout.ui.fulfilmentwindows.a) this.e;
                ViewGroup viewGroup = (ViewGroup) this.f;
                ComposeView composeView = (ComposeView) this.g;
                ActionData it = (ActionData) obj;
                Intrinsics.h(it, "it");
                viewGroup.removeView(composeView);
                aVar.invoke(it);
                break;
        }
        return Unit.f24250a;
    }
}
