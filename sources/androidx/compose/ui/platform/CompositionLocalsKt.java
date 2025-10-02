package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f1964a = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalAccessibilityManager$1.h);
    public static final StaticProvidableCompositionLocal b = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalAutofill$1.h);
    public static final StaticProvidableCompositionLocal c = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalAutofillTree$1.h);
    public static final StaticProvidableCompositionLocal d = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalAutofillManager$1.h);
    public static final StaticProvidableCompositionLocal e = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalClipboardManager$1.h);
    public static final StaticProvidableCompositionLocal f = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalClipboard$1.h);
    public static final StaticProvidableCompositionLocal g = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalGraphicsContext$1.h);
    public static final StaticProvidableCompositionLocal h = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalDensity$1.h);
    public static final StaticProvidableCompositionLocal i = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalFocusManager$1.h);
    public static final StaticProvidableCompositionLocal j = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalFontLoader$1.h);
    public static final StaticProvidableCompositionLocal k = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalFontFamilyResolver$1.h);
    public static final StaticProvidableCompositionLocal l = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalHapticFeedback$1.h);
    public static final StaticProvidableCompositionLocal m = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalInputModeManager$1.h);
    public static final StaticProvidableCompositionLocal n = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalLayoutDirection$1.h);
    public static final StaticProvidableCompositionLocal o = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalTextInputService$1.h);
    public static final StaticProvidableCompositionLocal p = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalSoftwareKeyboardController$1.h);
    public static final StaticProvidableCompositionLocal q = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalTextToolbar$1.h);
    public static final StaticProvidableCompositionLocal r = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalUriHandler$1.h);
    public static final StaticProvidableCompositionLocal s = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalViewConfiguration$1.h);
    public static final StaticProvidableCompositionLocal t = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalWindowInfo$1.h);
    public static final StaticProvidableCompositionLocal u = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalPointerIconService$1.h);
    public static final DynamicProvidableCompositionLocal v = new DynamicProvidableCompositionLocal(CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1.h);
    public static final StaticProvidableCompositionLocal w = new StaticProvidableCompositionLocal(CompositionLocalsKt$LocalCursorBlinkEnabled$1.h);

    public static final void a(final Owner owner, final UriHandler uriHandler, final Function2 function2, Composer composer, final int i2) {
        ComposerImpl composerImplV = composer.v(874662829);
        int i3 = (composerImplV.n(owner) ? 4 : 2) | i2 | (composerImplV.n(uriHandler) ? 32 : 16) | (composerImplV.I(function2) ? 256 : 128);
        if (composerImplV.z(i3 & 1, (i3 & 147) != 146)) {
            ProvidedValue providedValueB = f1964a.b(owner.getAccessibilityManager());
            ProvidedValue providedValueB2 = b.b(owner.getAutofill());
            ProvidedValue providedValueB3 = d.b(owner.getAutofillManager());
            ProvidedValue providedValueB4 = c.b(owner.getAutofillTree());
            ProvidedValue providedValueB5 = e.b(owner.getClipboardManager());
            ProvidedValue providedValueB6 = f.b(owner.getClipboard());
            ProvidedValue providedValueB7 = h.b(owner.getDensity());
            ProvidedValue providedValueB8 = i.b(owner.getFocusOwner());
            ProvidedValue providedValueB9 = j.b(owner.getFontLoader());
            providedValueB9.h = false;
            ProvidedValue providedValueB10 = k.b(owner.getFontFamilyResolver());
            providedValueB10.h = false;
            CompositionLocalKt.b(new ProvidedValue[]{providedValueB, providedValueB2, providedValueB3, providedValueB4, providedValueB5, providedValueB6, providedValueB7, providedValueB8, providedValueB9, providedValueB10, l.b(owner.getHapticFeedBack()), m.b(owner.getInputModeManager()), n.b(owner.getLayoutDirection()), o.b(owner.getTextInputService()), p.b(owner.getSoftwareKeyboardController()), q.b(owner.getTextToolbar()), r.b(uriHandler), s.b(owner.getViewConfiguration()), t.b(owner.getWindowInfo()), u.b(owner.getPointerIconService()), g.b(owner.getGraphicsContext())}, function2, composerImplV, ((i3 >> 3) & 112) | 8);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(uriHandler, function2, i2) { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                public final /* synthetic */ UriHandler i;
                public final /* synthetic */ Function2 j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    CompositionLocalsKt.a(this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
