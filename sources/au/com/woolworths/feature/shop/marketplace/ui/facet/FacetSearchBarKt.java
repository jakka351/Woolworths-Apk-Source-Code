package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.TextFieldValue;
import au.com.woolworths.design.wx.component.searchbar.SearchBarKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"marketplace_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FacetSearchBarKt {
    public static final void a(int i, Function1 onSubmitSearch, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        Intrinsics.h(onSubmitSearch, "onSubmitSearch");
        ComposerImpl composerImplV = composer.v(-861582297);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.r(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(onSubmitSearch) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(new TextFieldValue("", 0L, 6));
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerImplV.x(CompositionLocalsKt.p);
            FocusManager focusManager = (FocusManager) composerImplV.x(CompositionLocalsKt.i);
            Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
            long j = ToneColors.j;
            TextFieldValue textFieldValue = (TextFieldValue) mutableState.getD();
            String strC = StringResources_androidKt.c(composerImplV, i);
            composerImplV.o(-1633490746);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.design.core.ui.component.experimental.topbar.d(mutableState, onSubmitSearch);
                composerImplV.A(objG2);
            }
            Function1 function1 = (Function1) objG2;
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(focusManager);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new b(focusManager, 2);
                composerImplV.A(objG3);
            }
            Function0 function0 = (Function0) objG3;
            composerImplV.V(false);
            composerImplV.o(-1224400529);
            boolean zI2 = (i4 == 32) | composerImplV.I(focusManager) | composerImplV.n(softwareKeyboardController);
            Object objG4 = composerImplV.G();
            if (zI2 || objG4 == composer$Companion$Empty$1) {
                androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(mutableState, onSubmitSearch, focusManager, softwareKeyboardController, 7);
                composerImplV.A(bVar);
                objG4 = bVar;
            }
            composerImplV.V(false);
            composerImpl = composerImplV;
            SearchBarKt.a(textFieldValue, false, function1, function0, (Function0) objG4, modifierE, j, strC, ComposableSingletons$FacetSearchBarKt.f7487a, composerImpl, 100859952, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(i, i2, onSubmitSearch);
        }
    }
}
