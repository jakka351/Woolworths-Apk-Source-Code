package androidx.compose.ui.tooling;

import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/ComposableInvoker;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ComposableInvoker {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method a(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        boolean z = false;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            if (str.equals(method.getName()) || StringsKt.W(method.getName(), str.concat("-"), z)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z2 = z;
                    ?? r12 = z2;
                    for (?? r11 = z2; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        arrayList.add(Boolean.valueOf(JvmClassMappingKt.e(cls).equals(JvmClassMappingKt.e(cls2)) || cls.isAssignableFrom(cls2)));
                        r12 = i2;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                continue;
            }
            i++;
            z = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method b(Class cls, String str, Object... objArr) throws SecurityException {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(length2 / 10.0d);
                Class cls3 = Integer.TYPE;
                IntRange intRangeO = RangesKt.o(0, iCeil);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(intRangeO, 10));
                IntProgressionIterator it = intRangeO.iterator();
                while (it.f) {
                    it.nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                ArrayList arrayList3 = spreadBuilder.f24269a;
                spreadBuilder.b(clsArr);
                spreadBuilder.a(Composer.class);
                spreadBuilder.b(clsArr2);
                return a(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!Intrinsics.c(method.getName(), str)) {
                    if (!StringsKt.W(method.getName(), str + '-', false)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    public static void c(String str, String str2, Composer composer, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodB = b(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodB != null) {
                methodB.setAccessible(true);
                if (Modifier.isStatic(methodB.getModifiers())) {
                    d(methodB, null, composer, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    d(methodB, cls.getConstructor(null).newInstance(null), composer, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + JwtParser.SEPARATOR_CHAR + str2 + " not found");
        } catch (Exception e) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + JwtParser.SEPARATOR_CHAR + str2 + '\'', null);
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.reflect.Method r10, java.lang.Object r11, androidx.compose.runtime.Composer r12, java.lang.Object... r13) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.ComposableInvoker.d(java.lang.reflect.Method, java.lang.Object, androidx.compose.runtime.Composer, java.lang.Object[]):void");
    }
}
