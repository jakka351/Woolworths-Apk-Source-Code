package com.airbnb.epoxy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.com.woolworths.feature.rewards.offers.ProductOffersCarouselModel_;
import com.airbnb.epoxy.EpoxyController;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class EpoxyModel<T> {
    public static long m = -1;
    public long d;
    public int e;
    public boolean f;
    public EpoxyController g;
    public EpoxyController h;
    public boolean i;
    public int j;
    public boolean k;
    public SpanSizeOverrideCallback l;

    public interface AddPredicate {
    }

    public interface SpanSizeOverrideCallback {
        int a(int i, int i2, int i3);
    }

    public EpoxyModel() {
        long j = m;
        m = j - 1;
        this.f = true;
        o(j);
        this.k = true;
    }

    public void A(Object obj) {
    }

    public final void B(int i, String str) {
        if (this.g != null && !this.i && this.j != hashCode()) {
            throw new ImmutableModelException(this, str, i);
        }
    }

    public void c(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
    }

    public final void d(EpoxyController epoxyController) {
        if (epoxyController == null) {
            throw new IllegalArgumentException("Controller cannot be null");
        }
        if (epoxyController.isModelAddedMultipleTimes(this)) {
            throw new IllegalEpoxyUsage("This model was already added to the controller at position " + epoxyController.getFirstIndexOfModelInBuildingList(this));
        }
        if (this.g == null) {
            this.g = epoxyController;
            this.j = hashCode();
            epoxyController.addAfterInterceptorCallback(new EpoxyController.ModelInterceptorCallback() { // from class: com.airbnb.epoxy.EpoxyModel.1
                @Override // com.airbnb.epoxy.EpoxyController.ModelInterceptorCallback
                public final void a() {
                    EpoxyModel.this.i = true;
                }

                @Override // com.airbnb.epoxy.EpoxyController.ModelInterceptorCallback
                public final void b() {
                    EpoxyModel epoxyModel = EpoxyModel.this;
                    epoxyModel.j = epoxyModel.hashCode();
                    epoxyModel.i = false;
                }
            });
        }
    }

    public void e(EpoxyHolder epoxyHolder, EpoxyModel epoxyModel) {
        h(epoxyHolder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpoxyModel)) {
            return false;
        }
        EpoxyModel epoxyModel = (EpoxyModel) obj;
        return this.d == epoxyModel.d && n() == epoxyModel.n() && this.f == epoxyModel.f;
    }

    public void f(EpoxyHolder epoxyHolder, List list) {
        h(epoxyHolder);
    }

    public void g(EpoxyModel epoxyModel, Object obj) {
        h(obj);
    }

    public void h(Object obj) {
    }

    public int hashCode() {
        long j = this.d;
        return ((n() + (((int) (j ^ (j >>> 32))) * 31)) * 31) + (this.f ? 1 : 0);
    }

    public void i(Object obj, List list) {
        h(obj);
    }

    public View j(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(l(), viewGroup, false);
    }

    public abstract int k();

    public final int l() {
        int i = this.e;
        return i == 0 ? k() : i;
    }

    public int m(int i, int i2, int i3) {
        return 1;
    }

    public int n() {
        return l();
    }

    public EpoxyModel o(long j) {
        if (this.g != null && j != this.d) {
            throw new IllegalEpoxyUsage("Cannot change a model's id after it has been added to the adapter.");
        }
        this.k = false;
        this.d = j;
        return this;
    }

    public void p(CharSequence charSequence) {
        o(IdUtils.a(charSequence));
    }

    public final void q(CharSequence charSequence, CharSequence... charSequenceArr) {
        long jA = IdUtils.a(charSequence);
        if (charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                jA = (jA * 31) + IdUtils.a(charSequence2);
            }
        }
        o(jA);
    }

    public final void r(Number... numberArr) {
        long j = 0;
        if (numberArr != null) {
            long j2 = 0;
            for (Number number : numberArr) {
                long j3 = j2 * 31;
                long jHashCode = number == null ? 0L : r6.hashCode();
                long j4 = jHashCode ^ (jHashCode << 21);
                long j5 = j4 ^ (j4 >>> 35);
                j2 = j3 + (j5 ^ (j5 << 4));
            }
            j = j2;
        }
        o(j);
    }

    public void s(Object obj) {
    }

    public final void t() {
        int firstIndexOfModelInBuildingList;
        if (this.g == null || this.i) {
            EpoxyController epoxyController = this.h;
            if (epoxyController != null) {
                epoxyController.setStagedModel(this);
                return;
            }
            return;
        }
        EpoxyController epoxyController2 = this.g;
        if (!epoxyController2.isBuildingModels()) {
            EpoxyControllerAdapter adapter = epoxyController2.getAdapter();
            int size = adapter.m.f.size();
            firstIndexOfModelInBuildingList = 0;
            while (true) {
                if (firstIndexOfModelInBuildingList >= size) {
                    firstIndexOfModelInBuildingList = -1;
                    break;
                } else if (((EpoxyModel) adapter.m.f.get(firstIndexOfModelInBuildingList)).d == this.d) {
                    break;
                } else {
                    firstIndexOfModelInBuildingList++;
                }
            }
        } else {
            firstIndexOfModelInBuildingList = epoxyController2.getFirstIndexOfModelInBuildingList(this);
        }
        throw new ImmutableModelException(this, "", firstIndexOfModelInBuildingList);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{id=");
        sb.append(this.d);
        sb.append(", viewType=");
        sb.append(n());
        sb.append(", shown=");
        return YU.a.k(", addedToAdapter=false}", sb, this.f);
    }

    public void u(Object obj) {
    }

    public void v(Object obj) {
    }

    public void w(float f, float f2, int i, int i2, Object obj) {
    }

    public void x(int i, Object obj) {
    }

    public boolean y() {
        return this instanceof ProductOffersCarouselModel_;
    }

    public final int z(int i, int i2, int i3) {
        SpanSizeOverrideCallback spanSizeOverrideCallback = this.l;
        return spanSizeOverrideCallback != null ? spanSizeOverrideCallback.a(i, i2, i3) : m(i, i2, i3);
    }
}
