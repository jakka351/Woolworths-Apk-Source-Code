package kotlin.coroutines.jvm.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ModuleNameRetriever;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DebugMetadataKt {
    public static final StackTraceElement a(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        DebugMetadata debugMetadata = (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
        String str = null;
        if (debugMetadata == null) {
            return null;
        }
        int iV = debugMetadata.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField(AnnotatedPrivateKey.LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? debugMetadata.l()[iIntValue] : -1;
        ModuleNameRetriever.Cache cache = ModuleNameRetriever.b;
        ModuleNameRetriever.Cache cache2 = ModuleNameRetriever.f24255a;
        if (cache == null) {
            try {
                ModuleNameRetriever.Cache cache3 = new ModuleNameRetriever.Cache(Class.class.getDeclaredMethod("getModule", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, null));
                ModuleNameRetriever.b = cache3;
                cache = cache3;
            } catch (Exception unused2) {
                ModuleNameRetriever.b = cache2;
                cache = cache2;
            }
        }
        if (cache != cache2 && (method = cache.f24256a) != null && (objInvoke = method.invoke(baseContinuationImpl.getClass(), null)) != null && (method2 = cache.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = cache.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = debugMetadata.c();
        } else {
            strC = str + '/' + debugMetadata.c();
        }
        return new StackTraceElement(strC, debugMetadata.m(), debugMetadata.f(), i);
    }
}
