package au.com.woolworths.shop.lists.ui.shoppinglist.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.lists.ui.shoppinglist.compose.ComposableSingletons$AddNewListItemUiKt$lambda$-2015808666$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$AddNewListItemUiKt$lambda$2015808666$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AddNewListItemUiKt$lambda$2015808666$1 d = new ComposableSingletons$AddNewListItemUiKt$lambda$2015808666$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer, 48);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composer, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            if (composer.w() == null) {
                ComposablesKt.b();
                throw null;
            }
            composer.i();
            if (composer.getO()) {
                composer.K(function0);
            } else {
                composer.e();
            }
            Updater.b(composer, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function2);
            }
            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
            IconKt.b(AddKt.a(), null, PaddingKt.j(companion, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), WxTheme.a(composer).h(), composer, 432, 0);
            TextKt.b(StringResources_androidKt.c(composer, R.string.shop_lists_add_to_list_button), PaddingKt.j(companion, 18, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), ToneColors.g, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composer).l, composer, 48, 0, 65528);
            composer.f();
        }
        return Unit.f24250a;
    }
}
