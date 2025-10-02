package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f1518a = new DynamicProvidableCompositionLocal(TextKt$LocalTextStyle$1.h);

    public static final void a(final TextStyle textStyle, final Function2 function2, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-460300127);
        int i2 = (composerImplV.n(textStyle) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f1518a;
            CompositionLocalKt.a(dynamicProvidableCompositionLocal.b(((TextStyle) composerImplV.x(dynamicProvidableCompositionLocal)).d(textStyle)), function2, composerImplV, (i2 & 112) | 8);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$ProvideTextStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TextKt.a(textStyle, function2, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r40, androidx.compose.ui.Modifier r41, long r42, long r44, androidx.compose.ui.text.font.FontStyle r46, androidx.compose.ui.text.font.FontWeight r47, androidx.compose.ui.text.font.FontFamily r48, long r49, androidx.compose.ui.text.style.TextDecoration r51, androidx.compose.ui.text.style.TextAlign r52, long r53, int r55, boolean r56, int r57, int r58, kotlin.jvm.functions.Function1 r59, androidx.compose.ui.text.TextStyle r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.b(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
