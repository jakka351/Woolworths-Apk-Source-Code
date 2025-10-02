package androidx.webkit.internal;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes2.dex */
public class WebViewGlueCommunicator {

    public static class LAZY_COMPAT_CONVERTER_HOLDER {

        /* renamed from: a, reason: collision with root package name */
        public static final WebkitToCompatConverter f3859a = new WebkitToCompatConverter(LAZY_FACTORY_HOLDER.f3860a.getWebkitToCompatConverter());
    }

    public static class LAZY_FACTORY_HOLDER {

        /* renamed from: a, reason: collision with root package name */
        public static final WebViewProviderFactory f3860a;

        static {
            WebViewProviderFactory incompatibleApkWebViewProviderFactory;
            try {
                incompatibleApkWebViewProviderFactory = new WebViewProviderFactoryAdapter((WebViewProviderFactoryBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewProviderFactoryBoundaryInterface.class, WebViewGlueCommunicator.a()));
            } catch (ClassNotFoundException unused) {
                incompatibleApkWebViewProviderFactory = new IncompatibleApkWebViewProviderFactory();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            f3860a = incompatibleApkWebViewProviderFactory;
        }
    }

    public static InvocationHandler a() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebView.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static WebViewProviderFactory b() {
        return LAZY_FACTORY_HOLDER.f3860a;
    }
}
