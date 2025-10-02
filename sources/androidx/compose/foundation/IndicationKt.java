package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class IndicationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f838a = new StaticProvidableCompositionLocal(IndicationKt$LocalIndication$1.h);

    public static final Modifier a(Modifier modifier, final InteractionSource interactionSource, final Indication indication) {
        return indication == null ? modifier : indication instanceof IndicationNodeFactory ? modifier.x0(new IndicationModifierElement(interactionSource, (IndicationNodeFactory) indication)) : ComposedModifierKt.a(modifier, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.IndicationKt$indication$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(-353972293);
                IndicationInstance indicationInstanceB = indication.b(interactionSource, composer);
                boolean zN = composer.n(indicationInstanceB);
                Object objG = composer.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new IndicationModifier(indicationInstanceB);
                    composer.A(objG);
                }
                IndicationModifier indicationModifier = (IndicationModifier) objG;
                composer.l();
                return indicationModifier;
            }
        });
    }
}
