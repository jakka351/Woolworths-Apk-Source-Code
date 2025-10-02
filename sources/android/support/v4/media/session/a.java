package android.support.v4.media.session;

import android.net.Uri;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.text.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static void A(long j, String str, StringBuilder sb) {
        sb.append((Object) Color.i(j));
        sb.append(str);
    }

    public static void B(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        surfaceCombination.a(SurfaceConfig.a(configType, configSize));
        surfaceCombination.a(SurfaceConfig.a(configType2, configSize2));
    }

    public static void C(ComposerImpl composerImpl, boolean z, boolean z2, boolean z3) {
        composerImpl.V(z);
        composerImpl.V(z2);
        composerImpl.V(z3);
    }

    public static /* synthetic */ boolean D(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static int a(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int b(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) + i4;
    }

    public static int d(int i, int i2, TextStyle textStyle) {
        return (textStyle.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, Object obj) {
        return (obj.hashCode() + i) * i2;
    }

    public static SurfaceCombination f(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, ArrayList arrayList, SurfaceCombination surfaceCombination2) {
        surfaceCombination.a(SurfaceConfig.a(configType, configSize));
        arrayList.add(surfaceCombination2);
        return new SurfaceCombination();
    }

    public static SurfaceCombination g(ArrayList arrayList, SurfaceCombination surfaceCombination) {
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    public static MutableState h(long j, Composer composer) {
        MutableState mutableStateL = SnapshotStateKt.l(new Color(j), composer);
        composer.l();
        return mutableStateL;
    }

    public static RememberedCoroutineScope i(CoroutineContext coroutineContext, Composer composer) {
        RememberedCoroutineScope rememberedCoroutineScope = new RememberedCoroutineScope(coroutineContext);
        composer.A(rememberedCoroutineScope);
        return rememberedCoroutineScope;
    }

    public static String j(float f, String str, StringBuilder sb) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    public static String k(int i, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    public static String l(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String m(Uri uri, String str) {
        return str + uri;
    }

    public static String n(Exception exc, String str) {
        return str + exc;
    }

    public static String o(Object obj, String str, StringBuilder sb) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static String p(String str, int i, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String q(String str, StringBuilder sb, ArrayList arrayList) {
        sb.append(arrayList);
        sb.append(str);
        return sb.toString();
    }

    public static String r(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String s(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static String t(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String u(StringBuilder sb, Map map, char c) {
        sb.append(map);
        sb.append(c);
        return sb.toString();
    }

    public static KotlinNothingValueException v(Object obj) {
        ResultKt.b(obj);
        return new KotlinNothingValueException();
    }

    public static void w(int i, int i2, int i3, int i4, int i5) {
        Key_androidKt.a(i);
        Key_androidKt.a(i2);
        Key_androidKt.a(i3);
        Key_androidKt.a(i4);
        Key_androidKt.a(i5);
    }

    public static void x(int i, Composer composer, ComposableLambdaImpl composableLambdaImpl) {
        composableLambdaImpl.invoke(composer, Integer.valueOf(i));
        composer.f();
    }

    public static void y(int i, ComposableLambdaImpl composableLambdaImpl, ComposerImpl composerImpl, boolean z) {
        composableLambdaImpl.invoke(composerImpl, Integer.valueOf(i));
        composerImpl.V(z);
    }

    public static void z(int i, Function2 function2, ComposerImpl composerImpl, boolean z) {
        function2.invoke(composerImpl, Integer.valueOf(i));
        composerImpl.V(z);
    }
}
