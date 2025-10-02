package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractClassDescriptor f24342a;
    public final Function1 b;
    public final KotlinTypeRefiner c;
    public final NotNullLazyValue d;
    public static final /* synthetic */ KProperty[] f = {Reflection.f24268a.h(new PropertyReference1Impl(ScopesHolderForClass.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public static final Companion e = new Companion();

    public static final class Companion {
    }

    public ScopesHolderForClass(AbstractClassDescriptor abstractClassDescriptor, StorageManager storageManager, Function1 function1, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f24342a = abstractClassDescriptor;
        this.b = function1;
        this.c = kotlinTypeRefiner;
        this.d = storageManager.d(new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass$$Lambda$0
            public final ScopesHolderForClass d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScopesHolderForClass scopesHolderForClass = this.d;
                return (MemberScope) scopesHolderForClass.b.invoke(scopesHolderForClass.c);
            }
        });
    }

    public final MemberScope a(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.c(DescriptorUtilsKt.j(this.f24342a));
        return (MemberScope) StorageKt.a(this.d, f[0]);
    }
}
