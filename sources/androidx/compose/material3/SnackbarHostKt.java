package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*b\b\u0002\u0010\u0007\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "content", "FadeInFadeOutTransition", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SnackbarHostKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(final SnackbarHostState snackbarHostState, final Modifier modifier, final Function3 function3, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(464178177);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(snackbarHostState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 432) & 147) != 146 || !composerImplV.c()) {
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SnackbarHostKt.f1424a;
            snackbarHostState.getClass();
            throw null;
        }
        composerImplV.j();
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$SnackbarHost$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    SnackbarHostKt.a(snackbarHostState, modifier, function3, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
