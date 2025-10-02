package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import com.dynatrace.android.compose.ClickableComposeCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ClickableKt {
    public static final Modifier a(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final String str, final Role role, Function0 function0) {
        Modifier modifierA;
        Function0 clickableComposeCallback = function0 != null ? new ClickableComposeCallback(role, function0) : function0;
        if (indication instanceof IndicationNodeFactory) {
            modifierA = new ClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z, str, role, clickableComposeCallback);
        } else if (indication == null) {
            modifierA = new ClickableElement(mutableInteractionSource, null, z, str, role, clickableComposeCallback);
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            if (mutableInteractionSource != null) {
                modifierA = IndicationKt.a(companion, mutableInteractionSource, indication).x0(new ClickableElement(mutableInteractionSource, null, z, str, role, clickableComposeCallback));
            } else {
                final Function0 function02 = clickableComposeCallback;
                modifierA = ComposedModifierKt.a(companion, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                        Modifier modifierX0 = IndicationKt.a(Modifier.Companion.d, mutableInteractionSource2, indication).x0(new ClickableElement(mutableInteractionSource2, null, z, str, role, function02));
                        composer.l();
                        return modifierX0;
                    }
                });
            }
        }
        return modifier.x0(modifierA);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, Function0 function0, int i) {
        Role role2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        Function0 function02;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        String str2 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            role2 = null;
            mutableInteractionSource2 = mutableInteractionSource;
            indication2 = indication;
            function02 = function0;
            modifier2 = modifier;
        } else {
            role2 = role;
            modifier2 = modifier;
            mutableInteractionSource2 = mutableInteractionSource;
            indication2 = indication;
            function02 = function0;
        }
        return a(modifier2, mutableInteractionSource2, indication2, z2, str2, role2, function02);
    }

    public static final Modifier c(Modifier modifier, final boolean z, final String str, final Role role, final Function0 function0) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MutableInteractionSource mutableInteractionSource;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(-756081143);
                Indication indication = (Indication) composer.x(IndicationKt.f838a);
                if (indication instanceof IndicationNodeFactory) {
                    composer.o(617653824);
                    composer.l();
                    mutableInteractionSource = null;
                } else {
                    composer.o(617786442);
                    Object objG = composer.G();
                    if (objG == Composer.Companion.f1624a) {
                        objG = InteractionSourceKt.a();
                        composer.A(objG);
                    }
                    mutableInteractionSource = (MutableInteractionSource) objG;
                    composer.l();
                }
                MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                Modifier modifierA = ClickableKt.a(Modifier.Companion.d, mutableInteractionSource2, indication, z, str, role, function0);
                composer.l();
                return modifierA;
            }
        });
    }

    public static /* synthetic */ Modifier d(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            role = null;
        }
        return c(modifier, z, str, role, function0);
    }

    public static final Modifier e(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final boolean z2, final Function0 function0) {
        Modifier modifierX0;
        if (indication instanceof IndicationNodeFactory) {
            modifierX0 = new CombinedClickableElement((IndicationNodeFactory) indication, mutableInteractionSource, function0, z, z2);
        } else if (indication == null) {
            modifierX0 = new CombinedClickableElement(null, mutableInteractionSource, function0, z, z2);
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            modifierX0 = mutableInteractionSource != null ? IndicationKt.a(companion, mutableInteractionSource, indication).x0(new CombinedClickableElement(null, mutableInteractionSource, function0, z, z2)) : ComposedModifierKt.a(companion, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier modifierX02 = IndicationKt.a(Modifier.Companion.d, mutableInteractionSource2, indication).x0(new CombinedClickableElement(null, mutableInteractionSource2, function0, z, z2));
                    composer.l();
                    return modifierX02;
                }
            });
        }
        return modifier.x0(modifierX0);
    }

    public static final boolean f(KeyEvent keyEvent) {
        long jA = KeyEvent_androidKt.a(keyEvent);
        int i = Key.p;
        if (Key.a(jA, Key.Companion.b()) ? true : Key.a(jA, Key.Companion.g()) ? true : Key.a(jA, Key.Companion.i())) {
            return true;
        }
        return Key.a(jA, Key.Companion.l());
    }
}
