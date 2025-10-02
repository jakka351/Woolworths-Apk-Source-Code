package au.com.woolworths.feature.shop.bundles.ui;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.feature.shop.bundles.BundlesUiEvent;
import au.com.woolworths.feature.shop.bundles.BundlesUiState;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"bundles_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesErrorUiKt {
    public static final void a(final BundlesUiState bundlesUiState, final Function1 eventSink, Composer composer, final int i) {
        boolean z;
        FullPageMessageSpec fullPageMessageSpecF;
        ComposerImpl composerImpl;
        ComposerImpl composerImpl2;
        Intrinsics.h(bundlesUiState, "bundlesUiState");
        Intrinsics.h(eventSink, "eventSink");
        ComposerImpl composerImplV = composer.v(-653241775);
        int i2 = (composerImplV.I(bundlesUiState) ? 4 : 2) | i | (composerImplV.I(eventSink) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl2 = composerImplV;
        } else {
            final Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            FillElement fillElement = SizeKt.c;
            FullPageMessage.Error error = bundlesUiState.i;
            Intrinsics.e(error);
            boolean z2 = error instanceof FullPageMessage.Error.ConnectionError;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z2) {
                composerImplV.o(-228528227);
                String strC = StringResources_androidKt.c(composerImplV, R.string.try_again);
                String strC2 = StringResources_androidKt.c(composerImplV, R.string.bundles_connection_error);
                composerImplV.o(-1633490746);
                boolean zI = ((i2 & 112) == 32) | composerImplV.I(context);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    final int i3 = 0;
                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.bundles.ui.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    Context context2 = context;
                                    String string = context2.getString(R.string.default_connection_error_title_shop);
                                    Intrinsics.g(string, "getString(...)");
                                    String string2 = context2.getString(R.string.bundles_connection_error);
                                    Intrinsics.g(string2, "getString(...)");
                                    String string3 = context2.getString(R.string.try_again);
                                    Intrinsics.g(string3, "getString(...)");
                                    eventSink.invoke(new BundlesUiEvent.RefreshClick(string, string2, string3));
                                    break;
                                default:
                                    Context context3 = context;
                                    String string4 = context3.getString(R.string.default_server_error_title);
                                    Intrinsics.g(string4, "getString(...)");
                                    String string5 = context3.getString(R.string.bundles_server_error);
                                    Intrinsics.g(string5, "getString(...)");
                                    String string6 = context3.getString(R.string.try_again);
                                    Intrinsics.g(string6, "getString(...)");
                                    eventSink.invoke(new BundlesUiEvent.RefreshClick(string4, string5, string6));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                composerImpl = composerImplV;
                fullPageMessageSpecF = FullPageMessageSpec.Companion.c(null, null, strC2, strC, (Function0) objG, composerImpl, 7);
                composerImpl.V(false);
                z = false;
            } else {
                if (!(error instanceof FullPageMessage.Error.ServerError)) {
                    throw au.com.woolworths.android.onesite.a.w(-700111068, composerImplV, false);
                }
                composerImplV.o(-227705518);
                String strC3 = StringResources_androidKt.c(composerImplV, R.string.try_again);
                String strC4 = StringResources_androidKt.c(composerImplV, R.string.bundles_server_error);
                composerImplV.o(-1633490746);
                boolean zI2 = ((i2 & 112) == 32) | composerImplV.I(context);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    final int i4 = 1;
                    objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.bundles.ui.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    Context context2 = context;
                                    String string = context2.getString(R.string.default_connection_error_title_shop);
                                    Intrinsics.g(string, "getString(...)");
                                    String string2 = context2.getString(R.string.bundles_connection_error);
                                    Intrinsics.g(string2, "getString(...)");
                                    String string3 = context2.getString(R.string.try_again);
                                    Intrinsics.g(string3, "getString(...)");
                                    eventSink.invoke(new BundlesUiEvent.RefreshClick(string, string2, string3));
                                    break;
                                default:
                                    Context context3 = context;
                                    String string4 = context3.getString(R.string.default_server_error_title);
                                    Intrinsics.g(string4, "getString(...)");
                                    String string5 = context3.getString(R.string.bundles_server_error);
                                    Intrinsics.g(string5, "getString(...)");
                                    String string6 = context3.getString(R.string.try_again);
                                    Intrinsics.g(string6, "getString(...)");
                                    eventSink.invoke(new BundlesUiEvent.RefreshClick(string4, string5, string6));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                z = false;
                fullPageMessageSpecF = FullPageMessageSpec.Companion.f(null, null, null, strC4, strC3, (Function0) objG2, composerImplV, 7);
                composerImpl = composerImplV;
                composerImpl.V(false);
            }
            ComposerImpl composerImpl3 = composerImpl;
            FullPageMessageUiKt.a(fullPageMessageSpecF, fillElement, null, composerImpl3, 48, 4);
            composerImpl2 = composerImpl3;
            composerImpl2.o(-1746271574);
            boolean zI3 = composerImpl2.I(bundlesUiState) | ((i2 & 112) != 32 ? z : true) | composerImpl2.I(context);
            Object objG3 = composerImpl2.G();
            if (zI3 || objG3 == composer$Companion$Empty$1) {
                objG3 = new BundlesErrorUiKt$BundlesErrorUi$3$1(bundlesUiState, eventSink, context, null);
                composerImpl2.A(objG3);
            }
            composerImpl2.V(z);
            EffectsKt.e(composerImpl2, Unit.f24250a, (Function2) objG3);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl2.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(eventSink, i) { // from class: au.com.woolworths.feature.shop.bundles.ui.h
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(1);
                    BundlesErrorUiKt.a(this.d, this.e, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
