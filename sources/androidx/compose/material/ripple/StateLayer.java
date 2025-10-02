package androidx.compose.material.ripple;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class StateLayer {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1392a;
    public final Function0 b;
    public final Animatable c = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
    public final ArrayList d = new ArrayList();
    public Interaction e;

    public StateLayer(boolean z, Function0 function0) {
        this.f1392a = z;
        this.b = function0;
    }

    public final void a(LayoutNodeDrawScope layoutNodeDrawScope, float f, long j) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        float fFloatValue = ((Number) this.c.f()).floatValue();
        if (fFloatValue > BitmapDescriptorFactory.HUE_RED) {
            long jB = Color.b(j, fFloatValue);
            if (!this.f1392a) {
                DrawScope.j0(layoutNodeDrawScope, jB, f, 0L, null, 0, 124);
                return;
            }
            float fD = Size.d(canvasDrawScope.h());
            float fB = Size.b(canvasDrawScope.h());
            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1 = canvasDrawScope.e;
            long jD = canvasDrawScope$drawContext$1.d();
            canvasDrawScope$drawContext$1.a().save();
            try {
                canvasDrawScope$drawContext$1.f1798a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fD, fB, 1);
                DrawScope.j0(layoutNodeDrawScope, jB, f, 0L, null, 0, 124);
            } finally {
                b.C(canvasDrawScope$drawContext$1, jD);
            }
        }
    }

    public final void b(Interaction interaction, CoroutineScope coroutineScope) {
        boolean z = interaction instanceof HoverInteraction.Enter;
        ArrayList arrayList = this.d;
        if (z) {
            arrayList.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            arrayList.remove(((HoverInteraction.Exit) interaction).f922a);
        } else if (interaction instanceof FocusInteraction.Focus) {
            arrayList.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            arrayList.remove(((FocusInteraction.Unfocus) interaction).f921a);
        } else if (interaction instanceof DragInteraction.Start) {
            arrayList.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            arrayList.remove(((DragInteraction.Stop) interaction).f920a);
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            arrayList.remove(((DragInteraction.Cancel) interaction).f919a);
        }
        Interaction interaction2 = (Interaction) CollectionsKt.P(arrayList);
        if (Intrinsics.c(this.e, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlpha = (RippleAlpha) this.b.invoke();
            float f = z ? rippleAlpha.c : interaction instanceof FocusInteraction.Focus ? rippleAlpha.b : interaction instanceof DragInteraction.Start ? rippleAlpha.f1386a : BitmapDescriptorFactory.HUE_RED;
            TweenSpec tweenSpec = RippleKt.f1390a;
            if (!(interaction2 instanceof HoverInteraction.Enter) && ((interaction2 instanceof FocusInteraction.Focus) || (interaction2 instanceof DragInteraction.Start))) {
                tweenSpec = new TweenSpec(45, EasingKt.d, 2);
            }
            BuildersKt.c(coroutineScope, null, null, new StateLayer$handleInteraction$1(this, f, tweenSpec, null), 3);
        } else {
            Interaction interaction3 = this.e;
            TweenSpec tweenSpec2 = RippleKt.f1390a;
            if (!(interaction3 instanceof HoverInteraction.Enter) && !(interaction3 instanceof FocusInteraction.Focus) && (interaction3 instanceof DragInteraction.Start)) {
                tweenSpec2 = new TweenSpec(150, EasingKt.d, 2);
            }
            BuildersKt.c(coroutineScope, null, null, new StateLayer$handleInteraction$2(this, tweenSpec2, null), 3);
        }
        this.e = interaction2;
    }
}
