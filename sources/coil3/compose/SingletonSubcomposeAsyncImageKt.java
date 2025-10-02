package coil3.compose;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil3.SingletonImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.AsyncImageState;
import coil3.compose.internal.UtilsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SingletonSubcomposeAsyncImageKt {
    public static final void a(String str, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer) {
        SubcomposeAsyncImageKt.a(UtilsKt.a(str, SingletonImageLoader.a((Context) composer.x(AndroidCompositionLocals_androidKt.b)), composer), null, modifier, AsyncImagePainter.y, null, Alignment.Companion.e, ContentScale.Companion.f1880a, composableLambdaImpl, composer, 1769520, 48);
    }

    public static final void b(Object obj, String str, Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, Function1 function1, ContentScale contentScale, Composer composer, int i, int i2, int i3) {
        Function1 function12 = (i3 & 256) != 0 ? null : function1;
        ContentScale contentScale2 = (i3 & 2048) != 0 ? ContentScale.Companion.b : contentScale;
        int i4 = i << 3;
        int i5 = (i & 126) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192);
        int i6 = ((i >> 27) & 14) | ((i2 << 3) & 896);
        int i7 = i5 >> 3;
        AsyncImageState asyncImageStateA = UtilsKt.a(obj, SingletonImageLoader.a((Context) composer.x(AndroidCompositionLocals_androidKt.b)), composer);
        int i8 = (i5 & 112) | (i7 & 896) | (i7 & 7168) | ((i6 << 12) & 3670016);
        SubcomposeAsyncImageKt.a(asyncImageStateA, str, modifier, AsyncImagePainter.y, function12 != null ? new au.com.woolworths.android.onesite.di.a(2, aVar, function12, aVar) : null, Alignment.Companion.e, contentScale2, new ComposableLambdaImpl(new Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit>() { // from class: coil3.compose.SubcomposeAsyncImageKt$contentOf$1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                SubcomposeAsyncImageScope subcomposeAsyncImageScope = (SubcomposeAsyncImageScope) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer2.n(subcomposeAsyncImageScope) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && composer2.c()) {
                    composer2.j();
                } else {
                    AsyncImagePainter.State state = (AsyncImagePainter.State) SnapshotStateKt.a(subcomposeAsyncImageScope.getB().x, composer2).getD();
                    if (state instanceof AsyncImagePainter.State.Loading) {
                        composer2.o(1362365438);
                        composableLambdaImpl.invoke(subcomposeAsyncImageScope, state, composer2, Integer.valueOf(iIntValue & 14));
                        composer2.l();
                    } else {
                        if (state instanceof AsyncImagePainter.State.Success) {
                            composer2.o(-716230951);
                            composer2.l();
                        } else if (state instanceof AsyncImagePainter.State.Error) {
                            composer2.o(1362371262);
                            composableLambdaImpl2.invoke(subcomposeAsyncImageScope, state, composer2, Integer.valueOf(iIntValue & 14));
                            composer2.l();
                        } else if (!(state instanceof AsyncImagePainter.State.Empty)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.o(1362375718);
                        SubcomposeAsyncImageKt.b(subcomposeAsyncImageScope, null, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, false, composer2, iIntValue & 14);
                        composer2.l();
                    }
                    composer2.o(-715997831);
                    composer2.l();
                }
                return Unit.f24250a;
            }
        }, true, -1106738291), composer, i8, 0);
    }
}
