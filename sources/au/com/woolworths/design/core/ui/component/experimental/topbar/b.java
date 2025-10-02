package au.com.woolworths.design.core.ui.component.experimental.topbar;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import coil3.compose.internal.UtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ b(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        String str = this.e;
        SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                Intrinsics.h(semantics, "$this$semantics");
                if (str != null && !StringsKt.D(str)) {
                    KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                    semantics.b(SemanticsProperties.h, unit);
                    break;
                } else {
                    SemanticsPropertiesKt.g(semantics);
                    break;
                }
                break;
            default:
                CoroutineDispatcher coroutineDispatcher = UtilsKt.f13070a;
                SemanticsPropertiesKt.k(semantics, str);
                SemanticsPropertiesKt.r(semantics, 5);
                break;
        }
        return unit;
    }
}
