package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ c(int i, FocusRequester focusRequester, Function0 function0) {
        this.e = i;
        this.f = focusRequester;
        this.g = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                FocusRequester focusRequester = (FocusRequester) this.f;
                Function0 function0 = (Function0) this.g;
                ((Double) obj).getClass();
                if (this.e == 1) {
                    FocusRequester.d(focusRequester);
                }
                function0.invoke();
                break;
            default:
                ((Function2) this.f).invoke(Integer.valueOf(this.e), (List) this.g);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(int i, List list, Function2 function2) {
        this.f = function2;
        this.e = i;
        this.g = list;
    }
}
