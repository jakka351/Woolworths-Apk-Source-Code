package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ProvidableModifierLocal f986a = new ProvidableModifierLocal(WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1.h);

    public static final Modifier a(Modifier modifier, final PaddingValues paddingValues) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$4
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(114694318);
                PaddingValues paddingValues2 = paddingValues;
                boolean zN = composer.n(paddingValues2);
                Object objG = composer.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new PaddingValuesConsumingModifier(paddingValues2);
                    composer.A(objG);
                }
                PaddingValuesConsumingModifier paddingValuesConsumingModifier = (PaddingValuesConsumingModifier) objG;
                composer.l();
                return paddingValuesConsumingModifier;
            }
        });
    }

    public static final Modifier b(Modifier modifier, final WindowInsets windowInsets) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(788931215);
                WindowInsets windowInsets2 = windowInsets;
                boolean zN = composer.n(windowInsets2);
                Object objG = composer.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new UnionInsetsConsumingModifier(windowInsets2);
                    composer.A(objG);
                }
                UnionInsetsConsumingModifier unionInsetsConsumingModifier = (UnionInsetsConsumingModifier) objG;
                composer.l();
                return unionInsetsConsumingModifier;
            }
        });
    }

    public static final Modifier c(Modifier modifier, final Function1 function1) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(-1608161351);
                Function1 function12 = function1;
                boolean zN = composer.n(function12);
                Object objG = composer.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new ConsumedInsetsModifier(function12);
                    composer.A(objG);
                }
                ConsumedInsetsModifier consumedInsetsModifier = (ConsumedInsetsModifier) objG;
                composer.l();
                return consumedInsetsModifier;
            }
        });
    }

    public static final Modifier d(Modifier modifier, final WindowInsets windowInsets) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$2
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(-1415685722);
                WindowInsets windowInsets2 = windowInsets;
                boolean zN = composer.n(windowInsets2);
                Object objG = composer.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new InsetsPaddingModifier(windowInsets2);
                    composer.A(objG);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) objG;
                composer.l();
                return insetsPaddingModifier;
            }
        });
    }
}
