package androidx.constraintlayout.core.state;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.foundation.icon.IconBuilderKt;
import au.com.woolworths.design.core.ui.foundation.icon.PathData;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static void A(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void B(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static boolean C(Set set, Set set2, List list, String str, BooleanExpression.Element element) {
        return BooleanExpressions.b(element, new com.apollographql.apollo.api.a(set, set2, list, str));
    }

    public static int D(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static SharedPreferences b(String str, String str2, Application application, int i, String str3) {
        SharedPreferences sharedPreferences = application.getSharedPreferences(str + str2, i);
        Intrinsics.g(sharedPreferences, str3);
        return sharedPreferences;
    }

    public static ImageVector c(int i, String str, String str2) {
        return IconBuilderKt.a(str2, CollectionsKt.Q(new PathData(str, i)));
    }

    public static String d(JsonReader jsonReader, String str, CustomScalarAdapters customScalarAdapters, String str2) {
        Intrinsics.h(jsonReader, str);
        Intrinsics.h(customScalarAdapters, str2);
        String strNextString = jsonReader.nextString();
        Intrinsics.e(strNextString);
        return strNextString;
    }

    public static String e(Class cls, String str, String str2) {
        return str + cls + str2;
    }

    public static String f(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    public static String g(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static String h(String str) {
        String string = UUID.randomUUID().toString();
        Intrinsics.g(string, str);
        return string;
    }

    public static String i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String k(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static String m(Locale locale, String str, String str2, Locale locale2, String str3) {
        Intrinsics.g(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        Intrinsics.g(lowerCase, str3);
        return lowerCase;
    }

    public static StringBuilder n(double d, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(d);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder o(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    public static StringBuilder p(String str, int i, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder q(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
        sb.append(str4);
        return sb;
    }

    public static HashMap r(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static Map s(String str, String str2) {
        return MapsKt.i(new Pair(str, str2));
    }

    public static void t(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void u(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void v(SharedPreferences sharedPreferences, String str, boolean z) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }

    public static /* synthetic */ void w(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else {
                if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void x(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
    }

    public static void y(String str, String str2, SpreadBuilder spreadBuilder) {
        spreadBuilder.a(new Pair(str, str2));
    }

    public static void z(String str, String str2, SpreadBuilder spreadBuilder, String str3, String str4) {
        spreadBuilder.a(new Pair(str, str2));
        spreadBuilder.a(new Pair(str3, str4));
    }
}
