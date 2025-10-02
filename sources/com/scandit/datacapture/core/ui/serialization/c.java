package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup.ControlDeserializer;
import com.scandit.datacapture.core.ui.control.Control;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f18944a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ Map d;
    final /* synthetic */ Map e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, List list, ArrayList arrayList2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        super(4);
        this.f18944a = arrayList;
        this.b = list;
        this.c = arrayList2;
        this.d = linkedHashMap;
        this.e = linkedHashMap2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Control control = (Control) obj;
        ControlDeserializer.ControlAction action = (ControlDeserializer.ControlAction) obj2;
        Anchor anchor = (Anchor) obj3;
        PointWithUnit offset = (PointWithUnit) obj4;
        Intrinsics.h(control, "control");
        Intrinsics.h(action, "action");
        Intrinsics.h(anchor, "anchor");
        Intrinsics.h(offset, "offset");
        if (action == ControlDeserializer.ControlAction.ADD) {
            this.f18944a.add(control);
        } else {
            this.b.remove(control);
            this.c.add(control);
        }
        this.d.put(control, anchor);
        this.e.put(control, offset);
        return Unit.f24250a;
    }
}
