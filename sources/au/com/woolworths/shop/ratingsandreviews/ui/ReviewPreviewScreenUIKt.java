package au.com.woolworths.shop.ratingsandreviews.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.button.TertiaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewCardData;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewCardKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ratingsandreviews-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ReviewPreviewScreenUIKt {
    public static final void a(ArrayList arrayList, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(2021114234);
        if ((((composerImplV.I(arrayList) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            modifier2 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier2);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-842063098);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ReviewCardData reviewCardData = (ReviewCardData) it.next();
                ReviewCardKt.b(reviewCardData.f12788a, reviewCardData.b, reviewCardData.d, reviewCardData.e, reviewCardData.f, reviewCardData.g, reviewCardData.h, null, reviewCardData.c, composerImplV, 0);
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, CoreTheme.b(composerImplV).e.b.e, composerImplV, PaddingKt.h(modifier2, 16, BitmapDescriptorFactory.HUE_RED, 2));
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.productcard.ui.components.b(arrayList, i, 5, modifier2);
        }
    }

    public static final void b(String label, String str, Function0 onWriteReviewClicked, Function0 onRatingsAndReviewsClicked, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(label, "label");
        Intrinsics.h(onWriteReviewClicked, "onWriteReviewClicked");
        Intrinsics.h(onRatingsAndReviewsClicked, "onRatingsAndReviewsClicked");
        ComposerImpl composerImplV = composer.v(764358944);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onWriteReviewClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onRatingsAndReviewsClicked) ? 2048 : 1024;
        }
        if ((i2 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1746271574);
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.product.details.ui.b(str, onRatingsAndReviewsClicked, onWriteReviewClicked, 2);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            TertiaryButtonKt.a(label, (Function0) objG, modifier, false, null, null, null, composerImplV, (i2 & 14) | KyberEngine.KyberPolyBytes, 248);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0(label, str, onWriteReviewClicked, onRatingsAndReviewsClicked, modifier, i, 25);
        }
    }
}
