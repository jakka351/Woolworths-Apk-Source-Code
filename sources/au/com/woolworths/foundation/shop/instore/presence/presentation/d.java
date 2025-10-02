package au.com.woolworths.foundation.shop.instore.presence.presentation;

import androidx.compose.material.ModalBottomSheetState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                BuildersKt.c((CoroutineScope) this.e, null, null, new InstorePresencePromptBottomSheetKt$PreviewBottomSheet$1$1$2$1$1$1$1((ModalBottomSheetState) this.f, null), 3);
                return Unit.f24250a;
            case 1:
                return BuildersKt.c((CoroutineScope) this.e, null, null, new InstorePresencePromptBottomSheetKt$PromptBottomSheet$1$hideSheet$1$1$1((ModalBottomSheetState) this.f, null), 3);
            default:
                a aVar = (a) this.e;
                Function0 function0 = (Function0) this.f;
                aVar.invoke();
                function0.invoke();
                return Unit.f24250a;
        }
    }
}
