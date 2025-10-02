package au.com.woolworths.foundation.barcode.ui;

import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.feature.rewards.offers.listpage.ui.e;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import au.com.woolworths.foundation.barcode.encoder.BarcodeTypeKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonAsyncImagePainterKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.BarcodeFormat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "encodingFailed", "barcode-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeUiKt {
    public static final void a(final String content, Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Modifier modifier2;
        BarcodeType barcodeType = BarcodeType.d;
        Intrinsics.h(content, "content");
        ComposerImpl composerImplV = composer.v(-867054320);
        if ((((composerImplV.n(content) ? 4 : 2) | i) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            BoxWithConstraintsKt.a(modifier2, Alignment.Companion.e, false, ComposableLambdaKt.c(-283408134, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.barcode.ui.BarcodeUiKt$BarcodeUi$1
                {
                    BarcodeType barcodeType2 = BarcodeType.d;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(BoxWithConstraints) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        Object obj4 = Composer.Companion.f1624a;
                        if (objG == obj4) {
                            objG = SnapshotStateKt.f(Boolean.FALSE);
                            composer2.A(objG);
                        }
                        MutableState mutableState = (MutableState) objG;
                        composer2.l();
                        if (((Boolean) mutableState.getD()).booleanValue()) {
                            composer2.o(894469993);
                            composableLambdaImpl.invoke(BoxWithConstraints, composer2, Integer.valueOf(iIntValue & 14));
                            composer2.l();
                        } else {
                            composer2.o(894092134);
                            BarcodeType barcodeType2 = BarcodeType.e;
                            float f = BoxWithConstraints.f();
                            float fH = BoxWithConstraints.h();
                            composer2.o(5004770);
                            Object objG2 = composer2.G();
                            if (objG2 == obj4) {
                                objG2 = new e(mutableState, 8);
                                composer2.A(objG2);
                            }
                            Function0 onEncodingFailed = (Function0) objG2;
                            composer2.l();
                            String content2 = content;
                            Intrinsics.h(content2, "content");
                            Intrinsics.h(onEncodingFailed, "onEncodingFailed");
                            composer2.o(-1906520197);
                            composer2.o(5004770);
                            boolean zR = composer2.r(1);
                            Object objG3 = composer2.G();
                            if (zR || objG3 == obj4) {
                                objG3 = BarcodeTypeKt.a(barcodeType2);
                                composer2.A(objG3);
                            }
                            BarcodeFormat barcodeFormat = (BarcodeFormat) objG3;
                            Object objE = au.com.woolworths.android.onesite.a.e(composer2, 1849434622);
                            if (objE == obj4) {
                                objE = SnapshotStateKt.f(null);
                                composer2.A(objE);
                            }
                            MutableState mutableState2 = (MutableState) objE;
                            composer2.l();
                            CompositionLocal compositionLocal = CompositionLocalsKt.h;
                            int iT1 = (int) ((Density) composer2.x(compositionLocal)).T1(f);
                            int iT12 = (int) ((Density) composer2.x(compositionLocal)).T1(fH);
                            MutableState mutableStateL = SnapshotStateKt.l(onEncodingFailed, composer2);
                            boolean zBooleanValue = ((Boolean) composer2.x(InspectionModeKt.f1972a)).booleanValue();
                            Object[] objArr = {content2, barcodeFormat, Integer.valueOf(iT1), Integer.valueOf(iT12)};
                            composer2.o(-1224400529);
                            boolean zP = composer2.p(zBooleanValue) | composer2.n(mutableStateL) | composer2.n(content2) | composer2.r(barcodeFormat.ordinal()) | composer2.r(iT1) | composer2.r(iT12);
                            Object objG4 = composer2.G();
                            if (zP || objG4 == obj4) {
                                Object barcodePainterKt$rememberBarcodePainter$1$1 = new BarcodePainterKt$rememberBarcodePainter$1$1(zBooleanValue, mutableStateL, content2, barcodeFormat, iT1, iT12, mutableState2, null);
                                composer2.A(barcodePainterKt$rememberBarcodePainter$1$1);
                                objG4 = barcodePainterKt$rememberBarcodePainter$1$1;
                            }
                            composer2.l();
                            EffectsKt.g(objArr, (Function2) objG4, composer2);
                            AsyncImagePainter asyncImagePainterA = SingletonAsyncImagePainterKt.a(0, composer2, (Bitmap) mutableState2.getD());
                            composer2.l();
                            ImageKt.a(asyncImagePainterA, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composer2, 48, 124);
                            composer2.l();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 3126, 4);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(content, modifier2, composableLambdaImpl, i);
        }
    }
}
