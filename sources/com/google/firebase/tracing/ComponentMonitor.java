package com.google.firebase.tracing;

import androidx.work.d;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public final List e(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (Component component : componentRegistrar.getComponents()) {
            String str = component.f15222a;
            if (str != null) {
                component = new Component(str, component.b, component.c, component.d, component.e, new d(7, str, component), component.g);
            }
            arrayList.add(component);
        }
        return arrayList;
    }
}
