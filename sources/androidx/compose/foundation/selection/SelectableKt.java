package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SelectableKt {
    public static final Modifier a(Modifier modifier, final boolean z, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final Role role, final Function0 function0) {
        Modifier modifierX0;
        if (indication instanceof IndicationNodeFactory) {
            modifierX0 = new SelectableElement(z, mutableInteractionSource, (IndicationNodeFactory) indication, z2, role, function0);
        } else if (indication == null) {
            modifierX0 = new SelectableElement(z, mutableInteractionSource, null, z2, role, function0);
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            modifierX0 = mutableInteractionSource != null ? IndicationKt.a(companion, mutableInteractionSource, indication).x0(new SelectableElement(z, mutableInteractionSource, null, z2, role, function0)) : ComposedModifierKt.a(companion, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer = (Composer) obj2;
                    ((Number) obj3).intValue();
                    composer.o(-1525724089);
                    Object objG = composer.G();
                    if (objG == Composer.Companion.f1624a) {
                        objG = InteractionSourceKt.a();
                        composer.A(objG);
                    }
                    MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objG;
                    Modifier modifierX02 = IndicationKt.a(Modifier.Companion.d, mutableInteractionSource2, indication).x0(new SelectableElement(z, mutableInteractionSource2, null, z2, role, function0));
                    composer.l();
                    return modifierX02;
                }
            });
        }
        return modifier.x0(modifierX0);
    }

    public static Modifier b(Modifier modifier, final boolean z, final boolean z2, final Function0 function0) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MutableInteractionSource mutableInteractionSource;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(-2124609672);
                Indication indication = (Indication) composer.x(IndicationKt.f838a);
                if (indication instanceof IndicationNodeFactory) {
                    composer.o(-1412174474);
                    composer.l();
                    mutableInteractionSource = null;
                } else {
                    composer.o(-1412041856);
                    Object objG = composer.G();
                    if (objG == Composer.Companion.f1624a) {
                        objG = InteractionSourceKt.a();
                        composer.A(objG);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objG;
                    composer.l();
                }
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                Modifier modifierA = SelectableKt.a(Modifier.Companion.d, z, mutableInteractionSource2, indication, z2, null, function0);
                composer.l();
                return modifierA;
            }
        });
    }
}
