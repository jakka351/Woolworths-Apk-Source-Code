package androidx.window.layout;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider$windowLayoutComponent$2 extends Lambda implements Function0<WindowLayoutComponent> {
    public static final SafeWindowLayoutComponentProvider$windowLayoutComponent$2 h = new SafeWindowLayoutComponentProvider$windowLayoutComponent$2(0);

    public static WindowLayoutComponent d() {
        final ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
        if (classLoader == null || !SafeWindowLayoutComponentProvider.b(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
                Lazy lazy = SafeWindowLayoutComponentProvider.f3878a;
                ClassLoader classLoader2 = classLoader;
                Method getWindowExtensionsMethod = classLoader2.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
                Class<?> windowExtensionsClass = classLoader2.loadClass("androidx.window.extensions.WindowExtensions");
                Intrinsics.g(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                Intrinsics.g(windowExtensionsClass, "windowExtensionsClass");
                return Boolean.valueOf(getWindowExtensionsMethod.getReturnType().equals(windowExtensionsClass) && Modifier.isPublic(getWindowExtensionsMethod.getModifiers()));
            }
        }) || !SafeWindowLayoutComponentProvider.b(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException {
                /*
                    r4 = this;
                    kotlin.Lazy r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.f3878a
                    java.lang.String r0 = "androidx.window.extensions.WindowExtensions"
                    java.lang.ClassLoader r1 = r1
                    java.lang.Class r0 = r1.loadClass(r0)
                    java.lang.String r2 = "getWindowLayoutComponent"
                    r3 = 0
                    java.lang.reflect.Method r0 = r0.getMethod(r2, r3)
                    java.lang.String r2 = "androidx.window.extensions.layout.WindowLayoutComponent"
                    java.lang.Class r1 = r1.loadClass(r2)
                    java.lang.String r2 = "getWindowLayoutComponentMethod"
                    kotlin.jvm.internal.Intrinsics.g(r0, r2)
                    int r2 = r0.getModifiers()
                    boolean r2 = java.lang.reflect.Modifier.isPublic(r2)
                    if (r2 == 0) goto L37
                    java.lang.String r2 = "windowLayoutComponentClass"
                    kotlin.jvm.internal.Intrinsics.g(r1, r2)
                    java.lang.Class r0 = r0.getReturnType()
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L37
                    r0 = 1
                    goto L38
                L37:
                    r0 = 0
                L38:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1.invoke():java.lang.Object");
            }
        }) || !SafeWindowLayoutComponentProvider.b(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
                /*
                    r4 = this;
                    kotlin.Lazy r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.f3878a
                    java.lang.ClassLoader r0 = r1
                    java.lang.String r1 = "androidx.window.extensions.layout.WindowLayoutComponent"
                    java.lang.Class r0 = r0.loadClass(r1)
                    java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                    java.lang.Class<java.util.function.Consumer> r2 = java.util.function.Consumer.class
                    java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}
                    java.lang.String r3 = "addWindowLayoutInfoListener"
                    java.lang.reflect.Method r1 = r0.getMethod(r3, r1)
                    java.lang.String r3 = "removeWindowLayoutInfoListener"
                    java.lang.Class[] r2 = new java.lang.Class[]{r2}
                    java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
                    java.lang.String r2 = "addListenerMethod"
                    kotlin.jvm.internal.Intrinsics.g(r1, r2)
                    int r1 = r1.getModifiers()
                    boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
                    if (r1 == 0) goto L42
                    java.lang.String r1 = "removeListenerMethod"
                    kotlin.jvm.internal.Intrinsics.g(r0, r1)
                    int r0 = r0.getModifiers()
                    boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
                    if (r0 == 0) goto L42
                    r0 = 1
                    goto L43
                L42:
                    r0 = 0
                L43:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1.invoke():java.lang.Object");
            }
        }) || !SafeWindowLayoutComponentProvider.b(new Function0<Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
                /*
                    r6 = this;
                    kotlin.Lazy r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.f3878a
                    java.lang.ClassLoader r0 = r1
                    java.lang.String r1 = "androidx.window.extensions.layout.FoldingFeature"
                    java.lang.Class r0 = r0.loadClass(r1)
                    java.lang.String r1 = "getBounds"
                    r2 = 0
                    java.lang.reflect.Method r1 = r0.getMethod(r1, r2)
                    java.lang.String r3 = "getType"
                    java.lang.reflect.Method r3 = r0.getMethod(r3, r2)
                    java.lang.String r4 = "getState"
                    java.lang.reflect.Method r0 = r0.getMethod(r4, r2)
                    java.lang.String r2 = "getBoundsMethod"
                    kotlin.jvm.internal.Intrinsics.g(r1, r2)
                    kotlin.jvm.internal.ReflectionFactory r2 = kotlin.jvm.internal.Reflection.f24268a
                    java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
                    kotlin.reflect.KClass r4 = r2.b(r4)
                    java.lang.Class r4 = kotlin.jvm.JvmClassMappingKt.b(r4)
                    java.lang.Class r5 = r1.getReturnType()
                    boolean r4 = r5.equals(r4)
                    if (r4 == 0) goto L88
                    int r1 = r1.getModifiers()
                    boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
                    if (r1 == 0) goto L88
                    java.lang.String r1 = "getTypeMethod"
                    kotlin.jvm.internal.Intrinsics.g(r3, r1)
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    kotlin.reflect.KClass r4 = r2.b(r1)
                    java.lang.Class r4 = kotlin.jvm.JvmClassMappingKt.b(r4)
                    java.lang.Class r5 = r3.getReturnType()
                    boolean r4 = r5.equals(r4)
                    if (r4 == 0) goto L88
                    int r3 = r3.getModifiers()
                    boolean r3 = java.lang.reflect.Modifier.isPublic(r3)
                    if (r3 == 0) goto L88
                    java.lang.String r3 = "getStateMethod"
                    kotlin.jvm.internal.Intrinsics.g(r0, r3)
                    kotlin.reflect.KClass r1 = r2.b(r1)
                    java.lang.Class r1 = kotlin.jvm.JvmClassMappingKt.b(r1)
                    java.lang.Class r2 = r0.getReturnType()
                    boolean r1 = r2.equals(r1)
                    if (r1 == 0) goto L88
                    int r0 = r0.getModifiers()
                    boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
                    if (r0 == 0) goto L88
                    r0 = 1
                    goto L89
                L88:
                    r0 = 0
                L89:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1.invoke():java.lang.Object");
            }
        })) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return d();
    }
}
