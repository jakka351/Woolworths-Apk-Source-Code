package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"androidx/navigation/compose/NavHostControllerKt__NavHostControllerKt", "androidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavHostControllerKt {
    public static final NavHostController a(Navigator[] navigatorArr, Composer composer) {
        final Context context = (Context) composer.x(AndroidCompositionLocals_androidKt.b);
        Object[] objArrCopyOf = Arrays.copyOf(navigatorArr, navigatorArr.length);
        h hVar = new h(0, (byte) 0);
        Function1 function1 = new Function1() { // from class: androidx.navigation.compose.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                NavHostController navHostControllerA = NavHostControllerKt__NavHostController_androidKt.a(context);
                navHostControllerA.h((Bundle) obj);
                return navHostControllerA;
            }
        };
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f1701a;
        SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(function1, hVar);
        boolean zI = composer.I(context);
        Object objG = composer.G();
        if (zI || objG == Composer.Companion.f1624a) {
            objG = new g(context, 0);
            composer.A(objG);
        }
        NavHostController navHostController = (NavHostController) RememberSaveableKt.c(objArrCopyOf, saverKt$Saver$12, (Function0) objG, composer, 0, 4);
        for (Navigator navigator : navigatorArr) {
            navHostController.b.t.a(navigator);
        }
        return navHostController;
    }
}
