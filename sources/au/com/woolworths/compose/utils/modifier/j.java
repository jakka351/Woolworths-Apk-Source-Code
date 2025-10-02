package au.com.woolworths.compose.utils.modifier;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                VisibilityModifier visibilityModifier = (VisibilityModifier) this.e;
                Placeable placeable = (Placeable) this.f;
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout, "$this$layout");
                if (((Boolean) visibilityModifier.d.invoke()).booleanValue()) {
                    layout.e(placeable, 0, 0, BitmapDescriptorFactory.HUE_RED);
                }
                return Unit.f24250a;
            case 1:
                ArrayList arrayList = (ArrayList) this.f;
                Placeable.PlacementScope layout2 = (Placeable.PlacementScope) obj;
                Intrinsics.h(layout2, "$this$layout");
                Iterator it = ((Iterable) this.e).iterator();
                while (it.hasNext()) {
                    layout2.e((Placeable) it.next(), 0, 0, BitmapDescriptorFactory.HUE_RED);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    layout2.e((Placeable) it2.next(), 0, 0, BitmapDescriptorFactory.HUE_RED);
                }
                return Unit.f24250a;
            default:
                final LifecycleOwner lifecycleOwner = (LifecycleOwner) this.e;
                MutableState mutableState = (MutableState) this.f;
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.h(DisposableEffect, "$this$DisposableEffect");
                final o oVar = new o(mutableState, 0);
                lifecycleOwner.getD().a(oVar);
                return new DisposableEffectResult() { // from class: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$waveBackground$1$invoke$lambda$17$lambda$16$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        lifecycleOwner.getD().c(oVar);
                    }
                };
        }
    }
}
