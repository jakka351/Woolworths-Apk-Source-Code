package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;

/* loaded from: classes.dex */
public abstract class DescriptorRenderer {

    /* renamed from: a, reason: collision with root package name */
    public static final DescriptorRendererImpl f24521a;
    public static final DescriptorRendererImpl b;
    public static final DescriptorRendererImpl c;

    public static final class Companion {

        /* loaded from: classes7.dex */
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    ClassKind classKind = ClassKind.d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    ClassKind classKind2 = ClassKind.d;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    ClassKind classKind3 = ClassKind.d;
                    iArr[5] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    ClassKind classKind4 = ClassKind.d;
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    ClassKind classKind5 = ClassKind.d;
                    iArr[3] = 6;
                } catch (NoSuchFieldError unused6) {
                }
            }
        }

        public static DescriptorRendererImpl a(Function1 changeOptions) {
            Intrinsics.h(changeOptions, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            changeOptions.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.f24524a = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    public interface ValueParametersHandler {

        public static final class DEFAULT implements ValueParametersHandler {

            /* renamed from: a, reason: collision with root package name */
            public static final DEFAULT f24522a = new DEFAULT();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void a(StringBuilder builder) {
                Intrinsics.h(builder, "builder");
                builder.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void b(StringBuilder builder) {
                Intrinsics.h(builder, "builder");
                builder.append(")");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void c(ValueParameterDescriptor parameter, StringBuilder builder) {
                Intrinsics.h(parameter, "parameter");
                Intrinsics.h(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public final void d(ValueParameterDescriptor valueParameterDescriptor, int i, int i2, StringBuilder builder) {
                Intrinsics.h(builder, "builder");
                if (i != i2 - 1) {
                    builder.append(", ");
                }
            }
        }

        void a(StringBuilder sb);

        void b(StringBuilder sb);

        void c(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb);

        void d(ValueParameterDescriptor valueParameterDescriptor, int i, int i2, StringBuilder sb);
    }

    static {
        Companion.a(DescriptorRenderer$$Lambda$0.d);
        Companion.a(DescriptorRenderer$$Lambda$1.d);
        Companion.a(DescriptorRenderer$$Lambda$2.d);
        Companion.a(DescriptorRenderer$$Lambda$3.d);
        Companion.a(DescriptorRenderer$$Lambda$4.d);
        Companion.a(DescriptorRenderer$$Lambda$5.d);
        f24521a = Companion.a(DescriptorRenderer$$Lambda$6.d);
        Companion.a(DescriptorRenderer$$Lambda$7.d);
        b = Companion.a(DescriptorRenderer$$Lambda$8.d);
        c = Companion.a(DescriptorRenderer$$Lambda$9.d);
        Companion.a(DescriptorRenderer$$Lambda$10.d);
    }

    public abstract String q(AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget);
}
