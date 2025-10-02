package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode;", "", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PublishedApi
/* loaded from: classes.dex */
public interface ComposeUiNode {
    public static final Companion e3 = Companion.f1905a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/ComposeUiNode$Companion;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f1905a = new Companion();
        public static final Function0 b;
        public static final Function0 c;
        public static final Function2 d;
        public static final Function2 e;
        public static final Function2 f;
        public static final Function2 g;
        public static final Function2 h;
        public static final Function2 i;
        public static final Function2 j;

        static {
            LayoutNode$Companion$ErrorMeasurePolicy$1 layoutNode$Companion$ErrorMeasurePolicy$1 = LayoutNode.V;
            b = LayoutNode$Companion$Constructor$1.h;
            c = ComposeUiNode$Companion$VirtualConstructor$1.h;
            d = ComposeUiNode$Companion$SetModifier$1.h;
            e = ComposeUiNode$Companion$SetDensity$1.h;
            f = ComposeUiNode$Companion$SetResolvedCompositionLocals$1.h;
            g = ComposeUiNode$Companion$SetMeasurePolicy$1.h;
            h = ComposeUiNode$Companion$SetLayoutDirection$1.h;
            i = ComposeUiNode$Companion$SetViewConfiguration$1.h;
            j = ComposeUiNode$Companion$SetCompositeKeyHash$1.h;
        }
    }

    void b(int i);

    void e(LayoutDirection layoutDirection);

    void f(MeasurePolicy measurePolicy);

    void g(Modifier modifier);

    void h(Density density);

    void i(CompositionLocalMap compositionLocalMap);

    void j(ViewConfiguration viewConfiguration);
}
