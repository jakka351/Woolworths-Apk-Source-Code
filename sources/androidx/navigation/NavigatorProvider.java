package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/NavigatorProvider;", "", "Companion", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint
@SourceDebugExtension
/* loaded from: classes2.dex */
public class NavigatorProvider {
    public static final LinkedHashMap b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3491a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R&\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/NavigatorProvider$Companion;", "", "", "Ljava/lang/Class;", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = NavigatorProvider.b;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
                strValue = name != null ? name.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, strValue);
            }
            Intrinsics.e(strValue);
            return strValue;
        }
    }

    public final void a(Navigator navigator) {
        Intrinsics.h(navigator, "navigator");
        String strA = Companion.a(navigator.getClass());
        if (strA.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f3491a;
        Navigator navigator2 = (Navigator) linkedHashMap.get(strA);
        if (Intrinsics.c(navigator2, navigator)) {
            return;
        }
        if (navigator2 != null && navigator2.b) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public Navigator b(String name) {
        Intrinsics.h(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator navigator = (Navigator) this.f3491a.get(name);
        if (navigator != null) {
            return navigator;
        }
        throw new IllegalStateException(YU.a.h("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
