package au.com.woolworths.android.onesite.analytics.tealium;

import com.tealium.core.Tealium;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/tealium/TealiumSelectorImpl;", "Lau/com/woolworths/android/onesite/analytics/tealium/TealiumSelector;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TealiumSelectorImpl implements TealiumSelector {
    public static final /* synthetic */ KProperty[] e = {Reflection.f24268a.e(new MutablePropertyReference1Impl(TealiumSelectorImpl.class, "region", "getRegion()Ljava/lang/String;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final Tealium f4076a;
    public final Map b;
    public Tealium c;
    public final TealiumSelectorImpl$special$$inlined$vetoable$1 d;

    /* JADX WARN: Type inference failed for: r2v1, types: [au.com.woolworths.android.onesite.analytics.tealium.TealiumSelectorImpl$special$$inlined$vetoable$1] */
    public TealiumSelectorImpl(Tealium tealiumDefault, Map map) {
        Intrinsics.h(tealiumDefault, "tealiumDefault");
        this.f4076a = tealiumDefault;
        this.b = map;
        this.d = new ObservableProperty<String>() { // from class: au.com.woolworths.android.onesite.analytics.tealium.TealiumSelectorImpl$special$$inlined$vetoable$1
            {
                super("");
            }

            @Override // kotlin.properties.ObservableProperty
            public final boolean beforeChange(KProperty property, String str, String str2) {
                Intrinsics.h(property, "property");
                TealiumSelectorImpl tealiumSelectorImpl = this.b;
                Tealium tealium = (Tealium) tealiumSelectorImpl.b.get(str2);
                if (tealium == null) {
                    tealium = null;
                }
                if (tealium == null) {
                    return false;
                }
                tealiumSelectorImpl.c = tealium;
                return true;
            }
        };
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumSelector
    public final Tealium a() {
        Tealium tealium = this.c;
        return tealium == null ? this.f4076a : tealium;
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumSelector
    public final void b(String str) {
        setValue(this, e[0], str);
    }

    @Override // au.com.woolworths.android.onesite.analytics.tealium.TealiumSelector
    public final String c() {
        return (String) getValue(this, e[0]);
    }
}
