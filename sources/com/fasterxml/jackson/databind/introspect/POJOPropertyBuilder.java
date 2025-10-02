package com.fasterxml.jackson.databind.introspect;

import YU.a;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

/* loaded from: classes4.dex */
public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {
    public static final AnnotationIntrospector.ReferenceProperty p = new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.d, "");
    public final boolean e;
    public final MapperConfig f;
    public final AnnotationIntrospector g;
    public final PropertyName h;
    public final PropertyName i;
    public Linked j;
    public Linked k;
    public Linked l;
    public Linked m;
    public transient PropertyMetadata n;
    public transient AnnotationIntrospector.ReferenceProperty o;

    /* renamed from: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14284a;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            f14284a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14284a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14284a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14284a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Linked<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f14285a;
        public final Linked b;
        public final PropertyName c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public Linked(Object obj, Linked linked, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.f14285a = obj;
            this.b = linked;
            PropertyName propertyName2 = (propertyName == null || propertyName.d()) ? null : propertyName;
            this.c = propertyName2;
            if (z) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!propertyName.c()) {
                    z = false;
                }
            }
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        public final Linked a(Linked linked) {
            Linked linked2 = this.b;
            return linked2 == null ? c(linked) : c(linked2.a(linked));
        }

        public final Linked b() {
            Linked linked = this.b;
            if (linked == null) {
                return this;
            }
            Linked linkedB = linked.b();
            if (this.c != null) {
                return linkedB.c == null ? c(null) : c(linkedB);
            }
            if (linkedB.c != null) {
                return linkedB;
            }
            boolean z = linkedB.e;
            boolean z2 = this.e;
            return z2 == z ? c(linkedB) : z2 ? c(null) : linkedB;
        }

        public final Linked c(Linked linked) {
            if (linked == this.b) {
                return this;
            }
            return new Linked(this.f14285a, linked, this.c, this.d, this.e, this.f);
        }

        public final Linked d() {
            Linked linkedD;
            boolean z = this.f;
            Linked linked = this.b;
            if (!z) {
                return (linked == null || (linkedD = linked.d()) == linked) ? this : c(linkedD);
            }
            if (linked == null) {
                return null;
            }
            return linked.d();
        }

        public final Linked e() {
            if (this.b == null) {
                return this;
            }
            return new Linked(this.f14285a, null, this.c, this.d, this.e, this.f);
        }

        public final Linked f() {
            Linked linked = this.b;
            Linked linkedF = linked == null ? null : linked.f();
            return this.e ? c(linkedF) : linkedF;
        }

        public final String toString() {
            String str = this.f14285a.toString() + "[visible=" + this.e + ",ignore=" + this.f + ",explicitName=" + this.d + "]";
            Linked linked = this.b;
            if (linked == null) {
                return str;
            }
            StringBuilder sbT = a.t(str, ", ");
            sbT.append(linked.toString());
            return sbT.toString();
        }
    }

    public static class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {
        public Linked d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Linked linked = this.d;
            if (linked == null) {
                throw new NoSuchElementException();
            }
            AnnotatedMember annotatedMember = (AnnotatedMember) linked.f14285a;
            this.d = linked.b;
            return annotatedMember;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public interface WithMember<T> {
        Object a(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this.f = mapperConfig;
        this.g = annotationIntrospector;
        this.i = propertyName;
        this.h = propertyName2;
        this.e = z;
    }

    public static boolean F(Linked linked) {
        while (linked != null) {
            if (linked.c != null && linked.d) {
                return true;
            }
            linked = linked.b;
        }
        return false;
    }

    public static boolean G(Linked linked) {
        while (linked != null) {
            PropertyName propertyName = linked.c;
            if (propertyName != null && propertyName.c()) {
                return true;
            }
            linked = linked.b;
        }
        return false;
    }

    public static boolean H(Linked linked) {
        PropertyName propertyName;
        while (linked != null) {
            if (!linked.f && (propertyName = linked.c) != null && propertyName.c()) {
                return true;
            }
            linked = linked.b;
        }
        return false;
    }

    public static boolean I(Linked linked) {
        while (linked != null) {
            if (linked.f) {
                return true;
            }
            linked = linked.b;
        }
        return false;
    }

    public static boolean J(Linked linked) {
        while (linked != null) {
            if (linked.e) {
                return true;
            }
            linked = linked.b;
        }
        return false;
    }

    public static Linked K(Linked linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) ((AnnotatedMember) linked.f14285a).n(annotationMap);
        Linked linked2 = linked.b;
        if (linked2 != null) {
            linked = linked.c(K(linked2, annotationMap));
        }
        return annotatedMember == linked.f14285a ? linked : new Linked(annotatedMember, linked.b, linked.c, linked.d, linked.e, linked.f);
    }

    public static Set M(Linked linked, Set set) {
        while (linked != null) {
            PropertyName propertyName = linked.c;
            if (linked.d && propertyName != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(propertyName);
            }
            linked = linked.b;
        }
        return set;
    }

    public static AnnotationMap N(Linked linked) {
        AnnotationMap annotationMap = ((AnnotatedMember) linked.f14285a).e;
        Linked linked2 = linked.b;
        return linked2 != null ? AnnotationMap.b(annotationMap, N(linked2)) : annotationMap;
    }

    public static int O(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.g.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public static AnnotationMap P(int i, Linked... linkedArr) {
        AnnotationMap annotationMapN = N(linkedArr[i]);
        do {
            i++;
            if (i >= linkedArr.length) {
                return annotationMapN;
            }
        } while (linkedArr[i] == null);
        return AnnotationMap.b(annotationMapN, P(i, linkedArr));
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean A(PropertyName propertyName) {
        return this.h.equals(propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean B() {
        return this.m != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean C() {
        return G(this.j) || G(this.l) || G(this.m) || F(this.k);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean D() {
        return F(this.j) || F(this.l) || F(this.m) || F(this.k);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean E() {
        Boolean bool = (Boolean) S(new WithMember<Boolean>() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.3
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public final Object a(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this.g.s0(annotatedMember);
            }
        });
        return bool != null && bool.booleanValue();
    }

    public final void L(Set set, HashMap map, Linked linked) {
        for (Linked linked2 = linked; linked2 != null; linked2 = linked2.b) {
            PropertyName propertyName = linked2.c;
            if (linked2.d && propertyName != null) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) map.get(propertyName);
                if (pOJOPropertyBuilder == null) {
                    pOJOPropertyBuilder = new POJOPropertyBuilder(this.f, this.g, this.e, this.i, propertyName);
                    map.put(propertyName, pOJOPropertyBuilder);
                }
                if (linked == this.j) {
                    pOJOPropertyBuilder.j = linked2.c(pOJOPropertyBuilder.j);
                } else if (linked == this.l) {
                    pOJOPropertyBuilder.l = linked2.c(pOJOPropertyBuilder.l);
                } else if (linked == this.m) {
                    pOJOPropertyBuilder.m = linked2.c(pOJOPropertyBuilder.m);
                } else {
                    if (linked != this.k) {
                        throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                    }
                    pOJOPropertyBuilder.k = linked2.c(pOJOPropertyBuilder.k);
                }
            } else if (linked2.e) {
                StringBuilder sb = new StringBuilder("Conflicting/ambiguous property name definitions (implicit name ");
                Annotation[] annotationArr = ClassUtil.f14330a;
                PropertyName propertyName2 = this.h;
                sb.append(propertyName2 == null ? "[null]" : ClassUtil.c(propertyName2.d));
                sb.append("): found multiple explicit names: ");
                sb.append(set);
                sb.append(", but also implicit accessor: ");
                sb.append(linked2);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public final AnnotatedMethod Q(AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> declaringClass = annotatedMethod.g.getDeclaringClass();
        Class<?> declaringClass2 = annotatedMethod2.g.getDeclaringClass();
        if (declaringClass != declaringClass2) {
            if (!declaringClass.isAssignableFrom(declaringClass2)) {
                if (!declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
        }
        String name = annotatedMethod2.g.getName();
        char c = 2;
        char c2 = (!name.startsWith("set") || name.length() <= 3) ? (char) 2 : (char) 1;
        String name2 = annotatedMethod.g.getName();
        if (name2.startsWith("set") && name2.length() > 3) {
            c = 1;
        }
        if (c2 != c) {
            return c2 < c ? annotatedMethod2 : annotatedMethod;
        }
        AnnotationIntrospector annotationIntrospector = this.g;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.v0(annotatedMethod, annotatedMethod2);
    }

    public final void R(POJOPropertyBuilder pOJOPropertyBuilder) {
        Linked linkedA = this.j;
        Linked linked = pOJOPropertyBuilder.j;
        if (linkedA == null) {
            linkedA = linked;
        } else if (linked != null) {
            linkedA = linkedA.a(linked);
        }
        this.j = linkedA;
        Linked linkedA2 = this.k;
        Linked linked2 = pOJOPropertyBuilder.k;
        if (linkedA2 == null) {
            linkedA2 = linked2;
        } else if (linked2 != null) {
            linkedA2 = linkedA2.a(linked2);
        }
        this.k = linkedA2;
        Linked linkedA3 = this.l;
        Linked linked3 = pOJOPropertyBuilder.l;
        if (linkedA3 == null) {
            linkedA3 = linked3;
        } else if (linked3 != null) {
            linkedA3 = linkedA3.a(linked3);
        }
        this.l = linkedA3;
        Linked linkedA4 = this.m;
        Linked linked4 = pOJOPropertyBuilder.m;
        if (linkedA4 == null) {
            linkedA4 = linked4;
        } else if (linked4 != null) {
            linkedA4 = linkedA4.a(linked4);
        }
        this.m = linkedA4;
    }

    public final Object S(WithMember withMember) {
        Linked linked;
        Linked linked2;
        if (this.g != null) {
            if (this.e) {
                Linked linked3 = this.l;
                if (linked3 != null) {
                    objA = withMember.a((AnnotatedMember) linked3.f14285a);
                }
            } else {
                Linked linked4 = this.k;
                objA = linked4 != null ? withMember.a((AnnotatedMember) linked4.f14285a) : null;
                if (objA == null && (linked = this.m) != null) {
                    objA = withMember.a((AnnotatedMember) linked.f14285a);
                }
            }
            if (objA == null && (linked2 = this.j) != null) {
                return withMember.a((AnnotatedMember) linked2.f14285a);
            }
        }
        return objA;
    }

    public final AnnotatedMember V() {
        if (this.e) {
            return p();
        }
        AnnotatedMember annotatedMemberQ = q();
        if (annotatedMemberQ == null && (annotatedMemberQ = w()) == null) {
            annotatedMemberQ = s();
        }
        return annotatedMemberQ == null ? p() : annotatedMemberQ;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final PropertyName b() {
        return this.h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        POJOPropertyBuilder pOJOPropertyBuilder2 = pOJOPropertyBuilder;
        if (this.k != null) {
            if (pOJOPropertyBuilder2.k == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder2.k != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder2.getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean e() {
        return (this.k == null && this.m == null && this.j == null) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean f() {
        return (this.l == null && this.j == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.PropertyMetadata getMetadata() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.getMetadata():com.fasterxml.jackson.databind.PropertyMetadata");
    }

    @Override // com.fasterxml.jackson.databind.util.Named
    public final String getName() {
        PropertyName propertyName = this.h;
        if (propertyName == null) {
            return null;
        }
        return propertyName.d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final JsonInclude.Value l() {
        AnnotatedMember annotatedMemberP = p();
        AnnotationIntrospector annotationIntrospector = this.g;
        JsonInclude.Value valueL = annotationIntrospector == null ? null : annotationIntrospector.L(annotatedMemberP);
        return valueL == null ? JsonInclude.Value.h : valueL;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final ObjectIdInfo m() {
        return (ObjectIdInfo) S(new WithMember<ObjectIdInfo>() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.4
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public final Object a(AnnotatedMember annotatedMember) {
                POJOPropertyBuilder pOJOPropertyBuilder = POJOPropertyBuilder.this;
                ObjectIdInfo objectIdInfoZ = pOJOPropertyBuilder.g.z(annotatedMember);
                return objectIdInfoZ != null ? pOJOPropertyBuilder.g.B(annotatedMember, objectIdInfoZ) : objectIdInfoZ;
            }
        });
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final AnnotationIntrospector.ReferenceProperty n() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this.o;
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = p;
        if (referenceProperty != null) {
            if (referenceProperty == referenceProperty2) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty3 = (AnnotationIntrospector.ReferenceProperty) S(new WithMember<AnnotationIntrospector.ReferenceProperty>() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.2
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public final Object a(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this.g.P(annotatedMember);
            }
        });
        if (referenceProperty3 != null) {
            referenceProperty2 = referenceProperty3;
        }
        this.o = referenceProperty2;
        return referenceProperty3;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final Class[] o() {
        return (Class[]) S(new WithMember<Class<?>[]>() { // from class: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.1
            @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.WithMember
            public final Object a(AnnotatedMember annotatedMember) {
                return POJOPropertyBuilder.this.g.e0(annotatedMember);
            }
        });
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final AnnotatedParameter q() {
        Linked linked = this.k;
        if (linked == null) {
            return null;
        }
        do {
            Object obj = linked.f14285a;
            if (((AnnotatedParameter) obj).f instanceof AnnotatedConstructor) {
                return (AnnotatedParameter) obj;
            }
            linked = linked.b;
        } while (linked != null);
        return (AnnotatedParameter) this.k.f14285a;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final Iterator r() {
        Linked linked = this.k;
        if (linked == null) {
            return ClassUtil.c;
        }
        MemberIterator memberIterator = new MemberIterator();
        memberIterator.d = linked;
        return memberIterator;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final AnnotatedField s() {
        Linked linked = this.j;
        if (linked == null) {
            return null;
        }
        AnnotatedField annotatedField = (AnnotatedField) linked.f14285a;
        for (Linked linked2 = linked.b; linked2 != null; linked2 = linked2.b) {
            AnnotatedField annotatedField2 = (AnnotatedField) linked2.f14285a;
            Class<?> declaringClass = annotatedField.f.getDeclaringClass();
            Class<?> declaringClass2 = annotatedField2.f.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + annotatedField.i() + " vs " + annotatedField2.i());
        }
        return annotatedField;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.introspect.AnnotatedMethod t() {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r0 = r7.l
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r1 = r0.b
            if (r1 != 0) goto Lf
            java.lang.Object r0 = r0.f14285a
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r0
            return r0
        Lf:
            java.lang.Object r2 = r0.f14285a
            if (r1 == 0) goto L75
            java.lang.Object r3 = r1.f14285a
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r2
            java.lang.reflect.Method r4 = r2.g
            java.lang.Class r4 = r4.getDeclaringClass()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r3 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r3
            java.lang.reflect.Method r5 = r3.g
            java.lang.Class r5 = r5.getDeclaringClass()
            if (r4 == r5) goto L35
            boolean r6 = r4.isAssignableFrom(r5)
            if (r6 == 0) goto L2e
            goto L41
        L2e:
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L35
            goto L42
        L35:
            int r4 = O(r3)
            int r5 = O(r2)
            if (r4 == r5) goto L45
            if (r4 >= r5) goto L42
        L41:
            r0 = r1
        L42:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r1 = r1.b
            goto Lf
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Conflicting getter definitions for property \""
            r1.<init>(r4)
            java.lang.String r4 = r7.getName()
            r1.append(r4)
            java.lang.String r4 = "\": "
            r1.append(r4)
            java.lang.String r2 = r2.i()
            r1.append(r2)
            java.lang.String r2 = " vs "
            r1.append(r2)
            java.lang.String r2 = r3.i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L75:
            com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked r0 = r0.e()
            r7.l = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.t():com.fasterxml.jackson.databind.introspect.AnnotatedMethod");
    }

    public final String toString() {
        return "[Property '" + this.h + "'; ctors: " + this.k + ", field(s): " + this.j + ", getter(s): " + this.l + ", setter(s): " + this.m + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final JavaType u() {
        if (this.e) {
            Annotated annotatedT = t();
            return (annotatedT == null && (annotatedT = s()) == null) ? TypeFactory.o() : annotatedT.f();
        }
        Annotated annotatedQ = q();
        if (annotatedQ == null) {
            AnnotatedMethod annotatedMethodW = w();
            if (annotatedMethodW != null) {
                return annotatedMethodW.t(0);
            }
            annotatedQ = s();
        }
        return (annotatedQ == null && (annotatedQ = t()) == null) ? TypeFactory.o() : annotatedQ.f();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final Class v() {
        return u().d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final AnnotatedMethod w() {
        Object obj;
        Linked linked = this.m;
        if (linked == null) {
            return null;
        }
        Linked linked2 = linked.b;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.f14285a;
        }
        while (true) {
            Object obj2 = linked.f14285a;
            if (linked2 == null) {
                this.m = linked.e();
                return (AnnotatedMethod) obj2;
            }
            Linked linked3 = linked2.b;
            Object obj3 = linked2.f14285a;
            AnnotatedMethod annotatedMethodQ = Q((AnnotatedMethod) obj2, (AnnotatedMethod) obj3);
            if (annotatedMethodQ != obj2) {
                if (annotatedMethodQ != obj3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(obj2);
                    arrayList.add(obj3);
                    while (true) {
                        obj = linked.f14285a;
                        if (linked3 == null) {
                            break;
                        }
                        Object obj4 = linked3.f14285a;
                        AnnotatedMethod annotatedMethodQ2 = Q((AnnotatedMethod) obj, (AnnotatedMethod) obj4);
                        if (annotatedMethodQ2 != obj) {
                            if (annotatedMethodQ2 == obj4) {
                                arrayList.clear();
                                linked = linked3;
                            } else {
                                arrayList.add(obj4);
                            }
                        }
                        linked3 = linked3.b;
                    }
                    if (arrayList.isEmpty()) {
                        this.m = linked.e();
                        return (AnnotatedMethod) obj;
                    }
                    throw new IllegalArgumentException(a.i("Conflicting setter definitions for property \"", getName(), "\": ", (String) arrayList.stream().map(new au.com.woolworths.android.onesite.network.a(1)).collect(Collectors.joining(" vs "))));
                }
                linked = linked2;
            }
            linked2 = linked3;
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final PropertyName x() {
        AnnotationIntrospector annotationIntrospector;
        if (V() == null || (annotationIntrospector = this.g) == null) {
            return null;
        }
        return annotationIntrospector.f0();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean y() {
        return this.k != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public final boolean z() {
        return this.j != null;
    }

    public POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this.f = pOJOPropertyBuilder.f;
        this.g = pOJOPropertyBuilder.g;
        this.i = pOJOPropertyBuilder.i;
        this.h = propertyName;
        this.j = pOJOPropertyBuilder.j;
        this.k = pOJOPropertyBuilder.k;
        this.l = pOJOPropertyBuilder.l;
        this.m = pOJOPropertyBuilder.m;
        this.e = pOJOPropertyBuilder.e;
    }
}
