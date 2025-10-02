package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* loaded from: classes.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {
    public static final boolean i;
    public static final HashMap j;

    /* renamed from: a, reason: collision with root package name */
    public int[] f24479a;
    public String b;
    public int c;
    public String[] d;
    public String[] e;
    public String[] f;
    public KotlinClassHeader.Kind g;
    public String[] h;

    public static abstract class CollectStringArrayAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f24480a = new ArrayList();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final void a() {
            f((String[]) this.f24480a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final void b(Object obj) {
            if (obj instanceof String) {
                this.f24480a.add((String) obj);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor c(ClassId classId) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final void d(ClassId classId, Name name) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor
        public final void e(ClassLiteralValue classLiteralValue) {
        }

        public abstract void f(String[] strArr);
    }

    public class KotlinMetadataArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public KotlinMetadataArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, Name name) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void c(Name name, ClassId classId, Name name2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void d(Name name, ClassLiteralValue classLiteralValue) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void e(Object obj, Name name) {
            String strB = name.b();
            boolean zEquals = "k".equals(strB);
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
            if (zEquals) {
                if (obj instanceof Integer) {
                    KotlinClassHeader.Kind.e.getClass();
                    KotlinClassHeader.Kind kind = (KotlinClassHeader.Kind) KotlinClassHeader.Kind.f.get((Integer) obj);
                    if (kind == null) {
                        kind = KotlinClassHeader.Kind.g;
                    }
                    readKotlinClassHeaderAnnotationVisitor.g = kind;
                    return;
                }
                return;
            }
            if ("mv".equals(strB)) {
                if (obj instanceof int[]) {
                    readKotlinClassHeaderAnnotationVisitor.f24479a = (int[]) obj;
                }
            } else {
                if ("xs".equals(strB)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.isEmpty()) {
                            return;
                        }
                        readKotlinClassHeaderAnnotationVisitor.b = str;
                        return;
                    }
                    return;
                }
                if (!"xi".equals(strB)) {
                    "pn".equals(strB);
                } else if (obj instanceof Integer) {
                    readKotlinClassHeaderAnnotationVisitor.c = ((Integer) obj).intValue();
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
            String strB = name.b();
            if ("d1".equals(strB)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.1
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void f(String[] strArr) {
                        if (strArr == null) {
                            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                        }
                        ReadKotlinClassHeaderAnnotationVisitor.this.d = strArr;
                    }
                };
            }
            if ("d2".equals(strB)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinMetadataArgumentVisitor.2
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void f(String[] strArr) {
                        if (strArr == null) {
                            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                        }
                        ReadKotlinClassHeaderAnnotationVisitor.this.e = strArr;
                    }
                };
            }
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public class KotlinSerializedIrArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public KotlinSerializedIrArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, Name name) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void c(Name name, ClassId classId, Name name2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void d(Name name, ClassLiteralValue classLiteralValue) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void e(Object obj, Name name) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
            if ("b".equals(name.b())) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.KotlinSerializedIrArgumentVisitor.1
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void f(String[] strArr) {
                        if (strArr == null) {
                            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                        }
                        ReadKotlinClassHeaderAnnotationVisitor.this.h = strArr;
                    }
                };
            }
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public class OldDeprecatedAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public OldDeprecatedAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, Name name) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void c(Name name, ClassId classId, Name name2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void d(Name name, ClassLiteralValue classLiteralValue) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final void e(Object obj, Name name) {
            String strB = name.b();
            boolean zEquals = "version".equals(strB);
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = ReadKotlinClassHeaderAnnotationVisitor.this;
            if (zEquals) {
                if (obj instanceof int[]) {
                    readKotlinClassHeaderAnnotationVisitor.f24479a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(strB)) {
                readKotlinClassHeaderAnnotationVisitor.b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor f(Name name) {
            String strB = name.b();
            if ("data".equals(strB) || "filePartClassNames".equals(strB)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.1
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void f(String[] strArr) {
                        if (strArr == null) {
                            throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                        }
                        ReadKotlinClassHeaderAnnotationVisitor.this.d = strArr;
                    }
                };
            }
            if ("strings".equals(strB)) {
                return new CollectStringArrayAnnotationVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.OldDeprecatedAnnotationArgumentVisitor.2
                    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor.CollectStringArrayAnnotationVisitor
                    public final void f(String[] strArr) {
                        if (strArr == null) {
                            throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                        }
                        ReadKotlinClassHeaderAnnotationVisitor.this.e = strArr;
                    }
                };
            }
            return null;
        }
    }

    static {
        try {
            i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            i = false;
        }
        HashMap map = new HashMap();
        j = map;
        map.put(ClassId.Companion.b(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.h);
        map.put(ClassId.Companion.b(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.i);
        map.put(ClassId.Companion.b(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.k);
        map.put(ClassId.Companion.b(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.l);
        map.put(ClassId.Companion.b(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public final void a() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
        KotlinClassHeader.Kind kind;
        FqName fqNameA = classId.a();
        if (fqNameA.equals(JvmAnnotationNames.f24408a)) {
            return new KotlinMetadataArgumentVisitor();
        }
        if (fqNameA.equals(JvmAnnotationNames.o)) {
            return new KotlinSerializedIrArgumentVisitor();
        }
        if (i || this.g != null || (kind = (KotlinClassHeader.Kind) j.get(classId)) == null) {
            return null;
        }
        this.g = kind;
        return new OldDeprecatedAnnotationArgumentVisitor();
    }
}
