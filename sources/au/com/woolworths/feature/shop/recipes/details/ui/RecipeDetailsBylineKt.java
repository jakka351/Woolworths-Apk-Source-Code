package au.com.woolworths.feature.shop.recipes.details.ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.shop.model.recipes.RecipeBylineData;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "showBylineImage", "recipe-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RecipeDetailsBylineKt {
    public static final void a(RecipeBylineData recipeBylineData, Modifier modifier, Composer composer, int i) {
        Intrinsics.h(recipeBylineData, "recipeBylineData");
        ComposerImpl composerImplV = composer.v(-1766211542);
        if ((((composerImplV.I(recipeBylineData) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = SnapshotStateKt.f(Boolean.TRUE);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            composerImplV.V(false);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composerImplV, 54);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(1252408728);
            boolean zBooleanValue = ((Boolean) mutableState.getD()).booleanValue();
            Modifier.Companion companion = Modifier.Companion.d;
            if (zBooleanValue && recipeBylineData.getImage() != null) {
                ImageRequest.Builder builder = new ImageRequest.Builder(context);
                builder.c = recipeBylineData.getImage();
                ImageRequests_androidKt.d(builder, R.drawable.ic_product_image_loading);
                builder.e = new ImageRequest.Listener() { // from class: au.com.woolworths.feature.shop.recipes.details.ui.RecipeDetailsBylineKt$RecipeDetailsByline$lambda$5$$inlined$listener$default$1
                    @Override // coil3.request.ImageRequest.Listener
                    public final void a() {
                        mutableState.setValue(Boolean.FALSE);
                    }

                    @Override // coil3.request.ImageRequest.Listener
                    public final void onCancel() {
                        mutableState.setValue(Boolean.FALSE);
                    }

                    @Override // coil3.request.ImageRequest.Listener
                    public final void onStart() {
                    }

                    @Override // coil3.request.ImageRequest.Listener
                    public final void onSuccess() {
                    }
                };
                SingletonAsyncImageKt.a(builder.a(), null, SizeKt.q(companion, 32), null, ContentScale.Companion.f1880a, composerImplV, 1573296, 1976);
            }
            composerImplV.V(false);
            TextKt.b(recipeBylineData.getTitle(), PaddingKt.j(companion, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), 0L, 0L, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).n, composerImplV, 48, 0, 65020);
            composerImplV = composerImplV;
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.receipt.details.compose.a(recipeBylineData, i, 21, modifier);
        }
    }
}
