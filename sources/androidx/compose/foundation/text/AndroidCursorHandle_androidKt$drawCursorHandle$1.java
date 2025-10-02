package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AndroidCursorHandle_androidKt$drawCursorHandle$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public static final AndroidCursorHandle_androidKt$drawCursorHandle$1 h = new AndroidCursorHandle_androidKt$drawCursorHandle$1(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-2126899193);
        final long j = ((TextSelectionColors) composer.x(TextSelectionColorsKt.f1228a)).f1227a;
        boolean zS = composer.s(j);
        Object objG = composer.G();
        if (zS || objG == Composer.Companion.f1624a) {
            objG = new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    CacheDrawScope cacheDrawScope = (CacheDrawScope) obj4;
                    final float fIntBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.d.h() >> 32)) / 2.0f;
                    final ImageBitmap imageBitmapD = AndroidSelectionHandles_androidKt.d(cacheDrawScope, fIntBitsToFloat);
                    final BlendModeColorFilter blendModeColorFilterA = ColorFilter.Companion.a(j);
                    return cacheDrawScope.n(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.AndroidCursorHandle_androidKt$drawCursorHandle$1$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ContentDrawScope contentDrawScope = (ContentDrawScope) obj5;
                            contentDrawScope.Q0();
                            float f = fIntBitsToFloat;
                            ImageBitmap imageBitmap = imageBitmapD;
                            BlendModeColorFilter blendModeColorFilter = blendModeColorFilterA;
                            CanvasDrawScope$drawContext$1 e = contentDrawScope.getE();
                            long jD = e.d();
                            e.a().save();
                            try {
                                CanvasDrawScopeKt$asDrawTransform$1 canvasDrawScopeKt$asDrawTransform$1 = e.f1798a;
                                canvasDrawScopeKt$asDrawTransform$1.f(f, BitmapDescriptorFactory.HUE_RED);
                                canvasDrawScopeKt$asDrawTransform$1.d(0L, 45.0f);
                                DrawScope.U0(contentDrawScope, imageBitmap, blendModeColorFilter, 46);
                                b.C(e, jD);
                                return Unit.f24250a;
                            } catch (Throwable th) {
                                b.C(e, jD);
                                throw th;
                            }
                        }
                    });
                }
            };
            composer.A(objG);
        }
        Modifier modifierX0 = modifier.x0(DrawModifierKt.c(Modifier.Companion.d, (Function1) objG));
        composer.l();
        return modifierX0;
    }
}
