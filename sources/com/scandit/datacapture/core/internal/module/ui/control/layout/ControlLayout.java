package com.scandit.datacapture.core.internal.module.ui.control.layout;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.C1126t1;
import com.scandit.datacapture.core.InterfaceC1117s1;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.ui.control.Control;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ControlLayout extends FrameLayout {
    private static final FloatWithUnit c;
    private static final FloatWithUnit d;
    private static final FloatWithUnit e;
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1117s1 f18626a;
    private final LinkedHashMap b;

    static {
        MeasureUnit measureUnit = MeasureUnit.DIP;
        c = new FloatWithUnit(16.0f, measureUnit);
        d = new FloatWithUnit(24.0f, measureUnit);
        e = new FloatWithUnit(54.0f, measureUnit);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlLayout(Context context, C1126t1 positioner) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(positioner, "positioner");
        this.f18626a = positioner;
        this.b = new LinkedHashMap();
    }

    public final Collection d() {
        return this.b.values();
    }

    public final void e() {
        Iterator it = CollectionsKt.J0(this.b.values()).iterator();
        while (it.hasNext()) {
            a((Control) it.next());
        }
        this.b.clear();
    }

    public final void a(Control control, Anchor anchor, PointWithUnit offset) {
        Intrinsics.h(control, "control");
        Intrinsics.h(anchor, "anchor");
        Intrinsics.h(offset, "offset");
        if (!control.get_isControlGroup()) {
            a(control.getClass());
        } else {
            Iterator<T> it = control.get_childControls().iterator();
            while (it.hasNext()) {
                a(((Control) it.next()).getClass());
            }
        }
        Control control2 = (Control) this.b.remove(anchor);
        if (control2 != null) {
            control2._onRemoveControl();
            ViewExtensionsKt.runOnMainThread(this, new b(this, control2.get_view()));
        }
        this.b.put(anchor, control);
        ViewExtensionsKt.runOnMainThread(this, new a(control, this, anchor, offset));
    }

    public final void a(Control control) {
        Intrinsics.h(control, "control");
        LinkedHashMap linkedHashMap = this.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.c((Control) entry.getValue(), control)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            Control control2 = (Control) this.b.remove((Anchor) it.next());
            if (control2 != null) {
                control2._onRemoveControl();
                ViewExtensionsKt.runOnMainThread(this, new b(this, control2.get_view()));
            }
        }
        Collection collectionValues = this.b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Control) obj).get_isControlGroup()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Control) it2.next())._removeChildControl(control);
        }
    }

    private final void a(Class cls) {
        LinkedHashMap linkedHashMap = this.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Control) entry.getValue()).getClass().equals(cls)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            Control control = (Control) this.b.remove((Anchor) it.next());
            if (control != null) {
                control._onRemoveControl();
                ViewExtensionsKt.runOnMainThread(this, new b(this, control.get_view()));
            }
        }
        Collection collectionValues = this.b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Control) obj).get_isControlGroup()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Control) it2.next())._removeChildControl(cls);
        }
    }
}
