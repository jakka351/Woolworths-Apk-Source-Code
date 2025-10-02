package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.core.SpecificationComputer;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/layout/SidecarAdapter;", "", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SidecarAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final SpecificationComputer.VerificationMode f3879a = SpecificationComputer.VerificationMode.d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/SidecarAdapter$Companion;", "", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static int a(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.h(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return 0;
                }
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke != null) {
                    return ((Integer) objInvoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }

        public static int b(SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.h(sidecarDeviceState, "sidecarDeviceState");
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        public static List c(SidecarWindowLayoutInfo info) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            List list;
            EmptyList emptyList = EmptyList.d;
            Intrinsics.h(info, "info");
            try {
                try {
                    list = info.displayFeatures;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                return list == null ? emptyList : list;
            } catch (NoSuchFieldError unused2) {
                Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                if (objInvoke != null) {
                    return (List) objInvoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            }
        }

        public static void d(SidecarDeviceState sidecarDeviceState, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                try {
                    sidecarDeviceState.posture = i;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (Intrinsics.c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return Intrinsics.c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    public final WindowLayoutInfo c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo(EmptyList.d);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        Companion.d(sidecarDeviceState2, Companion.b(sidecarDeviceState));
        return new WindowLayoutInfo(d(Companion.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HardwareFoldingFeature hardwareFoldingFeatureE = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (hardwareFoldingFeatureE != null) {
                arrayList.add(hardwareFoldingFeatureE);
            }
        }
        return arrayList;
    }

    public final HardwareFoldingFeature e(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HardwareFoldingFeature.Type type;
        FoldingFeature.State state;
        Intrinsics.h(feature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) SpecificationComputer.Companion.a(feature, this.f3879a).c("Type must be either TYPE_FOLD or TYPE_HINGE", SidecarAdapter$translate$checkedFeature$1.h).c("Feature bounds must not be 0", SidecarAdapter$translate$checkedFeature$2.h).c("TYPE_FOLD must have 0 area", SidecarAdapter$translate$checkedFeature$3.h).c("Feature be pinned to either left or top", SidecarAdapter$translate$checkedFeature$4.h).getF3871a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type2 = sidecarDisplayFeature.getType();
        if (type2 == 1) {
            type = HardwareFoldingFeature.Type.b;
        } else {
            if (type2 != 2) {
                return null;
            }
            type = HardwareFoldingFeature.Type.c;
        }
        int iB = Companion.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB != 2) {
            state = FoldingFeature.State.b;
            if (iB != 3 && iB == 4) {
                return null;
            }
        } else {
            state = FoldingFeature.State.c;
        }
        Rect rect = feature.getRect();
        Intrinsics.g(rect, "feature.rect");
        return new HardwareFoldingFeature(new Bounds(rect), type, state);
    }
}
