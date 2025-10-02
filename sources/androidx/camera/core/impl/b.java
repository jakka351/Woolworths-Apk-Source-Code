package androidx.camera.core.impl;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Measurable;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KMutableProperty1;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static void A(int i, Composer composer, Function2 function2) {
        function2.invoke(composer, Integer.valueOf(i));
        composer.f();
    }

    public static void B(int i, ComposerImpl composerImpl, int i2, Function2 function2) {
        composerImpl.A(Integer.valueOf(i));
        composerImpl.a(Integer.valueOf(i2), function2);
    }

    public static void C(CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1, long j) {
        canvasDrawScope$drawContext$1.a().m();
        canvasDrawScope$drawContext$1.h(j);
    }

    public static String D(String str, String str2, String str3) {
        return new Regex(str).g(str2, str3);
    }

    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int c(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int d(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int f(Measurable measurable, long j, ArrayList arrayList, int i, int i2) {
        arrayList.add(measurable.c0(j));
        return i + i2;
    }

    public static ProvidedValue g(long j, DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal) {
        return dynamicProvidableCompositionLocal.b(new Color(j));
    }

    public static RememberedCoroutineScope h(CoroutineContext coroutineContext, ComposerImpl composerImpl) {
        RememberedCoroutineScope rememberedCoroutineScope = new RememberedCoroutineScope(coroutineContext);
        composerImpl.A(rememberedCoroutineScope);
        return rememberedCoroutineScope;
    }

    public static String i(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String j(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String k(long j, String str) {
        return str + j;
    }

    public static String l(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String m(Object obj, String str) {
        return str + obj;
    }

    public static String n(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(StringBuilder sb, double d, char c) {
        sb.append(d);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String s(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder t(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder u(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static KotlinNothingValueException w(String str) {
        InlineClassHelperKt.c(str);
        return new KotlinNothingValueException();
    }

    public static Ref.ObjectRef x(Object obj) {
        ResultKt.b(obj);
        return new Ref.ObjectRef();
    }

    public static KMutableProperty1 y(Class cls, String str, String str2, int i, ReflectionFactory reflectionFactory) {
        return reflectionFactory.e(new MutablePropertyReference1Impl(cls, str, str2, i));
    }

    public static void z(int i, Composer composer, int i2, Function2 function2) {
        composer.A(Integer.valueOf(i));
        composer.a(Integer.valueOf(i2), function2);
    }
}
