package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {
    public final int d;
    public final ArrayList e;
    public final ArrayList f;
    public final RippleHostMap g;
    public int h;

    public RippleContainer(@NotNull Context context) {
        super(context);
        this.d = 5;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.g = new RippleHostMap();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.h = 1;
        setTag(com.woolworths.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final RippleHostView a(RippleHostKey rippleHostKey) {
        RippleHostMap rippleHostMap = this.g;
        LinkedHashMap linkedHashMap = rippleHostMap.f1389a;
        LinkedHashMap linkedHashMap2 = rippleHostMap.f1389a;
        LinkedHashMap linkedHashMap3 = rippleHostMap.b;
        RippleHostView rippleHostView = (RippleHostView) linkedHashMap.get(rippleHostKey);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        RippleHostView rippleHostView2 = (RippleHostView) CollectionsKt.i0(this.f);
        if (rippleHostView2 == null) {
            int i = this.h;
            ArrayList arrayList = this.e;
            if (i > CollectionsKt.I(arrayList)) {
                rippleHostView2 = new RippleHostView(getContext());
                addView(rippleHostView2);
                arrayList.add(rippleHostView2);
            } else {
                rippleHostView2 = (RippleHostView) arrayList.get(this.h);
                RippleHostKey rippleHostKey2 = (RippleHostKey) linkedHashMap3.get(rippleHostView2);
                if (rippleHostKey2 != null) {
                    rippleHostKey2.M1();
                    RippleHostView rippleHostView3 = (RippleHostView) linkedHashMap2.get(rippleHostKey2);
                    if (rippleHostView3 != null) {
                    }
                    linkedHashMap2.remove(rippleHostKey2);
                    rippleHostView2.c();
                }
            }
            int i2 = this.h;
            if (i2 < this.d - 1) {
                this.h = i2 + 1;
            } else {
                this.h = 0;
            }
        }
        linkedHashMap2.put(rippleHostKey, rippleHostView2);
        linkedHashMap3.put(rippleHostView2, rippleHostKey);
        return rippleHostView2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
