package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {
    public static final /* synthetic */ KProperty[] r;
    public final JavaPackage j;
    public final LazyJavaResolverContext k;
    public final MetadataVersion l;
    public final NotNullLazyValue m;
    public final JvmPackageScope n;
    public final NotNullLazyValue o;
    public final Annotations p;
    public final NotNullLazyValue q;

    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KotlinClassHeader.Kind.Companion companion = KotlinClassHeader.Kind.e;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(LazyJavaPackageFragment.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        r = new KProperty[]{reflectionFactory.h(propertyReference1Impl), c.t(LazyJavaPackageFragment.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, reflectionFactory)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyJavaPackageFragment(LazyJavaResolverContext outerContext, JavaPackage javaPackage) {
        Intrinsics.h(outerContext, "outerContext");
        JavaResolverComponents javaResolverComponents = outerContext.f24425a;
        super(javaResolverComponents.o, javaPackage.d());
        this.j = javaPackage;
        LazyJavaResolverContext lazyJavaResolverContextA = ContextKt.a(outerContext, this, null, 6);
        this.k = lazyJavaResolverContextA;
        javaResolverComponents.d.c().c.getClass();
        this.l = MetadataVersion.g;
        JavaResolverComponents javaResolverComponents2 = lazyJavaResolverContextA.f24425a;
        StorageManager storageManager = javaResolverComponents2.f24422a;
        this.m = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$$Lambda$0
            public final LazyJavaPackageFragment d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                LazyJavaPackageFragment lazyJavaPackageFragment = this.d;
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaPackageFragment.k;
                lazyJavaResolverContext.f24425a.l.a(lazyJavaPackageFragment.h.f24500a.f24501a);
                ArrayList arrayList = new ArrayList();
                for (String str : EmptyList.d) {
                    KotlinJvmBinaryClass kotlinJvmBinaryClassA = KotlinClassFinderKt.a(lazyJavaResolverContext.f24425a.c, ClassId.Companion.b(new FqName(JvmClassName.c(str).f24548a.replace('/', JwtParser.SEPARATOR_CHAR))), lazyJavaPackageFragment.l);
                    Pair pair = kotlinJvmBinaryClassA != null ? new Pair(str, kotlinJvmBinaryClassA) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return MapsKt.p(arrayList);
            }
        });
        this.n = new JvmPackageScope(lazyJavaResolverContextA, javaPackage, this);
        this.o = storageManager.f(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$$Lambda$1
            public final LazyJavaPackageFragment d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.d.j.getClass();
                EmptyList emptyList = EmptyList.d;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(emptyList, 10));
                Iterator<E> it = emptyList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((JavaPackage) it.next()).d());
                }
                return arrayList;
            }
        });
        this.p = javaResolverComponents2.v.c ? Annotations.Companion.f24350a : LazyJavaAnnotationsKt.a(lazyJavaResolverContextA, javaPackage);
        this.q = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$$Lambda$2
            public final LazyJavaPackageFragment d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = LazyJavaPackageFragment.r;
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) StorageKt.a(this.d.m, LazyJavaPackageFragment.r[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    KotlinJvmBinaryClass kotlinJvmBinaryClass = (KotlinJvmBinaryClass) entry.getValue();
                    JvmClassName jvmClassNameC = JvmClassName.c(str);
                    KotlinClassHeader kotlinClassHeaderA = kotlinJvmBinaryClass.a();
                    int iOrdinal = kotlinClassHeaderA.f24478a.ordinal();
                    if (iOrdinal == 2) {
                        map.put(jvmClassNameC, jvmClassNameC);
                    } else if (iOrdinal == 5) {
                        String str2 = kotlinClassHeaderA.f;
                        if (kotlinClassHeaderA.f24478a != KotlinClassHeader.Kind.l) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            map.put(jvmClassNameC, JvmClassName.c(str2));
                        }
                    }
                }
                return map;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement g() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public final MemberScope s() {
        return this.n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final String toString() {
        return "Lazy Java package fragment: " + this.h + " of module " + this.k.f24425a.o;
    }
}
