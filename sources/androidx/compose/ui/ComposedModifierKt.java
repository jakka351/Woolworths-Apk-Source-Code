package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposedModifierKt {
    public static final Modifier a(Modifier modifier, Function1 function1, Function3 function3) {
        return modifier.x0(new ComposedModifier(function1, function3));
    }

    public static final Modifier c(final Composer composer, Modifier modifier) {
        if (modifier.y(ComposedModifierKt$materializeImpl$1.h)) {
            return modifier;
        }
        composer.F(1219399079);
        Modifier modifier2 = (Modifier) modifier.w(Modifier.Companion.d, new Function2<Modifier, Modifier.Element, Modifier>() { // from class: androidx.compose.ui.ComposedModifierKt$materializeImpl$result$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Modifier modifier3 = (Modifier) obj;
                Modifier modifierC = (Modifier.Element) obj2;
                if (modifierC instanceof ComposedModifier) {
                    Function3 function3 = ((ComposedModifier) modifierC).e;
                    TypeIntrinsics.d(3, function3);
                    Modifier.Companion companion = Modifier.Companion.d;
                    Composer composer2 = composer;
                    modifierC = ComposedModifierKt.c(composer2, (Modifier) function3.invoke(companion, composer2, 0));
                }
                return modifier3.x0(modifierC);
            }
        });
        composer.N();
        return modifier2;
    }

    public static final Modifier d(Composer composer, Modifier modifier) {
        composer.o(439770924);
        Modifier modifierC = c(composer, modifier);
        composer.l();
        return modifierC;
    }
}
