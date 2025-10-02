package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimationController;
import androidx.compose.foundation.layout.SideCalculator;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WindowInsetsConnection_androidKt$imeNestedScroll$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NestedScrollConnection nestedScrollConnection;
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-369978792);
        WeakHashMap weakHashMap = WindowInsetsHolder.x;
        AndroidWindowInsets androidWindowInsets = WindowInsetsHolder.Companion.c(composer).c;
        float f = WindowInsetsConnection_androidKt.f982a;
        composer.o(-1011341039);
        if (Build.VERSION.SDK_INT < 30) {
            composer.l();
            nestedScrollConnection = DoNothingNestedScrollConnection.d;
        } else {
            SideCalculator.f975a.getClass();
            SideCalculator sideCalculator = SideCalculator.Companion.c;
            SideCalculator$Companion$LeftSideCalculator$1 sideCalculator$Companion$LeftSideCalculator$1 = SideCalculator.Companion.b;
            if (32 == WindowInsetsSides.c) {
                sideCalculator = sideCalculator$Companion$LeftSideCalculator$1;
            } else if (32 != WindowInsetsSides.d) {
                sideCalculator = SideCalculator.Companion.d;
            }
            View view = (View) composer.x(AndroidCompositionLocals_androidKt.f);
            Density density = (Density) composer.x(CompositionLocalsKt.h);
            boolean zN = composer.n(androidWindowInsets) | composer.n(view) | composer.n(sideCalculator) | composer.n(density);
            Object objG = composer.G();
            Object obj4 = Composer.Companion.f1624a;
            if (zN || objG == obj4) {
                objG = new WindowInsetsNestedScrollConnection(androidWindowInsets, view, sideCalculator, density);
                composer.A(objG);
            }
            final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) objG;
            boolean zI = composer.I(windowInsetsNestedScrollConnection);
            Object objG2 = composer.G();
            if (zI || objG2 == obj4) {
                objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() throws DispatchException {
                                WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection3 = windowInsetsNestedScrollConnection2;
                                CancellableContinuationImpl cancellableContinuationImpl = windowInsetsNestedScrollConnection3.m;
                                if (cancellableContinuationImpl != null) {
                                    cancellableContinuationImpl.B(null, WindowInsetsNestedScrollConnection$dispose$1.h);
                                }
                                Job job = windowInsetsNestedScrollConnection3.l;
                                if (job != null) {
                                    ((JobSupport) job).cancel((CancellationException) null);
                                }
                                WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsNestedScrollConnection3.h;
                                if (windowInsetsAnimationController != null) {
                                    windowInsetsAnimationController.finish(!Intrinsics.c(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
                                }
                            }
                        };
                    }
                };
                composer.A(objG2);
            }
            EffectsKt.c(windowInsetsNestedScrollConnection, (Function1) objG2, composer);
            composer.l();
            nestedScrollConnection = windowInsetsNestedScrollConnection;
        }
        Modifier modifierA = NestedScrollModifierKt.a(modifier, nestedScrollConnection, null);
        composer.l();
        return modifierA;
    }
}
