package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

@RestrictTo
@UiThread
/* loaded from: classes6.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14590a = new HashMap();
    public final HashSet b = new HashSet();
    public OnCheckedStateChangeListener c;
    public boolean d;
    public boolean e;

    public interface OnCheckedStateChangeListener {
        void a();
    }

    public final void a(Chip chip) {
        this.f14590a.put(Integer.valueOf(chip.getId()), chip);
        if (chip.isChecked()) {
            b(chip);
        }
        chip.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<MaterialCheckable<Object>>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public final void a(Object obj, boolean z) {
                MaterialCheckable materialCheckable = (MaterialCheckable) obj;
                CheckableGroup checkableGroup = CheckableGroup.this;
                if (z) {
                    if (!checkableGroup.b(materialCheckable)) {
                        return;
                    }
                } else if (!checkableGroup.e(materialCheckable, checkableGroup.e)) {
                    return;
                }
                OnCheckedStateChangeListener onCheckedStateChangeListener = checkableGroup.c;
                if (onCheckedStateChangeListener != null) {
                    new HashSet(checkableGroup.b);
                    onCheckedStateChangeListener.a();
                }
            }
        });
    }

    public final boolean b(MaterialCheckable materialCheckable) {
        int id = materialCheckable.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        MaterialCheckable materialCheckable2 = (MaterialCheckable) this.f14590a.get(Integer.valueOf(d()));
        if (materialCheckable2 != null) {
            e(materialCheckable2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    public final ArrayList c(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MaterialCheckable) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int d() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final boolean e(MaterialCheckable materialCheckable, boolean z) {
        int id = materialCheckable.getId();
        Integer numValueOf = Integer.valueOf(id);
        HashSet hashSet = this.b;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }
}
