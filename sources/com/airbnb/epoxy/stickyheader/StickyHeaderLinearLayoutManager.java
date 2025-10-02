package com.airbnb.epoxy.stickyheader;

import YU.a;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.camera.core.impl.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.BaseEpoxyAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "HeaderPositionsAdapterDataObserver", "SavedState", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {
    public BaseEpoxyAdapter E;
    public final ArrayList F;
    public final HeaderPositionsAdapterDataObserver G;
    public View H;
    public int I;
    public int J;
    public int K;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$HeaderPositionsAdapterDataObserver;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class HeaderPositionsAdapterDataObserver extends RecyclerView.AdapterDataObserver {
        public HeaderPositionsAdapterDataObserver() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void a() {
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            ArrayList arrayList = stickyHeaderLinearLayoutManager.F;
            arrayList.clear();
            BaseEpoxyAdapter baseEpoxyAdapter = stickyHeaderLinearLayoutManager.E;
            int i = baseEpoxyAdapter != null ? baseEpoxyAdapter.i() : 0;
            for (int i2 = 0; i2 < i; i2++) {
                BaseEpoxyAdapter baseEpoxyAdapter2 = stickyHeaderLinearLayoutManager.E;
                if (baseEpoxyAdapter2 != null ? baseEpoxyAdapter2.J(i2) : false) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (stickyHeaderLinearLayoutManager.H == null || arrayList.contains(Integer.valueOf(stickyHeaderLinearLayoutManager.I))) {
                return;
            }
            stickyHeaderLinearLayoutManager.I1(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i, int i2) {
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            ArrayList arrayList = stickyHeaderLinearLayoutManager.F;
            int size = arrayList.size();
            if (size > 0) {
                for (int iZ1 = StickyHeaderLinearLayoutManager.z1(stickyHeaderLinearLayoutManager, i); iZ1 != -1 && iZ1 < size; iZ1++) {
                    arrayList.set(iZ1, Integer.valueOf(((Number) arrayList.get(iZ1)).intValue() + i2));
                }
            }
            int i3 = i2 + i;
            while (i < i3) {
                BaseEpoxyAdapter baseEpoxyAdapter = stickyHeaderLinearLayoutManager.E;
                if (baseEpoxyAdapter != null ? baseEpoxyAdapter.J(i) : false) {
                    int iZ12 = StickyHeaderLinearLayoutManager.z1(stickyHeaderLinearLayoutManager, i);
                    if (iZ12 != -1) {
                        arrayList.add(iZ12, Integer.valueOf(i));
                    } else {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                i++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void e(int i, int i2) {
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            ArrayList arrayList = stickyHeaderLinearLayoutManager.F;
            int size = arrayList.size();
            if (size > 0) {
                if (i < i2) {
                    for (int iZ1 = StickyHeaderLinearLayoutManager.z1(stickyHeaderLinearLayoutManager, i); iZ1 != -1 && iZ1 < size; iZ1++) {
                        int iIntValue = ((Number) arrayList.get(iZ1)).intValue();
                        if (iIntValue >= i && iIntValue < i + 1) {
                            arrayList.set(iZ1, Integer.valueOf(iIntValue - (i2 - i)));
                            g(iZ1);
                        } else {
                            if (iIntValue < i + 1 || iIntValue > i2) {
                                return;
                            }
                            arrayList.set(iZ1, Integer.valueOf(iIntValue - 1));
                            g(iZ1);
                        }
                    }
                    return;
                }
                for (int iZ12 = StickyHeaderLinearLayoutManager.z1(stickyHeaderLinearLayoutManager, i2); iZ12 != -1 && iZ12 < size; iZ12++) {
                    int iIntValue2 = ((Number) arrayList.get(iZ12)).intValue();
                    if (iIntValue2 >= i && iIntValue2 < i + 1) {
                        arrayList.set(iZ12, Integer.valueOf((i2 - i) + iIntValue2));
                        g(iZ12);
                    } else {
                        if (i2 > iIntValue2 || iIntValue2 > i) {
                            return;
                        }
                        arrayList.set(iZ12, Integer.valueOf(iIntValue2 + 1));
                        g(iZ12);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void f(int i, int i2) {
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            ArrayList arrayList = stickyHeaderLinearLayoutManager.F;
            int size = arrayList.size();
            if (size > 0) {
                int i3 = i + i2;
                int i4 = i3 - 1;
                if (i <= i4) {
                    while (true) {
                        int iE1 = stickyHeaderLinearLayoutManager.E1(i4);
                        if (iE1 != -1) {
                            arrayList.remove(iE1);
                            size--;
                        }
                        if (i4 == i) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                if (stickyHeaderLinearLayoutManager.H != null && !arrayList.contains(Integer.valueOf(stickyHeaderLinearLayoutManager.I))) {
                    stickyHeaderLinearLayoutManager.I1(null);
                }
                for (int iZ1 = StickyHeaderLinearLayoutManager.z1(stickyHeaderLinearLayoutManager, i3); iZ1 != -1 && iZ1 < size; iZ1++) {
                    arrayList.set(iZ1, Integer.valueOf(((Number) arrayList.get(iZ1)).intValue() - i2));
                }
            }
        }

        public final void g(int i) {
            StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = StickyHeaderLinearLayoutManager.this;
            ArrayList arrayList = stickyHeaderLinearLayoutManager.F;
            int iIntValue = ((Number) arrayList.remove(i)).intValue();
            int iZ1 = StickyHeaderLinearLayoutManager.z1(stickyHeaderLinearLayoutManager, iIntValue);
            if (iZ1 != -1) {
                arrayList.add(iZ1, Integer.valueOf(iIntValue));
            } else {
                arrayList.add(Integer.valueOf(iIntValue));
            }
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager$SavedState;", "Landroid/os/Parcelable;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SavedState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        public final Parcelable d;
        public final int e;
        public final int f;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable superState, int i, int i2) {
            Intrinsics.h(superState, "superState");
            this.d = superState;
            this.e = i;
            this.f = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return Intrinsics.c(this.d, savedState.d) && this.e == savedState.e && this.f == savedState.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + b.a(this.e, this.d.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SavedState(superState=");
            sb.append(this.d);
            sb.append(", scrollPosition=");
            sb.append(this.e);
            sb.append(", scrollOffset=");
            return a.l(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.h(out, "out");
            out.writeParcelable(this.d, i);
            out.writeInt(this.e);
            out.writeInt(this.f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StickyHeaderLinearLayoutManager(@NotNull Context context) {
        super(1);
        Intrinsics.h(context, "context");
        this.F = new ArrayList();
        this.G = new HeaderPositionsAdapterDataObserver();
        this.I = -1;
        this.J = -1;
    }

    public static final int z1(StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager, int i) {
        ArrayList arrayList = stickyHeaderLinearLayoutManager.F;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (((Number) arrayList.get(i4)).intValue() >= i) {
                    size = i4;
                }
            }
            if (((Number) arrayList.get(i3)).intValue() >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int D0(final int i, final RecyclerView.Recycler recycler, final RecyclerView.State state) {
        Intrinsics.h(recycler, "recycler");
        Intrinsics.h(state, "state");
        int iIntValue = ((Number) H1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$scrollHorizontallyBy$scrolled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(super/*androidx.recyclerview.widget.LinearLayoutManager*/.D0(i, recycler, state));
            }
        })).intValue();
        if (iIntValue != 0) {
            K1(recycler, false);
        }
        return iIntValue;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void E0(int i) {
        s1(i, Integer.MIN_VALUE);
    }

    public final int E1(int i) {
        ArrayList arrayList = this.F;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Number) arrayList.get(i3)).intValue() > i) {
                size = i3 - 1;
            } else {
                if (((Number) arrayList.get(i3)).intValue() >= i) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int F0(final int i, final RecyclerView.Recycler recycler, final RecyclerView.State state) {
        Intrinsics.h(recycler, "recycler");
        Intrinsics.h(state, "state");
        int iIntValue = ((Number) H1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$scrollVerticallyBy$scrolled$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(super/*androidx.recyclerview.widget.LinearLayoutManager*/.F0(i, recycler, state));
            }
        })).intValue();
        if (iIntValue != 0) {
            K1(recycler, false);
        }
        return iIntValue;
    }

    public final int F1(int i) {
        ArrayList arrayList = this.F;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Number) arrayList.get(i3)).intValue() <= i) {
                if (i3 < arrayList.size() - 1) {
                    i2 = i3 + 1;
                    if (((Number) arrayList.get(i2)).intValue() <= i) {
                    }
                }
                return i3;
            }
            size = i3 - 1;
        }
        return -1;
    }

    public final void G1(View view) {
        Y(view);
        if (this.p == 1) {
            view.layout(L(), 0, this.n - M(), view.getMeasuredHeight());
        } else {
            view.layout(0, N(), view.getMeasuredWidth(), this.o - K());
        }
    }

    public final Object H1(Function0 function0) {
        View view = this.H;
        if (view != null) {
            t(view);
        }
        Object objInvoke = function0.invoke();
        View view2 = this.H;
        if (view2 != null) {
            e(-1, view2);
        }
        return objInvoke;
    }

    public final void I1(RecyclerView.Recycler recycler) {
        View view = this.H;
        if (view == null) {
            return;
        }
        this.H = null;
        this.I = -1;
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        BaseEpoxyAdapter baseEpoxyAdapter = this.E;
        if (baseEpoxyAdapter != null) {
            baseEpoxyAdapter.Q(view);
        }
        RecyclerView.ViewHolder viewHolderP = RecyclerView.P(view);
        viewHolderP.stopIgnoring();
        viewHolderP.resetInternal();
        viewHolderP.addFlags(4);
        z0(view);
        if (recycler != null) {
            recycler.i(view);
        }
    }

    public final void J1(RecyclerView.Adapter adapter) {
        BaseEpoxyAdapter baseEpoxyAdapter = this.E;
        HeaderPositionsAdapterDataObserver headerPositionsAdapterDataObserver = this.G;
        if (baseEpoxyAdapter != null) {
            baseEpoxyAdapter.F(headerPositionsAdapterDataObserver);
        }
        if (!(adapter instanceof BaseEpoxyAdapter)) {
            this.E = null;
            this.F.clear();
        } else {
            BaseEpoxyAdapter baseEpoxyAdapter2 = (BaseEpoxyAdapter) adapter;
            this.E = baseEpoxyAdapter2;
            baseEpoxyAdapter2.D(headerPositionsAdapterDataObserver);
            headerPositionsAdapterDataObserver.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d6 A[PHI: r1
  0x01d6: PHI (r1v16 float) = (r1v15 float), (r1v19 float) binds: [B:117:0x01e5, B:113:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022f A[PHI: r15
  0x022f: PHI (r15v9 float) = (r15v8 float), (r15v12 float) binds: [B:145:0x023e, B:141:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1(androidx.recyclerview.widget.RecyclerView.Recycler r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager.K1(androidx.recyclerview.widget.RecyclerView$Recycler, boolean):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF a(final int i) {
        return (PointF) H1(new Function0<PointF>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return super/*androidx.recyclerview.widget.LinearLayoutManager*/.a(i);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void b0(RecyclerView.Adapter adapter) {
        J1(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void c0(RecyclerView recyclerView) {
        J1(recyclerView.getAdapter());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View e0(final View view, final int i, final RecyclerView.Recycler recycler, final RecyclerView.State state) {
        Intrinsics.h(recycler, "recycler");
        Intrinsics.h(state, "state");
        return (View) H1(new Function0<View>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$onFocusSearchFailed$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return super/*androidx.recyclerview.widget.LinearLayoutManager*/.e0(view, i, recycler, state);
            }
        });
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int m(final RecyclerView.State state) {
        Intrinsics.h(state, "state");
        return ((Number) H1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollExtent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.h.T0(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int n(final RecyclerView.State state) {
        Intrinsics.h(state, "state");
        return ((Number) H1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.h.U0(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int o(final RecyclerView.State state) {
        Intrinsics.h(state, "state");
        return ((Number) H1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeHorizontalScrollRange$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.h.V0(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void o0(final RecyclerView.Recycler recycler, final RecyclerView.State state) {
        Intrinsics.h(recycler, "recycler");
        Intrinsics.h(state, "state");
        H1(new Function0<Unit>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$onLayoutChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                super/*androidx.recyclerview.widget.LinearLayoutManager*/.o0(recycler, state);
                return Unit.f24250a;
            }
        });
        if (state.g) {
            return;
        }
        K1(recycler, true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int p(final RecyclerView.State state) {
        Intrinsics.h(state, "state");
        return ((Number) H1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollExtent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.h.T0(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int q(final RecyclerView.State state) {
        Intrinsics.h(state, "state");
        return ((Number) H1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.h.U0(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int r(final RecyclerView.State state) {
        Intrinsics.h(state, "state");
        return ((Number) H1(new Function0<Integer>() { // from class: com.airbnb.epoxy.stickyheader.StickyHeaderLinearLayoutManager$computeVerticalScrollRange$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.h.V0(state));
            }
        })).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void r0(Parcelable state) {
        Intrinsics.h(state, "state");
        SavedState savedState = (SavedState) state;
        this.J = savedState.e;
        this.K = savedState.f;
        super.r0(savedState.d);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable s0() {
        return new SavedState(super.s0(), this.J, this.K);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void s1(int i, int i2) {
        this.J = -1;
        this.K = Integer.MIN_VALUE;
        int iF1 = F1(i);
        if (iF1 == -1 || E1(i) != -1) {
            super.s1(i, i2);
            return;
        }
        int i3 = i - 1;
        if (E1(i3) != -1) {
            super.s1(i3, i2);
            return;
        }
        if (this.H == null || iF1 != E1(this.I)) {
            this.J = i;
            this.K = i2;
            super.s1(i, i2);
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            View view = this.H;
            Intrinsics.e(view);
            super.s1(i, view.getHeight() + i2);
        }
    }
}
