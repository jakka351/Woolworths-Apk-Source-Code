package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public interface DescriptorRendererOptions {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static boolean a(DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.c().d;
        }

        public static boolean b(DescriptorRendererOptions descriptorRendererOptions) {
            return descriptorRendererOptions.c().e;
        }
    }

    void a(ParameterNameRenderingPolicy parameterNameRenderingPolicy);

    Set b();

    AnnotationArgumentsRenderingPolicy c();

    void d();

    void e(Set set);

    void f(LinkedHashSet linkedHashSet);

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();

    void m();

    void n();

    void o(ClassifierNamePolicy classifierNamePolicy);

    void p();
}
