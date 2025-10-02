package androidx.compose.material3.internal;

import androidx.camera.core.impl.b;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "showPlaceholder", "showPrefixSuffix", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldImplKt {
    public static final float b;
    public static final float g;
    public static final float h;
    public static final Modifier i;

    /* renamed from: a, reason: collision with root package name */
    public static final long f1563a = ConstraintsKt.a(0, 0, 0, 0);
    public static final float c = 12;
    public static final float d = 4;
    public static final float e = 2;
    public static final float f = 24;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1564a;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f1564a = iArr2;
        }
    }

    static {
        float f2 = 16;
        b = f2;
        g = f2;
        h = f2;
        float f3 = 48;
        i = SizeKt.a(Modifier.Companion.d, f3, f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x042a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x074f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.material3.internal.TextFieldType r42, final java.lang.String r43, final kotlin.jvm.functions.Function2 r44, final androidx.compose.ui.text.input.VisualTransformation r45, final kotlin.jvm.functions.Function2 r46, final kotlin.jvm.functions.Function2 r47, kotlin.jvm.functions.Function2 r48, final kotlin.jvm.functions.Function2 r49, final kotlin.jvm.functions.Function2 r50, final kotlin.jvm.functions.Function2 r51, final kotlin.jvm.functions.Function2 r52, final boolean r53, final boolean r54, final boolean r55, final androidx.compose.foundation.interaction.InteractionSource r56, final androidx.compose.foundation.layout.PaddingValues r57, androidx.compose.material3.TextFieldColors r58, kotlin.jvm.functions.Function2 r59, androidx.compose.runtime.Composer r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.a(androidx.compose.material3.internal.TextFieldType, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(long j, TextStyle textStyle, Function2 function2, Composer composer, final int i2) {
        int i3;
        final long j2;
        final TextStyle textStyle2;
        final Function2 function22;
        ComposerImpl composerImplV = composer.v(1208685580);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.s(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.n(textStyle) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function2) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function22 = function2;
            textStyle2 = textStyle;
            j2 = j;
        } else {
            ProvideContentColorTextStyleKt.a(j, textStyle, function2, composerImplV, i3 & 1022);
            j2 = j;
            textStyle2 = textStyle;
            function22 = function2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    TextFieldImplKt.b(j2, textStyle2, function22, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final long j, final Function2 function2, Composer composer, final int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(660142980);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.s(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CompositionLocalKt.a(b.g(j, ContentColorKt.f1427a), function2, composerImplV, (i3 & 112) | 8);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i2 | 1);
                    TextFieldImplKt.c(j, function2, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final MutableState d(boolean z, boolean z2, boolean z3, TextFieldColors textFieldColors, float f2, float f3, Composer composer, int i2) {
        State stateL;
        State stateL2;
        long j = !z ? textFieldColors.n : z2 ? textFieldColors.o : z3 ? textFieldColors.l : textFieldColors.m;
        if (z) {
            composer.o(1023053998);
            stateL = SingleValueAnimationKt.b(j, AnimationSpecKt.e(150, 0, null, 6), null, composer, 48, 12);
            composer.l();
        } else {
            composer.o(1023165505);
            stateL = SnapshotStateKt.l(new Color(j), composer);
            composer.l();
        }
        State state = stateL;
        if (z) {
            composer.o(1023269417);
            stateL2 = AnimateAsStateKt.a(z3 ? f2 : f3, AnimationSpecKt.e(150, 0, null, 6), null, null, composer, 48, 12);
            composer.l();
        } else {
            composer.o(1023478388);
            stateL2 = SnapshotStateKt.l(new Dp(f3), composer);
            composer.l();
        }
        return SnapshotStateKt.l(BorderStrokeKt.a(((Color) state.getD()).f1766a, ((Dp) stateL2.getD()).d), composer);
    }

    public static final Modifier e(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.b(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$defaultErrorSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                ((SemanticsPropertyReceiver) obj).b(SemanticsProperties.J, str);
                return Unit.f24250a;
            }
        }) : modifier;
    }

    public static final Object f(IntrinsicMeasurable intrinsicMeasurable) {
        Object v = intrinsicMeasurable.getV();
        LayoutIdParentData layoutIdParentData = v instanceof LayoutIdParentData ? (LayoutIdParentData) v : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getF();
        }
        return null;
    }

    public static final Modifier g(Modifier modifier, final ColorProducer colorProducer, final Shape shape) {
        return DrawModifierKt.c(modifier, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj;
                final Outline outlineA = shape.a(cacheDrawScope.d.h(), cacheDrawScope.d.getLayoutDirection(), cacheDrawScope);
                final ColorProducer colorProducer2 = colorProducer;
                return cacheDrawScope.i(new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$textFieldBackground$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        OutlineKt.a((DrawScope) obj2, outlineA, colorProducer2.a());
                        return Unit.f24250a;
                    }
                });
            }
        });
    }
}
