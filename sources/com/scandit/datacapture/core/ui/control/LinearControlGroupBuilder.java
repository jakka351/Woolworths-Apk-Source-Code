package com.scandit.datacapture.core.ui.control;

import android.content.Context;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/ui/control/LinearControlGroupBuilder;", "", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroupOrientation;", "orientation", "setOrientation", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "spacing", "setSpacing", "", "Lcom/scandit/datacapture/core/ui/control/Control;", "controls", "setControls", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroup;", "build", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/ui/control/LinearControlGroup$Defaults;", "defaults", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/core/ui/control/LinearControlGroup$Defaults;)V", "(Landroid/content/Context;)V", "com/scandit/datacapture/core/ui/control/h", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LinearControlGroupBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18900a;
    private LinearControlGroupOrientation b;
    private FloatWithUnit c;
    private List d;

    public LinearControlGroupBuilder(@NotNull Context context, @NotNull LinearControlGroup.Defaults defaults) {
        Intrinsics.h(context, "context");
        Intrinsics.h(defaults, "defaults");
        this.f18900a = context;
        this.b = defaults.getOrientation();
        this.c = defaults.getSpacing();
        this.d = defaults.getControls();
    }

    @NotNull
    public final LinearControlGroup build() {
        return LinearControlGroup.INSTANCE._fromBuilderProperties(this.f18900a, this.b, this.c, this.d);
    }

    @NotNull
    public final LinearControlGroupBuilder setControls(@NotNull List<? extends Control> controls) {
        Intrinsics.h(controls, "controls");
        ArrayList arrayList = new ArrayList();
        for (Control control : controls) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Control) it.next()).getClass().isInstance(control)) {
                        break;
                    }
                }
            }
            arrayList.add(control);
        }
        this.d = arrayList;
        return this;
    }

    @NotNull
    public final LinearControlGroupBuilder setOrientation(@NotNull LinearControlGroupOrientation orientation) {
        Intrinsics.h(orientation, "orientation");
        this.b = orientation;
        return this;
    }

    @NotNull
    public final LinearControlGroupBuilder setSpacing(@NotNull FloatWithUnit spacing) {
        Intrinsics.h(spacing, "spacing");
        this.c = spacing;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearControlGroupBuilder(@NotNull Context context) {
        this(context, h.f18916a);
        Intrinsics.h(context, "context");
    }
}
