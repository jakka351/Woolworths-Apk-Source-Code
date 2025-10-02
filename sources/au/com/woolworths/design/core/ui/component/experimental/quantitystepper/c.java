package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ double g;

    public /* synthetic */ c(double d, FocusRequester focusRequester, Function0 function0) {
        this.d = 2;
        this.g = d;
        this.e = focusRequester;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Number number = (Number) this.e;
                String str = (String) this.f;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.v(semantics, BitmapDescriptorFactory.HUE_RED);
                if (str == null) {
                    str = "";
                }
                SemanticsPropertiesKt.k(semantics, "Quantity, " + number + str);
                if (this.g == 0.0d) {
                    SemanticsPropertiesKt.g(semantics);
                }
                break;
            case 1:
                Number number2 = (Number) this.e;
                String str2 = (String) this.f;
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                SemanticsPropertiesKt.v(clearAndSetSemantics, BitmapDescriptorFactory.HUE_RED);
                if (str2 == null) {
                    str2 = "";
                }
                SemanticsPropertiesKt.k(clearAndSetSemantics, "Quantity, " + number2 + str2 + " ");
                if (this.g == 0.0d) {
                    SemanticsPropertiesKt.g(clearAndSetSemantics);
                }
                break;
            default:
                FocusRequester focusRequester = (FocusRequester) this.e;
                Function0 function0 = (Function0) this.f;
                ((Double) obj).getClass();
                if (this.g == 1.0d) {
                    FocusRequester.d(focusRequester);
                }
                function0.invoke();
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ c(Number number, String str, double d, int i) {
        this.d = i;
        this.e = number;
        this.f = str;
        this.g = d;
    }
}
