package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final Annotations$Companion$EMPTY$1 f24350a = new Annotations$Companion$EMPTY$1();

        public static Annotations a(List list) {
            return list.isEmpty() ? f24350a : new AnnotationsImpl(list);
        }
    }

    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static AnnotationDescriptor a(Annotations annotations, FqName fqName) {
            AnnotationDescriptor next;
            Intrinsics.h(fqName, "fqName");
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.c(next.d(), fqName)) {
                    break;
                }
            }
            return next;
        }

        public static boolean b(Annotations annotations, FqName fqName) {
            Intrinsics.h(fqName, "fqName");
            return annotations.H(fqName) != null;
        }
    }

    AnnotationDescriptor H(FqName fqName);

    boolean isEmpty();

    boolean m2(FqName fqName);
}
