package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PreviewActivity extends ComponentActivity {
    public final String s = "PreviewActivity";

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String stringExtra;
        super.onCreate(bundle);
        int i = getApplicationInfo().flags & 2;
        String str = this.s;
        if (i == 0) {
            Log.d(str, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        Log.d(str, "PreviewActivity has composable ".concat(stringExtra));
        final String strE0 = StringsKt.e0(stringExtra, JwtParser.SEPARATOR_CHAR);
        final String strA0 = StringsKt.a0(JwtParser.SEPARATOR_CHAR, stringExtra, stringExtra);
        String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra2 == null) {
            Log.d(str, "Previewing '" + strA0 + "' without a parameter provider.");
            ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setComposableContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws ClassNotFoundException, SecurityException {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ComposableInvoker.c(strE0, strA0, composer, new Object[0]);
                    } else {
                        composer.j();
                    }
                    return Unit.f24250a;
                }
            }, true, -840626948));
            return;
        }
        Log.d(str, "Previewing '" + strA0 + "' with parameter provider: '" + stringExtra2 + '\'');
        final Object[] objArrC = PreviewUtils_androidKt.c(PreviewUtils_androidKt.a(stringExtra2), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (objArrC.length > 1) {
            ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objG = composer.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = SnapshotIntStateKt.a(0);
                            composer.A(objG);
                        }
                        final MutableIntState mutableIntState = (MutableIntState) objG;
                        final Object[] objArr = objArrC;
                        ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(958604965, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                int iIntValue2 = ((Number) obj4).intValue();
                                if (composer2.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$PreviewActivity_androidKt.f2165a;
                                    final Object[] objArr2 = objArr;
                                    boolean zI = composer2.I(objArr2);
                                    Object objG2 = composer2.G();
                                    if (zI || objG2 == Composer.Companion.f1624a) {
                                        final MutableIntState mutableIntState2 = mutableIntState;
                                        objG2 = new Function0<Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                MutableIntState mutableIntState3 = mutableIntState2;
                                                mutableIntState3.i((mutableIntState3.d() + 1) % objArr2.length);
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG2);
                                    }
                                    FloatingActionButtonKt.a((Function0) objG2, null, null, 0L, 0L, null, composer2, 6);
                                } else {
                                    composer2.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer);
                        final String str2 = strE0;
                        final String str3 = strA0;
                        ScaffoldKt.a(null, null, null, null, null, composableLambdaImplC, 0, false, null, BitmapDescriptorFactory.HUE_RED, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(57310875, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) throws Exception {
                                PaddingValues paddingValues = (PaddingValues) obj3;
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= composer2.n(paddingValues) ? 4 : 2;
                                }
                                if (composer2.z(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    Modifier modifierE = PaddingKt.e(Modifier.Companion.d, paddingValues);
                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                    int p = composer2.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer2.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer2.i();
                                    if (composer2.getO()) {
                                        composer2.K(function0);
                                    } else {
                                        composer2.e();
                                    }
                                    Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                        b.z(p, composer2, p, function2);
                                    }
                                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                    ComposableInvoker.c(str2, str3, composer2, objArr[mutableIntState.d()]);
                                    composer2.f();
                                } else {
                                    composer2.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer), composer, 196608);
                    } else {
                        composer.j();
                    }
                    return Unit.f24250a;
                }
            }, true, -861939235));
        } else {
            ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws Exception {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object[] objArr = objArrC;
                        ComposableInvoker.c(strE0, strA0, composer, Arrays.copyOf(objArr, objArr.length));
                    } else {
                        composer.j();
                    }
                    return Unit.f24250a;
                }
            }, true, -1901447514));
        }
    }
}
