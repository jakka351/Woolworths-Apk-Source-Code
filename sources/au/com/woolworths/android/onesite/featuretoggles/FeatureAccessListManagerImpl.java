package au.com.woolworths.android.onesite.featuretoggles;

import androidx.camera.core.impl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/FeatureAccessListManagerImpl;", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureAccessListManager;", "Companion", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatureAccessListManagerImpl implements FeatureAccessListManager {
    public static final /* synthetic */ KProperty[] c;

    /* renamed from: a, reason: collision with root package name */
    public List f4253a;
    public List b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/featuretoggles/FeatureAccessListManagerImpl$Companion;", "", "", "CACHED_MASTER_ACCESS_LIST_PREF_KEY", "Ljava/lang/String;", "CACHED_ACCESS_LIST_PREF_KEY", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(FeatureAccessListManagerImpl.class, "cachedMasterAccessListedFeatures", "getCachedMasterAccessListedFeatures()Ljava/util/Set;", 0);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        c = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(FeatureAccessListManagerImpl.class, "cachedAccessListedFeatures", "getCachedAccessListedFeatures()Ljava/util/Set;", 0, reflectionFactory)};
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManager
    public final void a() {
        EmptyList emptyList = EmptyList.d;
        this.b = emptyList;
        this.f4253a = emptyList;
        KProperty kProperty = c[1];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManagerImpl$fetchAccessList$1
            if (r0 == 0) goto L13
            r0 = r5
            au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManagerImpl$fetchAccessList$1 r0 = (au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManagerImpl$fetchAccessList$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L1a
        L13:
            au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManagerImpl$fetchAccessList$1 r0 = new au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManagerImpl$fetchAccessList$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r5 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r0.r
            r1 = 0
            if (r0 == 0) goto L51
            r2 = 1
            if (r0 != r2) goto L49
            kotlin.ResultKt.b(r5)
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r0 = r5.d
            java.util.List r0 = (java.util.List) r0
            r4.b = r0
            java.lang.Object r5 = r5.e
            java.util.List r5 = (java.util.List) r5
            r4.f4253a = r5
            if (r0 != 0) goto L3f
            java.lang.String r5 = "usersAccessListedFeatures"
            kotlin.jvm.internal.Intrinsics.p(r5)
            throw r1
        L3f:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.L0(r0)
            kotlin.reflect.KProperty[] r5 = au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManagerImpl.c
            r5 = r5[r2]
            throw r1
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L51:
            kotlin.ResultKt.b(r5)
            au.com.woolworths.android.onesite.featuretoggles.BaseFeature r5 = au.com.woolworths.android.onesite.featuretoggles.BaseFeature.d
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.featuretoggles.FeatureAccessListManagerImpl.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
