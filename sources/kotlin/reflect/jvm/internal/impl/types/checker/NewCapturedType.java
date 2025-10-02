package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {
    public final CaptureStatus e;
    public final NewCapturedTypeConstructor f;
    public final UnwrappedType g;
    public final TypeAttributes h;
    public final boolean i;
    public final boolean j;

    public NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor constructor, UnwrappedType unwrappedType, TypeAttributes attributes, boolean z, boolean z2) {
        Intrinsics.h(captureStatus, "captureStatus");
        Intrinsics.h(constructor, "constructor");
        Intrinsics.h(attributes, "attributes");
        this.e = captureStatus;
        this.f = constructor;
        this.g = unwrappedType;
        this.h = attributes;
        this.i = z;
        this.j = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final List H0() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes I0() {
        return this.h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeConstructor J0() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return this.i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(boolean z) {
        return new NewCapturedType(this.e, this.f, this.g, this.h, z, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: Q0 */
    public final SimpleType N0(boolean z) {
        return new NewCapturedType(this.e, this.f, this.g, this.h, z, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* renamed from: R0 */
    public final SimpleType P0(TypeAttributes newAttributes) {
        Intrinsics.h(newAttributes, "newAttributes");
        return new NewCapturedType(this.e, this.f, this.g, newAttributes, this.i, this.j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final NewCapturedType L0(final KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        final NewCapturedTypeConstructor newCapturedTypeConstructor = this.f;
        newCapturedTypeConstructor.getClass();
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionC = newCapturedTypeConstructor.f24627a.c(kotlinTypeRefiner);
        Function0 function0 = newCapturedTypeConstructor.b != null ? new Function0(newCapturedTypeConstructor, kotlinTypeRefiner) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$3
            public final NewCapturedTypeConstructor d;
            public final KotlinTypeRefiner e;

            {
                this.d = newCapturedTypeConstructor;
                this.e = kotlinTypeRefiner;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Iterable iterable = (List) this.d.e.getD();
                if (iterable == null) {
                    iterable = EmptyList.d;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UnwrappedType) it.next()).L0(this.e));
                }
                return arrayList;
            }
        } : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = newCapturedTypeConstructor.c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = newCapturedTypeConstructor;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = new NewCapturedTypeConstructor(typeProjectionC, function0, newCapturedTypeConstructor2, newCapturedTypeConstructor.d);
        UnwrappedType unwrappedType = this.g;
        return new NewCapturedType(this.e, newCapturedTypeConstructor3, unwrappedType != null ? kotlinTypeRefiner.a(unwrappedType).M0() : null, this.h, this.i, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope s() {
        return ErrorUtils.a(ErrorScopeKind.e, true, new String[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z, int i) {
        if ((i & 8) != 0) {
            TypeAttributes.e.getClass();
            typeAttributes = TypeAttributes.f;
        }
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, typeAttributes, (i & 16) != 0 ? false : z, false);
    }
}
