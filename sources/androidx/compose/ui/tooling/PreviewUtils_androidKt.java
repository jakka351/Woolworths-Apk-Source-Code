package androidx.compose.ui.tooling;

import android.util.Log;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-tooling_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PreviewUtils_androidKt {
    public static final Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            Log.e("PreviewLogger", "Unable to find PreviewProvider '" + str + '\'', e);
            return null;
        }
    }

    public static final List b(Group group, Function1 function1, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListZ = CollectionsKt.Z(group);
        while (!arrayListZ.isEmpty()) {
            Group group2 = (Group) CollectionsKt.j0(arrayListZ);
            if (((Boolean) function1.invoke(group2)).booleanValue()) {
                if (z) {
                    return CollectionsKt.Q(group2);
                }
                arrayList.add(group2);
            }
            arrayListZ.addAll(group2.g);
        }
        return arrayList;
    }

    public static final Object[] c(Class cls, int i) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (cls == null) {
            return new Object[0];
        }
        try {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i2 = 0;
            boolean z = false;
            Constructor<?> constructor = null;
            while (true) {
                if (i2 < length) {
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (z) {
                            break;
                        }
                        z = true;
                        constructor = constructor2;
                    }
                    i2++;
                } else if (!z) {
                }
            }
            constructor = null;
            if (constructor == null) {
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            }
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
            PreviewParameterProvider previewParameterProvider = (PreviewParameterProvider) objNewInstance;
            if (i < 0) {
                Sequence values = previewParameterProvider.getValues();
                int count = previewParameterProvider.getCount();
                Iterator f24664a = values.getF24664a();
                Object[] objArr = new Object[count];
                for (int i3 = 0; i3 < count; i3++) {
                    objArr[i3] = f24664a.next();
                }
                return objArr;
            }
            Sequence values2 = previewParameterProvider.getValues();
            Intrinsics.h(values2, "<this>");
            if (i < 0) {
                throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i + JwtParser.SEPARATOR_CHAR);
            }
            int i4 = 0;
            for (Object obj : values2) {
                int i5 = i4 + 1;
                if (i == i4) {
                    List listQ = CollectionsKt.Q(obj);
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(listQ, 10));
                    Iterator it = listQ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(d(it.next()));
                    }
                    return arrayList.toArray(new Object[0]);
                }
                i4 = i5;
            }
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i + JwtParser.SEPARATOR_CHAR);
        } catch (KotlinReflectionNotSupportedError unused) {
            throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        }
    }

    public static final Object d(Object obj) throws NoSuchFieldException, SecurityException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof JvmInline) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }
}
