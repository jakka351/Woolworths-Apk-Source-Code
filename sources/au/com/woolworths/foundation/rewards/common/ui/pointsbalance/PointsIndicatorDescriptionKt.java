package au.com.woolworths.foundation.rewards.common.ui.pointsbalance;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import au.com.woolworths.compose.utils.text.StyledAnnotatedString;
import au.com.woolworths.design.core.ui.component.stable.f;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyle;
import au.com.woolworths.foundation.rewards.common.ui.home.HomepageStyleKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "alpha", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedText", "common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PointsIndicatorDescriptionKt {
    public static final void a(final String str, Modifier modifier, final List list, boolean z, final boolean z2, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-1858112450);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(list) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i3 | 3072;
            z3 = z;
        } else {
            z3 = z;
            i4 = i3 | (composerImplV.p(z3) ? 2048 : 1024);
        }
        if ((i4 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.d;
            }
            final Modifier modifier3 = modifier;
            final boolean z4 = i6 != 0 ? true : z3;
            ThemeKt.a(48, composerImplV, ComposableLambdaKt.c(-1966990645, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.pointsbalance.PointsIndicatorDescriptionKt$PointsIndicatorDescription$1

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f8597a;

                    static {
                        int[] iArr = new int[HomepageStyle.values().length];
                        try {
                            HomepageStyle homepageStyle = HomepageStyle.d;
                            iArr[1] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f8597a = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    long jH;
                    TextStyle textStyle;
                    Unit unit;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    Unit unit2 = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit2;
                    }
                    int i7 = 0;
                    State stateB = AnimateAsStateKt.b(z4 ? 1.0f : BitmapDescriptorFactory.HUE_RED, AnimationSpecKt.e(0, 0, EasingKt.d, 3), "alpha", null, composer2, 3072, 20);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = HomepageStyleKt.f8583a;
                    HomepageStyle homepageStyle = (HomepageStyle) composer2.x(staticProvidableCompositionLocal);
                    int[] iArr = WhenMappings.f8597a;
                    if (iArr[homepageStyle.ordinal()] == 1) {
                        composer2.o(-492389573);
                        jH = WxTheme.a(composer2).f();
                        composer2.l();
                    } else {
                        composer2.o(-492387758);
                        jH = WxTheme.a(composer2).h();
                        composer2.l();
                    }
                    long j = jH;
                    if (iArr[((HomepageStyle) composer2.x(staticProvidableCompositionLocal)).ordinal()] == 1) {
                        composer2.o(-492383345);
                        textStyle = WxTheme.b(composer2).n;
                        composer2.l();
                    } else {
                        composer2.o(-492381934);
                        textStyle = WxTheme.b(composer2).r;
                        composer2.l();
                    }
                    TextStyle textStyle2 = textStyle;
                    SpanStyle spanStyle = new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65534);
                    composer2.o(-1633490746);
                    String str2 = str;
                    boolean zN = composer2.n(str2);
                    List list2 = list;
                    boolean zN2 = zN | composer2.n(list2);
                    Object objG = composer2.G();
                    if (zN2 || objG == Composer.Companion.f1624a) {
                        Regex regex = StyledAnnotatedString.f4716a;
                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                        do {
                            MatchResult matchResultB = StyledAnnotatedString.f4716a.b(i7, str2);
                            if (matchResultB != null) {
                                String strSubstring = str2.substring(i7, matchResultB.d().d);
                                Intrinsics.g(strSubstring, "substring(...)");
                                builder.e(strSubstring);
                                int iL = builder.l(spanStyle);
                                try {
                                    int i8 = Integer.parseInt(StringsKt.O(matchResultB.getValue(), "{", "}"));
                                    builder.e((String) ((i8 < 0 || i8 >= list2.size()) ? "" : list2.get(i8)));
                                    builder.i(iL);
                                    i7 = matchResultB.d().e + 1;
                                    unit = unit2;
                                } catch (Throwable th) {
                                    builder.i(iL);
                                    throw th;
                                }
                            } else {
                                unit = null;
                            }
                        } while (unit != null);
                        if (i7 < str2.length()) {
                            String strSubstring2 = str2.substring(i7, str2.length());
                            Intrinsics.g(strSubstring2, "substring(...)");
                            builder.e(strSubstring2);
                        }
                        objG = SnapshotStateKt.f(builder.m());
                        composer2.A(objG);
                    }
                    MutableState mutableState = (MutableState) objG;
                    composer2.l();
                    boolean z5 = z2;
                    Modifier modifierA = modifier3;
                    if (z5) {
                        modifierA = AlphaKt.a(modifierA, ((Number) stateB.getD()).floatValue());
                    }
                    TextKt.c((AnnotatedString) mutableState.getD(), modifierA, WxTheme.a(composer2).f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, textStyle2, composer2, 0, 0, 131064);
                    return unit2;
                }
            }, composerImplV));
            z3 = z4;
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new f(str, modifier2, list, z3, z2, i, i2);
        }
    }
}
