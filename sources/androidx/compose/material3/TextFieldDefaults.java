package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldDefaults f1515a = new TextFieldDefaults();
    public static final float b = 56;
    public static final float c = 280;
    public static final float d = 1;
    public static final float e = 2;

    public static PaddingValuesImpl b() {
        float f = TextFieldImplKt.b;
        return new PaddingValuesImpl(f, TextFieldImplKt.d, f, 0);
    }

    public final void a(final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final Shape shape, Composer composer, final int i) {
        int i2;
        final TextFieldDefaults textFieldDefaults;
        ComposerImpl composerImplV = composer.v(-818661242);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(interactionSource) ? 256 : 128;
        }
        int i3 = i & 3072;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i3 == 0) {
            i2 |= composerImplV.n(companion) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(textFieldColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(shape) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.q(e) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.q(d) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            textFieldDefaults = this;
            i2 |= composerImplV.n(textFieldDefaults) ? 67108864 : 33554432;
        } else {
            textFieldDefaults = this;
        }
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            BoxKt.a(ComposedModifierKt.a(TextFieldImplKt.g(companion, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new TextFieldDefaults$Container$1(SingleValueAnimationKt.b(!z ? textFieldColors.g : z2 ? textFieldColors.h : ((Boolean) FocusInteractionKt.a(interactionSource, composerImplV, (i2 >> 6) & 14).getD()).booleanValue() ? textFieldColors.e : textFieldColors.f, AnimationSpecKt.e(150, 0, null, 6), null, composerImplV, 48, 12), State.class, "value", "getValue()Ljava/lang/Object;", 0)), shape), InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f1515a;
                    TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f1515a;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    composer2.o(-891038934);
                    final MutableState mutableStateD = TextFieldImplKt.d(z, z2, ((Boolean) FocusInteractionKt.a(interactionSource, composer2, 0).getD()).booleanValue(), textFieldColors, TextFieldDefaults.e, TextFieldDefaults.d, composer2, 0);
                    float f = TextFieldKt.f1516a;
                    Modifier modifierD = DrawModifierKt.d(Modifier.Companion.d, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TextFieldKt$drawIndicatorLine$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            ContentDrawScope contentDrawScope = (ContentDrawScope) obj4;
                            contentDrawScope.Q0();
                            MutableState mutableState = mutableStateD;
                            float fT1 = contentDrawScope.T1(((BorderStroke) mutableState.getD()).f828a);
                            float fB = Size.b(contentDrawScope.h()) - (fT1 / 2);
                            contentDrawScope.m1(((BorderStroke) mutableState.getD()).b, OffsetKt.a(BitmapDescriptorFactory.HUE_RED, fB), OffsetKt.a(Size.d(contentDrawScope.h()), fB), fT1, (496 & 16) != 0 ? 0 : 0, (496 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                            return Unit.f24250a;
                        }
                    });
                    composer2.l();
                    return modifierD;
                }
            }), composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(textFieldDefaults) { // from class: androidx.compose.material3.TextFieldDefaults$Container$2
                public final /* synthetic */ TextFieldDefaults h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f1515a;
                    TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f1515a;
                    this.h = textFieldDefaults;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    ((Number) obj2).intValue();
                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f1515a;
                    TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f1515a;
                    this.h.a(z, z2, interactionSource, textFieldColors, shape, composer2, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
