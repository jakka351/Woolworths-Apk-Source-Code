package androidx.databinding;

import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public class MergedDataBinderMapper extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f2547a = new HashSet();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding b(DataBindingComponent dataBindingComponent, View view, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ViewDataBinding viewDataBindingB = ((DataBinderMapper) it.next()).b(dataBindingComponent, view, i);
            if (viewDataBindingB != null) {
                return viewDataBindingB;
            }
        }
        if (f()) {
            return b(dataBindingComponent, view, i);
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final ViewDataBinding c(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ViewDataBinding viewDataBindingC = ((DataBinderMapper) it.next()).c(dataBindingComponent, viewArr, i);
            if (viewDataBindingC != null) {
                return viewDataBindingC;
            }
        }
        if (f()) {
            return c(dataBindingComponent, viewArr, i);
        }
        return null;
    }

    @Override // androidx.databinding.DataBinderMapper
    public final int d(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            int iD = ((DataBinderMapper) it.next()).d(str);
            if (iD != 0) {
                return iD;
            }
        }
        if (f()) {
            return d(str);
        }
        return 0;
    }

    public final void e(DataBinderMapper dataBinderMapper) {
        if (this.f2547a.add(dataBinderMapper.getClass())) {
            this.b.add(dataBinderMapper);
            Iterator it = dataBinderMapper.a().iterator();
            while (it.hasNext()) {
                e((DataBinderMapper) it.next());
            }
        }
    }

    public final boolean f() throws ClassNotFoundException {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (DataBinderMapper.class.isAssignableFrom(cls)) {
                    e((DataBinderMapper) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        return z;
    }
}
