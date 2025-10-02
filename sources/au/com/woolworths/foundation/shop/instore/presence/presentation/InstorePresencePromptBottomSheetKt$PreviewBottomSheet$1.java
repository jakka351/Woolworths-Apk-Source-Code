package au.com.woolworths.foundation.shop.instore.presence.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.component.SurfaceKt;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class InstorePresencePromptBottomSheetKt$PreviewBottomSheet$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt$PreviewBottomSheet$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt$PreviewBottomSheet$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C02261 implements Function3<ColumnScope, Composer, Integer, Unit> {
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ColumnScope ModalBottomSheetLayout = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                if ((iIntValue & 17) != 16 || !composer.c()) {
                    throw null;
                }
                composer.j();
                return Unit.f24250a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
            } else {
                final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composer, 3078, 6);
                Object objG = composer.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = android.support.v4.media.session.a.i(composer.y(), composer);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objG;
                ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(769286353, new C02261(), composer), null, modalBottomSheetStateC, BitmapDescriptorFactory.HUE_RED, 0L, 0L, false, ComposableLambdaKt.c(-1337173574, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt.PreviewBottomSheet.1.1.2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Composer composer2 = (Composer) obj3;
                        if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            Modifier modifierF = PaddingKt.f(SizeKt.c, 16);
                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer2, 48);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, modifierF);
                            ComposeUiNode.e3.getClass();
                            Function0 function0 = ComposeUiNode.Companion.b;
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function0);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function2);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            TextKt.b("Rest of the UI", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 131070);
                            SpacerKt.a(composer2, SizeKt.g(Modifier.Companion.d, 20));
                            composer2.o(-1633490746);
                            CoroutineScope coroutineScope2 = coroutineScope;
                            boolean zI = composer2.I(coroutineScope2);
                            ModalBottomSheetState modalBottomSheetState = modalBottomSheetStateC;
                            boolean zI2 = zI | composer2.I(modalBottomSheetState);
                            Object objG2 = composer2.G();
                            if (zI2 || objG2 == Composer.Companion.f1624a) {
                                objG2 = new d(0, coroutineScope2, modalBottomSheetState);
                                composer2.A(objG2);
                            }
                            composer2.l();
                            ButtonKt.a((Function0) objG2, null, false, null, null, null, null, null, null, ComposableSingletons$InstorePresencePromptBottomSheetKt.d, composer2, 805306368, 510);
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                }, composer), composer, 12583430, 122);
            }
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.a(null, null, 0L, 0L, null, BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-825531329, new AnonymousClass1(), composer), composer, 1572864, 63);
        }
        return Unit.f24250a;
    }
}
