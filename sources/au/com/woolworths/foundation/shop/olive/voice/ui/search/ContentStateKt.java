package au.com.woolworths.foundation.shop.olive.voice.ui.search;

import android.content.Context;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchError;
import au.com.woolworths.foundation.shop.olive.voice.data.VoiceSearchState;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "alpha1", "alpha2", "olive-voice_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ContentStateKt {
    public static final void a(VoiceSearchState voiceSearchState, boolean z, boolean z2, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-372720183);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(voiceSearchState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z2) ? 256 : 128;
        }
        int i3 = i2 | (composerImplV.n(modifier) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else if (voiceSearchState.equals(VoiceSearchState.Idle.f8832a)) {
            composerImplV.o(-1701803170);
            d(modifier, composerImplV, (i3 >> 9) & 14);
            composerImplV.V(false);
        } else if (voiceSearchState.equals(VoiceSearchState.Listening.f8833a)) {
            composerImplV.o(-1701800091);
            e(z, z2, modifier, composerImplV, (i3 >> 3) & 1022);
            composerImplV.V(false);
        } else if (voiceSearchState instanceof VoiceSearchState.Processing) {
            composerImplV.o(-1215998293);
            f((i3 >> 6) & 112, composerImplV, modifier, ((VoiceSearchState.Processing) voiceSearchState).f8834a);
            composerImplV.V(false);
        } else if (voiceSearchState instanceof VoiceSearchState.Recognising) {
            composerImplV.o(-1215844502);
            g((i3 >> 6) & 112, composerImplV, modifier, ((VoiceSearchState.Recognising) voiceSearchState).f8835a);
            composerImplV.V(false);
        } else {
            if (!(voiceSearchState instanceof VoiceSearchState.Failure)) {
                throw au.com.woolworths.android.onesite.a.w(-1701804011, composerImplV, false);
            }
            composerImplV.o(-1215694245);
            c(((VoiceSearchState.Failure) voiceSearchState).f8831a, modifier, composerImplV, (i3 >> 6) & 112);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.account.closeaccount.ui.f(voiceSearchState, z, z2, modifier, i, 2);
        }
    }

    public static final void b(final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(174713591);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            composerImplV.o(5004770);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new ContentStateKt$FadingTextChange$1$1(mutableState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG2);
            TweenSpec tweenSpecE = AnimationSpecKt.e(1000, 0, null, 6);
            State stateB = AnimateAsStateKt.b(((Boolean) mutableState.getD()).booleanValue() ? 0.0f : 1.0f, tweenSpecE, null, null, composerImplV, 48, 28);
            State stateB2 = AnimateAsStateKt.b(((Boolean) mutableState.getD()).booleanValue() ? 1.0f : 0.0f, tweenSpecE, null, null, composerImplV, 48, 28);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int i4 = z ? z2 ? R.string.olive_voice_sample_description_vps : R.string.olive_voice_sample_description_vps_old : R.string.olive_voice_listening_state_description;
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(stateB);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.d(stateB, 2);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            h(i4, 0, composerImplV, GraphicsLayerModifierKt.a(companion, (Function1) objG3));
            int i5 = z ? R.string.olive_voice_sample_description_alt_vps : R.string.olive_voice_listening_state_description_alt;
            composerImplV.o(5004770);
            boolean zN2 = composerImplV.n(stateB2);
            Object objG4 = composerImplV.G();
            if (zN2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.d(stateB2, 3);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            h(i5, 0, composerImplV, GraphicsLayerModifierKt.a(companion, (Function1) objG4));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    ContentStateKt.b(z, z2, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(VoiceSearchError voiceSearchError, Modifier modifier, Composer composer, int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(796060345);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(voiceSearchError) : composerImplV.I(voiceSearchError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.i(36, Alignment.Companion.k), Alignment.Companion.n, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.a(voiceSearchError.a(context), CoreTheme.f(composerImplV).d.b.b, null, CoreTheme.b(composerImplV).e.d.c.b, null, 3, 0, false, 0, null, composerImplV, 0, 980);
            composerImplV.o(1479169396);
            if (!voiceSearchError.b()) {
                TextKt.a(StringResources_androidKt.c(composerImplV, R.string.olive_voice_failure_action_message), CoreTheme.f(composerImplV).f5120a.b.f5123a, null, Color.b(CoreTheme.b(composerImplV).e.d.c.b, 0.6f), null, 3, 0, false, 0, null, composerImplV, 0, 980);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(voiceSearchError, i, 21, modifier);
        }
    }

    public static final void d(Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        ComposerImpl composerImplV = composer.v(-585298809);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            i3 = 4;
        } else {
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.i(6, Alignment.Companion.k), Alignment.Companion.n, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            String strC = StringResources_androidKt.c(composerImplV, R.string.olive_voice_ide_state_content_description);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(strC);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(strC, 23);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            i3 = 4;
            TextKt.a(StringResources_androidKt.c(composerImplV, R.string.olive_voice_idle_state_title), CoreTheme.f(composerImplV).d.b.b, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), CoreTheme.b(composerImplV).e.d.c.b, null, 3, 0, false, 0, null, composerImplV, 0, 976);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.recipes.details.ui.a(i, i3, modifier);
        }
    }

    public static final void e(final boolean z, final boolean z2, final Modifier modifier, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(1632373146);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            int i3 = z ? R.string.olive_voice_listening_state_title_vps : R.string.olive_voice_listening_state_title;
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.i(6, Alignment.Companion.k), Alignment.Companion.n, composerImplV, 54);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            int i5 = i2;
            TextKt.a(StringResources_androidKt.c(composerImplV, i3), CoreTheme.f(composerImplV).d.b.d, null, Color.b(CoreTheme.b(composerImplV).e.d.c.b, 0.6f), null, 3, 0, false, 0, null, composerImplV, 0, 980);
            composerImpl = composerImplV;
            b(z, z2, composerImpl, i5 & 126);
            composerImpl.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2() { // from class: au.com.woolworths.foundation.shop.olive.voice.ui.search.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    ContentStateKt.e(z, z2, modifier, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void f(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1008630543);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.i(6, Alignment.Companion.k), Alignment.Companion.n, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.f5121a.b, null, CoreTheme.b(composerImplV).e.d.c.b, null, 3, 0, false, 0, null, composerImplV, i2 & 14, 980);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a(str, modifier, i, 3, (byte) 0);
        }
    }

    public static final void g(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        ComposerImpl composerImplV = composer.v(2107077006);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierE = SizeKt.e(modifier, 1.0f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.i(6, Alignment.Companion.k), Alignment.Companion.n, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            TextKt.a(str, CoreTheme.f(composerImplV).f5120a.f5121a.b, null, CoreTheme.b(composerImplV).e.d.c.b, null, 3, 0, false, 0, null, composerImplV, i2 & 14, 980);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.quantitystepper.a(str, modifier, i, 4, (byte) 0);
        }
    }

    public static final void h(int i, int i2, Composer composer, Modifier modifier) {
        ComposerImpl composerImplV = composer.v(-1732771692);
        int i3 = (composerImplV.r(i) ? 4 : 2) | i2 | (composerImplV.n(modifier) ? 32 : 16);
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            TextKt.a(StringResources_androidKt.c(composerImplV, i), CoreTheme.f(composerImplV).f5120a.b.f5123a, modifier, CoreTheme.b(composerImplV).e.d.c.b, null, 3, 0, false, 0, null, composerImplV, (i3 << 3) & 896, 976);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.recipes.details.ui.a(i, modifier, i2, 3);
        }
    }
}
