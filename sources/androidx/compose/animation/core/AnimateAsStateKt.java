package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\b²\u0006*\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00018\nX\u008a\u0084\u0002²\u0006\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/compose/animation/core/AnimationSpec;", "animSpec", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnimateAsStateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SpringSpec f742a = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7);
    public static final SpringSpec b;

    static {
        Rect rect = VisibilityThresholdsKt.f802a;
        b = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Dp(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final State a(float f, AnimationSpec animationSpec, String str, Function1 function1, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            animationSpec = b;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        int i3 = i << 6;
        return c(new Dp(f), VectorConvertersKt.c, animationSpec2, null, str2, function1, composer, ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    public static final State b(float f, AnimationSpec animationSpec, String str, Function1 function1, Composer composer, int i, int i2) {
        int i3 = i2 & 2;
        SpringSpec springSpec = f742a;
        AnimationSpec animationSpec2 = i3 != 0 ? springSpec : animationSpec;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        Function1 function12 = (i2 & 16) != 0 ? null : function1;
        if (animationSpec2 == springSpec) {
            composer.o(1125558999);
            boolean zQ = composer.q(0.01f);
            Object objG = composer.G();
            if (zQ || objG == Composer.Companion.f1624a) {
                objG = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Float.valueOf(0.01f), 3);
                composer.A(objG);
            }
            animationSpec2 = (SpringSpec) objG;
            composer.l();
        } else {
            composer.o(1125668925);
            composer.l();
        }
        return c(Float.valueOf(f), VectorConvertersKt.f788a, animationSpec2, Float.valueOf(0.01f), str2, function12, composer, (i << 3) & 516096, 0);
    }

    public static final State c(final Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Float f, String str, Function1 function1, Composer composer, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objG = composer.G();
        Object obj2 = Composer.Companion.f1624a;
        if (objG == obj2) {
            objG = SnapshotStateKt.f(null);
            composer.A(objG);
        }
        MutableState mutableState = (MutableState) objG;
        Object objG2 = composer.G();
        if (objG2 == obj2) {
            objG2 = new Animatable(obj, twoWayConverter, f, str);
            composer.A(objG2);
        }
        Animatable animatable = (Animatable) objG2;
        MutableState mutableStateL = SnapshotStateKt.l(function1, composer);
        if (f != null && (animationSpec instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpec;
            if (!Intrinsics.c(springSpec.c, f)) {
                animationSpec = new SpringSpec(springSpec.f772a, springSpec.b, f);
            }
        }
        MutableState mutableStateL2 = SnapshotStateKt.l(animationSpec, composer);
        Object objG3 = composer.G();
        if (objG3 == obj2) {
            objG3 = ChannelKt.a(-1, 6, null);
            composer.A(objG3);
        }
        final Channel channel = (Channel) objG3;
        boolean zI = composer.I(channel) | composer.I(obj);
        Object objG4 = composer.G();
        if (zI || objG4 == obj2) {
            objG4 = new Function0<Unit>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    channel.k(obj);
                    return Unit.f24250a;
                }
            };
            composer.A(objG4);
        }
        composer.g((Function0) objG4);
        boolean zI2 = composer.I(channel) | composer.I(animatable) | composer.n(mutableStateL2) | composer.n(mutableStateL);
        Object objG5 = composer.G();
        if (zI2 || objG5 == obj2) {
            Object animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(channel, animatable, mutableStateL2, mutableStateL, null);
            composer.A(animateAsStateKt$animateValueAsState$3$1);
            objG5 = animateAsStateKt$animateValueAsState$3$1;
        }
        EffectsKt.e(composer, channel, (Function2) objG5);
        State state = (State) mutableState.getD();
        return state == null ? animatable.c : state;
    }
}
