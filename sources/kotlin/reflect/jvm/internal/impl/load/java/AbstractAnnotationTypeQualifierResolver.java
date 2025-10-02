package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractAnnotationTypeQualifierResolver<TAnnotation> {
    public static final LinkedHashMap c;

    /* renamed from: a, reason: collision with root package name */
    public final JavaTypeEnhancementState f24393a;
    public final ConcurrentHashMap b;

    public static final class Companion {
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String str = annotationQualifierApplicabilityType.d;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, annotationQualifierApplicabilityType);
            }
        }
        c = linkedHashMap;
    }

    public AbstractAnnotationTypeQualifierResolver(JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.h(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f24393a = javaTypeEnhancementState;
        this.b = new ConcurrentHashMap();
    }

    public abstract ArrayList a(Object obj, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType b(kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType r12, java.lang.Iterable r13) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.b(kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType, java.lang.Iterable):kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType");
    }

    public final NullabilityQualifierWithMigrationStatus c(Object obj, Function1 function1) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusJ;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusJ2 = j(obj, ((Boolean) function1.invoke(obj)).booleanValue());
        if (nullabilityQualifierWithMigrationStatusJ2 != null) {
            return nullabilityQualifierWithMigrationStatusJ2;
        }
        Object objL = l(obj);
        if (objL != null) {
            ReportLevel reportLevelK = k(obj);
            if (reportLevelK == null) {
                reportLevelK = this.f24393a.f24404a.f24406a;
            }
            reportLevelK.getClass();
            if (reportLevelK != ReportLevel.e && (nullabilityQualifierWithMigrationStatusJ = j(objL, ((Boolean) function1.invoke(objL)).booleanValue())) != null) {
                return NullabilityQualifierWithMigrationStatus.a(nullabilityQualifierWithMigrationStatusJ, null, reportLevelK == ReportLevel.f, 1);
            }
        }
        return null;
    }

    public final Object d(Object obj, FqName fqName) {
        for (Object obj2 : g(obj)) {
            if (Intrinsics.c(e(obj2), fqName)) {
                return obj2;
            }
        }
        return null;
    }

    public abstract FqName e(Object obj);

    public abstract ClassDescriptor f(Object obj);

    public abstract Iterable g(Object obj);

    public final boolean h(Object obj, FqName fqName) {
        Iterable iterableG = g(obj);
        if ((iterableG instanceof Collection) && ((Collection) iterableG).isEmpty()) {
            return false;
        }
        Iterator it = iterableG.iterator();
        while (it.hasNext()) {
            if (Intrinsics.c(e(it.next()), fqName)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(Object annotation) {
        Intrinsics.h(annotation, "annotation");
        Object objD = d(annotation, StandardNames.FqNames.t);
        if (objD != null) {
            ArrayList arrayListA = a(objD, false);
            if (!arrayListA.isEmpty()) {
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.c((String) it.next(), CredentialProviderBaseController.TYPE_TAG)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r6.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r6.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.e;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus j(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r5.e(r6)
            r1 = 0
            if (r0 != 0) goto L9
            goto L9f
        L9:
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState r2 = r5.f24393a
            r2.getClass()
            kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState$Companion$DEFAULT$1 r2 = kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState$Companion$DEFAULT$1.d
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r2
            r2.getClass()
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r3 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.e
            if (r2 != r3) goto L1e
            return r1
        L1e:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.g()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f
            goto L91
        L2d:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.h()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L3a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.e
            goto L91
        L3a:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L47
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.d
            goto L91
        L47:
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.c()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9f
            java.util.ArrayList r6 = r5.a(r6, r4)
            java.lang.Object r6 = kotlin.collections.CollectionsKt.E(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8f
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L83;
                case 74175084: goto L7a;
                case 433141802: goto L6e;
                case 1933739535: goto L65;
                default: goto L64;
            }
        L64:
            goto L9f
        L65:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L9f
            goto L8f
        L6e:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L77
            goto L9f
        L77:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.d
            goto L91
        L7a:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L8c
            goto L9f
        L83:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L8c
            goto L9f
        L8c:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.e
            goto L91
        L8f:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.f
        L91:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.f
            if (r2 != r1) goto L98
            goto L9a
        L98:
            if (r7 == 0) goto L9b
        L9a:
            r4 = 1
        L9b:
            r0.<init>(r6, r4)
            return r0
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver.j(java.lang.Object, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    public final ReportLevel k(Object obj) {
        String str;
        JavaTypeEnhancementState javaTypeEnhancementState = this.f24393a;
        ReportLevel reportLevel = (ReportLevel) javaTypeEnhancementState.f24404a.c.get(e(obj));
        if (reportLevel != null) {
            return reportLevel;
        }
        Object objD = d(obj, JvmAnnotationNamesKt.i());
        if (objD == null || (str = (String) CollectionsKt.E(a(objD, false))) == null) {
            return null;
        }
        ReportLevel reportLevel2 = javaTypeEnhancementState.f24404a.b;
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return ReportLevel.e;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return ReportLevel.g;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return ReportLevel.f;
        }
        return null;
    }

    public final Object l(Object annotation) {
        Object objL;
        Intrinsics.h(annotation, "annotation");
        if (!this.f24393a.f24404a.e) {
            if (CollectionsKt.t(JvmAnnotationNamesKt.a(), e(annotation)) || h(annotation, JvmAnnotationNamesKt.d())) {
                return annotation;
            }
            if (h(annotation, JvmAnnotationNamesKt.f())) {
                ClassDescriptor classDescriptorF = f(annotation);
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj = concurrentHashMap.get(classDescriptorF);
                if (obj != null) {
                    return obj;
                }
                Iterator it = g(annotation).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objL = null;
                        break;
                    }
                    objL = l(it.next());
                    if (objL != null) {
                        break;
                    }
                }
                if (objL != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(classDescriptorF, objL);
                    return objPutIfAbsent == null ? objL : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
