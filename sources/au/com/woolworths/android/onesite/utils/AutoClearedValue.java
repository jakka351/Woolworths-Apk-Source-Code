package au.com.woolworths.android.onesite.utils;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.fragment.e;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/utils/AutoClearedValue;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/properties/ReadWriteProperty;", "Landroidx/fragment/app/Fragment;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoClearedValue<T> implements ReadWriteProperty<Fragment, T> {

    /* renamed from: a, reason: collision with root package name */
    public final Fragment f4593a;
    public Object b;

    public AutoClearedValue(Fragment fragment2) {
        this.f4593a = fragment2;
        fragment2.getD().a(new DefaultLifecycleObserver() { // from class: au.com.woolworths.android.onesite.utils.AutoClearedValue.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onCreate(LifecycleOwner owner) {
                Intrinsics.h(owner, "owner");
                AutoClearedValue autoClearedValue = AutoClearedValue.this;
                Fragment fragment3 = autoClearedValue.f4593a;
                fragment3.getViewLifecycleOwnerLiveData().f(fragment3, new AutoClearedValueKt$sam$androidx_lifecycle_Observer$0(new e(autoClearedValue, 6)));
            }
        });
    }

    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object getValue(Fragment thisRef, KProperty property) {
        Intrinsics.h(thisRef, "thisRef");
        Intrinsics.h(property, "property");
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("should never call auto-cleared-value get when it might not be available");
    }

    public final void b(Fragment thisRef, KProperty property, Object value) {
        Intrinsics.h(thisRef, "thisRef");
        Intrinsics.h(property, "property");
        Intrinsics.h(value, "value");
        this.b = value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public final /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        throw null;
    }
}
